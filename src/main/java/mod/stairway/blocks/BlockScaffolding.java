package mod.stairway.blocks;

import mod.shared.blocks.BlockBlock;
import mod.stairway.StairKeeper;
import net.minecraft.block.*;
import net.minecraft.entity.LivingEntity;
import net.minecraft.fluid.Fluid;
import net.minecraft.fluid.Fluids;
import net.minecraft.fluid.IFluidState;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.pathfinding.PathType;
import net.minecraft.state.DirectionProperty;
import net.minecraft.state.IntegerProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.tags.FluidTags;
import net.minecraft.util.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorld;
import net.minecraft.world.World;

import java.util.Random;

public class BlockScaffolding extends BlockBlock implements IWaterLoggable {

    public static final DirectionProperty FACING = HorizontalBlock.HORIZONTAL_FACING;
    public static final IntegerProperty ROTATION = BlockStateProperties.ROTATION_0_15;
    public static final net.minecraft.state.BooleanProperty WATERLOGGED = BlockStateProperties.WATERLOGGED;

    public static final VoxelShape AABB_A = Block.makeCuboidShape(5, 0, 5, 11, 16, 11);
    public static final VoxelShape AABB_B = Block.makeCuboidShape(5, 0, 5, 11, 16, 16);
    public static final VoxelShape AABB_C = Block.makeCuboidShape(5, 0, 5, 16, 16, 11);
    public static final VoxelShape AABB_D = Block.makeCuboidShape(0, 0, 5, 11, 16, 11);
    public static final VoxelShape AABB_E = Block.makeCuboidShape(5, 0, 0, 11, 16, 11);
    public static final VoxelShape AABB_F = Block.makeCuboidShape(0, 0, 5, 16, 16, 11);
    public static final VoxelShape AABB_G = Block.makeCuboidShape(5, 0, 0, 11, 16, 16);
    public static final VoxelShape AABB_H = Block.makeCuboidShape(5, 0, 5, 16, 16, 16);
    public static final VoxelShape AABB_I = Block.makeCuboidShape(0, 0, 5, 11, 16, 16);
    public static final VoxelShape AABB_J = Block.makeCuboidShape(0, 0, 0, 11, 16, 11);
    public static final VoxelShape AABB_K = Block.makeCuboidShape(5, 0, 0, 16, 16, 11);
    public static final VoxelShape AABB_L = Block.makeCuboidShape(0, 0, 5, 16, 16, 16);
    public static final VoxelShape AABB_M = Block.makeCuboidShape(5, 0, 0, 16, 16, 16);
    public static final VoxelShape AABB_N = Block.makeCuboidShape(0, 0, 0, 11, 16, 16);
    public static final VoxelShape AABB_O = Block.makeCuboidShape(0, 0, 0, 16, 16, 11);
    public static final VoxelShape AABB_P = Block.makeCuboidShape(0, 0, 0, 16, 16, 16);



    //----------------------------------------CONSTRUCTOR----------------------------------------//

    /** Default Constructor */
    public BlockScaffolding(String modid, String name, Block block) {
        super(modid, name, block);
        this.setDefaultState(this.stateContainer.getBaseState().with(FACING, Direction.NORTH).with(ROTATION, 0).with(WATERLOGGED, false));
    }



    //----------------------------------------RENDER----------------------------------------//

    public BlockRenderType getRenderType(BlockState state) {
        return BlockRenderType.MODEL;
    }

    public BlockState getStateForPlacement(BlockItemUseContext context) {
        return this.getDefaultState().with(FACING, context.getPlacementHorizontalFacing().getOpposite());
    }

    public BlockRenderLayer getRenderLayer() {
        return BlockRenderLayer.CUTOUT_MIPPED;
    }

