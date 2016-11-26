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

package org.blockartistry.mod.DynSurround;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map.Entry;

import org.apache.commons.lang3.StringUtils;
import org.blockartistry.mod.DynSurround.util.ConfigProcessor;
import org.blockartistry.mod.DynSurround.util.ConfigProcessor.Comment;
import org.blockartistry.mod.DynSurround.util.ConfigProcessor.Hidden;
import org.blockartistry.mod.DynSurround.util.ConfigProcessor.MinMaxFloat;
import org.blockartistry.mod.DynSurround.util.ConfigProcessor.MinMaxInt;
import org.blockartistry.mod.DynSurround.util.ConfigProcessor.Parameter;
import org.blockartistry.mod.DynSurround.util.ConfigProcessor.RestartRequired;

import com.google.common.collect.ImmutableList;

import net.minecraftforge.common.config.ConfigCategory;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.common.config.Property;

public final class ModOptions {

	private ModOptions() {
	}

	public static final String CATEGORY_LOGGING_CONTROL = "logging";
	public static final String CONFIG_ENABLE_DEBUG_LOGGING = "Enable Debug Logging";
	public static final String CONFIG_ENABLE_ONLINE_VERSION_CHECK = "Enable Online Version Check";
	private static final List<String> loggingSort = Arrays.asList(CONFIG_ENABLE_ONLINE_VERSION_CHECK,
			CONFIG_ENABLE_DEBUG_LOGGING);

	@Parameter(category = CATEGORY_LOGGING_CONTROL, property = CONFIG_ENABLE_DEBUG_LOGGING, defaultValue = "false")
	@Comment("Enables/disables debug logging of the mod")
	@RestartRequired
	public static boolean enableDebugLogging = false;

	public static final String CATEGORY_RAIN = "rain";
	public static final String CONFIG_RAIN_VOLUME = "Sound Level";
	public static final String CONFIG_RAIN_PARTICLE_BASE = "Particle Count Base";
	public static final String CONFIG_ALWAYS_OVERRIDE_SOUND = "Always Override Sound";
	public static final String CONFIG_ALLOW_DESERT_DUST = "Desert Dust";
	public static final String CONFIG_RESET_RAIN_ON_SLEEP = "Reset Rain on Sleep";
	private static final List<String> rainSort = Arrays.asList(CONFIG_RAIN_VOLUME, CONFIG_ALLOW_DESERT_DUST,
			CONFIG_RESET_RAIN_ON_SLEEP, CONFIG_ALWAYS_OVERRIDE_SOUND, CONFIG_RAIN_PARTICLE_BASE);

	@Parameter(category = CATEGORY_RAIN, property = CONFIG_RAIN_VOLUME, defaultValue = "1.0")
	@MinMaxFloat(min = 0.0F, max = 1.0F)
	@Comment("Factor to apply to rain sound level to adjust")
	public static float soundLevel = 1.0F;
	@Parameter(category = CATEGORY_RAIN, property = CONFIG_RAIN_PARTICLE_BASE, defaultValue = "100")
	@MinMaxInt(min = 0, max = 500)
	@Comment("Base count of rain splash particles to generate per tick")
	public static int particleCountBase = 100;
	@Parameter(category = CATEGORY_RAIN, property = CONFIG_ALWAYS_OVERRIDE_SOUND, defaultValue = "true")
	@Comment("Always override Vanilla rain sound even when dimension is blacklisted")
	public static boolean alwaysOverrideSound = true;
	@Parameter(category = CATEGORY_RAIN, property = CONFIG_RESET_RAIN_ON_SLEEP, defaultValue = "true")
	@Comment("Reset rain/thunder when all players sleep")
	public static boolean resetRainOnSleep = true;

