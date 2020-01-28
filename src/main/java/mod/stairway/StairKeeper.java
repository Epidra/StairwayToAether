package mod.stairway;

import mod.shared.Register;
import mod.shared.blocks.BlockBlock;
import mod.shared.blocks.BlockPillar;
import mod.shared.blocks.IMachinaColored;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.common.registry.GameRegistry;
import mod.stairway.blocks.BlockChain;
import mod.stairway.blocks.BlockScaffolding;
import mod.stairway.blocks.BlockSlab;
import mod.stairway.blocks.BlockStair;
import mod.stairway.blocks.BlockWall;
import mod.stairway.items.ItemBlockSlab;

public class StairKeeper {
	
	// Vanilla:   final       BLOCK_STONE_STONE                           BLOCK_STONE_STONE
	// Vanilla:	  final	SLABS_STONE_STONE                           SLABS_STONE_STONE
	public static final Block STAIR_STONE_STONE         = new BlockStair("stair_stone_stone",    Block.getStateById(1));
	public static final Block WALLS_STONE_STONE         = new BlockWall ("walls_stone_stone");
	// Vanilla:   final       BLOCK_STONE_COBBLE                          BLOCK_STONE_COBBLE
	// Vanilla:   final       SLABS_STONE_COBBLE                          SLABS_STONE_COBBLE
	// Vanilla:   final       STAIR_STONE_COBBLE                          STAIR_STONE_COBBLE
	// Vanilla:   final       WALLS_STONE_COBBLE                          WALLS_STONE_COBBLE
	// Vanilla:   final       BLOCK_STONE_COBBLE_MOSS                     BLOCK_STONE_COBBLE_MOSS
	public static final Block SLABS_STONE_COBBLE_MOSS   = new BlockSlab ("slabs_stone_cobble_moss");
	public static final Block STAIR_STONE_COBBLE_MOSS   = new BlockStair("stair_stone_cobble_moss",    Blocks.MOSSY_COBBLESTONE.getDefaultState());
	// Vanilla    final       WALLS_STONE_COBBLE_MOSS                     WALLS_STONE_COBBLE_MOSS
	public static final Block BLOCK_STONE_SMOOTH        = new BlockBlock("block_stone_smooth", Material.ROCK, 3, 2);
	public static final Block SLABS_STONE_SMOOTH        = new BlockSlab ("slabs_stone_smooth");
	public static final Block STAIR_STONE_SMOOTH        = new BlockStair("stair_stone_smooth",    BLOCK_STONE_SMOOTH.getDefaultState());
	public static final Block WALLS_STONE_SMOOTH        = new BlockWall ("walls_stone_smooth");
	// Vanilla:   final       BLOCK_STONE_BRICK                           BLOCK_STONE_BRICK
	// Vanilla:   final       SLABS_STONE_BRICK                           SLABS_STONE_BRICK
	// Vanilla:   final       STAIR_STONE_BRICK                           STAIR_STONE_BRICK
	public static final Block WALLS_STONE_BRICK         = new BlockWall ("walls_stone_brick");
	// Vanilla:   final       BLOCK_STONE_BRICK_MOSS                      BlockStoneBrickMoss
	public static final Block SLABS_STONE_BRICK_MOSS    = new BlockSlab ("slabs_stone_brick_moss");
	public static final Block STAIR_STONE_BRICK_MOSS    = new BlockStair("stair_stone_brick_moss",  Block.getStateById(1));
	public static final Block WALLS_STONE_BRICK_MOSS    = new BlockWall ("walls_stone_brick_moss");
	// Vanilla:   final       BLOCK_STONE_BRICK_CRACKED                   BlockStoneBrickCracked
	public static final Block SLABS_STONE_BRICK_CRACKED = new BlockSlab ("slabs_stone_brick_cracked");
	public static final Block STAIR_STONE_BRICK_CRACKED = new BlockStair("stair_stone_brick_cracked", Block.getStateById(2));
	public static final Block WALLS_STONE_BRICK_CRACKED = new BlockWall ("walls_stone_brick_cracked");
	// Vanilla:         BLOCK_STONE_BRICK_CARVED                    BLOCK_STONE_BRICK_CARVED
	public static final Block BLOCK_STONE_PILLAR = new BlockPillar("block_stone_pillar", Material.ROCK, 3, 2);
	
	// Vanilla:         BLOCK_GRANITE_STONE                           BlockGraniteStone
	public static final Block SLABS_GRANITE_STONE         = new BlockSlab ("slabs_granite_stone");
	public static final Block STAIR_GRANITE_STONE         = new BlockStair("stair_granite_stone",    Block.getStateById(1));
	public static final Block WALLS_GRANITE_STONE         = new BlockWall ("walls_granite_stone");
	public static final Block BLOCK_GRANITE_COBBLE        = new BlockBlock("block_granite_cobble", Material.ROCK, 3, 2);
	public static final Block SLABS_GRANITE_COBBLE        = new BlockSlab ("slabs_granite_cobble");
	public static final Block STAIR_GRANITE_COBBLE        = new BlockStair("stair_granite_cobble",    BLOCK_GRANITE_COBBLE.getDefaultState());
	public static final Block WALLS_GRANITE_COBBLE        = new BlockWall ("walls_granite_cobble");
	public static final Block BLOCK_GRANITE_COBBLE_MOSS   = new BlockBlock("block_granite_cobble_moss", Material.ROCK, 3, 2);
	public static final Block SLABS_GRANITE_COBBLE_MOSS   = new BlockSlab ("slabs_granite_cobble_moss");
	public static final Block STAIR_GRANITE_COBBLE_MOSS   = new BlockStair("stair_granite_cobble_moss",    BLOCK_GRANITE_COBBLE_MOSS.getDefaultState());
	public static final Block WALLS_GRANITE_COBBLE_MOSS   = new BlockWall ("walls_granite_cobble_moss");
	// Vanilla:   final       BLOCK_GRANITE_SMOOTH                          BlockGraniteSmooth
	public static final Block SLABS_GRANITE_SMOOTH        = new BlockSlab ("slabs_granite_smooth");
	public static final Block STAIR_GRANITE_SMOOTH        = new BlockStair("stair_granite_smooth",    Block.getStateById(2));
	public static final Block WALLS_GRANITE_SMOOTH        = new BlockWall ("walls_granite_smooth");
	public static final Block BLOCK_GRANITE_BRICK         = new BlockBlock("block_granite_brick", Material.ROCK, 3, 2);
	public static final Block SLABS_GRANITE_BRICK         = new BlockSlab ("slabs_granite_brick");
	public static final Block STAIR_GRANITE_BRICK         = new BlockStair("stair_granite_brick",    BLOCK_GRANITE_BRICK.getDefaultState());
	public static final Block WALLS_GRANITE_BRICK         = new BlockWall ("walls_granite_brick");
	public static final Block BLOCK_GRANITE_BRICK_MOSS    = new BlockBlock("block_granite_brick_moss", Material.ROCK, 3, 2);
	public static final Block SLABS_GRANITE_BRICK_MOSS    = new BlockSlab ("slabs_granite_brick_moss");
	public static final Block STAIR_GRANITE_BRICK_MOSS    = new BlockStair("stair_granite_brick_moss",    BLOCK_GRANITE_BRICK_MOSS.getDefaultState());
	public static final Block WALLS_GRANITE_BRICK_MOSS    = new BlockWall ("walls_granite_brick_moss");
	public static final Block BLOCK_GRANITE_BRICK_CRACKED = new BlockBlock("block_granite_brick_cracked", Material.ROCK, 3, 2);
	public static final Block SLABS_GRANITE_BRICK_CRACKED = new BlockSlab ("slabs_granite_brick_cracked");
	public static final Block STAIR_GRANITE_BRICK_CRACKED = new BlockStair("stair_granite_brick_cracked",    BLOCK_GRANITE_BRICK_CRACKED.getDefaultState());
	public static final Block WALLS_GRANITE_BRICK_CRACKED = new BlockWall ("walls_granite_brick_cracked");
	public static final Block BLOCK_GRANITE_BRICK_CARVED  = new BlockBlock("block_granite_brick_carved", Material.ROCK, 3, 2);
	public static final Block BLOCK_GRANITE_PILLAR = new BlockPillar("block_granite_pillar", Material.ROCK, 3, 2);
	
