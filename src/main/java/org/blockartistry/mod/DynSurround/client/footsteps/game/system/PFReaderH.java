/*
 * This file is part of Dynamic Surroundings, licensed under the MIT License (MIT).
 *
 * Copyright (c) OreCruncher
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

package org.blockartistry.mod.DynSurround.client.footsteps.game.system;

import org.blockartistry.mod.DynSurround.client.footsteps.engine.interfaces.EventType;
import org.blockartistry.mod.DynSurround.client.footsteps.mcpackage.implem.NormalVariator;
import org.blockartistry.mod.DynSurround.client.footsteps.mcpackage.interfaces.IGenerator;
import org.blockartistry.mod.DynSurround.client.footsteps.mcpackage.interfaces.IIsolator;
import org.blockartistry.mod.DynSurround.client.footsteps.mcpackage.interfaces.IVariator;
import org.blockartistry.mod.DynSurround.client.footsteps.mcpackage.interfaces.IVariatorSettable;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class PFReaderH implements IGenerator, IVariatorSettable {
	// Construct
	final protected IIsolator mod;

	protected NormalVariator VAR;

	// Footsteps
	protected float dmwBase;
	protected float dwmYChange;
	protected double yPosition;

	// Airborne
	protected boolean isFlying;
	protected float fallDistance;

	protected float lastReference;
	protected boolean isImmobile;
	protected long timeImmobile;

	protected boolean isRightFoot;

	protected double xMovec;
	protected double zMovec;
	protected boolean scalStat;
	private boolean stepThisFrame;

	private boolean isMessyFoliage;
	private long brushesTime;

	public PFReaderH(final IIsolator isolator) {
		mod = isolator;
		VAR = new NormalVariator();
	}

	@Override
	public void setVariator(final IVariator variator) {
		if (variator instanceof NormalVariator) {
			VAR = (NormalVariator) variator;
		}
	}

	@Override
	public void generateFootsteps(final EntityPlayer ply) {
		simulateFootsteps(ply);
		simulateAirborne(ply);
		simulateBrushes(ply);
	}

	protected boolean stoppedImmobile(float reference) {
		final float diff = lastReference - reference;
		lastReference = reference;
		if (!isImmobile && diff == 0f) {
			timeImmobile = System.currentTimeMillis();
			isImmobile = true;
		} else if (isImmobile && diff != 0f) {
			isImmobile = false;
			return System.currentTimeMillis() - timeImmobile > VAR.IMMOBILE_DURATION;
		}

		return false;
	}

	protected void simulateFootsteps(final EntityPlayer ply) {
		final float distanceReference = ply.distanceWalkedOnStepModified;

		stepThisFrame = false;

		if (dmwBase > distanceReference) {
			dmwBase = 0;
			dwmYChange = 0;
		}

		double movX = ply.motionX;
		double movZ = ply.motionZ;

		double scal = movX * xMovec + movZ * zMovec;
		if (scalStat != scal < 0.001f) {
			scalStat = !scalStat;

			if (scalStat && VAR.PLAY_WANDER && !mod.getSolver().hasSpecialStoppingConditions(ply)) {
				mod.getSolver().playAssociation(ply, mod.getSolver().findAssociationForPlayer(ply, 0d, isRightFoot),
						EventType.WANDER);
			}
		}
		xMovec = movX;
		zMovec = movZ;

		if (ply.onGround || ply.isInWater() || ply.isOnLadder()) {
			EventType event = null;

			float dwm = distanceReference - dmwBase;
			boolean immobile = stoppedImmobile(distanceReference);
			if (immobile && !ply.isOnLadder()) {
				dwm = 0;
				dmwBase = distanceReference;
			}

			float distance = 0f;
			double verticalOffsetAsMinus = 0f;

			if (ply.isOnLadder() && !ply.onGround) {
				distance = VAR.DISTANCE_LADDER;
			} else if (!ply.isInWater() && Math.abs(this.yPosition - ply.posY) > 0.4d // &&
																						// Math.abs(this.yPosition
																						// -
																						// ply.posY)
																						// <
																						// 0.7d)
			) {
				// This ensures this does not get recorded as landing, but as a
				// step
				if (yPosition < ply.posY) { // Going upstairs
					distance = VAR.DISTANCE_STAIR;
					event = speedDisambiguator(ply, EventType.UP, EventType.UP_RUN);
				} else if (!ply.isSneaking()) { // Going downstairs
					distance = -1f;
					verticalOffsetAsMinus = 0f;
					event = speedDisambiguator(ply, EventType.DOWN, EventType.DOWN_RUN);
				}

				dwmYChange = distanceReference;

			} else {
				distance = VAR.DISTANCE_HUMAN;
			}

			if (event == null) {
				event = speedDisambiguator(ply, EventType.WALK, EventType.RUN);
			}
			distance = reevaluateDistance(event, distance);

			if (dwm > distance) {
				produceStep(ply, event, verticalOffsetAsMinus);
				stepped(ply, event);
				dmwBase = distanceReference;
			}
		}

		if (ply.onGround) { // This fixes an issue where the value is evaluated
							// while the player is between two steps in the air
							// while descending stairs
			yPosition = ply.posY;
		}
	}

	protected void produceStep(final EntityPlayer ply, final EventType event) {
		produceStep(ply, event, 0d);
	}

	protected void produceStep(final EntityPlayer ply, EventType event, final double verticalOffsetAsMinus) {
		if (!mod.getSolver().playSpecialStoppingConditions(ply)) {
			if (event == null)
				event = speedDisambiguator(ply, EventType.WALK, EventType.RUN);
			mod.getSolver().playAssociation(ply,
					mod.getSolver().findAssociationForPlayer(ply, verticalOffsetAsMinus, isRightFoot), event);
			isRightFoot = !isRightFoot;
		}

		stepThisFrame = true;
	}

	protected void stepped(final EntityPlayer ply, final EventType event) {
	}

	protected float reevaluateDistance(final EventType event, final float distance) {
		return distance;
	}

	protected void simulateAirborne(final EntityPlayer ply) {
		if ((ply.onGround || ply.isOnLadder()) == isFlying) {
			isFlying = !isFlying;
			simulateJumpingLanding(ply);
		}

		if (isFlying)
			fallDistance = ply.fallDistance;
	}

	protected void simulateJumpingLanding(final EntityPlayer ply) {
		if (mod.getSolver().hasSpecialStoppingConditions(ply))
			return;

		final boolean isJumping = ply.isJumping;

		if (isFlying && isJumping) { // ply.isJumping)
			if (VAR.EVENT_ON_JUMP) {
				double speed = ply.motionX * ply.motionX + ply.motionZ * ply.motionZ;

				if (speed < VAR.SPEED_TO_JUMP_AS_MULTIFOOT) { // STILL JUMP
					playMultifoot(ply, 0.4d, EventType.JUMP); // 2 -
																// 0.7531999805212d
																// (magic number
																// for vertical
																// offset?)
				} else {
					playSinglefoot(ply, 0.4d, EventType.JUMP, isRightFoot); // RUNNING
																			// JUMP
					// Do not toggle foot: After landing sounds, the first foot
					// will be same as the one used to jump.
				}
			}
		} else if (!isFlying) {
			if (fallDistance > VAR.LAND_HARD_DISTANCE_MIN) {
				playMultifoot(ply, 0d, EventType.LAND); // Always assume the
														// player lands on their
														// two feet
				// Do not toggle foot: After landing sounds, the first foot will
				// be same as the one used to jump.
			} else if (!this.stepThisFrame && !ply.isSneaking()) {
				playSinglefoot(ply, 0d, speedDisambiguator(ply, EventType.CLIMB, EventType.CLIMB_RUN), isRightFoot);
				isRightFoot = !isRightFoot;
			}

		}
	}

	protected EventType speedDisambiguator(final EntityPlayer ply, final EventType walk, final EventType run) {
		double velocity = ply.motionX * ply.motionX + ply.motionZ * ply.motionZ;
		return velocity > VAR.SPEED_TO_RUN ? run : walk;
	}

	private void simulateBrushes(final EntityPlayer ply) {
		if (brushesTime > System.currentTimeMillis())
			return;

		brushesTime = System.currentTimeMillis() + 100;

		if ((ply.motionX == 0d && ply.motionZ == 0d) || ply.isSneaking())
			return;

		final int yy = MathHelper.floor_double(ply.posY - 0.1d - ply.getYOffset() - (ply.onGround ? 0d : 0.25d));
		final Association assos = mod.getSolver().findAssociationForBlock(
				new BlockPos(MathHelper.floor_double(ply.posX), yy, MathHelper.floor_double(ply.posZ)), "find_messy_foliage");
		if (assos != null) {
			if (!this.isMessyFoliage) {
				this.isMessyFoliage = true;
				this.mod.getSolver().playAssociation(ply, assos, EventType.WALK);
			}
		} else {
			if (this.isMessyFoliage) {
				this.isMessyFoliage = false;
			}
		}
	}

	protected void playSinglefoot(final EntityPlayer ply, final double verticalOffsetAsMinus, final EventType eventType,
			final boolean foot) {
		final Association assos = mod.getSolver().findAssociationForPlayer(ply, verticalOffsetAsMinus, isRightFoot);
		mod.getSolver().playAssociation(ply, assos, eventType);
	}

	protected void playMultifoot(final EntityPlayer ply, final double verticalOffsetAsMinus,
			final EventType eventType) {
		// STILL JUMP
		final Association leftFoot = mod.getSolver().findAssociationForPlayer(ply, verticalOffsetAsMinus, false);
		Association rightFoot = mod.getSolver().findAssociationForPlayer(ply, verticalOffsetAsMinus, true);

		if (leftFoot != null && leftFoot.equals(rightFoot) && !leftFoot.getNoAssociation()) {
			rightFoot = null; // If the two feet solve to the same sound, except
								// NO_ASSOCIATION, only play the sound once
		}

		mod.getSolver().playAssociation(ply, leftFoot, eventType);
		mod.getSolver().playAssociation(ply, rightFoot, eventType);
	}

	protected float scalex(final float number, final float min, final float max) {
		return MathHelper.clamp_float((number - min) / (max - min), 0.0F, 1.0F);
	}
}