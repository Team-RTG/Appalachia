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

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.blockartistry.mod.DynSurround.ModLog;
import org.blockartistry.mod.DynSurround.Module;

import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.IResourcePack;
import net.minecraft.client.resources.ResourcePackRepository;
import net.minecraft.client.resources.data.IMetadataSection;
import net.minecraft.client.resources.data.MetadataSerializer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.ModContainer;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class PFResourcePackDealer {

	// Used for existing packs that have been configured for Presence Footsteps
	private final ResourceLocation pf_pack = new ResourceLocation("footsteps", "pf_pack.json");
	private final ResourceLocation acoustics = new ResourceLocation("footsteps", "acoustics.json");
	private final ResourceLocation blockmap = new ResourceLocation("footsteps", "blockmap.json");
	private final ResourceLocation primitivemap = new ResourceLocation("footsteps", "primitivemap.json");
	private final ResourceLocation variator = new ResourceLocation("footsteps", "variator.json");

	// Resource pack reference for the built in pack.
	private static class DefaultPack implements IResourcePack {

		private final String mod;

		public DefaultPack() {
			this.mod = null;
		}

		public DefaultPack(final String mod) {
			this.mod = mod;
		}

		@Override
		public InputStream getInputStream(final ResourceLocation loc) throws IOException {
			final StringBuilder builder = new StringBuilder();
			builder.append("/assets/dsurround/data/");
			builder.append(loc.getResourceDomain());
			builder.append('/');
			if (this.mod != null)
				builder.append(this.mod).append('_');
			builder.append(loc.getResourcePath());
			return Module.class.getResourceAsStream(builder.toString());
		}

		@Override
		public boolean resourceExists(final ResourceLocation loc) {
			return true;
		}

		@SuppressWarnings({ "rawtypes", "unchecked" })
		@Override
		public Set getResourceDomains() {
			return null;
		}

		@SuppressWarnings("unchecked")
		@Override
		public IMetadataSection getPackMetadata(final MetadataSerializer loc, final String data) throws IOException {
			return null;
		}

		@Override
		public BufferedImage getPackImage() throws IOException {
			return null;
		}

		@Override
		public String getPackName() {
			if (this.mod == null)
				return "DEFAULT";
			return "DEFAULT: " + this.mod;
		}

	}

	public List<IResourcePack> findResourcePacks() {
		final List<ResourcePackRepository.Entry> repo = Minecraft.getMinecraft().getResourcePackRepository()
				.getRepositoryEntries();

		final List<IResourcePack> foundEntries = new ArrayList<IResourcePack>();
		foundEntries.add(new DefaultPack());

		// Tack on loaded mods
		// Check for each of the loaded mods to see if there is
		// a config file embedded.
		for (final ModContainer mod : Loader.instance().getActiveModList())
			foundEntries.add(new DefaultPack(mod.getModId()));

		for (final ResourcePackRepository.Entry pack : repo) {
			ModLog.debug("Resource Pack: %s", pack.getResourcePackName());
			if (checkCompatible(pack)) {
				ModLog.debug("Found Footsteps resource pack: %s", pack.getResourcePackName());
				foundEntries.add(pack.getResourcePack());
			}
		}
		return foundEntries;
	}

	private boolean checkCompatible(final ResourcePackRepository.Entry pack) {
		return pack.getResourcePack().resourceExists(this.pf_pack);
	}

	public InputStream openPackDescriptor(final IResourcePack pack) throws IOException {
		return pack.getInputStream(this.pf_pack);
	}

	public InputStream openAcoustics(final IResourcePack pack) throws IOException {
		return pack.getInputStream(this.acoustics);
	}

	public InputStream openBlockMap(final IResourcePack pack) throws IOException {
		return pack.getInputStream(this.blockmap);
	}

	public InputStream openPrimitiveMap(final IResourcePack pack) throws IOException {
		return pack.getInputStream(this.primitivemap);
	}

	public InputStream openVariator(final IResourcePack pack) throws IOException {
		return pack.getInputStream(this.variator);
	}
}
