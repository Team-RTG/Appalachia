package appalachia.util;

import java.util.ArrayList;
import java.util.Arrays;

import net.minecraft.util.math.BlockPos;

/**
 * Created by WhichOnesPink on 17/07/2017.
 */
public class TreeLayer {

    private int y;
    private ArrayList<BlockPos> logs;
    private ArrayList<BlockPos> leaves;

    public TreeLayer(int y) {
        this.y = y;
        this.logs = new ArrayList<BlockPos>(){};
        this.leaves = new ArrayList<BlockPos>(){};
    }

    public int getY() {
        return this.y;
    }

    public ArrayList<BlockPos> getLogs() {
        return this.logs;
    }

    public TreeLayer setLogs(BlockPos... logs) {
        this.logs = new ArrayList<BlockPos>(Arrays.asList(logs));
        return this;
    }

    public ArrayList<BlockPos> getLeaves() {
        return this.leaves;
    }

    public TreeLayer setLeaves(BlockPos... leaves) {
        this.leaves = new ArrayList<BlockPos>(Arrays.asList(leaves));
        return this;
    }
}
