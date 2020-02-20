package mod.stairway.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockWall;

public class BlockWalls extends BlockWall {

    /** Default Constructor */
    public BlockWalls(String modid, String name, Block block) {
        super(Properties.from(block));
        this.setRegistryName(modid, name);
    }

}
