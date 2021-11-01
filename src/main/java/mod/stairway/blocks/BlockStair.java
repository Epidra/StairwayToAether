package mod.stairway.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.StairsBlock;

public class BlockStair extends StairsBlock {

    // ...





    //----------------------------------------CONSTRUCTOR----------------------------------------//

    /** Default Constructor */
    public BlockStair(Block block) {
        super(block.defaultBlockState(), Properties.copy(block));
    }



}
