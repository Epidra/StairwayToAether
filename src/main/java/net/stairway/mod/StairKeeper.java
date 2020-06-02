package net.stairway.mod;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.stairway.mod.blocks.BlockBlock;
import net.stairway.mod.blocks.SlabBlock;
import net.stairway.mod.blocks.SlabBlockFull;
import net.stairway.mod.blocks.SlabBlockHalf;
import net.stairway.mod.blocks.StairBlock;
import net.stairway.mod.blocks.WallBlock;
import net.stairway.mod.items.ItemSlabBlock;

public class StairKeeper {
	
	// Vanilla:             blockStoneStone
	// Vanilla:				slabsStoneStoneHalf
	// Vanilla:				slabsStoneStoneFull
	public static Block     stairStoneStone            = new StairBlock   ("StairStoneStone",    Blocks.STONE.getStateById(1));
	public static Block     wallsStoneStone            = new WallBlock    ("WallsStoneStone");
	// Vanilla:             blockStoneCobble
	// Vanilla:             slabsStoneCobbleHalf
	// Vanilla:             slabsStoneCobbleFull
	// Vanilla:             stairStoneCobble
	// Vanilla:             wallsStoneCobble
	// Vanilla:             blockStoneCobbleMoss
	public static SlabBlock slabsStoneCobbleMossHalf   = new SlabBlockHalf("SlabsStoneCobbleMossHalf");
	public static SlabBlock slabsStoneCobbleMossFull   = new SlabBlockFull("SlabsStoneCobbleMossFull");
	public static Block     stairStoneCobbleMoss       = new StairBlock   ("StairStoneCobbleMoss",    Blocks.MOSSY_COBBLESTONE.getDefaultState());
	// Vanilla              wallsStoneCobbleMoss
	public static Block     blockStoneSmooth           = new BlockBlock   ("BlockStoneSmooth", 3, 2);
	public static SlabBlock slabsStoneSmoothHalf       = new SlabBlockHalf("SlabsStoneSmoothHalf");
	public static SlabBlock slabsStoneSmoothFull       = new SlabBlockFull("SlabsStoneSmoothFull");
	public static Block     stairStoneSmooth           = new StairBlock   ("StairStoneSmooth",    blockStoneSmooth.getDefaultState());
	public static Block     wallsStoneSmooth           = new WallBlock    ("WallsStoneSmooth");
	// Vanilla: blockStoneBrick
	// Vanilla: slabsStoneBrickHalf
	// Vanilla: slabsStoneBrickHull
	// Vanilla: stairStoneBrick
	public static Block     wallsStoneBrick            = new WallBlock    ("WallsStoneBrick");
	// Vanilla:             blockStoneBrickMoss                             BlockStoneBrickMoss
	public static SlabBlock slabsStoneBrickMossHalf    = new SlabBlockHalf("SlabsStoneBrickMossHalf");
	public static SlabBlock slabsStoneBrickMossFull    = new SlabBlockFull("SlabsStoneBrickMossFull");
	public static Block     stairStoneBrickMoss        = new StairBlock   ("StairStoneBrickMoss",  Blocks.STONEBRICK.getStateById(1));
	public static Block     wallsStoneBrickMoss        = new WallBlock    ("WallsStoneBrickMoss");
	// Vanilla:             blockStoneBrickCracked                          BlockStoneBrickCracked
	public static SlabBlock slabsStoneBrickCrackedHalf = new SlabBlockHalf("SlabsStoneBrickCrackedHalf");
	public static SlabBlock slabsStoneBrickCrackedFull = new SlabBlockFull("SlabsStoneBrickCrackedFull");
	public static Block     stairStoneBrickCracked     = new StairBlock   ("StairStoneBrickCracked", Blocks.STONEBRICK.getStateById(2));
	public static Block     wallsStoneBrickCracked     = new WallBlock    ("WallsStoneBrickCracked");
	// Vanilla:             blockStoneBrickCarved
	
	// Vanilla:             blockGraniteStone                                 BlockGraniteStone
	public static SlabBlock slabsGraniteStoneHalf        = new SlabBlockHalf("SlabsGraniteStoneHalf");
	public static SlabBlock slabsGraniteStoneFull        = new SlabBlockFull("SlabsGraniteStoneFull");
	public static Block     stairGraniteStone            = new StairBlock   ("StairGraniteStone",    Blocks.STONE.getStateById(1));
	public static Block     wallsGraniteStone            = new WallBlock    ("WallsGraniteStone");
	public static Block     blockGraniteCobble           = new BlockBlock   ("BlockGraniteCobble", 3, 2);
	public static SlabBlock slabsGraniteCobbleHalf       = new SlabBlockHalf("SlabsGraniteCobbleHalf");
	public static SlabBlock slabsGraniteCobbleFull       = new SlabBlockFull("SlabsGraniteCobbleFull");
	public static Block     stairGraniteCobble           = new StairBlock   ("StairGraniteCobble",    blockGraniteCobble.getDefaultState());
	public static Block     wallsGraniteCobble           = new WallBlock    ("WallsGraniteCobble");
	public static Block     blockGraniteCobbleMoss       = new BlockBlock   ("BlockGraniteCobbleMoss", 3, 2);
	public static SlabBlock slabsGraniteCobbleMossHalf   = new SlabBlockHalf("SlabsGraniteCobbleMossHalf");
	public static SlabBlock slabsGraniteCobbleMossFull   = new SlabBlockFull("SlabsGraniteCobbleMossFull");
	public static Block     stairGraniteCobbleMoss       = new StairBlock   ("StairGraniteCobbleMoss",    blockGraniteCobbleMoss.getDefaultState());
	public static Block     wallsGraniteCobbleMoss       = new WallBlock    ("WallsGraniteCobbleMoss");
	// Vanilla:             blockGraniteSmooth                                BlockGraniteSmooth
	public static SlabBlock slabsGraniteSmoothHalf       = new SlabBlockHalf("SlabsGraniteSmoothHalf");
	public static SlabBlock slabsGraniteSmoothFull       = new SlabBlockFull("SlabsGraniteSmoothFull");
	public static Block     stairGraniteSmooth           = new StairBlock   ("StairGraniteSmooth",    Blocks.STONE.getStateById(2));
	public static Block     wallsGraniteSmooth           = new WallBlock    ("WallsGraniteSmooth");
	public static Block     blockGraniteBrick            = new BlockBlock   ("BlockGraniteBrick", 3, 2);
	public static SlabBlock slabsGraniteBrickHalf        = new SlabBlockHalf("SlabsGraniteBrickHalf");
	public static SlabBlock slabsGraniteBrickFull        = new SlabBlockFull("SlabsGraniteBrickFull");
	public static Block     stairGraniteBrick            = new StairBlock   ("StairGraniteBrick",    blockGraniteBrick.getDefaultState());
	public static Block     wallsGraniteBrick            = new WallBlock    ("WallsGraniteBrick");
	public static Block     blockGraniteBrickMoss        = new BlockBlock   ("BlockGraniteBrickMoss", 3, 2);
	public static SlabBlock slabsGraniteBrickMossHalf    = new SlabBlockHalf("SlabsGraniteBrickMossHalf");
	public static SlabBlock slabsGraniteBrickMossFull    = new SlabBlockFull("SlabsGraniteBrickMossFull");
	public static Block     stairGraniteBrickMoss        = new StairBlock   ("StairGraniteBrickMoss",    blockGraniteBrickMoss.getDefaultState());
	public static Block     wallsGraniteBrickMoss        = new WallBlock    ("WallsGraniteBrickMoss");
	public static Block     blockGraniteBrickCracked     = new BlockBlock   ("BlockGraniteBrickCracked", 3, 2);
	public static SlabBlock slabsGraniteBrickCrackedHalf = new SlabBlockHalf("SlabsGraniteBrickCrackedHalf");
	public static SlabBlock slabsGraniteBrickCrackedFull = new SlabBlockFull("SlabsGraniteBrickCrackedFull");
	public static Block     stairGraniteBrickCracked     = new StairBlock   ("StairGraniteBrickCracked",    blockGraniteBrickCracked.getDefaultState());
	public static Block     wallsGraniteBrickCracked     = new WallBlock    ("WallsGraniteBrickCracked");
	public static Block     blockGraniteBrickCarved      = new BlockBlock   ("BlockGraniteBrickCarved", 3, 2);
	
	// Vanilla:             blockDioriteStone                                 BlockDioriteStone
	public static SlabBlock slabsDioriteStoneHalf        = new SlabBlockHalf("SlabsDioriteStoneHalf");
	public static SlabBlock slabsDioriteStoneFull        = new SlabBlockFull("SlabsDioriteStoneFull");
	public static Block     stairDioriteStone            = new StairBlock   ("StairDioriteStone",    Blocks.STONE.getStateById(3));
	public static Block     wallsDioriteStone            = new WallBlock    ("WallsDioriteStone");
	public static Block     blockDioriteCobble           = new BlockBlock   ("BlockDioriteCobble", 3, 2);
	public static SlabBlock slabsDioriteCobbleHalf       = new SlabBlockHalf("SlabsDioriteCobbleHalf");
	public static SlabBlock slabsDioriteCobbleFull       = new SlabBlockFull("SlabsDioriteCobbleFull");
	public static Block     stairDioriteCobble           = new StairBlock   ("StairDioriteCobble",    blockDioriteCobble.getDefaultState());
	public static Block     wallsDioriteCobble           = new WallBlock    ("WallsDioriteCobble");
	public static Block     blockDioriteCobbleMoss       = new BlockBlock   ("BlockDioriteCobbleMoss", 3, 2);
	public static SlabBlock slabsDioriteCobbleMossHalf   = new SlabBlockHalf("SlabsDioriteCobbleMossHalf");
	public static SlabBlock slabsDioriteCobbleMossFull   = new SlabBlockFull("SlabsDioriteCobbleMossFull");
	public static Block     stairDioriteCobbleMoss       = new StairBlock   ("StairDioriteCobbleMoss",    blockDioriteCobbleMoss.getDefaultState());
	public static Block     wallsDioriteCobbleMoss       = new WallBlock    ("WallsDioriteCobbleMoss");
	// Vanilla:             blockDioriteSmooth                                BlockDioriteSmooth
	public static SlabBlock slabsDioriteSmoothHalf       = new SlabBlockHalf("SlabsDioriteSmoothHalf");
	public static SlabBlock slabsDioriteSmoothFull       = new SlabBlockFull("SlabsDioriteSmoothFull");
	public static Block     stairDioriteSmooth           = new StairBlock   ("StairDioriteSmooth",    Blocks.STONE.getStateById(4));
	public static Block     wallsDioriteSmooth           = new WallBlock    ("WallsDioriteSmooth");
	public static Block     blockDioriteBrick            = new BlockBlock   ("BlockDioriteBrick", 3, 2);
	public static SlabBlock slabsDioriteBrickHalf        = new SlabBlockHalf("SlabsDioriteBrickHalf");
	public static SlabBlock slabsDioriteBrickFull        = new SlabBlockFull("SlabsDioriteBrickFull");
	public static Block     stairDioriteBrick            = new StairBlock   ("StairDioriteBrick",    blockDioriteBrick.getDefaultState());
	public static Block     wallsDioriteBrick            = new WallBlock    ("WallsDioriteBrick");
	public static Block     blockDioriteBrickMoss        = new BlockBlock   ("BlockDioriteBrickMoss", 3, 2);
	public static SlabBlock slabsDioriteBrickMossHalf    = new SlabBlockHalf("SlabsDioriteBrickMossHalf");
	public static SlabBlock slabsDioriteBrickMossFull    = new SlabBlockFull("SlabsDioriteBrickMossFull");
	public static Block     stairDioriteBrickMoss        = new StairBlock   ("StairDioriteBrickMoss",    blockDioriteBrickMoss.getDefaultState());
	public static Block     wallsDioriteBrickMoss        = new WallBlock    ("WallsDioriteBrickMoss");
	public static Block     blockDioriteBrickCracked     = new BlockBlock   ("BlockDioriteBrickCracked", 3, 2);
	public static SlabBlock slabsDioriteBrickCrackedHalf = new SlabBlockHalf("SlabsDioriteBrickCrackedHalf");
	public static SlabBlock slabsDioriteBrickCrackedFull = new SlabBlockFull("SlabsDioriteBrickCrackedFull");
	public static Block     stairDioriteBrickCracked     = new StairBlock   ("StairDioriteBrickCracked",    blockDioriteBrickCracked.getDefaultState());
	public static Block     wallsDioriteBrickCracked     = new WallBlock    ("WallsDioriteBrickCracked");
	public static Block     blockDioriteBrickCarved      = new BlockBlock   ("BlockDioriteBrickCarved", 3, 2);
	