	public static final String CATEGORY_FOG = "fog";
	public static final String CONFIG_ALLOW_DESERT_FOG = "Desert Fog";
	public static final String CONFIG_DESERT_FOG_FACTOR = "Desert Fog Factor";
	public static final String CONFIG_ENABLE_ELEVATION_HAZE = "Elevation Haze";
	public static final String CONFIG_ELEVATION_HAZE_FACTOR = "Elevation Haze Factor";
	public static final String CONFIG_ELEVATION_HAZE_AS_BAND = "Elevation Haze as Band";
	public static final String CONFIG_ENABLE_BIOME_FOG = "Biome Fog";
	public static final String CONFIG_BIOME_FOG_FACTOR = "Biome Fog Factor";
	private static final List<String> fogSort = Arrays.asList(CONFIG_ALLOW_DESERT_FOG, CONFIG_DESERT_FOG_FACTOR,
			CONFIG_ENABLE_BIOME_FOG, CONFIG_BIOME_FOG_FACTOR, CONFIG_ENABLE_ELEVATION_HAZE,
			CONFIG_ELEVATION_HAZE_FACTOR, CONFIG_ELEVATION_HAZE_AS_BAND);

	@Parameter(category = CATEGORY_FOG, property = CONFIG_ALLOW_DESERT_FOG, defaultValue = "true")
	@Comment("Allow desert fog when raining")
	public static boolean allowDesertFog = true;
	@Parameter(category = CATEGORY_FOG, property = CONFIG_DESERT_FOG_FACTOR, defaultValue = "1.0")
	@MinMaxFloat(min = 0.0F, max = 5.0F)
	@Comment("Visibility factor to apply to desert fog (higher is thicker)")
	public static float desertFogFactor = 1.0F;
	@Parameter(category = CATEGORY_FOG, property = CONFIG_ENABLE_ELEVATION_HAZE, defaultValue = "true")
	@Comment("Higher the player elevation the more haze that is experienced")
	public static boolean enableElevationHaze = true;
	@Parameter(category = CATEGORY_FOG, property = CONFIG_ELEVATION_HAZE_FACTOR, defaultValue = "1.0")
	@MinMaxFloat(min = 0.0F, max = 5.0F)
	@Comment("Visibility factor to apply to elevation haze (higher is thicker)")
	public static float elevationHazeFactor = 1.0F;
	@Parameter(category = CATEGORY_FOG, property = CONFIG_ELEVATION_HAZE_AS_BAND, defaultValue = "true")
	@Comment("Calculate haze as a band at cloud height rather than gradient to build height")
	public static boolean elevationHazeAsBand = true;
	@Parameter(category = CATEGORY_FOG, property = CONFIG_ENABLE_BIOME_FOG, defaultValue = "true")
	@Comment("Enable biome specific fog density and color")
	public static boolean enableBiomeFog = true;
	@Parameter(category = CATEGORY_FOG, property = CONFIG_BIOME_FOG_FACTOR, defaultValue = "1.0")
	@MinMaxFloat(min = 0.0F, max = 5.0F)
	@Comment("Visibility factor to apply to biome fog (higher is thicker)")
	public static float biomeFogFactor = 1.0F;

	public static final String CATEGORY_GENERAL = "general";
	public static final String CONFIG_MIN_RAIN_STRENGTH = "Default Minimum Rain Strength";
	public static final String CONFIG_MAX_RAIN_STRENGTH = "Default Maximum Rain Strength";
	public static final String CONFIG_FX_RANGE = "Special Effect Range";
	public static final String CONFIG_FANCY_CLOUD_HANDLING = "Fancy Cloud Handling";
	private static final List<String> generalSort = ImmutableList.<String> builder()
			.add(CONFIG_FANCY_CLOUD_HANDLING, CONFIG_FX_RANGE, CONFIG_MIN_RAIN_STRENGTH, CONFIG_MAX_RAIN_STRENGTH)
			.build();

	@Parameter(category = CATEGORY_GENERAL, property = CONFIG_MIN_RAIN_STRENGTH, defaultValue = "0.0")
	@MinMaxFloat(min = 0.0F, max = 1.0F)
	@Comment("Default minimum rain strength for a dimension")
	public static float defaultMinRainStrength = 0.0F;
	@Parameter(category = CATEGORY_GENERAL, property = CONFIG_MAX_RAIN_STRENGTH, defaultValue = "1.0")
	@MinMaxFloat(min = 0.0F, max = 1.0F)
	@Comment("Default maximum rain strength for a dimension")
	public static float defaultMaxRainStrength = 1.0F;
	@Parameter(category = CATEGORY_GENERAL, property = CONFIG_FX_RANGE, defaultValue = "16")
	@MinMaxInt(min = 16, max = 32)
	@Comment("Block radius/range around player for special effect application")
	public static int specialEffectRange = 16;
	@Parameter(category = CATEGORY_GENERAL, property = CONFIG_FANCY_CLOUD_HANDLING, defaultValue = "true")
	@Comment("Adjust cloud graphics based on configured cloud height")
	@RestartRequired
	public static boolean enableFancyCloudHandling = true;

