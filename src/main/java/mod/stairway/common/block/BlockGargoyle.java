package mod.stairway.common.block;

import mod.stairway.Register;
import mod.lucky77.block.base.MachinaBase;
import mod.lucky77.block.entity.BlockEntityBase;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

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
	public void interact(Level world, BlockPos pos, Player player, BlockEntityBase tile) {
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
				player.getInventory().add(new ItemStack(Items.DIAMOND, 1));
				world.setBlockAndUpdate(pos, state.setValue(EYES, power-1));
			}
			if(power == 3 || power == 4){
				player.getInventory().add(new ItemStack(Items.EMERALD, 1));
				world.setBlockAndUpdate(pos, state.setValue(EYES, power == 3 ? 0 : 3));
			}
			if(power == 5){
				player.getInventory().add(new ItemStack(Items.EMERALD, 1));
				world.setBlockAndUpdate(pos, state.setValue(EYES, 1));
			}
		}
	}
	
	
	
	
	
	//----------------------------------------SUPPORT----------------------------------------//
	
	public boolean isSignalSource(BlockState state) {
		return state.getValue(EYES) > 0;
	}
	
	public int getSignal(BlockState blockState, BlockGetter blockAccess, BlockPos pos, Direction side) {
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
	
	public int getDirectSignal(BlockState blockState, BlockGetter blockAccess, BlockPos pos, Direction side) {
		return blockState.getSignal(blockAccess, pos, side);
	}
	
	protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
		builder.add(FACING, EYES);
	}
	
	@Deprecated
	public VoxelShape getShape(BlockState state, BlockGetter getter, BlockPos pos, CollisionContext context) {
		Direction enumfacing = state.getValue(FACING);
		switch(enumfacing) {
			case NORTH: return AABB1;
			case SOUTH: return AABB3;
			case EAST:  return AABB2;
			case WEST:  return AABB0;
			default:
				return Shapes.block();
		}
	}
	
	
	
}


// Extention of Socket (unfinished)