	// Vanilla:             blockAndesiteStone                                 BlockAndesiteStone
	public static SlabBlock slabsAndesiteStoneHalf        = new SlabBlockHalf("SlabsAndesiteStoneHalf");
	public static SlabBlock slabsAndesiteStoneFull        = new SlabBlockFull("SlabsAndesiteStoneFull");
	public static Block     stairAndesiteStone            = new StairBlock   ("StairAndesiteStone",    Blocks.STONE.getStateById(5));
	public static Block     wallsAndesiteStone            = new WallBlock    ("WallsAndesiteStone");
	public static Block     blockAndesiteCobble           = new BlockBlock   ("BlockAndesiteCobble", 3, 2);
	public static SlabBlock slabsAndesiteCobbleHalf       = new SlabBlockHalf("SlabsAndesiteCobbleHalf");
	public static SlabBlock slabsAndesiteCobbleFull       = new SlabBlockFull("SlabsAndesiteCobbleFull");
	public static Block     stairAndesiteCobble           = new StairBlock   ("StairAndesiteCobble",    blockAndesiteCobble.getDefaultState());
	public static Block     wallsAndesiteCobble           = new WallBlock    ("WallsAndesiteCobble");
	public static Block     blockAndesiteCobbleMoss       = new BlockBlock   ("BlockAndesiteCobbleMoss", 3, 2);
	public static SlabBlock slabsAndesiteCobbleMossHalf   = new SlabBlockHalf("SlabsAndesiteCobbleMossHalf");
	public static SlabBlock slabsAndesiteCobbleMossFull   = new SlabBlockFull("SlabsAndesiteCobbleMossFull");
	public static Block     stairAndesiteCobbleMoss       = new StairBlock   ("StairAndesiteCobbleMoss",    blockAndesiteCobbleMoss.getDefaultState());
	public static Block     wallsAndesiteCobbleMoss       = new WallBlock    ("WallsAndesiteCobbleMoss");
	// Vanilla:             blockAndesiteSmooth                                BlockAndesiteSmooth
	public static SlabBlock slabsAndesiteSmoothHalf       = new SlabBlockHalf("SlabsAndesiteSmoothHalf");
	public static SlabBlock slabsAndesiteSmoothFull       = new SlabBlockFull("SlabsAndesiteSmoothFull");
	public static Block     stairAndesiteSmooth           = new StairBlock   ("StairAndesiteSmooth",    Blocks.STONE.getStateById(6));
	public static Block     wallsAndesiteSmooth           = new WallBlock    ("WallsAndesiteSmooth");
	public static Block     blockAndesiteBrick            = new BlockBlock   ("BlockAndesiteBrick", 3, 2);
	public static SlabBlock slabsAndesiteBrickHalf        = new SlabBlockHalf("SlabsAndesiteBrickHalf");
	public static SlabBlock slabsAndesiteBrickFull        = new SlabBlockFull("SlabsAndesiteBrickFull");
	public static Block     stairAndesiteBrick            = new StairBlock   ("StairAndesiteBrick",    blockAndesiteBrick.getDefaultState());
	public static Block     wallsAndesiteBrick            = new WallBlock    ("WallsAndesiteBrick");
	public static Block     blockAndesiteBrickMoss        = new BlockBlock   ("BlockAndesiteBrickMoss", 3, 2);
	public static SlabBlock slabsAndesiteBrickMossHalf    = new SlabBlockHalf("SlabsAndesiteBrickMossHalf");
	public static SlabBlock slabsAndesiteBrickMossFull    = new SlabBlockFull("SlabsAndesiteBrickMossFull");
	public static Block     stairAndesiteBrickMoss        = new StairBlock   ("StairAndesiteBrickMoss",    blockAndesiteBrickMoss.getDefaultState());
	public static Block     wallsAndesiteBrickMoss        = new WallBlock    ("WallsAndesiteBrickMoss");
	public static Block     blockAndesiteBrickCracked     = new BlockBlock   ("BlockAndesiteBrickCracked", 3, 2);
	public static SlabBlock slabsAndesiteBrickCrackedHalf = new SlabBlockHalf("SlabsAndesiteBrickCrackedHalf");
	public static SlabBlock slabsAndesiteBrickCrackedFull = new SlabBlockFull("SlabsAndesiteBrickCrackedFull");
	public static Block     stairAndesiteBrickCracked     = new StairBlock   ("StairAndesiteBrickCracked",    blockAndesiteBrickCracked.getDefaultState());
	public static Block     wallsAndesiteBrickCracked     = new WallBlock    ("WallsAndesiteBrickCracked");
	public static Block     blockAndesiteBrickCarved      = new BlockBlock   ("BlockAndesiteBrickCarved", 3, 2);
	
	public static SlabBlock slabsPrismarineStoneHalf = new SlabBlockHalf("SlabsPrismarineStoneHalf");
	public static SlabBlock slabsPrismarineStoneFull = new SlabBlockFull("SlabsPrismarineStoneFull");
	public static Block     stairPrismarineStone     = new StairBlock   ("StairPrismarineStone", Blocks.PRISMARINE.getStateById(1));
	public static Block     wallsPrismarineStone     = new WallBlock    ("WallsPrismarineStone");
	public static SlabBlock slabsPrismarineBrickHalf = new SlabBlockHalf("SlabsPrismarineBrickHalf");
	public static SlabBlock slabsPrismarineBrickFull = new SlabBlockFull("SlabsPrismarineBrickFull");
	public static Block     stairPrismarineBrick     = new StairBlock   ("StairPrismarineBrick", Blocks.PRISMARINE.getStateById(1));
	public static Block     wallsPrismarineBrick     = new WallBlock    ("WallsPrismarineBrick");
	public static SlabBlock slabsPrismarineDarkHalf  = new SlabBlockHalf("SlabsPrismarineDarkHalf");
	public static SlabBlock slabsPrismarineDarkFull  = new SlabBlockFull("SlabsPrismarineDarkFull");
	public static Block     stairPrismarineDark      = new StairBlock   ("StairPrismarineDark",  Blocks.PRISMARINE.getStateById(2));
	public static Block     wallsPrismarineDark      = new WallBlock    ("WallsPrismarineDark");
	
	// Vanilla:             blockEndStone                                 BlockEndStone
	public static SlabBlock slabsEndStoneHalf        = new SlabBlockHalf("SlabsEndStoneHalf");
	public static SlabBlock slabsEndStoneFull        = new SlabBlockFull("SlabsEndStoneFull");
	public static Block     stairEndStone            = new StairBlock   ("StairEndStone",    Blocks.END_STONE.getDefaultState());
	public static Block     wallsEndStone            = new WallBlock    ("WallsEndStone");
	public static Block     blockEndCobble           = new BlockBlock   ("BlockEndCobble", 3, 2);
	public static SlabBlock slabsEndCobbleHalf       = new SlabBlockHalf("SlabsEndCobbleHalf");
	public static SlabBlock slabsEndCobbleFull       = new SlabBlockFull("SlabsEndCobbleFull");
	public static Block     stairEndCobble           = new StairBlock   ("StairEndCobble",    blockEndCobble.getDefaultState());
	public static Block     wallsEndCobble           = new WallBlock    ("WallsEndCobble");
	public static Block     blockEndCobbleMoss       = new BlockBlock   ("BlockEndCobbleMoss", 3, 2);
	public static SlabBlock slabsEndCobbleMossHalf   = new SlabBlockHalf("SlabsEndCobbleMossHalf");
	public static SlabBlock slabsEndCobbleMossFull   = new SlabBlockFull("SlabsEndCobbleMossFull");
	public static Block     stairEndCobbleMoss       = new StairBlock   ("StairEndCobbleMoss",    blockEndCobbleMoss.getDefaultState());
	public static Block     wallsEndCobbleMoss       = new WallBlock    ("WallsEndCobbleMoss");
	public static Block     blockEndSmooth           = new BlockBlock   ("BlockEndSmooth", 3, 2);
	public static SlabBlock slabsEndSmoothHalf       = new SlabBlockHalf("SlabsEndSmoothHalf");
	public static SlabBlock slabsEndSmoothFull       = new SlabBlockFull("SlabsEndSmoothFull");
	public static Block     stairEndSmooth           = new StairBlock   ("StairEndSmooth",    blockEndSmooth.getDefaultState());
	public static Block     wallsEndSmooth           = new WallBlock    ("WallsEndSmooth");
	// Vanilla:             blockEndBrick                                 BlockEndBrick
	public static SlabBlock slabsEndBrickHalf        = new SlabBlockHalf("SlabsEndBrickHalf");
	public static SlabBlock slabsEndBrickFull        = new SlabBlockFull("SlabsEndBrickFull");
	public static Block     stairEndBrick            = new StairBlock   ("StairEndBrick",    Blocks.END_BRICKS.getDefaultState());
	public static Block     wallsEndBrick            = new WallBlock    ("WallsEndBrick");
	public static Block     blockEndBrickMoss        = new BlockBlock   ("BlockEndBrickMoss", 3, 2);
	public static SlabBlock slabsEndBrickMossHalf    = new SlabBlockHalf("SlabsEndBrickMossHalf");
	public static SlabBlock slabsEndBrickMossFull    = new SlabBlockFull("SlabsEndBrickMossFull");
	public static Block     stairEndBrickMoss        = new StairBlock   ("StairEndBrickMoss",    blockEndBrickMoss.getDefaultState());
	public static Block     wallsEndBrickMoss        = new WallBlock    ("WallsEndBrickMoss");
	public static Block     blockEndBrickCracked     = new BlockBlock   ("BlockEndBrickCracked", 3, 2);
	public static SlabBlock slabsEndBrickCrackedHalf = new SlabBlockHalf("SlabsEndBrickCrackedHalf");
	public static SlabBlock slabsEndBrickCrackedFull = new SlabBlockFull("SlabsEndBrickCrackedFull");
	public static Block     stairEndBrickCracked     = new StairBlock   ("StairEndBrickCracked",    blockEndBrickCracked.getDefaultState());
	public static Block     wallsEndBrickCracked     = new WallBlock    ("WallsEndBrickCracked");
	public static Block     blockEndBrickCarved      = new BlockBlock   ("BlockEndBrickCarved", 3, 2);
	
	public static boolean configAllowedSlabs;
	public static boolean configAllowedStairs;
	public static boolean configAllowedWalls;
	public static boolean configExtendedStone;
	public static boolean configExtendedGranite;
	public static boolean configExtendedDiorite;
	public static boolean configExtendedAndesite;
	public static boolean configExtendedEnd;
	
	public static void loadConfig(FMLPreInitializationEvent preEvent){
		Configuration config = new Configuration(preEvent.getSuggestedConfigurationFile());
		config.load();
		configAllowedSlabs  = config.get("Block Types", "Allow Slabs",  true).getBoolean();
		configAllowedStairs = config.get("Block Types", "Allow Stairs", true).getBoolean();
		configAllowedWalls  = config.get("Block Types", "Allow Walls",  true).getBoolean();
		configExtendedStone    = config.get("Stone Variants", "Extend Stone",    true).getBoolean();
		configExtendedGranite  = config.get("Stone Variants", "Extend Granite",  true).getBoolean();
		configExtendedDiorite  = config.get("Stone Variants", "Extend Diorite",  true).getBoolean();
		configExtendedAndesite = config.get("Stone Variants", "Extend Andesite", true).getBoolean();
		configExtendedEnd      = config.get("Stone Variants", "Extend End",      true).getBoolean();
		System.out.println("Config loaded");
		config.save();
	}
	