	// Vanilla:         BLOCK_DIORITE_STONE                           BlockDioriteStone
	public static final Block SLABS_DIORITE_STONE         = new BlockSlab ("slabs_diorite_stone");
	public static final Block STAIR_DIORITE_STONE         = new BlockStair("stair_diorite_stone",    Block.getStateById(3));
	public static final Block WALLS_DIORITE_STONE         = new BlockWall ("walls_diorite_stone");
	public static final Block BLOCK_DIORITE_COBBLE        = new BlockBlock("block_diorite_cobble", Material.ROCK, 3, 2);
	public static final Block SLABS_DIORITE_COBBLE        = new BlockSlab ("slabs_diorite_cobble");
	public static final Block STAIR_DIORITE_COBBLE        = new BlockStair("stair_diorite_cobble",    BLOCK_DIORITE_COBBLE.getDefaultState());
	public static final Block WALLS_DIORITE_COBBLE        = new BlockWall ("walls_diorite_cobble");
	public static final Block BLOCK_DIORITE_COBBLE_MOSS   = new BlockBlock("block_diorite_cobble_moss", Material.ROCK, 3, 2);
	public static final Block SLABS_DIORITE_COBBLE_MOSS   = new BlockSlab ("slabs_diorite_cobble_moss");
	public static final Block STAIR_DIORITE_COBBLE_MOSS   = new BlockStair("stair_diorite_cobble_moss",    BLOCK_DIORITE_COBBLE_MOSS.getDefaultState());
	public static final Block WALLS_DIORITE_COBBLE_MOSS   = new BlockWall ("walls_diorite_cobble_moss");
	// Vanilla:   final       BLOCK_DIORITE_SMOOTH                          BlockDioriteSmooth
	public static final Block SLABS_DIORITE_SMOOTH        = new BlockSlab ("slabs_diorite_smooth");
	public static final Block STAIR_DIORITE_SMOOTH        = new BlockStair("stair_diorite_smooth",    Block.getStateById(4));
	public static final Block WALLS_DIORITE_SMOOTH        = new BlockWall ("walls_diorite_smooth");
	public static final Block BLOCK_DIORITE_BRICK         = new BlockBlock("block_diorite_brick", Material.ROCK, 3, 2);
	public static final Block SLABS_DIORITE_BRICK         = new BlockSlab ("slabs_diorite_brick");
	public static final Block STAIR_DIORITE_BRICK         = new BlockStair("stair_diorite_brick",    BLOCK_DIORITE_BRICK.getDefaultState());
	public static final Block WALLS_DIORITE_BRICK         = new BlockWall ("walls_diorite_brick");
	public static final Block BLOCK_DIORITE_BRICK_MOSS    = new BlockBlock("block_diorite_brick_moss", Material.ROCK, 3, 2);
	public static final Block SLABS_DIORITE_BRICK_MOSS    = new BlockSlab ("slabs_diorite_brick_moss");
	public static final Block STAIR_DIORITE_BRICK_MOSS    = new BlockStair("stair_diorite_brick_moss",    BLOCK_DIORITE_BRICK_MOSS.getDefaultState());
	public static final Block WALLS_DIORITE_BRICK_MOSS    = new BlockWall ("walls_diorite_brick_moss");
	public static final Block BLOCK_DIORITE_BRICK_CRACKED = new BlockBlock("block_diorite_brick_cracked", Material.ROCK, 3, 2);
	public static final Block SLABS_DIORITE_BRICK_CRACKED = new BlockSlab ("slabs_diorite_brick_cracked");
	public static final Block STAIR_DIORITE_BRICK_CRACKED = new BlockStair("stair_diorite_brick_cracked",    BLOCK_DIORITE_BRICK_CRACKED.getDefaultState());
	public static final Block WALLS_DIORITE_BRICK_CRACKED = new BlockWall ("walls_diorite_brick_cracked");
	public static final Block BLOCK_DIORITE_BRICK_CARVED  = new BlockBlock("block_diorite_brick_carved", Material.ROCK, 3, 2);
	public static final Block BLOCK_DIORITE_PILLAR = new BlockPillar("block_diorite_pillar", Material.ROCK, 3, 2);
	
	// Vanilla:         BLOCK_ANDESITE_STONE                           BlockAndesiteStone
	public static final Block SLABS_ANDESITE_STONE         = new BlockSlab ("slabs_andesite_stone");
	public static final Block STAIR_ANDESITE_STONE         = new BlockStair("stair_andesite_stone",    Block.getStateById(5));
	public static final Block WALLS_ANDESITE_STONE         = new BlockWall ("walls_andesite_stone");
	public static final Block BLOCK_ANDESITE_COBBLE        = new BlockBlock("block_andesite_cobble", Material.ROCK, 3, 2);
	public static final Block SLABS_ANDESITE_COBBLE        = new BlockSlab ("slabs_andesite_cobble");
	public static final Block STAIR_ANDESITE_COBBLE        = new BlockStair("stair_andesite_cobble",    BLOCK_ANDESITE_COBBLE.getDefaultState());
	public static final Block WALLS_ANDESITE_COBBLE        = new BlockWall ("walls_andesite_cobble");
	public static final Block BLOCK_ANDESITE_COBBLE_MOSS   = new BlockBlock("block_andesite_cobble_moss", Material.ROCK, 3, 2);
	public static final Block SLABS_ANDESITE_COBBLE_MOSS   = new BlockSlab ("slabs_andesite_cobble_moss");
	public static final Block STAIR_ANDESITE_COBBLE_MOSS   = new BlockStair("stair_andesite_cobble_moss",    BLOCK_ANDESITE_COBBLE_MOSS.getDefaultState());
	public static final Block WALLS_ANDESITE_COBBLE_MOSS   = new BlockWall ("walls_andesite_cobble_moss");
	// Vanilla:   final       BLOCK_ANDESITE_SMOOTH                          BlockAndesiteSmooth
	public static final Block SLABS_ANDESITE_SMOOTH        = new BlockSlab ("slabs_andesite_smooth");
	public static final Block STAIR_ANDESITE_SMOOTH        = new BlockStair("stair_andesite_smooth",    Block.getStateById(6));
	public static final Block WALLS_ANDESITE_SMOOTH        = new BlockWall ("walls_andesite_smooth");
	public static final Block BLOCK_ANDESITE_BRICK         = new BlockBlock("block_andesite_brick", Material.ROCK, 3, 2);
	public static final Block SLABS_ANDESITE_BRICK         = new BlockSlab ("slabs_andesite_brick");
	public static final Block STAIR_ANDESITE_BRICK         = new BlockStair("stair_andesite_brick",    BLOCK_ANDESITE_BRICK.getDefaultState());
	public static final Block WALLS_ANDESITE_BRICK         = new BlockWall ("walls_andesite_brick");
	public static final Block BLOCK_ANDESITE_BRICK_MOSS    = new BlockBlock("block_andesite_brick_moss", Material.ROCK, 3, 2);
	public static final Block SLABS_ANDESITE_BRICK_MOSS    = new BlockSlab ("slabs_andesite_brick_moss");
	public static final Block STAIR_ANDESITE_BRICK_MOSS    = new BlockStair("stair_andesite_brick_moss",    BLOCK_ANDESITE_BRICK_MOSS.getDefaultState());
	public static final Block WALLS_ANDESITE_BRICK_MOSS    = new BlockWall ("walls_andesite_brick_moss");
	public static final Block BLOCK_ANDESITE_BRICK_CRACKED = new BlockBlock("block_andesite_brick_cracked", Material.ROCK, 3, 2);
	public static final Block SLABS_ANDESITE_BRICK_CRACKED = new BlockSlab ("slabs_andesite_brick_cracked");
	public static final Block STAIR_ANDESITE_BRICK_CRACKED = new BlockStair("stair_andesite_brick_cracked",    BLOCK_ANDESITE_BRICK_CRACKED.getDefaultState());
	public static final Block WALLS_ANDESITE_BRICK_CRACKED = new BlockWall ("walls_andesite_brick_cracked");
	public static final Block BLOCK_ANDESITE_BRICK_CARVED  = new BlockBlock("block_andesite_brick_carved", Material.ROCK, 3, 2);
	public static final Block BLOCK_ANDESITE_PILLAR = new BlockPillar("block_andesite_pillar", Material.ROCK, 3, 2);
	
