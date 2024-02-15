package mod.stairway.common.block;

import mod.lucky77.block.base.BlockBase;
import mod.lucky77.block.entity.BlockEntityBase;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.SimpleWaterloggedBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

import javax.annotation.Nullable;

public class BlockChain extends BlockBase implements SimpleWaterloggedBlock {
	
	public static final EnumProperty<Direction.Axis> AXIS        = BlockStateProperties.AXIS;
	public static final BooleanProperty              OFFSET      = BlockStateProperties.INVERTED;
	public static final BooleanProperty              WATERLOGGED = BlockStateProperties.WATERLOGGED;
	
	public static final VoxelShape AABB_X0 = Block.box(0, 3, 6, 16, 13, 10);
	public static final VoxelShape AABB_X1 = Block.box(0, 6, 3, 16, 10, 13);
	public static final VoxelShape AABB_Y0 = Block.box(6, 0, 3, 10, 16, 13);
	public static final VoxelShape AABB_Y1 = Block.box(3, 0, 6, 13, 16, 10);
	public static final VoxelShape AABB_Z0 = Block.box(6, 3, 0, 10, 13, 16);
	public static final VoxelShape AABB_Z1 = Block.box(3, 6, 0, 13, 10, 16);
	
	
	
	
	
	// ---------- ---------- ---------- ----------  CONSTRUCTOR  ---------- ---------- ---------- ---------- //
	
	/** Default Constructor */
	public BlockChain(Block block) {
		super(block);
		this.registerDefaultState(this.stateDefinition.any().setValue(AXIS, Direction.Axis.Y).setValue(OFFSET, false).setValue(WATERLOGGED, false));
	}
	
	
	
	
	
	// ---------- ---------- ---------- ----------  PLACEMENT  ---------- ---------- ---------- ---------- //
	
	@Nullable
	public BlockState getStateForPlacement(BlockPlaceContext context) {
		return this.defaultBlockState().setValue(AXIS, context.getClickedFace().getAxis()).setValue(OFFSET, isOffset(context.getClickedPos()));
	}
	
	/** Called by ItemBlocks after a block is set in the world, to allow post-place logic */
	public void setPlacedBy(Level worldIn, BlockPos pos, BlockState state, @Nullable LivingEntity placer, ItemStack stack) {
		worldIn.setBlock(pos, state.setValue(OFFSET, isOffset(pos)), 2);
	}
	
	
	
	
	
	
	
	// ---------- ---------- ---------- ----------  INTERACTION  ---------- ---------- ---------- ---------- //
	
	@Override
	public void interact(Level world, BlockPos pos, Player player, BlockEntityBase tile) {
	
	}
	
	
	
	
	
	// ---------- ---------- ---------- ----------  SUPPORT  ---------- ---------- ---------- ---------- //
	
	@Deprecated
	public VoxelShape getShape(BlockState state, BlockGetter getter, BlockPos pos, CollisionContext context) {
		Direction.Axis enumfacing = state.getValue(AXIS);
		boolean offset = state.getValue(OFFSET);
		switch(enumfacing) {
			case X:  return offset ? AABB_X1 : AABB_X0;
			case Y:  return offset ? AABB_Y1 : AABB_Y0;
			case Z:  return offset ? AABB_Z1 : AABB_Z0;
			default: return Shapes.block();
		}
	}
	
	public BlockState updateShape(BlockState stateIn, Direction facing, BlockState facingState, LevelAccessor worldIn, BlockPos currentPos, BlockPos facingPos) {
		if (stateIn.getValue(WATERLOGGED)) {
			worldIn.scheduleTick(currentPos, Fluids.WATER, Fluids.WATER.getTickDelay(worldIn));
		}
		return super.updateShape(stateIn, facing, facingState, worldIn, currentPos, facingPos);
	}
	
	@Override
	public boolean isLadder(BlockState state, LevelReader world, BlockPos pos, LivingEntity entity){
		return true;
	}
	
	public FluidState getFluidState(BlockState p_204507_1_) {
		return p_204507_1_.getValue(WATERLOGGED) ? Fluids.WATER.getSource(false) : super.getFluidState(p_204507_1_);
	}
	
	private boolean isOffset(BlockPos pos) {
		int counter = 0;
		if(Math.abs(pos.getX()) % 2 == 1) counter++;
		if(Math.abs(pos.getY()) % 2 == 1) counter++;
		if(Math.abs(pos.getZ()) % 2 == 1) counter++;
		return counter % 2 == 1;
	}
	
	
	
	
	
	// ---------- ---------- ---------- ----------  BLOCKSTATE  ---------- ---------- ---------- ---------- //
	
	protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
		builder.add(AXIS, OFFSET, WATERLOGGED);
	}
	
	public BlockState rotate(BlockState state, Rotation value) {
		switch(value) {
			case COUNTERCLOCKWISE_90:
			case CLOCKWISE_90:
				switch(state.getValue(AXIS)) {
					case X:  return state.setValue(AXIS, Direction.Axis.Z);
					case Z:  return state.setValue(AXIS, Direction.Axis.X);
					default: return state;
				}
			default: return state;
		}
	}
	
	
	
}
