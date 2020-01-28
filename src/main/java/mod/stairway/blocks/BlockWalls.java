package mod.stairway.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.block.state.IBlockState;

public class BlockWalls extends net.minecraft.block.BlockWall {

    /** Default Constructor */
    public BlockWalls(String modid, String name, Block block) {
        super(Block.Properties.from(block));
        this.setRegistryName(modid, name);
    }

}
