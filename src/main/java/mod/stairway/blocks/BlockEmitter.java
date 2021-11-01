package mod.stairway.blocks;

import mod.lucky77.blocks.MachinaCube;
import mod.lucky77.tileentities.TileBase;
import mod.stairway.StairKeeper;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IWorldReader;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;

import javax.annotation.Nullable;
import java.util.Random;

public class BlockEmitter extends MachinaCube {

    // ...





    //----------------------------------------CONSTRUCTOR----------------------------------------//

    /** Default Constructor */
    public BlockEmitter(Block block) {
        super(block);
    }





    //----------------------------------------PLACEMENT----------------------------------------//

    public void setPlacedBy(World world, BlockPos pos, BlockState state, @Nullable LivingEntity placer, ItemStack stack) {
        int power = world.getBestNeighborSignal(pos);
        Direction facing = state.getValue(FACING);
        setLightBlocks(state, world, pos, power, facing);
    }

    public void onRemove(BlockState state, World worldIn, BlockPos pos, BlockState newState, boolean isMoving) {
        Direction facing = state.getValue(FACING);
        setLightBlocks(state, worldIn, pos, 0, facing);
    }

    public BlockState getStateForPlacement(BlockItemUseContext context) {
        return this.defaultBlockState().setValue(FACING, context.getNearestLookingDirection().getOpposite());
    }





    //----------------------------------------INTERACTION----------------------------------------//

    @Override
    public void interact(World world, BlockPos pos, PlayerEntity player, TileBase tile) {
        if(player.getMainHandItem().getItem() == Items.BLACK_DYE){      world.setBlock(pos, StairKeeper.BLOCK_EMITTER_BLACK.get().defaultBlockState().setValue(     FACING, world.getBlockState(pos).getValue(FACING)), 2);  }
        if(player.getMainHandItem().getItem() == Items.BLUE_DYE){       world.setBlock(pos, StairKeeper.BLOCK_EMITTER_BLUE.get().defaultBlockState().setValue(      FACING, world.getBlockState(pos).getValue(FACING)), 2);  }
        if(player.getMainHandItem().getItem() == Items.BROWN_DYE){      world.setBlock(pos, StairKeeper.BLOCK_EMITTER_BROWN.get().defaultBlockState().setValue(     FACING, world.getBlockState(pos).getValue(FACING)), 2);  }
        if(player.getMainHandItem().getItem() == Items.CYAN_DYE){       world.setBlock(pos, StairKeeper.BLOCK_EMITTER_CYAN.get().defaultBlockState().setValue(      FACING, world.getBlockState(pos).getValue(FACING)), 2);  }
        if(player.getMainHandItem().getItem() == Items.GRAY_DYE){       world.setBlock(pos, StairKeeper.BLOCK_EMITTER_GRAY.get().defaultBlockState().setValue(      FACING, world.getBlockState(pos).getValue(FACING)), 2);  }
        if(player.getMainHandItem().getItem() == Items.GREEN_DYE){      world.setBlock(pos, StairKeeper.BLOCK_EMITTER_GREEN.get().defaultBlockState().setValue(     FACING, world.getBlockState(pos).getValue(FACING)), 2);  }
        if(player.getMainHandItem().getItem() == Items.LIGHT_BLUE_DYE){ world.setBlock(pos, StairKeeper.BLOCK_EMITTER_LIGHT_BLUE.get().defaultBlockState().setValue(FACING, world.getBlockState(pos).getValue(FACING)), 2);  }
        if(player.getMainHandItem().getItem() == Items.LIME_DYE){       world.setBlock(pos, StairKeeper.BLOCK_EMITTER_LIME.get().defaultBlockState().setValue(      FACING, world.getBlockState(pos).getValue(FACING)), 2);  }
        if(player.getMainHandItem().getItem() == Items.MAGENTA_DYE){    world.setBlock(pos, StairKeeper.BLOCK_EMITTER_MAGENTA.get().defaultBlockState().setValue(   FACING, world.getBlockState(pos).getValue(FACING)), 2);  }
        if(player.getMainHandItem().getItem() == Items.ORANGE_DYE){     world.setBlock(pos, StairKeeper.BLOCK_EMITTER_ORANGE.get().defaultBlockState().setValue(    FACING, world.getBlockState(pos).getValue(FACING)), 2);  }
        if(player.getMainHandItem().getItem() == Items.PINK_DYE){       world.setBlock(pos, StairKeeper.BLOCK_EMITTER_PINK.get().defaultBlockState().setValue(      FACING, world.getBlockState(pos).getValue(FACING)), 2);  }
        if(player.getMainHandItem().getItem() == Items.PURPLE_DYE){     world.setBlock(pos, StairKeeper.BLOCK_EMITTER_PURPLE.get().defaultBlockState().setValue(    FACING, world.getBlockState(pos).getValue(FACING)), 2);  }
        if(player.getMainHandItem().getItem() == Items.RED_DYE){        world.setBlock(pos, StairKeeper.BLOCK_EMITTER_RED.get().defaultBlockState().setValue(       FACING, world.getBlockState(pos).getValue(FACING)), 2);  }
        if(player.getMainHandItem().getItem() == Items.LIGHT_GRAY_DYE){ world.setBlock(pos, StairKeeper.BLOCK_EMITTER_LIGHT_GRAY.get().defaultBlockState().setValue(FACING, world.getBlockState(pos).getValue(FACING)), 2);  }
        if(player.getMainHandItem().getItem() == Items.WHITE_DYE){      world.setBlock(pos, StairKeeper.BLOCK_EMITTER_WHITE.get().defaultBlockState().setValue(     FACING, world.getBlockState(pos).getValue(FACING)), 2);  }
        if(player.getMainHandItem().getItem() == Items.YELLOW_DYE){     world.setBlock(pos, StairKeeper.BLOCK_EMITTER_YELLOW.get().defaultBlockState().setValue(    FACING, world.getBlockState(pos).getValue(FACING)), 2);  }
    }





