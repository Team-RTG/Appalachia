package appalachia.loot;

import net.minecraft.util.ResourceLocation;
import net.minecraft.world.storage.loot.LootTable;
import net.minecraft.world.storage.loot.LootTableList;

import appalachia.reference.ModInfo;

public class LootManager {

    public static final ResourceLocation LOOT_TABLE_BLACK_BEAR = register("entities/black_bear");
    public static final ResourceLocation FIREFLY = register("entities/firefly");
    public static final ResourceLocation FIREFLY_FLASHING = register("entities/firefly_flashing");

    /**
     * Register a {@link LootTable} with the specified ID.
     *
     * @param id The ID of the LootTable without the testmod3: prefix
     * @return The ID of the LootTable
     */
    private static ResourceLocation register(String id) {
        return LootTableList.register(new ResourceLocation(ModInfo.MOD_ID, id));
    }
}