    @Deprecated
    public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {
        int color = state.get(ROTATION);
        Direction      direc = state.get(FACING);

        if(color ==  0 && direc == Direction.NORTH) return AABB_P;
        if(color ==  1 && direc == Direction.NORTH) return AABB_P;
        if(color ==  1 && direc == Direction.EAST ) return AABB_P;
        if(color ==  1 && direc == Direction.SOUTH) return AABB_P;
        if(color ==  1 && direc == Direction.WEST ) return AABB_P;
        if(color ==  2 && direc == Direction.NORTH) return AABB_P;
        if(color ==  2 && direc == Direction.EAST ) return AABB_P;
        if(color ==  3 && direc == Direction.NORTH) return AABB_P;
        if(color ==  3 && direc == Direction.EAST ) return AABB_P;
        if(color ==  3 && direc == Direction.SOUTH) return AABB_P;
        if(color ==  3 && direc == Direction.WEST ) return AABB_P;
        if(color ==  4 && direc == Direction.NORTH) return AABB_P;
        if(color ==  4 && direc == Direction.EAST ) return AABB_P;
        if(color ==  4 && direc == Direction.SOUTH) return AABB_P;
        if(color ==  4 && direc == Direction.WEST ) return AABB_P;
        if(color ==  5 && direc == Direction.NORTH) return AABB_O;
        if(color ==  5 && direc == Direction.EAST ) return AABB_M;
        if(color ==  5 && direc == Direction.SOUTH) return AABB_L;
        if(color ==  5 && direc == Direction.WEST ) return AABB_N;
        if(color ==  6 && direc == Direction.NORTH) return AABB_M;
        if(color ==  6 && direc == Direction.EAST ) return AABB_L;
        if(color ==  6 && direc == Direction.SOUTH) return AABB_N;
        if(color ==  6 && direc == Direction.WEST ) return AABB_O;
        if(color ==  7 && direc == Direction.NORTH) return AABB_L;
        if(color ==  7 && direc == Direction.EAST ) return AABB_N;
        if(color ==  7 && direc == Direction.SOUTH) return AABB_O;
        if(color ==  7 && direc == Direction.WEST ) return AABB_M;
        if(color ==  8 && direc == Direction.NORTH) return AABB_K;
        if(color ==  8 && direc == Direction.EAST ) return AABB_H;
        if(color ==  8 && direc == Direction.SOUTH) return AABB_I;
        if(color ==  8 && direc == Direction.WEST ) return AABB_J;
        if(color ==  9 && direc == Direction.NORTH) return AABB_P;
        if(color == 10 && direc == Direction.NORTH) return AABB_O;
        if(color == 10 && direc == Direction.EAST ) return AABB_M;
        if(color == 10 && direc == Direction.SOUTH) return AABB_L;
        if(color == 10 && direc == Direction.WEST ) return AABB_N;
        if(color == 11 && direc == Direction.NORTH) return AABB_K;
        if(color == 11 && direc == Direction.EAST ) return AABB_H;
        if(color == 11 && direc == Direction.SOUTH) return AABB_I;
        if(color == 11 && direc == Direction.WEST ) return AABB_J;
        if(color == 12 && direc == Direction.NORTH) return AABB_G;
        if(color == 12 && direc == Direction.EAST ) return AABB_F;
        if(color == 13 && direc == Direction.NORTH) return AABB_E;
        if(color == 13 && direc == Direction.EAST ) return AABB_C;
        if(color == 13 && direc == Direction.SOUTH) return AABB_B;
        if(color == 13 && direc == Direction.WEST ) return AABB_D;
        return AABB_A;
    }



    //----------------------------------------SUPPORT----------------------------------------//

    public BlockState rotate(BlockState state, Rotation rot) {
        return state.with(FACING, rot.rotate(state.get(FACING)));
    }

    public BlockState mirror(BlockState state, Mirror mirrorIn) {
        return state.rotate(mirrorIn.toRotation(state.get(FACING)));
    }

    protected void fillStateContainer(StateContainer.Builder<Block, BlockState> builder) {
        builder.add(ROTATION, FACING, WATERLOGGED);
    }

    public boolean isLadder(BlockState state, net.minecraft.world.IWorldReader world, BlockPos pos, LivingEntity entity) {
        return true;
    }

    public void onBlockPlacedBy(World worldIn, BlockPos pos, BlockState state, LivingEntity placer, ItemStack stack){
        SearchNeighbour(worldIn, pos);
    }

    @Deprecated
    public void neighborChanged(BlockState state, World world, BlockPos pos, Block blockIn, BlockPos fromPos, boolean isMoving) {
        SearchNeighbour(world, pos);
    }

