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

package org.blockartistry.mod.DynSurround.client.fx.particle;

import org.blockartistry.mod.DynSurround.client.sound.SoundManager;
import org.blockartistry.mod.DynSurround.data.BiomeRegistry;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.particle.IParticleFactory;
import net.minecraft.client.particle.Particle;
import net.minecraft.client.particle.ParticleRain;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ParticleRainOverride extends ParticleRain {

	protected ParticleRainOverride(World worldIn, double xCoordIn, double yCoordIn, double zCoordIn) {
		super(worldIn, xCoordIn, yCoordIn, zCoordIn);
	}

	@Override
    public void setExpired() {
		super.setExpired();
		
		if (this.posY < 1)
			return;

		final int x = MathHelper.floor_double(this.posX);
		final int y = MathHelper.floor_double(this.posY + 0.3D);
		final int z = MathHelper.floor_double(this.posZ);
		BlockPos pos = new BlockPos(x, y, z);
		IBlockState state = worldObj.getBlockState(pos);
		Block block = state.getBlock();
		if (!block.isAir(state, this.worldObj, pos) && !block.isLeaves(state, this.worldObj, pos)) {
			// Find out where it is going to hit
			BlockPos soundPos = pos.down();
			while (soundPos.getY() > 0 && worldObj.isAirBlock(soundPos))
				soundPos = soundPos.down();

			if (soundPos.getY() > 0 && state.getMaterial().isSolid()) {
				final int distance = y - soundPos.getY();
				SoundManager.playSoundAt(soundPos.up(), BiomeRegistry.WATER_DRIP, 40 + distance * 2, SoundCategory.WEATHER);
			}
		}
	}


	public static class Factory implements IParticleFactory
	{
		public Particle getEntityFX(int particleID, World worldIn, double xCoordIn, double yCoordIn, double zCoordIn, double xSpeedIn, double ySpeedIn, double zSpeedIn, int... p_178902_15_)
		{
			return new ParticleRainOverride(worldIn, xCoordIn, yCoordIn, zCoordIn);
		}
	}

}
