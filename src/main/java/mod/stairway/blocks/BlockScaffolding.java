package mod.stairway.blocks;

import mod.shared.blocks.BlockBlock;
import mod.stairway.StairKeeper;
import net.minecraft.block.*;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.fluid.Fluid;
import net.minecraft.fluid.IFluidState;
import net.minecraft.init.Fluids;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.item.ItemStack;
import net.minecraft.pathfinding.PathType;
import net.minecraft.state.DirectionProperty;
import net.minecraft.state.IntegerProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.util.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorld;
import net.minecraft.world.World;

import javax.annotation.Nullable;

public class BlockScaffolding extends BlockBlock implements ILiquidContainer {

    public static final DirectionProperty FACING = BlockHorizontal.HORIZONTAL_FACING;
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
        this.setDefaultState(this.stateContainer.getBaseState().with(FACING, EnumFacing.NORTH).with(ROTATION, 0).with(WATERLOGGED, false));
    }



    //----------------------------------------RENDER----------------------------------------//

    //public BlockRenderType getRenderType(IBlockState state) {
    //    return BlockRenderType.MODEL;
    //}

    public IBlockState getStateForPlacement(BlockItemUseContext context) {
        return this.getDefaultState().with(FACING, context.getPlacementHorizontalFacing().getOpposite());
    }

    public BlockRenderLayer getRenderLayer() {
        return BlockRenderLayer.CUTOUT_MIPPED;
    }

    public boolean isFullCube(IBlockState state) {
        return false;
    }

    public VoxelShape getShape(IBlockState state, IBlockReader worldIn, BlockPos pos) {
        int color = state.get(ROTATION);
        EnumFacing      direc = state.get(FACING);

        if(color ==  0 && direc == EnumFacing.NORTH) return AABB_P;
        if(color ==  1 && direc == EnumFacing.NORTH) return AABB_P;
        if(color ==  1 && direc == EnumFacing.EAST ) return AABB_P;
        if(color ==  1 && direc == EnumFacing.SOUTH) return AABB_P;
        if(color ==  1 && direc == EnumFacing.WEST ) return AABB_P;
        if(color ==  2 && direc == EnumFacing.NORTH) return AABB_P;
        if(color ==  2 && direc == EnumFacing.EAST ) return AABB_P;
        if(color ==  3 && direc == EnumFacing.NORTH) return AABB_P;
        if(color ==  3 && direc == EnumFacing.EAST ) return AABB_P;
        if(color ==  3 && direc == EnumFacing.SOUTH) return AABB_P;
        if(color ==  3 && direc == EnumFacing.WEST ) return AABB_P;
        if(color ==  4 && direc == EnumFacing.NORTH) return AABB_P;
        if(color ==  4 && direc == EnumFacing.EAST ) return AABB_P;
        if(color ==  4 && direc == EnumFacing.SOUTH) return AABB_P;
        if(color ==  4 && direc == EnumFacing.WEST ) return AABB_P;
        if(color ==  5 && direc == EnumFacing.NORTH) return AABB_O;
        if(color ==  5 && direc == EnumFacing.EAST ) return AABB_M;
        if(color ==  5 && direc == EnumFacing.SOUTH) return AABB_L;
        if(color ==  5 && direc == EnumFacing.WEST ) return AABB_N;
        if(color ==  6 && direc == EnumFacing.NORTH) return AABB_M;
        if(color ==  6 && direc == EnumFacing.EAST ) return AABB_L;
        if(color ==  6 && direc == EnumFacing.SOUTH) return AABB_N;
        if(color ==  6 && direc == EnumFacing.WEST ) return AABB_O;
        if(color ==  7 && direc == EnumFacing.NORTH) return AABB_L;
        if(color ==  7 && direc == EnumFacing.EAST ) return AABB_N;
        if(color ==  7 && direc == EnumFacing.SOUTH) return AABB_O;
        if(color ==  7 && direc == EnumFacing.WEST ) return AABB_M;
        if(color ==  8 && direc == EnumFacing.NORTH) return AABB_K;
        if(color ==  8 && direc == EnumFacing.EAST ) return AABB_H;
        if(color ==  8 && direc == EnumFacing.SOUTH) return AABB_I;
        if(color ==  8 && direc == EnumFacing.WEST ) return AABB_J;
        if(color ==  9 && direc == EnumFacing.NORTH) return AABB_P;
        if(color == 10 && direc == EnumFacing.NORTH) return AABB_O;
        if(color == 10 && direc == EnumFacing.EAST ) return AABB_M;
        if(color == 10 && direc == EnumFacing.SOUTH) return AABB_L;
        if(color == 10 && direc == EnumFacing.WEST ) return AABB_N;
        if(color == 11 && direc == EnumFacing.NORTH) return AABB_K;
        if(color == 11 && direc == EnumFacing.EAST ) return AABB_H;
        if(color == 11 && direc == EnumFacing.SOUTH) return AABB_I;
        if(color == 11 && direc == EnumFacing.WEST ) return AABB_J;
        if(color == 12 && direc == EnumFacing.NORTH) return AABB_G;
        if(color == 12 && direc == EnumFacing.EAST ) return AABB_F;
        if(color == 13 && direc == EnumFacing.NORTH) return AABB_E;
        if(color == 13 && direc == EnumFacing.EAST ) return AABB_C;
        if(color == 13 && direc == EnumFacing.SOUTH) return AABB_B;
        if(color == 13 && direc == EnumFacing.WEST ) return AABB_D;
        return AABB_A;
    }



    //----------------------------------------SUPPORT----------------------------------------//

    public IBlockState rotate(IBlockState state, Rotation rot) {
        return state.with(FACING, rot.rotate(state.get(FACING)));
    }

    public IBlockState mirror(IBlockState state, Mirror mirrorIn) {
        return state.rotate(mirrorIn.toRotation(state.get(FACING)));
    }

    protected void fillStateContainer(StateContainer.Builder<Block, IBlockState> builder) {
        builder.add(ROTATION, FACING, WATERLOGGED);
    }

    public boolean isLadder(IBlockState state, net.minecraft.world.IWorldReader world, BlockPos pos, EntityLiving entity) {
        return true;
    }

    public void onBlockPlacedBy(World worldIn, BlockPos pos, IBlockState state, @Nullable EntityLivingBase placer, ItemStack stack){
        SearchNeighbour(worldIn, pos);
    }

    public void neighborChanged(IBlockState state, World world, BlockPos pos, Block blockIn, BlockPos fromPos) {
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
        EnumFacing      direc = world.getBlockState(pos).get(FACING);

        if(nn && ne && ee && se && ss && sw && ww && nw){ world.setBlockState(pos, world.getBlockState(pos).with(ROTATION, Integer.valueOf(0))     .with(FACING, EnumFacing.NORTH), 2); if(color !=  0 || direc != EnumFacing.NORTH) UpdateNeighbours(world, pos); } // XXX
        // XXX
        // XXX
        else if(nn && ne && ee && se && ss && sw && ww      ){ world.setBlockState(pos, world.getBlockState(pos).with(ROTATION, Integer.valueOf(1)).with(FACING, EnumFacing.NORTH), 2); if(color !=  1 || direc != EnumFacing.NORTH) UpdateNeighbours(world, pos); } // 'XX
        else if(nn       && ee && se && ss && sw && ww && nw){ world.setBlockState(pos, world.getBlockState(pos).with(ROTATION, Integer.valueOf(1)).with(FACING, EnumFacing.EAST) , 2); if(color !=  1 || direc != EnumFacing.EAST ) UpdateNeighbours(world, pos); } // XXX
        else if(nn && ne && ee       && ss && sw && ww && nw){ world.setBlockState(pos, world.getBlockState(pos).with(ROTATION, Integer.valueOf(1)).with(FACING, EnumFacing.SOUTH), 2); if(color !=  1 || direc != EnumFacing.SOUTH) UpdateNeighbours(world, pos); } // XXX
        else if(nn && ne && ee && se && ss &&       ww && nw){ world.setBlockState(pos, world.getBlockState(pos).with(ROTATION, Integer.valueOf(1)).with(FACING, EnumFacing.WEST) , 2); if(color !=  1 || direc != EnumFacing.WEST ) UpdateNeighbours(world, pos); }
        else if(nn &&       ee && se && ss &&       ww && nw){ world.setBlockState(pos, world.getBlockState(pos).with(ROTATION, Integer.valueOf(2)).with(FACING, EnumFacing.NORTH), 2); if(color !=  2 || direc != EnumFacing.NORTH) UpdateNeighbours(world, pos); } // XX'
        else if(nn && ne && ee       && ss && sw && ww      ){ world.setBlockState(pos, world.getBlockState(pos).with(ROTATION, Integer.valueOf(2)).with(FACING, EnumFacing.EAST) , 2); if(color !=  2 || direc != EnumFacing.EAST ) UpdateNeighbours(world, pos); } // XXX
        // 'XX
        else if(nn       && ee && se && ss && sw && ww      ){ world.setBlockState(pos, world.getBlockState(pos).with(ROTATION, Integer.valueOf(3)).with(FACING, EnumFacing.NORTH), 2); if(color !=  3 || direc != EnumFacing.NORTH) UpdateNeighbours(world, pos); } // 'X'
        else if(nn       && ee &&       ss && sw && ww && nw){ world.setBlockState(pos, world.getBlockState(pos).with(ROTATION, Integer.valueOf(3)).with(FACING, EnumFacing.EAST) , 2); if(color !=  3 || direc != EnumFacing.EAST ) UpdateNeighbours(world, pos); } // XXX
        else if(nn && ne && ee &&       ss &&       ww && nw){ world.setBlockState(pos, world.getBlockState(pos).with(ROTATION, Integer.valueOf(3)).with(FACING, EnumFacing.SOUTH), 2); if(color !=  3 || direc != EnumFacing.SOUTH) UpdateNeighbours(world, pos); } // XXX
        else if(nn && ne && ee && se && ss &&       ww      ){ world.setBlockState(pos, world.getBlockState(pos).with(ROTATION, Integer.valueOf(3)).with(FACING, EnumFacing.WEST) , 2); if(color !=  3 || direc != EnumFacing.WEST ) UpdateNeighbours(world, pos); }
        else if(nn       && ee && se && ss &&       ww      ){ world.setBlockState(pos, world.getBlockState(pos).with(ROTATION, Integer.valueOf(4)).with(FACING, EnumFacing.NORTH), 2); if(color !=  4 || direc != EnumFacing.NORTH) UpdateNeighbours(world, pos); } // 'X'
        else if(nn       && ee &&       ss && sw && ww      ){ world.setBlockState(pos, world.getBlockState(pos).with(ROTATION, Integer.valueOf(4)).with(FACING, EnumFacing.EAST) , 2); if(color !=  4 || direc != EnumFacing.EAST ) UpdateNeighbours(world, pos); } // XXX
        else if(nn       && ee &&       ss &&       ww && nw){ world.setBlockState(pos, world.getBlockState(pos).with(ROTATION, Integer.valueOf(4)).with(FACING, EnumFacing.SOUTH), 2); if(color !=  4 || direc != EnumFacing.SOUTH) UpdateNeighbours(world, pos); } // 'XX
        else if(nn && ne && ee &&       ss &&       ww      ){ world.setBlockState(pos, world.getBlockState(pos).with(ROTATION, Integer.valueOf(4)).with(FACING, EnumFacing.WEST) , 2); if(color !=  4 || direc != EnumFacing.WEST ) UpdateNeighbours(world, pos); }
        else if(nn && ne && ee &&                   ww && nw){ world.setBlockState(pos, world.getBlockState(pos).with(ROTATION, Integer.valueOf(5)).with(FACING, EnumFacing.NORTH), 2); if(color !=  5 || direc != EnumFacing.NORTH) UpdateNeighbours(world, pos); } // XXX
        else if(nn && ne && ee && se && ss                  ){ world.setBlockState(pos, world.getBlockState(pos).with(ROTATION, Integer.valueOf(5)).with(FACING, EnumFacing.EAST) , 2); if(color !=  5 || direc != EnumFacing.EAST ) UpdateNeighbours(world, pos); } // XXX
        else if(            ee && se && ss && sw && ww      ){ world.setBlockState(pos, world.getBlockState(pos).with(ROTATION, Integer.valueOf(5)).with(FACING, EnumFacing.SOUTH), 2); if(color !=  5 || direc != EnumFacing.SOUTH) UpdateNeighbours(world, pos); } // '''
        else if(nn       &&             ss && sw && ww && nw){ world.setBlockState(pos, world.getBlockState(pos).with(ROTATION, Integer.valueOf(5)).with(FACING, EnumFacing.WEST) , 2); if(color !=  5 || direc != EnumFacing.WEST ) UpdateNeighbours(world, pos); }
        else if(nn       && ee && se && ss                  ){ world.setBlockState(pos, world.getBlockState(pos).with(ROTATION, Integer.valueOf(6)).with(FACING, EnumFacing.NORTH), 2); if(color !=  6 || direc != EnumFacing.NORTH) UpdateNeighbours(world, pos); } // 'X'
        else if(            ee &&       ss && sw && ww      ){ world.setBlockState(pos, world.getBlockState(pos).with(ROTATION, Integer.valueOf(6)).with(FACING, EnumFacing.EAST) , 2); if(color !=  6 || direc != EnumFacing.EAST ) UpdateNeighbours(world, pos); } // 'XX
        else if(nn       &&             ss &&       ww && nw){ world.setBlockState(pos, world.getBlockState(pos).with(ROTATION, Integer.valueOf(6)).with(FACING, EnumFacing.SOUTH), 2); if(color !=  6 || direc != EnumFacing.SOUTH) UpdateNeighbours(world, pos); } // 'XX
        else if(nn && ne && ee                   && ww      ){ world.setBlockState(pos, world.getBlockState(pos).with(ROTATION, Integer.valueOf(6)).with(FACING, EnumFacing.WEST) , 2); if(color !=  6 || direc != EnumFacing.WEST ) UpdateNeighbours(world, pos); }
        else if(            ee && se && ss &&       ww      ){ world.setBlockState(pos, world.getBlockState(pos).with(ROTATION, Integer.valueOf(7)).with(FACING, EnumFacing.NORTH), 2); if(color !=  7 || direc != EnumFacing.NORTH) UpdateNeighbours(world, pos); } // '''
        else if(nn       &&             ss && sw && ww      ){ world.setBlockState(pos, world.getBlockState(pos).with(ROTATION, Integer.valueOf(7)).with(FACING, EnumFacing.EAST) , 2); if(color !=  7 || direc != EnumFacing.EAST ) UpdateNeighbours(world, pos); } // XXX
        else if(nn       && ee &&                   ww && nw){ world.setBlockState(pos, world.getBlockState(pos).with(ROTATION, Integer.valueOf(7)).with(FACING, EnumFacing.SOUTH), 2); if(color !=  7 || direc != EnumFacing.SOUTH) UpdateNeighbours(world, pos); } // 'XX
        else if(nn && ne && ee &&       ss                  ){ world.setBlockState(pos, world.getBlockState(pos).with(ROTATION, Integer.valueOf(7)).with(FACING, EnumFacing.WEST) , 2); if(color !=  7 || direc != EnumFacing.WEST ) UpdateNeighbours(world, pos); }
        else if(nn && ne && ee                              ){ world.setBlockState(pos, world.getBlockState(pos).with(ROTATION, Integer.valueOf(8)).with(FACING, EnumFacing.NORTH), 2); if(color !=  8 || direc != EnumFacing.NORTH) UpdateNeighbours(world, pos); } // 'XX
        else if(            ee && se && ss                  ){ world.setBlockState(pos, world.getBlockState(pos).with(ROTATION, Integer.valueOf(8)).with(FACING, EnumFacing.EAST) , 2); if(color !=  8 || direc != EnumFacing.EAST ) UpdateNeighbours(world, pos); } // 'XX
        else if(                        ss && sw && ww      ){ world.setBlockState(pos, world.getBlockState(pos).with(ROTATION, Integer.valueOf(8)).with(FACING, EnumFacing.SOUTH), 2); if(color !=  8 || direc != EnumFacing.SOUTH) UpdateNeighbours(world, pos); } // '''
        else if(nn &&                               ww && nw){ world.setBlockState(pos, world.getBlockState(pos).with(ROTATION, Integer.valueOf(8)).with(FACING, EnumFacing.WEST) , 2); if(color !=  8 || direc != EnumFacing.WEST ) UpdateNeighbours(world, pos); }
        else if(nn &&       ee &&       ss &&       ww      ){ world.setBlockState(pos, world.getBlockState(pos).with(ROTATION, Integer.valueOf(9)).with(FACING, EnumFacing.NORTH), 2); if(color !=  9 || direc != EnumFacing.NORTH) UpdateNeighbours(world, pos); } // 'X'
        // XXX
        // 'X'
        else if(nn &&       ee &&                   ww      ){ world.setBlockState(pos, world.getBlockState(pos).with(ROTATION, Integer.valueOf(10)).with(FACING, EnumFacing.NORTH), 2); if(color != 10 || direc != EnumFacing.NORTH) UpdateNeighbours(world, pos); } // 'X'
        else if(nn &&       ee &&       ss                  ){ world.setBlockState(pos, world.getBlockState(pos).with(ROTATION, Integer.valueOf(10)).with(FACING, EnumFacing.EAST) , 2); if(color != 10 || direc != EnumFacing.EAST ) UpdateNeighbours(world, pos); } // XXX
        else if(            ee &&       ss &&       ww      ){ world.setBlockState(pos, world.getBlockState(pos).with(ROTATION, Integer.valueOf(10)).with(FACING, EnumFacing.SOUTH), 2); if(color != 10 || direc != EnumFacing.SOUTH) UpdateNeighbours(world, pos); } // '''
        else if(nn &&                   ss &&       ww      ){ world.setBlockState(pos, world.getBlockState(pos).with(ROTATION, Integer.valueOf(10)).with(FACING, EnumFacing.WEST) , 2); if(color != 10 || direc != EnumFacing.WEST ) UpdateNeighbours(world, pos); }
        else if(nn &&       ee                              ){ world.setBlockState(pos, world.getBlockState(pos).with(ROTATION, Integer.valueOf(11)).with(FACING, EnumFacing.NORTH), 2); if(color != 11 || direc != EnumFacing.NORTH) UpdateNeighbours(world, pos); } // 'X'
        else if(            ee &&       ss                  ){ world.setBlockState(pos, world.getBlockState(pos).with(ROTATION, Integer.valueOf(11)).with(FACING, EnumFacing.EAST) , 2); if(color != 11 || direc != EnumFacing.EAST ) UpdateNeighbours(world, pos); } // 'XX
        else if(                        ss &&       ww      ){ world.setBlockState(pos, world.getBlockState(pos).with(ROTATION, Integer.valueOf(11)).with(FACING, EnumFacing.SOUTH), 2); if(color != 11 || direc != EnumFacing.SOUTH) UpdateNeighbours(world, pos); } // '''
        else if(nn &&                               ww      ){ world.setBlockState(pos, world.getBlockState(pos).with(ROTATION, Integer.valueOf(11)).with(FACING, EnumFacing.WEST) , 2); if(color != 11 || direc != EnumFacing.WEST ) UpdateNeighbours(world, pos); }
        else if(nn &&                   ss                  ){ world.setBlockState(pos, world.getBlockState(pos).with(ROTATION, Integer.valueOf(12)).with(FACING, EnumFacing.NORTH), 2); if(color != 12 || direc != EnumFacing.NORTH) UpdateNeighbours(world, pos); } // 'X'
        else if(            ee &&                   ww      ){ world.setBlockState(pos, world.getBlockState(pos).with(ROTATION, Integer.valueOf(12)).with(FACING, EnumFacing.EAST) , 2); if(color != 12 || direc != EnumFacing.EAST ) UpdateNeighbours(world, pos); } // 'X'
        // 'X'
        else if(nn                                          ){ world.setBlockState(pos, world.getBlockState(pos).with(ROTATION, Integer.valueOf(13)).with(FACING, EnumFacing.NORTH), 2); if(color != 13 || direc != EnumFacing.NORTH) UpdateNeighbours(world, pos); } // 'X'
        else if(            ee                              ){ world.setBlockState(pos, world.getBlockState(pos).with(ROTATION, Integer.valueOf(13)).with(FACING, EnumFacing.EAST) , 2); if(color != 13 || direc != EnumFacing.EAST ) UpdateNeighbours(world, pos); } // 'X'
        else if(                        ss                  ){ world.setBlockState(pos, world.getBlockState(pos).with(ROTATION, Integer.valueOf(13)).with(FACING, EnumFacing.SOUTH), 2); if(color != 13 || direc != EnumFacing.SOUTH) UpdateNeighbours(world, pos); } // '''
        else if(                                    ww      ){ world.setBlockState(pos, world.getBlockState(pos).with(ROTATION, Integer.valueOf(13)).with(FACING, EnumFacing.WEST) , 2); if(color != 13 || direc != EnumFacing.WEST ) UpdateNeighbours(world, pos); }
        else { world.setBlockState(pos, world.getBlockState(pos).with(ROTATION, Integer.valueOf(14)).with(FACING, EnumFacing.NORTH), 2); }
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

    public IBlockState updatePostPlacement(IBlockState stateIn, EnumFacing facing, IBlockState facingState, IWorld worldIn, BlockPos currentPos, BlockPos facingPos) {
        if (stateIn.get(WATERLOGGED)) {
            worldIn.getPendingFluidTicks().scheduleTick(currentPos, Fluids.WATER, Fluids.WATER.getTickRate(worldIn));
        }
        return super.updatePostPlacement(stateIn, facing, facingState, worldIn, currentPos, facingPos);
    }

    public Fluid pickupFluid(IWorld worldIn, BlockPos pos, IBlockState state) {
        if (state.get(WATERLOGGED)) {
            worldIn.setBlockState(pos, state.with(WATERLOGGED, Boolean.valueOf(false)), 3);
            return Fluids.WATER;
        } else {
            return Fluids.EMPTY;
        }
    }

    public IFluidState getFluidState(IBlockState state) {
        return state.get(WATERLOGGED) ? Fluids.WATER.getStillFluidState(false) : super.getFluidState(state);
    }

    public boolean canContainFluid(IBlockReader worldIn, BlockPos pos, IBlockState state, Fluid fluidIn) {
        return !state.get(WATERLOGGED) && fluidIn == Fluids.WATER;
    }

    public boolean receiveFluid(IWorld worldIn, BlockPos pos, IBlockState state, IFluidState fluidStateIn) {
        if (!state.get(WATERLOGGED) && fluidStateIn.getFluid() == Fluids.WATER) {
            if (!worldIn.isRemote()) {
                worldIn.setBlockState(pos, state.with(WATERLOGGED, Boolean.valueOf(true)), 3);
                worldIn.getPendingFluidTicks().scheduleTick(pos, fluidStateIn.getFluid(), fluidStateIn.getFluid().getTickRate(worldIn));
            }

            return true;
        } else {
            return false;
        }
    }

    public boolean allowsMovement(IBlockState state, IBlockReader worldIn, BlockPos pos, PathType type) {
        return false;
    }
}