    public void SearchNeighbour(World world, BlockPos pos){
        boolean nn = !world.isAirBlock(pos.north()       );
        boolean ne = !world.isAirBlock(pos.north().east());
        boolean ee = !world.isAirBlock(pos.        east());
        boolean se = !world.isAirBlock(pos.south().east());
        boolean ss = !world.isAirBlock(pos.south()       );
        boolean sw = !world.isAirBlock(pos.south().west());
        boolean ww = !world.isAirBlock(pos.        west());
        boolean nw = !world.isAirBlock(pos.north().west());

        int color = world.getBlockState(pos).get(ROTATION);
        Direction      direc = world.getBlockState(pos).get(FACING);

        if(nn && ne && ee && se && ss && sw && ww && nw){ world.setBlockState(pos, world.getBlockState(pos).with(ROTATION, Integer.valueOf(0))     .with(FACING, Direction.NORTH), 2); if(color !=  0 || direc != Direction.NORTH) UpdateNeighbours(world, pos); } // XXX
        // XXX
        // XXX
        else if(nn && ne && ee && se && ss && sw && ww      ){ world.setBlockState(pos, world.getBlockState(pos).with(ROTATION, Integer.valueOf(1)).with(FACING, Direction.NORTH), 2); if(color !=  1 || direc != Direction.NORTH) UpdateNeighbours(world, pos); } // 'XX
        else if(nn       && ee && se && ss && sw && ww && nw){ world.setBlockState(pos, world.getBlockState(pos).with(ROTATION, Integer.valueOf(1)).with(FACING, Direction.EAST) , 2); if(color !=  1 || direc != Direction.EAST ) UpdateNeighbours(world, pos); } // XXX
        else if(nn && ne && ee       && ss && sw && ww && nw){ world.setBlockState(pos, world.getBlockState(pos).with(ROTATION, Integer.valueOf(1)).with(FACING, Direction.SOUTH), 2); if(color !=  1 || direc != Direction.SOUTH) UpdateNeighbours(world, pos); } // XXX
        else if(nn && ne && ee && se && ss &&       ww && nw){ world.setBlockState(pos, world.getBlockState(pos).with(ROTATION, Integer.valueOf(1)).with(FACING, Direction.WEST) , 2); if(color !=  1 || direc != Direction.WEST ) UpdateNeighbours(world, pos); }
        else if(nn &&       ee && se && ss &&       ww && nw){ world.setBlockState(pos, world.getBlockState(pos).with(ROTATION, Integer.valueOf(2)).with(FACING, Direction.NORTH), 2); if(color !=  2 || direc != Direction.NORTH) UpdateNeighbours(world, pos); } // XX'
        else if(nn && ne && ee       && ss && sw && ww      ){ world.setBlockState(pos, world.getBlockState(pos).with(ROTATION, Integer.valueOf(2)).with(FACING, Direction.EAST) , 2); if(color !=  2 || direc != Direction.EAST ) UpdateNeighbours(world, pos); } // XXX
        // 'XX
        else if(nn       && ee && se && ss && sw && ww      ){ world.setBlockState(pos, world.getBlockState(pos).with(ROTATION, Integer.valueOf(3)).with(FACING, Direction.NORTH), 2); if(color !=  3 || direc != Direction.NORTH) UpdateNeighbours(world, pos); } // 'X'
        else if(nn       && ee &&       ss && sw && ww && nw){ world.setBlockState(pos, world.getBlockState(pos).with(ROTATION, Integer.valueOf(3)).with(FACING, Direction.EAST) , 2); if(color !=  3 || direc != Direction.EAST ) UpdateNeighbours(world, pos); } // XXX
        else if(nn && ne && ee &&       ss &&       ww && nw){ world.setBlockState(pos, world.getBlockState(pos).with(ROTATION, Integer.valueOf(3)).with(FACING, Direction.SOUTH), 2); if(color !=  3 || direc != Direction.SOUTH) UpdateNeighbours(world, pos); } // XXX
        else if(nn && ne && ee && se && ss &&       ww      ){ world.setBlockState(pos, world.getBlockState(pos).with(ROTATION, Integer.valueOf(3)).with(FACING, Direction.WEST) , 2); if(color !=  3 || direc != Direction.WEST ) UpdateNeighbours(world, pos); }
        else if(nn       && ee && se && ss &&       ww      ){ world.setBlockState(pos, world.getBlockState(pos).with(ROTATION, Integer.valueOf(4)).with(FACING, Direction.NORTH), 2); if(color !=  4 || direc != Direction.NORTH) UpdateNeighbours(world, pos); } // 'X'
        else if(nn       && ee &&       ss && sw && ww      ){ world.setBlockState(pos, world.getBlockState(pos).with(ROTATION, Integer.valueOf(4)).with(FACING, Direction.EAST) , 2); if(color !=  4 || direc != Direction.EAST ) UpdateNeighbours(world, pos); } // XXX
        else if(nn       && ee &&       ss &&       ww && nw){ world.setBlockState(pos, world.getBlockState(pos).with(ROTATION, Integer.valueOf(4)).with(FACING, Direction.SOUTH), 2); if(color !=  4 || direc != Direction.SOUTH) UpdateNeighbours(world, pos); } // 'XX
        else if(nn && ne && ee &&       ss &&       ww      ){ world.setBlockState(pos, world.getBlockState(pos).with(ROTATION, Integer.valueOf(4)).with(FACING, Direction.WEST) , 2); if(color !=  4 || direc != Direction.WEST ) UpdateNeighbours(world, pos); }
        else if(nn && ne && ee &&                   ww && nw){ world.setBlockState(pos, world.getBlockState(pos).with(ROTATION, Integer.valueOf(5)).with(FACING, Direction.NORTH), 2); if(color !=  5 || direc != Direction.NORTH) UpdateNeighbours(world, pos); } // XXX
        else if(nn && ne && ee && se && ss                  ){ world.setBlockState(pos, world.getBlockState(pos).with(ROTATION, Integer.valueOf(5)).with(FACING, Direction.EAST) , 2); if(color !=  5 || direc != Direction.EAST ) UpdateNeighbours(world, pos); } // XXX
        else if(            ee && se && ss && sw && ww      ){ world.setBlockState(pos, world.getBlockState(pos).with(ROTATION, Integer.valueOf(5)).with(FACING, Direction.SOUTH), 2); if(color !=  5 || direc != Direction.SOUTH) UpdateNeighbours(world, pos); } // '''
        else if(nn       &&             ss && sw && ww && nw){ world.setBlockState(pos, world.getBlockState(pos).with(ROTATION, Integer.valueOf(5)).with(FACING, Direction.WEST) , 2); if(color !=  5 || direc != Direction.WEST ) UpdateNeighbours(world, pos); }
        else if(nn       && ee && se && ss                  ){ world.setBlockState(pos, world.getBlockState(pos).with(ROTATION, Integer.valueOf(6)).with(FACING, Direction.NORTH), 2); if(color !=  6 || direc != Direction.NORTH) UpdateNeighbours(world, pos); } // 'X'
        else if(            ee &&       ss && sw && ww      ){ world.setBlockState(pos, world.getBlockState(pos).with(ROTATION, Integer.valueOf(6)).with(FACING, Direction.EAST) , 2); if(color !=  6 || direc != Direction.EAST ) UpdateNeighbours(world, pos); } // 'XX
        else if(nn       &&             ss &&       ww && nw){ world.setBlockState(pos, world.getBlockState(pos).with(ROTATION, Integer.valueOf(6)).with(FACING, Direction.SOUTH), 2); if(color !=  6 || direc != Direction.SOUTH) UpdateNeighbours(world, pos); } // 'XX
        else if(nn && ne && ee                   && ww      ){ world.setBlockState(pos, world.getBlockState(pos).with(ROTATION, Integer.valueOf(6)).with(FACING, Direction.WEST) , 2); if(color !=  6 || direc != Direction.WEST ) UpdateNeighbours(world, pos); }
        else if(            ee && se && ss &&       ww      ){ world.setBlockState(pos, world.getBlockState(pos).with(ROTATION, Integer.valueOf(7)).with(FACING, Direction.NORTH), 2); if(color !=  7 || direc != Direction.NORTH) UpdateNeighbours(world, pos); } // '''
        else if(nn       &&             ss && sw && ww      ){ world.setBlockState(pos, world.getBlockState(pos).with(ROTATION, Integer.valueOf(7)).with(FACING, Direction.EAST) , 2); if(color !=  7 || direc != Direction.EAST ) UpdateNeighbours(world, pos); } // XXX
        else if(nn       && ee &&                   ww && nw){ world.setBlockState(pos, world.getBlockState(pos).with(ROTATION, Integer.valueOf(7)).with(FACING, Direction.SOUTH), 2); if(color !=  7 || direc != Direction.SOUTH) UpdateNeighbours(world, pos); } // 'XX
        else if(nn && ne && ee &&       ss                  ){ world.setBlockState(pos, world.getBlockState(pos).with(ROTATION, Integer.valueOf(7)).with(FACING, Direction.WEST) , 2); if(color !=  7 || direc != Direction.WEST ) UpdateNeighbours(world, pos); }
        else if(nn && ne && ee                              ){ world.setBlockState(pos, world.getBlockState(pos).with(ROTATION, Integer.valueOf(8)).with(FACING, Direction.NORTH), 2); if(color !=  8 || direc != Direction.NORTH) UpdateNeighbours(world, pos); } // 'XX
        else if(            ee && se && ss                  ){ world.setBlockState(pos, world.getBlockState(pos).with(ROTATION, Integer.valueOf(8)).with(FACING, Direction.EAST) , 2); if(color !=  8 || direc != Direction.EAST ) UpdateNeighbours(world, pos); } // 'XX
        else if(                        ss && sw && ww      ){ world.setBlockState(pos, world.getBlockState(pos).with(ROTATION, Integer.valueOf(8)).with(FACING, Direction.SOUTH), 2); if(color !=  8 || direc != Direction.SOUTH) UpdateNeighbours(world, pos); } // '''
        else if(nn &&                               ww && nw){ world.setBlockState(pos, world.getBlockState(pos).with(ROTATION, Integer.valueOf(8)).with(FACING, Direction.WEST) , 2); if(color !=  8 || direc != Direction.WEST ) UpdateNeighbours(world, pos); }
        else if(nn &&       ee &&       ss &&       ww      ){ world.setBlockState(pos, world.getBlockState(pos).with(ROTATION, Integer.valueOf(9)).with(FACING, Direction.NORTH), 2); if(color !=  9 || direc != Direction.NORTH) UpdateNeighbours(world, pos); } // 'X'
        // XXX
        // 'X'
        else if(nn &&       ee &&                   ww      ){ world.setBlockState(pos, world.getBlockState(pos).with(ROTATION, Integer.valueOf(10)).with(FACING, Direction.NORTH), 2); if(color != 10 || direc != Direction.NORTH) UpdateNeighbours(world, pos); } // 'X'
        else if(nn &&       ee &&       ss                  ){ world.setBlockState(pos, world.getBlockState(pos).with(ROTATION, Integer.valueOf(10)).with(FACING, Direction.EAST) , 2); if(color != 10 || direc != Direction.EAST ) UpdateNeighbours(world, pos); } // XXX
        else if(            ee &&       ss &&       ww      ){ world.setBlockState(pos, world.getBlockState(pos).with(ROTATION, Integer.valueOf(10)).with(FACING, Direction.SOUTH), 2); if(color != 10 || direc != Direction.SOUTH) UpdateNeighbours(world, pos); } // '''
        else if(nn &&                   ss &&       ww      ){ world.setBlockState(pos, world.getBlockState(pos).with(ROTATION, Integer.valueOf(10)).with(FACING, Direction.WEST) , 2); if(color != 10 || direc != Direction.WEST ) UpdateNeighbours(world, pos); }
        else if(nn &&       ee                              ){ world.setBlockState(pos, world.getBlockState(pos).with(ROTATION, Integer.valueOf(11)).with(FACING, Direction.NORTH), 2); if(color != 11 || direc != Direction.NORTH) UpdateNeighbours(world, pos); } // 'X'
        else if(            ee &&       ss                  ){ world.setBlockState(pos, world.getBlockState(pos).with(ROTATION, Integer.valueOf(11)).with(FACING, Direction.EAST) , 2); if(color != 11 || direc != Direction.EAST ) UpdateNeighbours(world, pos); } // 'XX
        else if(                        ss &&       ww      ){ world.setBlockState(pos, world.getBlockState(pos).with(ROTATION, Integer.valueOf(11)).with(FACING, Direction.SOUTH), 2); if(color != 11 || direc != Direction.SOUTH) UpdateNeighbours(world, pos); } // '''
        else if(nn &&                               ww      ){ world.setBlockState(pos, world.getBlockState(pos).with(ROTATION, Integer.valueOf(11)).with(FACING, Direction.WEST) , 2); if(color != 11 || direc != Direction.WEST ) UpdateNeighbours(world, pos); }
        else if(nn &&                   ss                  ){ world.setBlockState(pos, world.getBlockState(pos).with(ROTATION, Integer.valueOf(12)).with(FACING, Direction.NORTH), 2); if(color != 12 || direc != Direction.NORTH) UpdateNeighbours(world, pos); } // 'X'
        else if(            ee &&                   ww      ){ world.setBlockState(pos, world.getBlockState(pos).with(ROTATION, Integer.valueOf(12)).with(FACING, Direction.EAST) , 2); if(color != 12 || direc != Direction.EAST ) UpdateNeighbours(world, pos); } // 'X'
        // 'X'
        else if(nn                                          ){ world.setBlockState(pos, world.getBlockState(pos).with(ROTATION, Integer.valueOf(13)).with(FACING, Direction.NORTH), 2); if(color != 13 || direc != Direction.NORTH) UpdateNeighbours(world, pos); } // 'X'
        else if(            ee                              ){ world.setBlockState(pos, world.getBlockState(pos).with(ROTATION, Integer.valueOf(13)).with(FACING, Direction.EAST) , 2); if(color != 13 || direc != Direction.EAST ) UpdateNeighbours(world, pos); } // 'X'
        else if(                        ss                  ){ world.setBlockState(pos, world.getBlockState(pos).with(ROTATION, Integer.valueOf(13)).with(FACING, Direction.SOUTH), 2); if(color != 13 || direc != Direction.SOUTH) UpdateNeighbours(world, pos); } // '''
        else if(                                    ww      ){ world.setBlockState(pos, world.getBlockState(pos).with(ROTATION, Integer.valueOf(13)).with(FACING, Direction.WEST) , 2); if(color != 13 || direc != Direction.WEST ) UpdateNeighbours(world, pos); }
        else { world.setBlockState(pos, world.getBlockState(pos).with(ROTATION, Integer.valueOf(14)).with(FACING, Direction.NORTH), 2); }
        // '''
        // 'X'
        // '''
    }