	public static void registerBlocks(boolean pre){
			// Vanilla: blockStoneStone
			// Vanilla: slabsStoneStoneHalf
			// Vanilla: slabsStoneStoneFull
		if(configAllowedStairs                       ) registerBlock(stairStoneStone,        pre);
		if(configAllowedWalls                        ) registerBlock(wallsStoneStone,        pre);
			// Vanilla: blockStoneCobbleMoss
		if(configAllowedSlabs                        ) registerBlockWithItem(slabsStoneCobbleMossHalf, slabsStoneCobbleMossHalf, slabsStoneCobbleMossFull, false, pre);
		if(configAllowedSlabs                        ) registerBlockWithItem(slabsStoneCobbleMossFull, slabsStoneCobbleMossHalf, slabsStoneCobbleMossFull,  true, pre);
		if(configAllowedStairs                       ) registerBlock(stairStoneCobbleMoss,   pre);
			// Vanilla: wallsStoneCobbleMoss
		if(                       configExtendedStone) registerBlock(blockStoneSmooth,       pre);
		if(configAllowedSlabs  && configExtendedStone) registerBlockWithItem(slabsStoneSmoothHalf, slabsStoneSmoothHalf, slabsStoneSmoothFull, false, pre);
		if(configAllowedSlabs  && configExtendedStone) registerBlockWithItem(slabsStoneSmoothFull, slabsStoneSmoothHalf, slabsStoneSmoothFull,  true, pre);
		if(configAllowedStairs && configExtendedStone) registerBlock(stairStoneSmooth,       pre);
		if(configAllowedWalls  && configExtendedStone) registerBlock(wallsStoneSmooth,       pre);
			//
			//
			//
			//
		if(configAllowedWalls                        ) registerBlock(wallsStoneBrick,        pre);
			// Vanilla:             blockStoneBrickMoss
		if(configAllowedSlabs                        ) registerBlockWithItem(slabsStoneBrickMossHalf, slabsStoneBrickMossHalf, slabsStoneBrickMossFull, false, pre);
		if(configAllowedSlabs                        ) registerBlockWithItem(slabsStoneBrickMossFull, slabsStoneBrickMossHalf, slabsStoneBrickMossFull,  true, pre);
		if(configAllowedStairs                       ) registerBlock(stairStoneBrickMoss,    pre);
		if(configAllowedWalls                        ) registerBlock(wallsStoneBrickMoss,    pre);
			// Vanilla:             blockStoneBrickCracked
		if(configAllowedSlabs                        ) registerBlockWithItem(slabsStoneBrickCrackedHalf, slabsStoneBrickCrackedHalf, slabsStoneBrickCrackedFull, false, pre);
		if(configAllowedSlabs                        ) registerBlockWithItem(slabsStoneBrickCrackedFull, slabsStoneBrickCrackedHalf, slabsStoneBrickCrackedFull,  true, pre);
		if(configAllowedStairs                       ) registerBlock(stairStoneBrickCracked, pre);
		if(configAllowedWalls                        ) registerBlock(wallsStoneBrickCracked, pre);
		
			// Vanilla:             blockGraniteStone
		if(configAllowedSlabs                          ) registerBlockWithItem(slabsGraniteStoneHalf, slabsGraniteStoneHalf, slabsGraniteStoneFull, false, pre);
		if(configAllowedSlabs                          ) registerBlockWithItem(slabsGraniteStoneFull, slabsGraniteStoneHalf, slabsGraniteStoneFull,  true, pre);
		if(configAllowedStairs                         ) registerBlock(stairGraniteStone,        pre);
		if(configAllowedWalls                          ) registerBlock(wallsGraniteStone,        pre);
		if(                       configExtendedGranite) registerBlock(blockGraniteCobble,       pre);
		if(configAllowedSlabs  && configExtendedGranite) registerBlockWithItem(slabsGraniteCobbleHalf, slabsGraniteCobbleHalf, slabsGraniteCobbleFull, false, pre);
		if(configAllowedSlabs  && configExtendedGranite) registerBlockWithItem(slabsGraniteCobbleFull, slabsGraniteCobbleHalf, slabsGraniteCobbleFull,  true, pre);
		if(configAllowedStairs && configExtendedGranite) registerBlock(stairGraniteCobble,       pre);
		if(configAllowedWalls  && configExtendedGranite) registerBlock(wallsGraniteCobble,       pre);
		if(                       configExtendedGranite) registerBlock(blockGraniteCobbleMoss,   pre);
		if(configAllowedSlabs  && configExtendedGranite) registerBlockWithItem(slabsGraniteCobbleMossHalf, slabsGraniteCobbleMossHalf, slabsGraniteCobbleMossFull, false, pre);
		if(configAllowedSlabs  && configExtendedGranite) registerBlockWithItem(slabsGraniteCobbleMossFull, slabsGraniteCobbleMossHalf, slabsGraniteCobbleMossFull,  true, pre);
		if(configAllowedStairs && configExtendedGranite) registerBlock(stairGraniteCobbleMoss,   pre);
		if(configAllowedWalls  && configExtendedGranite) registerBlock(wallsGraniteCobbleMoss,   pre);
			// Vanilla:             blockGraniteSmooth
		if(configAllowedSlabs                          ) registerBlockWithItem(slabsGraniteSmoothHalf, slabsGraniteSmoothHalf, slabsGraniteSmoothFull, false, pre);
		if(configAllowedSlabs                          ) registerBlockWithItem(slabsGraniteSmoothFull, slabsGraniteSmoothHalf, slabsGraniteSmoothFull,  true, pre);
		if(configAllowedStairs                         ) registerBlock(stairGraniteSmooth,       pre);
		if(configAllowedWalls                          ) registerBlock(wallsGraniteSmooth,       pre);
		if(                       configExtendedGranite) registerBlock(blockGraniteBrick,        pre);
		if(configAllowedSlabs  && configExtendedGranite) registerBlockWithItem(slabsGraniteBrickHalf, slabsGraniteBrickHalf, slabsGraniteBrickFull, false, pre);
		if(configAllowedSlabs  && configExtendedGranite) registerBlockWithItem(slabsGraniteBrickFull, slabsGraniteBrickHalf, slabsGraniteBrickFull,  true, pre);
		if(configAllowedStairs && configExtendedGranite) registerBlock(stairGraniteBrick,        pre);
		if(configAllowedWalls  && configExtendedGranite) registerBlock(wallsGraniteBrick,        pre);
		if(                       configExtendedGranite) registerBlock(blockGraniteBrickMoss,    pre);
		if(configAllowedSlabs  && configExtendedGranite) registerBlockWithItem(slabsGraniteBrickMossHalf, slabsGraniteBrickMossHalf, slabsGraniteBrickMossFull, false, pre);
		if(configAllowedSlabs  && configExtendedGranite) registerBlockWithItem(slabsGraniteBrickMossFull, slabsGraniteBrickMossHalf, slabsGraniteBrickMossFull,  true, pre);
		if(configAllowedStairs && configExtendedGranite) registerBlock(stairGraniteBrickMoss,    pre);
		if(configAllowedWalls  && configExtendedGranite) registerBlock(wallsGraniteBrickMoss,    pre);
		if(                       configExtendedGranite) registerBlock(blockGraniteBrickCracked, pre);
		if(configAllowedSlabs  && configExtendedGranite) registerBlockWithItem(slabsGraniteBrickCrackedHalf, slabsGraniteBrickCrackedHalf, slabsGraniteBrickCrackedFull, false, pre);
		if(configAllowedSlabs  && configExtendedGranite) registerBlockWithItem(slabsGraniteBrickCrackedFull, slabsGraniteBrickCrackedHalf, slabsGraniteBrickCrackedFull,  true, pre);
		if(configAllowedStairs && configExtendedGranite) registerBlock(stairGraniteBrickCracked, pre);
		if(configAllowedWalls  && configExtendedGranite) registerBlock(wallsGraniteBrickCracked, pre);
		if(                       configExtendedGranite) registerBlock(blockGraniteBrickCarved,  pre);
		
			// Vanilla:             blockDioriteStone
		if(configAllowedSlabs                          ) registerBlockWithItem(slabsDioriteStoneHalf, slabsDioriteStoneHalf, slabsDioriteStoneFull, false, pre);
		if(configAllowedSlabs                          ) registerBlockWithItem(slabsDioriteStoneFull, slabsDioriteStoneHalf, slabsDioriteStoneFull,  true, pre);
		if(configAllowedStairs                         ) registerBlock(stairDioriteStone,        pre);
		if(configAllowedWalls                          ) registerBlock(wallsDioriteStone,        pre);
		if(                       configExtendedDiorite) registerBlock(blockDioriteCobble,       pre);
		if(configAllowedSlabs  && configExtendedDiorite) registerBlockWithItem(slabsDioriteCobbleHalf, slabsDioriteCobbleHalf, slabsDioriteCobbleFull, false, pre);
		if(configAllowedSlabs  && configExtendedDiorite) registerBlockWithItem(slabsDioriteCobbleFull, slabsDioriteCobbleHalf, slabsDioriteCobbleFull,  true, pre);
		if(configAllowedStairs && configExtendedDiorite) registerBlock(stairDioriteCobble,       pre);
		if(configAllowedWalls  && configExtendedDiorite) registerBlock(wallsDioriteCobble,       pre);
		if(                       configExtendedDiorite) registerBlock(blockDioriteCobbleMoss,   pre);
		if(configAllowedSlabs  && configExtendedDiorite) registerBlockWithItem(slabsDioriteCobbleMossHalf, slabsDioriteCobbleMossHalf, slabsDioriteCobbleMossFull, false, pre);
		if(configAllowedSlabs  && configExtendedDiorite) registerBlockWithItem(slabsDioriteCobbleMossFull, slabsDioriteCobbleMossHalf, slabsDioriteCobbleMossFull,  true, pre);
		if(configAllowedStairs && configExtendedDiorite) registerBlock(stairDioriteCobbleMoss,   pre);
		if(configAllowedWalls  && configExtendedDiorite) registerBlock(wallsDioriteCobbleMoss,   pre);
			// Vanilla:             blockDioriteSmooth
		if(configAllowedSlabs                          ) registerBlockWithItem(slabsDioriteSmoothHalf, slabsDioriteSmoothHalf, slabsDioriteSmoothFull, false, pre);
		if(configAllowedSlabs                          ) registerBlockWithItem(slabsDioriteSmoothFull, slabsDioriteSmoothHalf, slabsDioriteSmoothFull,  true, pre);
		if(configAllowedStairs                         ) registerBlock(stairDioriteSmooth,       pre);
		if(configAllowedWalls                          ) registerBlock(wallsDioriteSmooth,       pre);
		if(                       configExtendedDiorite) registerBlock(blockDioriteBrick,        pre);
		if(configAllowedSlabs  && configExtendedDiorite) registerBlockWithItem(slabsDioriteBrickHalf, slabsDioriteBrickHalf, slabsDioriteBrickFull, false, pre);
		if(configAllowedSlabs  && configExtendedDiorite) registerBlockWithItem(slabsDioriteBrickFull, slabsDioriteBrickHalf, slabsDioriteBrickFull,  true, pre);
		if(configAllowedStairs && configExtendedDiorite) registerBlock(stairDioriteBrick,        pre);
		if(configAllowedWalls  && configExtendedDiorite) registerBlock(wallsDioriteBrick,        pre);
		if(                       configExtendedDiorite) registerBlock(blockDioriteBrickMoss,    pre);
		if(configAllowedSlabs  && configExtendedDiorite) registerBlockWithItem(slabsDioriteBrickMossHalf, slabsDioriteBrickMossHalf, slabsDioriteBrickMossFull, false, pre);
		if(configAllowedSlabs  && configExtendedDiorite) registerBlockWithItem(slabsDioriteBrickMossFull, slabsDioriteBrickMossHalf, slabsDioriteBrickMossFull,  true, pre);
		if(configAllowedStairs && configExtendedDiorite) registerBlock(stairDioriteBrickMoss,    pre);
		if(configAllowedWalls  && configExtendedDiorite) registerBlock(wallsDioriteBrickMoss,    pre);
		if(                       configExtendedDiorite) registerBlock(blockDioriteBrickCracked, pre);
		if(configAllowedSlabs  && configExtendedDiorite) registerBlockWithItem(slabsDioriteBrickCrackedHalf, slabsDioriteBrickCrackedHalf, slabsDioriteBrickCrackedFull, false, pre);
		if(configAllowedSlabs  && configExtendedDiorite) registerBlockWithItem(slabsDioriteBrickCrackedFull, slabsDioriteBrickCrackedHalf, slabsDioriteBrickCrackedFull,  true, pre);
		if(configAllowedStairs && configExtendedDiorite) registerBlock(stairDioriteBrickCracked, pre);
		if(configAllowedWalls  && configExtendedDiorite) registerBlock(wallsDioriteBrickCracked, pre);
		if(                       configExtendedDiorite) registerBlock(blockDioriteBrickCarved,  pre);
		
			// Vanilla:             blockAndesiteStone
		if(configAllowedSlabs                           ) registerBlockWithItem(slabsAndesiteStoneHalf, slabsAndesiteStoneHalf, slabsAndesiteStoneFull, false, pre);
		if(configAllowedSlabs                           ) registerBlockWithItem(slabsAndesiteStoneFull, slabsAndesiteStoneHalf, slabsAndesiteStoneFull,  true, pre);
		if(configAllowedStairs                          ) registerBlock(stairAndesiteStone,        pre);
		if(configAllowedWalls                           ) registerBlock(wallsAndesiteStone,        pre);
		if(                       configExtendedAndesite) registerBlock(blockAndesiteCobble,       pre);
		if(configAllowedSlabs  && configExtendedAndesite) registerBlockWithItem(slabsAndesiteCobbleHalf, slabsAndesiteCobbleHalf, slabsAndesiteCobbleFull, false, pre);
		if(configAllowedSlabs  && configExtendedAndesite) registerBlockWithItem(slabsAndesiteCobbleFull, slabsAndesiteCobbleHalf, slabsAndesiteCobbleFull,  true, pre);
		if(configAllowedStairs && configExtendedAndesite) registerBlock(stairAndesiteCobble,       pre);
		if(configAllowedWalls  && configExtendedAndesite) registerBlock(wallsAndesiteCobble,       pre);
		if(                       configExtendedAndesite) registerBlock(blockAndesiteCobbleMoss,   pre);
		if(configAllowedSlabs  && configExtendedAndesite) registerBlockWithItem(slabsAndesiteCobbleMossHalf, slabsAndesiteCobbleMossHalf, slabsAndesiteCobbleMossFull, false, pre);
		if(configAllowedSlabs  && configExtendedAndesite) registerBlockWithItem(slabsAndesiteCobbleMossFull, slabsAndesiteCobbleMossHalf, slabsAndesiteCobbleMossFull,  true, pre);
		if(configAllowedStairs && configExtendedAndesite) registerBlock(stairAndesiteCobbleMoss,   pre);
		if(configAllowedWalls  && configExtendedAndesite) registerBlock(wallsAndesiteCobbleMoss,   pre);
			// Vanilla:             blockAndesiteSmooth
		if(configAllowedSlabs                           ) registerBlockWithItem(slabsAndesiteSmoothHalf, slabsAndesiteSmoothHalf, slabsAndesiteSmoothFull, false, pre);
		if(configAllowedSlabs                           ) registerBlockWithItem(slabsAndesiteSmoothFull, slabsAndesiteSmoothHalf, slabsAndesiteSmoothFull,  true, pre);
		if(configAllowedStairs                          ) registerBlock(stairAndesiteSmooth,       pre);
		if(configAllowedWalls                           ) registerBlock(wallsAndesiteSmooth,       pre);
		if(                       configExtendedAndesite) registerBlock(blockAndesiteBrick,        pre);
		if(configAllowedSlabs  && configExtendedAndesite) registerBlockWithItem(slabsAndesiteBrickHalf, slabsAndesiteBrickHalf, slabsAndesiteBrickFull, false, pre);
		if(configAllowedSlabs  && configExtendedAndesite) registerBlockWithItem(slabsAndesiteBrickFull, slabsAndesiteBrickHalf, slabsAndesiteBrickFull,  true, pre);
		if(configAllowedStairs && configExtendedAndesite) registerBlock(stairAndesiteBrick,        pre);
		if(configAllowedWalls  && configExtendedAndesite) registerBlock(wallsAndesiteBrick,        pre);
		if(                       configExtendedAndesite) registerBlock(blockAndesiteBrickMoss,    pre);
		if(configAllowedSlabs  && configExtendedAndesite) registerBlockWithItem(slabsAndesiteBrickMossHalf, slabsAndesiteBrickMossHalf, slabsAndesiteBrickMossFull, false, pre);
		if(configAllowedSlabs  && configExtendedAndesite) registerBlockWithItem(slabsAndesiteBrickMossFull, slabsAndesiteBrickMossHalf, slabsAndesiteBrickMossFull,  true, pre);
		if(configAllowedStairs && configExtendedAndesite) registerBlock(stairAndesiteBrickMoss,    pre);
		if(configAllowedWalls  && configExtendedAndesite) registerBlock(wallsAndesiteBrickMoss,    pre);
		if(                       configExtendedAndesite) registerBlock(blockAndesiteBrickCracked, pre);
		if(configAllowedSlabs  && configExtendedAndesite) registerBlockWithItem(slabsAndesiteBrickCrackedHalf, slabsAndesiteBrickCrackedHalf, slabsAndesiteBrickCrackedFull, false, pre);
		if(configAllowedSlabs  && configExtendedAndesite) registerBlockWithItem(slabsAndesiteBrickCrackedFull, slabsAndesiteBrickCrackedHalf, slabsAndesiteBrickCrackedFull,  true, pre);
		if(configAllowedStairs && configExtendedAndesite) registerBlock(stairAndesiteBrickCracked, pre);
		if(configAllowedWalls  && configExtendedAndesite) registerBlock(wallsAndesiteBrickCracked, pre);
		if(                       configExtendedAndesite) registerBlock(blockAndesiteBrickCarved,  pre);
		
		if(configAllowedSlabs)  registerBlockWithItem(slabsPrismarineStoneHalf, slabsPrismarineStoneHalf, slabsPrismarineStoneFull, false, pre);
		if(configAllowedSlabs)  registerBlockWithItem(slabsPrismarineStoneFull, slabsPrismarineStoneHalf, slabsPrismarineStoneFull,  true,  pre);
		if(configAllowedStairs) registerBlock(stairPrismarineStone, pre);
		if(configAllowedWalls)  registerBlock(wallsPrismarineStone, pre);
		if(configAllowedSlabs)  registerBlockWithItem(slabsPrismarineBrickHalf, slabsPrismarineBrickHalf, slabsPrismarineBrickFull, false, pre);
		if(configAllowedSlabs)  registerBlockWithItem(slabsPrismarineBrickFull, slabsPrismarineBrickHalf, slabsPrismarineBrickFull,  true, pre);
		if(configAllowedStairs) registerBlock(stairPrismarineBrick, pre);
		if(configAllowedWalls)  registerBlock(wallsPrismarineBrick, pre);
		if(configAllowedSlabs)  registerBlockWithItem(slabsPrismarineDarkHalf, slabsPrismarineDarkHalf, slabsPrismarineDarkFull, false, pre);
		if(configAllowedSlabs)  registerBlockWithItem(slabsPrismarineDarkFull, slabsPrismarineDarkHalf, slabsPrismarineDarkFull,  true, pre);
		if(configAllowedStairs) registerBlock(stairPrismarineDark,  pre);
		if(configAllowedWalls)  registerBlock(wallsPrismarineDark,  pre);
		
			// Vanilla:             blockEndStone
		if(configAllowedSlabs                      ) registerBlockWithItem(slabsEndStoneHalf, slabsEndStoneHalf, slabsEndStoneFull, false, pre);
		if(configAllowedSlabs                      ) registerBlockWithItem(slabsEndStoneFull, slabsEndStoneHalf, slabsEndStoneFull,  true, pre);
		if(configAllowedStairs                     ) registerBlock(stairEndStone,        pre);
		if(configAllowedWalls                      ) registerBlock(wallsEndStone,        pre);
		if(                       configExtendedEnd) registerBlock(blockEndCobble,       pre);
		if(configAllowedSlabs  && configExtendedEnd) registerBlockWithItem(slabsEndCobbleHalf, slabsEndCobbleHalf, slabsEndCobbleFull, false, pre);
		if(configAllowedSlabs  && configExtendedEnd) registerBlockWithItem(slabsEndCobbleFull, slabsEndCobbleHalf, slabsEndCobbleFull,  true, pre);
		if(configAllowedStairs && configExtendedEnd) registerBlock(stairEndCobble,       pre);
		if(configAllowedWalls  && configExtendedEnd) registerBlock(wallsEndCobble,       pre);
		if(                       configExtendedEnd) registerBlock(blockEndCobbleMoss,   pre);
		if(configAllowedSlabs  && configExtendedEnd) registerBlockWithItem(slabsEndCobbleMossHalf, slabsEndCobbleMossHalf, slabsEndCobbleMossFull, false, pre);
		if(configAllowedSlabs  && configExtendedEnd) registerBlockWithItem(slabsEndCobbleMossFull, slabsEndCobbleMossHalf, slabsEndCobbleMossFull,  true, pre);
		if(configAllowedStairs && configExtendedEnd) registerBlock(stairEndCobbleMoss,   pre);
		if(configAllowedWalls  && configExtendedEnd) registerBlock(wallsEndCobbleMoss,   pre);
		if(                       configExtendedEnd) registerBlock(blockEndSmooth,       pre);
		if(configAllowedSlabs  && configExtendedEnd) registerBlockWithItem(slabsEndSmoothHalf, slabsEndSmoothHalf, slabsEndSmoothFull, false, pre);
		if(configAllowedSlabs  && configExtendedEnd) registerBlockWithItem(slabsEndSmoothFull, slabsEndSmoothHalf, slabsEndSmoothFull,  true, pre);
		if(configAllowedStairs && configExtendedEnd) registerBlock(stairEndSmooth,       pre);
		if(configAllowedWalls  && configExtendedEnd) registerBlock(wallsEndSmooth,       pre);
			// Vanilla:             blockEndBrick            ,    pre);
		if(configAllowedSlabs                      ) registerBlockWithItem(slabsEndBrickHalf, slabsEndBrickHalf, slabsEndBrickFull, false, pre);
		if(configAllowedSlabs                      ) registerBlockWithItem(slabsEndBrickFull, slabsEndBrickHalf, slabsEndBrickFull,  true, pre);
		if(configAllowedStairs                     ) registerBlock(stairEndBrick,        pre);
		if(configAllowedWalls                      ) registerBlock(wallsEndBrick,        pre);
		if(                       configExtendedEnd) registerBlock(blockEndBrickMoss,    pre);
		if(configAllowedSlabs  && configExtendedEnd) registerBlockWithItem(slabsEndBrickMossHalf, slabsEndBrickMossHalf, slabsEndBrickMossFull, false, pre);
		if(configAllowedSlabs  && configExtendedEnd) registerBlockWithItem(slabsEndBrickMossFull, slabsEndBrickMossHalf, slabsEndBrickMossFull,  true, pre);
		if(configAllowedStairs && configExtendedEnd) registerBlock(stairEndBrickMoss,    pre);
		if(configAllowedWalls  && configExtendedEnd) registerBlock(wallsEndBrickMoss,    pre);
		if(                       configExtendedEnd) registerBlock(blockEndBrickCracked, pre);
		if(configAllowedSlabs  && configExtendedEnd) registerBlockWithItem(slabsEndBrickCrackedHalf, slabsEndBrickCrackedHalf, slabsEndBrickCrackedFull, false, pre);
		if(configAllowedSlabs  && configExtendedEnd) registerBlockWithItem(slabsEndBrickCrackedFull, slabsEndBrickCrackedHalf, slabsEndBrickCrackedFull,  true, pre);
		if(configAllowedStairs && configExtendedEnd) registerBlock(stairEndBrickCracked, pre);
		if(configAllowedWalls  && configExtendedEnd) registerBlock(wallsEndBrickCracked, pre);
		if(                       configExtendedEnd) registerBlock(blockEndBrickCarved,  pre);
		
	}
	