	public static final String CATEGORY_AURORA = "aurora";
	public static final String CONFIG_AURORA_ENABLED = "Enabled";
	public static final String CONFIG_Y_PLAYER_RELATIVE = "Height Player Relative";
	public static final String CONFIG_PLAYER_FIXED_HEIGHT = "Player Fixed Height";
	public static final String CONFIG_MULTIPLE_BANDS = "Multiple Bands";
	public static final String CONFIG_AURORA_ANIMATE = "Animate";
	public static final String CONFIG_AURORA_SPAWN_OFFSET = "Spawn Offset";
	private static final List<String> auroraSort = Arrays.asList(CONFIG_AURORA_ENABLED, CONFIG_AURORA_ANIMATE,
			CONFIG_MULTIPLE_BANDS, CONFIG_Y_PLAYER_RELATIVE, CONFIG_PLAYER_FIXED_HEIGHT, CONFIG_AURORA_SPAWN_OFFSET);

	@Parameter(category = CATEGORY_AURORA, property = CONFIG_AURORA_ENABLED, defaultValue = "true")
	@Comment("Whether to enable Aurora processing on server/client")
	@RestartRequired
	public static boolean auroraEnable = true;
	@Parameter(category = CATEGORY_AURORA, property = CONFIG_Y_PLAYER_RELATIVE, defaultValue = "true")
	@Comment("true to keep the aurora at a height above player; false to fix it to an altitude")
	public static boolean auroraHeightPlayerRelative = true;
	@Parameter(category = CATEGORY_AURORA, property = CONFIG_PLAYER_FIXED_HEIGHT, defaultValue = "64.0")
	@MinMaxFloat(min = 16.0F, max = 2048.0F)
	@Comment("Number of blocks to say fixed above player if Aurora is player relative")
	public static float playerFixedHeight = 64.0F;
	@Parameter(category = CATEGORY_AURORA, property = CONFIG_MULTIPLE_BANDS, defaultValue = "true")
	@Comment("Allow Auroras with multiple bands")
	public static boolean auroraMultipleBands = true;
	@Parameter(category = CATEGORY_AURORA, property = CONFIG_AURORA_ANIMATE, defaultValue = "true")
	@Comment("Animate Aurora so it waves")
	public static boolean auroraAnimate = true;
	@Parameter(category = CATEGORY_AURORA, property = CONFIG_AURORA_SPAWN_OFFSET, defaultValue = "150")
	@MinMaxInt(min = 0, max = 200)
	@Comment("Number of blocks north of player location to spawn an aurora")
	public static int auroraSpawnOffset = 150;

	public static final String CATEGORY_BIOMES = "biomes";
	public static final String CONFIG_BIOME_CONFIG_FILES = "Config Files";
	public static final String CONFIG_BIOME_ALIASES = "Biome Alias";
	private static final List<String> biomesSort = Arrays.asList(CONFIG_BIOME_CONFIG_FILES, CONFIG_BIOME_ALIASES);

	@Parameter(category = CATEGORY_BIOMES, property = CONFIG_BIOME_CONFIG_FILES, defaultValue = "")
	@Comment("Configuration files for configuring Biome Registry")
	@RestartRequired
	public static String[] biomeConfigFiles = {};
	@Parameter(category = CATEGORY_BIOMES, property = CONFIG_BIOME_ALIASES, defaultValue = "")
	@Comment("Biome alias list")
	@RestartRequired
	public static String[] biomeAliases = {};

	public static final String CATEGORY_DIMENSIONS = "dimensions";
	public static final String CONFIG_DIMENSION_CONFIG_FILES = "Config Files";

	@Parameter(category = CATEGORY_DIMENSIONS, property = CONFIG_DIMENSION_CONFIG_FILES, defaultValue = "")
	@Comment("Configuration files for configuring Dimension Registry")
	@RestartRequired
	public static String[] dimensionConfigFiles = {};

