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

package org.blockartistry.mod.DynSurround.data.config;

import java.io.File;
import java.util.List;

import org.blockartistry.mod.DynSurround.util.JsonUtils;

import com.google.common.collect.ImmutableList;
import com.google.gson.annotations.SerializedName;

public final class BlockConfig {

	public static class Effect {
		@SerializedName("effect")
		public String effect = null;
		@SerializedName("chance")
		public Integer chance = null;
	}

	public static class Entry {
		@SerializedName("blocks")
		public List<String> blocks = ImmutableList.of();
		@SerializedName("soundReset")
		public Boolean soundReset = null;
		@SerializedName("effectReset")
		public Boolean effectReset = null;
		@SerializedName("stepSoundReset")
		public Boolean stepSoundReset = null;
		@SerializedName("chance")
		public Integer chance = null;
		@SerializedName("stepChance")
		public Integer stepChance = null;
		@SerializedName("sounds")
		public List<SoundConfig> sounds = ImmutableList.of();
		@SerializedName("effects")
		public List<Effect> effects = ImmutableList.of();
	}

	public List<Entry> entries = ImmutableList.of();

	public static BlockConfig load(final File file) throws Exception {
		return JsonUtils.load(file, BlockConfig.class);
	}

	public static BlockConfig load(final String modId) throws Exception {
		return JsonUtils.load(modId, BlockConfig.class);
	}
}
