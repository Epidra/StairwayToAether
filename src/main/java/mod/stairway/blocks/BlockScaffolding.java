package mod.stairway.blocks;

import java.util.List;
import java.util.Random;

import javax.annotation.Nullable;

import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.BlockHorizontal;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.EnumDyeColor;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumBlockRenderType;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.Mirror;
import net.minecraft.util.Rotation;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import mod.stairway.StairKeeper;

public class BlockScaffolding extends BlockContainer {
	
	public static final PropertyDirection FACING = BlockHorizontal.FACING;
	public static final PropertyEnum<EnumDyeColor> COLOR = PropertyEnum.create("color", EnumDyeColor.class);
	
	public static final AxisAlignedBB AABB_A = new AxisAlignedBB(0.4D, 0.0D, 0.4D, 0.6D, 1.0D, 0.6D);
	
	public static final AxisAlignedBB AABB_B = new AxisAlignedBB(0.4D, 0.0D, 0.4D, 0.6D, 1.0D, 1.0D);
	public static final AxisAlignedBB AABB_C = new AxisAlignedBB(0.4D, 0.0D, 0.4D, 1.0D, 1.0D, 0.6D);
	public static final AxisAlignedBB AABB_D = new AxisAlignedBB(0.0D, 0.0D, 0.4D, 0.6D, 1.0D, 0.6D);
	public static final AxisAlignedBB AABB_E = new AxisAlignedBB(0.4D, 0.0D, 0.0D, 0.6D, 1.0D, 0.6D);
	
	public static final AxisAlignedBB AABB_F = new AxisAlignedBB(0.0D, 0.0D, 0.4D, 1.0D, 1.0D, 0.6D);
	public static final AxisAlignedBB AABB_G = new AxisAlignedBB(0.4D, 0.0D, 0.0D, 0.6D, 1.0D, 1.0D);
	
	public static final AxisAlignedBB AABB_H = new AxisAlignedBB(0.4D, 0.0D, 0.4D, 1.0D, 1.0D, 1.0D);
	public static final AxisAlignedBB AABB_I = new AxisAlignedBB(0.0D, 0.0D, 0.4D, 0.6D, 1.0D, 1.0D);
	public static final AxisAlignedBB AABB_J = new AxisAlignedBB(0.0D, 0.0D, 0.0D, 0.6D, 1.0D, 0.6D);
	public static final AxisAlignedBB AABB_K = new AxisAlignedBB(0.4D, 0.0D, 0.0D, 1.0D, 1.0D, 0.6D);
	