	public static final String CATEGORY_BLOCK = "block";
	public static final String CONFIG_BLOCK_CONFIG_FILES = "Config Files";

	@Parameter(category = CATEGORY_BLOCK, property = CONFIG_BLOCK_CONFIG_FILES, defaultValue = "")
	@Comment("Configuration files for configuring Block sounds and behavior")
	@RestartRequired
	public static String[] blockConfigFiles = {};

	public static final String CATEGORY_SOUND = "sound";
	public static final String CONFIG_ENABLE_BIOME_SOUNDS = "Enable Biome Sounds";
	public static final String CONFIG_MASTER_SOUND_FACTOR = "Master Sound Scale Factor";
	public static final String CONFIG_AUTO_CONFIG_CHANNELS = "Autoconfigure Channels";
	public static final String CONFIG_NORMAL_CHANNEL_COUNT = "Number Normal Channels";
	public static final String CONFIG_STREAMING_CHANNEL_COUNT = "Number Streaming Channels";
	public static final String CONFIG_ENABLE_JUMP_SOUND = "Jump Sound";
	public static final String CONFIG_ENABLE_SWING_SOUND = "Swing Sound";
	public static final String CONFIG_ENABLE_CRAFTING_SOUND = "Crafting Sound";
	public static final String CONFIG_ENABLE_BOW_PULL_SOUND = "Bow Pull Sound";
	public static final String CONFIG_ENABLE_FOOTSTEPS_SOUND = "Footsteps";
	public static final String CONFIG_FOOTSTEPS_SOUND_FACTOR = "Footsteps Sound Factor";
	public static final String CONFIG_SOUND_CULL_THRESHOLD = "Sound Culling Threshold";
	public static final String CONFIG_CULLED_SOUNDS = "Culled Sounds";
	public static final String CONFIG_BLOCKED_SOUNDS = "Blocked Sounds";
	public static final String CONFIG_SOUND_VOLUMES = "Sound Volume";
	private static final List<String> soundsSort = Arrays.asList(CONFIG_ENABLE_BIOME_SOUNDS, CONFIG_MASTER_SOUND_FACTOR,
			CONFIG_ENABLE_FOOTSTEPS_SOUND, CONFIG_FOOTSTEPS_SOUND_FACTOR, CONFIG_ENABLE_JUMP_SOUND,
			CONFIG_ENABLE_SWING_SOUND, CONFIG_ENABLE_CRAFTING_SOUND, CONFIG_ENABLE_BOW_PULL_SOUND,
			CONFIG_AUTO_CONFIG_CHANNELS, CONFIG_NORMAL_CHANNEL_COUNT, CONFIG_STREAMING_CHANNEL_COUNT,
			CONFIG_BLOCKED_SOUNDS, CONFIG_SOUND_CULL_THRESHOLD, CONFIG_CULLED_SOUNDS, CONFIG_SOUND_VOLUMES);

