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

import org.blockartistry.mod.DynSurround.ModOptions;
import org.blockartistry.mod.DynSurround.client.EnvironStateHandler.EnvironState;
import org.blockartistry.mod.DynSurround.data.BiomeRegistry;
import org.blockartistry.mod.DynSurround.data.DimensionRegistry;
import org.blockartistry.mod.DynSurround.event.DiagnosticEvent;
import org.blockartistry.mod.DynSurround.util.Color;
import org.blockartistry.mod.DynSurround.util.PlayerUtils;
import org.lwjgl.opengl.GL11;

import gnu.trove.map.hash.TObjectIntHashMap;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.ActiveRenderInfo;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.client.event.EntityViewRenderEvent;
import net.minecraftforge.fml.common.eventhandler.Event.Result;
import net.minecraftforge.fml.common.eventhandler.EventPriority;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class FogEffectHandler implements IClientEffectHandler {

	private static final int HAZE_THRESHOLD = 15;

	// The delta indicates how much per tick the density will shift
	// toward the target.
	private static float currentFogLevel = 0.0F;
	private static float insideFogOffset = 0.0F;
	private static Color currentFogColor = null;

	public static float currentFogLevel() {
		return currentFogLevel;
	}

	public FogEffectHandler() {
	}

	@Override
	public boolean hasEvents() {
		return true;
	}

	private static float calcHazeBand(final World world, final EntityPlayer player) {
		final float distance = MathHelper
				.abs(DimensionRegistry.getCloudHeight(world) - (float) (player.posY + player.getEyeHeight()));
		final float hazeBandRange = HAZE_THRESHOLD * (1.0F + world.getRainStrength(1.0F) * 2);
		if (distance < hazeBandRange)
			return (hazeBandRange - distance) / 50.0F / hazeBandRange * ModOptions.elevationHazeFactor;

		return 0.0F;
	}

	private static float calcHazeGradient(final World world, final EntityPlayer player) {
		final float factor = 1.0F + world.getRainStrength(1.0F);
		final float skyHeight = DimensionRegistry.getSkyHeight(world) / factor;
		final float groundLevel = DimensionRegistry.getSeaLevel(world);
		final float ratio = (MathHelper.floor_double(player.posY + player.getEyeHeight()) - groundLevel)
				/ (skyHeight - groundLevel);
		return ratio * ratio * ratio * ratio * ModOptions.elevationHazeFactor;
	}

	@Override
	public void process(final World world, final EntityPlayer player) {

		currentFogColor = new Color(world.getFogColor(1.0F));

		float biomeFog = 0.0F;
		float dustFog = 0.0F;
		float heightFog = 0.0F;

		if (ModOptions.enableBiomeFog || ModOptions.allowDesertFog) {
			final float brightnessFactor = world.getSunBrightness(1.0F);
			final Color tint = new Color(0, 0, 0);
			final TObjectIntHashMap<Biome> weights = BiomeSurveyHandler.getBiomes();
			final int area = BiomeSurveyHandler.getArea();

			for (final Biome b : weights.keySet()) {
				final int weight = weights.get(b);
				final float scale = ((float) weight / (float) area);
				if (ModOptions.enableBiomeFog && BiomeRegistry.hasFog(b)) {
					biomeFog += BiomeRegistry.getFogDensity(b) * scale;
					tint.add(Color.scale(BiomeRegistry.getFogColor(b), brightnessFactor).scale(scale));
				} else if (ModOptions.allowDesertFog && BiomeRegistry.hasDust(b)) {
					final float strength = EnvironState.getWorld().getRainStrength(1.0F);
					dustFog += StormProperties.getFogDensity() * scale * strength;
					tint.add(Color.scale(BiomeRegistry.getDustColor(b), brightnessFactor).scale(scale));
				} else {
					tint.add(Color.scale(currentFogColor, scale));
				}
			}

			currentFogColor = tint;
		}

		biomeFog *= ModOptions.biomeFogFactor;
		dustFog *= ModOptions.desertFogFactor;

		if (ModOptions.enableElevationHaze && DimensionRegistry.hasHaze(world)) {
			heightFog = ModOptions.elevationHazeAsBand ? calcHazeBand(world, player) : calcHazeGradient(world, player);
		}

		// Get the max fog level between the three fog types
		currentFogLevel = Math.max(biomeFog, Math.max(dustFog, heightFog));
		insideFogOffset = PlayerUtils.ceilingCoverageRatio(player) * 15.0F;
	}

	/*
	 * Hook the fog color event so we can tell the renderer what color the fog
	 * should be.
	 */
	@SubscribeEvent(priority = EventPriority.HIGHEST)
	public void fogColorEvent(final EntityViewRenderEvent.FogColors event) {
		if (currentFogColor == null)
			return;

		if (currentFogLevel == 0)
			return;

		final IBlockState block = ActiveRenderInfo.getBlockStateAtEntityViewpoint(event.getEntity().worldObj, event.getEntity(),
				(float) event.getRenderPartialTicks());
		if (block.getMaterial() == Material.LAVA || block.getMaterial() == Material.WATER)
			return;

		event.setRed(currentFogColor.red);
		event.setGreen(currentFogColor.green);
		event.setBlue(currentFogColor.blue);
	}

	/*
	 * Hook the fog density event so that the fog settings can be reset based on
	 * rain intensity. This routine will overwrite what the vanilla code has
	 * done in terms of fog.
	 */
	@SubscribeEvent(priority = EventPriority.LOWEST)
	public void fogRenderEvent(final EntityViewRenderEvent.RenderFogEvent event) {
		if (event.getResult() != Result.DEFAULT || event.getFogMode() < 0)
			return;

		if (currentFogLevel <= 0)
			return;

		float level = currentFogLevel;
		final float factor = 1.0F + level * 100.0F;
		final float near = (event.getFarPlaneDistance() * 0.75F) / (factor * factor) + insideFogOffset;
		final float horizon = event.getFarPlaneDistance() / (factor) + insideFogOffset;

		float start = GL11.glGetFloat(GL11.GL_FOG_START);
		float end = GL11.glGetFloat(GL11.GL_FOG_END);

		boolean didFog = false;
		if (near < start) {
			GlStateManager.setFogStart(near);
			didFog = true;
		}
		if (horizon < end) {
			GlStateManager.setFogEnd(horizon);
			didFog = true;
		}

		if (didFog) {
			event.setResult(Result.ALLOW);
		}
	}

	@SubscribeEvent
	public void diagnostics(final DiagnosticEvent.Gather event) {
		final StringBuilder builder = new StringBuilder();
		builder.append("Fog:");
		builder.append(" c:").append(currentFogLevel);
		event.output.add(builder.toString());
	}

}