	public static final Block SLABS_PRISMARINE_STONE = new BlockSlab ("slabs_prismarine_stone");
	public static final Block STAIR_PRISMARINE_STONE = new BlockStair("stair_prismarine_stone", Block.getStateById(1));
	public static final Block WALLS_PRISMARINE_STONE = new BlockWall ("walls_prismarine_stone");
	public static final Block SLABS_PRISMARINE_BRICK = new BlockSlab ("slabs_prismarine_brick");
	public static final Block STAIR_PRISMARINE_BRICK = new BlockStair("stair_prismarine_brick", Block.getStateById(1));
	public static final Block WALLS_PRISMARINE_BRICK = new BlockWall ("walls_prismarine_brick");
	public static final Block SLABS_PRISMARINE_DARK  = new BlockSlab ("slabs_prismarine_dark");
	public static final Block STAIR_PRISMARINE_DARK  = new BlockStair("stair_prismarine_dark",  Block.getStateById(2));
	public static final Block WALLS_PRISMARINE_DARK  = new BlockWall ("walls_prismarine_dark");
	
	// Vanilla:         BLOCK_END_STONE                           BlockEndStone
	public static final Block SLABS_END_STONE         = new BlockSlab ("slabs_end_stone");
	public static final Block STAIR_END_STONE         = new BlockStair("stair_end_stone",    Blocks.END_STONE.getDefaultState());
	public static final Block WALLS_END_STONE         = new BlockWall ("walls_end_stone");
	public static final Block BLOCK_END_COBBLE        = new BlockBlock("block_end_cobble", Material.ROCK, 3, 2);
	public static final Block SLABS_END_COBBLE        = new BlockSlab ("slabs_end_cobble");
	public static final Block STAIR_END_COBBLE        = new BlockStair("stair_end_cobble",    BLOCK_END_COBBLE.getDefaultState());
	public static final Block WALLS_END_COBBLE        = new BlockWall ("walls_end_cobble");
	public static final Block BLOCK_END_COBBLE_MOSS   = new BlockBlock("block_end_cobble_moss", Material.ROCK, 3, 2);
	public static final Block SLABS_END_COBBLE_MOSS   = new BlockSlab ("slabs_end_cobble_moss");
	public static final Block STAIR_END_COBBLE_MOSS   = new BlockStair("stair_end_cobble_moss",    BLOCK_END_COBBLE_MOSS.getDefaultState());
	public static final Block WALLS_END_COBBLE_MOSS   = new BlockWall ("walls_end_cobble_moss");
	public static final Block BLOCK_END_SMOOTH        = new BlockBlock("block_end_smooth", Material.ROCK, 3, 2);
	public static final Block SLABS_END_SMOOTH        = new BlockSlab ("slabs_end_smooth");
	public static final Block STAIR_END_SMOOTH        = new BlockStair("stair_end_smooth",    BLOCK_END_SMOOTH.getDefaultState());
	public static final Block WALLS_END_SMOOTH        = new BlockWall ("walls_end_smooth");
	// Vanilla:   final       BLOCK_END_BRICK                           BlockEndBrick
	public static final Block SLABS_END_BRICK         = new BlockSlab ("slabs_end_brick");
	public static final Block STAIR_END_BRICK         = new BlockStair("stair_end_brick",    Blocks.END_BRICKS.getDefaultState());
	public static final Block WALLS_END_BRICK         = new BlockWall ("walls_end_brick");
	public static final Block BLOCK_END_BRICK_MOSS    = new BlockBlock("block_end_brick_moss", Material.ROCK, 3, 2);
	public static final Block SLABS_END_BRICK_MOSS    = new BlockSlab ("slabs_end_brick_moss");
	public static final Block STAIR_END_BRICK_MOSS    = new BlockStair("stair_end_brick_moss",    BLOCK_END_BRICK_MOSS.getDefaultState());
	public static final Block WALLS_END_BRICK_MOSS    = new BlockWall ("walls_end_brick_moss");
	public static final Block BLOCK_END_BRICK_CRACKED = new BlockBlock("block_end_brick_cracked", Material.ROCK, 3, 2);
	public static final Block SLABS_END_BRICK_CRACKED = new BlockSlab ("slabs_end_brick_cracked");
	public static final Block STAIR_END_BRICK_CRACKED = new BlockStair("stair_end_brick_cracked",    BLOCK_END_BRICK_CRACKED.getDefaultState());
	public static final Block WALLS_END_BRICK_CRACKED = new BlockWall ("walls_end_brick_cracked");
	public static final Block BLOCK_END_BRICK_CARVED  = new BlockBlock("block_end_brick_carved", Material.ROCK, 3, 2);
	public static final Block BLOCK_END_PILLAR = new BlockPillar("block_end_pillar", Material.ROCK, 3, 2);
	
	public static final Block SLABS_REDNETHER_BRICK = new BlockSlab ("slabs_rednether_brick");
	public static final Block STAIR_REDNETHER_BRICK = new BlockStair("stair_rednether_brick",    Block.getStateById(1));
	public static final Block WALLS_REDNETHER_BRICK = new BlockWall ("walls_rednether_brick");
	
	// Vanilla:         BLOCK_OBSIDIAN_STONE                     BLOCK_OBSIDIAN_stone
	public static final Block SLABS_OBSIDIAN_STONE  = new BlockSlab  ("slabs_obsidian_stone");
	public static final Block STAIR_OBSIDIAN_STONE  = new BlockStair ("stair_obsidian_stone", Blocks.OBSIDIAN.getDefaultState());
	public static final Block WALLS_OBSIDIAN_STONE  = new BlockWall  ("walls_obsidian_stone");
	public static final Block BLOCK_OBSIDIAN_SMOOTH = new BlockBlock ("block_obsidian_smooth", Material.ROCK, 50, 3000);
	public static final Block SLABS_OBSIDIAN_SMOOTH = new BlockSlab  ("slabs_obsidian_smooth");
	public static final Block STAIR_OBSIDIAN_SMOOTH = new BlockStair ("stair_obsidian_smooth",    BLOCK_OBSIDIAN_SMOOTH.getDefaultState());
	public static final Block WALLS_OBSIDIAN_SMOOTH = new BlockWall  ("walls_obsidian_smooth");
	public static final Block BLOCK_OBSIDIAN_CARVED = new BlockBlock ("block_obsidian_carved", Material.ROCK, 50, 3000);
	public static final Block BLOCK_OBSIDIAN_PILLAR = new BlockPillar("block_obsidian_pillar", Material.ROCK, 50, 3000);
	