	@Parameter(category = CATEGORY_SOUND, property = CONFIG_ENABLE_BIOME_SOUNDS, defaultValue = "true")
	@Comment("Enable biome background and spot sounds")
	@RestartRequired
	public static boolean enableBiomeSounds = true;
	@Parameter(category = CATEGORY_SOUND, property = CONFIG_MASTER_SOUND_FACTOR, defaultValue = "0.5")
	@MinMaxFloat(min = 0.0F, max = 1.0F)
	@Comment("Master sound scale factor for biome and block sounds")
	public static float masterSoundScaleFactor = 0.5F;
	@Parameter(category = CATEGORY_SOUND, property = CONFIG_AUTO_CONFIG_CHANNELS, defaultValue = "true")
	@Comment("Automatically configure sound channels")
	@RestartRequired
	public static boolean autoConfigureChannels = true;
	@Parameter(category = CATEGORY_SOUND, property = CONFIG_NORMAL_CHANNEL_COUNT, defaultValue = "28")
	@MinMaxInt(min = 28)
	@Comment("Number of normal sound channels to configure in the sound system (manual)")
	@RestartRequired
	public static int normalSoundChannelCount = 28;
	@Parameter(category = CATEGORY_SOUND, property = CONFIG_STREAMING_CHANNEL_COUNT, defaultValue = "4")
	@MinMaxInt(min = 4)
	@Comment("Number of streaming sound channels to configure in the sound system (manual)")
	@RestartRequired
	public static int streamingSoundChannelCount = 4;
	@Parameter(category = CATEGORY_SOUND, property = CONFIG_ENABLE_JUMP_SOUND, defaultValue = "true")
	@Comment("Enable sound effect when jumping")
	@RestartRequired
	public static boolean enableJumpSound = true;
	@Parameter(category = CATEGORY_SOUND, property = CONFIG_ENABLE_SWING_SOUND, defaultValue = "true")
	@Comment("Enable weapons swing sound effect when attacking")
	@RestartRequired
	public static boolean enableSwingSound = true;
	@Parameter(category = CATEGORY_SOUND, property = CONFIG_ENABLE_CRAFTING_SOUND, defaultValue = "true")
	@Comment("Enable sound when item crafted")
	@RestartRequired
	public static boolean enableCraftingSound = true;
	@Parameter(category = CATEGORY_SOUND, property = CONFIG_ENABLE_BOW_PULL_SOUND, defaultValue = "true")
	@Comment("Enable sound when bow is pulled")
	@RestartRequired
	public static boolean enableBowPullSound = true;
	@Parameter(category = CATEGORY_SOUND, property = CONFIG_ENABLE_FOOTSTEPS_SOUND, defaultValue = "true")
	@Comment("Enable footstep sounds")
	@RestartRequired
	public static boolean enableFootstepSounds = true;
	@Parameter(category = CATEGORY_SOUND, property = CONFIG_FOOTSTEPS_SOUND_FACTOR, defaultValue = "0.05")
	@MinMaxFloat(min = 0.0F, max = 1.0F)
	@Comment("Sound scale factor for footstep sounds")
	public static float footstepsSoundFactor = 0.05F;
	@Parameter(category = CATEGORY_SOUND, property = CONFIG_SOUND_CULL_THRESHOLD, defaultValue = "20")
	@MinMaxInt(min = 0)
	@Comment("Ticks between culled sound events (0 to disable culling)")
	public static int soundCullingThreshold = 20;
	@Parameter(category = CATEGORY_SOUND, property = CONFIG_CULLED_SOUNDS, defaultValue = "^minecraft:liquid.*,minecraft:mob.sheep.say,minecraft:mob.chicken.say,minecraft:mob.cow.say,minecraft:mob.pig.say")
	@Comment("Sounds to cull from frequent playing")
	@RestartRequired
	public static String[] culledSounds = { "^minecraft:liquid.*", "minecraft:mob.sheep.say",
			"minecraft:mob.chicken.say", "minecraft:mob.cow.say", "minecraft:mob.pig.say" };
	@Parameter(category = CATEGORY_SOUND, property = CONFIG_BLOCKED_SOUNDS, defaultValue = "dsurround:bison")
	@Comment("Sounds to block from playing")
	@Hidden
	public static String[] blockedSounds = { "dsurround:bison" };
	@Parameter(category = CATEGORY_SOUND, property = CONFIG_SOUND_VOLUMES, defaultValue = "")
	@Comment("Individual sound scaling factors")
	@Hidden
	public static String[] soundVolumes = {};

	public static final String CATEGORY_PLAYER = "player";
	public static final String CONFIG_SUPPRESS_POTION_PARTICLES = "Suppress Potion Particles";
	public static final String CONFIG_ENABLE_POPOFFS = "Damage Popoffs";
	public static final String CONFIG_HURT_THRESHOLD = "Hurt Threshold";
	public static final String CONFIG_HUNGER_THRESHOLD = "Hunger Threshold";
	private static final List<String> playerSort = Arrays.asList(CONFIG_SUPPRESS_POTION_PARTICLES,
			CONFIG_ENABLE_POPOFFS, CONFIG_HURT_THRESHOLD, CONFIG_HUNGER_THRESHOLD);

