package mod.stairway.blocks;

import mod.stairway.StairKeeper;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.state.DirectionProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.util.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.world.IWorldReader;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;

import javax.annotation.Nullable;
import java.util.Random;

public class BlockEmitter extends BlockBlock {

    public static final DirectionProperty FACING = BlockStateProperties.FACING;




    //----------------------------------------CONSTRUCTOR----------------------------------------//

    /** Default Constructor */
    public BlockEmitter(Block block) {
        super(Properties.from(block).tickRandomly());
        this.setDefaultState(this.stateContainer.getBaseState().with(FACING, Direction.NORTH));
    }




    //----------------------------------------PLACEMENT----------------------------------------//

    public void onBlockPlacedBy(World world, BlockPos pos, BlockState state, @Nullable LivingEntity placer, ItemStack stack) {
        int power = world.getRedstonePowerFromNeighbors(pos);
        Direction facing = state.get(FACING);
        setLightBlocks(state, world, pos, power, facing);
    }

    public void onReplaced(BlockState state, World worldIn, BlockPos pos, BlockState newState, boolean isMoving) {
        Direction facing = state.get(FACING);
        setLightBlocks(state, worldIn, pos, 0, facing);
    }

    public BlockState getStateForPlacement(BlockItemUseContext context) {
        return this.getDefaultState().with(FACING, context.getNearestLookingDirection().getOpposite());
    }




    //----------------------------------------INTERACTION----------------------------------------//

    public boolean onBlockActivated(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockRayTraceResult hit){
        if (world.isRemote || hand == Hand.OFF_HAND) {
            return true;
        } else {
            if(player.getHeldItem(hand).getItem() == Items.BLACK_DYE){      world.setBlockState(pos, StairKeeper.BLOCK_EMITTER_BLACK.get().getDefaultState().with(     FACING, state.get(FACING)), 2);  }
            if(player.getHeldItem(hand).getItem() == Items.BLUE_DYE){       world.setBlockState(pos, StairKeeper.BLOCK_EMITTER_BLUE.get().getDefaultState().with(      FACING, state.get(FACING)), 2);  }
            if(player.getHeldItem(hand).getItem() == Items.BROWN_DYE){      world.setBlockState(pos, StairKeeper.BLOCK_EMITTER_BROWN.get().getDefaultState().with(     FACING, state.get(FACING)), 2);  }
            if(player.getHeldItem(hand).getItem() == Items.CYAN_DYE){       world.setBlockState(pos, StairKeeper.BLOCK_EMITTER_CYAN.get().getDefaultState().with(      FACING, state.get(FACING)), 2);  }
            if(player.getHeldItem(hand).getItem() == Items.GRAY_DYE){       world.setBlockState(pos, StairKeeper.BLOCK_EMITTER_GRAY.get().getDefaultState().with(      FACING, state.get(FACING)), 2);  }
            if(player.getHeldItem(hand).getItem() == Items.GREEN_DYE){      world.setBlockState(pos, StairKeeper.BLOCK_EMITTER_GREEN.get().getDefaultState().with(     FACING, state.get(FACING)), 2);  }
            if(player.getHeldItem(hand).getItem() == Items.LIGHT_BLUE_DYE){ world.setBlockState(pos, StairKeeper.BLOCK_EMITTER_LIGHT_BLUE.get().getDefaultState().with(FACING, state.get(FACING)), 2);  }
            if(player.getHeldItem(hand).getItem() == Items.LIME_DYE){       world.setBlockState(pos, StairKeeper.BLOCK_EMITTER_LIME.get().getDefaultState().with(      FACING, state.get(FACING)), 2);  }
            if(player.getHeldItem(hand).getItem() == Items.MAGENTA_DYE){    world.setBlockState(pos, StairKeeper.BLOCK_EMITTER_MAGENTA.get().getDefaultState().with(   FACING, state.get(FACING)), 2);  }
            if(player.getHeldItem(hand).getItem() == Items.ORANGE_DYE){     world.setBlockState(pos, StairKeeper.BLOCK_EMITTER_ORANGE.get().getDefaultState().with(    FACING, state.get(FACING)), 2);  }
            if(player.getHeldItem(hand).getItem() == Items.PINK_DYE){       world.setBlockState(pos, StairKeeper.BLOCK_EMITTER_PINK.get().getDefaultState().with(      FACING, state.get(FACING)), 2);  }
            if(player.getHeldItem(hand).getItem() == Items.PURPLE_DYE){     world.setBlockState(pos, StairKeeper.BLOCK_EMITTER_PURPLE.get().getDefaultState().with(    FACING, state.get(FACING)), 2);  }
            if(player.getHeldItem(hand).getItem() == Items.RED_DYE){        world.setBlockState(pos, StairKeeper.BLOCK_EMITTER_RED.get().getDefaultState().with(       FACING, state.get(FACING)), 2);  }
            if(player.getHeldItem(hand).getItem() == Items.LIGHT_GRAY_DYE){ world.setBlockState(pos, StairKeeper.BLOCK_EMITTER_LIGHT_GRAY.get().getDefaultState().with(FACING, state.get(FACING)), 2);  }
            if(player.getHeldItem(hand).getItem() == Items.WHITE_DYE){      world.setBlockState(pos, StairKeeper.BLOCK_EMITTER_WHITE.get().getDefaultState().with(     FACING, state.get(FACING)), 2);  }
            if(player.getHeldItem(hand).getItem() == Items.YELLOW_DYE){     world.setBlockState(pos, StairKeeper.BLOCK_EMITTER_YELLOW.get().getDefaultState().with(    FACING, state.get(FACING)), 2);  }
            return true;
        }
    }




