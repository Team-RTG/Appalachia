/*
 * This file is part of Dynamic Surroundings Unofficial, licensed under the MIT License (MIT).
 *
 * Copyright (c) Abastro
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

public class WorldProviderShimBase extends WorldProvider {

	protected final WorldProvider provider;

	public WorldProviderShimBase(final World world, final WorldProvider provider) {
		this.provider = provider;
		this.worldObj = world;
	}

	@Override
	public IChunkGenerator createChunkGenerator()
	{
		return provider.createChunkGenerator();
	}

	/**
	 * Will check if the x, z position specified is alright to be set as the map spawn point
	 */
	@Override
	public boolean canCoordinateBeSpawn(int x, int z)
	{
		return provider.canCoordinateBeSpawn(x, z);
	}

	/**
	 * Calculates the angle of sun and moon in the sky relative to a specified time (usually worldTime)
	 */
	@Override
	public float calculateCelestialAngle(long worldTime, float partialTicks)
	{
		return provider.calculateCelestialAngle(worldTime, partialTicks);
	}

	@Override
	public int getMoonPhase(long worldTime)
	{
		return provider.getMoonPhase(worldTime);
	}

	/**
	 * Returns 'true' if in the "main surface world", but 'false' if in the Nether or End dimensions.
	 */
	@Override
	public boolean isSurfaceWorld()
	{
		return provider.isSurfaceWorld();
	}

	/**
	 * Returns array with sunrise/sunset colors
	 */
	@Nullable
	@SideOnly(Side.CLIENT)
	@Override
	public float[] calcSunriseSunsetColors(float celestialAngle, float partialTicks)
	{
		return provider.calcSunriseSunsetColors(celestialAngle, partialTicks);
	}

	/**
	 * Return Vec3D with biome specific fog color
	 */
	@Override
	@SideOnly(Side.CLIENT)
	public Vec3d getFogColor(float p_76562_1_, float p_76562_2_)
	{
		return provider.getFogColor(p_76562_1_, p_76562_2_);
	}

	/**
	 * True if the player can respawn in this dimension (true = overworld, false = nether).
	 */
	@Override
	public boolean canRespawnHere()
	{
		return provider.canRespawnHere();
	}

	/**
	 * the y level at which clouds are rendered.
	 */
	@SideOnly(Side.CLIENT)
	@Override
	public float getCloudHeight()
	{
		return provider.getCloudHeight();
	}

	@SideOnly(Side.CLIENT)
	@Override
	public boolean isSkyColored()
	{
		return provider.isSkyColored();
	}

	@Override
	public BlockPos getSpawnCoordinate()
	{
		return provider.getSpawnCoordinate();
	}

	@Override
	public int getAverageGroundLevel()
	{
		return provider.getAverageGroundLevel();
	}

	/**
	 * Returns a double value representing the Y value relative to the top of the map at which void fog is at its
	 * maximum. The default factor of 0.03125 relative to 256, for example, means the void fog will be at its maximum at
	 * (256*0.03125), or 8.
	 */
	@SideOnly(Side.CLIENT)
	@Override
	public double getVoidFogYFactor()
	{
		return provider.getVoidFogYFactor();
	}

	/**
	 * Returns true if the given X,Z coordinate should show environmental fog.
	 */
	@SideOnly(Side.CLIENT)
	@Override
	public boolean doesXZShowFog(int x, int z)
	{
		return provider.doesXZShowFog(x, z);
	}

	@Override
	public BiomeProvider getBiomeProvider()
	{
		return provider.getBiomeProvider();
	}

	@Override
	public boolean doesWaterVaporize()
	{
		return provider.doesWaterVaporize();
	}

	@Override
	public boolean getHasNoSky()
	{
		return provider.getHasNoSky();
	}

	@Override
	public float[] getLightBrightnessTable()
	{
		return provider.getLightBrightnessTable();
	}

	@Override
	public WorldBorder createWorldBorder()
	{
		return provider.createWorldBorder();
	}

	/*======================================= Forge Start =========================================*/

	/**
	 * Sets the providers current dimension ID, used in default getSaveFolder()
	 * Added to allow default providers to be registered for multiple dimensions.
	 * This is to denote the exact dimension ID opposed to the 'type' in WorldType
	 *
	 * @param dim Dimension ID
	 */
	@Override
	public void setDimension(int dim)
	{
		provider.setDimension(dim);
	}
	@Override
	public int getDimension()
	{
		return provider.getDimension();
	}

	/**
	 * Returns the sub-folder of the world folder that this WorldProvider saves to.
	 * EXA: DIM1, DIM-1
	 * @return The sub-folder name to save this world's chunks to.
	 */
	@Override
	public String getSaveFolder()
	{
		return provider.getSaveFolder();
	}

	/**
	 * A message to display to the user when they transfer to this dimension.
	 *
	 * @return The message to be displayed
	 */
	@Override
	public String getWelcomeMessage()
	{
		return provider.getWelcomeMessage();
	}

	/**
	 * A Message to display to the user when they transfer out of this dismension.
	 *
	 * @return The message to be displayed
	 */
	@Override
	public String getDepartMessage()
	{
		return provider.getDepartMessage();
	}

	/**
	 * The dimensions movement factor. Relative to normal overworld.
	 * It is applied to the players position when they transfer dimensions.
	 * Exa: Nether movement is 8.0
	 * @return The movement factor
	 */
	@Override
	public double getMovementFactor()
	{
		return provider.getMovementFactor();
	}

	@SideOnly(Side.CLIENT)
	@Override
	public net.minecraftforge.client.IRenderHandler getSkyRenderer()
	{
		return provider.getSkyRenderer();
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void setSkyRenderer(net.minecraftforge.client.IRenderHandler skyRenderer)
	{
		provider.setSkyRenderer(skyRenderer);
	}

	@SideOnly(Side.CLIENT)
	@Override
	public net.minecraftforge.client.IRenderHandler getCloudRenderer()
	{
		return provider.getCloudRenderer();
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void setCloudRenderer(net.minecraftforge.client.IRenderHandler renderer)
	{
		provider.setCloudRenderer(renderer);
	}

	@SideOnly(Side.CLIENT)
	@Override
	public net.minecraftforge.client.IRenderHandler getWeatherRenderer()
	{
		return provider.getWeatherRenderer();
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void setWeatherRenderer(net.minecraftforge.client.IRenderHandler renderer)
	{
		provider.setWeatherRenderer(renderer);
	}

	@Override
	public BlockPos getRandomizedSpawnPoint()
	{
		return provider.getRandomizedSpawnPoint();
	}
	/**
	 * Determine if the cursor on the map should 'spin' when rendered, like it does for the player in the nether.
	 *
	 * @param entity The entity holding the map, playername, or frame-ENTITYID
	 * @param x X Position
	 * @param y Y Position
	 * @param z Z Position
	 * @return True to 'spin' the cursor
	 */
	@Override
	public boolean shouldMapSpin(String entity, double x, double y, double z)
	{
		return provider.shouldMapSpin(entity, x, y, z);
	}

	/**
	 * Determines the dimension the player will be respawned in, typically this brings them back to the overworld.
	 *
	 * @param player The player that is respawning
	 * @return The dimension to respawn the player in
	 */
	@Override
	public int getRespawnDimension(net.minecraft.entity.player.EntityPlayerMP player)
	{
		return provider.getRespawnDimension(player);
	}

	/*======================================= Start Moved From World =========================================*/

	@Override
	public Biome getBiomeForCoords(BlockPos pos)
	{
		return provider.getBiomeForCoords(pos);
	}

	@Override
	public boolean isDaytime()
	{
		return provider.isDaytime();
	}

	/**
	 * The current sun brightness factor for this dimension.
	 * 0.0f means no light at all, and 1.0f means maximum sunlight.
	 * This will be used for the "calculateSkylightSubtracted"
	 * which is for Sky light value calculation.
	 *
	 * @return The current brightness factor
	 * */
	@Override
	public float getSunBrightnessFactor(float par1)
	{
		return provider.getSunBrightnessFactor(par1);
	}

	/**
	 * Calculates the current moon phase factor.
	 * This factor is effective for slimes.
	 * (This method do not affect the moon rendering)
	 * */
	@Override
	public float getCurrentMoonPhaseFactor()
	{
		return provider.getCurrentMoonPhaseFactor();
	}

	@SideOnly(Side.CLIENT)
	@Override
	public Vec3d getSkyColor(net.minecraft.entity.Entity cameraEntity, float partialTicks)
	{
		return provider.getSkyColor(cameraEntity, partialTicks);
	}
	
	@SideOnly(Side.CLIENT)
	@Override
	public Vec3d getCloudColor(float partialTicks) {
		return provider.getCloudColor(partialTicks);
	}

	/**
	 * Gets the Sun Brightness for rendering sky.
	 * */
	@SideOnly(Side.CLIENT)
	@Override
	public float getSunBrightness(float par1)
	{
		return provider.getSunBrightness(par1);
	}

	/**
	 * Gets the Star Brightness for rendering sky.
	 * */
	@SideOnly(Side.CLIENT)
	@Override
	public float getStarBrightness(float par1)
	{
		return provider.getStarBrightness(par1);
	}

	@Override
	public void setAllowedSpawnTypes(boolean allowHostile, boolean allowPeaceful)
	{
		provider.setAllowedSpawnTypes(allowHostile, allowPeaceful);
	}

	@Override
	public void calculateInitialWeather()
	{
		provider.calculateInitialWeather();
	}

	@Override
	public void updateWeather()
	{
		provider.updateWeather();
	}

	@Override
	public boolean canBlockFreeze(BlockPos pos, boolean byWater)
	{
		return provider.canBlockFreeze(pos, byWater);
	}

	@Override
	public boolean canSnowAt(BlockPos pos, boolean checkLight)
	{
		return provider.canSnowAt(pos, checkLight);
	}
	@Override
	public void setWorldTime(long time)
	{
		provider.setWorldTime(time);
	}

	@Override
	public long getSeed()
	{
		return provider.getSeed();
	}

	@Override
	public long getWorldTime()
	{
		return provider.getWorldTime();
	}

	@Override
	public BlockPos getSpawnPoint()
	{
		return provider.getSpawnPoint();
	}

	@Override
	public void setSpawnPoint(BlockPos pos)
	{
		provider.setSpawnPoint(pos);
	}

	@Override
	public boolean canMineBlock(net.minecraft.entity.player.EntityPlayer player, BlockPos pos)
	{
		return provider.canMineBlock(player, pos);
	}

	@Override
	public boolean isBlockHighHumidity(BlockPos pos)
	{
		return provider.isBlockHighHumidity(pos);
	}

	@Override
	public int getHeight()
	{
		return provider.getHeight();
	}

	@Override
	public int getActualHeight()
	{
		return provider.getActualHeight();
	}

	@Override
	public double getHorizon()
	{
		return provider.getHorizon();
	}

	@Override
	public void resetRainAndThunder()
	{
		provider.resetRainAndThunder();
	}

	@Override
	public boolean canDoLightning(net.minecraft.world.chunk.Chunk chunk)
	{
		return provider.canDoLightning(chunk);
	}

	@Override
	public boolean canDoRainSnowIce(net.minecraft.world.chunk.Chunk chunk)
	{
		return provider.canDoRainSnowIce(chunk);
	}

	/**
	 * Called when a Player is added to the provider's world.
	 */
	@Override
	public void onPlayerAdded(EntityPlayerMP player)
	{
		provider.onPlayerAdded(player);
	}

	/**
	 * Called when a Player is removed from the provider's world.
	 */
	@Override
	public void onPlayerRemoved(EntityPlayerMP player)
	{
		provider.onPlayerRemoved(player);
	}

	@Override
	public DimensionType getDimensionType() {
		return provider.getDimensionType();
	}

	/**
	 * Called when the world is performing a save. Only used to save the state of the Dragon Boss fight in
	 * WorldProviderEnd in Vanilla.
	 */
	public void onWorldSave()
	{
		provider.onWorldSave();
	}

	/**
	 * Called when the world is updating entities. Only used in WorldProviderEnd to update the DragonFightManager in
	 * Vanilla.
	 */
	public void onWorldUpdateEntities()
	{
		provider.onWorldUpdateEntities();
	}

	/**
	 * Called to determine if the chunk at the given chunk coordinates within the provider's world can be dropped. Used
	 * in WorldProviderSurface to prevent spawn chunks from being unloaded.
	 */
	public boolean canDropChunk(int x, int z)
	{
		return provider.canDropChunk(x, z);
	}
}