	@Parameter(category = CATEGORY_PLAYER, property = CONFIG_SUPPRESS_POTION_PARTICLES, defaultValue = "false")
	@Comment("Suppress player's potion particles from rendering")
	@RestartRequired
	public static boolean suppressPotionParticles = false;
	@Parameter(category = CATEGORY_PLAYER, property = CONFIG_ENABLE_POPOFFS, defaultValue = "true")
	@Comment("Controls display of damage pop-offs when an entity is damaged")
	@RestartRequired
	public static boolean enableDamagePopoffs = true;
	@Parameter(category = CATEGORY_PLAYER, property = CONFIG_HURT_THRESHOLD, defaultValue = "8")
	@Comment("Amount of health bar remaining to trigger player hurt sound")
	@MinMaxInt(min = 0, max = 10)
	public static int playerHurtThreshold = 8;
	@Parameter(category = CATEGORY_PLAYER, property = CONFIG_HUNGER_THRESHOLD, defaultValue = "8")
	@Comment("Amount of food bar remaining to trigger player hunger sound")
	@MinMaxInt(min = 0, max = 10)
	public static int playerHungerThreshold = 8;

	public static final String CATEGORY_POTION_HUD = "player.potion hud";
	public static final String CONFIG_POTION_HUD_ENABLE = "Enable";
	public static final String CONFIG_POTION_HUD_TRANSPARENCY = "Transparency";
	public static final String CONFIG_POTION_HUD_LEFT_OFFSET = "Left Offset";
	public static final String CONFIG_POTION_HUD_TOP_OFFSET = "Top Offset";
	public static final String CONFIG_POTION_HUD_SCALE = "Display Scale";
	private static final List<String> potionHudSort = Arrays.asList(CONFIG_POTION_HUD_ENABLE,
			CONFIG_POTION_HUD_TRANSPARENCY, CONFIG_POTION_HUD_SCALE, CONFIG_POTION_HUD_TOP_OFFSET,
			CONFIG_POTION_HUD_LEFT_OFFSET);

	@Parameter(category = CATEGORY_POTION_HUD, property = CONFIG_POTION_HUD_ENABLE, defaultValue = "true")
	@Comment("Enable display of potion icons in display")
	@RestartRequired
	public static boolean potionHudEnabled = true;
	@Parameter(category = CATEGORY_POTION_HUD, property = CONFIG_POTION_HUD_TRANSPARENCY, defaultValue = "0.5")
	@MinMaxFloat(min = 0.0F, max = 1.0F)
	@Comment("Transparency factor for icons (higher more solid)")
	public static float potionHudTransparency = 0.5F;
	@Parameter(category = CATEGORY_POTION_HUD, property = CONFIG_POTION_HUD_LEFT_OFFSET, defaultValue = "5")
	@MinMaxInt(min = 0)
	@Comment("Offset from left side of screen")
	public static int potionHudLeftOffset = 5;
	@Parameter(category = CATEGORY_POTION_HUD, property = CONFIG_POTION_HUD_TOP_OFFSET, defaultValue = "5")
	@MinMaxInt(min = 0)
	@Comment("Offset from top of screen")
	public static int potionHudTopOffset = 5;
	@Parameter(category = CATEGORY_POTION_HUD, property = CONFIG_POTION_HUD_SCALE, defaultValue = "0.5")
	@MinMaxFloat(min = 0.0F, max = 1.0F)
	@Comment("Size scale of icons (lower is smaller)")
	public static float potionHudScale = 0.5F;

