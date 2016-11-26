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

package org.blockartistry.mod.DynSurround.compat;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.registry.FMLControlledNamespacedRegistry;
import net.minecraftforge.fml.common.registry.GameData;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class MCHelper {

	public static String nameOf(final Block block) {
		return Block.REGISTRY.getNameForObject(block).toString();
	}

	public static Block getBlockNameRaw(final String blockName) {
		final FMLControlledNamespacedRegistry<Block> registry = GameData.getBlockRegistry();
		final ResourceLocation res = new ResourceLocation(blockName);
		if (registry.containsKey(res))
			return registry.getObject(res);
		return null;
	}

	public static Block getBlock(final World world, final BlockPos pos) {
		return world.getBlockState(pos).getBlock();
	}

	public static int getBlockMetadata(final World world, final BlockPos pos) {
		final IBlockState state = world.getBlockState(pos);
		return state.getBlock().getMetaFromState(state);
	}

	public static boolean isAirBlock(final World world, final BlockPos pos) {
		return world.isAirBlock(pos);
	}
	
	public static boolean isAirBlock(final IBlockState state, final World world, final BlockPos pos) {
		return state.getBlock().isAir(state, world, pos);
	}
	
	public static boolean isLeafBlock(final World world, final BlockPos pos) {
		IBlockState state = world.getBlockState(pos);
		return state.getBlock().isLeaves(state, world, pos);
	}

}
