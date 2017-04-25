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

package org.blockartistry.mod.DynSurround.world;

import javax.annotation.Nullable;

import org.blockartistry.mod.DynSurround.data.DimensionRegistry;
import org.blockartistry.mod.DynSurround.util.Color;

import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.DimensionType;
import net.minecraft.world.GameType;
import net.minecraft.world.World;
import net.minecraft.world.WorldProvider;
import net.minecraft.world.WorldProviderEnd;
import net.minecraft.world.WorldProviderHell;
import net.minecraft.world.WorldServer;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeProvider;
import net.minecraft.world.border.WorldBorder;
import net.minecraft.world.chunk.IChunkGenerator;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/*
 * The shim is used to hook cloud height and color
 * information for cloud rendering.  A lot of work
 * just to tap into Minecraft routines without ASM.
 */
@SideOnly(Side.CLIENT)
public class WorldProviderCloudColorHandle extends WorldProviderShimBase {

	public WorldProviderCloudColorHandle(final World world, final WorldProvider provider) {
		super(world, provider);
	}

	@Override
	@SideOnly(Side.CLIENT)
	public Vec3d getCloudColor(float partialTicks) {
		final Color color = new Color(this.provider.getCloudColor(partialTicks));
		final float stormIntensity = this.worldObj.getRainStrength(1.0F);
		if (stormIntensity > 0.0F) {
			// Need to darken the clouds based on intensity
			color.scale((1.0F - stormIntensity) * 0.5F + 0.5F);
		}
		return color.toVec3d();
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public float getCloudHeight() {
		return DimensionRegistry.getCloudHeight(this.worldObj);
}
}