	public static void load(final Configuration config) {

		ConfigProcessor.process(config, ModOptions.class);

		// CATEGORY: Logging
		config.setCategoryRequiresMcRestart(CATEGORY_LOGGING_CONTROL, false);
		config.setCategoryRequiresWorldRestart(CATEGORY_LOGGING_CONTROL, false);
		config.setCategoryComment(CATEGORY_LOGGING_CONTROL, "Defines how Dynamic Surroundings logging will behave");
		config.setCategoryPropertyOrder(CATEGORY_LOGGING_CONTROL, new ArrayList<String>(loggingSort));

		// CATEGORY: Rain
		config.setCategoryRequiresMcRestart(CATEGORY_RAIN, false);
		config.setCategoryRequiresWorldRestart(CATEGORY_RAIN, false);
		config.setCategoryComment(CATEGORY_RAIN, "Options that control rain effects in the client");
		config.setCategoryPropertyOrder(CATEGORY_RAIN, new ArrayList<String>(rainSort));

		// CATEGORY: General
		config.setCategoryRequiresMcRestart(CATEGORY_GENERAL, false);
		config.setCategoryRequiresWorldRestart(CATEGORY_GENERAL, false);
		config.setCategoryComment(CATEGORY_GENERAL, "Miscellaneous settings");
		config.setCategoryPropertyOrder(CATEGORY_GENERAL, new ArrayList<String>(generalSort));

		// CATEGORY: Player
		config.setCategoryRequiresMcRestart(CATEGORY_PLAYER, false);
		config.setCategoryRequiresWorldRestart(CATEGORY_PLAYER, false);
		config.setCategoryComment(CATEGORY_PLAYER, "General options for defining sound and effects the player entity");
		config.setCategoryPropertyOrder(CATEGORY_PLAYER, new ArrayList<String>(playerSort));

		// CATEGORY: Aurora
		config.setCategoryRequiresMcRestart(CATEGORY_AURORA, false);
		config.setCategoryRequiresWorldRestart(CATEGORY_AURORA, false);
		config.setCategoryComment(CATEGORY_AURORA, "Options that control Aurora behavior and rendering");
		config.setCategoryPropertyOrder(CATEGORY_AURORA, new ArrayList<String>(auroraSort));

		// CATEGORY: Fog
		config.setCategoryRequiresMcRestart(CATEGORY_FOG, false);
		config.setCategoryRequiresWorldRestart(CATEGORY_FOG, false);
		config.setCategoryComment(CATEGORY_FOG, "Options that control the various fog effects in the client");
		config.setCategoryPropertyOrder(CATEGORY_FOG, new ArrayList<String>(fogSort));

		// CATEGORY: Biomes
		config.setCategoryRequiresMcRestart(CATEGORY_BIOMES, false);
		config.setCategoryRequiresWorldRestart(CATEGORY_BIOMES, false);
		config.setCategoryComment(CATEGORY_BIOMES, "Options for controlling biome sound/effects");
		config.setCategoryPropertyOrder(CATEGORY_BIOMES, new ArrayList<String>(biomesSort));

		// CATEGORY: Dimensions
		config.setCategoryRequiresMcRestart(CATEGORY_DIMENSIONS, false);
		config.setCategoryRequiresWorldRestart(CATEGORY_DIMENSIONS, false);
		config.setCategoryComment(CATEGORY_DIMENSIONS,
				"Options for defining per dimension parameters for Dynamic Surroundings");

		// CATEGORY: Block
		config.setCategoryRequiresMcRestart(CATEGORY_BLOCK, false);
		config.setCategoryRequiresWorldRestart(CATEGORY_BLOCK, false);
		config.setCategoryComment(CATEGORY_BLOCK, "Options for defining block specific sounds/effects");

		// CATEGORY: Sound
		config.setCategoryRequiresMcRestart(CATEGORY_SOUND, false);
		config.setCategoryRequiresWorldRestart(CATEGORY_SOUND, false);
		config.setCategoryComment(CATEGORY_SOUND, "General options for defining sound effects");
		config.setCategoryPropertyOrder(CATEGORY_SOUND, new ArrayList<String>(soundsSort));

		// CATEGORY: player.potion hud
		config.setCategoryRequiresMcRestart(CATEGORY_POTION_HUD, false);
		config.setCategoryRequiresWorldRestart(CATEGORY_POTION_HUD, false);
		config.setCategoryComment(CATEGORY_POTION_HUD, "Options for the Potion HUD overlay");
		config.setCategoryPropertyOrder(CATEGORY_POTION_HUD, new ArrayList<String>(potionHudSort));

		// Iterate through the config list looking for properties without
		// comments. These will
		// be scrubbed.
		for (final String cat : config.getCategoryNames())
			scrubCategory(config.getCategory(cat));
	}

	private static void scrubCategory(final ConfigCategory category) {
		final List<String> killList = new ArrayList<String>();
		for (final Entry<String, Property> entry : category.entrySet())
			if (StringUtils.isEmpty(entry.getValue().getComment()))
				killList.add(entry.getKey());

		for (final String kill : killList)
			category.remove(kill);
	}
}
