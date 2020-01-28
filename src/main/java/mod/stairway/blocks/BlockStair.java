package mod.stairway.blocks;

import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;

public class BlockStair extends net.minecraft.block.BlockStairs {
	
	public BlockStair(String name, IBlockState modelState) {
		super(Blocks.STONE.getDefaultState());
		this.setUnlocalizedName(name);
		this.setRegistryName(name);
		this.useNeighborBrightness = true;
	}
	
}
