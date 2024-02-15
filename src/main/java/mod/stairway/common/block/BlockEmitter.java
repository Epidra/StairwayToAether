package mod.stairway.common.block;

import mod.stairway.Register;
import mod.lucky77.block.base.MachinaCube;
import mod.lucky77.block.entity.BlockEntityBase;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.util.RandomSource;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;

import javax.annotation.Nullable;

public class BlockEmitter extends MachinaCube {
	
	// ...
	
	
	
	
	
	// ---------- ---------- ---------- ----------  CONSTRUCTOR  ---------- ---------- ---------- ---------- //
	
	/** Default Constructor */
	public BlockEmitter(Block block) {
		super(block);
	}
	
	
	
	
	
	// ---------- ---------- ---------- ----------  PLACEMENT  ---------- ---------- ---------- ---------- //
	
	public BlockState getStateForPlacement(BlockPlaceContext context) {
		return this.defaultBlockState().setValue(FACING, context.getNearestLookingDirection().getOpposite());
	}
	
	public void setPlacedBy(Level world, BlockPos pos, BlockState state, @Nullable LivingEntity placer, ItemStack stack) {
		int power = world.getBestNeighborSignal(pos);
		Direction facing = state.getValue(FACING);
		setLightBlocks(state, world, pos, power, facing);
	}
	
	public void onRemove(BlockState state, Level worldIn, BlockPos pos, BlockState newState, boolean isMoving) {
		Direction facing = state.getValue(FACING);
		setLightBlocks(state, worldIn, pos, 0, facing);
	}
	
	
	
	
	
	// ---------- ---------- ---------- ----------  INTERACTION  ---------- ---------- ---------- ---------- //
	
	@Override
	public void interact(Level world, BlockPos pos, Player player, BlockEntityBase tile) {
		if(player.getMainHandItem().getItem() == Items.BLACK_DYE){      world.setBlock(pos, Register.BLOCK_EMITTER_BLACK.get(     ).defaultBlockState().setValue(FACING, world.getBlockState(pos).getValue(FACING)), 2);  }
		if(player.getMainHandItem().getItem() == Items.BLUE_DYE){       world.setBlock(pos, Register.BLOCK_EMITTER_BLUE.get(      ).defaultBlockState().setValue(FACING, world.getBlockState(pos).getValue(FACING)), 2);  }
		if(player.getMainHandItem().getItem() == Items.BROWN_DYE){      world.setBlock(pos, Register.BLOCK_EMITTER_BROWN.get(     ).defaultBlockState().setValue(FACING, world.getBlockState(pos).getValue(FACING)), 2);  }
		if(player.getMainHandItem().getItem() == Items.CYAN_DYE){       world.setBlock(pos, Register.BLOCK_EMITTER_CYAN.get(      ).defaultBlockState().setValue(FACING, world.getBlockState(pos).getValue(FACING)), 2);  }
		if(player.getMainHandItem().getItem() == Items.GRAY_DYE){       world.setBlock(pos, Register.BLOCK_EMITTER_GRAY.get(      ).defaultBlockState().setValue(FACING, world.getBlockState(pos).getValue(FACING)), 2);  }
		if(player.getMainHandItem().getItem() == Items.GREEN_DYE){      world.setBlock(pos, Register.BLOCK_EMITTER_GREEN.get(     ).defaultBlockState().setValue(FACING, world.getBlockState(pos).getValue(FACING)), 2);  }
		if(player.getMainHandItem().getItem() == Items.LIGHT_BLUE_DYE){ world.setBlock(pos, Register.BLOCK_EMITTER_LIGHT_BLUE.get().defaultBlockState().setValue(FACING, world.getBlockState(pos).getValue(FACING)), 2);  }
		if(player.getMainHandItem().getItem() == Items.LIME_DYE){       world.setBlock(pos, Register.BLOCK_EMITTER_LIME.get(      ).defaultBlockState().setValue(FACING, world.getBlockState(pos).getValue(FACING)), 2);  }
		if(player.getMainHandItem().getItem() == Items.MAGENTA_DYE){    world.setBlock(pos, Register.BLOCK_EMITTER_MAGENTA.get(   ).defaultBlockState().setValue(FACING, world.getBlockState(pos).getValue(FACING)), 2);  }
		if(player.getMainHandItem().getItem() == Items.ORANGE_DYE){     world.setBlock(pos, Register.BLOCK_EMITTER_ORANGE.get(    ).defaultBlockState().setValue(FACING, world.getBlockState(pos).getValue(FACING)), 2);  }
		if(player.getMainHandItem().getItem() == Items.PINK_DYE){       world.setBlock(pos, Register.BLOCK_EMITTER_PINK.get(      ).defaultBlockState().setValue(FACING, world.getBlockState(pos).getValue(FACING)), 2);  }
		if(player.getMainHandItem().getItem() == Items.PURPLE_DYE){     world.setBlock(pos, Register.BLOCK_EMITTER_PURPLE.get(    ).defaultBlockState().setValue(FACING, world.getBlockState(pos).getValue(FACING)), 2);  }
		if(player.getMainHandItem().getItem() == Items.RED_DYE){        world.setBlock(pos, Register.BLOCK_EMITTER_RED.get(       ).defaultBlockState().setValue(FACING, world.getBlockState(pos).getValue(FACING)), 2);  }
		if(player.getMainHandItem().getItem() == Items.LIGHT_GRAY_DYE){ world.setBlock(pos, Register.BLOCK_EMITTER_LIGHT_GRAY.get().defaultBlockState().setValue(FACING, world.getBlockState(pos).getValue(FACING)), 2);  }
		if(player.getMainHandItem().getItem() == Items.WHITE_DYE){      world.setBlock(pos, Register.BLOCK_EMITTER_WHITE.get(     ).defaultBlockState().setValue(FACING, world.getBlockState(pos).getValue(FACING)), 2);  }
		if(player.getMainHandItem().getItem() == Items.YELLOW_DYE){     world.setBlock(pos, Register.BLOCK_EMITTER_YELLOW.get(    ).defaultBlockState().setValue(FACING, world.getBlockState(pos).getValue(FACING)), 2);  }
	}
	
	
	
	
	
