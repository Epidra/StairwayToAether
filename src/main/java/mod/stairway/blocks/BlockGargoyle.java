package mod.stairway.blocks;

import mod.lucky77.blocks.MachinaBase;
import mod.lucky77.tileentities.TileBase;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.state.IntegerProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.util.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;

public class BlockGargoyle extends MachinaBase {

    public static final IntegerProperty EYES = BlockStateProperties.AGE_5;

    public static final VoxelShape AABB0 = Block.box(1, 0, 4, 16, 16, 12);
    public static final VoxelShape AABB1 = Block.box(4, 0, 1, 12, 16, 16);
    public static final VoxelShape AABB2 = Block.box(0, 0, 4, 15, 16, 12);
    public static final VoxelShape AABB3 = Block.box(4, 0, 0, 12, 16, 15);




    //----------------------------------------CONSTRUCTOR----------------------------------------//

    public BlockGargoyle(Block block) {
        super(block);
        this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.NORTH).setValue(EYES, 0));
    }




    //----------------------------------------PLACEMENT----------------------------------------//

    // ...




    //----------------------------------------INTERACTION----------------------------------------//

    @Override
    public void interact(World world, BlockPos pos, PlayerEntity player, TileBase tile) {
        BlockState state = world.getBlockState(pos);
        int power = state.getValue(EYES);
        if(player.getMainHandItem().getItem() == Items.DIAMOND){
            if(power < 2){
                player.getMainHandItem().shrink(1);
                world.setBlockAndUpdate(pos, state.setValue(EYES, power+1));
            }
            if(power == 3){
                player.getMainHandItem().shrink(1);
                world.setBlockAndUpdate(pos, state.setValue(EYES, 5));
            }
        } else if(player.getMainHandItem().getItem() == Items.EMERALD){
            if(power == 0 || power == 3){
                player.getMainHandItem().shrink(1);
                world.setBlockAndUpdate(pos, state.setValue(EYES, power == 0 ? 3 : 4));
            }
            if(power == 1){
                player.getMainHandItem().shrink(1);
                world.setBlockAndUpdate(pos, state.setValue(EYES, 5));
            }
        } else if(player.getMainHandItem().isEmpty()){
            if(power == 1 || power == 2){
                player.inventory.add(new ItemStack(Items.DIAMOND, 1));
                world.setBlockAndUpdate(pos, state.setValue(EYES, power-1));
            }
            if(power == 3 || power == 4){
                player.inventory.add(new ItemStack(Items.EMERALD, 1));
                world.setBlockAndUpdate(pos, state.setValue(EYES, power == 3 ? 0 : 3));
            }
            if(power == 5){
                player.inventory.add(new ItemStack(Items.EMERALD, 1));
                world.setBlockAndUpdate(pos, state.setValue(EYES, 1));
            }
        }
    }




    //----------------------------------------SUPPORT----------------------------------------//

    @Override
    public boolean hasTileEntity(BlockState state) {
        return false;
    }

    public boolean isSignalSource(BlockState state) {
        return state.getValue(EYES) > 0;
    }

    public int getSignal(BlockState blockState, IBlockReader blockAccess, BlockPos pos, Direction side) {
        int eyes = blockState.getValue(EYES);
        if(eyes == 1 || eyes == 3){
            return 6;
        }
        if(eyes == 2 || eyes == 4){
            return 15;
        }
        if(eyes == 5){
            return 10;
        }
        return 0;
    }

    public int getDirectSignal(BlockState blockState, IBlockReader blockAccess, BlockPos pos, Direction side) {
        return blockState.getSignal(blockAccess, pos, side);
    }

    protected void createBlockStateDefinition(StateContainer.Builder<Block, BlockState> builder) {
        builder.add(FACING, EYES);
    }

    @Deprecated
    public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {
        Direction enumfacing = state.getValue(FACING);
        switch(enumfacing) {
            case NORTH: return AABB1;
            case SOUTH: return AABB3;
            case EAST:  return AABB2;
            case WEST:  return AABB0;
            default:
                return VoxelShapes.block();
        }
    }

}