    private void UpdateNeighbours(World world, BlockPos pos){
        if(world.getBlockState(pos.north()).getBlock() == StairKeeper.BLOCK_SCAFFOLDING) SearchNeighbour(world, pos.north());
        if(world.getBlockState(pos.east ()).getBlock() == StairKeeper.BLOCK_SCAFFOLDING) SearchNeighbour(world, pos.east ());
        if(world.getBlockState(pos.south()).getBlock() == StairKeeper.BLOCK_SCAFFOLDING) SearchNeighbour(world, pos.south());
        if(world.getBlockState(pos.west ()).getBlock() == StairKeeper.BLOCK_SCAFFOLDING) SearchNeighbour(world, pos.west ());
        if(world.getBlockState(pos.up   ()).getBlock() == StairKeeper.BLOCK_SCAFFOLDING) SearchNeighbour(world, pos.up   ());
        if(world.getBlockState(pos.down ()).getBlock() == StairKeeper.BLOCK_SCAFFOLDING) SearchNeighbour(world, pos.down ());
    }

    //--------------------------------

    public IFluidState getFluidState(BlockState state) {
        return state.get(WATERLOGGED) ? Fluids.WATER.getStillFluidState(false) : super.getFluidState(state);
    }

    public boolean receiveFluid(IWorld worldIn, BlockPos pos, BlockState state, IFluidState fluidStateIn) {
        return IWaterLoggable.super.receiveFluid(worldIn, pos, state, fluidStateIn);
    }

