package appalachia.event;

import net.minecraft.util.math.BlockPos;
import net.minecraft.world.biome.Biome;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.terraingen.PopulateChunkEvent;
import net.minecraftforge.event.world.WorldEvent;
import net.minecraftforge.fml.common.eventhandler.Event;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import appalachia.util.Logger;
import appalachia.world.biome.AppalachianBiomeDecorator;


public class EventManager {

    // Event handlers.
    private final WorldEventAppalachia WORLD_EVENT_HANDLER = new WorldEventAppalachia();
    private final PopulateChunkEventAppalachia POPULATE_CHUNK_EVENT_HANDLER = new PopulateChunkEventAppalachia();

    private long worldSeed;

    public EventManager() {

    }

    public class WorldEventAppalachia {

        WorldEventAppalachia() {

            logEventMessage("Initialising WorldEventAppalachia...");
        }

        @SubscribeEvent
        public void onWorldLoad(WorldEvent.Load event) {

            // This event fires for each dimension loaded (and then one last time in which it returns 0?),
            // so initialise a field to 0 and set it to the world seed and only display it in the log once.
            if (worldSeed != event.getWorld().getSeed() && event.getWorld().getSeed() != 0) {

                worldSeed = event.getWorld().getSeed();
                Logger.info("World Seed: " + worldSeed);
            }
        }

        @SubscribeEvent
        public void onWorldUnload(WorldEvent.Unload event) {

            // Reset the world seed so that it logs on the next server start if the seed is the same as the last load.
            worldSeed = 0;
        }
    }

    public class PopulateChunkEventAppalachia {

        PopulateChunkEventAppalachia() {

            logEventMessage("Initialising PopulateChunkEventAppalachia...");
        }

        @SubscribeEvent
        public void onPopulate(PopulateChunkEvent.Populate event) {

            switch (event.getType()) {

                case LAKE:
                case LAVA:

                    Biome biome = event.getWorld().getBiome(new BlockPos(event.getChunkX() * 16 + 8, 0, event.getChunkZ() * 16 + 8));

                    if (biome.theBiomeDecorator instanceof AppalachianBiomeDecorator) {

                        AppalachianBiomeDecorator decorator = (AppalachianBiomeDecorator)biome.theBiomeDecorator;

                        if (!decorator.generatePonds) {
                            event.setResult(Event.Result.DENY);
                            return;
                        }
                    }

                default:
                    break;
            }
        }
    }

    /*
     * This method registers most of Appalachia's event handlers.
     */
    public void registerEventHandlers() {

        logEventMessage("Registering Appalachia's event handlers...");

        MinecraftForge.EVENT_BUS.register(WORLD_EVENT_HANDLER);
        MinecraftForge.TERRAIN_GEN_BUS.register(POPULATE_CHUNK_EVENT_HANDLER);

        logEventMessage("Appalachia's event handlers have been registered successfully.");
    }

    private static void logEventMessage(String message) {
        Logger.debug("Appalachia Event System: " + message);
    }
}