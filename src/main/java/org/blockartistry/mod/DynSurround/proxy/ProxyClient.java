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

package org.blockartistry.mod.DynSurround.proxy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.blockartistry.mod.DynSurround.ModLog;
import org.blockartistry.mod.DynSurround.ModOptions;
import org.blockartistry.mod.DynSurround.client.ClientEffectHandler;
import org.blockartistry.mod.DynSurround.client.footsteps.game.system.ForgeDictionary;
import org.blockartistry.mod.DynSurround.client.footsteps.game.user.GenerateBlockReport;
import org.blockartistry.mod.DynSurround.client.fx.particle.ParticleRainOverride;
import org.blockartistry.mod.DynSurround.client.hud.GuiHUDHandler;
import org.blockartistry.mod.DynSurround.client.sound.SoundManager;
import org.blockartistry.mod.DynSurround.data.BlockRegistry;
import org.blockartistry.mod.DynSurround.data.SoundRegistry;

import net.minecraft.client.Minecraft;
import net.minecraft.client.audio.SoundHandler;
import net.minecraft.util.EnumParticleTypes;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class ProxyClient extends Proxy {

	@Override
	public void preInit(final FMLPreInitializationEvent event) {
		super.preInit(event);

		SoundManager.configureSound();
	}

	@Override
	public void init(final FMLInitializationEvent event) {
		super.init(event);
		
		// Don't know where it should be
		StormProperties.initialize();
		
		BlockRegistry.initialize();
		ClientEffectHandler.initialize();
		GuiHUDHandler.initialize();
		SoundRegistry.initialize();

		// Particle Overrides, don't know where it should be
		Minecraft.getMinecraft().effectRenderer.registerParticle(
				EnumParticleTypes.WATER_DROP.getParticleID(), new ParticleRainOverride.Factory());
	}
	
	@Override
	public void postInit(final FMLPostInitializationEvent event) {
		super.postInit(event);

		if (ModOptions.enableDebugLogging) {
			final SoundHandler handler = Minecraft.getMinecraft().getSoundHandler();
			final List<String> sounds = new ArrayList<String>();
			for (final Object resource : handler.soundRegistry.getKeys())
				sounds.add(resource.toString());
			Collections.sort(sounds);

			ModLog.info("*** SOUND REGISTRY ***");
			for (final String sound : sounds)
				ModLog.info(sound);
			
			ModLog.info("*** REGISTERED BLOCK NAMES ***");
			final GenerateBlockReport report = new GenerateBlockReport();
			for (final String entry : report.getBlockNames()) {
				ModLog.info(entry);
			}
			
			ForgeDictionary.dumpOreNames();
		}
	}

}
