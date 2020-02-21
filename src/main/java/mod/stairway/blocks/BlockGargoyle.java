package mod.stairway.blocks;

import mod.shared.blocks.BlockBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.state.DirectionProperty;
import net.minecraft.state.IntegerProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.util.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;

import java.util.Random;

public class BlockGargoyle extends BlockBlock {

    public static final DirectionProperty FACING = BlockStateProperties.HORIZONTAL_FACING;
    public static final IntegerProperty EYES = BlockStateProperties.AGE_0_2;

    public static final VoxelShape AABB0 = Block.makeCuboidShape(1, 0, 4, 16, 16, 12);
    public static final VoxelShape AABB1 = Block.makeCuboidShape(4, 0, 1, 12, 16, 16);
    public static final VoxelShape AABB2 = Block.makeCuboidShape(0, 0, 4, 15, 16, 12);
    public static final VoxelShape AABB3 = Block.makeCuboidShape(4, 0, 0, 12, 16, 15);

    public BlockGargoyle(String modid, String name, Block block) {
        super(modid, name, block);
        this.setDefaultState(this.stateContainer.getBaseState().with(FACING, Direction.NORTH).with(EYES, Integer.valueOf(0)));
    }

    public boolean canProvidePower(BlockState state) {
        return state.get(EYES) > 0;
    }

    public int getWeakPower(BlockState blockState, IBlockReader blockAccess, BlockPos pos, Direction side) {
        return blockState.get(EYES) == 2 ? 15 : blockState.get(EYES) == 1 ? 6 : 0;
    }

    protected void fillStateContainer(StateContainer.Builder<Block, BlockState> builder) {
        builder.add(FACING, EYES);
    }

    public boolean onBlockActivated(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockRayTraceResult hit){
        if (world.isRemote) {
            return true;
        }
        int power = state.get(EYES);
        if(player.getHeldItem(hand).getItem() == Items.DIAMOND){
            if(power < 2){
                player.getHeldItem(hand).shrink(1);
                world.setBlockState(pos, state.with(EYES, power+1));
            }
            if(power == 3){
                player.getHeldItem(hand).shrink(1);
                world.setBlockState(pos, state.with(EYES, 5));
            }
        } else if(player.getHeldItem(hand).getItem() == Items.EMERALD){
            if(power == 0 || power == 3){
                player.getHeldItem(hand).shrink(1);
                world.setBlockState(pos, state.with(EYES, power == 0 ? 3 : 4));
            }
            if(power == 1){
                player.getHeldItem(hand).shrink(1);
                world.setBlockState(pos, state.with(EYES, 5));
            }
        } else if(player.getHeldItem(hand).isEmpty()){
            if(power == 1 || power == 2){
                player.inventory.addItemStackToInventory(new ItemStack(Items.DIAMOND, 1));
                world.setBlockState(pos, state.with(EYES, power-1));
            }
            if(power == 3 || power == 4){
                player.inventory.addItemStackToInventory(new ItemStack(Items.EMERALD, 1));
                world.setBlockState(pos, state.with(EYES, power == 3 ? 0 : 3));
            }
            if(power == 5){
                player.inventory.addItemStackToInventory(new ItemStack(Items.EMERALD, 1));
                world.setBlockState(pos, state.with(EYES, 1));
            }
        }
        return true;
    }

    public BlockState rotate(BlockState state, Rotation rot) {
        return state.with(FACING, rot.rotate(state.get(FACING)));
    }

    public BlockState mirror(BlockState state, Mirror mirrorIn) {
        return state.rotate(mirrorIn.toRotation(state.get(FACING)));
    }

    public void tick(BlockState state, World worldIn, BlockPos pos, Random random) {
        //if (state.get(POWERED)) {
        //    worldIn.setBlockState(pos, state.with(POWERED, Boolean.valueOf(false)), 2);
        //} else {
        //    worldIn.setBlockState(pos, state.with(POWERED, Boolean.valueOf(true)), 2);
        //    worldIn.getPendingBlockTicks().scheduleTick(pos, this, 2);
        //}
//
        //this.updateNeighborsInFront(worldIn, pos, state);
    }

    public int getStrongPower(BlockState blockState, IBlockReader blockAccess, BlockPos pos, Direction side) {
        return blockState.getWeakPower(blockAccess, pos, side);
    }

    public BlockState getStateForPlacement(BlockItemUseContext context) {
        return this.getDefaultState().with(FACING, context.getPlacementHorizontalFacing().getOpposite());
    }

    @Deprecated
    public boolean isSolid(BlockState state) {
        return false;
    }

    public BlockRenderLayer getRenderLayer() {
        return BlockRenderLayer.CUTOUT_MIPPED;
    }

    @Deprecated
    public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {
        Direction enumfacing = state.get(FACING);
        switch(enumfacing) {
            case NORTH: return AABB1;
            case SOUTH: return AABB3;
            case EAST:  return AABB2;
            case WEST:  return AABB0;
            default:
                return VoxelShapes.fullCube();
        }
    }


}