	// ---------- ---------- ---------- ----------  UPDATE  ---------- ---------- ---------- ---------- //
	
	public void animateTick(BlockState state, Level level, BlockPos pos, RandomSource random) {
		int power = level.getBestNeighborSignal(pos);
		Direction facing = state.getValue(FACING);
		setLightBlocks(state, level, pos, power, facing);
	}
	
	public void neighborChanged(BlockState state, Level world, BlockPos pos, Block blockIn, BlockPos fromPos, boolean isMoving) {
		int power = world.getBestNeighborSignal(pos);
		Direction facing = state.getValue(FACING);
		setLightBlocks(state, world, pos, power, facing);
	}
	
	
	
	
	
	// ---------- ---------- ---------- ----------  SUPPORT  ---------- ---------- ---------- ---------- //
	
	private void setLightBlocks(BlockState state, Level world, BlockPos pos, int power, Direction facing){
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
		if(facing == Direction.UP   ) return pos.offset( 0, +i,  0);
		if(facing == Direction.DOWN ) return pos.offset( 0, -i,  0);
		if(facing == Direction.NORTH) return pos.offset( 0,  0, -i);
		if(facing == Direction.SOUTH) return pos.offset( 0,  0, +i);
		if(facing == Direction.EAST ) return pos.offset(+i,  0,  0);
		if(facing == Direction.WEST ) return pos.offset(-i,  0,  0);
		return pos;
	}
	
	private BlockState getBlock(BlockState state){
		if(state.getBlock() == Register.BLOCK_EMITTER_BLACK.get(     )) return Register.BLOCK_LIGHT_BLACK.get(     ).defaultBlockState();
		if(state.getBlock() == Register.BLOCK_EMITTER_BLUE.get(      )) return Register.BLOCK_LIGHT_BLUE.get(      ).defaultBlockState();
		if(state.getBlock() == Register.BLOCK_EMITTER_BROWN.get(     )) return Register.BLOCK_LIGHT_BROWN.get(     ).defaultBlockState();
		if(state.getBlock() == Register.BLOCK_EMITTER_CYAN.get(      )) return Register.BLOCK_LIGHT_CYAN.get(      ).defaultBlockState();
		if(state.getBlock() == Register.BLOCK_EMITTER_GRAY.get(      )) return Register.BLOCK_LIGHT_GRAY.get(      ).defaultBlockState();
		if(state.getBlock() == Register.BLOCK_EMITTER_GREEN.get(     )) return Register.BLOCK_LIGHT_GREEN.get(     ).defaultBlockState();
		if(state.getBlock() == Register.BLOCK_EMITTER_LIGHT_BLUE.get()) return Register.BLOCK_LIGHT_LIGHT_BLUE.get().defaultBlockState();
		if(state.getBlock() == Register.BLOCK_EMITTER_LIME.get(      )) return Register.BLOCK_LIGHT_LIME.get(      ).defaultBlockState();
		if(state.getBlock() == Register.BLOCK_EMITTER_MAGENTA.get(   )) return Register.BLOCK_LIGHT_MAGENTA.get(   ).defaultBlockState();
		if(state.getBlock() == Register.BLOCK_EMITTER_ORANGE.get(    )) return Register.BLOCK_LIGHT_ORANGE.get(    ).defaultBlockState();
		if(state.getBlock() == Register.BLOCK_EMITTER_PINK.get(      )) return Register.BLOCK_LIGHT_PINK.get(      ).defaultBlockState();
		if(state.getBlock() == Register.BLOCK_EMITTER_PURPLE.get(    )) return Register.BLOCK_LIGHT_PURPLE.get(    ).defaultBlockState();
		if(state.getBlock() == Register.BLOCK_EMITTER_RED.get(       )) return Register.BLOCK_LIGHT_RED.get(       ).defaultBlockState();
		if(state.getBlock() == Register.BLOCK_EMITTER_LIGHT_GRAY.get()) return Register.BLOCK_LIGHT_LIGHT_GRAY.get().defaultBlockState();
		if(state.getBlock() == Register.BLOCK_EMITTER_WHITE.get(     )) return Register.BLOCK_LIGHT_WHITE.get(     ).defaultBlockState();
		if(state.getBlock() == Register.BLOCK_EMITTER_YELLOW.get(    )) return Register.BLOCK_LIGHT_YELLOW.get(    ).defaultBlockState();
		return Register.BLOCK_LIGHT_BLACK.get().defaultBlockState();
	}
	
	
	
}
