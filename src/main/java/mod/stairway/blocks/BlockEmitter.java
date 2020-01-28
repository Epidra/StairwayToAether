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
import net.minecraft.state.IntegerProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.util.Direction;
import net.minecraft.util.Hand;
import net.minecraft.util.Mirror;
import net.minecraft.util.Rotation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorld;
import net.minecraft.world.IWorldReader;
import net.minecraft.world.World;

import java.util.Random;

public class BlockEmitter extends BlockBlock {

    public static final DirectionProperty FACING = BlockStateProperties.FACING;
    public static final IntegerProperty COLOR = BlockStateProperties.LEVEL_0_15;

    /** Default Constructor */
    public BlockEmitter(String modid, String name, Block block) {
        super(modid, name, block);
        this.setDefaultState(this.stateContainer.getBaseState().with(FACING, Direction.NORTH).with(COLOR, Integer.valueOf(0)));
    }

    protected void fillStateContainer(StateContainer.Builder<Block, BlockState> builder) {
        builder.add(FACING, COLOR);
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
        return 4;
    }

    public void tick(BlockState state, World worldIn, BlockPos pos, Random random) {
        int power = worldIn.getRedstonePowerFromNeighbors(pos);
        Direction facing = state.get(FACING);
        setLightBlocks(state, worldIn, pos, power, facing);
    }

    public void setLightBlocks(BlockState state, World world, BlockPos pos, int power, Direction facing){
        for(int i = 1; i < 17; i++){
            BlockPos blockpos = getOffset(facing, pos, i);
            if(world.isAirBlock(blockpos)){
                if(i < power){
                    world.setBlockState(blockpos, getBlock(state).with(BlockLight.FACING, facing).with(BlockLight.OFFSET, isOffset(blockpos)));
                }
            } else if(world.getBlockState(pos).getBlock() instanceof BlockLight){
                if(world.getBlockState(pos).getBlock() == getBlock(state).getBlock()){
                    if(i > power){
                        world.setBlockState(blockpos, Blocks.AIR.getDefaultState());
                    }
                }
            } else {
                i = 20;
            }
        }
    }

    public boolean onBlockActivated(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockRayTraceResult hit){
        if (world.isRemote) {
            return true;
        } else {
            if(player.getHeldItem(hand).getItem() == Items.BLACK_DYE){ world.setBlockState(pos, state.with(COLOR,  0), 2);  }
            if(player.getHeldItem(hand).getItem() == Items.BLUE_DYE){ world.setBlockState(pos, state.with(COLOR,  1), 2);  }
            if(player.getHeldItem(hand).getItem() == Items.BROWN_DYE){ world.setBlockState(pos, state.with(COLOR,  2), 2);  }
            if(player.getHeldItem(hand).getItem() == Items.CYAN_DYE){ world.setBlockState(pos, state.with(COLOR,  3), 2);  }
            if(player.getHeldItem(hand).getItem() == Items.GRAY_DYE){ world.setBlockState(pos, state.with(COLOR,  4), 2);  }
            if(player.getHeldItem(hand).getItem() == Items.GREEN_DYE){ world.setBlockState(pos, state.with(COLOR,  5), 2);  }
            if(player.getHeldItem(hand).getItem() == Items.LIGHT_BLUE_DYE){ world.setBlockState(pos, state.with(COLOR,  6), 2);  }
            if(player.getHeldItem(hand).getItem() == Items.LIME_DYE){ world.setBlockState(pos, state.with(COLOR,  7), 2);  }
            if(player.getHeldItem(hand).getItem() == Items.MAGENTA_DYE){ world.setBlockState(pos, state.with(COLOR,  8), 2);  }
            if(player.getHeldItem(hand).getItem() == Items.ORANGE_DYE){ world.setBlockState(pos, state.with(COLOR,  9), 2);  }
            if(player.getHeldItem(hand).getItem() == Items.PINK_DYE){ world.setBlockState(pos, state.with(COLOR, 10), 2);  }
            if(player.getHeldItem(hand).getItem() == Items.PURPLE_DYE){ world.setBlockState(pos, state.with(COLOR, 11), 2);  }
            if(player.getHeldItem(hand).getItem() == Items.RED_DYE){ world.setBlockState(pos, state.with(COLOR, 12), 2);  }
            if(player.getHeldItem(hand).getItem() == Items.LIGHT_GRAY_DYE){ world.setBlockState(pos, state.with(COLOR, 13), 2);  }
            if(player.getHeldItem(hand).getItem() == Items.WHITE_DYE){ world.setBlockState(pos, state.with(COLOR, 14), 2);  }
            if(player.getHeldItem(hand).getItem() == Items.YELLOW_DYE){ world.setBlockState(pos, state.with(COLOR, 15), 2);  }
            return true;
        }
    }

