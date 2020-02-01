package mod.stairway.blocks;

import mod.shared.blocks.BlockBlock;
import mod.stairway.StairKeeper;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.item.Items;
import net.minecraft.state.DirectionProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.util.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.world.IWorldReader;
import net.minecraft.world.World;

import java.util.Random;

public class BlockEmitter extends BlockBlock {

    public static final DirectionProperty FACING = BlockStateProperties.FACING;

    /** Default Constructor */
    public BlockEmitter(String modid, String name, Block block) {
        super(modid, name, Properties.from(block).tickRandomly());
        this.setDefaultState(this.stateContainer.getBaseState().with(FACING, Direction.NORTH));
    }

    protected void fillStateContainer(StateContainer.Builder<Block, BlockState> builder) {
        builder.add(FACING);
    }

    public BlockState rotate(BlockState state, Rotation rot) {
        return state.with(FACING, rot.rotate(state.get(FACING)));
    }

    public BlockState mirror(BlockState state, Mirror mirrorIn) {
        return state.rotate(mirrorIn.toRotation(state.get(FACING)));
    }

    /**
     * How many world ticks before ticking
     */
    public int tickRate(IWorldReader worldIn) {
        return 1;
    }

    public void tick(BlockState state, World worldIn, BlockPos pos, Random random) {
        int power = worldIn.getRedstonePowerFromNeighbors(pos);
        Direction facing = state.get(FACING);
        setLightBlocks(state, worldIn, pos, power, facing);
    }

    @Deprecated
    public void neighborChanged(BlockState state, World world, BlockPos pos, Block blockIn, BlockPos fromPos, boolean isMoving) {
        int power = world.getRedstonePowerFromNeighbors(pos);
        Direction facing = state.get(FACING);
        setLightBlocks(state, world, pos, power, facing);
    }

    public void setLightBlocks(BlockState state, World world, BlockPos pos, int power, Direction facing){
        for(int i = 1; i < 17; i++){
            BlockPos blockpos = getOffset(facing, pos, i);
            if(world.isAirBlock(blockpos)){
                if(i < power){
                    world.setBlockState(blockpos, getBlock(state).with(BlockLight.FACING, facing));
                }
            } else if(world.getBlockState(blockpos).getBlock() instanceof BlockLight){
                if(world.getBlockState(blockpos).getBlock() == getBlock(state).getBlock()){
                    if(i > power){
                        world.setBlockState(blockpos, Blocks.AIR.getDefaultState());
                    }
                }
            } else {
                i = 20;
            }
        }
    }

    public ActionResultType onBlockActivated(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockRayTraceResult hit){
        if (world.isRemote || hand == Hand.OFF_HAND) {
            return ActionResultType.PASS;
        } else {
            if(player.getHeldItem(hand).getItem() == Items.BLACK_DYE){      world.setBlockState(pos, StairKeeper.BLOCK_EMITTER_BLACK.getDefaultState().with(FACING, state.get(FACING)), 2);  }
            if(player.getHeldItem(hand).getItem() == Items.BLUE_DYE){       world.setBlockState(pos, StairKeeper.BLOCK_EMITTER_BLUE.getDefaultState().with(FACING, state.get(FACING)), 2);  }
            if(player.getHeldItem(hand).getItem() == Items.BROWN_DYE){      world.setBlockState(pos, StairKeeper.BLOCK_EMITTER_BROWN.getDefaultState().with(FACING, state.get(FACING)), 2);  }
            if(player.getHeldItem(hand).getItem() == Items.CYAN_DYE){       world.setBlockState(pos, StairKeeper.BLOCK_EMITTER_CYAN.getDefaultState().with(FACING, state.get(FACING)), 2);  }
            if(player.getHeldItem(hand).getItem() == Items.GRAY_DYE){       world.setBlockState(pos, StairKeeper.BLOCK_EMITTER_GRAY.getDefaultState().with(FACING, state.get(FACING)), 2);  }
            if(player.getHeldItem(hand).getItem() == Items.GREEN_DYE){      world.setBlockState(pos, StairKeeper.BLOCK_EMITTER_GREEN.getDefaultState().with(FACING, state.get(FACING)), 2);  }
            if(player.getHeldItem(hand).getItem() == Items.LIGHT_BLUE_DYE){ world.setBlockState(pos, StairKeeper.BLOCK_EMITTER_LIGHTBLUE.getDefaultState().with(FACING, state.get(FACING)), 2);  }
            if(player.getHeldItem(hand).getItem() == Items.LIME_DYE){       world.setBlockState(pos, StairKeeper.BLOCK_EMITTER_LIME.getDefaultState().with(FACING, state.get(FACING)), 2);  }
            if(player.getHeldItem(hand).getItem() == Items.MAGENTA_DYE){    world.setBlockState(pos, StairKeeper.BLOCK_EMITTER_MAGENTA.getDefaultState().with(FACING, state.get(FACING)), 2);  }
            if(player.getHeldItem(hand).getItem() == Items.ORANGE_DYE){     world.setBlockState(pos, StairKeeper.BLOCK_EMITTER_ORANGE.getDefaultState().with(FACING, state.get(FACING)), 2);  }
            if(player.getHeldItem(hand).getItem() == Items.PINK_DYE){       world.setBlockState(pos, StairKeeper.BLOCK_EMITTER_PINK.getDefaultState().with(FACING, state.get(FACING)), 2);  }
            if(player.getHeldItem(hand).getItem() == Items.PURPLE_DYE){     world.setBlockState(pos, StairKeeper.BLOCK_EMITTER_PURPLE.getDefaultState().with(FACING, state.get(FACING)), 2);  }
            if(player.getHeldItem(hand).getItem() == Items.RED_DYE){        world.setBlockState(pos, StairKeeper.BLOCK_EMITTER_RED.getDefaultState().with(FACING, state.get(FACING)), 2);  }
            if(player.getHeldItem(hand).getItem() == Items.LIGHT_GRAY_DYE){ world.setBlockState(pos, StairKeeper.BLOCK_EMITTER_SILVER.getDefaultState().with(FACING, state.get(FACING)), 2);  }
            if(player.getHeldItem(hand).getItem() == Items.WHITE_DYE){      world.setBlockState(pos, StairKeeper.BLOCK_EMITTER_WHITE.getDefaultState().with(FACING, state.get(FACING)), 2);  }
            if(player.getHeldItem(hand).getItem() == Items.YELLOW_DYE){     world.setBlockState(pos, StairKeeper.BLOCK_EMITTER_YELLOW.getDefaultState().with(FACING, state.get(FACING)), 2);  }
            return ActionResultType.SUCCESS;
        }
    }