	public static final Block SLABS_CONCRETE_WHITE     = new BlockSlab ("slabs_concrete_white");
	public static final Block STAIR_CONCRETE_WHITE     = new BlockStair("stair_concrete_white",    Blocks.CONCRETE.getDefaultState());
	public static final Block WALLS_CONCRETE_WHITE     = new BlockWall ("walls_concrete_white");
	public static final Block SLABS_CONCRETE_ORANGE    = new BlockSlab ("slabs_concrete_orange");
	public static final Block STAIR_CONCRETE_ORANGE    = new BlockStair("stair_concrete_orange",    Blocks.CONCRETE.getDefaultState());
	public static final Block WALLS_CONCRETE_ORANGE    = new BlockWall ("walls_concrete_orange");
	public static final Block SLABS_CONCRETE_MAGENTA   = new BlockSlab ("slabs_concrete_magenta");
	public static final Block STAIR_CONCRETE_MAGENTA   = new BlockStair("stair_concrete_magenta",    Blocks.CONCRETE.getDefaultState());
	public static final Block WALLS_CONCRETE_MAGENTA   = new BlockWall ("walls_concrete_magenta");
	public static final Block SLABS_CONCRETE_LIGHTBLUE = new BlockSlab ("slabs_concrete_lightblue");
	public static final Block STAIR_CONCRETE_LIGHTBLUE = new BlockStair("stair_concrete_lightblue",    Blocks.CONCRETE.getDefaultState());
	public static final Block WALLS_CONCRETE_LIGHTBLUE = new BlockWall ("walls_concrete_lightblue");
	public static final Block SLABS_CONCRETE_YELLOW    = new BlockSlab ("slabs_concrete_yellow");
	public static final Block STAIR_CONCRETE_YELLOW    = new BlockStair("stair_concrete_yellow",    Blocks.CONCRETE.getDefaultState());
	public static final Block WALLS_CONCRETE_YELLOW    = new BlockWall ("walls_concrete_yellow");
	public static final Block SLABS_CONCRETE_LIME      = new BlockSlab ("slabs_concrete_lime");
	public static final Block STAIR_CONCRETE_LIME      = new BlockStair("stair_concrete_lime",    Blocks.CONCRETE.getDefaultState());
	public static final Block WALLS_CONCRETE_LIME      = new BlockWall ("walls_concrete_lime");
	public static final Block SLABS_CONCRETE_PINK      = new BlockSlab ("slabs_concrete_pink");
	public static final Block STAIR_CONCRETE_PINK      = new BlockStair("stair_concrete_pink",    Blocks.CONCRETE.getDefaultState());
	public static final Block WALLS_CONCRETE_PINK      = new BlockWall ("walls_concrete_pink");
	public static final Block SLABS_CONCRETE_GRAY      = new BlockSlab ("slabs_concrete_gray");
	public static final Block STAIR_CONCRETE_GRAY      = new BlockStair("stair_concrete_gray",    Blocks.CONCRETE.getDefaultState());
	public static final Block WALLS_CONCRETE_GRAY      = new BlockWall ("walls_concrete_gray");
	public static final Block SLABS_CONCRETE_SILVER    = new BlockSlab ("slabs_concrete_silver");
	public static final Block STAIR_CONCRETE_SILVER    = new BlockStair("stair_concrete_silver",    Blocks.CONCRETE.getDefaultState());
	public static final Block WALLS_CONCRETE_SILVER    = new BlockWall ("walls_concrete_silver");
	public static final Block SLABS_CONCRETE_CYAN      = new BlockSlab ("slabs_concrete_cyan");
	public static final Block STAIR_CONCRETE_CYAN      = new BlockStair("stair_concrete_cyan",    Blocks.CONCRETE.getDefaultState());
	public static final Block WALLS_CONCRETE_CYAN      = new BlockWall ("walls_concrete_cyan");
	public static final Block SLABS_CONCRETE_PURPLE    = new BlockSlab ("slabs_concrete_purple");
	public static final Block STAIR_CONCRETE_PURPLE    = new BlockStair("stair_concrete_purple",    Blocks.CONCRETE.getDefaultState());
	public static final Block WALLS_CONCRETE_PURPLE    = new BlockWall ("walls_concrete_purple");
	public static final Block SLABS_CONCRETE_BLUE      = new BlockSlab ("slabs_concrete_blue");
	public static final Block STAIR_CONCRETE_BLUE      = new BlockStair("stair_concrete_blue",    Blocks.CONCRETE.getDefaultState());
	public static final Block WALLS_CONCRETE_BLUE      = new BlockWall ("walls_concrete_blue");
	public static final Block SLABS_CONCRETE_BROWN     = new BlockSlab ("slabs_concrete_brown");
	public static final Block STAIR_CONCRETE_BROWN     = new BlockStair("stair_concrete_brown",    Blocks.CONCRETE.getDefaultState());
	public static final Block WALLS_CONCRETE_BROWN     = new BlockWall ("walls_concrete_brown");
	public static final Block SLABS_CONCRETE_GREEN     = new BlockSlab ("slabs_concrete_green");
	public static final Block STAIR_CONCRETE_GREEN     = new BlockStair("stair_concrete_green",    Blocks.CONCRETE.getDefaultState());
	public static final Block WALLS_CONCRETE_GREEN     = new BlockWall ("walls_concrete_green");
	public static final Block SLABS_CONCRETE_RED       = new BlockSlab ("slabs_concrete_red");
	public static final Block STAIR_CONCRETE_RED       = new BlockStair("stair_concrete_red",    Blocks.CONCRETE.getDefaultState());
	public static final Block WALLS_CONCRETE_RED       = new BlockWall ("walls_concrete_red");
	public static final Block SLABS_CONCRETE_BLACK     = new BlockSlab ("slabs_concrete_black");
	public static final Block STAIR_CONCRETE_BLACK     = new BlockStair("stair_concrete_black",    Blocks.CONCRETE.getDefaultState());
	public static final Block WALLS_CONCRETE_BLACK     = new BlockWall ("walls_concrete_black");
	
	public static final Block BLOCK_TIMBER_BASIC      = new IMachinaColored("timber_basic",      Material.ROCK);
	public static final Block BLOCK_TIMBER_HORIZONTAL = new IMachinaColored("timber_horizontal", Material.ROCK);
	public static final Block BLOCK_TIMBER_VERTICAL   = new IMachinaColored("timber_vertical",   Material.ROCK);
	public static final Block BLOCK_TIMBER_PLUS       = new IMachinaColored("timber_plus",       Material.ROCK);
	public static final Block BLOCK_TIMBER_DIAG_LEFT  = new IMachinaColored("timber_diag_left",  Material.ROCK);
	public static final Block BLOCK_TIMBER_DIAG_RIGHT = new IMachinaColored("timber_diag_right", Material.ROCK);
	public static final Block BLOCK_TIMBER_CROSS      = new IMachinaColored("timber_cross",      Material.ROCK);
	
	public static final Block BLOCK_SCAFFOLDING = new BlockScaffolding("timber_scaffolding");
	public static final Block BLOCK_CHAIN_IRON  = new BlockChain("block_chain_iron");
	public static final Block BLOCK_CHAIN_GOLD  = new BlockChain("block_chain_gold");
	
	public static boolean config_allowed_slabs;
	public static boolean config_allowed_stair;
	public static boolean config_allowed_walls;
	public static boolean config_allowed_timber;
	public static boolean config_allowed_scaffolding;
	public static boolean config_allowed_verticalslab;
	public static boolean config_allowed_chains;
	public static boolean config_extended_stone;
	public static boolean config_extended_granite;
	public static boolean config_extended_diorite;
	public static boolean config_extended_andesite;
	public static boolean config_extended_end;
	public static boolean config_extended_obsidian;
	
	/**Reads out Config File**/
	public static void loadConfig(FMLPreInitializationEvent preEvent){
		Configuration config = new Configuration(preEvent.getSuggestedConfigurationFile());
		config.load();
		config_allowed_slabs        = config.get("Block Types",    "Allow Slabs",          true).getBoolean();
		config_allowed_stair        = config.get("Block Types",    "Allow Stairs",         true).getBoolean();
		config_allowed_walls        = config.get("Block Types",    "Allow Walls",          true).getBoolean();
		config_allowed_timber       = config.get("Block Types",    "Allow Timber",         true).getBoolean();
		config_allowed_scaffolding  = config.get("Block Types",    "Allow Scaffolding",    true).getBoolean();
		config_allowed_verticalslab = config.get("Block Types",    "Allow Vertical Slabs", true).getBoolean();
		config_allowed_chains       = config.get("Block Types",    "Allow Chains",         true).getBoolean();
		config_extended_stone       = config.get("Stone Variants", "Extend Stone",         true).getBoolean();
		config_extended_granite     = config.get("Stone Variants", "Extend Granite",       true).getBoolean();
		config_extended_diorite     = config.get("Stone Variants", "Extend Diorite",       true).getBoolean();
		config_extended_andesite    = config.get("Stone Variants", "Extend Andesite",      true).getBoolean();
		config_extended_end         = config.get("Stone Variants", "Extend End",           true).getBoolean();
		config_extended_obsidian    = config.get("Stone Variants", "Extend Obsidian",      true).getBoolean();
		
		System.out.println("Config loaded");
		config.save();
	}
	
	/**Initialize Items/Blocks that need Reference to other Items/Blocks**/
	public static void init(){
		
	}
	
