/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package appalachia.block;

import appalachia.block.leaves.AppalachiaBlockLeaves;
import appalachia.block.logs.AppalachiaBlockLog;
import net.minecraft.block.state.IBlockState;

/**
 *
 * @author Zeno410
 */
public class AppalachiaBlockPair {
    public IBlockState log = AppalachiaBlockLog.getRandomLog().getDefaultState();
    public IBlockState leaves = AppalachiaBlockLeaves.getRandomLeaves().getDefaultState();
}