    public BlockPos getOffset(Direction facing, BlockPos pos, int i){
        if(facing == Direction.UP)    return pos.add(0, +i, 0);
        if(facing == Direction.DOWN)  return pos.add(0, -i, 0);
        if(facing == Direction.NORTH) return pos.add(+i,  0, 0);
        if(facing == Direction.SOUTH) return pos.add(-i,  0, 0);
        if(facing == Direction.EAST)  return pos.add(0,  0, +i);
        if(facing == Direction.WEST)  return pos.add(0,  0, -i);
        return pos;
    }

    public BlockState getBlock(BlockState state){
        int color = state.get(COLOR);
        switch(color){
            case  0: return StairKeeper.BLOCK_LIGHT_BLACK.getDefaultState();
            case  1: return StairKeeper.BLOCK_LIGHT_BLUE.getDefaultState();
            case  2: return StairKeeper.BLOCK_LIGHT_BROWN.getDefaultState();
            case  3: return StairKeeper.BLOCK_LIGHT_CYAN.getDefaultState();
            case  4: return StairKeeper.BLOCK_LIGHT_GRAY.getDefaultState();
            case  5: return StairKeeper.BLOCK_LIGHT_GREEN.getDefaultState();
            case  6: return StairKeeper.BLOCK_LIGHT_LIGHTBLUE.getDefaultState();
            case  7: return StairKeeper.BLOCK_LIGHT_LIME.getDefaultState();
            case  8: return StairKeeper.BLOCK_LIGHT_MAGENTA.getDefaultState();
            case  9: return StairKeeper.BLOCK_LIGHT_ORANGE.getDefaultState();
            case 10: return StairKeeper.BLOCK_LIGHT_PINK.getDefaultState();
            case 11: return StairKeeper.BLOCK_LIGHT_PURPLE.getDefaultState();
            case 12: return StairKeeper.BLOCK_LIGHT_RED.getDefaultState();
            case 13: return StairKeeper.BLOCK_LIGHT_SILVER.getDefaultState();
            case 14: return StairKeeper.BLOCK_LIGHT_WHITE.getDefaultState();
            case 15: return StairKeeper.BLOCK_LIGHT_YELLOW.getDefaultState();
        }
        return StairKeeper.BLOCK_LIGHT_BLACK.getDefaultState();
    }

    public void onReplaced(BlockState state, World worldIn, BlockPos pos, BlockState newState, boolean isMoving) {
        Direction facing = state.get(FACING);
        setLightBlocks(state, worldIn, pos, 0, facing);
    }

    public BlockState getStateForPlacement(BlockItemUseContext context) {
        return this.getDefaultState().with(FACING, context.getNearestLookingDirection().getOpposite().getOpposite());
    }

    private boolean isOffset(BlockPos pos) {
        int counter = 0;
        if(Math.abs(pos.getX()) % 2 == 1) counter++;
        if(Math.abs(pos.getY()) % 2 == 1) counter++;
        if(Math.abs(pos.getZ()) % 2 == 1) counter++;
        return counter % 2 == 1;
    }

}
