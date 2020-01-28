package mod.stairway.blocks;

import mod.stairway.StairKeeper;
import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.init.Particles;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.InventoryHelper;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.item.EnumDyeColor;
import net.minecraft.item.ItemStack;
import net.minecraft.state.BooleanProperty;
import net.minecraft.state.DirectionProperty;
import net.minecraft.state.IntegerProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.stats.StatList;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityFurnace;
import net.minecraft.util.*;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import javax.annotation.Nullable;
import java.util.Random;

public class BlockScaffolding extends Block {

    public static final DirectionProperty FACING = BlockHorizontal.HORIZONTAL_FACING;
    public static final IntegerProperty ROTATION = BlockStateProperties.ROTATION_0_15;

    /** Default Constructor */
    public BlockScaffolding(String modid, String name, Block block) {
        super(Block.Properties.from(block));
        this.setRegistryName(modid, name);
        this.setDefaultState(this.stateContainer.getBaseState().with(FACING, EnumFacing.NORTH).with(ROTATION, Integer.valueOf(0)));
    }

    public IBlockState getStateForPlacement(BlockItemUseContext context) {
        return this.getDefaultState().with(FACING, context.getPlacementHorizontalFacing().getOpposite());
    }

    public EnumBlockRenderType getRenderType(IBlockState state) {
        return EnumBlockRenderType.MODEL;
    }

    public IBlockState rotate(IBlockState state, Rotation rot) {
        return state.with(FACING, rot.rotate(state.get(FACING)));
    }

    public IBlockState mirror(IBlockState state, Mirror mirrorIn) {
        return state.rotate(mirrorIn.toRotation(state.get(FACING)));
    }

    protected void fillStateContainer(StateContainer.Builder<Block, IBlockState> builder) {
        builder.add(ROTATION, FACING);
    }

    public boolean isFullCube(IBlockState state){
        return false;
    }

    public boolean isLadder(IBlockState state, net.minecraft.world.IWorldReader world, BlockPos pos, net.minecraft.entity.EntityLivingBase entity) {
        return true;
    }

    public BlockRenderLayer getRenderLayer() {
        return BlockRenderLayer.TRANSLUCENT;
    }

    public static final VoxelShape AABB_A = Block.makeCuboidShape(0.4D*16, 0.0D*16, 0.4D*16, 0.6D*16, 1.0D*16, 0.6D*16);
    public static final VoxelShape AABB_B = Block.makeCuboidShape(0.4D*16, 0.0D*16, 0.4D*16, 0.6D*16, 1.0D*16, 1.0D*16);
    public static final VoxelShape AABB_C = Block.makeCuboidShape(0.4D*16, 0.0D*16, 0.4D*16, 1.0D*16, 1.0D*16, 0.6D*16);
    public static final VoxelShape AABB_D = Block.makeCuboidShape(0.0D*16, 0.0D*16, 0.4D*16, 0.6D*16, 1.0D*16, 0.6D*16);
    public static final VoxelShape AABB_E = Block.makeCuboidShape(0.4D*16, 0.0D*16, 0.0D*16, 0.6D*16, 1.0D*16, 0.6D*16);
    public static final VoxelShape AABB_F = Block.makeCuboidShape(0.0D*16, 0.0D*16, 0.4D*16, 1.0D*16, 1.0D*16, 0.6D*16);
    public static final VoxelShape AABB_G = Block.makeCuboidShape(0.4D*16, 0.0D*16, 0.0D*16, 0.6D*16, 1.0D*16, 1.0D*16);
    public static final VoxelShape AABB_H = Block.makeCuboidShape(0.4D*16, 0.0D*16, 0.4D*16, 1.0D*16, 1.0D*16, 1.0D*16);
    public static final VoxelShape AABB_I = Block.makeCuboidShape(0.0D*16, 0.0D*16, 0.4D*16, 0.6D*16, 1.0D*16, 1.0D*16);
    public static final VoxelShape AABB_J = Block.makeCuboidShape(0.0D*16, 0.0D*16, 0.0D*16, 0.6D*16, 1.0D*16, 0.6D*16);
    public static final VoxelShape AABB_K = Block.makeCuboidShape(0.4D*16, 0.0D*16, 0.0D*16, 1.0D*16, 1.0D*16, 0.6D*16);
    public static final VoxelShape AABB_L = Block.makeCuboidShape(0.0D*16, 0.0D*16, 0.4D*16, 1.0D*16, 1.0D*16, 1.0D*16);
    public static final VoxelShape AABB_M = Block.makeCuboidShape(0.4D*16, 0.0D*16, 0.0D*16, 1.0D*16, 1.0D*16, 1.0D*16);
    public static final VoxelShape AABB_N = Block.makeCuboidShape(0.0D*16, 0.0D*16, 0.0D*16, 0.6D*16, 1.0D*16, 1.0D*16);
    public static final VoxelShape AABB_O = Block.makeCuboidShape(0.0D*16, 0.0D*16, 0.0D*16, 1.0D*16, 1.0D*16, 0.6D*16);
    public static final VoxelShape AABB_P = Block.makeCuboidShape(0.0D*16, 0.0D*16, 0.0D*16, 1.0D*16, 1.0D*16, 1.0D*16);

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

    protected boolean canSilkHarvest() {
        return true;
    }

    public void onBlockPlacedBy(World worldIn, BlockPos pos, IBlockState state, EntityLivingBase placer, ItemStack stack){
        SearchNeighbour(worldIn, pos);
    }

    public void neighborChanged(IBlockState state, World worldIn, BlockPos pos, Block blockIn, BlockPos fromPos) {
        SearchNeighbour(worldIn, pos);
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

    @Deprecated //Forge: Use fortune/location sensitive version
    public int quantityDropped(IBlockState state, Random random) {
        return 2 + random.nextInt(3);
    }

    public IItemProvider getItemDropped(IBlockState state, World worldIn, BlockPos pos, int fortune) {
        return Items.STICK;
    }
}