    public boolean canContainFluid(IBlockReader worldIn, BlockPos pos, BlockState state, Fluid fluidIn) {
        return IWaterLoggable.super.canContainFluid(worldIn, pos, state, fluidIn);
    }

    /**
     * Update the provided state given the provided neighbor facing and neighbor state, returning a new state.
     * For example, fences make their connections to the passed in state if possible, and wet concrete powder immediately
     * returns its solidified counterpart.
     * Note that this method should ideally consider only the specific face passed in.
     */
    public BlockState updatePostPlacement(BlockState stateIn, Direction facing, BlockState facingState, IWorld worldIn, BlockPos currentPos, BlockPos facingPos) {
        if (stateIn.get(WATERLOGGED)) {
            worldIn.getPendingFluidTicks().scheduleTick(currentPos, Fluids.WATER, Fluids.WATER.getTickRate(worldIn));
        }

        return super.updatePostPlacement(stateIn, facing, facingState, worldIn, currentPos, facingPos);
    }

    public boolean allowsMovement(BlockState state, IBlockReader worldIn, BlockPos pos, PathType type) {
        switch(type) {
            case LAND:
                return false;
            case WATER:
                return worldIn.getFluidState(pos).isTagged(FluidTags.WATER);
            case AIR:
                return false;
            default:
                return false;
        }
    }
}
