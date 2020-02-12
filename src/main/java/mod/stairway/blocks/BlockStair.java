package mod.stairway.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.StairsBlock;

public class BlockStair extends StairsBlock {

    /** Default Constructor */
    public BlockStair(String modid, String name, Block block) {
        super(block.getDefaultState(), Properties.from(block));
        this.setRegistryName(modid, name);
    }

}
