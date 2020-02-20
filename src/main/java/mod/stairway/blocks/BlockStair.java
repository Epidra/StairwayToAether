package mod.stairway.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockStairs;

public class BlockStair extends BlockStairs {

    /** Default Constructor */
    public BlockStair(String modid, String name, Block block) {
        super(block.getDefaultState(), Properties.from(block));
        this.setRegistryName(modid, name);
    }

}