	public static final AxisAlignedBB AABB_L = new AxisAlignedBB(0.0D, 0.0D, 0.4D, 1.0D, 1.0D, 1.0D);
	public static final AxisAlignedBB AABB_M = new AxisAlignedBB(0.4D, 0.0D, 0.0D, 1.0D, 1.0D, 1.0D);
	public static final AxisAlignedBB AABB_N = new AxisAlignedBB(0.0D, 0.0D, 0.0D, 0.6D, 1.0D, 1.0D);
	public static final AxisAlignedBB AABB_O = new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 1.0D, 0.6D);
	
	public static final AxisAlignedBB AABB_P = new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 1.0D, 1.0D);
	
	public BlockScaffolding(String name) {
		super(Material.WOOD);
		this.setUnlocalizedName(name);
		this.setRegistryName(name);
		this.setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		this.setHardness(0.2f);
		this.setResistance(0.2f);
		this.setSoundType(SoundType.WOOD);
		this.setHarvestLevel("axe", 0);
		this.setTickRandomly(false);
		this.setDefaultState(this.blockState.getBaseState().withProperty(FACING, EnumFacing.NORTH).withProperty(COLOR, EnumDyeColor.WHITE));
		this.setTickRandomly(true);
	}
	
	public boolean isFullCube(IBlockState state){
        return false;
    }
	
	public boolean isOpaqueCube(IBlockState state){
        return false;
    }
	
	@SideOnly(Side.CLIENT)
    public BlockRenderLayer getBlockLayer(){
        return BlockRenderLayer.TRANSLUCENT;
    }
	
	public boolean isLadder(IBlockState state, IBlockAccess world, BlockPos pos, EntityLivingBase entity) {
		return true;
	}
	
	public void addCollisionBoxToList(IBlockState state, World worldIn, BlockPos pos, AxisAlignedBB entityBox, List<AxisAlignedBB> collidingBoxes, @Nullable Entity entityIn){
		addCollisionBoxToList(pos, entityBox, collidingBoxes, getAABB(state));
    }   

    public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos){
    	return getAABB(state);
    }
	
    private AxisAlignedBB getAABB(IBlockState state){
    	EnumDyeColor color = state.getValue(COLOR);
    	EnumFacing   direc = state.getValue(FACING);
    	
	    if(color == EnumDyeColor.BLACK      && direc == EnumFacing.NORTH) return AABB_P; 
    	if(color == EnumDyeColor.RED        && direc == EnumFacing.NORTH) return AABB_P; 
    	if(color == EnumDyeColor.RED        && direc == EnumFacing.EAST ) return AABB_P; 
    	if(color == EnumDyeColor.RED        && direc == EnumFacing.SOUTH) return AABB_P; 
    	if(color == EnumDyeColor.RED        && direc == EnumFacing.WEST ) return AABB_P;
    	if(color == EnumDyeColor.GREEN      && direc == EnumFacing.NORTH) return AABB_P; 
    	if(color == EnumDyeColor.GREEN      && direc == EnumFacing.EAST ) return AABB_P;
    	if(color == EnumDyeColor.BROWN      && direc == EnumFacing.NORTH) return AABB_P; 
    	if(color == EnumDyeColor.BROWN      && direc == EnumFacing.EAST ) return AABB_P; 
    	if(color == EnumDyeColor.BROWN      && direc == EnumFacing.SOUTH) return AABB_P;
    	if(color == EnumDyeColor.BROWN      && direc == EnumFacing.WEST ) return AABB_P;
    	if(color == EnumDyeColor.BLUE       && direc == EnumFacing.NORTH) return AABB_P;
    	if(color == EnumDyeColor.BLUE       && direc == EnumFacing.EAST ) return AABB_P;
    	if(color == EnumDyeColor.BLUE       && direc == EnumFacing.SOUTH) return AABB_P;
    	if(color == EnumDyeColor.BLUE       && direc == EnumFacing.WEST ) return AABB_P;
    	if(color == EnumDyeColor.SILVER     && direc == EnumFacing.NORTH) return AABB_O;
    	if(color == EnumDyeColor.SILVER     && direc == EnumFacing.EAST ) return AABB_M;
    	if(color == EnumDyeColor.SILVER     && direc == EnumFacing.SOUTH) return AABB_L;
    	if(color == EnumDyeColor.SILVER     && direc == EnumFacing.WEST ) return AABB_N;
    	if(color == EnumDyeColor.PURPLE     && direc == EnumFacing.NORTH) return AABB_M;
    	if(color == EnumDyeColor.PURPLE     && direc == EnumFacing.EAST ) return AABB_L;
    	if(color == EnumDyeColor.PURPLE     && direc == EnumFacing.SOUTH) return AABB_N;
    	if(color == EnumDyeColor.PURPLE     && direc == EnumFacing.WEST ) return AABB_O;
    	if(color == EnumDyeColor.CYAN       && direc == EnumFacing.NORTH) return AABB_L;
    	if(color == EnumDyeColor.CYAN       && direc == EnumFacing.EAST ) return AABB_N;
    	if(color == EnumDyeColor.CYAN       && direc == EnumFacing.SOUTH) return AABB_O;
    	if(color == EnumDyeColor.CYAN       && direc == EnumFacing.WEST ) return AABB_M;
    	if(color == EnumDyeColor.GRAY       && direc == EnumFacing.NORTH) return AABB_K;
    	if(color == EnumDyeColor.GRAY       && direc == EnumFacing.EAST ) return AABB_H;
    	if(color == EnumDyeColor.GRAY       && direc == EnumFacing.SOUTH) return AABB_I;
    	if(color == EnumDyeColor.GRAY       && direc == EnumFacing.WEST ) return AABB_J;
    	if(color == EnumDyeColor.YELLOW     && direc == EnumFacing.NORTH) return AABB_P;                                                  
    	if(color == EnumDyeColor.PINK       && direc == EnumFacing.NORTH) return AABB_O;
    	if(color == EnumDyeColor.PINK       && direc == EnumFacing.EAST ) return AABB_M;
    	if(color == EnumDyeColor.PINK       && direc == EnumFacing.SOUTH) return AABB_L; 
    	if(color == EnumDyeColor.PINK       && direc == EnumFacing.WEST ) return AABB_N; 
    	if(color == EnumDyeColor.LIME       && direc == EnumFacing.NORTH) return AABB_K; 
    	if(color == EnumDyeColor.LIME       && direc == EnumFacing.EAST ) return AABB_H; 
    	if(color == EnumDyeColor.LIME       && direc == EnumFacing.SOUTH) return AABB_I; 
    	if(color == EnumDyeColor.LIME       && direc == EnumFacing.WEST ) return AABB_J; 
    	if(color == EnumDyeColor.LIGHT_BLUE && direc == EnumFacing.NORTH) return AABB_G; 
    	if(color == EnumDyeColor.LIGHT_BLUE && direc == EnumFacing.EAST ) return AABB_F;                                                                                        
    	if(color == EnumDyeColor.MAGENTA    && direc == EnumFacing.NORTH) return AABB_E; 
    	if(color == EnumDyeColor.MAGENTA    && direc == EnumFacing.EAST ) return AABB_C; 
    	if(color == EnumDyeColor.MAGENTA    && direc == EnumFacing.SOUTH) return AABB_B; 
    	if(color == EnumDyeColor.MAGENTA    && direc == EnumFacing.WEST ) return AABB_D; 
    	return AABB_A;
    }
    
    public EnumBlockRenderType getRenderType(IBlockState state){
        return EnumBlockRenderType.MODEL;
    }
    
    public boolean canSilkHarvest(World world, BlockPos pos, IBlockState state, EntityPlayer player){
        return true;
    }
    
    public void randomTick(World worldIn, BlockPos pos, IBlockState state, Random random){
    	SearchNeighbour(worldIn, pos);
    }
    
    public void onBlockPlacedBy(World worldIn, BlockPos pos, IBlockState state, EntityLivingBase placer, ItemStack stack){
    	SearchNeighbour(worldIn, pos);
    }
    
    public void neighborChanged(IBlockState state, World worldIn, BlockPos pos, Block blockIn){
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
    	
    	EnumDyeColor color = world.getBlockState(pos).getValue(COLOR);
    	EnumFacing   direc = world.getBlockState(pos).getValue(FACING);
    	
    	     if(nn && ne && ee && se && ss && sw && ww && nw){ world.setBlockState(pos, world.getBlockState(pos).withProperty(COLOR, EnumDyeColor.BLACK)     .withProperty(FACING, EnumFacing.NORTH), 2); if(color != EnumDyeColor.BLACK      || direc != EnumFacing.NORTH) UpdateNeighbours(world, pos); } // XXX
                                                                                                                                                                                                                                                                                                            // XXX
                                                                                                                                                                                                                                                                                                            // XXX
    	else if(nn && ne && ee && se && ss && sw && ww      ){ world.setBlockState(pos, world.getBlockState(pos).withProperty(COLOR, EnumDyeColor.RED)       .withProperty(FACING, EnumFacing.NORTH), 2); if(color != EnumDyeColor.RED        || direc != EnumFacing.NORTH) UpdateNeighbours(world, pos); } // 'XX
    	else if(nn       && ee && se && ss && sw && ww && nw){ world.setBlockState(pos, world.getBlockState(pos).withProperty(COLOR, EnumDyeColor.RED)       .withProperty(FACING, EnumFacing.EAST) , 2); if(color != EnumDyeColor.RED        || direc != EnumFacing.EAST ) UpdateNeighbours(world, pos); } // XXX
    	else if(nn && ne && ee       && ss && sw && ww && nw){ world.setBlockState(pos, world.getBlockState(pos).withProperty(COLOR, EnumDyeColor.RED)       .withProperty(FACING, EnumFacing.SOUTH), 2); if(color != EnumDyeColor.RED        || direc != EnumFacing.SOUTH) UpdateNeighbours(world, pos); } // XXX
    	else if(nn && ne && ee && se && ss &&       ww && nw){ world.setBlockState(pos, world.getBlockState(pos).withProperty(COLOR, EnumDyeColor.RED)       .withProperty(FACING, EnumFacing.WEST) , 2); if(color != EnumDyeColor.RED        || direc != EnumFacing.WEST ) UpdateNeighbours(world, pos); }
    	else if(nn &&       ee && se && ss &&       ww && nw){ world.setBlockState(pos, world.getBlockState(pos).withProperty(COLOR, EnumDyeColor.GREEN)     .withProperty(FACING, EnumFacing.NORTH), 2); if(color != EnumDyeColor.GREEN      || direc != EnumFacing.NORTH) UpdateNeighbours(world, pos); } // XX'
    	else if(nn && ne && ee       && ss && sw && ww      ){ world.setBlockState(pos, world.getBlockState(pos).withProperty(COLOR, EnumDyeColor.GREEN)     .withProperty(FACING, EnumFacing.EAST) , 2); if(color != EnumDyeColor.GREEN      || direc != EnumFacing.EAST ) UpdateNeighbours(world, pos); } // XXX
    	                                                                                                                                                                                                                                                                                                    // 'XX
    	else if(nn       && ee && se && ss && sw && ww      ){ world.setBlockState(pos, world.getBlockState(pos).withProperty(COLOR, EnumDyeColor.BROWN)     .withProperty(FACING, EnumFacing.NORTH), 2); if(color != EnumDyeColor.BROWN      || direc != EnumFacing.NORTH) UpdateNeighbours(world, pos); } // 'X'
    	else if(nn       && ee &&       ss && sw && ww && nw){ world.setBlockState(pos, world.getBlockState(pos).withProperty(COLOR, EnumDyeColor.BROWN)     .withProperty(FACING, EnumFacing.EAST) , 2); if(color != EnumDyeColor.BROWN      || direc != EnumFacing.EAST ) UpdateNeighbours(world, pos); } // XXX
    	else if(nn && ne && ee &&       ss &&       ww && nw){ world.setBlockState(pos, world.getBlockState(pos).withProperty(COLOR, EnumDyeColor.BROWN)     .withProperty(FACING, EnumFacing.SOUTH), 2); if(color != EnumDyeColor.BROWN      || direc != EnumFacing.SOUTH) UpdateNeighbours(world, pos); } // XXX
    	else if(nn && ne && ee && se && ss &&       ww      ){ world.setBlockState(pos, world.getBlockState(pos).withProperty(COLOR, EnumDyeColor.BROWN)     .withProperty(FACING, EnumFacing.WEST) , 2); if(color != EnumDyeColor.BROWN      || direc != EnumFacing.WEST ) UpdateNeighbours(world, pos); }
    	else if(nn       && ee && se && ss &&       ww      ){ world.setBlockState(pos, world.getBlockState(pos).withProperty(COLOR, EnumDyeColor.BLUE)      .withProperty(FACING, EnumFacing.NORTH), 2); if(color != EnumDyeColor.BLUE       || direc != EnumFacing.NORTH) UpdateNeighbours(world, pos); } // 'X'
    	else if(nn       && ee &&       ss && sw && ww      ){ world.setBlockState(pos, world.getBlockState(pos).withProperty(COLOR, EnumDyeColor.BLUE)      .withProperty(FACING, EnumFacing.EAST) , 2); if(color != EnumDyeColor.BLUE       || direc != EnumFacing.EAST ) UpdateNeighbours(world, pos); } // XXX
    	else if(nn       && ee &&       ss &&       ww && nw){ world.setBlockState(pos, world.getBlockState(pos).withProperty(COLOR, EnumDyeColor.BLUE)      .withProperty(FACING, EnumFacing.SOUTH), 2); if(color != EnumDyeColor.BLUE       || direc != EnumFacing.SOUTH) UpdateNeighbours(world, pos); } // 'XX
    	else if(nn && ne && ee &&       ss &&       ww      ){ world.setBlockState(pos, world.getBlockState(pos).withProperty(COLOR, EnumDyeColor.BLUE)      .withProperty(FACING, EnumFacing.WEST) , 2); if(color != EnumDyeColor.BLUE       || direc != EnumFacing.WEST ) UpdateNeighbours(world, pos); }
    	else if(nn && ne && ee &&                   ww && nw){ world.setBlockState(pos, world.getBlockState(pos).withProperty(COLOR, EnumDyeColor.SILVER)    .withProperty(FACING, EnumFacing.NORTH), 2); if(color != EnumDyeColor.SILVER     || direc != EnumFacing.NORTH) UpdateNeighbours(world, pos); } // XXX
    	else if(nn && ne && ee && se && ss                  ){ world.setBlockState(pos, world.getBlockState(pos).withProperty(COLOR, EnumDyeColor.SILVER)    .withProperty(FACING, EnumFacing.EAST) , 2); if(color != EnumDyeColor.SILVER     || direc != EnumFacing.EAST ) UpdateNeighbours(world, pos); } // XXX
    	else if(            ee && se && ss && sw && ww      ){ world.setBlockState(pos, world.getBlockState(pos).withProperty(COLOR, EnumDyeColor.SILVER)    .withProperty(FACING, EnumFacing.SOUTH), 2); if(color != EnumDyeColor.SILVER     || direc != EnumFacing.SOUTH) UpdateNeighbours(world, pos); } // '''
    	else if(nn       &&             ss && sw && ww && nw){ world.setBlockState(pos, world.getBlockState(pos).withProperty(COLOR, EnumDyeColor.SILVER)    .withProperty(FACING, EnumFacing.WEST) , 2); if(color != EnumDyeColor.SILVER     || direc != EnumFacing.WEST ) UpdateNeighbours(world, pos); }
    	else if(nn       && ee && se && ss                  ){ world.setBlockState(pos, world.getBlockState(pos).withProperty(COLOR, EnumDyeColor.PURPLE)    .withProperty(FACING, EnumFacing.NORTH), 2); if(color != EnumDyeColor.PURPLE     || direc != EnumFacing.NORTH) UpdateNeighbours(world, pos); } // 'X'
    	else if(            ee &&       ss && sw && ww      ){ world.setBlockState(pos, world.getBlockState(pos).withProperty(COLOR, EnumDyeColor.PURPLE)    .withProperty(FACING, EnumFacing.EAST) , 2); if(color != EnumDyeColor.PURPLE     || direc != EnumFacing.EAST ) UpdateNeighbours(world, pos); } // 'XX
    	else if(nn       &&             ss &&       ww && nw){ world.setBlockState(pos, world.getBlockState(pos).withProperty(COLOR, EnumDyeColor.PURPLE)    .withProperty(FACING, EnumFacing.SOUTH), 2); if(color != EnumDyeColor.PURPLE     || direc != EnumFacing.SOUTH) UpdateNeighbours(world, pos); } // 'XX
    	else if(nn && ne && ee                   && ww      ){ world.setBlockState(pos, world.getBlockState(pos).withProperty(COLOR, EnumDyeColor.PURPLE)    .withProperty(FACING, EnumFacing.WEST) , 2); if(color != EnumDyeColor.PURPLE     || direc != EnumFacing.WEST ) UpdateNeighbours(world, pos); }
    	else if(            ee && se && ss &&       ww      ){ world.setBlockState(pos, world.getBlockState(pos).withProperty(COLOR, EnumDyeColor.CYAN)      .withProperty(FACING, EnumFacing.NORTH), 2); if(color != EnumDyeColor.CYAN       || direc != EnumFacing.NORTH) UpdateNeighbours(world, pos); } // '''
    	else if(nn       &&             ss && sw && ww      ){ world.setBlockState(pos, world.getBlockState(pos).withProperty(COLOR, EnumDyeColor.CYAN)      .withProperty(FACING, EnumFacing.EAST) , 2); if(color != EnumDyeColor.CYAN       || direc != EnumFacing.EAST ) UpdateNeighbours(world, pos); } // XXX
    	else if(nn       && ee &&                   ww && nw){ world.setBlockState(pos, world.getBlockState(pos).withProperty(COLOR, EnumDyeColor.CYAN)      .withProperty(FACING, EnumFacing.SOUTH), 2); if(color != EnumDyeColor.CYAN       || direc != EnumFacing.SOUTH) UpdateNeighbours(world, pos); } // 'XX
    	else if(nn && ne && ee &&       ss                  ){ world.setBlockState(pos, world.getBlockState(pos).withProperty(COLOR, EnumDyeColor.CYAN)      .withProperty(FACING, EnumFacing.WEST) , 2); if(color != EnumDyeColor.CYAN       || direc != EnumFacing.WEST ) UpdateNeighbours(world, pos); }
    	else if(nn && ne && ee                              ){ world.setBlockState(pos, world.getBlockState(pos).withProperty(COLOR, EnumDyeColor.GRAY)      .withProperty(FACING, EnumFacing.NORTH), 2); if(color != EnumDyeColor.GRAY       || direc != EnumFacing.NORTH) UpdateNeighbours(world, pos); } // 'XX
    	else if(            ee && se && ss                  ){ world.setBlockState(pos, world.getBlockState(pos).withProperty(COLOR, EnumDyeColor.GRAY)      .withProperty(FACING, EnumFacing.EAST) , 2); if(color != EnumDyeColor.GRAY       || direc != EnumFacing.EAST ) UpdateNeighbours(world, pos); } // 'XX
    	else if(                        ss && sw && ww      ){ world.setBlockState(pos, world.getBlockState(pos).withProperty(COLOR, EnumDyeColor.GRAY)      .withProperty(FACING, EnumFacing.SOUTH), 2); if(color != EnumDyeColor.GRAY       || direc != EnumFacing.SOUTH) UpdateNeighbours(world, pos); } // '''
    	else if(nn &&                               ww && nw){ world.setBlockState(pos, world.getBlockState(pos).withProperty(COLOR, EnumDyeColor.GRAY)      .withProperty(FACING, EnumFacing.WEST) , 2); if(color != EnumDyeColor.GRAY       || direc != EnumFacing.WEST ) UpdateNeighbours(world, pos); }
    	else if(nn &&       ee &&       ss &&       ww      ){ world.setBlockState(pos, world.getBlockState(pos).withProperty(COLOR, EnumDyeColor.YELLOW)    .withProperty(FACING, EnumFacing.NORTH), 2); if(color != EnumDyeColor.YELLOW     || direc != EnumFacing.NORTH) UpdateNeighbours(world, pos); } // 'X'
                                                                                                                                                                                                                                                                                                            // XXX
                                                                                                                                                                                                                                                                                                            // 'X'
    	else if(nn &&       ee &&                   ww      ){ world.setBlockState(pos, world.getBlockState(pos).withProperty(COLOR, EnumDyeColor.PINK)      .withProperty(FACING, EnumFacing.NORTH), 2); if(color != EnumDyeColor.PINK       || direc != EnumFacing.NORTH) UpdateNeighbours(world, pos); } // 'X'
    	else if(nn &&       ee &&       ss                  ){ world.setBlockState(pos, world.getBlockState(pos).withProperty(COLOR, EnumDyeColor.PINK)      .withProperty(FACING, EnumFacing.EAST) , 2); if(color != EnumDyeColor.PINK       || direc != EnumFacing.EAST ) UpdateNeighbours(world, pos); } // XXX
    	else if(            ee &&       ss &&       ww      ){ world.setBlockState(pos, world.getBlockState(pos).withProperty(COLOR, EnumDyeColor.PINK)      .withProperty(FACING, EnumFacing.SOUTH), 2); if(color != EnumDyeColor.PINK       || direc != EnumFacing.SOUTH) UpdateNeighbours(world, pos); } // '''
    	else if(nn &&                   ss &&       ww      ){ world.setBlockState(pos, world.getBlockState(pos).withProperty(COLOR, EnumDyeColor.PINK)      .withProperty(FACING, EnumFacing.WEST) , 2); if(color != EnumDyeColor.PINK       || direc != EnumFacing.WEST ) UpdateNeighbours(world, pos); }
    	else if(nn &&       ee                              ){ world.setBlockState(pos, world.getBlockState(pos).withProperty(COLOR, EnumDyeColor.LIME)      .withProperty(FACING, EnumFacing.NORTH), 2); if(color != EnumDyeColor.LIME       || direc != EnumFacing.NORTH) UpdateNeighbours(world, pos); } // 'X'
    	else if(            ee &&       ss                  ){ world.setBlockState(pos, world.getBlockState(pos).withProperty(COLOR, EnumDyeColor.LIME)      .withProperty(FACING, EnumFacing.EAST) , 2); if(color != EnumDyeColor.LIME       || direc != EnumFacing.EAST ) UpdateNeighbours(world, pos); } // 'XX
    	else if(                        ss &&       ww      ){ world.setBlockState(pos, world.getBlockState(pos).withProperty(COLOR, EnumDyeColor.LIME)      .withProperty(FACING, EnumFacing.SOUTH), 2); if(color != EnumDyeColor.LIME       || direc != EnumFacing.SOUTH) UpdateNeighbours(world, pos); } // '''
    	else if(nn &&                               ww      ){ world.setBlockState(pos, world.getBlockState(pos).withProperty(COLOR, EnumDyeColor.LIME)      .withProperty(FACING, EnumFacing.WEST) , 2); if(color != EnumDyeColor.LIME       || direc != EnumFacing.WEST ) UpdateNeighbours(world, pos); }
    	else if(nn &&                   ss                  ){ world.setBlockState(pos, world.getBlockState(pos).withProperty(COLOR, EnumDyeColor.LIGHT_BLUE).withProperty(FACING, EnumFacing.NORTH), 2); if(color != EnumDyeColor.LIGHT_BLUE || direc != EnumFacing.NORTH) UpdateNeighbours(world, pos); } // 'X'
    	else if(            ee &&                   ww      ){ world.setBlockState(pos, world.getBlockState(pos).withProperty(COLOR, EnumDyeColor.LIGHT_BLUE).withProperty(FACING, EnumFacing.EAST) , 2); if(color != EnumDyeColor.LIGHT_BLUE || direc != EnumFacing.EAST ) UpdateNeighbours(world, pos); } // 'X'
    	                                                                                                                                                                                                                                                                                                    // 'X'
    	else if(nn                                          ){ world.setBlockState(pos, world.getBlockState(pos).withProperty(COLOR, EnumDyeColor.MAGENTA)   .withProperty(FACING, EnumFacing.NORTH), 2); if(color != EnumDyeColor.MAGENTA    || direc != EnumFacing.NORTH) UpdateNeighbours(world, pos); } // 'X'
    	else if(            ee                              ){ world.setBlockState(pos, world.getBlockState(pos).withProperty(COLOR, EnumDyeColor.MAGENTA)   .withProperty(FACING, EnumFacing.EAST) , 2); if(color != EnumDyeColor.MAGENTA    || direc != EnumFacing.EAST ) UpdateNeighbours(world, pos); } // 'X'
    	else if(                        ss                  ){ world.setBlockState(pos, world.getBlockState(pos).withProperty(COLOR, EnumDyeColor.MAGENTA)   .withProperty(FACING, EnumFacing.SOUTH), 2); if(color != EnumDyeColor.MAGENTA    || direc != EnumFacing.SOUTH) UpdateNeighbours(world, pos); } // '''
    	else if(                                    ww      ){ world.setBlockState(pos, world.getBlockState(pos).withProperty(COLOR, EnumDyeColor.MAGENTA)   .withProperty(FACING, EnumFacing.WEST) , 2); if(color != EnumDyeColor.MAGENTA    || direc != EnumFacing.WEST ) UpdateNeighbours(world, pos); }
    	else { world.setBlockState(pos, world.getBlockState(pos).withProperty(COLOR, EnumDyeColor.ORANGE).withProperty(FACING, EnumFacing.NORTH), 2); }
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
    
    /**
     * Returns the quantity of items to drop on block destruction.
     */
    public int quantityDropped(Random random){
        return 2 + random.nextInt(3);
    }

    /**
     * Get the Item that this Block should drop when harvested.
     */
    @Nullable
    public Item getItemDropped(IBlockState state, Random rand, int fortune){
        return Items.STICK;
    }
    
    /**
     * Convert the given metadata into a BlockState for this Block
     */
    public IBlockState getStateFromMeta(int meta){
        return this.getDefaultState().withProperty(FACING, EnumFacing.getHorizontal(meta)).withProperty(COLOR, EnumDyeColor.byMetadata(meta));
    }
    
    /**
     * Convert the BlockState into the correct metadata value
     */
    public int getMetaFromState(IBlockState state){
        return state.getValue(COLOR).getMetadata();
    }
    
    /**
     * Returns the blockstate with the given rotation from the passed blockstate. If inapplicable, returns the passed
     * blockstate.
     */
    public IBlockState withRotation(IBlockState state, Rotation rot){
        return state.withProperty(FACING, rot.rotate(state.getValue(FACING))).withProperty(COLOR, state.getValue(COLOR));
    }
    
    /**
     * Returns the blockstate with the given mirror of the passed blockstate. If inapplicable, returns the passed
     * blockstate.
     */
    public IBlockState withMirror(IBlockState state, Mirror mirrorIn){
        return state.withRotation(mirrorIn.toRotation(state.getValue(FACING)));
    }
    
    protected BlockStateContainer createBlockState(){
        return new BlockStateContainer(this, COLOR, FACING);
    }
    
	@Override
	public TileEntity createNewTileEntity(World worldIn, int meta) {
		return null;
	}
	
}
