package mod.stairway.block;

import mod.lucky77.block.BlockBase;
import mod.lucky77.blockentity.BlockEntityBase;
import mod.stairway.StairKeeper;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.tags.FluidTags;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.SimpleWaterloggedBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.level.pathfinder.PathComputationType;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class BlockScaffolding extends BlockBase implements SimpleWaterloggedBlock {

    public static final DirectionProperty FACING = BlockStateProperties.HORIZONTAL_FACING;
    public static final IntegerProperty ROTATION = BlockStateProperties.ROTATION_16;
    public static final BooleanProperty WATERLOGGED = BlockStateProperties.WATERLOGGED;

    public static final VoxelShape AABB_A = Block.box(5, 0, 5, 11, 16, 11);
    public static final VoxelShape AABB_B = Block.box(5, 0, 5, 11, 16, 16);
    public static final VoxelShape AABB_C = Block.box(5, 0, 5, 16, 16, 11);
    public static final VoxelShape AABB_D = Block.box(0, 0, 5, 11, 16, 11);
    public static final VoxelShape AABB_E = Block.box(5, 0, 0, 11, 16, 11);
    public static final VoxelShape AABB_F = Block.box(0, 0, 5, 16, 16, 11);
    public static final VoxelShape AABB_G = Block.box(5, 0, 0, 11, 16, 16);
    public static final VoxelShape AABB_H = Block.box(5, 0, 5, 16, 16, 16);
    public static final VoxelShape AABB_I = Block.box(0, 0, 5, 11, 16, 16);
    public static final VoxelShape AABB_J = Block.box(0, 0, 0, 11, 16, 11);
    public static final VoxelShape AABB_K = Block.box(5, 0, 0, 16, 16, 11);
    public static final VoxelShape AABB_L = Block.box(0, 0, 5, 16, 16, 16);
    public static final VoxelShape AABB_M = Block.box(5, 0, 0, 16, 16, 16);
    public static final VoxelShape AABB_N = Block.box(0, 0, 0, 11, 16, 16);
    public static final VoxelShape AABB_O = Block.box(0, 0, 0, 16, 16, 11);
    public static final VoxelShape AABB_P = Block.box(0, 0, 0, 16, 16, 16);





    //----------------------------------------CONSTRUCTOR----------------------------------------//

    /** Default Constructor */
    public BlockScaffolding(Block block) {
        super(Properties.copy(block).noOcclusion().isViewBlocking(BlockScaffolding::never));
        this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.NORTH).setValue(ROTATION, 0).setValue(WATERLOGGED, false));
    }





    //----------------------------------------PLACEMENT----------------------------------------//

    public void setPlacedBy(Level worldIn, BlockPos pos, BlockState state, LivingEntity placer, ItemStack stack){
        searchNeighbour(worldIn, pos);
    }

    public BlockState updateShape(BlockState stateIn, Direction facing, BlockState facingState, LevelAccessor worldIn, BlockPos currentPos, BlockPos facingPos) {
        if (stateIn.getValue(WATERLOGGED)) {
            worldIn.scheduleTick(currentPos, Fluids.WATER, Fluids.WATER.getTickDelay(worldIn));
        }
        return super.updateShape(stateIn, facing, facingState, worldIn, currentPos, facingPos);
    }

    public BlockState getStateForPlacement(BlockPlaceContext context) {
        return this.defaultBlockState().setValue(FACING, context.getHorizontalDirection().getOpposite());
    }





    //----------------------------------------INTERACT----------------------------------------//

    @Override
    public void interact(Level world, BlockPos pos, Player player, BlockEntityBase tile) {

    }





    //----------------------------------------UPDATE----------------------------------------//

    @Deprecated
    public void neighborChanged(BlockState state, Level world, BlockPos pos, Block blockIn, BlockPos fromPos, boolean isMoving) {
        searchNeighbour(world, pos);
    }





    //----------------------------------------RENDER----------------------------------------//

    @Deprecated
    public VoxelShape getShape(BlockState state, BlockGetter getter, BlockPos pos, CollisionContext context) {
        int color = state.getValue(ROTATION);
        Direction      direc = state.getValue(FACING);

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
        return state.setValue(FACING, rot.rotate(state.getValue(FACING)));
    }

    public BlockState mirror(BlockState state, Mirror mirrorIn) {
        return state.rotate(mirrorIn.getRotation(state.getValue(FACING)));
    }

    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(ROTATION, FACING, WATERLOGGED);
    }

    public boolean isLadder(BlockState state, LevelReader world, BlockPos pos, LivingEntity entity){
        return true;
    }

    public void searchNeighbour(Level world, BlockPos pos){
        boolean nn = !world.isEmptyBlock(pos.north()       );
        boolean ne = !world.isEmptyBlock(pos.north().east());
        boolean ee = !world.isEmptyBlock(pos.        east());
        boolean se = !world.isEmptyBlock(pos.south().east());
        boolean ss = !world.isEmptyBlock(pos.south()       );
        boolean sw = !world.isEmptyBlock(pos.south().west());
        boolean ww = !world.isEmptyBlock(pos.        west());
        boolean nw = !world.isEmptyBlock(pos.north().west());

        int color = world.getBlockState(pos).getValue(ROTATION);
        Direction      direc = world.getBlockState(pos).getValue(FACING);

        if(nn && ne && ee && se && ss && sw && ww && nw){ world.setBlock(pos, world.getBlockState(pos).setValue(ROTATION, 0)     .setValue(FACING, Direction.NORTH), 2); if(color !=  0 || direc != Direction.NORTH) updateNeighbours(world, pos); } // XXX
        // XXX
        // XXX
        else if(nn && ne && ee && se && ss && sw && ww      ){ world.setBlock(pos, world.getBlockState(pos).setValue(ROTATION, 1).setValue(FACING, Direction.NORTH), 2); if(color !=  1 || direc != Direction.NORTH) updateNeighbours(world, pos); } // 'XX
        else if(nn       && ee && se && ss && sw && ww && nw){ world.setBlock(pos, world.getBlockState(pos).setValue(ROTATION, 1).setValue(FACING, Direction.EAST) , 2); if(color !=  1 || direc != Direction.EAST ) updateNeighbours(world, pos); } // XXX
        else if(nn && ne && ee       && ss && sw && ww && nw){ world.setBlock(pos, world.getBlockState(pos).setValue(ROTATION, 1).setValue(FACING, Direction.SOUTH), 2); if(color !=  1 || direc != Direction.SOUTH) updateNeighbours(world, pos); } // XXX
        else if(nn && ne && ee && se && ss &&       ww && nw){ world.setBlock(pos, world.getBlockState(pos).setValue(ROTATION, 1).setValue(FACING, Direction.WEST) , 2); if(color !=  1 || direc != Direction.WEST ) updateNeighbours(world, pos); }
        else if(nn &&       ee && se && ss &&       ww && nw){ world.setBlock(pos, world.getBlockState(pos).setValue(ROTATION, 2).setValue(FACING, Direction.NORTH), 2); if(color !=  2 || direc != Direction.NORTH) updateNeighbours(world, pos); } // XX'
        else if(nn && ne && ee       && ss && sw && ww      ){ world.setBlock(pos, world.getBlockState(pos).setValue(ROTATION, 2).setValue(FACING, Direction.EAST) , 2); if(color !=  2 || direc != Direction.EAST ) updateNeighbours(world, pos); } // XXX
        // 'XX
        else if(nn       && ee && se && ss && sw && ww      ){ world.setBlock(pos, world.getBlockState(pos).setValue(ROTATION, 3).setValue(FACING, Direction.NORTH), 2); if(color !=  3 || direc != Direction.NORTH) updateNeighbours(world, pos); } // 'X'
        else if(nn       && ee &&       ss && sw && ww && nw){ world.setBlock(pos, world.getBlockState(pos).setValue(ROTATION, 3).setValue(FACING, Direction.EAST) , 2); if(color !=  3 || direc != Direction.EAST ) updateNeighbours(world, pos); } // XXX
        else if(nn && ne && ee &&       ss &&       ww && nw){ world.setBlock(pos, world.getBlockState(pos).setValue(ROTATION, 3).setValue(FACING, Direction.SOUTH), 2); if(color !=  3 || direc != Direction.SOUTH) updateNeighbours(world, pos); } // XXX
        else if(nn && ne && ee && se && ss &&       ww      ){ world.setBlock(pos, world.getBlockState(pos).setValue(ROTATION, 3).setValue(FACING, Direction.WEST) , 2); if(color !=  3 || direc != Direction.WEST ) updateNeighbours(world, pos); }
        else if(nn       && ee && se && ss &&       ww      ){ world.setBlock(pos, world.getBlockState(pos).setValue(ROTATION, 4).setValue(FACING, Direction.NORTH), 2); if(color !=  4 || direc != Direction.NORTH) updateNeighbours(world, pos); } // 'X'
        else if(nn       && ee &&       ss && sw && ww      ){ world.setBlock(pos, world.getBlockState(pos).setValue(ROTATION, 4).setValue(FACING, Direction.EAST) , 2); if(color !=  4 || direc != Direction.EAST ) updateNeighbours(world, pos); } // XXX
        else if(nn       && ee &&       ss &&       ww && nw){ world.setBlock(pos, world.getBlockState(pos).setValue(ROTATION, 4).setValue(FACING, Direction.SOUTH), 2); if(color !=  4 || direc != Direction.SOUTH) updateNeighbours(world, pos); } // 'XX
        else if(nn && ne && ee &&       ss &&       ww      ){ world.setBlock(pos, world.getBlockState(pos).setValue(ROTATION, 4).setValue(FACING, Direction.WEST) , 2); if(color !=  4 || direc != Direction.WEST ) updateNeighbours(world, pos); }
        else if(nn && ne && ee &&                   ww && nw){ world.setBlock(pos, world.getBlockState(pos).setValue(ROTATION, 5).setValue(FACING, Direction.NORTH), 2); if(color !=  5 || direc != Direction.NORTH) updateNeighbours(world, pos); } // XXX
        else if(nn && ne && ee && se && ss                  ){ world.setBlock(pos, world.getBlockState(pos).setValue(ROTATION, 5).setValue(FACING, Direction.EAST) , 2); if(color !=  5 || direc != Direction.EAST ) updateNeighbours(world, pos); } // XXX
        else if(            ee && se && ss && sw && ww      ){ world.setBlock(pos, world.getBlockState(pos).setValue(ROTATION, 5).setValue(FACING, Direction.SOUTH), 2); if(color !=  5 || direc != Direction.SOUTH) updateNeighbours(world, pos); } // '''
        else if(nn       &&             ss && sw && ww && nw){ world.setBlock(pos, world.getBlockState(pos).setValue(ROTATION, 5).setValue(FACING, Direction.WEST) , 2); if(color !=  5 || direc != Direction.WEST ) updateNeighbours(world, pos); }
        else if(nn       && ee && se && ss                  ){ world.setBlock(pos, world.getBlockState(pos).setValue(ROTATION, 6).setValue(FACING, Direction.NORTH), 2); if(color !=  6 || direc != Direction.NORTH) updateNeighbours(world, pos); } // 'X'
        else if(            ee &&       ss && sw && ww      ){ world.setBlock(pos, world.getBlockState(pos).setValue(ROTATION, 6).setValue(FACING, Direction.EAST) , 2); if(color !=  6 || direc != Direction.EAST ) updateNeighbours(world, pos); } // 'XX
        else if(nn       &&             ss &&       ww && nw){ world.setBlock(pos, world.getBlockState(pos).setValue(ROTATION, 6).setValue(FACING, Direction.SOUTH), 2); if(color !=  6 || direc != Direction.SOUTH) updateNeighbours(world, pos); } // 'XX
        else if(nn && ne && ee                   && ww      ){ world.setBlock(pos, world.getBlockState(pos).setValue(ROTATION, 6).setValue(FACING, Direction.WEST) , 2); if(color !=  6 || direc != Direction.WEST ) updateNeighbours(world, pos); }
        else if(            ee && se && ss &&       ww      ){ world.setBlock(pos, world.getBlockState(pos).setValue(ROTATION, 7).setValue(FACING, Direction.NORTH), 2); if(color !=  7 || direc != Direction.NORTH) updateNeighbours(world, pos); } // '''
        else if(nn       &&             ss && sw && ww      ){ world.setBlock(pos, world.getBlockState(pos).setValue(ROTATION, 7).setValue(FACING, Direction.EAST) , 2); if(color !=  7 || direc != Direction.EAST ) updateNeighbours(world, pos); } // XXX
        else if(nn       && ee &&                   ww && nw){ world.setBlock(pos, world.getBlockState(pos).setValue(ROTATION, 7).setValue(FACING, Direction.SOUTH), 2); if(color !=  7 || direc != Direction.SOUTH) updateNeighbours(world, pos); } // 'XX
        else if(nn && ne && ee &&       ss                  ){ world.setBlock(pos, world.getBlockState(pos).setValue(ROTATION, 7).setValue(FACING, Direction.WEST) , 2); if(color !=  7 || direc != Direction.WEST ) updateNeighbours(world, pos); }
        else if(nn && ne && ee                              ){ world.setBlock(pos, world.getBlockState(pos).setValue(ROTATION, 8).setValue(FACING, Direction.NORTH), 2); if(color !=  8 || direc != Direction.NORTH) updateNeighbours(world, pos); } // 'XX
        else if(            ee && se && ss                  ){ world.setBlock(pos, world.getBlockState(pos).setValue(ROTATION, 8).setValue(FACING, Direction.EAST) , 2); if(color !=  8 || direc != Direction.EAST ) updateNeighbours(world, pos); } // 'XX
        else if(                        ss && sw && ww      ){ world.setBlock(pos, world.getBlockState(pos).setValue(ROTATION, 8).setValue(FACING, Direction.SOUTH), 2); if(color !=  8 || direc != Direction.SOUTH) updateNeighbours(world, pos); } // '''
        else if(nn &&                               ww && nw){ world.setBlock(pos, world.getBlockState(pos).setValue(ROTATION, 8).setValue(FACING, Direction.WEST) , 2); if(color !=  8 || direc != Direction.WEST ) updateNeighbours(world, pos); }
        else if(nn &&       ee &&       ss &&       ww      ){ world.setBlock(pos, world.getBlockState(pos).setValue(ROTATION, 9).setValue(FACING, Direction.NORTH), 2); if(color !=  9 || direc != Direction.NORTH) updateNeighbours(world, pos); } // 'X'
        // XXX
        // 'X'
        else if(nn &&       ee &&                   ww      ){ world.setBlock(pos, world.getBlockState(pos).setValue(ROTATION, 10).setValue(FACING, Direction.NORTH), 2); if(color != 10 || direc != Direction.NORTH) updateNeighbours(world, pos); } // 'X'
        else if(nn &&       ee &&       ss                  ){ world.setBlock(pos, world.getBlockState(pos).setValue(ROTATION, 10).setValue(FACING, Direction.EAST) , 2); if(color != 10 || direc != Direction.EAST ) updateNeighbours(world, pos); } // XXX
        else if(            ee &&       ss &&       ww      ){ world.setBlock(pos, world.getBlockState(pos).setValue(ROTATION, 10).setValue(FACING, Direction.SOUTH), 2); if(color != 10 || direc != Direction.SOUTH) updateNeighbours(world, pos); } // '''
        else if(nn &&                   ss &&       ww      ){ world.setBlock(pos, world.getBlockState(pos).setValue(ROTATION, 10).setValue(FACING, Direction.WEST) , 2); if(color != 10 || direc != Direction.WEST ) updateNeighbours(world, pos); }
        else if(nn &&       ee                              ){ world.setBlock(pos, world.getBlockState(pos).setValue(ROTATION, 11).setValue(FACING, Direction.NORTH), 2); if(color != 11 || direc != Direction.NORTH) updateNeighbours(world, pos); } // 'X'
        else if(            ee &&       ss                  ){ world.setBlock(pos, world.getBlockState(pos).setValue(ROTATION, 11).setValue(FACING, Direction.EAST) , 2); if(color != 11 || direc != Direction.EAST ) updateNeighbours(world, pos); } // 'XX
        else if(                        ss &&       ww      ){ world.setBlock(pos, world.getBlockState(pos).setValue(ROTATION, 11).setValue(FACING, Direction.SOUTH), 2); if(color != 11 || direc != Direction.SOUTH) updateNeighbours(world, pos); } // '''
        else if(nn &&                               ww      ){ world.setBlock(pos, world.getBlockState(pos).setValue(ROTATION, 11).setValue(FACING, Direction.WEST) , 2); if(color != 11 || direc != Direction.WEST ) updateNeighbours(world, pos); }
        else if(nn &&                   ss                  ){ world.setBlock(pos, world.getBlockState(pos).setValue(ROTATION, 12).setValue(FACING, Direction.NORTH), 2); if(color != 12 || direc != Direction.NORTH) updateNeighbours(world, pos); } // 'X'
        else if(            ee &&                   ww      ){ world.setBlock(pos, world.getBlockState(pos).setValue(ROTATION, 12).setValue(FACING, Direction.EAST) , 2); if(color != 12 || direc != Direction.EAST ) updateNeighbours(world, pos); } // 'X'
        // 'X'
        else if(nn                                          ){ world.setBlock(pos, world.getBlockState(pos).setValue(ROTATION, 13).setValue(FACING, Direction.NORTH), 2); if(color != 13 || direc != Direction.NORTH) updateNeighbours(world, pos); } // 'X'
        else if(            ee                              ){ world.setBlock(pos, world.getBlockState(pos).setValue(ROTATION, 13).setValue(FACING, Direction.EAST) , 2); if(color != 13 || direc != Direction.EAST ) updateNeighbours(world, pos); } // 'X'
        else if(                        ss                  ){ world.setBlock(pos, world.getBlockState(pos).setValue(ROTATION, 13).setValue(FACING, Direction.SOUTH), 2); if(color != 13 || direc != Direction.SOUTH) updateNeighbours(world, pos); } // '''
        else if(                                    ww      ){ world.setBlock(pos, world.getBlockState(pos).setValue(ROTATION, 13).setValue(FACING, Direction.WEST) , 2); if(color != 13 || direc != Direction.WEST ) updateNeighbours(world, pos); }
        else { world.setBlock(pos, world.getBlockState(pos).setValue(ROTATION, 14).setValue(FACING, Direction.NORTH), 2); }
        // '''
        // 'X'
        // '''
    }

    private void updateNeighbours(Level world, BlockPos pos){
        if(world.getBlockState(pos.north()).getBlock() == StairKeeper.BLOCK_SCAFFOLDING.get()) searchNeighbour(world, pos.north());
        if(world.getBlockState(pos.east ()).getBlock() == StairKeeper.BLOCK_SCAFFOLDING.get()) searchNeighbour(world, pos.east ());
        if(world.getBlockState(pos.south()).getBlock() == StairKeeper.BLOCK_SCAFFOLDING.get()) searchNeighbour(world, pos.south());
        if(world.getBlockState(pos.west ()).getBlock() == StairKeeper.BLOCK_SCAFFOLDING.get()) searchNeighbour(world, pos.west ());
        if(world.getBlockState(pos.above   ()).getBlock() == StairKeeper.BLOCK_SCAFFOLDING.get()) searchNeighbour(world, pos.above   ());
        if(world.getBlockState(pos.below ()).getBlock() == StairKeeper.BLOCK_SCAFFOLDING.get()) searchNeighbour(world, pos.below ());
    }

    public FluidState getFluidState(BlockState p_204507_1_) {
        return p_204507_1_.getValue(WATERLOGGED) ? Fluids.WATER.getSource(false) : super.getFluidState(p_204507_1_);
    }

    public boolean isPathfindable(BlockGetter level, BlockPos pos, PathComputationType type) {
        if (type == PathComputationType.WATER) return level.getFluidState(pos).is(FluidTags.WATER);
        return false;
    }

    private static boolean never(BlockState p_235436_0_, BlockGetter p_235436_1_, BlockPos p_235436_2_) {
        return false;
    }

    public VoxelShape getVisualShape(BlockState state, BlockGetter getter, BlockPos pos, CollisionContext context) {
        return Shapes.empty();
    }

    @OnlyIn(Dist.CLIENT)
    public float getShadeBrightness(BlockState p_220080_1_, BlockGetter p_220080_2_, BlockPos p_220080_3_) {
        return 1.0F;
    }

    public boolean propagatesSkylightDown(BlockState p_200123_1_, BlockGetter p_200123_2_, BlockPos p_200123_3_) {
        return true;
    }

    @OnlyIn(Dist.CLIENT)
    public boolean skipRendering(BlockState p_200122_1_, BlockState p_200122_2_, Direction p_200122_3_) {
        return p_200122_2_.is(this) ? true : super.skipRendering(p_200122_1_, p_200122_2_, p_200122_3_);
    }



}
