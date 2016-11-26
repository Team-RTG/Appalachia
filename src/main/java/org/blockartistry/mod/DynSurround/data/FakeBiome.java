/* This file is part of Dynamic Surroundings Unofficial, licensed under the MIT License (MIT).
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

package org.blockartistry.mod.DynSurround.data;

import net.minecraft.world.biome.Biome;

/*
 * Fake biome to facilitate configuration of the underground
 * environment.  It's not registered with Minecraft or
 * Forge.
 */
public class FakeBiome extends Biome {
	
	public final int BIOME_ID;

	public FakeBiome(final int biomeId, final String biomeName) {
		super(new Biome.BiomeProperties(biomeName).setRainDisabled());
		BIOME_ID = biomeId;
		
		this.theBiomeDecorator = null;
		this.flowers = null;
		this.spawnableCaveCreatureList = null;
		this.spawnableCreatureList = null;
		this.spawnableMonsterList = null;
		this.spawnableWaterCreatureList = null;
		//this.worldGeneratorBigTree = null;
		//this.worldGeneratorSwamp = null;
		//this.worldGeneratorTrees = null;
	}
	
	@Override
	public boolean canRain() {
		return false;
	}
	
	@Override
	public boolean getEnableSnow() {
		return false;
	}

}
