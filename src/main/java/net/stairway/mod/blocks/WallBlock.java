package net.stairway.mod.blocks;

import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.BlockFence;
import net.minecraft.block.BlockFenceGate;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemLead;
import net.minecraft.item.ItemStack;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.IStringSerializable;
import net.minecraft.util.StatCollector;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class WallBlock extends Block {
	
    public WallBlock(String name) {
        super(Material.rock, MapColor.airColor);
        this.setUnlocalizedName(name);
        this.setRegistryName(name);
        this.setHardness(2);
		this.setResistance(3);
		this.setStepSound(soundTypeStone);
		this.setHarvestLevel("pickaxe", 0);
        this.setDefaultState(this.blockState.getBaseState().withProperty(UP, Boolean.valueOf(false)).withProperty(NORTH, Boolean.valueOf(false)).withProperty(EAST, Boolean.valueOf(false)).withProperty(SOUTH, Boolean.valueOf(false)).withProperty(WEST, Boolean.valueOf(false)));
        this.setCreativeTab(CreativeTabs.tabBlock);
    }
    
    public static final PropertyBool UP    = PropertyBool.create("up");
    public static final PropertyBool NORTH = PropertyBool.create("north");
    public static final PropertyBool EAST  = PropertyBool.create("east");
    public static final PropertyBool SOUTH = PropertyBool.create("south");
    public static final PropertyBool WEST  = PropertyBool.create("west");
    
    public boolean isFullCube(){
        return false;
    }
    
    public boolean isPassable(IBlockAccess worldIn, BlockPos pos){
        return false;
    }
    
    public boolean isOpaqueCube(){
        return false;
    }
    
    public void setBlockBoundsBasedOnState(IBlockAccess worldIn, BlockPos pos){
        boolean flag  = this.canConnectTo(worldIn, pos.north());
        boolean flag1 = this.canConnectTo(worldIn, pos.south());
        boolean flag2 = this.canConnectTo(worldIn, pos.west());
        boolean flag3 = this.canConnectTo(worldIn, pos.east());
        float f  = 0.25F;
        float f1 = 0.75F;
        float f2 = 0.25F;
        float f3 = 0.75F;
        float f4 = 1.0F;
        if (flag) { f2 = 0.0F; }
        if (flag1){ f3 = 1.0F; }
        if (flag2){ f  = 0.0F; }
        if (flag3){ f1 = 1.0F; }
        if (flag && flag1 && !flag2 && !flag3){
            f4 = 0.8125F;
            f  = 0.3125F;
            f1 = 0.6875F;
        } else if (!flag && !flag1 && flag2 && flag3) {
            f4 = 0.8125F;
            f2 = 0.3125F;
            f3 = 0.6875F;
        }
        this.setBlockBounds(f, 0.0F, f2, f1, f4, f3);
    }
    
    public AxisAlignedBB getCollisionBoundingBox(World worldIn, BlockPos pos, IBlockState state){
        this.setBlockBoundsBasedOnState(worldIn, pos);
        this.maxY = 1.5D;
        return super.getCollisionBoundingBox(worldIn, pos, state);
    }
    
    public boolean canConnectTo(IBlockAccess worldIn, BlockPos pos){
        Block block = worldIn.getBlockState(pos).getBlock();
        if(block instanceof WallBlock) return true;
        return block == Blocks.barrier ? false : (block != this && !(block instanceof BlockFenceGate) ? (block.getMaterial().isOpaque() && block.isFullCube() ? block.getMaterial() != Material.gourd : false) : true);
    }
    
    public boolean canPlaceTorchOnTop(IBlockAccess world, BlockPos pos){
        return true;
    }
    
    @SideOnly(Side.CLIENT)
    public boolean shouldSideBeRendered(IBlockAccess worldIn, BlockPos pos, EnumFacing side){
        return side == EnumFacing.DOWN ? super.shouldSideBeRendered(worldIn, pos, side) : true;
    }
    
    public IBlockState getStateFromMeta(int meta){
        return this.getDefaultState();
    }
    
    public int getMetaFromState(IBlockState state){
        return 0;
    }
    
    public IBlockState getActualState(IBlockState state, IBlockAccess worldIn, BlockPos pos){
        return state.withProperty(UP, Boolean.valueOf(!worldIn.isAirBlock(pos.up()))).withProperty(NORTH, Boolean.valueOf(this.canConnectTo(worldIn, pos.north()))).withProperty(EAST, Boolean.valueOf(this.canConnectTo(worldIn, pos.east()))).withProperty(SOUTH, Boolean.valueOf(this.canConnectTo(worldIn, pos.south()))).withProperty(WEST, Boolean.valueOf(this.canConnectTo(worldIn, pos.west())));
    }
    
    protected BlockState createBlockState(){
        return new BlockState(this, new IProperty[] {UP, NORTH, EAST, WEST, SOUTH});
    }
    
}