	/**Register all stuff, pre is true during preInit and false during Init**/
	public static void registerStuff(boolean pre){
			// Vanilla:                                                          BLOCK_STONE_STONE
			// Vanilla:                                                          SLABS_STONE_STONE
		if(config_allowed_stair                         ) Register.registerBlock(STAIR_STONE_STONE,        pre, StairwayToAether.modid);
		if(config_allowed_walls                         ) Register.registerBlock(WALLS_STONE_STONE,        pre, StairwayToAether.modid);
			// Vanilla:                                                          BLOCK_STONE_COBBLE_MOSS
		if(config_allowed_slabs                         )      registerBlockSlab(SLABS_STONE_COBBLE_MOSS, pre, StairwayToAether.modid);
		if(config_allowed_stair                         ) Register.registerBlock(STAIR_STONE_COBBLE_MOSS,   pre, StairwayToAether.modid);
			// Vanilla:                                                          WALLS_STONE_COBBLE_MOSS
		if(                        config_extended_stone) Register.registerBlock(BLOCK_STONE_SMOOTH,       pre, StairwayToAether.modid);
		if(config_allowed_slabs && config_extended_stone)      registerBlockSlab(SLABS_STONE_SMOOTH, pre, StairwayToAether.modid);
		if(config_allowed_stair && config_extended_stone) Register.registerBlock(STAIR_STONE_SMOOTH,       pre, StairwayToAether.modid);
		if(config_allowed_walls && config_extended_stone) Register.registerBlock(WALLS_STONE_SMOOTH,       pre, StairwayToAether.modid);
			//                                                                   ???
			//                                                                   ???
			//                                                                   ???
			//                                                                   ???
		if(config_allowed_walls                         ) Register.registerBlock(WALLS_STONE_BRICK,        pre, StairwayToAether.modid);
			// Vanilla:                                                          BLOCK_STONE_BRICK_MOSS
		if(config_allowed_slabs                         )      registerBlockSlab(SLABS_STONE_BRICK_MOSS, pre, StairwayToAether.modid);
		if(config_allowed_stair                         ) Register.registerBlock(STAIR_STONE_BRICK_MOSS,    pre, StairwayToAether.modid);
		if(config_allowed_walls                         ) Register.registerBlock(WALLS_STONE_BRICK_MOSS,    pre, StairwayToAether.modid);
			// Vanilla:                                                          BLOCK_STONE_BRICK_CRACKED
		if(config_allowed_slabs                         )      registerBlockSlab(SLABS_STONE_BRICK_CRACKED, pre, StairwayToAether.modid);
		if(config_allowed_stair                         ) Register.registerBlock(STAIR_STONE_BRICK_CRACKED, pre, StairwayToAether.modid);
		if(config_allowed_walls                         ) Register.registerBlock(WALLS_STONE_BRICK_CRACKED, pre, StairwayToAether.modid);
		if(                        config_extended_stone) Register.registerBlock(BLOCK_STONE_PILLAR,       pre, StairwayToAether.modid);
		
			// Vanilla:                                                            BLOCK_GRANITE_STONE
		if(config_allowed_slabs                           )      registerBlockSlab(SLABS_GRANITE_STONE, pre, StairwayToAether.modid);
		if(config_allowed_stair                           ) Register.registerBlock(STAIR_GRANITE_STONE,        pre, StairwayToAether.modid);
		if(config_allowed_walls                           ) Register.registerBlock(WALLS_GRANITE_STONE,        pre, StairwayToAether.modid);
		if(                        config_extended_granite) Register.registerBlock(BLOCK_GRANITE_COBBLE,       pre, StairwayToAether.modid);
		if(config_allowed_slabs && config_extended_granite)      registerBlockSlab(SLABS_GRANITE_COBBLE, pre, StairwayToAether.modid);
		if(config_allowed_stair && config_extended_granite) Register.registerBlock(STAIR_GRANITE_COBBLE,       pre, StairwayToAether.modid);
		if(config_allowed_walls && config_extended_granite) Register.registerBlock(WALLS_GRANITE_COBBLE,       pre, StairwayToAether.modid);
		if(                        config_extended_granite) Register.registerBlock(BLOCK_GRANITE_COBBLE_MOSS,   pre, StairwayToAether.modid);
		if(config_allowed_slabs && config_extended_granite)      registerBlockSlab(SLABS_GRANITE_COBBLE_MOSS, pre, StairwayToAether.modid);
		if(config_allowed_stair && config_extended_granite) Register.registerBlock(STAIR_GRANITE_COBBLE_MOSS,   pre, StairwayToAether.modid);
		if(config_allowed_walls && config_extended_granite) Register.registerBlock(WALLS_GRANITE_COBBLE_MOSS,   pre, StairwayToAether.modid);
			// Vanilla:                                                            BLOCK_GRANITE_SMOOTH
		if(config_allowed_slabs                           )      registerBlockSlab(SLABS_GRANITE_SMOOTH, pre, StairwayToAether.modid);
		if(config_allowed_stair                           ) Register.registerBlock(STAIR_GRANITE_SMOOTH,       pre, StairwayToAether.modid);
		if(config_allowed_walls                           ) Register.registerBlock(WALLS_GRANITE_SMOOTH,       pre, StairwayToAether.modid);
		if(                        config_extended_granite) Register.registerBlock(BLOCK_GRANITE_BRICK,        pre, StairwayToAether.modid);
		if(config_allowed_slabs && config_extended_granite)      registerBlockSlab(SLABS_GRANITE_BRICK, pre, StairwayToAether.modid);
		if(config_allowed_stair && config_extended_granite) Register.registerBlock(STAIR_GRANITE_BRICK,        pre, StairwayToAether.modid);
		if(config_allowed_walls && config_extended_granite) Register.registerBlock(WALLS_GRANITE_BRICK,        pre, StairwayToAether.modid);
		if(                        config_extended_granite) Register.registerBlock(BLOCK_GRANITE_BRICK_MOSS,    pre, StairwayToAether.modid);
		if(config_allowed_slabs && config_extended_granite)      registerBlockSlab(SLABS_GRANITE_BRICK_MOSS, pre, StairwayToAether.modid);
		if(config_allowed_stair && config_extended_granite) Register.registerBlock(STAIR_GRANITE_BRICK_MOSS,    pre, StairwayToAether.modid);
		if(config_allowed_walls && config_extended_granite) Register.registerBlock(WALLS_GRANITE_BRICK_MOSS,    pre, StairwayToAether.modid);
		if(                        config_extended_granite) Register.registerBlock(BLOCK_GRANITE_BRICK_CRACKED, pre, StairwayToAether.modid);
		if(config_allowed_slabs && config_extended_granite)      registerBlockSlab(SLABS_GRANITE_BRICK_CRACKED, pre, StairwayToAether.modid);
		if(config_allowed_stair && config_extended_granite) Register.registerBlock(STAIR_GRANITE_BRICK_CRACKED, pre, StairwayToAether.modid);
		if(config_allowed_walls && config_extended_granite) Register.registerBlock(WALLS_GRANITE_BRICK_CRACKED, pre, StairwayToAether.modid);
		if(                        config_extended_granite) Register.registerBlock(BLOCK_GRANITE_BRICK_CARVED,  pre, StairwayToAether.modid);
		if(                        config_extended_granite) Register.registerBlock(BLOCK_GRANITE_PILLAR,       pre, StairwayToAether.modid);
		
			// Vanilla:                                                            BLOCK_DIORITE_STONE
		if(config_allowed_slabs                           )      registerBlockSlab(SLABS_DIORITE_STONE, pre, StairwayToAether.modid);
		if(config_allowed_stair                           ) Register.registerBlock(STAIR_DIORITE_STONE,        pre, StairwayToAether.modid);
		if(config_allowed_walls                           ) Register.registerBlock(WALLS_DIORITE_STONE,        pre, StairwayToAether.modid);
		if(                        config_extended_diorite) Register.registerBlock(BLOCK_DIORITE_COBBLE,       pre, StairwayToAether.modid);
		if(config_allowed_slabs && config_extended_diorite)      registerBlockSlab(SLABS_DIORITE_COBBLE, pre, StairwayToAether.modid);
		if(config_allowed_stair && config_extended_diorite) Register.registerBlock(STAIR_DIORITE_COBBLE,       pre, StairwayToAether.modid);
		if(config_allowed_walls && config_extended_diorite) Register.registerBlock(WALLS_DIORITE_COBBLE,       pre, StairwayToAether.modid);
		if(                        config_extended_diorite) Register.registerBlock(BLOCK_DIORITE_COBBLE_MOSS,   pre, StairwayToAether.modid);
		if(config_allowed_slabs && config_extended_diorite)      registerBlockSlab(SLABS_DIORITE_COBBLE_MOSS, pre, StairwayToAether.modid);
		if(config_allowed_stair && config_extended_diorite) Register.registerBlock(STAIR_DIORITE_COBBLE_MOSS,   pre, StairwayToAether.modid);
		if(config_allowed_walls && config_extended_diorite) Register.registerBlock(WALLS_DIORITE_COBBLE_MOSS,   pre, StairwayToAether.modid);
			// Vanilla:                                                            BLOCK_DIORITE_SMOOTH
		if(config_allowed_slabs                           )      registerBlockSlab(SLABS_DIORITE_SMOOTH, pre, StairwayToAether.modid);
		if(config_allowed_stair                           ) Register.registerBlock(STAIR_DIORITE_SMOOTH,       pre, StairwayToAether.modid);
		if(config_allowed_walls                           ) Register.registerBlock(WALLS_DIORITE_SMOOTH,       pre, StairwayToAether.modid);
		if(                        config_extended_diorite) Register.registerBlock(BLOCK_DIORITE_BRICK,        pre, StairwayToAether.modid);
		if(config_allowed_slabs && config_extended_diorite)      registerBlockSlab(SLABS_DIORITE_BRICK, pre, StairwayToAether.modid);
		if(config_allowed_stair && config_extended_diorite) Register.registerBlock(STAIR_DIORITE_BRICK,        pre, StairwayToAether.modid);
		if(config_allowed_walls && config_extended_diorite) Register.registerBlock(WALLS_DIORITE_BRICK,        pre, StairwayToAether.modid);
		if(                        config_extended_diorite) Register.registerBlock(BLOCK_DIORITE_BRICK_MOSS,    pre, StairwayToAether.modid);
		if(config_allowed_slabs && config_extended_diorite)      registerBlockSlab(SLABS_DIORITE_BRICK_MOSS, pre, StairwayToAether.modid);
		if(config_allowed_stair && config_extended_diorite) Register.registerBlock(STAIR_DIORITE_BRICK_MOSS,    pre, StairwayToAether.modid);
		if(config_allowed_walls && config_extended_diorite) Register.registerBlock(WALLS_DIORITE_BRICK_MOSS,    pre, StairwayToAether.modid);
		if(                        config_extended_diorite) Register.registerBlock(BLOCK_DIORITE_BRICK_CRACKED, pre, StairwayToAether.modid);
		if(config_allowed_slabs && config_extended_diorite)      registerBlockSlab(SLABS_DIORITE_BRICK_CRACKED, pre, StairwayToAether.modid);
		if(config_allowed_stair && config_extended_diorite) Register.registerBlock(STAIR_DIORITE_BRICK_CRACKED, pre, StairwayToAether.modid);
		if(config_allowed_walls && config_extended_diorite) Register.registerBlock(WALLS_DIORITE_BRICK_CRACKED, pre, StairwayToAether.modid);
		if(                        config_extended_diorite) Register.registerBlock(BLOCK_DIORITE_BRICK_CARVED,  pre, StairwayToAether.modid);
		if(                        config_extended_diorite) Register.registerBlock(BLOCK_DIORITE_PILLAR,       pre, StairwayToAether.modid);
		
			// Vanilla:                                                             BLOCK_ANDESITE_STONE
		if(config_allowed_slabs                            )      registerBlockSlab(SLABS_ANDESITE_STONE, pre, StairwayToAether.modid);
		if(config_allowed_stair                            ) Register.registerBlock(STAIR_ANDESITE_STONE,        pre, StairwayToAether.modid);
		if(config_allowed_walls                            ) Register.registerBlock(WALLS_ANDESITE_STONE,        pre, StairwayToAether.modid);
		if(                        config_extended_andesite) Register.registerBlock(BLOCK_ANDESITE_COBBLE,       pre, StairwayToAether.modid);
		if(config_allowed_slabs && config_extended_andesite)      registerBlockSlab(SLABS_ANDESITE_COBBLE, pre, StairwayToAether.modid);
		if(config_allowed_stair && config_extended_andesite) Register.registerBlock(STAIR_ANDESITE_COBBLE,       pre, StairwayToAether.modid);
		if(config_allowed_walls && config_extended_andesite) Register.registerBlock(WALLS_ANDESITE_COBBLE,       pre, StairwayToAether.modid);
		if(                        config_extended_andesite) Register.registerBlock(BLOCK_ANDESITE_COBBLE_MOSS,   pre, StairwayToAether.modid);
		if(config_allowed_slabs && config_extended_andesite)      registerBlockSlab(SLABS_ANDESITE_COBBLE_MOSS, pre, StairwayToAether.modid);
		if(config_allowed_stair && config_extended_andesite) Register.registerBlock(STAIR_ANDESITE_COBBLE_MOSS,   pre, StairwayToAether.modid);
		if(config_allowed_walls && config_extended_andesite) Register.registerBlock(WALLS_ANDESITE_COBBLE_MOSS,   pre, StairwayToAether.modid);
			// Vanilla:                                                             BLOCK_ANDESITE_SMOOTH
		if(config_allowed_slabs                            )      registerBlockSlab(SLABS_ANDESITE_SMOOTH, pre, StairwayToAether.modid);
		if(config_allowed_stair                            ) Register.registerBlock(STAIR_ANDESITE_SMOOTH,       pre, StairwayToAether.modid);
		if(config_allowed_walls                            ) Register.registerBlock(WALLS_ANDESITE_SMOOTH,       pre, StairwayToAether.modid);
		if(                        config_extended_andesite) Register.registerBlock(BLOCK_ANDESITE_BRICK,        pre, StairwayToAether.modid);
		if(config_allowed_slabs && config_extended_andesite)      registerBlockSlab(SLABS_ANDESITE_BRICK, pre, StairwayToAether.modid);
		if(config_allowed_stair && config_extended_andesite) Register.registerBlock(STAIR_ANDESITE_BRICK,        pre, StairwayToAether.modid);
		if(config_allowed_walls && config_extended_andesite) Register.registerBlock(WALLS_ANDESITE_BRICK,        pre, StairwayToAether.modid);
		if(                        config_extended_andesite) Register.registerBlock(BLOCK_ANDESITE_BRICK_MOSS,    pre, StairwayToAether.modid);
		if(config_allowed_slabs && config_extended_andesite)      registerBlockSlab(SLABS_ANDESITE_BRICK_MOSS, pre, StairwayToAether.modid);
		if(config_allowed_stair && config_extended_andesite) Register.registerBlock(STAIR_ANDESITE_BRICK_MOSS,    pre, StairwayToAether.modid);
		if(config_allowed_walls && config_extended_andesite) Register.registerBlock(WALLS_ANDESITE_BRICK_MOSS,    pre, StairwayToAether.modid);
		if(                        config_extended_andesite) Register.registerBlock(BLOCK_ANDESITE_BRICK_CRACKED, pre, StairwayToAether.modid);
		if(config_allowed_slabs && config_extended_andesite)      registerBlockSlab(SLABS_ANDESITE_BRICK_CRACKED, pre, StairwayToAether.modid);
		if(config_allowed_stair && config_extended_andesite) Register.registerBlock(STAIR_ANDESITE_BRICK_CRACKED, pre, StairwayToAether.modid);
		if(config_allowed_walls && config_extended_andesite) Register.registerBlock(WALLS_ANDESITE_BRICK_CRACKED, pre, StairwayToAether.modid);
		if(                        config_extended_andesite) Register.registerBlock(BLOCK_ANDESITE_BRICK_CARVED,  pre, StairwayToAether.modid);
		if(                        config_extended_andesite) Register.registerBlock(BLOCK_ANDESITE_PILLAR,       pre, StairwayToAether.modid);
		
		if(config_allowed_slabs)      registerBlockSlab(SLABS_PRISMARINE_STONE, pre, StairwayToAether.modid);
		if(config_allowed_stair) Register.registerBlock(STAIR_PRISMARINE_STONE, pre, StairwayToAether.modid);
		if(config_allowed_walls) Register.registerBlock(WALLS_PRISMARINE_STONE, pre, StairwayToAether.modid);
		if(config_allowed_slabs)      registerBlockSlab(SLABS_PRISMARINE_BRICK, pre, StairwayToAether.modid);
		if(config_allowed_stair) Register.registerBlock(STAIR_PRISMARINE_BRICK, pre, StairwayToAether.modid);
		if(config_allowed_walls) Register.registerBlock(WALLS_PRISMARINE_BRICK, pre, StairwayToAether.modid);
		if(config_allowed_slabs)      registerBlockSlab(SLABS_PRISMARINE_DARK, pre, StairwayToAether.modid);
		if(config_allowed_stair) Register.registerBlock(STAIR_PRISMARINE_DARK,  pre, StairwayToAether.modid);
		if(config_allowed_walls) Register.registerBlock(WALLS_PRISMARINE_DARK,  pre, StairwayToAether.modid);
		
			// Vanilla:                                                        BLOCK_END_STONE
		if(config_allowed_slabs                       )      registerBlockSlab(SLABS_END_STONE, pre, StairwayToAether.modid);
		if(config_allowed_stair                       ) Register.registerBlock(STAIR_END_STONE,        pre, StairwayToAether.modid);
		if(config_allowed_walls                       ) Register.registerBlock(WALLS_END_STONE,        pre, StairwayToAether.modid);
		if(                        config_extended_end) Register.registerBlock(BLOCK_END_COBBLE,       pre, StairwayToAether.modid);
		if(config_allowed_slabs && config_extended_end)      registerBlockSlab(SLABS_END_COBBLE, pre, StairwayToAether.modid);
		if(config_allowed_stair && config_extended_end) Register.registerBlock(STAIR_END_COBBLE,       pre, StairwayToAether.modid);
		if(config_allowed_walls && config_extended_end) Register.registerBlock(WALLS_END_COBBLE,       pre, StairwayToAether.modid);
		if(                        config_extended_end) Register.registerBlock(BLOCK_END_COBBLE_MOSS,   pre, StairwayToAether.modid);
		if(config_allowed_slabs && config_extended_end)      registerBlockSlab(SLABS_END_COBBLE_MOSS, pre, StairwayToAether.modid);
		if(config_allowed_stair && config_extended_end) Register.registerBlock(STAIR_END_COBBLE_MOSS,   pre, StairwayToAether.modid);
		if(config_allowed_walls && config_extended_end) Register.registerBlock(WALLS_END_COBBLE_MOSS,   pre, StairwayToAether.modid);
		if(                        config_extended_end) Register.registerBlock(BLOCK_END_SMOOTH,       pre, StairwayToAether.modid);
		if(config_allowed_slabs && config_extended_end)      registerBlockSlab(SLABS_END_SMOOTH, pre, StairwayToAether.modid);
		if(config_allowed_stair && config_extended_end) Register.registerBlock(STAIR_END_SMOOTH,       pre, StairwayToAether.modid);
		if(config_allowed_walls && config_extended_end) Register.registerBlock(WALLS_END_SMOOTH,       pre, StairwayToAether.modid);
			// Vanilla:                                                        BLOCK_END_BRICK
		if(config_allowed_slabs                       )      registerBlockSlab(SLABS_END_BRICK, pre, StairwayToAether.modid);
		if(config_allowed_stair                       ) Register.registerBlock(STAIR_END_BRICK,        pre, StairwayToAether.modid);
		if(config_allowed_walls                       ) Register.registerBlock(WALLS_END_BRICK,        pre, StairwayToAether.modid);
		if(                        config_extended_end) Register.registerBlock(BLOCK_END_BRICK_MOSS,    pre, StairwayToAether.modid);
		if(config_allowed_slabs && config_extended_end)      registerBlockSlab(SLABS_END_BRICK_MOSS, pre, StairwayToAether.modid);
		if(config_allowed_stair && config_extended_end) Register.registerBlock(STAIR_END_BRICK_MOSS,    pre, StairwayToAether.modid);
		if(config_allowed_walls && config_extended_end) Register.registerBlock(WALLS_END_BRICK_MOSS,    pre, StairwayToAether.modid);
		if(                        config_extended_end) Register.registerBlock(BLOCK_END_BRICK_CRACKED, pre, StairwayToAether.modid);
		if(config_allowed_slabs && config_extended_end)      registerBlockSlab(SLABS_END_BRICK_CRACKED, pre, StairwayToAether.modid);
		if(config_allowed_stair && config_extended_end) Register.registerBlock(STAIR_END_BRICK_CRACKED, pre, StairwayToAether.modid);
		if(config_allowed_walls && config_extended_end) Register.registerBlock(WALLS_END_BRICK_CRACKED, pre, StairwayToAether.modid);
		if(                        config_extended_end) Register.registerBlock(BLOCK_END_BRICK_CARVED,  pre, StairwayToAether.modid);
		if(                        config_extended_end) Register.registerBlock(BLOCK_END_PILLAR,  pre, StairwayToAether.modid);
		
		if(config_allowed_slabs)      registerBlockSlab(SLABS_REDNETHER_BRICK, pre, StairwayToAether.modid);
		if(config_allowed_stair) Register.registerBlock(STAIR_REDNETHER_BRICK, pre, StairwayToAether.modid);
		if(config_allowed_walls) Register.registerBlock(WALLS_REDNETHER_BRICK, pre, StairwayToAether.modid);
		
		// Vanilla:                                                                 BLOCK_OBSIDIAN_STONE
		if(config_allowed_slabs && config_extended_obsidian)      registerBlockSlab(SLABS_OBSIDIAN_STONE, pre, StairwayToAether.modid);
		if(config_allowed_stair && config_extended_obsidian) Register.registerBlock(STAIR_OBSIDIAN_STONE,        pre, StairwayToAether.modid);
		if(config_allowed_walls && config_extended_obsidian) Register.registerBlock(WALLS_OBSIDIAN_STONE,        pre, StairwayToAether.modid);
		if(                        config_extended_obsidian) Register.registerBlock(BLOCK_OBSIDIAN_SMOOTH,       pre, StairwayToAether.modid);
		if(config_allowed_slabs && config_extended_obsidian)      registerBlockSlab(SLABS_OBSIDIAN_SMOOTH, pre, StairwayToAether.modid);
		if(config_allowed_stair && config_extended_obsidian) Register.registerBlock(STAIR_OBSIDIAN_SMOOTH,       pre, StairwayToAether.modid);
		if(config_allowed_walls && config_extended_obsidian) Register.registerBlock(WALLS_OBSIDIAN_SMOOTH,       pre, StairwayToAether.modid);
		if(                        config_extended_obsidian) Register.registerBlock(BLOCK_OBSIDIAN_CARVED,       pre, StairwayToAether.modid);
		if(                        config_extended_obsidian) Register.registerBlock(BLOCK_OBSIDIAN_PILLAR,       pre, StairwayToAether.modid);
		
		if(config_allowed_slabs)      registerBlockSlab(SLABS_CONCRETE_WHITE, pre, StairwayToAether.modid);
		if(config_allowed_stair) Register.registerBlock(STAIR_CONCRETE_WHITE,        pre, StairwayToAether.modid);
		if(config_allowed_walls) Register.registerBlock(WALLS_CONCRETE_WHITE,        pre, StairwayToAether.modid);
		if(config_allowed_slabs)      registerBlockSlab(SLABS_CONCRETE_ORANGE, pre, StairwayToAether.modid);
		if(config_allowed_stair) Register.registerBlock(STAIR_CONCRETE_ORANGE,        pre, StairwayToAether.modid);
		if(config_allowed_walls) Register.registerBlock(WALLS_CONCRETE_ORANGE,        pre, StairwayToAether.modid);
		if(config_allowed_slabs)      registerBlockSlab(SLABS_CONCRETE_MAGENTA, pre, StairwayToAether.modid);
		if(config_allowed_stair) Register.registerBlock(STAIR_CONCRETE_MAGENTA,        pre, StairwayToAether.modid);
		if(config_allowed_walls) Register.registerBlock(WALLS_CONCRETE_MAGENTA,        pre, StairwayToAether.modid);
		if(config_allowed_slabs)      registerBlockSlab(SLABS_CONCRETE_LIGHTBLUE, pre, StairwayToAether.modid);
		if(config_allowed_stair) Register.registerBlock(STAIR_CONCRETE_LIGHTBLUE,        pre, StairwayToAether.modid);
		if(config_allowed_walls) Register.registerBlock(WALLS_CONCRETE_LIGHTBLUE,        pre, StairwayToAether.modid);
		if(config_allowed_slabs)      registerBlockSlab(SLABS_CONCRETE_YELLOW, pre, StairwayToAether.modid);
		if(config_allowed_stair) Register.registerBlock(STAIR_CONCRETE_YELLOW,        pre, StairwayToAether.modid);
		if(config_allowed_walls) Register.registerBlock(WALLS_CONCRETE_YELLOW,        pre, StairwayToAether.modid);
		if(config_allowed_slabs)      registerBlockSlab(SLABS_CONCRETE_LIME, pre, StairwayToAether.modid);
		if(config_allowed_stair) Register.registerBlock(STAIR_CONCRETE_LIME,        pre, StairwayToAether.modid);
		if(config_allowed_walls) Register.registerBlock(WALLS_CONCRETE_LIME,        pre, StairwayToAether.modid);
		if(config_allowed_slabs)      registerBlockSlab(SLABS_CONCRETE_PINK, pre, StairwayToAether.modid);
		if(config_allowed_stair) Register.registerBlock(STAIR_CONCRETE_PINK,        pre, StairwayToAether.modid);
		if(config_allowed_walls) Register.registerBlock(WALLS_CONCRETE_PINK,        pre, StairwayToAether.modid);
		if(config_allowed_slabs)      registerBlockSlab(SLABS_CONCRETE_GRAY, pre, StairwayToAether.modid);
		if(config_allowed_stair) Register.registerBlock(STAIR_CONCRETE_GRAY,        pre, StairwayToAether.modid);
		if(config_allowed_walls) Register.registerBlock(WALLS_CONCRETE_GRAY,        pre, StairwayToAether.modid);
		if(config_allowed_slabs)      registerBlockSlab(SLABS_CONCRETE_SILVER, pre, StairwayToAether.modid);
		if(config_allowed_stair) Register.registerBlock(STAIR_CONCRETE_SILVER,        pre, StairwayToAether.modid);
		if(config_allowed_walls) Register.registerBlock(WALLS_CONCRETE_SILVER,        pre, StairwayToAether.modid);
		if(config_allowed_slabs)      registerBlockSlab(SLABS_CONCRETE_CYAN, pre, StairwayToAether.modid);
		if(config_allowed_stair) Register.registerBlock(STAIR_CONCRETE_CYAN,        pre, StairwayToAether.modid);
		if(config_allowed_walls) Register.registerBlock(WALLS_CONCRETE_CYAN,        pre, StairwayToAether.modid);
		if(config_allowed_slabs)      registerBlockSlab(SLABS_CONCRETE_PURPLE, pre, StairwayToAether.modid);
		if(config_allowed_stair) Register.registerBlock(STAIR_CONCRETE_PURPLE,        pre, StairwayToAether.modid);
		if(config_allowed_walls) Register.registerBlock(WALLS_CONCRETE_PURPLE,        pre, StairwayToAether.modid);
		if(config_allowed_slabs)      registerBlockSlab(SLABS_CONCRETE_BLUE, pre, StairwayToAether.modid);
		if(config_allowed_stair) Register.registerBlock(STAIR_CONCRETE_BLUE,        pre, StairwayToAether.modid);
		if(config_allowed_walls) Register.registerBlock(WALLS_CONCRETE_BLUE,        pre, StairwayToAether.modid);
		if(config_allowed_slabs)      registerBlockSlab(SLABS_CONCRETE_BROWN, pre, StairwayToAether.modid);
		if(config_allowed_stair) Register.registerBlock(STAIR_CONCRETE_BROWN,        pre, StairwayToAether.modid);
		if(config_allowed_walls) Register.registerBlock(WALLS_CONCRETE_BROWN,        pre, StairwayToAether.modid);
		if(config_allowed_slabs)      registerBlockSlab(SLABS_CONCRETE_GREEN, pre, StairwayToAether.modid);
		if(config_allowed_stair) Register.registerBlock(STAIR_CONCRETE_GREEN,        pre, StairwayToAether.modid);
		if(config_allowed_walls) Register.registerBlock(WALLS_CONCRETE_GREEN,        pre, StairwayToAether.modid);
		if(config_allowed_slabs)      registerBlockSlab(SLABS_CONCRETE_RED, pre, StairwayToAether.modid);
		if(config_allowed_stair) Register.registerBlock(STAIR_CONCRETE_RED,        pre, StairwayToAether.modid);
		if(config_allowed_walls) Register.registerBlock(WALLS_CONCRETE_RED,        pre, StairwayToAether.modid);
		if(config_allowed_slabs)      registerBlockSlab(SLABS_CONCRETE_BLACK, pre, StairwayToAether.modid);
		if(config_allowed_stair) Register.registerBlock(STAIR_CONCRETE_BLACK,        pre, StairwayToAether.modid);
		if(config_allowed_walls) Register.registerBlock(WALLS_CONCRETE_BLACK,        pre, StairwayToAether.modid);
		
		if(config_allowed_timber) Register.registerColoredBlock(BLOCK_TIMBER_BASIC,      pre, StairwayToAether.modid);
		if(config_allowed_timber) Register.registerColoredBlock(BLOCK_TIMBER_HORIZONTAL, pre, StairwayToAether.modid);
		if(config_allowed_timber) Register.registerColoredBlock(BLOCK_TIMBER_VERTICAL,   pre, StairwayToAether.modid);
		if(config_allowed_timber) Register.registerColoredBlock(BLOCK_TIMBER_PLUS,       pre, StairwayToAether.modid);
		if(config_allowed_timber) Register.registerColoredBlock(BLOCK_TIMBER_DIAG_LEFT,  pre, StairwayToAether.modid);
		if(config_allowed_timber) Register.registerColoredBlock(BLOCK_TIMBER_DIAG_RIGHT, pre, StairwayToAether.modid);
		if(config_allowed_timber) Register.registerColoredBlock(BLOCK_TIMBER_CROSS,      pre, StairwayToAether.modid);
		
		if(config_allowed_scaffolding) Register.registerBlock(BLOCK_SCAFFOLDING,      pre, StairwayToAether.modid);
		
		if(config_allowed_chains) Register.registerBlock(BLOCK_CHAIN_IRON, pre, StairwayToAether.modid);
		if(config_allowed_chains) Register.registerBlock(BLOCK_CHAIN_GOLD, pre, StairwayToAether.modid);
	}
	
