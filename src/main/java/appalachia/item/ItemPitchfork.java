package appalachia.item;

import java.util.*;
import javax.annotation.Nonnull;

import net.minecraft.block.Block;
import net.minecraft.block.BlockBush;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.EnumAction;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import appalachia.api.item.IPitchforkHarvestable;
import appalachia.util.PlayerUtil;
import com.google.common.collect.Sets;

public class ItemPitchfork extends ItemTool {

    private static final Set<Block> EFFECTIVE_ON = Sets.newHashSet(new Block[]{Blocks.HAY_BLOCK, Blocks.LEAVES, Blocks.LEAVES2, Blocks.VINE, Blocks.BROWN_MUSHROOM_BLOCK, Blocks.RED_MUSHROOM_BLOCK, Blocks.CACTUS});
    private static final float[] ATTACK_DAMAGES = new float[]{4.0F, 5.0F, 6.0F, 7.0F, 5.0F};
    private static final float[] ATTACK_SPEEDS = new float[]{-3.0F, -3.0F, -2.9F, -2.8F, -2.8F};
    private static int forkRange = 3;
    private static int forkRangeY = 3;

    public ItemPitchfork(Item.ToolMaterial material, int range, int rangeY) {
        super(material, EFFECTIVE_ON);
        this.damageVsEntity = ATTACK_DAMAGES[material.ordinal()];
        this.attackSpeed = ATTACK_SPEEDS[material.ordinal()];
        forkRange = range;
        forkRangeY = rangeY;
    }

    @SideOnly(Side.CLIENT)
    public boolean isFull3D() {
        return true;
    }

    public float getStrVsBlock(ItemStack stack, IBlockState state) {
        Material material = state.getMaterial();
        return material != Material.LEAVES && material != Material.CACTUS && material != Material.VINE ? super.getStrVsBlock(stack, state) : this.efficiencyOnProperMaterial;
    }

    @Nonnull
    @Override
    public EnumAction getItemUseAction(ItemStack par1ItemStack) {
        return EnumAction.BOW;
    }

    @Override
    public int getMaxItemUseDuration(ItemStack par1ItemStack) {
        return getMaxDamage();
    }

    @Nonnull
    @Override
    public ActionResult<ItemStack> onItemRightClick(@Nonnull ItemStack par1ItemStack, World world, EntityPlayer player, EnumHand hand) {
        player.setActiveHand(hand);
        return ActionResult.newResult(EnumActionResult.SUCCESS, player.getHeldItem(hand));
    }

    @Override
    public void onUsingTick(ItemStack stack, EntityLivingBase player, int time) {
        if (!player.world.isRemote) {
            if (time != getMaxItemUseDuration(stack)) {
                breakGrass(player.world, stack, new BlockPos(player), player);
            }
        }
    }

    public void breakGrass(World world, ItemStack stack, BlockPos srcPos, Entity entity) {
        Random rand = new Random(srcPos.hashCode());
        int range = forkRange;
        int rangeY = forkRangeY;
        List<BlockPos> coords = new ArrayList<>();

        for (BlockPos pos : BlockPos.getAllInBox(srcPos.add(-range, -rangeY, -range), srcPos.add(range, rangeY, range))) {
            Block block = world.getBlockState(pos).getBlock();
            if (block instanceof IPitchforkHarvestable
                    ? ((IPitchforkHarvestable) block).canPitchforkHarvest(world, pos, stack)
                    : block instanceof BlockBush) {
                coords.add(pos);
                if (!PlayerUtil.isCreativeMode(entity)) {
                    setDamage(stack, getDamage(stack) + 1);
                }
            }
        }

        Collections.shuffle(coords, rand);

        int count = Math.min(coords.size(), 32 + range * 16);
        for (int i = 0; i < count; i++) {
            BlockPos currCoords = coords.get(i);
            IBlockState state = world.getBlockState(currCoords);
            Block block = state.getBlock();

            if (block instanceof IPitchforkHarvestable && ((IPitchforkHarvestable) block).hasSpecialPitchforkHarvest(world, currCoords, stack)) {
                ((IPitchforkHarvestable) block).harvestByPitchfork(world, currCoords, stack);
            } else {
                block.dropBlockAsItem(world, currCoords, state, 0);
                world.setBlockToAir(currCoords);
            }
        }
    }
}