    public BlockPos getOffset(Direction facing, BlockPos pos, int i){
        if(facing == Direction.UP)    return pos.add( 0, +i,  0);
        if(facing == Direction.DOWN)  return pos.add( 0, -i,  0);
        if(facing == Direction.NORTH) return pos.add( 0,  0, -i);
        if(facing == Direction.SOUTH) return pos.add( 0,  0, +i);
        if(facing == Direction.EAST)  return pos.add(+i,  0,  0);
        if(facing == Direction.WEST)  return pos.add(-i,  0,  0);
        return pos;
    }

    public BlockState getBlock(BlockState state){
            if(state.getBlock() == StairKeeper.BLOCK_EMITTER_BLACK)     return StairKeeper.BLOCK_LIGHT_BLACK.getDefaultState();
            if(state.getBlock() == StairKeeper.BLOCK_EMITTER_BLUE)      return StairKeeper.BLOCK_LIGHT_BLUE.getDefaultState();
            if(state.getBlock() == StairKeeper.BLOCK_EMITTER_BROWN)     return StairKeeper.BLOCK_LIGHT_BROWN.getDefaultState();
            if(state.getBlock() == StairKeeper.BLOCK_EMITTER_CYAN)      return StairKeeper.BLOCK_LIGHT_CYAN.getDefaultState();
            if(state.getBlock() == StairKeeper.BLOCK_EMITTER_GRAY)      return StairKeeper.BLOCK_LIGHT_GRAY.getDefaultState();
            if(state.getBlock() == StairKeeper.BLOCK_EMITTER_GREEN)     return StairKeeper.BLOCK_LIGHT_GREEN.getDefaultState();
            if(state.getBlock() == StairKeeper.BLOCK_EMITTER_LIGHTBLUE) return StairKeeper.BLOCK_LIGHT_LIGHTBLUE.getDefaultState();
            if(state.getBlock() == StairKeeper.BLOCK_EMITTER_LIME)      return StairKeeper.BLOCK_LIGHT_LIME.getDefaultState();
            if(state.getBlock() == StairKeeper.BLOCK_EMITTER_MAGENTA)   return StairKeeper.BLOCK_LIGHT_MAGENTA.getDefaultState();
            if(state.getBlock() == StairKeeper.BLOCK_EMITTER_ORANGE)    return StairKeeper.BLOCK_LIGHT_ORANGE.getDefaultState();
            if(state.getBlock() == StairKeeper.BLOCK_EMITTER_PINK)      return StairKeeper.BLOCK_LIGHT_PINK.getDefaultState();
            if(state.getBlock() == StairKeeper.BLOCK_EMITTER_PURPLE)    return StairKeeper.BLOCK_LIGHT_PURPLE.getDefaultState();
            if(state.getBlock() == StairKeeper.BLOCK_EMITTER_RED)       return StairKeeper.BLOCK_LIGHT_RED.getDefaultState();
            if(state.getBlock() == StairKeeper.BLOCK_EMITTER_SILVER)    return StairKeeper.BLOCK_LIGHT_SILVER.getDefaultState();
            if(state.getBlock() == StairKeeper.BLOCK_EMITTER_WHITE)     return StairKeeper.BLOCK_LIGHT_WHITE.getDefaultState();
            if(state.getBlock() == StairKeeper.BLOCK_EMITTER_YELLOW)    return StairKeeper.BLOCK_LIGHT_YELLOW.getDefaultState();
        return StairKeeper.BLOCK_LIGHT_BLACK.getDefaultState();
    }

    public void onReplaced(BlockState state, World worldIn, BlockPos pos, BlockState newState, boolean isMoving) {
        Direction facing = state.get(FACING);
        setLightBlocks(state, worldIn, pos, 0, facing);
    }

    public BlockState getStateForPlacement(BlockItemUseContext context) {
        return this.getDefaultState().with(FACING, context.getNearestLookingDirection().getOpposite());
    }

    private boolean isOffset(BlockPos pos) {
        int counter = 0;
        if(Math.abs(pos.getX()) % 2 == 1) counter++;
        if(Math.abs(pos.getY()) % 2 == 1) counter++;
        if(Math.abs(pos.getZ()) % 2 == 1) counter++;
        return counter % 2 == 1;
    }

}