	/**Register Sounds**/
	public static void registerSounds(){
		
	}
	
	/**Register Crafting and Furnace Recipes**/
	public static void registerRecipes(){
		FurnaceRecipes.instance().getSmeltingList().remove(new ItemStack(Blocks.STONE));
		//Register.removeRecipes(Blocks.STONEBRICK);
		if(config_extended_granite)  GameRegistry.addSmelting(new ItemStack(Blocks.STONE,              1, 0), new ItemStack(BLOCK_STONE_SMOOTH,        1, 0), 5);
		if(config_extended_granite)  GameRegistry.addSmelting(new ItemStack(Blocks.STONE,              1, 1), new ItemStack(Blocks.STONE,              1, 2), 5);
		if(config_extended_granite)  GameRegistry.addSmelting(new ItemStack(BLOCK_GRANITE_BRICK,       1, 0), new ItemStack(BLOCK_GRANITE_BRICK_CRACKED,  1, 0), 5);
		if(config_extended_granite)  GameRegistry.addSmelting(new ItemStack(BLOCK_GRANITE_BRICK_MOSS,  1, 0), new ItemStack(BLOCK_GRANITE_BRICK_CRACKED,  1, 0), 5);
		if(config_extended_diorite)  GameRegistry.addSmelting(new ItemStack(Blocks.STONE,              1, 3), new ItemStack(Blocks.STONE,              1, 4), 5);
		if(config_extended_diorite)  GameRegistry.addSmelting(new ItemStack(BLOCK_DIORITE_BRICK,       1, 0), new ItemStack(BLOCK_DIORITE_BRICK_CRACKED,  1, 0), 5);
		if(config_extended_diorite)  GameRegistry.addSmelting(new ItemStack(BLOCK_DIORITE_BRICK_MOSS,  1, 0), new ItemStack(BLOCK_DIORITE_BRICK_CRACKED,  1, 0), 5);
		if(config_extended_andesite) GameRegistry.addSmelting(new ItemStack(Blocks.STONE,              1, 5), new ItemStack(Blocks.STONE,              1, 6), 5);
		if(config_extended_andesite) GameRegistry.addSmelting(new ItemStack(BLOCK_ANDESITE_BRICK,      1, 0), new ItemStack(BLOCK_ANDESITE_BRICK_CRACKED, 1, 0), 5);
		if(config_extended_andesite) GameRegistry.addSmelting(new ItemStack(BLOCK_ANDESITE_BRICK_MOSS, 1, 0), new ItemStack(BLOCK_ANDESITE_BRICK_CRACKED, 1, 0), 5);
		if(config_extended_end)      GameRegistry.addSmelting(new ItemStack(Blocks.END_STONE,          1, 0), new ItemStack(BLOCK_END_SMOOTH,            1, 0), 5);
		if(config_extended_end)      GameRegistry.addSmelting(new ItemStack(Blocks.END_BRICKS,         1, 0), new ItemStack(BLOCK_END_BRICK_CRACKED,      1, 0), 5);
		if(config_extended_end)      GameRegistry.addSmelting(new ItemStack(BLOCK_END_BRICK_MOSS,      1, 0), new ItemStack(BLOCK_END_BRICK_CRACKED,      1, 0), 5);
	}
	
	/**Register Living Entities**/
	public static void registerEntities(){
		
	}
	
	/**Registers all Renderer to their Living Entities**/
	public static void registerRenders(){
		
	}
	
	private static void registerBlockSlab(Block block, boolean pre, String modid){
		if(pre){
			ForgeRegistries.BLOCKS.register(block);
			ForgeRegistries.ITEMS.register(new ItemBlockSlab(block).setUnlocalizedName(block.getUnlocalizedName().substring(5)).setRegistryName(block.getRegistryName()));
		}else{
			Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block), 0, new ModelResourceLocation(modid + ":" + block.getUnlocalizedName().substring(5), "inventory"));
		}
	}
	
	private static void registerBlockSlab(Block block, Block blockHalf, Block BlockFull, boolean stacked, boolean pre){
		if(pre){
			ForgeRegistries.BLOCKS.register(block);
			//ForgeRegistries.ITEMS.register(new ItemBlockSlab(block, blockHalf, BlockFull, stacked).setUnlocalizedName(block.getUnlocalizedName().substring(5)).setRegistryName(block.getRegistryName()));
		}else{
			Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block), 0, new ModelResourceLocation(StairwayToAether.modid + ":" + block.getUnlocalizedName().substring(5), "inventory"));
		}
	}
	
}