    //----------------------------------------UPDATE----------------------------------------//

    /** How many world ticks before ticking */
    public int tickRate(IWorldReader worldIn) {
        return 1;
    }

    public void tick(BlockState state, ServerWorld worldIn, BlockPos pos, Random rand) {
        int power = worldIn.getRedstonePowerFromNeighbors(pos);
        Direction facing = state.get(FACING);
        setLightBlocks(state, worldIn, pos, power, facing);
    }

    public void neighborChanged(BlockState state, World world, BlockPos pos, Block blockIn, BlockPos fromPos, boolean isMoving) {
        int power = world.getRedstonePowerFromNeighbors(pos);
        Direction facing = state.get(FACING);
        setLightBlocks(state, world, pos, power, facing);
    }




    //----------------------------------------SUPPORT----------------------------------------//

    protected void fillStateContainer(StateContainer.Builder<Block, BlockState> builder) {
        builder.add(FACING);
    }

    public BlockState rotate(BlockState state, Rotation rot) {
        return state.with(FACING, rot.rotate(state.get(FACING)));
    }

    public BlockState mirror(BlockState state, Mirror mirrorIn) {
        return state.rotate(mirrorIn.toRotation(state.get(FACING)));
    }

    private void setLightBlocks(BlockState state, World world, BlockPos pos, int power, Direction facing){
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
                } else {
                    if(i < power){
                        world.setBlockState(blockpos, getBlock(state).with(BlockLight.FACING, facing));
                    }
                }
            } else {
                i = 20;
            }
        }
    }

    private BlockPos getOffset(Direction facing, BlockPos pos, int i){
        if(facing == Direction.UP)    return pos.add( 0, +i,  0);
        if(facing == Direction.DOWN)  return pos.add( 0, -i,  0);
        if(facing == Direction.NORTH) return pos.add( 0,  0, -i);
        if(facing == Direction.SOUTH) return pos.add( 0,  0, +i);
        if(facing == Direction.EAST)  return pos.add(+i,  0,  0);
        if(facing == Direction.WEST)  return pos.add(-i,  0,  0);
        return pos;
    }

    private BlockState getBlock(BlockState state){
        if(state.getBlock() == StairKeeper.BLOCK_EMITTER_BLACK.get())      return StairKeeper.BLOCK_LIGHT_BLACK.get().getDefaultState();
        if(state.getBlock() == StairKeeper.BLOCK_EMITTER_BLUE.get())       return StairKeeper.BLOCK_LIGHT_BLUE.get().getDefaultState();
        if(state.getBlock() == StairKeeper.BLOCK_EMITTER_BROWN.get())      return StairKeeper.BLOCK_LIGHT_BROWN.get().getDefaultState();
        if(state.getBlock() == StairKeeper.BLOCK_EMITTER_CYAN.get())       return StairKeeper.BLOCK_LIGHT_CYAN.get().getDefaultState();
        if(state.getBlock() == StairKeeper.BLOCK_EMITTER_GRAY.get())       return StairKeeper.BLOCK_LIGHT_GRAY.get().getDefaultState();
        if(state.getBlock() == StairKeeper.BLOCK_EMITTER_GREEN.get())      return StairKeeper.BLOCK_LIGHT_GREEN.get().getDefaultState();
        if(state.getBlock() == StairKeeper.BLOCK_EMITTER_LIGHT_BLUE.get()) return StairKeeper.BLOCK_LIGHT_LIGHT_BLUE.get().getDefaultState();
        if(state.getBlock() == StairKeeper.BLOCK_EMITTER_LIME.get())       return StairKeeper.BLOCK_LIGHT_LIME.get().getDefaultState();
        if(state.getBlock() == StairKeeper.BLOCK_EMITTER_MAGENTA.get())    return StairKeeper.BLOCK_LIGHT_MAGENTA.get().getDefaultState();
        if(state.getBlock() == StairKeeper.BLOCK_EMITTER_ORANGE.get())     return StairKeeper.BLOCK_LIGHT_ORANGE.get().getDefaultState();
        if(state.getBlock() == StairKeeper.BLOCK_EMITTER_PINK.get())       return StairKeeper.BLOCK_LIGHT_PINK.get().getDefaultState();
        if(state.getBlock() == StairKeeper.BLOCK_EMITTER_PURPLE.get())     return StairKeeper.BLOCK_LIGHT_PURPLE.get().getDefaultState();
        if(state.getBlock() == StairKeeper.BLOCK_EMITTER_RED.get())        return StairKeeper.BLOCK_LIGHT_RED.get().getDefaultState();
        if(state.getBlock() == StairKeeper.BLOCK_EMITTER_LIGHT_GRAY.get()) return StairKeeper.BLOCK_LIGHT_LIGHT_GRAY.get().getDefaultState();
        if(state.getBlock() == StairKeeper.BLOCK_EMITTER_WHITE.get())      return StairKeeper.BLOCK_LIGHT_WHITE.get().getDefaultState();
        if(state.getBlock() == StairKeeper.BLOCK_EMITTER_YELLOW.get())     return StairKeeper.BLOCK_LIGHT_YELLOW.get().getDefaultState();
        return StairKeeper.BLOCK_LIGHT_BLACK.get().getDefaultState();
    }



}
