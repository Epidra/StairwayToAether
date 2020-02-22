package mod.stairway.blocks;

import mod.shared.blocks.BlockBlock;
import mod.stairway.StairKeeper;
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.item.ItemStack;
import net.minecraft.state.DirectionProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.Mirror;
import net.minecraft.util.Rotation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IWorldReader;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.Random;

public class BlockEmitter extends BlockBlock {

    public static final DirectionProperty FACING = BlockStateProperties.FACING;

    /** Default Constructor */
    public BlockEmitter(String modid, String name, Block block) {
        super(modid, name, Properties.from(block).needsRandomTick());
        this.setDefaultState(this.stateContainer.getBaseState().with(FACING, EnumFacing.NORTH));
    }

    protected void fillStateContainer(StateContainer.Builder<Block, IBlockState> builder) {
        builder.add(FACING);
    }

    public IBlockState rotate(IBlockState state, Rotation rot) {
        return state.with(FACING, rot.rotate(state.get(FACING)));
    }

    public IBlockState mirror(IBlockState state, Mirror mirrorIn) {
        return state.rotate(mirrorIn.toRotation(state.get(FACING)));
    }

    /**
     * How many world ticks before ticking
     */
    public int tickRate(IWorldReader worldIn) {
        return 1;
    }

    public void tick(IBlockState state, World worldIn, BlockPos pos, Random random) {
        int power = worldIn.getRedstonePowerFromNeighbors(pos);
        EnumFacing facing = state.get(FACING);
        setLightBlocks(state, worldIn, pos, power, facing);
    }

    @Deprecated
    public void neighborChanged(IBlockState state, World world, BlockPos pos, Block blockIn, BlockPos fromPos) {
        int power = world.getRedstonePowerFromNeighbors(pos);
        EnumFacing facing = state.get(FACING);
        setLightBlocks(state, world, pos, power, facing);
    }

    public void onBlockPlacedBy(World world, BlockPos pos, IBlockState state, @Nullable EntityLivingBase placer, ItemStack stack) {
        int power = world.getRedstonePowerFromNeighbors(pos);
        EnumFacing facing = state.get(FACING);
        setLightBlocks(state, world, pos, power, facing);
    }

    public void setLightBlocks(IBlockState state, World world, BlockPos pos, int power, EnumFacing facing){
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

    public boolean onBlockActivated(IBlockState state, World world, BlockPos pos, EntityPlayer player, EnumHand hand, EnumFacing side, float hitX, float hitY, float hitZ){
        if (world.isRemote) {
            return true;
        } else {
            if(player.getHeldItem(hand).getItem() == Items.INK_SAC){      world.setBlockState(pos, StairKeeper.BLOCK_EMITTER_BLACK.getDefaultState().with(FACING, state.get(FACING)), 2);  }
            if(player.getHeldItem(hand).getItem() == Items.LAPIS_LAZULI){       world.setBlockState(pos, StairKeeper.BLOCK_EMITTER_BLUE.getDefaultState().with(FACING, state.get(FACING)), 2);  }
            if(player.getHeldItem(hand).getItem() == Items.COCOA_BEANS){      world.setBlockState(pos, StairKeeper.BLOCK_EMITTER_BROWN.getDefaultState().with(FACING, state.get(FACING)), 2);  }
            if(player.getHeldItem(hand).getItem() == Items.CYAN_DYE){       world.setBlockState(pos, StairKeeper.BLOCK_EMITTER_CYAN.getDefaultState().with(FACING, state.get(FACING)), 2);  }
            if(player.getHeldItem(hand).getItem() == Items.GRAY_DYE){       world.setBlockState(pos, StairKeeper.BLOCK_EMITTER_GRAY.getDefaultState().with(FACING, state.get(FACING)), 2);  }
            if(player.getHeldItem(hand).getItem() == Items.CACTUS_GREEN){      world.setBlockState(pos, StairKeeper.BLOCK_EMITTER_GREEN.getDefaultState().with(FACING, state.get(FACING)), 2);  }
            if(player.getHeldItem(hand).getItem() == Items.LIGHT_BLUE_DYE){ world.setBlockState(pos, StairKeeper.BLOCK_EMITTER_LIGHTBLUE.getDefaultState().with(FACING, state.get(FACING)), 2);  }
            if(player.getHeldItem(hand).getItem() == Items.LIME_DYE){       world.setBlockState(pos, StairKeeper.BLOCK_EMITTER_LIME.getDefaultState().with(FACING, state.get(FACING)), 2);  }
            if(player.getHeldItem(hand).getItem() == Items.MAGENTA_DYE){    world.setBlockState(pos, StairKeeper.BLOCK_EMITTER_MAGENTA.getDefaultState().with(FACING, state.get(FACING)), 2);  }
            if(player.getHeldItem(hand).getItem() == Items.ORANGE_DYE){     world.setBlockState(pos, StairKeeper.BLOCK_EMITTER_ORANGE.getDefaultState().with(FACING, state.get(FACING)), 2);  }
            if(player.getHeldItem(hand).getItem() == Items.PINK_DYE){       world.setBlockState(pos, StairKeeper.BLOCK_EMITTER_PINK.getDefaultState().with(FACING, state.get(FACING)), 2);  }
            if(player.getHeldItem(hand).getItem() == Items.PURPLE_DYE){     world.setBlockState(pos, StairKeeper.BLOCK_EMITTER_PURPLE.getDefaultState().with(FACING, state.get(FACING)), 2);  }
            if(player.getHeldItem(hand).getItem() == Items.ROSE_RED){        world.setBlockState(pos, StairKeeper.BLOCK_EMITTER_RED.getDefaultState().with(FACING, state.get(FACING)), 2);  }
            if(player.getHeldItem(hand).getItem() == Items.LIGHT_GRAY_DYE){ world.setBlockState(pos, StairKeeper.BLOCK_EMITTER_SILVER.getDefaultState().with(FACING, state.get(FACING)), 2);  }
            if(player.getHeldItem(hand).getItem() == Items.BONE_MEAL){      world.setBlockState(pos, StairKeeper.BLOCK_EMITTER_WHITE.getDefaultState().with(FACING, state.get(FACING)), 2);  }
            if(player.getHeldItem(hand).getItem() == Items.DANDELION_YELLOW){     world.setBlockState(pos, StairKeeper.BLOCK_EMITTER_YELLOW.getDefaultState().with(FACING, state.get(FACING)), 2);  }
            return true;
        }
    }

    public BlockPos getOffset(EnumFacing facing, BlockPos pos, int i){
        if(facing == EnumFacing.UP)    return pos.add( 0, +i,  0);
        if(facing == EnumFacing.DOWN)  return pos.add( 0, -i,  0);
        if(facing == EnumFacing.NORTH) return pos.add( 0,  0, -i);
        if(facing == EnumFacing.SOUTH) return pos.add( 0,  0, +i);
        if(facing == EnumFacing.EAST)  return pos.add(+i,  0,  0);
        if(facing == EnumFacing.WEST)  return pos.add(-i,  0,  0);
        return pos;
    }

    public IBlockState getBlock(IBlockState state){
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

    public void onReplaced(IBlockState state, World worldIn, BlockPos pos, IBlockState newState, boolean isMoving) {
        EnumFacing facing = state.get(FACING);
        setLightBlocks(state, worldIn, pos, 0, facing);
    }

    public IBlockState getStateForPlacement(BlockItemUseContext context) {
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
