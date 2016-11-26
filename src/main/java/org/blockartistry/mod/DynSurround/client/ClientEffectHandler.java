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

package org.blockartistry.mod.DynSurround.client;

import java.util.ArrayList;
import java.util.List;

import org.blockartistry.mod.DynSurround.ModOptions;
import org.blockartistry.mod.DynSurround.client.footsteps.Footsteps;
import org.blockartistry.mod.DynSurround.client.fx.BlockEffectHandler;
import org.blockartistry.mod.DynSurround.data.DimensionRegistry;
import org.blockartistry.mod.DynSurround.util.WorldUtils;
import org.blockartistry.mod.DynSurround.world.WorldProviderCloudColorHandle;

import net.minecraft.client.Minecraft;
import net.minecraft.client.multiplayer.WorldClient;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import net.minecraftforge.client.IRenderHandler;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.world.WorldEvent;
import net.minecraftforge.fml.client.FMLClientHandler;
import net.minecraftforge.fml.common.eventhandler.EventPriority;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent.Phase;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class ClientEffectHandler {

	private static final List<IClientEffectHandler> effectHandlers = new ArrayList<IClientEffectHandler>();

	public static void register(final IClientEffectHandler handler) {
		effectHandlers.add(handler);
		if (handler.hasEvents()) {
			MinecraftForge.EVENT_BUS.register(handler);
		}
	}

	private ClientEffectHandler() {
	}

	public static void initialize() {
		final ClientEffectHandler handler = new ClientEffectHandler();
		MinecraftForge.EVENT_BUS.register(handler);

		register(new EnvironStateHandler());
		register(new BiomeSurveyHandler());
		register(new FogEffectHandler());
		register(new BlockEffectHandler());

		if (ModOptions.blockedSounds.length > 0 || ModOptions.culledSounds.length > 0)
			register(new SoundControlHandler());

		if (ModOptions.enableFootstepSounds)
			register(new Footsteps());

		if (ModOptions.auroraEnable)
			register(new AuroraEffectHandler());

		if (ModOptions.enableBiomeSounds)
			register(new PlayerSoundEffectHandler());

		if (ModOptions.suppressPotionParticles)
			register(new PotionParticleScrubHandler());
	}

	@SubscribeEvent
	public void clientTick(final TickEvent.ClientTickEvent event) {
		if (Minecraft.getMinecraft().isGamePaused())
			return;

		final World world = FMLClientHandler.instance().getClient().theWorld;
		if (world == null)
			return;

		if (event.phase == Phase.START) {
			final EntityPlayer player = FMLClientHandler.instance().getClient().thePlayer;
			for (final IClientEffectHandler handler : effectHandlers)
				handler.process(world, player);
		}
	}
	
	@SubscribeEvent(priority = EventPriority.LOWEST)
	public void renderTick(final TickEvent.RenderTickEvent event) {
		WorldClient world = Minecraft.getMinecraft().theWorld;
		if(event.phase == Phase.START && world != null) {
			IRenderHandler weatherRenderer = world.provider.getWeatherRenderer();
			if(!(weatherRenderer instanceof RenderWeather))
				world.provider.setWeatherRenderer(RenderWeather.setParent(weatherRenderer));
		}
	}


	@SubscribeEvent(priority = EventPriority.LOWEST)
	public void onWorldLoad(final WorldEvent.Load e) {
		World world = e.getWorld();
		
		if (!world.isRemote)
			return;

		// Tickle the Dimension Registry so it has the
		// latest info.
		DimensionRegistry.loading(world);

		// Shim the provider so we can tap into the
		// sky and cloud stuff.
		if (ModOptions.enableFancyCloudHandling && WorldUtils.isDimensionHasSky(world.provider)) {
			world.provider = new WorldProviderCloudColorHandle(world, world.provider);
		}	
	}
}
