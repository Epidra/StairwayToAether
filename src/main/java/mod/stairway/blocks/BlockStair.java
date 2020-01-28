package mod.stairway.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockStairs;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;

public class BlockStair extends BlockStairs {

    /** Default Constructor */
    public BlockStair(String modid, String name, Block block) {
        super(block.getDefaultState(), Block.Properties.from(block));
        this.setRegistryName(modid, name);
    }

}
