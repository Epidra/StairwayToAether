package mod.stairway.block;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.StairBlock;

public class BlockStair extends StairBlock {

    // ...





    //----------------------------------------CONSTRUCTOR----------------------------------------//

    /** Default Constructor */
    public BlockStair(Block block) {
        super(block.defaultBlockState(), Properties.copy(block));
    }



}
