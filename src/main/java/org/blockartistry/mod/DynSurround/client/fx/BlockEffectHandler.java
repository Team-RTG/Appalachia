/*
 * This file is part of Dynamic Surroundings Unofficial, licensed under the MIT License (MIT).
 *
 * Copyright (c) OreCruncher, Abastro
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

package org.blockartistry.mod.DynSurround.client.fx;

import java.util.List;
import java.util.Random;

import org.blockartistry.mod.DynSurround.ModOptions;
import org.blockartistry.mod.DynSurround.client.EnvironStateHandler.EnvironState;
import org.blockartistry.mod.DynSurround.client.IClientEffectHandler;
import org.blockartistry.mod.DynSurround.client.sound.SoundEffect;
import org.blockartistry.mod.DynSurround.compat.MCHelper;
import org.blockartistry.mod.DynSurround.data.BlockRegistry;
import org.blockartistry.mod.DynSurround.util.XorShiftRandom;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/*
 * Based on doVoidParticles().
 */
@SideOnly(Side.CLIENT)
public class BlockEffectHandler implements IClientEffectHandler {

	private static final Random random = new XorShiftRandom();
	private static final double RATIO = 0.0335671847202175D;

	@Override
	public void process(final World world, final EntityPlayer player) {
		if (Minecraft.getMinecraft().isGamePaused())
			return;

		final BlockPos playerPos = new BlockPos(player);
		final String conditions = EnvironState.getConditions();
		final int RANGE = ModOptions.specialEffectRange;
		final int CHECK_COUNT = (int) (Math.pow(RANGE * 2 - 1, 3) * RATIO);

		for (int i = 0; i < CHECK_COUNT; i++) {
			final BlockPos pos = playerPos.add(random.nextInt(RANGE) - random.nextInt(RANGE),
					random.nextInt(RANGE) - random.nextInt(RANGE), random.nextInt(RANGE) - random.nextInt(RANGE));
			final IBlockState state = world.getBlockState(pos);
			final Block block = MCHelper.getBlock(world, pos);
			if (!MCHelper.isAirBlock(state, world, pos)) {
				final List<BlockEffect> chain = BlockRegistry.getEffects(block);
				if (chain != null) {
					for (final BlockEffect effect : chain)
						if (effect.trigger(state, world, pos, random))
							effect.doEffect(state, world, pos, random);
				}

				final SoundEffect sound = BlockRegistry.getSound(block, random, conditions);
				if (sound != null)
					sound.doEffect(state, world, pos, SoundCategory.BLOCKS, random);
			}
		}

		if (EnvironState.isPlayerOnGround() && EnvironState.isPlayerMoving()) {
			final BlockPos pos = playerPos.down(1);
			final IBlockState state = world.getBlockState(pos);
			final Block block = MCHelper.getBlock(world, pos);
			if (!MCHelper.isAirBlock(state, world, pos) && !state.getMaterial().isLiquid()) {
				final SoundEffect sound = BlockRegistry.getStepSound(block, random, conditions);
				if (sound != null)
					sound.doEffect(state, world, pos, SoundCategory.BLOCKS, random);
			}
		}
	}

	@Override
	public boolean hasEvents() {
		return false;
	}
}