// public class BlockGargoyle extends MachinaBase {
//
// 	public static final IntegerProperty SOCKET1 = IntegerProperty.create("socket1", 0, 7);
// 	public static final IntegerProperty SOCKET2 = IntegerProperty.create("socket2", 0, 7);
//
// 	public static final VoxelShape AABB0 = Block.box(1, 0, 4, 16, 16, 12);
// 	public static final VoxelShape AABB1 = Block.box(4, 0, 1, 12, 16, 16);
// 	public static final VoxelShape AABB2 = Block.box(0, 0, 4, 15, 16, 12);
// 	public static final VoxelShape AABB3 = Block.box(4, 0, 0, 12, 16, 15);
//
//
//
//
//
// 	// ---------- ---------- ---------- ----------  CONSTRUCTOR  ---------- ---------- ---------- ---------- //
//
// 	public BlockGargoyle(Block block) {
// 		super(block);
// 		this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.NORTH).setValue(SOCKET1, 0).setValue(SOCKET2, 0));
// 	}
//
//
//
//
//
// 	// ---------- ---------- ---------- ----------  PLACEMENT  ---------- ---------- ---------- ---------- //
//
// 	// ...
//
//
//
//
//
// 	// ---------- ---------- ---------- ----------  INTERACTION  ---------- ---------- ---------- ---------- //
//
// 	@Override
// 	public void interact(Level level, BlockPos pos, Player player, BlockEntityBase tile) {
// 		BlockState state = level.getBlockState(pos);
// 		if(player.getMainHandItem().getItem() == Items.DIAMOND                ) { setSocket(level, pos, player, state, 1); }
// 		if(player.getMainHandItem().getItem() == Items.EMERALD                ) { setSocket(level, pos, player, state, 2); }
// 		if(player.getMainHandItem().getItem() == Items.AMETHYST_SHARD         ) { setSocket(level, pos, player, state, 3); }
// 		// if(ModRegister.exists("acecraft"))
// 		// if(player.getMainHandItem().getItem() == Register.STUFF_RUBY.get(    )) { setSocket(level, pos, player, state, 4); }
// 		// if(player.getMainHandItem().getItem() == Register.STUFF_AURORITE.get()) { setSocket(level, pos, player, state, 5); }
// 		// if(player.getMainHandItem().getItem() == Register.STUFF_TOPAZ.get(   )) { setSocket(level, pos, player, state, 6); }
// 		// end if
// 		if(player.getMainHandItem().isEmpty()                                 ) { getSocket(level, pos, player, state   ); }
//
// 	}
//
//
//
//
//
// 	// ---------- ---------- ---------- ----------  SUPPORT  ---------- ---------- ---------- ---------- //
//
// 	@Deprecated
// 	public VoxelShape getShape(BlockState state, BlockGetter getter, BlockPos pos, CollisionContext context) {
// 		Direction enumfacing = state.getValue(FACING);
// 		switch(enumfacing) {
// 			case NORTH: return AABB1;
// 			case SOUTH: return AABB3;
// 			case EAST:  return AABB2;
// 			case WEST:  return AABB0;
// 			default:
// 				return Shapes.block();
// 		}
// 	}
//
// 	public boolean isSignalSource(BlockState state) {
// 		return state.getValue(SOCKET1) > 0 && state.getValue(SOCKET2) > 0;
// 	}
//
// 	public int getSignal(BlockState blockState, BlockGetter blockAccess, BlockPos pos, Direction side) {
// 		int socket_1 = blockState.getValue(SOCKET1);
// 		int socket_2 = blockState.getValue(SOCKET2);
// 		if(socket_1 == 0 && socket_2 == 0) return  0;
// 		if(socket_1 >  0 && socket_2 == 0) return  6;
// 		if(socket_1 == 0 && socket_2 >  0) return  6;
// 		if(socket_1      != socket_2     ) return 10;
// 		if(socket_1      == socket_2     ) return 15;
// 		return 0;
// 	}
//
// 	public int getDirectSignal(BlockState blockState, BlockGetter blockAccess, BlockPos pos, Direction side) {
// 		return blockState.getSignal(blockAccess, pos, side);
// 	}
//
// 	private void setSocket(Level world, BlockPos pos, Player player, BlockState state, int value) {
// 		int socket_1 = state.getValue(SOCKET1);
// 		int socket_2 = state.getValue(SOCKET2);
// 		     if(socket_1 == 0) { player.getMainHandItem().shrink(1); world.setBlockAndUpdate(pos, state.setValue(SOCKET1, value)); }
// 		else if(socket_2 == 0) { player.getMainHandItem().shrink(1); world.setBlockAndUpdate(pos, state.setValue(SOCKET2, value)); }
// 	}
//
// 	private void getSocket(Level world, BlockPos pos, Player player, BlockState state) {
// 		int socket_1 = state.getValue(SOCKET1);
// 		int socket_2 = state.getValue(SOCKET2);
// 		if(socket_2 > 0) {
// 			if(socket_2 == 1) { player.getInventory().add(new ItemStack(Items.DIAMOND,                 1)); world.setBlockAndUpdate(pos, state.setValue(SOCKET2, 0)); }
// 			if(socket_2 == 2) { player.getInventory().add(new ItemStack(Items.EMERALD,                 1)); world.setBlockAndUpdate(pos, state.setValue(SOCKET2, 0)); }
// 			if(socket_2 == 3) { player.getInventory().add(new ItemStack(Items.AMETHYST_SHARD,          1)); world.setBlockAndUpdate(pos, state.setValue(SOCKET2, 0)); }
// 			// if
// 			// if(socket_2 == 4) { player.getInventory().add(new ItemStack(Register.STUFF_RUBY.get(),     1)); world.setBlockAndUpdate(pos, state.setValue(SOCKET2, 0)); }
// 			// if(socket_2 == 5) { player.getInventory().add(new ItemStack(Register.STUFF_AURORITE.get(), 1)); world.setBlockAndUpdate(pos, state.setValue(SOCKET2, 0)); }
// 			// if(socket_2 == 6) { player.getInventory().add(new ItemStack(Register.STUFF_TOPAZ.get(),    1)); world.setBlockAndUpdate(pos, state.setValue(SOCKET2, 0)); }
// 			// end
// 		} else if(socket_1 > 0){
// 			if(socket_1 == 1) { player.getInventory().add(new ItemStack(Items.DIAMOND,                 1)); world.setBlockAndUpdate(pos, state.setValue(SOCKET1, 0)); }
// 			if(socket_1 == 2) { player.getInventory().add(new ItemStack(Items.EMERALD,                 1)); world.setBlockAndUpdate(pos, state.setValue(SOCKET1, 0)); }
// 			if(socket_1 == 3) { player.getInventory().add(new ItemStack(Items.AMETHYST_SHARD,          1)); world.setBlockAndUpdate(pos, state.setValue(SOCKET1, 0)); }
// 			// if
// 			// if(socket_1 == 4) { player.getInventory().add(new ItemStack(Register.STUFF_RUBY.get(),     1)); world.setBlockAndUpdate(pos, state.setValue(SOCKET1, 0)); }
// 			// if(socket_1 == 5) { player.getInventory().add(new ItemStack(Register.STUFF_AURORITE.get(), 1)); world.setBlockAndUpdate(pos, state.setValue(SOCKET1, 0)); }
// 			// if(socket_1 == 6) { player.getInventory().add(new ItemStack(Register.STUFF_TOPAZ.get(),    1)); world.setBlockAndUpdate(pos, state.setValue(SOCKET1, 0)); }
// 			// end
// 		}
// 	}
//
//
//
//
//
// 	// ---------- ---------- ---------- ----------  BLOCKSTATE  ---------- ---------- ---------- ---------- //
//
// 	protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
// 		builder.add(FACING, SOCKET1, SOCKET2);
// 	}
//
//
//
// }