	private static void registerBlock(Block block, boolean pre){
		if(pre){
			GameRegistry.register(block);
			GameRegistry.register(new ItemBlock(block).setUnlocalizedName(block.getUnlocalizedName().substring(5)).setRegistryName(block.getRegistryName()));
		}else{
			Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block), 0, new ModelResourceLocation(StairwayToAether.modid + ":" + block.getUnlocalizedName().substring(5), "inventory"));
		}
	}
	
	private static void registerBlockWithItem(Block block, SlabBlock blockHalf, SlabBlock BlockFull, boolean stacked, boolean pre){
		if(pre){
			GameRegistry.register(block);
			GameRegistry.register(new ItemSlabBlock(block, blockHalf, BlockFull, stacked).setUnlocalizedName(block.getUnlocalizedName().substring(5)).setRegistryName(block.getRegistryName()));
		}else{
			Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block), 0, new ModelResourceLocation(StairwayToAether.modid + ":" + block.getUnlocalizedName().substring(5), "inventory"));
		}
	}
	
	private static void registerItem(Item item, boolean pre){
		if(pre){
			GameRegistry.register(item);
		}else{
			Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(StairwayToAether.modid + ":" + item.getUnlocalizedName().substring(5), "inventory"));
		}
	}
	
	public static void removeRecipes(){
		if(configAllowedStairs) StairRemover.removeCrafting(Item.getItemFromBlock(Blocks.STONE_BRICK_STAIRS));
		if(configAllowedStairs) StairRemover.removeCrafting(Item.getItemFromBlock(Blocks.STONE_STAIRS));
		if(configExtendedStone) StairRemover.removeCrafting(Item.getItemFromBlock(Blocks.STONEBRICK));
		if(configExtendedStone) StairRemover.removeFurnace(new ItemStack(Blocks.STONE));
	}
	
	public static void registerRecipes(){
		
		if(                       configExtendedStone) GameRegistry.addRecipe(new ItemStack(Blocks.STONE,      4, 0), new Object[]{"##", "##", '#', new ItemStack(Blocks.COBBLESTONE,       1, 0)});
		if(                       configExtendedStone) GameRegistry.addRecipe(new ItemStack(Blocks.STONE,      4, 0), new Object[]{"##", "##", '#', new ItemStack(Blocks.MOSSY_COBBLESTONE, 1, 0)});
		if(                       configExtendedStone) GameRegistry.addRecipe(new ItemStack(Blocks.STONEBRICK, 4, 0), new Object[]{"##", "##", '#', new ItemStack(blockStoneSmooth,         1, 0)});
		if(                       configExtendedStone) GameRegistry.addRecipe(new ItemStack(Blocks.STONEBRICK, 1, 3), new Object[]{"#",  "#",  '#', new ItemStack(Blocks.STONE_SLAB,        1, 5)});
		if(                       configExtendedStone) GameRegistry.addRecipe(new ItemStack(Blocks.STONEBRICK, 3, 0), new Object[]{"##", "##", '#', new ItemStack(Blocks.STONEBRICK,        1, 2)});
		if(                       configExtendedStone) GameRegistry.addShapelessRecipe(new ItemStack(Blocks.MOSSY_COBBLESTONE, 1, 0), new Object[]{new ItemStack(Blocks.COBBLESTONE, 1, 0), Blocks.VINE});
		if(                       configExtendedStone) GameRegistry.addShapelessRecipe(new ItemStack(Blocks.STONEBRICK,        1, 1), new Object[]{new ItemStack(Blocks.STONEBRICK,  1, 0), Blocks.VINE});
		if(                       configExtendedStone) GameRegistry.addSmelting(new ItemStack(Blocks.STONE,      1, 0), new ItemStack(blockStoneSmooth,  1, 0), 5);
		if(                       configExtendedStone) GameRegistry.addSmelting(new ItemStack(Blocks.STONEBRICK, 1, 0), new ItemStack(Blocks.STONEBRICK, 1, 2), 5);
		if(                       configExtendedStone) GameRegistry.addSmelting(new ItemStack(Blocks.STONEBRICK, 1, 1), new ItemStack(Blocks.STONEBRICK, 1, 2), 1);
		if(configAllowedStairs                       ) GameRegistry.addRecipe(new ItemStack(stairStoneStone,            4, 0), new Object[]{"  #", " ##", "###", '#', new ItemStack(Blocks.STONE,             1, 0)});
		if(configAllowedStairs                       ) GameRegistry.addRecipe(new ItemStack(Blocks.STONE_STAIRS,        4, 0), new Object[]{"  #", " ##", "###", '#', new ItemStack(Blocks.COBBLESTONE,       1, 0)});
		if(configAllowedStairs                       ) GameRegistry.addRecipe(new ItemStack(stairStoneCobbleMoss,       4, 0), new Object[]{"  #", " ##", "###", '#', new ItemStack(Blocks.MOSSY_COBBLESTONE, 1, 0)});
		if(configAllowedStairs && configExtendedStone) GameRegistry.addRecipe(new ItemStack(stairStoneSmooth,           4, 0), new Object[]{"  #", " ##", "###", '#', new ItemStack(blockStoneSmooth,         1, 0)});
		if(configAllowedStairs                       ) GameRegistry.addRecipe(new ItemStack(Blocks.STONE_BRICK_STAIRS,  4, 0), new Object[]{"  #", " ##", "###", '#', new ItemStack(Blocks.STONEBRICK,        1, 0)});
		if(configAllowedStairs                       ) GameRegistry.addRecipe(new ItemStack(stairStoneBrickMoss,        4, 0), new Object[]{"  #", " ##", "###", '#', new ItemStack(Blocks.STONEBRICK,        1, 1)});
		if(configAllowedStairs                       ) GameRegistry.addRecipe(new ItemStack(stairStoneBrickCracked,     4, 0), new Object[]{"  #", " ##", "###", '#', new ItemStack(Blocks.STONEBRICK,        1, 2)});
		if(configAllowedSlabs                        ) GameRegistry.addRecipe(new ItemStack(Blocks.STONE_SLAB,          6, 0), new Object[]{"###",               '#', new ItemStack(Blocks.STONE,             1, 0)});
		if(configAllowedSlabs                        ) GameRegistry.addRecipe(new ItemStack(Blocks.STONE_SLAB,          6, 3), new Object[]{"###",               '#', new ItemStack(Blocks.COBBLESTONE,       1, 0)});
		if(configAllowedSlabs                        ) GameRegistry.addRecipe(new ItemStack(slabsStoneCobbleMossHalf,   6, 0), new Object[]{"###",               '#', new ItemStack(Blocks.MOSSY_COBBLESTONE, 1, 0)});
		if(configAllowedSlabs  && configExtendedStone) GameRegistry.addRecipe(new ItemStack(slabsStoneSmoothHalf,       6, 0), new Object[]{"###",               '#', new ItemStack(blockStoneSmooth,         1, 0)});
		if(configAllowedSlabs                        ) GameRegistry.addRecipe(new ItemStack(Blocks.STONE_SLAB,          6, 5), new Object[]{"###",               '#', new ItemStack(Blocks.STONEBRICK,        1, 0)});
		if(configAllowedSlabs                        ) GameRegistry.addRecipe(new ItemStack(slabsStoneBrickMossHalf,    6, 0), new Object[]{"###",               '#', new ItemStack(Blocks.STONEBRICK,        1, 1)});
		if(configAllowedSlabs                        ) GameRegistry.addRecipe(new ItemStack(slabsStoneBrickCrackedHalf, 6, 0), new Object[]{"###",               '#', new ItemStack(Blocks.STONEBRICK,        1, 2)});
		if(configAllowedWalls                        ) GameRegistry.addRecipe(new ItemStack(wallsStoneStone,            6, 0), new Object[]{"###", "###",        '#', new ItemStack(Blocks.STONE,             1, 0)});
		if(configAllowedWalls                        ) GameRegistry.addRecipe(new ItemStack(Blocks.COBBLESTONE_WALL,    6, 0), new Object[]{"###", "###",        '#', new ItemStack(Blocks.COBBLESTONE,       1, 0)});
		if(configAllowedWalls                        ) GameRegistry.addRecipe(new ItemStack(Blocks.COBBLESTONE_WALL,    6, 1), new Object[]{"###", "###",        '#', new ItemStack(Blocks.MOSSY_COBBLESTONE, 1, 0)});
		if(configAllowedWalls  && configExtendedStone) GameRegistry.addRecipe(new ItemStack(wallsStoneSmooth,           6, 0), new Object[]{"###", "###",        '#', new ItemStack(blockStoneSmooth,         1, 0)});
		if(configAllowedWalls                        ) GameRegistry.addRecipe(new ItemStack(wallsStoneBrick,            6, 0), new Object[]{"###", "###",        '#', new ItemStack(Blocks.STONEBRICK,        1, 0)});
		if(configAllowedWalls                        ) GameRegistry.addRecipe(new ItemStack(wallsStoneBrickMoss,        6, 0), new Object[]{"###", "###",        '#', new ItemStack(Blocks.STONEBRICK,        1, 1)});
		if(configAllowedWalls                        ) GameRegistry.addRecipe(new ItemStack(wallsStoneBrickCracked,     6, 0), new Object[]{"###", "###",        '#', new ItemStack(Blocks.STONEBRICK,        1, 2)});
		
		if(                       configExtendedGranite) GameRegistry.addRecipe(new ItemStack(Blocks.STONE,            4, 1), new Object[]{"##", "##", '#', new ItemStack(blockGraniteCobble,       1, 0)});
		if(                       configExtendedGranite) GameRegistry.addRecipe(new ItemStack(Blocks.STONE,            4, 1), new Object[]{"##", "##", '#', new ItemStack(blockGraniteCobbleMoss,   1, 0)});
		if(                       configExtendedGranite) GameRegistry.addRecipe(new ItemStack(blockGraniteBrick,       4, 0), new Object[]{"##", "##", '#', new ItemStack(Blocks.STONE,             1, 2)});
		if(                       configExtendedGranite) GameRegistry.addRecipe(new ItemStack(blockGraniteBrick,       3, 0), new Object[]{"##", "##", '#', new ItemStack(blockGraniteBrickCracked, 1, 2)});
		if(                       configExtendedGranite) GameRegistry.addRecipe(new ItemStack(blockGraniteBrickCarved, 1, 0), new Object[]{"#",  "#",  '#', new ItemStack(slabsGraniteBrickHalf,    1, 0)});
		if(                       configExtendedGranite) GameRegistry.addShapelessRecipe(new ItemStack(blockGraniteCobbleMoss, 1, 0), new Object[]{new ItemStack(blockGraniteCobble, 1, 0), Blocks.VINE});
		if(                       configExtendedGranite) GameRegistry.addShapelessRecipe(new ItemStack(blockGraniteBrickMoss,  1, 0), new Object[]{new ItemStack(blockGraniteBrick,  1, 0), Blocks.VINE});
		if(                       configExtendedGranite) GameRegistry.addSmelting(new ItemStack(Blocks.STONE,          1, 1), new ItemStack(Blocks.STONE,             1, 2), 5);
		if(                       configExtendedGranite) GameRegistry.addSmelting(new ItemStack(blockGraniteBrick,     1, 0), new ItemStack(blockGraniteBrickCracked, 1, 0), 5);
		if(                       configExtendedGranite) GameRegistry.addSmelting(new ItemStack(blockGraniteBrickMoss, 1, 0), new ItemStack(blockGraniteBrickCracked, 1, 0), 5);
		if(configAllowedStairs                         ) GameRegistry.addRecipe(new ItemStack(stairGraniteStone,            4, 0), new Object[]{"  #", " ##", "###", '#', new ItemStack(Blocks.STONE,             1, 1)});
		if(configAllowedStairs && configExtendedGranite) GameRegistry.addRecipe(new ItemStack(stairGraniteCobble,           4, 0), new Object[]{"  #", " ##", "###", '#', new ItemStack(blockGraniteCobble,       1, 0)});
		if(configAllowedStairs && configExtendedGranite) GameRegistry.addRecipe(new ItemStack(stairGraniteCobbleMoss,       4, 0), new Object[]{"  #", " ##", "###", '#', new ItemStack(blockGraniteCobbleMoss,   1, 0)});
		if(configAllowedStairs                         ) GameRegistry.addRecipe(new ItemStack(stairGraniteSmooth,           4, 0), new Object[]{"  #", " ##", "###", '#', new ItemStack(Blocks.STONE,             1, 2)});
		if(configAllowedStairs && configExtendedGranite) GameRegistry.addRecipe(new ItemStack(stairGraniteBrick,            4, 0), new Object[]{"  #", " ##", "###", '#', new ItemStack(blockGraniteBrick,        1, 0)});
		if(configAllowedStairs && configExtendedGranite) GameRegistry.addRecipe(new ItemStack(stairGraniteBrickMoss,        4, 0), new Object[]{"  #", " ##", "###", '#', new ItemStack(blockGraniteBrickMoss,    1, 0)});
		if(configAllowedStairs && configExtendedGranite) GameRegistry.addRecipe(new ItemStack(stairGraniteBrickCracked,     4, 0), new Object[]{"  #", " ##", "###", '#', new ItemStack(blockGraniteBrickCracked, 1, 0)});
		if(configAllowedSlabs                          ) GameRegistry.addRecipe(new ItemStack(slabsGraniteStoneHalf,        6, 0), new Object[]{"###",               '#', new ItemStack(Blocks.STONE,             1, 1)});
		if(configAllowedSlabs  && configExtendedGranite) GameRegistry.addRecipe(new ItemStack(slabsGraniteCobbleHalf,       6, 0), new Object[]{"###",               '#', new ItemStack(blockGraniteCobble,       1, 0)});
		if(configAllowedSlabs  && configExtendedGranite) GameRegistry.addRecipe(new ItemStack(slabsGraniteCobbleMossHalf,   6, 0), new Object[]{"###",               '#', new ItemStack(blockGraniteCobbleMoss,   1, 0)});
		if(configAllowedSlabs                          ) GameRegistry.addRecipe(new ItemStack(slabsGraniteSmoothHalf,       6, 0), new Object[]{"###",               '#', new ItemStack(Blocks.STONE,             1, 2)});
		if(configAllowedSlabs  && configExtendedGranite) GameRegistry.addRecipe(new ItemStack(slabsGraniteBrickHalf,        6, 0), new Object[]{"###",               '#', new ItemStack(blockGraniteBrick,        1, 0)});
		if(configAllowedSlabs  && configExtendedGranite) GameRegistry.addRecipe(new ItemStack(slabsGraniteBrickMossHalf,    6, 0), new Object[]{"###",               '#', new ItemStack(blockGraniteBrickMoss,    1, 0)});
		if(configAllowedSlabs  && configExtendedGranite) GameRegistry.addRecipe(new ItemStack(slabsGraniteBrickCrackedHalf, 6, 0), new Object[]{"###",               '#', new ItemStack(blockGraniteBrickCracked, 1, 0)});
		if(configAllowedWalls                          ) GameRegistry.addRecipe(new ItemStack(wallsGraniteStone,            6, 0), new Object[]{"###", "###",        '#', new ItemStack(Blocks.STONE,             1, 1)});
		if(configAllowedWalls  && configExtendedGranite) GameRegistry.addRecipe(new ItemStack(wallsGraniteCobble,           6, 0), new Object[]{"###", "###",        '#', new ItemStack(blockGraniteCobble,       1, 0)});
		if(configAllowedWalls  && configExtendedGranite) GameRegistry.addRecipe(new ItemStack(wallsGraniteCobbleMoss,       6, 0), new Object[]{"###", "###",        '#', new ItemStack(blockGraniteCobbleMoss,   1, 0)});
		if(configAllowedWalls                          ) GameRegistry.addRecipe(new ItemStack(wallsGraniteSmooth,           6, 0), new Object[]{"###", "###",        '#', new ItemStack(Blocks.STONE,             1, 2)});
		if(configAllowedWalls  && configExtendedGranite) GameRegistry.addRecipe(new ItemStack(wallsGraniteBrick,            6, 0), new Object[]{"###", "###",        '#', new ItemStack(blockGraniteBrick,        1, 0)});
		if(configAllowedWalls  && configExtendedGranite) GameRegistry.addRecipe(new ItemStack(wallsGraniteBrickMoss,        6, 0), new Object[]{"###", "###",        '#', new ItemStack(blockGraniteBrickMoss,    1, 0)});
		if(configAllowedWalls  && configExtendedGranite) GameRegistry.addRecipe(new ItemStack(wallsGraniteBrickCracked,     6, 0), new Object[]{"###", "###",        '#', new ItemStack(blockGraniteBrickCracked, 1, 0)});
		
		if(                       configExtendedDiorite) GameRegistry.addRecipe(new ItemStack(Blocks.STONE,            4, 3), new Object[]{"##", "##", '#', new ItemStack(blockDioriteCobble,       1, 0)});
		if(                       configExtendedDiorite) GameRegistry.addRecipe(new ItemStack(Blocks.STONE,            4, 3), new Object[]{"##", "##", '#', new ItemStack(blockDioriteCobbleMoss,   1, 0)});
		if(                       configExtendedDiorite) GameRegistry.addRecipe(new ItemStack(blockDioriteBrick,       4, 0), new Object[]{"##", "##", '#', new ItemStack(Blocks.STONE,             1, 4)});
		if(                       configExtendedDiorite) GameRegistry.addRecipe(new ItemStack(blockDioriteBrick,       3, 0), new Object[]{"##", "##", '#', new ItemStack(blockDioriteBrickCracked, 1, 4)});
		if(                       configExtendedDiorite) GameRegistry.addRecipe(new ItemStack(blockDioriteBrickCarved, 1, 0), new Object[]{"#",  "#",  '#', new ItemStack(slabsDioriteBrickHalf,    1, 0)});
		if(                       configExtendedDiorite) GameRegistry.addShapelessRecipe(new ItemStack(blockDioriteCobbleMoss, 1, 0), new Object[]{new ItemStack(blockDioriteCobble, 1, 0), Blocks.VINE});
		if(                       configExtendedDiorite) GameRegistry.addShapelessRecipe(new ItemStack(blockDioriteBrickMoss,  1, 0), new Object[]{new ItemStack(blockDioriteBrick,  1, 0), Blocks.VINE});
		if(                       configExtendedDiorite) GameRegistry.addSmelting(new ItemStack(Blocks.STONE,          1, 3), new ItemStack(Blocks.STONE,             1, 4), 5);
		if(                       configExtendedDiorite) GameRegistry.addSmelting(new ItemStack(blockDioriteBrick,     1, 0), new ItemStack(blockDioriteBrickCracked, 1, 0), 5);
		if(                       configExtendedDiorite) GameRegistry.addSmelting(new ItemStack(blockDioriteBrickMoss, 1, 0), new ItemStack(blockDioriteBrickCracked, 1, 0), 5);
		if(configAllowedStairs                         ) GameRegistry.addRecipe(new ItemStack(stairDioriteStone,            4, 0), new Object[]{"  #", " ##", "###", '#', new ItemStack(Blocks.STONE,             1, 3)});
		if(configAllowedStairs && configExtendedDiorite) GameRegistry.addRecipe(new ItemStack(stairDioriteCobble,           4, 0), new Object[]{"  #", " ##", "###", '#', new ItemStack(blockDioriteCobble,       1, 0)});
		if(configAllowedStairs && configExtendedDiorite) GameRegistry.addRecipe(new ItemStack(stairDioriteCobbleMoss,       4, 0), new Object[]{"  #", " ##", "###", '#', new ItemStack(blockDioriteCobbleMoss,   1, 0)});
		if(configAllowedStairs                         ) GameRegistry.addRecipe(new ItemStack(stairDioriteSmooth,           4, 0), new Object[]{"  #", " ##", "###", '#', new ItemStack(Blocks.STONE,             1, 4)});
		if(configAllowedStairs && configExtendedDiorite) GameRegistry.addRecipe(new ItemStack(stairDioriteBrick,            4, 0), new Object[]{"  #", " ##", "###", '#', new ItemStack(blockDioriteBrick,        1, 0)});
		if(configAllowedStairs && configExtendedDiorite) GameRegistry.addRecipe(new ItemStack(stairDioriteBrickMoss,        4, 0), new Object[]{"  #", " ##", "###", '#', new ItemStack(blockDioriteBrickMoss,    1, 0)});
		if(configAllowedStairs && configExtendedDiorite) GameRegistry.addRecipe(new ItemStack(stairDioriteBrickCracked,     4, 0), new Object[]{"  #", " ##", "###", '#', new ItemStack(blockDioriteBrickCracked, 1, 0)});
		if(configAllowedSlabs                          ) GameRegistry.addRecipe(new ItemStack(slabsDioriteStoneHalf,        6, 0), new Object[]{"###",               '#', new ItemStack(Blocks.STONE,             1, 3)});
		if(configAllowedSlabs  && configExtendedDiorite) GameRegistry.addRecipe(new ItemStack(slabsDioriteCobbleHalf,       6, 0), new Object[]{"###",               '#', new ItemStack(blockDioriteCobble,       1, 0)});
		if(configAllowedSlabs  && configExtendedDiorite) GameRegistry.addRecipe(new ItemStack(slabsDioriteCobbleMossHalf,   6, 0), new Object[]{"###",               '#', new ItemStack(blockDioriteCobbleMoss,   1, 0)});
		if(configAllowedSlabs                          ) GameRegistry.addRecipe(new ItemStack(slabsDioriteSmoothHalf,       6, 0), new Object[]{"###",               '#', new ItemStack(Blocks.STONE,             1, 4)});
		if(configAllowedSlabs  && configExtendedDiorite) GameRegistry.addRecipe(new ItemStack(slabsDioriteBrickHalf,        6, 0), new Object[]{"###",               '#', new ItemStack(blockDioriteBrick,        1, 0)});
		if(configAllowedSlabs  && configExtendedDiorite) GameRegistry.addRecipe(new ItemStack(slabsDioriteBrickMossHalf,    6, 0), new Object[]{"###",               '#', new ItemStack(blockDioriteBrickMoss,    1, 0)});
		if(configAllowedSlabs  && configExtendedDiorite) GameRegistry.addRecipe(new ItemStack(slabsDioriteBrickCrackedHalf, 6, 0), new Object[]{"###",               '#', new ItemStack(blockDioriteBrickCracked, 1, 0)});
		if(configAllowedWalls                          ) GameRegistry.addRecipe(new ItemStack(wallsDioriteStone,            6, 0), new Object[]{"###", "###",        '#', new ItemStack(Blocks.STONE,             1, 3)});
		if(configAllowedWalls  && configExtendedDiorite) GameRegistry.addRecipe(new ItemStack(wallsDioriteCobble,           6, 0), new Object[]{"###", "###",        '#', new ItemStack(blockDioriteCobble,       1, 0)});
		if(configAllowedWalls  && configExtendedDiorite) GameRegistry.addRecipe(new ItemStack(wallsDioriteCobbleMoss,       6, 0), new Object[]{"###", "###",        '#', new ItemStack(blockDioriteCobbleMoss,   1, 0)});
		if(configAllowedWalls                          ) GameRegistry.addRecipe(new ItemStack(wallsDioriteSmooth,           6, 0), new Object[]{"###", "###",        '#', new ItemStack(Blocks.STONE,             1, 4)});
		if(configAllowedWalls  && configExtendedDiorite) GameRegistry.addRecipe(new ItemStack(wallsDioriteBrick,            6, 0), new Object[]{"###", "###",        '#', new ItemStack(blockDioriteBrick,        1, 0)});
		if(configAllowedWalls  && configExtendedDiorite) GameRegistry.addRecipe(new ItemStack(wallsDioriteBrickMoss,        6, 0), new Object[]{"###", "###",        '#', new ItemStack(blockDioriteBrickMoss,    1, 0)});
		if(configAllowedWalls  && configExtendedDiorite) GameRegistry.addRecipe(new ItemStack(wallsDioriteBrickCracked,     6, 0), new Object[]{"###", "###",        '#', new ItemStack(blockDioriteBrickCracked, 1, 0)});
		
		if(                       configExtendedAndesite) GameRegistry.addRecipe(new ItemStack(Blocks.STONE,             4, 5), new Object[]{"##", "##", '#', new ItemStack(blockAndesiteCobble,       1, 0)});
		if(                       configExtendedAndesite) GameRegistry.addRecipe(new ItemStack(Blocks.STONE,             4, 5), new Object[]{"##", "##", '#', new ItemStack(blockAndesiteCobbleMoss,   1, 0)});
		if(                       configExtendedAndesite) GameRegistry.addRecipe(new ItemStack(blockAndesiteBrick,       4, 0), new Object[]{"##", "##", '#', new ItemStack(Blocks.STONE,              1, 6)});
		if(                       configExtendedAndesite) GameRegistry.addRecipe(new ItemStack(blockAndesiteBrick,       3, 0), new Object[]{"##", "##", '#', new ItemStack(blockAndesiteBrickCracked, 1, 6)});
		if(                       configExtendedAndesite) GameRegistry.addRecipe(new ItemStack(blockAndesiteBrickCarved, 1, 0), new Object[]{"#",  "#",  '#', new ItemStack(slabsAndesiteBrickHalf,    1, 0)});
		if(                       configExtendedAndesite) GameRegistry.addShapelessRecipe(new ItemStack(blockAndesiteCobbleMoss, 1, 0), new Object[]{new ItemStack(blockAndesiteCobble, 1, 0), Blocks.VINE});
		if(                       configExtendedAndesite) GameRegistry.addShapelessRecipe(new ItemStack(blockAndesiteBrickMoss,  1, 0), new Object[]{new ItemStack(blockAndesiteBrick,  1, 0), Blocks.VINE});
		if(                       configExtendedAndesite) GameRegistry.addSmelting(new ItemStack(Blocks.STONE,           1, 5), new ItemStack(Blocks.STONE,              1, 6), 5);
		if(                       configExtendedAndesite) GameRegistry.addSmelting(new ItemStack(blockAndesiteBrick,     1, 0), new ItemStack(blockAndesiteBrickCracked, 1, 0), 5);
		if(                       configExtendedAndesite) GameRegistry.addSmelting(new ItemStack(blockAndesiteBrickMoss, 1, 0), new ItemStack(blockAndesiteBrickCracked, 1, 0), 5);
		if(configAllowedStairs                          ) GameRegistry.addRecipe(new ItemStack(stairAndesiteStone,            4, 0), new Object[]{"  #", " ##", "###", '#', new ItemStack(Blocks.STONE,              1, 5)});
		if(configAllowedStairs && configExtendedAndesite) GameRegistry.addRecipe(new ItemStack(stairAndesiteCobble,           4, 0), new Object[]{"  #", " ##", "###", '#', new ItemStack(blockAndesiteCobble,       1, 0)});
		if(configAllowedStairs && configExtendedAndesite) GameRegistry.addRecipe(new ItemStack(stairAndesiteCobbleMoss,       4, 0), new Object[]{"  #", " ##", "###", '#', new ItemStack(blockAndesiteCobbleMoss,   1, 0)});
		if(configAllowedStairs                          ) GameRegistry.addRecipe(new ItemStack(stairAndesiteSmooth,           4, 0), new Object[]{"  #", " ##", "###", '#', new ItemStack(Blocks.STONE,              1, 6)});
		if(configAllowedStairs && configExtendedAndesite) GameRegistry.addRecipe(new ItemStack(stairAndesiteBrick,            4, 0), new Object[]{"  #", " ##", "###", '#', new ItemStack(blockAndesiteBrick,        1, 0)});
		if(configAllowedStairs && configExtendedAndesite) GameRegistry.addRecipe(new ItemStack(stairAndesiteBrickMoss,        4, 0), new Object[]{"  #", " ##", "###", '#', new ItemStack(blockAndesiteBrickMoss,    1, 0)});
		if(configAllowedStairs && configExtendedAndesite) GameRegistry.addRecipe(new ItemStack(stairAndesiteBrickCracked,     4, 0), new Object[]{"  #", " ##", "###", '#', new ItemStack(blockAndesiteBrickCracked, 1, 0)});
		if(configAllowedSlabs                           ) GameRegistry.addRecipe(new ItemStack(slabsAndesiteStoneHalf,        6, 0), new Object[]{"###",               '#', new ItemStack(Blocks.STONE,              1, 5)});
		if(configAllowedSlabs  && configExtendedAndesite) GameRegistry.addRecipe(new ItemStack(slabsAndesiteCobbleHalf,       6, 0), new Object[]{"###",               '#', new ItemStack(blockAndesiteCobble,       1, 0)});
		if(configAllowedSlabs  && configExtendedAndesite) GameRegistry.addRecipe(new ItemStack(slabsAndesiteCobbleMossHalf,   6, 0), new Object[]{"###",               '#', new ItemStack(blockAndesiteCobbleMoss,   1, 0)});
		if(configAllowedSlabs                           ) GameRegistry.addRecipe(new ItemStack(slabsAndesiteSmoothHalf,       6, 0), new Object[]{"###",               '#', new ItemStack(Blocks.STONE,              1, 6)});
		if(configAllowedSlabs  && configExtendedAndesite) GameRegistry.addRecipe(new ItemStack(slabsAndesiteBrickHalf,        6, 0), new Object[]{"###",               '#', new ItemStack(blockAndesiteBrick,        1, 0)});
		if(configAllowedSlabs  && configExtendedAndesite) GameRegistry.addRecipe(new ItemStack(slabsAndesiteBrickMossHalf,    6, 0), new Object[]{"###",               '#', new ItemStack(blockAndesiteBrickMoss,    1, 0)});
		if(configAllowedSlabs  && configExtendedAndesite) GameRegistry.addRecipe(new ItemStack(slabsAndesiteBrickCrackedHalf, 6, 0), new Object[]{"###",               '#', new ItemStack(blockAndesiteBrickCracked, 1, 0)});
		if(configAllowedWalls                           ) GameRegistry.addRecipe(new ItemStack(wallsAndesiteStone,            6, 0), new Object[]{"###", "###",        '#', new ItemStack(Blocks.STONE,              1, 5)});
		if(configAllowedWalls  && configExtendedAndesite) GameRegistry.addRecipe(new ItemStack(wallsAndesiteCobble,           6, 0), new Object[]{"###", "###",        '#', new ItemStack(blockAndesiteCobble,       1, 0)});
		if(configAllowedWalls  && configExtendedAndesite) GameRegistry.addRecipe(new ItemStack(wallsAndesiteCobbleMoss,       6, 0), new Object[]{"###", "###",        '#', new ItemStack(blockAndesiteCobbleMoss,   1, 0)});
		if(configAllowedWalls                           ) GameRegistry.addRecipe(new ItemStack(wallsAndesiteSmooth,           6, 0), new Object[]{"###", "###",        '#', new ItemStack(Blocks.STONE,              1, 6)});
		if(configAllowedWalls  && configExtendedAndesite) GameRegistry.addRecipe(new ItemStack(wallsAndesiteBrick,            6, 0), new Object[]{"###", "###",        '#', new ItemStack(blockAndesiteBrick,        1, 0)});
		if(configAllowedWalls  && configExtendedAndesite) GameRegistry.addRecipe(new ItemStack(wallsAndesiteBrickMoss,        6, 0), new Object[]{"###", "###",        '#', new ItemStack(blockAndesiteBrickMoss,    1, 0)});
		if(configAllowedWalls  && configExtendedAndesite) GameRegistry.addRecipe(new ItemStack(wallsAndesiteBrickCracked,     6, 0), new Object[]{"###", "###",        '#', new ItemStack(blockAndesiteBrickCracked, 1, 0)});
		
		if(                       configExtendedEnd) GameRegistry.addRecipe(new ItemStack(Blocks.END_STONE,    4, 0), new Object[]{"##", "##", '#', new ItemStack(blockEndCobble,       1, 0)});
		if(                       configExtendedEnd) GameRegistry.addRecipe(new ItemStack(Blocks.END_STONE,    4, 0), new Object[]{"##", "##", '#', new ItemStack(blockEndCobbleMoss,   1, 0)});
		if(                       configExtendedEnd) GameRegistry.addRecipe(new ItemStack(Blocks.END_BRICKS,   4, 0), new Object[]{"##", "##", '#', new ItemStack(blockEndSmooth,       1, 0)});
		if(                       configExtendedEnd) GameRegistry.addRecipe(new ItemStack(Blocks.END_BRICKS,   3, 0), new Object[]{"##", "##", '#', new ItemStack(blockEndBrickCracked, 1, 0)});
		if(                       configExtendedEnd) GameRegistry.addRecipe(new ItemStack(blockEndBrickCarved, 1, 0), new Object[]{"#",  "#",  '#', new ItemStack(slabsEndBrickHalf,    1, 0)});
		if(                       configExtendedEnd) GameRegistry.addShapelessRecipe(new ItemStack(blockEndCobbleMoss, 1, 0), new Object[]{new ItemStack(blockEndCobble,     1, 0), Blocks.VINE});
		if(                       configExtendedEnd) GameRegistry.addShapelessRecipe(new ItemStack(blockEndBrickMoss,  1, 0), new Object[]{new ItemStack(Blocks.END_BRICKS,  1, 0), Blocks.VINE});
		if(                       configExtendedEnd) GameRegistry.addSmelting(new ItemStack(Blocks.END_STONE,  1, 0), new ItemStack(blockEndSmooth,       1, 0), 5);
		if(                       configExtendedEnd) GameRegistry.addSmelting(new ItemStack(Blocks.END_BRICKS, 1, 0), new ItemStack(blockEndBrickCracked, 1, 0), 5);
		if(                       configExtendedEnd) GameRegistry.addSmelting(new ItemStack(blockEndBrickMoss, 1, 0), new ItemStack(blockEndBrickCracked, 1, 0), 5);
		if(configAllowedStairs                     ) GameRegistry.addRecipe(new ItemStack(stairEndStone,            4, 0), new Object[]{"  #", " ##", "###", '#', new ItemStack(Blocks.END_STONE,     1, 0)});
		if(configAllowedStairs && configExtendedEnd) GameRegistry.addRecipe(new ItemStack(stairEndCobble,           4, 0), new Object[]{"  #", " ##", "###", '#', new ItemStack(blockEndCobble,       1, 0)});
		if(configAllowedStairs && configExtendedEnd) GameRegistry.addRecipe(new ItemStack(stairEndCobbleMoss,       4, 0), new Object[]{"  #", " ##", "###", '#', new ItemStack(blockEndCobbleMoss,   1, 0)});
		if(configAllowedStairs                     ) GameRegistry.addRecipe(new ItemStack(stairEndSmooth,           4, 0), new Object[]{"  #", " ##", "###", '#', new ItemStack(Blocks.END_STONE,     1, 0)});
		if(configAllowedStairs                     ) GameRegistry.addRecipe(new ItemStack(stairEndBrick,            4, 0), new Object[]{"  #", " ##", "###", '#', new ItemStack(Blocks.END_BRICKS,    1, 0)});
		if(configAllowedStairs && configExtendedEnd) GameRegistry.addRecipe(new ItemStack(stairEndBrickMoss,        4, 0), new Object[]{"  #", " ##", "###", '#', new ItemStack(blockEndBrickMoss,    1, 0)});
		if(configAllowedStairs && configExtendedEnd) GameRegistry.addRecipe(new ItemStack(stairEndBrickCracked,     4, 0), new Object[]{"  #", " ##", "###", '#', new ItemStack(blockEndBrickCracked, 1, 0)});
		if(configAllowedSlabs                      ) GameRegistry.addRecipe(new ItemStack(slabsEndStoneHalf,        6, 0), new Object[]{"###",               '#', new ItemStack(Blocks.END_STONE,     1, 0)});
		if(configAllowedSlabs  && configExtendedEnd) GameRegistry.addRecipe(new ItemStack(slabsEndCobbleHalf,       6, 0), new Object[]{"###",               '#', new ItemStack(blockEndCobble,       1, 0)});
		if(configAllowedSlabs  && configExtendedEnd) GameRegistry.addRecipe(new ItemStack(slabsEndCobbleMossHalf,   6, 0), new Object[]{"###",               '#', new ItemStack(blockEndCobbleMoss,   1, 0)});
		if(configAllowedSlabs                      ) GameRegistry.addRecipe(new ItemStack(slabsEndSmoothHalf,       6, 0), new Object[]{"###",               '#', new ItemStack(Blocks.END_STONE,     1, 0)});
		if(configAllowedSlabs                      ) GameRegistry.addRecipe(new ItemStack(slabsEndBrickHalf,        6, 0), new Object[]{"###",               '#', new ItemStack(Blocks.END_BRICKS,    1, 0)});
		if(configAllowedSlabs  && configExtendedEnd) GameRegistry.addRecipe(new ItemStack(slabsEndBrickMossHalf,    6, 0), new Object[]{"###",               '#', new ItemStack(blockEndBrickMoss,    1, 0)});
		if(configAllowedSlabs  && configExtendedEnd) GameRegistry.addRecipe(new ItemStack(slabsEndBrickCrackedHalf, 6, 0), new Object[]{"###",               '#', new ItemStack(blockEndBrickCracked, 1, 0)});
		if(configAllowedWalls                      ) GameRegistry.addRecipe(new ItemStack(wallsEndStone,            6, 0), new Object[]{"###", "###",        '#', new ItemStack(Blocks.END_STONE,     1, 0)});
		if(configAllowedWalls  && configExtendedEnd) GameRegistry.addRecipe(new ItemStack(wallsEndCobble,           6, 0), new Object[]{"###", "###",        '#', new ItemStack(blockEndCobble,       1, 0)});
		if(configAllowedWalls  && configExtendedEnd) GameRegistry.addRecipe(new ItemStack(wallsEndCobbleMoss,       6, 0), new Object[]{"###", "###",        '#', new ItemStack(blockEndCobbleMoss,   1, 0)});
		if(configAllowedWalls                      ) GameRegistry.addRecipe(new ItemStack(wallsEndSmooth,           6, 0), new Object[]{"###", "###",        '#', new ItemStack(Blocks.END_STONE,     1, 0)});
		if(configAllowedWalls                      ) GameRegistry.addRecipe(new ItemStack(wallsEndBrick,            6, 0), new Object[]{"###", "###",        '#', new ItemStack(Blocks.END_BRICKS,    1, 0)});
		if(configAllowedWalls  && configExtendedEnd) GameRegistry.addRecipe(new ItemStack(wallsEndBrickMoss,        6, 0), new Object[]{"###", "###",        '#', new ItemStack(blockEndBrickMoss,    1, 0)});
		if(configAllowedWalls  && configExtendedEnd) GameRegistry.addRecipe(new ItemStack(wallsEndBrickCracked,     6, 0), new Object[]{"###", "###",        '#', new ItemStack(blockEndBrickCracked, 1, 0)});
		
		if(configAllowedStairs) GameRegistry.addRecipe(new ItemStack(stairPrismarineStone,      4), new Object[]{"  #", " ##", "###", '#', new ItemStack(Blocks.PRISMARINE, 1, 0)});
		if(configAllowedStairs) GameRegistry.addRecipe(new ItemStack(stairPrismarineBrick,      4), new Object[]{"  #", " ##", "###", '#', new ItemStack(Blocks.PRISMARINE, 1, 1)});
		if(configAllowedStairs) GameRegistry.addRecipe(new ItemStack(stairPrismarineDark,       4), new Object[]{"  #", " ##", "###", '#', new ItemStack(Blocks.PRISMARINE, 1, 2)});
		if(configAllowedSlabs)  GameRegistry.addRecipe(new ItemStack(slabsPrismarineStoneHalf,  6), new Object[]{"###",               '#', new ItemStack(Blocks.PRISMARINE, 1, 0)});
		if(configAllowedSlabs)  GameRegistry.addRecipe(new ItemStack(slabsPrismarineBrickHalf,  6), new Object[]{"###",               '#', new ItemStack(Blocks.PRISMARINE, 1, 1)});
		if(configAllowedSlabs)  GameRegistry.addRecipe(new ItemStack(slabsPrismarineDarkHalf,   6), new Object[]{"###",               '#', new ItemStack(Blocks.PRISMARINE, 1, 2)});
		if(configAllowedWalls)  GameRegistry.addRecipe(new ItemStack(wallsPrismarineStone,      6), new Object[]{"###", "###",        '#', new ItemStack(Blocks.PRISMARINE, 1, 0)});
		if(configAllowedWalls)  GameRegistry.addRecipe(new ItemStack(wallsPrismarineBrick,      6), new Object[]{"###", "###",        '#', new ItemStack(Blocks.PRISMARINE, 1, 1)});
		if(configAllowedWalls)  GameRegistry.addRecipe(new ItemStack(wallsPrismarineDark,       6), new Object[]{"###", "###",        '#', new ItemStack(Blocks.PRISMARINE, 1, 2)});
		
		
		GameRegistry.addRecipe(new ItemStack(Items.COMPARATOR), new Object[]{" I ", "IQI", "XXX", 'I', Blocks.REDSTONE_TORCH, 'Q', Items.QUARTZ, 'X', new ItemStack(Blocks.STONE, 1, 1)});
		GameRegistry.addRecipe(new ItemStack(Items.COMPARATOR), new Object[]{" I ", "IQI", "XXX", 'I', Blocks.REDSTONE_TORCH, 'Q', Items.QUARTZ, 'X', new ItemStack(Blocks.STONE, 1, 3)});
		GameRegistry.addRecipe(new ItemStack(Items.COMPARATOR), new Object[]{" I ", "IQI", "XXX", 'I', Blocks.REDSTONE_TORCH, 'Q', Items.QUARTZ, 'X', new ItemStack(Blocks.STONE, 1, 5)});
		GameRegistry.addRecipe(new ItemStack(Items.COMPARATOR), new Object[]{" I ", "IQI", "XXX", 'I', Blocks.REDSTONE_TORCH, 'Q', Items.QUARTZ, 'X', new ItemStack(Blocks.END_STONE  )});
		
		GameRegistry.addRecipe(new ItemStack(Items.REPEATER), new Object[]{"IRI", "XXX", 'I', Blocks.REDSTONE_TORCH, 'R', Items.REDSTONE, 'X', new ItemStack(Blocks.STONE, 1, 1)});
		GameRegistry.addRecipe(new ItemStack(Items.REPEATER), new Object[]{"IRI", "XXX", 'I', Blocks.REDSTONE_TORCH, 'R', Items.REDSTONE, 'X', new ItemStack(Blocks.STONE, 1, 3)});
		GameRegistry.addRecipe(new ItemStack(Items.REPEATER), new Object[]{"IRI", "XXX", 'I', Blocks.REDSTONE_TORCH, 'R', Items.REDSTONE, 'X', new ItemStack(Blocks.STONE, 1, 5)});
		GameRegistry.addRecipe(new ItemStack(Items.REPEATER), new Object[]{"IRI", "XXX", 'I', Blocks.REDSTONE_TORCH, 'R', Items.REDSTONE, 'X', new ItemStack(Blocks.END_STONE  )});
		
		GameRegistry.addRecipe(new ItemStack(Blocks.STONE_PRESSURE_PLATE), new Object[]{"XX", 'X', new ItemStack(Blocks.STONE, 1, 1)});
		GameRegistry.addRecipe(new ItemStack(Blocks.STONE_PRESSURE_PLATE), new Object[]{"XX", 'X', new ItemStack(Blocks.STONE, 1, 3)});
		GameRegistry.addRecipe(new ItemStack(Blocks.STONE_PRESSURE_PLATE), new Object[]{"XX", 'X', new ItemStack(Blocks.STONE, 1, 5)});
		GameRegistry.addRecipe(new ItemStack(Blocks.STONE_PRESSURE_PLATE), new Object[]{"XX", 'X', new ItemStack(Blocks.END_STONE  )});
		
		GameRegistry.addRecipe(new ItemStack(Blocks.STONE_BUTTON), new Object[]{"X", 'X', new ItemStack(Blocks.STONE, 1, 1)});
		GameRegistry.addRecipe(new ItemStack(Blocks.STONE_BUTTON), new Object[]{"X", 'X', new ItemStack(Blocks.STONE, 1, 3)});
		GameRegistry.addRecipe(new ItemStack(Blocks.STONE_BUTTON), new Object[]{"X", 'X', new ItemStack(Blocks.STONE, 1, 5)});
		GameRegistry.addRecipe(new ItemStack(Blocks.STONE_BUTTON), new Object[]{"X", 'X', new ItemStack(Blocks.END_STONE  )});
		
		
		if(configExtendedGranite)  GameRegistry.addRecipe(new ItemStack(Blocks.PISTON), new Object[]{"WWW", "XIX", "XRX", 'W', Blocks.PLANKS, 'I', Items.IRON_INGOT, 'R', Items.REDSTONE, 'X', blockGraniteCobble});
		if(configExtendedDiorite)  GameRegistry.addRecipe(new ItemStack(Blocks.PISTON), new Object[]{"WWW", "XIX", "XRX", 'W', Blocks.PLANKS, 'I', Items.IRON_INGOT, 'R', Items.REDSTONE, 'X', blockDioriteCobble});
		if(configExtendedAndesite) GameRegistry.addRecipe(new ItemStack(Blocks.PISTON), new Object[]{"WWW", "XIX", "XRX", 'W', Blocks.PLANKS, 'I', Items.IRON_INGOT, 'R', Items.REDSTONE, 'X', blockAndesiteCobble});
		if(configExtendedEnd)      GameRegistry.addRecipe(new ItemStack(Blocks.PISTON), new Object[]{"WWW", "XIX", "XRX", 'W', Blocks.PLANKS, 'I', Items.IRON_INGOT, 'R', Items.REDSTONE, 'X', blockEndCobble});
		
		if(configExtendedGranite)  GameRegistry.addRecipe(new ItemStack(Items.STONE_SWORD), new Object[]{"X", "X", "I", 'I', Items.STICK, 'X', blockGraniteCobble});
		if(configExtendedDiorite)  GameRegistry.addRecipe(new ItemStack(Items.STONE_SWORD), new Object[]{"X", "X", "I", 'I', Items.STICK, 'X', blockDioriteCobble});
		if(configExtendedAndesite) GameRegistry.addRecipe(new ItemStack(Items.STONE_SWORD), new Object[]{"X", "X", "I", 'I', Items.STICK, 'X', blockAndesiteCobble});
		if(configExtendedEnd)      GameRegistry.addRecipe(new ItemStack(Items.STONE_SWORD), new Object[]{"X", "X", "I", 'I', Items.STICK, 'X', blockEndCobble});
		
		if(configExtendedGranite)  GameRegistry.addRecipe(new ItemStack(Blocks.DISPENSER), new Object[]{"XXX", "XBX", "XRX", 'B', Items.BOW, 'R', Items.REDSTONE, 'X', blockGraniteCobble});
		if(configExtendedDiorite)  GameRegistry.addRecipe(new ItemStack(Blocks.DISPENSER), new Object[]{"XXX", "XBX", "XRX", 'B', Items.BOW, 'R', Items.REDSTONE, 'X', blockDioriteCobble});
		if(configExtendedAndesite) GameRegistry.addRecipe(new ItemStack(Blocks.DISPENSER), new Object[]{"XXX", "XBX", "XRX", 'B', Items.BOW, 'R', Items.REDSTONE, 'X', blockAndesiteCobble});
		if(configExtendedEnd)      GameRegistry.addRecipe(new ItemStack(Blocks.DISPENSER), new Object[]{"XXX", "XBX", "XRX", 'B', Items.BOW, 'R', Items.REDSTONE, 'X', blockEndCobble});
		
		if(configExtendedGranite)  GameRegistry.addRecipe(new ItemStack(Blocks.FURNACE), new Object[]{"XXX", "X X", "XXX", 'X', blockGraniteCobble});
		if(configExtendedDiorite)  GameRegistry.addRecipe(new ItemStack(Blocks.FURNACE), new Object[]{"XXX", "X X", "XXX", 'X', blockDioriteCobble});
		if(configExtendedAndesite) GameRegistry.addRecipe(new ItemStack(Blocks.FURNACE), new Object[]{"XXX", "X X", "XXX", 'X', blockAndesiteCobble});
		if(configExtendedEnd)      GameRegistry.addRecipe(new ItemStack(Blocks.FURNACE), new Object[]{"XXX", "X X", "XXX", 'X', blockEndCobble});
		
		if(configExtendedGranite)  GameRegistry.addRecipe(new ItemStack(Blocks.DROPPER), new Object[]{"XXX", "X X", "XRX", 'R', Items.REDSTONE, 'X', blockGraniteCobble});
		if(configExtendedDiorite)  GameRegistry.addRecipe(new ItemStack(Blocks.DROPPER), new Object[]{"XXX", "X X", "XRX", 'R', Items.REDSTONE, 'X', blockDioriteCobble});
		if(configExtendedAndesite) GameRegistry.addRecipe(new ItemStack(Blocks.DROPPER), new Object[]{"XXX", "X X", "XRX", 'R', Items.REDSTONE, 'X', blockAndesiteCobble});
		if(configExtendedEnd)      GameRegistry.addRecipe(new ItemStack(Blocks.DROPPER), new Object[]{"XXX", "X X", "XRX", 'R', Items.REDSTONE, 'X', blockEndCobble});
		
		if(configExtendedGranite)  GameRegistry.addRecipe(new ItemStack(Items.STONE_SHOVEL), new Object[]{"X", "I", "I", 'I', Items.STICK, 'X', blockGraniteCobble});
		if(configExtendedDiorite)  GameRegistry.addRecipe(new ItemStack(Items.STONE_SHOVEL), new Object[]{"X", "I", "I", 'I', Items.STICK, 'X', blockDioriteCobble});
		if(configExtendedAndesite) GameRegistry.addRecipe(new ItemStack(Items.STONE_SHOVEL), new Object[]{"X", "I", "I", 'I', Items.STICK, 'X', blockAndesiteCobble});
		if(configExtendedEnd)      GameRegistry.addRecipe(new ItemStack(Items.STONE_SHOVEL), new Object[]{"X", "I", "I", 'I', Items.STICK, 'X', blockEndCobble});
		
		if(configExtendedGranite)  GameRegistry.addRecipe(new ItemStack(Blocks.LEVER), new Object[]{"I", "X", 'I', Items.STICK, 'X', blockGraniteCobble});
		if(configExtendedDiorite)  GameRegistry.addRecipe(new ItemStack(Blocks.LEVER), new Object[]{"I", "X", 'I', Items.STICK, 'X', blockDioriteCobble});
		if(configExtendedAndesite) GameRegistry.addRecipe(new ItemStack(Blocks.LEVER), new Object[]{"I", "X", 'I', Items.STICK, 'X', blockAndesiteCobble});
		if(configExtendedEnd)      GameRegistry.addRecipe(new ItemStack(Blocks.LEVER), new Object[]{"I", "X", 'I', Items.STICK, 'X', blockEndCobble});
		
		if(configExtendedGranite)  GameRegistry.addRecipe(new ItemStack(Items.STONE_HOE), new Object[]{"XX", " I", " I", 'I', Items.STICK, 'X', blockGraniteCobble});
		if(configExtendedDiorite)  GameRegistry.addRecipe(new ItemStack(Items.STONE_HOE), new Object[]{"XX", " I", " I", 'I', Items.STICK, 'X', blockDioriteCobble});
		if(configExtendedAndesite) GameRegistry.addRecipe(new ItemStack(Items.STONE_HOE), new Object[]{"XX", " I", " I", 'I', Items.STICK, 'X', blockAndesiteCobble});
		if(configExtendedEnd)      GameRegistry.addRecipe(new ItemStack(Items.STONE_HOE), new Object[]{"XX", " I", " I", 'I', Items.STICK, 'X', blockEndCobble});
		
		if(configExtendedGranite)  GameRegistry.addRecipe(new ItemStack(Items.STONE_AXE), new Object[]{"XX", "XI", " I", 'I', Items.STICK, 'X', blockGraniteCobble});
		if(configExtendedDiorite)  GameRegistry.addRecipe(new ItemStack(Items.STONE_AXE), new Object[]{"XX", "XI", " I", 'I', Items.STICK, 'X', blockDioriteCobble});
		if(configExtendedAndesite) GameRegistry.addRecipe(new ItemStack(Items.STONE_AXE), new Object[]{"XX", "XI", " I", 'I', Items.STICK, 'X', blockAndesiteCobble});
		if(configExtendedEnd)      GameRegistry.addRecipe(new ItemStack(Items.STONE_AXE), new Object[]{"XX", "XI", " I", 'I', Items.STICK, 'X', blockEndCobble});
		
		if(configExtendedGranite)  GameRegistry.addRecipe(new ItemStack(Items.BREWING_STAND), new Object[]{" I ", "XXX", 'I', Items.BLAZE_ROD, 'X', blockGraniteCobble});
		if(configExtendedDiorite)  GameRegistry.addRecipe(new ItemStack(Items.BREWING_STAND), new Object[]{" I ", "XXX", 'I', Items.BLAZE_ROD, 'X', blockDioriteCobble});
		if(configExtendedAndesite) GameRegistry.addRecipe(new ItemStack(Items.BREWING_STAND), new Object[]{" I ", "XXX", 'I', Items.BLAZE_ROD, 'X', blockAndesiteCobble});
		if(configExtendedEnd)      GameRegistry.addRecipe(new ItemStack(Items.BREWING_STAND), new Object[]{" I ", "XXX", 'I', Items.BLAZE_ROD, 'X', blockEndCobble});
		
		if(configExtendedGranite)  GameRegistry.addRecipe(new ItemStack(Items.STONE_PICKAXE), new Object[]{"XXX", " I ", " I ", 'I', Items.STICK, 'X', blockGraniteCobble});
		if(configExtendedDiorite)  GameRegistry.addRecipe(new ItemStack(Items.STONE_PICKAXE), new Object[]{"XXX", " I ", " I ", 'I', Items.STICK, 'X', blockDioriteCobble});
		if(configExtendedAndesite) GameRegistry.addRecipe(new ItemStack(Items.STONE_PICKAXE), new Object[]{"XXX", " I ", " I ", 'I', Items.STICK, 'X', blockAndesiteCobble});
		if(configExtendedEnd)      GameRegistry.addRecipe(new ItemStack(Items.STONE_PICKAXE), new Object[]{"XXX", " I ", " I ", 'I', Items.STICK, 'X', blockEndCobble});
		
	}
	
}
