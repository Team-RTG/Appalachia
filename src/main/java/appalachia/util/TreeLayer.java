package appalachia.util;

import net.minecraft.util.math.BlockPos;

/**
 * Created by WhichOnesPink on 17/07/2017.
 */
public class TreeLayer {

    public int y;

    public TreeLayer(int y) {
        this.y = y;
    }

    public TreeLayer setLogs(BlockPos... logs) {
        return this;
    }

    public TreeLayer setLeaves(BlockPos... leaves) {
        return this;
    }
}
