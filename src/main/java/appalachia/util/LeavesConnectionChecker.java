package appalachia.util;

import java.util.ArrayList;

import net.minecraft.block.BlockLeaves;
import net.minecraft.block.BlockLog;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

/**
 * Created by WhichOnesPink on 18/02/2017.
 */
public class LeavesConnectionChecker {

    private World world;
    private BlockPos sourcePos;
    private ArrayList<BlockPos> checkedPositions = new ArrayList<BlockPos>();
    private boolean isConnected = false;

    public LeavesConnectionChecker(World world, BlockPos sourcePos) {
        this.world = world;
        this.sourcePos = sourcePos;
    }

    public boolean isConnected() {

        this.traverse(this.sourcePos);

        return isConnected;
    }

    public void traverse(BlockPos sourcePos) {

        ArrayList<BlockPos> aPos = this.getUncheckedAdjacentConnectorPositions(sourcePos);
        BlockPos pos;

        for (int i = 0; i < aPos.size(); i++) {
            if (!isConnected) {
                pos = aPos.get(i);
                this.traverse(pos);
            }
        }
    }

    public ArrayList<BlockPos> getUncheckedAdjacentConnectorPositions(BlockPos sourcePos) {

        ArrayList<BlockPos> aPos = new ArrayList<BlockPos>();
        int sourceX = sourcePos.getX();
        int sourceY = sourcePos.getY();
        int sourceZ = sourcePos.getZ();

        outerLoop:
        for (int x = -1; x <= 1; x++) {
            for (int y = -1; y <= 1; y++) {
                for (int z = -1; z <= 1; z++) {

                    if (x == 0 && y == 0 && z == 0) {
                        continue;
                    }

                    BlockPos posCheck = new BlockPos(sourceX + x, sourceY + y, sourceZ + z);
                    IBlockState blockCheck = world.getBlockState(posCheck);

                    if (blockCheck.getBlock() instanceof BlockLog) {
                        isConnected = true;
                        break outerLoop;
                    }
                    else if (blockCheck.getBlock() instanceof BlockLeaves) {

                        if (!checkedPositions.contains(posCheck)) {
                            aPos.add(posCheck);
                            checkedPositions.add(posCheck);
                        }
                    }
                }
            }
        }

        return aPos;
    }
}