    //----------------------------------------UPDATE----------------------------------------//

    public void tick(BlockState state, ServerWorld worldIn, BlockPos pos, Random rand) {
        int power = worldIn.getBestNeighborSignal(pos);
        Direction facing = state.getValue(FACING);
        setLightBlocks(state, worldIn, pos, power, facing);
    }

    public void neighborChanged(BlockState state, World world, BlockPos pos, Block blockIn, BlockPos fromPos, boolean isMoving) {
        int power = world.getBestNeighborSignal(pos);
        Direction facing = state.getValue(FACING);
        setLightBlocks(state, world, pos, power, facing);
    }





    //----------------------------------------SUPPORT----------------------------------------//

    @Override
    public boolean hasTileEntity(BlockState state) {
        return false;
    }

    private void setLightBlocks(BlockState state, World world, BlockPos pos, int power, Direction facing){
        for(int i = 1; i < 17; i++){
            BlockPos blockpos = getOffset(facing, pos, i);
            if(world.isEmptyBlock(blockpos)){
                if(i < power){
                    world.setBlockAndUpdate(blockpos, getBlock(state).setValue(BlockLight.FACING, facing));
                }
            } else if(world.getBlockState(blockpos).getBlock() instanceof BlockLight){
                if(world.getBlockState(blockpos).getBlock() == getBlock(state).getBlock()){
                    if(i > power){
                        world.setBlockAndUpdate(blockpos, Blocks.AIR.defaultBlockState());
                    }
                } else {
                    if(i < power){
                        world.setBlockAndUpdate(blockpos, getBlock(state).setValue(BlockLight.FACING, facing));
                    }
                }
            } else {
                i = 20;
            }
        }
    }

    private BlockPos getOffset(Direction facing, BlockPos pos, int i){
        if(facing == Direction.UP)    return pos.offset( 0, +i,  0);
        if(facing == Direction.DOWN)  return pos.offset( 0, -i,  0);
        if(facing == Direction.NORTH) return pos.offset( 0,  0, -i);
        if(facing == Direction.SOUTH) return pos.offset( 0,  0, +i);
        if(facing == Direction.EAST)  return pos.offset(+i,  0,  0);
        if(facing == Direction.WEST)  return pos.offset(-i,  0,  0);
        return pos;
    }

    private BlockState getBlock(BlockState state){
        if(state.getBlock() == StairKeeper.BLOCK_EMITTER_BLACK.get())      return StairKeeper.BLOCK_LIGHT_BLACK.get().defaultBlockState();
        if(state.getBlock() == StairKeeper.BLOCK_EMITTER_BLUE.get())       return StairKeeper.BLOCK_LIGHT_BLUE.get().defaultBlockState();
        if(state.getBlock() == StairKeeper.BLOCK_EMITTER_BROWN.get())      return StairKeeper.BLOCK_LIGHT_BROWN.get().defaultBlockState();
        if(state.getBlock() == StairKeeper.BLOCK_EMITTER_CYAN.get())       return StairKeeper.BLOCK_LIGHT_CYAN.get().defaultBlockState();
        if(state.getBlock() == StairKeeper.BLOCK_EMITTER_GRAY.get())       return StairKeeper.BLOCK_LIGHT_GRAY.get().defaultBlockState();
        if(state.getBlock() == StairKeeper.BLOCK_EMITTER_GREEN.get())      return StairKeeper.BLOCK_LIGHT_GREEN.get().defaultBlockState();
        if(state.getBlock() == StairKeeper.BLOCK_EMITTER_LIGHT_BLUE.get()) return StairKeeper.BLOCK_LIGHT_LIGHT_BLUE.get().defaultBlockState();
        if(state.getBlock() == StairKeeper.BLOCK_EMITTER_LIME.get())       return StairKeeper.BLOCK_LIGHT_LIME.get().defaultBlockState();
        if(state.getBlock() == StairKeeper.BLOCK_EMITTER_MAGENTA.get())    return StairKeeper.BLOCK_LIGHT_MAGENTA.get().defaultBlockState();
        if(state.getBlock() == StairKeeper.BLOCK_EMITTER_ORANGE.get())     return StairKeeper.BLOCK_LIGHT_ORANGE.get().defaultBlockState();
        if(state.getBlock() == StairKeeper.BLOCK_EMITTER_PINK.get())       return StairKeeper.BLOCK_LIGHT_PINK.get().defaultBlockState();
        if(state.getBlock() == StairKeeper.BLOCK_EMITTER_PURPLE.get())     return StairKeeper.BLOCK_LIGHT_PURPLE.get().defaultBlockState();
        if(state.getBlock() == StairKeeper.BLOCK_EMITTER_RED.get())        return StairKeeper.BLOCK_LIGHT_RED.get().defaultBlockState();
        if(state.getBlock() == StairKeeper.BLOCK_EMITTER_LIGHT_GRAY.get()) return StairKeeper.BLOCK_LIGHT_LIGHT_GRAY.get().defaultBlockState();
        if(state.getBlock() == StairKeeper.BLOCK_EMITTER_WHITE.get())      return StairKeeper.BLOCK_LIGHT_WHITE.get().defaultBlockState();
        if(state.getBlock() == StairKeeper.BLOCK_EMITTER_YELLOW.get())     return StairKeeper.BLOCK_LIGHT_YELLOW.get().defaultBlockState();
        return StairKeeper.BLOCK_LIGHT_BLACK.get().defaultBlockState();
    }



}
