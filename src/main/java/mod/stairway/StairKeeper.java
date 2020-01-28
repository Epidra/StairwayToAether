package mod.stairway;

import com.electronwill.nightconfig.core.file.CommentedFileConfig;
import mod.shared.Register;
import mod.shared.blocks.BlockBlock;
import mod.shared.blocks.BlockPillar;
import mod.stairway.blocks.*;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.common.ForgeConfigSpec;

import java.nio.file.Path;

import static mod.stairway.StairwayToAether.MODID;

public class StairKeeper {

    // Vanilla:   final       BLOCK_STONE_STONE                           BLOCK_STONE_STONE
    // Vanilla:	  final	SLABS_STONE_STONE                           SLABS_STONE_STONE
    public static final Block STAIR_STONE_STONE         = new BlockStair(MODID,"stair_stone_stone", Blocks.STONE);
    public static final Block WALLS_STONE_STONE         = new BlockWalls(MODID,"walls_stone_stone", Blocks.STONE);
    // Vanilla:   final       BLOCK_STONE_COBBLE                          BLOCK_STONE_COBBLE
    // Vanilla:   final       SLABS_STONE_COBBLE                          SLABS_STONE_COBBLE
    // Vanilla:   final       STAIR_STONE_COBBLE                          STAIR_STONE_COBBLE
    // Vanilla:   final       WALLS_STONE_COBBLE                          WALLS_STONE_COBBLE
    // Vanilla:   final       BLOCK_STONE_COBBLE_MOSS                     BLOCK_STONE_COBBLE_MOSS
    public static final Block SLABS_STONE_COBBLE_MOSS   = new BlockSlabs(MODID,"slabs_stone_cobble_moss", Blocks.STONE);
    public static final Block STAIR_STONE_COBBLE_MOSS   = new BlockStair(MODID,"stair_stone_cobble_moss", Blocks.STONE);
    // Vanilla    final       WALLS_STONE_COBBLE_MOSS                     WALLS_STONE_COBBLE_MOSS
    public static final Block BLOCK_STONE_SMOOTH        = new BlockBlock(MODID,"block_stone_smooth", Blocks.STONE);
    public static final Block SLABS_STONE_SMOOTH        = new BlockSlabs(MODID,"slabs_stone_smooth", Blocks.STONE);
    public static final Block STAIR_STONE_SMOOTH        = new BlockStair(MODID,"stair_stone_smooth", Blocks.STONE);
    public static final Block WALLS_STONE_SMOOTH        = new BlockWalls(MODID,"walls_stone_smooth", Blocks.STONE);
    // Vanilla:   final       BLOCK_STONE_BRICK                           BLOCK_STONE_BRICK
    // Vanilla:   final       SLABS_STONE_BRICK                           SLABS_STONE_BRICK
    // Vanilla:   final       STAIR_STONE_BRICK                           STAIR_STONE_BRICK
    public static final Block WALLS_STONE_BRICK         = new BlockWalls(MODID,"walls_stone_brick", Blocks.STONE);
    // Vanilla:   final       BLOCK_STONE_BRICK_MOSS                      BlockStoneBrickMoss
    public static final Block SLABS_STONE_BRICK_MOSS    = new BlockSlabs(MODID,"slabs_stone_brick_moss", Blocks.STONE);
    public static final Block STAIR_STONE_BRICK_MOSS    = new BlockStair(MODID,"stair_stone_brick_moss", Blocks.STONE);
    public static final Block WALLS_STONE_BRICK_MOSS    = new BlockWalls(MODID,"walls_stone_brick_moss", Blocks.STONE);
    // Vanilla:   final       BLOCK_STONE_BRICK_CRACKED                   BlockStoneBrickCracked
    public static final Block SLABS_STONE_BRICK_CRACKED = new BlockSlabs(MODID,"slabs_stone_brick_cracked", Blocks.STONE);
    public static final Block STAIR_STONE_BRICK_CRACKED = new BlockStair(MODID,"stair_stone_brick_cracked", Blocks.STONE);
    public static final Block WALLS_STONE_BRICK_CRACKED = new BlockWalls(MODID,"walls_stone_brick_cracked", Blocks.STONE);
    // Vanilla:         BLOCK_STONE_BRICK_CARVED                    BLOCK_STONE_BRICK_CARVED
    public static final Block BLOCK_STONE_PILLAR       = new BlockPillar(MODID,"block_stone_pillar", Blocks.STONE);

    // Vanilla:         BLOCK_GRANITE_STONE                           BlockGraniteStone
    public static final Block SLABS_GRANITE_STONE         = new BlockSlabs(MODID, "slabs_granite_stone", Blocks.GRANITE);
    public static final Block STAIR_GRANITE_STONE         = new BlockStair(MODID, "stair_granite_stone", Blocks.GRANITE);
    public static final Block WALLS_GRANITE_STONE         = new BlockWalls(MODID, "walls_granite_stone", Blocks.GRANITE);
    public static final Block BLOCK_GRANITE_COBBLE        = new BlockBlock(MODID, "block_granite_cobble", Blocks.GRANITE);
    public static final Block SLABS_GRANITE_COBBLE        = new BlockSlabs(MODID, "slabs_granite_cobble", Blocks.GRANITE);
    public static final Block STAIR_GRANITE_COBBLE        = new BlockStair(MODID, "stair_granite_cobble", Blocks.GRANITE);
    public static final Block WALLS_GRANITE_COBBLE        = new BlockWalls(MODID, "walls_granite_cobble", Blocks.GRANITE);
    public static final Block BLOCK_GRANITE_COBBLE_MOSS   = new BlockBlock(MODID, "block_granite_cobble_moss", Blocks.GRANITE);
    public static final Block SLABS_GRANITE_COBBLE_MOSS   = new BlockSlabs(MODID, "slabs_granite_cobble_moss", Blocks.GRANITE);
    public static final Block STAIR_GRANITE_COBBLE_MOSS   = new BlockStair(MODID, "stair_granite_cobble_moss", Blocks.GRANITE);
    public static final Block WALLS_GRANITE_COBBLE_MOSS   = new BlockWalls(MODID, "walls_granite_cobble_moss", Blocks.GRANITE);
    // Vanilla:   final       BLOCK_GRANITE_SMOOTH                          BlockGraniteSmooth
    public static final Block SLABS_GRANITE_SMOOTH        = new BlockSlabs(MODID, "slabs_granite_smooth", Blocks.GRANITE);
    public static final Block STAIR_GRANITE_SMOOTH        = new BlockStair(MODID, "stair_granite_smooth", Blocks.GRANITE);
    public static final Block WALLS_GRANITE_SMOOTH        = new BlockWalls(MODID, "walls_granite_smooth", Blocks.GRANITE);
    public static final Block BLOCK_GRANITE_BRICK         = new BlockBlock(MODID, "block_granite_brick", Blocks.GRANITE);
    public static final Block SLABS_GRANITE_BRICK         = new BlockSlabs(MODID, "slabs_granite_brick", Blocks.GRANITE);
    public static final Block STAIR_GRANITE_BRICK         = new BlockStair(MODID, "stair_granite_brick", Blocks.GRANITE);
    public static final Block WALLS_GRANITE_BRICK         = new BlockWalls(MODID, "walls_granite_brick", Blocks.GRANITE);
    public static final Block BLOCK_GRANITE_BRICK_MOSS    = new BlockBlock(MODID, "block_granite_brick_moss", Blocks.GRANITE);
    public static final Block SLABS_GRANITE_BRICK_MOSS    = new BlockSlabs(MODID, "slabs_granite_brick_moss", Blocks.GRANITE);
    public static final Block STAIR_GRANITE_BRICK_MOSS    = new BlockStair(MODID, "stair_granite_brick_moss", Blocks.GRANITE);
    public static final Block WALLS_GRANITE_BRICK_MOSS    = new BlockWalls(MODID, "walls_granite_brick_moss", Blocks.GRANITE);
    public static final Block BLOCK_GRANITE_BRICK_CRACKED = new BlockBlock(MODID, "block_granite_brick_cracked", Blocks.GRANITE);
    public static final Block SLABS_GRANITE_BRICK_CRACKED = new BlockSlabs(MODID, "slabs_granite_brick_cracked", Blocks.GRANITE);
    public static final Block STAIR_GRANITE_BRICK_CRACKED = new BlockStair(MODID, "stair_granite_brick_cracked", Blocks.GRANITE);
    public static final Block WALLS_GRANITE_BRICK_CRACKED = new BlockWalls(MODID, "walls_granite_brick_cracked", Blocks.GRANITE);
    public static final Block BLOCK_GRANITE_BRICK_CARVED  = new BlockBlock(MODID, "block_granite_brick_carved", Blocks.GRANITE);
    public static final Block BLOCK_GRANITE_PILLAR       = new BlockPillar(MODID, "block_granite_pillar", Blocks.GRANITE);

    // Vanilla:         BLOCK_DIORITE_STONE                           BlockDioriteStone
    public static final Block SLABS_DIORITE_STONE         = new BlockSlabs(MODID, "slabs_diorite_stone", Blocks.DIORITE);
    public static final Block STAIR_DIORITE_STONE         = new BlockStair(MODID, "stair_diorite_stone", Blocks.DIORITE);
    public static final Block WALLS_DIORITE_STONE         = new BlockWalls(MODID, "walls_diorite_stone", Blocks.DIORITE);
    public static final Block BLOCK_DIORITE_COBBLE        = new BlockBlock(MODID, "block_diorite_cobble", Blocks.DIORITE);
    public static final Block SLABS_DIORITE_COBBLE        = new BlockSlabs(MODID, "slabs_diorite_cobble", Blocks.DIORITE);
    public static final Block STAIR_DIORITE_COBBLE        = new BlockStair(MODID, "stair_diorite_cobble", Blocks.DIORITE);
    public static final Block WALLS_DIORITE_COBBLE        = new BlockWalls(MODID, "walls_diorite_cobble", Blocks.DIORITE);
    public static final Block BLOCK_DIORITE_COBBLE_MOSS   = new BlockBlock(MODID, "block_diorite_cobble_moss", Blocks.DIORITE);
    public static final Block SLABS_DIORITE_COBBLE_MOSS   = new BlockSlabs(MODID, "slabs_diorite_cobble_moss", Blocks.DIORITE);
    public static final Block STAIR_DIORITE_COBBLE_MOSS   = new BlockStair(MODID, "stair_diorite_cobble_moss", Blocks.DIORITE);
    public static final Block WALLS_DIORITE_COBBLE_MOSS   = new BlockWalls(MODID, "walls_diorite_cobble_moss", Blocks.DIORITE);
    // Vanilla:   final       BLOCK_DIORITE_SMOOTH                          BlockDioriteSmooth
    public static final Block SLABS_DIORITE_SMOOTH        = new BlockSlabs(MODID, "slabs_diorite_smooth", Blocks.DIORITE);
    public static final Block STAIR_DIORITE_SMOOTH        = new BlockStair(MODID, "stair_diorite_smooth", Blocks.DIORITE);
    public static final Block WALLS_DIORITE_SMOOTH        = new BlockWalls(MODID, "walls_diorite_smooth", Blocks.DIORITE);
    public static final Block BLOCK_DIORITE_BRICK         = new BlockBlock(MODID, "block_diorite_brick", Blocks.DIORITE);
    public static final Block SLABS_DIORITE_BRICK         = new BlockSlabs(MODID, "slabs_diorite_brick", Blocks.DIORITE);
    public static final Block STAIR_DIORITE_BRICK         = new BlockStair(MODID, "stair_diorite_brick", Blocks.DIORITE);
    public static final Block WALLS_DIORITE_BRICK         = new BlockWalls(MODID, "walls_diorite_brick", Blocks.DIORITE);
    public static final Block BLOCK_DIORITE_BRICK_MOSS    = new BlockBlock(MODID, "block_diorite_brick_moss", Blocks.DIORITE);
    public static final Block SLABS_DIORITE_BRICK_MOSS    = new BlockSlabs(MODID, "slabs_diorite_brick_moss", Blocks.DIORITE);
    public static final Block STAIR_DIORITE_BRICK_MOSS    = new BlockStair(MODID, "stair_diorite_brick_moss", Blocks.DIORITE);
    public static final Block WALLS_DIORITE_BRICK_MOSS    = new BlockWalls(MODID, "walls_diorite_brick_moss", Blocks.DIORITE);
    public static final Block BLOCK_DIORITE_BRICK_CRACKED = new BlockBlock(MODID, "block_diorite_brick_cracked", Blocks.DIORITE);
    public static final Block SLABS_DIORITE_BRICK_CRACKED = new BlockSlabs(MODID, "slabs_diorite_brick_cracked", Blocks.DIORITE);
    public static final Block STAIR_DIORITE_BRICK_CRACKED = new BlockStair(MODID, "stair_diorite_brick_cracked", Blocks.DIORITE);
    public static final Block WALLS_DIORITE_BRICK_CRACKED = new BlockWalls(MODID, "walls_diorite_brick_cracked", Blocks.DIORITE);
    public static final Block BLOCK_DIORITE_BRICK_CARVED  = new BlockBlock(MODID, "block_diorite_brick_carved", Blocks.DIORITE);
    public static final Block BLOCK_DIORITE_PILLAR = new BlockPillar(MODID, "block_diorite_pillar", Blocks.DIORITE);

    // Vanilla:         BLOCK_ANDESITE_STONE                           BlockAndesiteStone
    public static final Block SLABS_ANDESITE_STONE         = new BlockSlabs(MODID, "slabs_andesite_stone", Blocks.ANDESITE);
    public static final Block STAIR_ANDESITE_STONE         = new BlockStair(MODID, "stair_andesite_stone", Blocks.ANDESITE);
    public static final Block WALLS_ANDESITE_STONE         = new BlockWalls(MODID, "walls_andesite_stone", Blocks.ANDESITE);
    public static final Block BLOCK_ANDESITE_COBBLE        = new BlockBlock(MODID, "block_andesite_cobble", Blocks.ANDESITE);
    public static final Block SLABS_ANDESITE_COBBLE        = new BlockSlabs(MODID, "slabs_andesite_cobble", Blocks.ANDESITE);
    public static final Block STAIR_ANDESITE_COBBLE        = new BlockStair(MODID, "stair_andesite_cobble", Blocks.ANDESITE);
    public static final Block WALLS_ANDESITE_COBBLE        = new BlockWalls(MODID, "walls_andesite_cobble", Blocks.ANDESITE);
    public static final Block BLOCK_ANDESITE_COBBLE_MOSS   = new BlockBlock(MODID, "block_andesite_cobble_moss", Blocks.ANDESITE);
    public static final Block SLABS_ANDESITE_COBBLE_MOSS   = new BlockSlabs(MODID, "slabs_andesite_cobble_moss", Blocks.ANDESITE);
    public static final Block STAIR_ANDESITE_COBBLE_MOSS   = new BlockStair(MODID, "stair_andesite_cobble_moss", Blocks.ANDESITE);
    public static final Block WALLS_ANDESITE_COBBLE_MOSS   = new BlockWalls(MODID, "walls_andesite_cobble_moss", Blocks.ANDESITE);
    // Vanilla:   final       BLOCK_ANDESITE_SMOOTH                          BlockAndesiteSmooth
    public static final Block SLABS_ANDESITE_SMOOTH        = new BlockSlabs(MODID, "slabs_andesite_smooth", Blocks.ANDESITE);
    public static final Block STAIR_ANDESITE_SMOOTH        = new BlockStair(MODID, "stair_andesite_smooth", Blocks.ANDESITE);
    public static final Block WALLS_ANDESITE_SMOOTH        = new BlockWalls(MODID, "walls_andesite_smooth", Blocks.ANDESITE);
    public static final Block BLOCK_ANDESITE_BRICK         = new BlockBlock(MODID, "block_andesite_brick", Blocks.ANDESITE);
    public static final Block SLABS_ANDESITE_BRICK         = new BlockSlabs(MODID, "slabs_andesite_brick", Blocks.ANDESITE);
    public static final Block STAIR_ANDESITE_BRICK         = new BlockStair(MODID, "stair_andesite_brick", Blocks.ANDESITE);
    public static final Block WALLS_ANDESITE_BRICK         = new BlockWalls(MODID, "walls_andesite_brick", Blocks.ANDESITE);
    public static final Block BLOCK_ANDESITE_BRICK_MOSS    = new BlockBlock(MODID, "block_andesite_brick_moss", Blocks.ANDESITE);
    public static final Block SLABS_ANDESITE_BRICK_MOSS    = new BlockSlabs(MODID, "slabs_andesite_brick_moss", Blocks.ANDESITE);
    public static final Block STAIR_ANDESITE_BRICK_MOSS    = new BlockStair(MODID, "stair_andesite_brick_moss", Blocks.ANDESITE);
    public static final Block WALLS_ANDESITE_BRICK_MOSS    = new BlockWalls(MODID, "walls_andesite_brick_moss", Blocks.ANDESITE);
    public static final Block BLOCK_ANDESITE_BRICK_CRACKED = new BlockBlock(MODID, "block_andesite_brick_cracked", Blocks.ANDESITE);
    public static final Block SLABS_ANDESITE_BRICK_CRACKED = new BlockSlabs(MODID, "slabs_andesite_brick_cracked", Blocks.ANDESITE);
    public static final Block STAIR_ANDESITE_BRICK_CRACKED = new BlockStair(MODID, "stair_andesite_brick_cracked", Blocks.ANDESITE);
    public static final Block WALLS_ANDESITE_BRICK_CRACKED = new BlockWalls(MODID, "walls_andesite_brick_cracked", Blocks.ANDESITE);
    public static final Block BLOCK_ANDESITE_BRICK_CARVED  = new BlockBlock(MODID, "block_andesite_brick_carved", Blocks.ANDESITE);
    public static final Block BLOCK_ANDESITE_PILLAR       = new BlockPillar(MODID, "block_andesite_pillar", Blocks.ANDESITE);

    public static final Block SLABS_PRISMARINE_STONE = new BlockSlabs(MODID, "slabs_prismarine_stone", Blocks.PRISMARINE);
    public static final Block STAIR_PRISMARINE_STONE = new BlockStair(MODID, "stair_prismarine_stone", Blocks.PRISMARINE);
    public static final Block WALLS_PRISMARINE_STONE = new BlockWalls(MODID, "walls_prismarine_stone", Blocks.PRISMARINE);
    public static final Block SLABS_PRISMARINE_BRICK = new BlockSlabs(MODID, "slabs_prismarine_brick", Blocks.PRISMARINE);
    public static final Block STAIR_PRISMARINE_BRICK = new BlockStair(MODID, "stair_prismarine_brick", Blocks.PRISMARINE);
    public static final Block WALLS_PRISMARINE_BRICK = new BlockWalls(MODID, "walls_prismarine_brick", Blocks.PRISMARINE);
    public static final Block SLABS_PRISMARINE_DARK  = new BlockSlabs(MODID, "slabs_prismarine_dark", Blocks.PRISMARINE);
    public static final Block STAIR_PRISMARINE_DARK  = new BlockStair(MODID, "stair_prismarine_dark", Blocks.PRISMARINE);
    public static final Block WALLS_PRISMARINE_DARK  = new BlockWalls(MODID, "walls_prismarine_dark", Blocks.PRISMARINE);

    // Vanilla:         BLOCK_END_STONE                           BlockEndStone
    public static final Block SLABS_END_STONE         = new BlockSlabs(MODID, "slabs_end_stone", Blocks.END_STONE);
    public static final Block STAIR_END_STONE         = new BlockStair(MODID, "stair_end_stone", Blocks.END_STONE);
    public static final Block WALLS_END_STONE         = new BlockWalls(MODID, "walls_end_stone", Blocks.END_STONE);
    public static final Block BLOCK_END_COBBLE        = new BlockBlock(MODID, "block_end_cobble", Blocks.END_STONE);
    public static final Block SLABS_END_COBBLE        = new BlockSlabs(MODID, "slabs_end_cobble", Blocks.END_STONE);
    public static final Block STAIR_END_COBBLE        = new BlockStair(MODID, "stair_end_cobble", Blocks.END_STONE);
    public static final Block WALLS_END_COBBLE        = new BlockWalls(MODID, "walls_end_cobble", Blocks.END_STONE);
    public static final Block BLOCK_END_COBBLE_MOSS   = new BlockBlock(MODID, "block_end_cobble_moss", Blocks.END_STONE);
    public static final Block SLABS_END_COBBLE_MOSS   = new BlockSlabs(MODID, "slabs_end_cobble_moss", Blocks.END_STONE);
    public static final Block STAIR_END_COBBLE_MOSS   = new BlockStair(MODID, "stair_end_cobble_moss", Blocks.END_STONE);
    public static final Block WALLS_END_COBBLE_MOSS   = new BlockWalls(MODID, "walls_end_cobble_moss", Blocks.END_STONE);
    public static final Block BLOCK_END_SMOOTH        = new BlockBlock(MODID, "block_end_smooth", Blocks.END_STONE);
    public static final Block SLABS_END_SMOOTH        = new BlockSlabs(MODID, "slabs_end_smooth", Blocks.END_STONE);
    public static final Block STAIR_END_SMOOTH        = new BlockStair(MODID, "stair_end_smooth", Blocks.END_STONE);
    public static final Block WALLS_END_SMOOTH        = new BlockWalls(MODID, "walls_end_smooth", Blocks.END_STONE);
    // Vanilla:   final       BLOCK_END_BRICK                           BlockEndBrick
    public static final Block SLABS_END_BRICK         = new BlockSlabs(MODID, "slabs_end_brick", Blocks.END_STONE);
    public static final Block STAIR_END_BRICK         = new BlockStair(MODID, "stair_end_brick", Blocks.END_STONE);
    public static final Block WALLS_END_BRICK         = new BlockWalls(MODID, "walls_end_brick", Blocks.END_STONE);
    public static final Block BLOCK_END_BRICK_MOSS    = new BlockBlock(MODID, "block_end_brick_moss", Blocks.END_STONE);
    public static final Block SLABS_END_BRICK_MOSS    = new BlockSlabs(MODID, "slabs_end_brick_moss", Blocks.END_STONE);
    public static final Block STAIR_END_BRICK_MOSS    = new BlockStair(MODID, "stair_end_brick_moss", Blocks.END_STONE);
    public static final Block WALLS_END_BRICK_MOSS    = new BlockWalls(MODID, "walls_end_brick_moss", Blocks.END_STONE);
    public static final Block BLOCK_END_BRICK_CRACKED = new BlockBlock(MODID, "block_end_brick_cracked", Blocks.END_STONE);
    public static final Block SLABS_END_BRICK_CRACKED = new BlockSlabs(MODID, "slabs_end_brick_cracked", Blocks.END_STONE);
    public static final Block STAIR_END_BRICK_CRACKED = new BlockStair(MODID, "stair_end_brick_cracked", Blocks.END_STONE);
    public static final Block WALLS_END_BRICK_CRACKED = new BlockWalls(MODID, "walls_end_brick_cracked", Blocks.END_STONE);
    public static final Block BLOCK_END_BRICK_CARVED  = new BlockBlock(MODID, "block_end_brick_carved", Blocks.END_STONE);
    public static final Block BLOCK_END_PILLAR       = new BlockPillar(MODID, "block_end_pillar", Blocks.END_STONE);

    public static final Block SLABS_REDNETHER_BRICK = new BlockSlabs(MODID, "slabs_rednether_brick", Blocks.RED_NETHER_BRICKS);
    public static final Block STAIR_REDNETHER_BRICK = new BlockStair(MODID, "stair_rednether_brick", Blocks.RED_NETHER_BRICKS);
    public static final Block WALLS_REDNETHER_BRICK = new BlockWalls(MODID, "walls_rednether_brick", Blocks.RED_NETHER_BRICKS);

    // Vanilla:         BLOCK_OBSIDIAN_STONE                     BLOCK_OBSIDIAN_stone
    public static final Block SLABS_OBSIDIAN_STONE  = new BlockSlabs(MODID, "slabs_obsidian_stone", Blocks.OBSIDIAN);
    public static final Block STAIR_OBSIDIAN_STONE  = new BlockStair(MODID, "stair_obsidian_stone", Blocks.OBSIDIAN);
    public static final Block WALLS_OBSIDIAN_STONE  = new BlockWalls(MODID, "walls_obsidian_stone", Blocks.OBSIDIAN);
    public static final Block BLOCK_OBSIDIAN_SMOOTH = new BlockBlock(MODID, "block_obsidian_smooth", Blocks.OBSIDIAN);
    public static final Block SLABS_OBSIDIAN_SMOOTH = new BlockSlabs(MODID, "slabs_obsidian_smooth", Blocks.OBSIDIAN);
    public static final Block STAIR_OBSIDIAN_SMOOTH = new BlockStair(MODID, "stair_obsidian_smooth", Blocks.OBSIDIAN);
    public static final Block WALLS_OBSIDIAN_SMOOTH = new BlockWalls(MODID, "walls_obsidian_smooth", Blocks.OBSIDIAN);
    public static final Block BLOCK_OBSIDIAN_CARVED = new BlockBlock(MODID, "block_obsidian_carved", Blocks.OBSIDIAN);
    public static final Block BLOCK_OBSIDIAN_PILLAR= new BlockPillar(MODID, "block_obsidian_pillar", Blocks.OBSIDIAN);

    public static final Block SLABS_CONCRETE_WHITE     = new BlockSlabs(MODID, "slabs_concrete_white", Blocks.WHITE_CONCRETE);
    public static final Block STAIR_CONCRETE_WHITE     = new BlockStair(MODID, "stair_concrete_white", Blocks.WHITE_CONCRETE);
    public static final Block WALLS_CONCRETE_WHITE     = new BlockWalls(MODID, "walls_concrete_white", Blocks.WHITE_CONCRETE);
    public static final Block SLABS_CONCRETE_ORANGE    = new BlockSlabs(MODID, "slabs_concrete_orange", Blocks.ORANGE_CONCRETE);
    public static final Block STAIR_CONCRETE_ORANGE    = new BlockStair(MODID, "stair_concrete_orange", Blocks.ORANGE_CONCRETE);
    public static final Block WALLS_CONCRETE_ORANGE    = new BlockWalls(MODID, "walls_concrete_orange", Blocks.ORANGE_CONCRETE);
    public static final Block SLABS_CONCRETE_MAGENTA   = new BlockSlabs(MODID, "slabs_concrete_magenta", Blocks.MAGENTA_CONCRETE);
    public static final Block STAIR_CONCRETE_MAGENTA   = new BlockStair(MODID, "stair_concrete_magenta", Blocks.MAGENTA_CONCRETE);
    public static final Block WALLS_CONCRETE_MAGENTA   = new BlockWalls(MODID, "walls_concrete_magenta", Blocks.MAGENTA_CONCRETE);
    public static final Block SLABS_CONCRETE_LIGHTBLUE = new BlockSlabs(MODID, "slabs_concrete_lightblue", Blocks.LIGHT_BLUE_CONCRETE);
    public static final Block STAIR_CONCRETE_LIGHTBLUE = new BlockStair(MODID, "stair_concrete_lightblue", Blocks.LIGHT_BLUE_CONCRETE);
    public static final Block WALLS_CONCRETE_LIGHTBLUE = new BlockWalls(MODID, "walls_concrete_lightblue", Blocks.LIGHT_BLUE_CONCRETE);
    public static final Block SLABS_CONCRETE_YELLOW    = new BlockSlabs(MODID, "slabs_concrete_yellow", Blocks.YELLOW_CONCRETE);
    public static final Block STAIR_CONCRETE_YELLOW    = new BlockStair(MODID, "stair_concrete_yellow", Blocks.YELLOW_CONCRETE);
    public static final Block WALLS_CONCRETE_YELLOW    = new BlockWalls(MODID, "walls_concrete_yellow", Blocks.YELLOW_CONCRETE);
    public static final Block SLABS_CONCRETE_LIME      = new BlockSlabs(MODID, "slabs_concrete_lime", Blocks.LIME_CONCRETE);
    public static final Block STAIR_CONCRETE_LIME      = new BlockStair(MODID, "stair_concrete_lime", Blocks.LIME_CONCRETE);
    public static final Block WALLS_CONCRETE_LIME      = new BlockWalls(MODID, "walls_concrete_lime", Blocks.LIME_CONCRETE);
    public static final Block SLABS_CONCRETE_PINK      = new BlockSlabs(MODID, "slabs_concrete_pink", Blocks.PINK_CONCRETE);
    public static final Block STAIR_CONCRETE_PINK      = new BlockStair(MODID, "stair_concrete_pink", Blocks.PINK_CONCRETE);
    public static final Block WALLS_CONCRETE_PINK      = new BlockWalls(MODID, "walls_concrete_pink", Blocks.PINK_CONCRETE);
    public static final Block SLABS_CONCRETE_GRAY      = new BlockSlabs(MODID, "slabs_concrete_gray", Blocks.GRAY_CONCRETE);
    public static final Block STAIR_CONCRETE_GRAY      = new BlockStair(MODID, "stair_concrete_gray", Blocks.GRAY_CONCRETE);
    public static final Block WALLS_CONCRETE_GRAY      = new BlockWalls(MODID, "walls_concrete_gray", Blocks.GRAY_CONCRETE);
    public static final Block SLABS_CONCRETE_SILVER    = new BlockSlabs(MODID, "slabs_concrete_silver", Blocks.LIGHT_GRAY_CONCRETE);
    public static final Block STAIR_CONCRETE_SILVER    = new BlockStair(MODID, "stair_concrete_silver", Blocks.LIGHT_GRAY_CONCRETE);
    public static final Block WALLS_CONCRETE_SILVER    = new BlockWalls(MODID, "walls_concrete_silver", Blocks.LIGHT_GRAY_CONCRETE);
    public static final Block SLABS_CONCRETE_CYAN      = new BlockSlabs(MODID, "slabs_concrete_cyan", Blocks.CYAN_CONCRETE);
    public static final Block STAIR_CONCRETE_CYAN      = new BlockStair(MODID, "stair_concrete_cyan", Blocks.CYAN_CONCRETE);
    public static final Block WALLS_CONCRETE_CYAN      = new BlockWalls(MODID, "walls_concrete_cyan", Blocks.CYAN_CONCRETE);
    public static final Block SLABS_CONCRETE_PURPLE    = new BlockSlabs(MODID, "slabs_concrete_purple", Blocks.PURPLE_CONCRETE);
    public static final Block STAIR_CONCRETE_PURPLE    = new BlockStair(MODID, "stair_concrete_purple", Blocks.PURPLE_CONCRETE);
    public static final Block WALLS_CONCRETE_PURPLE    = new BlockWalls(MODID, "walls_concrete_purple", Blocks.PURPLE_CONCRETE);
    public static final Block SLABS_CONCRETE_BLUE      = new BlockSlabs(MODID, "slabs_concrete_blue", Blocks.BLUE_CONCRETE);
    public static final Block STAIR_CONCRETE_BLUE      = new BlockStair(MODID, "stair_concrete_blue", Blocks.BLUE_CONCRETE);
    public static final Block WALLS_CONCRETE_BLUE      = new BlockWalls(MODID, "walls_concrete_blue", Blocks.BLUE_CONCRETE);
    public static final Block SLABS_CONCRETE_BROWN     = new BlockSlabs(MODID, "slabs_concrete_brown", Blocks.BROWN_CONCRETE);
    public static final Block STAIR_CONCRETE_BROWN     = new BlockStair(MODID, "stair_concrete_brown", Blocks.BROWN_CONCRETE);
    public static final Block WALLS_CONCRETE_BROWN     = new BlockWalls(MODID, "walls_concrete_brown", Blocks.BROWN_CONCRETE);
    public static final Block SLABS_CONCRETE_GREEN     = new BlockSlabs(MODID, "slabs_concrete_green", Blocks.GREEN_CONCRETE);
    public static final Block STAIR_CONCRETE_GREEN     = new BlockStair(MODID, "stair_concrete_green", Blocks.GREEN_CONCRETE);
    public static final Block WALLS_CONCRETE_GREEN     = new BlockWalls(MODID, "walls_concrete_green", Blocks.GREEN_CONCRETE);
    public static final Block SLABS_CONCRETE_RED       = new BlockSlabs(MODID, "slabs_concrete_red", Blocks.RED_CONCRETE);
    public static final Block STAIR_CONCRETE_RED       = new BlockStair(MODID, "stair_concrete_red", Blocks.RED_CONCRETE);
    public static final Block WALLS_CONCRETE_RED       = new BlockWalls(MODID, "walls_concrete_red", Blocks.RED_CONCRETE);
    public static final Block SLABS_CONCRETE_BLACK     = new BlockSlabs(MODID, "slabs_concrete_black", Blocks.BLACK_CONCRETE);
    public static final Block STAIR_CONCRETE_BLACK     = new BlockStair(MODID, "stair_concrete_black", Blocks.BLACK_CONCRETE);
    public static final Block WALLS_CONCRETE_BLACK     = new BlockWalls(MODID, "walls_concrete_black", Blocks.BLACK_CONCRETE);

    public static final Block BLOCK_TIMBER_BASIC_WHITE     = new BlockBlock(MODID, "timber_basic_white",     Blocks.WHITE_TERRACOTTA);
    public static final Block BLOCK_TIMBER_BASIC_ORANGE    = new BlockBlock(MODID, "timber_basic_orange",    Blocks.ORANGE_TERRACOTTA);
    public static final Block BLOCK_TIMBER_BASIC_MAGENTA   = new BlockBlock(MODID, "timber_basic_magenta",   Blocks.MAGENTA_TERRACOTTA);
    public static final Block BLOCK_TIMBER_BASIC_LIGHTBLUE = new BlockBlock(MODID, "timber_basic_lightblue", Blocks.LIGHT_BLUE_TERRACOTTA);
    public static final Block BLOCK_TIMBER_BASIC_YELLOW    = new BlockBlock(MODID, "timber_basic_yellow",    Blocks.YELLOW_TERRACOTTA);
    public static final Block BLOCK_TIMBER_BASIC_LIME      = new BlockBlock(MODID, "timber_basic_lime",      Blocks.LIME_TERRACOTTA);
    public static final Block BLOCK_TIMBER_BASIC_PINK      = new BlockBlock(MODID, "timber_basic_pink",      Blocks.PINK_TERRACOTTA);
    public static final Block BLOCK_TIMBER_BASIC_GRAY      = new BlockBlock(MODID, "timber_basic_gray",      Blocks.GRAY_TERRACOTTA);
    public static final Block BLOCK_TIMBER_BASIC_SILVER    = new BlockBlock(MODID, "timber_basic_silver",    Blocks.LIGHT_BLUE_TERRACOTTA);
    public static final Block BLOCK_TIMBER_BASIC_CYAN      = new BlockBlock(MODID, "timber_basic_cyan",      Blocks.CYAN_TERRACOTTA);
    public static final Block BLOCK_TIMBER_BASIC_PURPLE    = new BlockBlock(MODID, "timber_basic_purple",    Blocks.PURPLE_TERRACOTTA);
    public static final Block BLOCK_TIMBER_BASIC_BLUE      = new BlockBlock(MODID, "timber_basic_blue",      Blocks.BLUE_TERRACOTTA);
    public static final Block BLOCK_TIMBER_BASIC_BROWN     = new BlockBlock(MODID, "timber_basic_brown",     Blocks.BROWN_TERRACOTTA);
    public static final Block BLOCK_TIMBER_BASIC_GREEN     = new BlockBlock(MODID, "timber_basic_green",     Blocks.GREEN_TERRACOTTA);
    public static final Block BLOCK_TIMBER_BASIC_RED       = new BlockBlock(MODID, "timber_basic_red",       Blocks.RED_TERRACOTTA);
    public static final Block BLOCK_TIMBER_BASIC_BLACK     = new BlockBlock(MODID, "timber_basic_black",     Blocks.BLACK_TERRACOTTA);

    public static final Block BLOCK_TIMBER_HORIZONTAL_WHITE     = new BlockBlock(MODID, "timber_horizontal_white",     Blocks.WHITE_TERRACOTTA);
    public static final Block BLOCK_TIMBER_HORIZONTAL_ORANGE    = new BlockBlock(MODID, "timber_horizontal_orange",    Blocks.ORANGE_TERRACOTTA);
    public static final Block BLOCK_TIMBER_HORIZONTAL_MAGENTA   = new BlockBlock(MODID, "timber_horizontal_magenta",   Blocks.MAGENTA_TERRACOTTA);
    public static final Block BLOCK_TIMBER_HORIZONTAL_LIGHTBLUE = new BlockBlock(MODID, "timber_horizontal_lightblue", Blocks.LIGHT_BLUE_TERRACOTTA);
    public static final Block BLOCK_TIMBER_HORIZONTAL_YELLOW    = new BlockBlock(MODID, "timber_horizontal_yellow",    Blocks.YELLOW_TERRACOTTA);
    public static final Block BLOCK_TIMBER_HORIZONTAL_LIME      = new BlockBlock(MODID, "timber_horizontal_lime",      Blocks.LIME_TERRACOTTA);
    public static final Block BLOCK_TIMBER_HORIZONTAL_PINK      = new BlockBlock(MODID, "timber_horizontal_pink",      Blocks.PINK_TERRACOTTA);
    public static final Block BLOCK_TIMBER_HORIZONTAL_GRAY      = new BlockBlock(MODID, "timber_horizontal_gray",      Blocks.GRAY_TERRACOTTA);
    public static final Block BLOCK_TIMBER_HORIZONTAL_SILVER    = new BlockBlock(MODID, "timber_horizontal_silver",    Blocks.LIGHT_BLUE_TERRACOTTA);
    public static final Block BLOCK_TIMBER_HORIZONTAL_CYAN      = new BlockBlock(MODID, "timber_horizontal_cyan",      Blocks.CYAN_TERRACOTTA);
    public static final Block BLOCK_TIMBER_HORIZONTAL_PURPLE    = new BlockBlock(MODID, "timber_horizontal_purple",    Blocks.PURPLE_TERRACOTTA);
    public static final Block BLOCK_TIMBER_HORIZONTAL_BLUE      = new BlockBlock(MODID, "timber_horizontal_blue",      Blocks.BLUE_TERRACOTTA);
    public static final Block BLOCK_TIMBER_HORIZONTAL_BROWN     = new BlockBlock(MODID, "timber_horizontal_brown",     Blocks.BROWN_TERRACOTTA);
    public static final Block BLOCK_TIMBER_HORIZONTAL_GREEN     = new BlockBlock(MODID, "timber_horizontal_green",     Blocks.GREEN_TERRACOTTA);
    public static final Block BLOCK_TIMBER_HORIZONTAL_RED       = new BlockBlock(MODID, "timber_horizontal_red",       Blocks.RED_TERRACOTTA);
    public static final Block BLOCK_TIMBER_HORIZONTAL_BLACK     = new BlockBlock(MODID, "timber_horizontal_black",     Blocks.BLACK_TERRACOTTA);

    public static final Block BLOCK_TIMBER_VERTICAL_WHITE     = new BlockBlock(MODID, "timber_vertical_white",     Blocks.WHITE_TERRACOTTA);
    public static final Block BLOCK_TIMBER_VERTICAL_ORANGE    = new BlockBlock(MODID, "timber_vertical_orange",    Blocks.ORANGE_TERRACOTTA);
    public static final Block BLOCK_TIMBER_VERTICAL_MAGENTA   = new BlockBlock(MODID, "timber_vertical_magenta",   Blocks.MAGENTA_TERRACOTTA);
    public static final Block BLOCK_TIMBER_VERTICAL_LIGHTBLUE = new BlockBlock(MODID, "timber_vertical_lightblue", Blocks.LIGHT_BLUE_TERRACOTTA);
    public static final Block BLOCK_TIMBER_VERTICAL_YELLOW    = new BlockBlock(MODID, "timber_vertical_yellow",    Blocks.YELLOW_TERRACOTTA);
    public static final Block BLOCK_TIMBER_VERTICAL_LIME      = new BlockBlock(MODID, "timber_vertical_lime",      Blocks.LIME_TERRACOTTA);
    public static final Block BLOCK_TIMBER_VERTICAL_PINK      = new BlockBlock(MODID, "timber_vertical_pink",      Blocks.PINK_TERRACOTTA);
    public static final Block BLOCK_TIMBER_VERTICAL_GRAY      = new BlockBlock(MODID, "timber_vertical_gray",      Blocks.GRAY_TERRACOTTA);
    public static final Block BLOCK_TIMBER_VERTICAL_SILVER    = new BlockBlock(MODID, "timber_vertical_silver",    Blocks.LIGHT_BLUE_TERRACOTTA);
    public static final Block BLOCK_TIMBER_VERTICAL_CYAN      = new BlockBlock(MODID, "timber_vertical_cyan",      Blocks.CYAN_TERRACOTTA);
    public static final Block BLOCK_TIMBER_VERTICAL_PURPLE    = new BlockBlock(MODID, "timber_vertical_purple",    Blocks.PURPLE_TERRACOTTA);
    public static final Block BLOCK_TIMBER_VERTICAL_BLUE      = new BlockBlock(MODID, "timber_vertical_blue",      Blocks.BLUE_TERRACOTTA);
    public static final Block BLOCK_TIMBER_VERTICAL_BROWN     = new BlockBlock(MODID, "timber_vertical_brown",     Blocks.BROWN_TERRACOTTA);
    public static final Block BLOCK_TIMBER_VERTICAL_GREEN     = new BlockBlock(MODID, "timber_vertical_green",     Blocks.GREEN_TERRACOTTA);
    public static final Block BLOCK_TIMBER_VERTICAL_RED       = new BlockBlock(MODID, "timber_vertical_red",       Blocks.RED_TERRACOTTA);
    public static final Block BLOCK_TIMBER_VERTICAL_BLACK     = new BlockBlock(MODID, "timber_vertical_black",     Blocks.BLACK_TERRACOTTA);

    public static final Block BLOCK_TIMBER_PLUS_WHITE     = new BlockBlock(MODID, "timber_plus_white",     Blocks.WHITE_TERRACOTTA);
    public static final Block BLOCK_TIMBER_PLUS_ORANGE    = new BlockBlock(MODID, "timber_plus_orange",    Blocks.ORANGE_TERRACOTTA);
    public static final Block BLOCK_TIMBER_PLUS_MAGENTA   = new BlockBlock(MODID, "timber_plus_magenta",   Blocks.MAGENTA_TERRACOTTA);
    public static final Block BLOCK_TIMBER_PLUS_LIGHTBLUE = new BlockBlock(MODID, "timber_plus_lightblue", Blocks.LIGHT_BLUE_TERRACOTTA);
    public static final Block BLOCK_TIMBER_PLUS_YELLOW    = new BlockBlock(MODID, "timber_plus_yellow",    Blocks.YELLOW_TERRACOTTA);
    public static final Block BLOCK_TIMBER_PLUS_LIME      = new BlockBlock(MODID, "timber_plus_lime",      Blocks.LIME_TERRACOTTA);
    public static final Block BLOCK_TIMBER_PLUS_PINK      = new BlockBlock(MODID, "timber_plus_pink",      Blocks.PINK_TERRACOTTA);
    public static final Block BLOCK_TIMBER_PLUS_GRAY      = new BlockBlock(MODID, "timber_plus_gray",      Blocks.GRAY_TERRACOTTA);
    public static final Block BLOCK_TIMBER_PLUS_SILVER    = new BlockBlock(MODID, "timber_plus_silver",    Blocks.LIGHT_BLUE_TERRACOTTA);
    public static final Block BLOCK_TIMBER_PLUS_CYAN      = new BlockBlock(MODID, "timber_plus_cyan",      Blocks.CYAN_TERRACOTTA);
    public static final Block BLOCK_TIMBER_PLUS_PURPLE    = new BlockBlock(MODID, "timber_plus_purple",    Blocks.PURPLE_TERRACOTTA);
    public static final Block BLOCK_TIMBER_PLUS_BLUE      = new BlockBlock(MODID, "timber_plus_blue",      Blocks.BLUE_TERRACOTTA);
    public static final Block BLOCK_TIMBER_PLUS_BROWN     = new BlockBlock(MODID, "timber_plus_brown",     Blocks.BROWN_TERRACOTTA);
    public static final Block BLOCK_TIMBER_PLUS_GREEN     = new BlockBlock(MODID, "timber_plus_green",     Blocks.GREEN_TERRACOTTA);
    public static final Block BLOCK_TIMBER_PLUS_RED       = new BlockBlock(MODID, "timber_plus_red",       Blocks.RED_TERRACOTTA);
    public static final Block BLOCK_TIMBER_PLUS_BLACK     = new BlockBlock(MODID, "timber_plus_black",     Blocks.BLACK_TERRACOTTA);

    public static final Block BLOCK_TIMBER_DIAG_LEFT_WHITE     = new BlockBlock(MODID, "timber_diag_left_white",     Blocks.WHITE_TERRACOTTA);
    public static final Block BLOCK_TIMBER_DIAG_LEFT_ORANGE    = new BlockBlock(MODID, "timber_diag_left_orange",    Blocks.ORANGE_TERRACOTTA);
    public static final Block BLOCK_TIMBER_DIAG_LEFT_MAGENTA   = new BlockBlock(MODID, "timber_diag_left_magenta",   Blocks.MAGENTA_TERRACOTTA);
    public static final Block BLOCK_TIMBER_DIAG_LEFT_LIGHTBLUE = new BlockBlock(MODID, "timber_diag_left_lightblue", Blocks.LIGHT_BLUE_TERRACOTTA);
    public static final Block BLOCK_TIMBER_DIAG_LEFT_YELLOW    = new BlockBlock(MODID, "timber_diag_left_yellow",    Blocks.YELLOW_TERRACOTTA);
    public static final Block BLOCK_TIMBER_DIAG_LEFT_LIME      = new BlockBlock(MODID, "timber_diag_left_lime",      Blocks.LIME_TERRACOTTA);
    public static final Block BLOCK_TIMBER_DIAG_LEFT_PINK      = new BlockBlock(MODID, "timber_diag_left_pink",      Blocks.PINK_TERRACOTTA);
    public static final Block BLOCK_TIMBER_DIAG_LEFT_GRAY      = new BlockBlock(MODID, "timber_diag_left_gray",      Blocks.GRAY_TERRACOTTA);
    public static final Block BLOCK_TIMBER_DIAG_LEFT_SILVER    = new BlockBlock(MODID, "timber_diag_left_silver",    Blocks.LIGHT_BLUE_TERRACOTTA);
    public static final Block BLOCK_TIMBER_DIAG_LEFT_CYAN      = new BlockBlock(MODID, "timber_diag_left_cyan",      Blocks.CYAN_TERRACOTTA);
    public static final Block BLOCK_TIMBER_DIAG_LEFT_PURPLE    = new BlockBlock(MODID, "timber_diag_left_purple",    Blocks.PURPLE_TERRACOTTA);
    public static final Block BLOCK_TIMBER_DIAG_LEFT_BLUE      = new BlockBlock(MODID, "timber_diag_left_blue",      Blocks.BLUE_TERRACOTTA);
    public static final Block BLOCK_TIMBER_DIAG_LEFT_BROWN     = new BlockBlock(MODID, "timber_diag_left_brown",     Blocks.BROWN_TERRACOTTA);
    public static final Block BLOCK_TIMBER_DIAG_LEFT_GREEN     = new BlockBlock(MODID, "timber_diag_left_green",     Blocks.GREEN_TERRACOTTA);
    public static final Block BLOCK_TIMBER_DIAG_LEFT_RED       = new BlockBlock(MODID, "timber_diag_left_red",       Blocks.RED_TERRACOTTA);
    public static final Block BLOCK_TIMBER_DIAG_LEFT_BLACK     = new BlockBlock(MODID, "timber_diag_left_black",     Blocks.BLACK_TERRACOTTA);

    public static final Block BLOCK_TIMBER_DIAG_RIGHT_WHITE     = new BlockBlock(MODID, "timber_diag_right_white",     Blocks.WHITE_TERRACOTTA);
    public static final Block BLOCK_TIMBER_DIAG_RIGHT_ORANGE    = new BlockBlock(MODID, "timber_diag_right_orange",    Blocks.ORANGE_TERRACOTTA);
    public static final Block BLOCK_TIMBER_DIAG_RIGHT_MAGENTA   = new BlockBlock(MODID, "timber_diag_right_magenta",   Blocks.MAGENTA_TERRACOTTA);
    public static final Block BLOCK_TIMBER_DIAG_RIGHT_LIGHTBLUE = new BlockBlock(MODID, "timber_diag_right_lightblue", Blocks.LIGHT_BLUE_TERRACOTTA);
    public static final Block BLOCK_TIMBER_DIAG_RIGHT_YELLOW    = new BlockBlock(MODID, "timber_diag_right_yellow",    Blocks.YELLOW_TERRACOTTA);
    public static final Block BLOCK_TIMBER_DIAG_RIGHT_LIME      = new BlockBlock(MODID, "timber_diag_right_lime",      Blocks.LIME_TERRACOTTA);
    public static final Block BLOCK_TIMBER_DIAG_RIGHT_PINK      = new BlockBlock(MODID, "timber_diag_right_pink",      Blocks.PINK_TERRACOTTA);
    public static final Block BLOCK_TIMBER_DIAG_RIGHT_GRAY      = new BlockBlock(MODID, "timber_diag_right_gray",      Blocks.GRAY_TERRACOTTA);
    public static final Block BLOCK_TIMBER_DIAG_RIGHT_SILVER    = new BlockBlock(MODID, "timber_diag_right_silver",    Blocks.LIGHT_BLUE_TERRACOTTA);
    public static final Block BLOCK_TIMBER_DIAG_RIGHT_CYAN      = new BlockBlock(MODID, "timber_diag_right_cyan",      Blocks.CYAN_TERRACOTTA);
    public static final Block BLOCK_TIMBER_DIAG_RIGHT_PURPLE    = new BlockBlock(MODID, "timber_diag_right_purple",    Blocks.PURPLE_TERRACOTTA);
    public static final Block BLOCK_TIMBER_DIAG_RIGHT_BLUE      = new BlockBlock(MODID, "timber_diag_right_blue",      Blocks.BLUE_TERRACOTTA);
    public static final Block BLOCK_TIMBER_DIAG_RIGHT_BROWN     = new BlockBlock(MODID, "timber_diag_right_brown",     Blocks.BROWN_TERRACOTTA);
    public static final Block BLOCK_TIMBER_DIAG_RIGHT_GREEN     = new BlockBlock(MODID, "timber_diag_right_green",     Blocks.GREEN_TERRACOTTA);
    public static final Block BLOCK_TIMBER_DIAG_RIGHT_RED       = new BlockBlock(MODID, "timber_diag_right_red",       Blocks.RED_TERRACOTTA);
    public static final Block BLOCK_TIMBER_DIAG_RIGHT_BLACK     = new BlockBlock(MODID, "timber_diag_right_black",     Blocks.BLACK_TERRACOTTA);

    public static final Block BLOCK_TIMBER_CROSS_WHITE     = new BlockBlock(MODID, "timber_cross_white",     Blocks.WHITE_TERRACOTTA);
    public static final Block BLOCK_TIMBER_CROSS_ORANGE    = new BlockBlock(MODID, "timber_cross_orange",    Blocks.ORANGE_TERRACOTTA);
    public static final Block BLOCK_TIMBER_CROSS_MAGENTA   = new BlockBlock(MODID, "timber_cross_magenta",   Blocks.MAGENTA_TERRACOTTA);
    public static final Block BLOCK_TIMBER_CROSS_LIGHTBLUE = new BlockBlock(MODID, "timber_cross_lightblue", Blocks.LIGHT_BLUE_TERRACOTTA);
    public static final Block BLOCK_TIMBER_CROSS_YELLOW    = new BlockBlock(MODID, "timber_cross_yellow",    Blocks.YELLOW_TERRACOTTA);
    public static final Block BLOCK_TIMBER_CROSS_LIME      = new BlockBlock(MODID, "timber_cross_lime",      Blocks.LIME_TERRACOTTA);
    public static final Block BLOCK_TIMBER_CROSS_PINK      = new BlockBlock(MODID, "timber_cross_pink",      Blocks.PINK_TERRACOTTA);
    public static final Block BLOCK_TIMBER_CROSS_GRAY      = new BlockBlock(MODID, "timber_cross_gray",      Blocks.GRAY_TERRACOTTA);
    public static final Block BLOCK_TIMBER_CROSS_SILVER    = new BlockBlock(MODID, "timber_cross_silver",    Blocks.LIGHT_BLUE_TERRACOTTA);
    public static final Block BLOCK_TIMBER_CROSS_CYAN      = new BlockBlock(MODID, "timber_cross_cyan",      Blocks.CYAN_TERRACOTTA);
    public static final Block BLOCK_TIMBER_CROSS_PURPLE    = new BlockBlock(MODID, "timber_cross_purple",    Blocks.PURPLE_TERRACOTTA);
    public static final Block BLOCK_TIMBER_CROSS_BLUE      = new BlockBlock(MODID, "timber_cross_blue",      Blocks.BLUE_TERRACOTTA);
    public static final Block BLOCK_TIMBER_CROSS_BROWN     = new BlockBlock(MODID, "timber_cross_brown",     Blocks.BROWN_TERRACOTTA);
    public static final Block BLOCK_TIMBER_CROSS_GREEN     = new BlockBlock(MODID, "timber_cross_green",     Blocks.GREEN_TERRACOTTA);
    public static final Block BLOCK_TIMBER_CROSS_RED       = new BlockBlock(MODID, "timber_cross_red",       Blocks.RED_TERRACOTTA);
    public static final Block BLOCK_TIMBER_CROSS_BLACK     = new BlockBlock(MODID, "timber_cross_black",     Blocks.BLACK_TERRACOTTA);

    public static final Block BLOCK_SCAFFOLDING = new BlockScaffolding(MODID, "timber_scaffolding", Blocks.OAK_PLANKS);
    public static final Block BLOCK_CHAIN_IRON  = new BlockChain(MODID, "block_chain_iron", Blocks.IRON_BLOCK);
    public static final Block BLOCK_CHAIN_GOLD  = new BlockChain(MODID, "block_chain_gold", Blocks.GOLD_BLOCK);

    private static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();

    public static final ForgeConfigSpec.BooleanValue config_allowed_slabs        = BUILDER.comment("Block Types - Allow Slabs").define("config_allowed_slabs", true);
    public static final ForgeConfigSpec.BooleanValue config_allowed_stair        = BUILDER.comment("Block Types - Allow Stairs").define("config_allowed_stair", true);
    public static final ForgeConfigSpec.BooleanValue config_allowed_walls        = BUILDER.comment("Block Types - Allow Walls").define("config_allowed_walls", true);
    public static final ForgeConfigSpec.BooleanValue config_allowed_timber       = BUILDER.comment("Block Types - Allow Timber").define("config_allowed_timber", true);
    public static final ForgeConfigSpec.BooleanValue config_allowed_scaffolding  = BUILDER.comment("Block Types - Allow Scaffolding").define("config_allowed_scaffolding", true);
    public static final ForgeConfigSpec.BooleanValue config_allowed_verticalslab = BUILDER.comment("Block Types - Allow Vertical Slabs").define("config_allowed_verticalslab", true);
    public static final ForgeConfigSpec.BooleanValue config_allowed_chains       = BUILDER.comment("Block Types - Allow Chains").define("config_allowed_chains", true);
    public static final ForgeConfigSpec.BooleanValue config_extended_stone       = BUILDER.comment("Stone Variants - Extend Stone").define("config_extended_stone", true);
    public static final ForgeConfigSpec.BooleanValue config_extended_granite     = BUILDER.comment("Stone Variants - Extend Granite").define("config_extended_granite", true);
    public static final ForgeConfigSpec.BooleanValue config_extended_diorite     = BUILDER.comment("Stone Variants - Extend Diorite").define("config_extended_diorite", true);
    public static final ForgeConfigSpec.BooleanValue config_extended_andesite    = BUILDER.comment("Stone Variants - Extend Andesite").define("config_extended_andesite", true);
    public static final ForgeConfigSpec.BooleanValue config_extended_end         = BUILDER.comment("Stone Variants - Extend End").define("config_extended_end", true);
    public static final ForgeConfigSpec.BooleanValue config_extended_obsidian    = BUILDER.comment("Stone Variants - Extend Obsidian").define("config_extended_obsidian", true);

    /**Reads out Config File**/
    public static void loadConfig(Path file){
        SPEC.setConfig(CommentedFileConfig.builder(file).build());
    }

    public static final ForgeConfigSpec SPEC = BUILDER.build();

    /**Register all stuff, pre is true during preInit and false during Init**/
    public static void registerStuff(){
        /*// Vanilla:                                                  */ //       BLOCK_STONE_STONE
        /*// Vanilla:                                                  */ //       SLABS_STONE_STONE
        /*if(config_allowed_stair.get()                               )*/ Register.registerBlock(STAIR_STONE_STONE, ItemGroup.BUILDING_BLOCKS);
        /*if(config_allowed_walls.get()                               )*/ Register.registerBlock(WALLS_STONE_STONE, ItemGroup.BUILDING_BLOCKS);
        /*// Vanilla:                                                  */ //             BLOCK_STONE_COBBLE_MOSS
        /*if(config_allowed_slabs.get()                               )*/ Register.registerBlock(SLABS_STONE_COBBLE_MOSS, ItemGroup.BUILDING_BLOCKS);
        /*if(config_allowed_stair.get()                               )*/ Register.registerBlock(STAIR_STONE_COBBLE_MOSS, ItemGroup.BUILDING_BLOCKS);
        /*// Vanilla:                                                  */ //       WALLS_STONE_COBBLE_MOSS
        /*if(                              config_extended_stone.get())*/ Register.registerBlock(BLOCK_STONE_SMOOTH, ItemGroup.BUILDING_BLOCKS);
        /*if(config_allowed_slabs.get() && config_extended_stone.get())*/ Register.registerBlock(SLABS_STONE_SMOOTH, ItemGroup.BUILDING_BLOCKS);
        /*if(config_allowed_stair.get() && config_extended_stone.get())*/ Register.registerBlock(STAIR_STONE_SMOOTH, ItemGroup.BUILDING_BLOCKS);
        /*if(config_allowed_walls.get() && config_extended_stone.get())*/ Register.registerBlock(WALLS_STONE_SMOOTH, ItemGroup.BUILDING_BLOCKS);
        /*//                                                           */ //       ???
        /*//                                                           */ //       ???
        /*//                                                           */ //       ???
        /*//                                                           */ //       ???
        /*if(config_allowed_walls.get()                         )      */ Register.registerBlock(WALLS_STONE_BRICK, ItemGroup.BUILDING_BLOCKS);
        /*// Vanilla:            .get()                                */ //                   BLOCK_STONE_BRICK_MOSS
        /*if(config_allowed_slabs.get()                         )      */ Register.registerBlock(SLABS_STONE_BRICK_MOSS, ItemGroup.BUILDING_BLOCKS);
        /*if(config_allowed_stair.get()                         )      */ Register.registerBlock(STAIR_STONE_BRICK_MOSS, ItemGroup.BUILDING_BLOCKS);
        /*if(config_allowed_walls.get()                         )      */ Register.registerBlock(WALLS_STONE_BRICK_MOSS, ItemGroup.BUILDING_BLOCKS);
        /*// Vanilla:            .get()                                */ //                   BLOCK_STONE_BRICK_CRACKED
        /*if(config_allowed_slabs.get()                         )      */ Register.registerBlock(SLABS_STONE_BRICK_CRACKED, ItemGroup.BUILDING_BLOCKS);
        /*if(config_allowed_stair.get()                         )      */ Register.registerBlock(STAIR_STONE_BRICK_CRACKED, ItemGroup.BUILDING_BLOCKS);
        /*if(config_allowed_walls.get()                         )      */ Register.registerBlock(WALLS_STONE_BRICK_CRACKED, ItemGroup.BUILDING_BLOCKS);
        /*if(                        config_extended_stone.get())      */ Register.registerBlock(BLOCK_STONE_PILLAR,        ItemGroup.BUILDING_BLOCKS);

        // Vanilla:                                                            BLOCK_GRANITE_STONE
        /*if(config_allowed_slabs.get()                                 )*/ Register.registerBlock(SLABS_GRANITE_STONE, ItemGroup.BUILDING_BLOCKS);
        /*if(config_allowed_stair.get()                                 )*/ Register.registerBlock(STAIR_GRANITE_STONE, ItemGroup.BUILDING_BLOCKS);
        /*if(config_allowed_walls.get()                                 )*/ Register.registerBlock(WALLS_GRANITE_STONE, ItemGroup.BUILDING_BLOCKS);
        /*if(                              config_extended_granite.get())*/ Register.registerBlock(BLOCK_GRANITE_COBBLE, ItemGroup.BUILDING_BLOCKS);
        /*if(config_allowed_slabs.get() && config_extended_granite.get())*/ Register.registerBlock(SLABS_GRANITE_COBBLE, ItemGroup.BUILDING_BLOCKS);
        /*if(config_allowed_stair.get() && config_extended_granite.get())*/ Register.registerBlock(STAIR_GRANITE_COBBLE, ItemGroup.BUILDING_BLOCKS);
        /*if(config_allowed_walls.get() && config_extended_granite.get())*/ Register.registerBlock(WALLS_GRANITE_COBBLE, ItemGroup.BUILDING_BLOCKS);
        /*if(                              config_extended_granite.get())*/ Register.registerBlock(BLOCK_GRANITE_COBBLE_MOSS, ItemGroup.BUILDING_BLOCKS);
        /*if(config_allowed_slabs.get() && config_extended_granite.get())*/ Register.registerBlock(SLABS_GRANITE_COBBLE_MOSS, ItemGroup.BUILDING_BLOCKS);
        /*if(config_allowed_stair.get() && config_extended_granite.get())*/ Register.registerBlock(STAIR_GRANITE_COBBLE_MOSS, ItemGroup.BUILDING_BLOCKS);
        /*if(config_allowed_walls.get() && config_extended_granite.get())*/ Register.registerBlock(WALLS_GRANITE_COBBLE_MOSS, ItemGroup.BUILDING_BLOCKS);
        /*// Vanilla:            .get()                                  */ //             BLOCK_GRANITE_SMOOTH
        /*if(config_allowed_slabs.get()                                 )*/ Register.registerBlock(SLABS_GRANITE_SMOOTH, ItemGroup.BUILDING_BLOCKS);
        /*if(config_allowed_walls.get()                                 )*/ Register.registerBlock(STAIR_GRANITE_SMOOTH, ItemGroup.BUILDING_BLOCKS);
        /*if(config_allowed_walls.get()                                 )*/ Register.registerBlock(WALLS_GRANITE_SMOOTH, ItemGroup.BUILDING_BLOCKS);
        /*if(                              config_extended_granite.get())*/ Register.registerBlock(BLOCK_GRANITE_BRICK, ItemGroup.BUILDING_BLOCKS);
        /*if(config_allowed_slabs.get() && config_extended_granite.get())*/ Register.registerBlock(SLABS_GRANITE_BRICK, ItemGroup.BUILDING_BLOCKS);
        /*if(config_allowed_stair.get() && config_extended_granite.get())*/ Register.registerBlock(STAIR_GRANITE_BRICK, ItemGroup.BUILDING_BLOCKS);
        /*if(config_allowed_walls.get() && config_extended_granite.get())*/ Register.registerBlock(WALLS_GRANITE_BRICK, ItemGroup.BUILDING_BLOCKS);
        /*if(                              config_extended_granite.get())*/ Register.registerBlock(BLOCK_GRANITE_BRICK_MOSS, ItemGroup.BUILDING_BLOCKS);
        /*if(config_allowed_slabs.get() && config_extended_granite.get())*/ Register.registerBlock(SLABS_GRANITE_BRICK_MOSS, ItemGroup.BUILDING_BLOCKS);
        /*if(config_allowed_stair.get() && config_extended_granite.get())*/ Register.registerBlock(STAIR_GRANITE_BRICK_MOSS, ItemGroup.BUILDING_BLOCKS);
        /*if(config_allowed_walls.get() && config_extended_granite.get())*/ Register.registerBlock(WALLS_GRANITE_BRICK_MOSS, ItemGroup.BUILDING_BLOCKS);
        /*if(                              config_extended_granite.get())*/ Register.registerBlock(BLOCK_GRANITE_BRICK_CRACKED, ItemGroup.BUILDING_BLOCKS);
        /*if(config_allowed_slabs.get() && config_extended_granite.get())*/ Register.registerBlock(SLABS_GRANITE_BRICK_CRACKED, ItemGroup.BUILDING_BLOCKS);
        /*if(config_allowed_stair.get() && config_extended_granite.get())*/ Register.registerBlock(STAIR_GRANITE_BRICK_CRACKED, ItemGroup.BUILDING_BLOCKS);
        /*if(config_allowed_walls.get() && config_extended_granite.get())*/ Register.registerBlock(WALLS_GRANITE_BRICK_CRACKED, ItemGroup.BUILDING_BLOCKS);
        /*if(                              config_extended_granite.get())*/ Register.registerBlock(BLOCK_GRANITE_BRICK_CARVED, ItemGroup.BUILDING_BLOCKS);
        /*if(                              config_extended_granite.get())*/ Register.registerBlock(BLOCK_GRANITE_PILLAR, ItemGroup.BUILDING_BLOCKS);

        // Vanilla:                                                            BLOCK_DIORITE_STONE
        /*if(config_allowed_slabs.get()                                 )*/ Register.registerBlock(SLABS_DIORITE_STONE, ItemGroup.BUILDING_BLOCKS);
        /*if(config_allowed_stair.get()                                 )*/ Register.registerBlock(STAIR_DIORITE_STONE, ItemGroup.BUILDING_BLOCKS);
        /*if(config_allowed_walls.get()                                 )*/ Register.registerBlock(WALLS_DIORITE_STONE, ItemGroup.BUILDING_BLOCKS);
        /*if(                              config_extended_diorite.get())*/ Register.registerBlock(BLOCK_DIORITE_COBBLE, ItemGroup.BUILDING_BLOCKS);
        /*if(config_allowed_slabs.get() && config_extended_diorite.get())*/ Register.registerBlock(SLABS_DIORITE_COBBLE, ItemGroup.BUILDING_BLOCKS);
        /*if(config_allowed_stair.get() && config_extended_diorite.get())*/ Register.registerBlock(STAIR_DIORITE_COBBLE, ItemGroup.BUILDING_BLOCKS);
        /*if(config_allowed_walls.get() && config_extended_diorite.get())*/ Register.registerBlock(WALLS_DIORITE_COBBLE, ItemGroup.BUILDING_BLOCKS);
        /*if(                              config_extended_diorite.get())*/ Register.registerBlock(BLOCK_DIORITE_COBBLE_MOSS, ItemGroup.BUILDING_BLOCKS);
        /*if(config_allowed_slabs.get() && config_extended_diorite.get())*/ Register.registerBlock(SLABS_DIORITE_COBBLE_MOSS, ItemGroup.BUILDING_BLOCKS);
        /*if(config_allowed_stair.get() && config_extended_diorite.get())*/ Register.registerBlock(STAIR_DIORITE_COBBLE_MOSS, ItemGroup.BUILDING_BLOCKS);
        /*if(config_allowed_walls.get() && config_extended_diorite.get())*/ Register.registerBlock(WALLS_DIORITE_COBBLE_MOSS, ItemGroup.BUILDING_BLOCKS);
        /*// Vanilla:            .get()                                  */  //            BLOCK_DIORITE_SMOOTH
        /*if(config_allowed_slabs.get()                                 )*/ Register.registerBlock(SLABS_DIORITE_SMOOTH, ItemGroup.BUILDING_BLOCKS);
        /*if(config_allowed_stair.get()                                 )*/ Register.registerBlock(STAIR_DIORITE_SMOOTH, ItemGroup.BUILDING_BLOCKS);
        /*if(config_allowed_walls.get()                                 )*/ Register.registerBlock(WALLS_DIORITE_SMOOTH, ItemGroup.BUILDING_BLOCKS);
        /*if(                              config_extended_diorite.get())*/ Register.registerBlock(BLOCK_DIORITE_BRICK, ItemGroup.BUILDING_BLOCKS);
        /*if(config_allowed_slabs.get() && config_extended_diorite.get())*/ Register.registerBlock(SLABS_DIORITE_BRICK, ItemGroup.BUILDING_BLOCKS);
        /*if(config_allowed_stair.get() && config_extended_diorite.get())*/ Register.registerBlock(STAIR_DIORITE_BRICK, ItemGroup.BUILDING_BLOCKS);
        /*if(config_allowed_walls.get() && config_extended_diorite.get())*/ Register.registerBlock(WALLS_DIORITE_BRICK, ItemGroup.BUILDING_BLOCKS);
        /*if(                              config_extended_diorite.get())*/ Register.registerBlock(BLOCK_DIORITE_BRICK_MOSS, ItemGroup.BUILDING_BLOCKS);
        /*if(config_allowed_slabs.get() && config_extended_diorite.get())*/ Register.registerBlock(SLABS_DIORITE_BRICK_MOSS, ItemGroup.BUILDING_BLOCKS);
        /*if(config_allowed_stair.get() && config_extended_diorite.get())*/ Register.registerBlock(STAIR_DIORITE_BRICK_MOSS, ItemGroup.BUILDING_BLOCKS);
        /*if(config_allowed_walls.get() && config_extended_diorite.get())*/ Register.registerBlock(WALLS_DIORITE_BRICK_MOSS, ItemGroup.BUILDING_BLOCKS);
        /*if(                              config_extended_diorite.get())*/ Register.registerBlock(BLOCK_DIORITE_BRICK_CRACKED, ItemGroup.BUILDING_BLOCKS);
        /*if(config_allowed_slabs.get() && config_extended_diorite.get())*/ Register.registerBlock(SLABS_DIORITE_BRICK_CRACKED, ItemGroup.BUILDING_BLOCKS);
        /*if(config_allowed_stair.get() && config_extended_diorite.get())*/ Register.registerBlock(STAIR_DIORITE_BRICK_CRACKED, ItemGroup.BUILDING_BLOCKS);
        /*if(config_allowed_walls.get() && config_extended_diorite.get())*/ Register.registerBlock(WALLS_DIORITE_BRICK_CRACKED, ItemGroup.BUILDING_BLOCKS);
        /*if(                              config_extended_diorite.get())*/ Register.registerBlock(BLOCK_DIORITE_BRICK_CARVED, ItemGroup.BUILDING_BLOCKS);
        /*if(                              config_extended_diorite.get())*/ Register.registerBlock(BLOCK_DIORITE_PILLAR, ItemGroup.BUILDING_BLOCKS);

        // Vanilla:                                                             BLOCK_ANDESITE_STONE
        /*if(config_allowed_slabs.get()                                  )*/ Register.registerBlock(SLABS_ANDESITE_STONE, ItemGroup.BUILDING_BLOCKS);
        /*if(config_allowed_stair.get()                                  )*/ Register.registerBlock(STAIR_ANDESITE_STONE, ItemGroup.BUILDING_BLOCKS);
        /*if(config_allowed_walls.get()                                  )*/ Register.registerBlock(WALLS_ANDESITE_STONE, ItemGroup.BUILDING_BLOCKS);
        /*if(                              config_extended_andesite.get())*/ Register.registerBlock(BLOCK_ANDESITE_COBBLE, ItemGroup.BUILDING_BLOCKS);
        /*if(config_allowed_slabs.get() && config_extended_andesite.get())*/ Register.registerBlock(SLABS_ANDESITE_COBBLE, ItemGroup.BUILDING_BLOCKS);
        /*if(config_allowed_stair.get() && config_extended_andesite.get())*/ Register.registerBlock(STAIR_ANDESITE_COBBLE, ItemGroup.BUILDING_BLOCKS);
        /*if(config_allowed_walls.get() && config_extended_andesite.get())*/ Register.registerBlock(WALLS_ANDESITE_COBBLE, ItemGroup.BUILDING_BLOCKS);
        /*if(                              config_extended_andesite.get())*/ Register.registerBlock(BLOCK_ANDESITE_COBBLE_MOSS, ItemGroup.BUILDING_BLOCKS);
        /*if(config_allowed_slabs.get() && config_extended_andesite.get())*/ Register.registerBlock(SLABS_ANDESITE_COBBLE_MOSS, ItemGroup.BUILDING_BLOCKS);
        /*if(config_allowed_stair.get() && config_extended_andesite.get())*/ Register.registerBlock(STAIR_ANDESITE_COBBLE_MOSS, ItemGroup.BUILDING_BLOCKS);
        /*if(config_allowed_walls.get() && config_extended_andesite.get())*/ Register.registerBlock(WALLS_ANDESITE_COBBLE_MOSS, ItemGroup.BUILDING_BLOCKS);
        /*// Vanilla:            .get()                                   */ //             BLOCK_ANDESITE_SMOOTH
        /*if(config_allowed_slabs.get()                                  )*/ Register.registerBlock(SLABS_ANDESITE_SMOOTH, ItemGroup.BUILDING_BLOCKS);
        /*if(config_allowed_stair.get()                                  )*/ Register.registerBlock(STAIR_ANDESITE_SMOOTH, ItemGroup.BUILDING_BLOCKS);
        /*if(config_allowed_walls.get()                                  )*/ Register.registerBlock(WALLS_ANDESITE_SMOOTH, ItemGroup.BUILDING_BLOCKS);
        /*if(                              config_extended_andesite.get())*/ Register.registerBlock(BLOCK_ANDESITE_BRICK, ItemGroup.BUILDING_BLOCKS);
        /*if(config_allowed_slabs.get() && config_extended_andesite.get())*/ Register.registerBlock(SLABS_ANDESITE_BRICK, ItemGroup.BUILDING_BLOCKS);
        /*if(config_allowed_stair.get() && config_extended_andesite.get())*/ Register.registerBlock(STAIR_ANDESITE_BRICK, ItemGroup.BUILDING_BLOCKS);
        /*if(config_allowed_walls.get() && config_extended_andesite.get())*/ Register.registerBlock(WALLS_ANDESITE_BRICK, ItemGroup.BUILDING_BLOCKS);
        /*if(                              config_extended_andesite.get())*/ Register.registerBlock(BLOCK_ANDESITE_BRICK_MOSS, ItemGroup.BUILDING_BLOCKS);
        /*if(config_allowed_slabs.get() && config_extended_andesite.get())*/ Register.registerBlock(SLABS_ANDESITE_BRICK_MOSS, ItemGroup.BUILDING_BLOCKS);
        /*if(config_allowed_stair.get() && config_extended_andesite.get())*/ Register.registerBlock(STAIR_ANDESITE_BRICK_MOSS, ItemGroup.BUILDING_BLOCKS);
        /*if(config_allowed_walls.get() && config_extended_andesite.get())*/ Register.registerBlock(WALLS_ANDESITE_BRICK_MOSS, ItemGroup.BUILDING_BLOCKS);
        /*if(                              config_extended_andesite.get())*/ Register.registerBlock(BLOCK_ANDESITE_BRICK_CRACKED, ItemGroup.BUILDING_BLOCKS);
        /*if(config_allowed_slabs.get() && config_extended_andesite.get())*/ Register.registerBlock(SLABS_ANDESITE_BRICK_CRACKED, ItemGroup.BUILDING_BLOCKS);
        /*if(config_allowed_stair.get() && config_extended_andesite.get())*/ Register.registerBlock(STAIR_ANDESITE_BRICK_CRACKED, ItemGroup.BUILDING_BLOCKS);
        /*if(config_allowed_walls.get() && config_extended_andesite.get())*/ Register.registerBlock(WALLS_ANDESITE_BRICK_CRACKED, ItemGroup.BUILDING_BLOCKS);
        /*if(                              config_extended_andesite.get())*/ Register.registerBlock(BLOCK_ANDESITE_BRICK_CARVED, ItemGroup.BUILDING_BLOCKS);
        /*if(                              config_extended_andesite.get())*/ Register.registerBlock(BLOCK_ANDESITE_PILLAR, ItemGroup.BUILDING_BLOCKS);

        /*if(config_allowed_slabs.get())*/ Register.registerBlock(SLABS_PRISMARINE_STONE,  ItemGroup.BUILDING_BLOCKS);
        /*if(config_allowed_stair.get())*/ Register.registerBlock(STAIR_PRISMARINE_STONE,  ItemGroup.BUILDING_BLOCKS);
        /*if(config_allowed_walls.get())*/ Register.registerBlock(WALLS_PRISMARINE_STONE,  ItemGroup.BUILDING_BLOCKS);
        /*if(config_allowed_slabs.get())*/ Register.registerBlock(SLABS_PRISMARINE_BRICK,  ItemGroup.BUILDING_BLOCKS);
        /*if(config_allowed_stair.get())*/ Register.registerBlock(STAIR_PRISMARINE_BRICK,  ItemGroup.BUILDING_BLOCKS);
        /*if(config_allowed_walls.get())*/ Register.registerBlock(WALLS_PRISMARINE_BRICK,  ItemGroup.BUILDING_BLOCKS);
        /*if(config_allowed_slabs.get())*/ Register.registerBlock(SLABS_PRISMARINE_DARK,   ItemGroup.BUILDING_BLOCKS);
        /*if(config_allowed_stair.get())*/ Register.registerBlock(STAIR_PRISMARINE_DARK,   ItemGroup.BUILDING_BLOCKS);
        /*if(config_allowed_walls.get())*/ Register.registerBlock(WALLS_PRISMARINE_DARK,   ItemGroup.BUILDING_BLOCKS);

        // Vanilla:                                                        BLOCK_END_STONE
        /*if(config_allowed_slabs.get()                             )*/ Register.registerBlock(SLABS_END_STONE, ItemGroup.BUILDING_BLOCKS);
        /*if(config_allowed_stair.get()                             )*/ Register.registerBlock(STAIR_END_STONE, ItemGroup.BUILDING_BLOCKS);
        /*if(config_allowed_walls.get()                             )*/ Register.registerBlock(WALLS_END_STONE, ItemGroup.BUILDING_BLOCKS);
        /*if(                              config_extended_end.get())*/ Register.registerBlock(BLOCK_END_COBBLE, ItemGroup.BUILDING_BLOCKS);
        /*if(config_allowed_slabs.get() && config_extended_end.get())*/ Register.registerBlock(SLABS_END_COBBLE, ItemGroup.BUILDING_BLOCKS);
        /*if(config_allowed_stair.get() && config_extended_end.get())*/ Register.registerBlock(STAIR_END_COBBLE, ItemGroup.BUILDING_BLOCKS);
        /*if(config_allowed_walls.get() && config_extended_end.get())*/ Register.registerBlock(WALLS_END_COBBLE, ItemGroup.BUILDING_BLOCKS);
        /*if(                              config_extended_end.get())*/ Register.registerBlock(BLOCK_END_COBBLE_MOSS, ItemGroup.BUILDING_BLOCKS);
        /*if(config_allowed_slabs.get() && config_extended_end.get())*/ Register.registerBlock(SLABS_END_COBBLE_MOSS, ItemGroup.BUILDING_BLOCKS);
        /*if(config_allowed_stair.get() && config_extended_end.get())*/ Register.registerBlock(STAIR_END_COBBLE_MOSS, ItemGroup.BUILDING_BLOCKS);
        /*if(config_allowed_walls.get() && config_extended_end.get())*/ Register.registerBlock(WALLS_END_COBBLE_MOSS, ItemGroup.BUILDING_BLOCKS);
        /*if(                              config_extended_end.get())*/ Register.registerBlock(BLOCK_END_SMOOTH, ItemGroup.BUILDING_BLOCKS);
        /*if(config_allowed_slabs.get() && config_extended_end.get())*/ Register.registerBlock(SLABS_END_SMOOTH, ItemGroup.BUILDING_BLOCKS);
        /*if(config_allowed_stair.get() && config_extended_end.get())*/ Register.registerBlock(STAIR_END_SMOOTH, ItemGroup.BUILDING_BLOCKS);
        /*if(config_allowed_walls.get() && config_extended_end.get())*/ Register.registerBlock(WALLS_END_SMOOTH, ItemGroup.BUILDING_BLOCKS);
        /*// Vanilla:            .get()                              */ //             BLOCK_END_BRICK
        /*if(config_allowed_slabs.get()                             )*/ Register.registerBlock(SLABS_END_BRICK, ItemGroup.BUILDING_BLOCKS);
        /*if(config_allowed_stair.get()                             )*/ Register.registerBlock(STAIR_END_BRICK, ItemGroup.BUILDING_BLOCKS);
        /*if(config_allowed_walls.get()                             )*/ Register.registerBlock(WALLS_END_BRICK, ItemGroup.BUILDING_BLOCKS);
        /*if(                              config_extended_end.get())*/ Register.registerBlock(BLOCK_END_BRICK_MOSS, ItemGroup.BUILDING_BLOCKS);
        /*if(config_allowed_slabs.get() && config_extended_end.get())*/ Register.registerBlock(SLABS_END_BRICK_MOSS, ItemGroup.BUILDING_BLOCKS);
        /*if(config_allowed_stair.get() && config_extended_end.get())*/ Register.registerBlock(STAIR_END_BRICK_MOSS, ItemGroup.BUILDING_BLOCKS);
        /*if(config_allowed_walls.get() && config_extended_end.get())*/ Register.registerBlock(WALLS_END_BRICK_MOSS, ItemGroup.BUILDING_BLOCKS);
        /*if(                              config_extended_end.get())*/ Register.registerBlock(BLOCK_END_BRICK_CRACKED, ItemGroup.BUILDING_BLOCKS);
        /*if(config_allowed_slabs.get() && config_extended_end.get())*/ Register.registerBlock(SLABS_END_BRICK_CRACKED, ItemGroup.BUILDING_BLOCKS);
        /*if(config_allowed_stair.get() && config_extended_end.get())*/ Register.registerBlock(STAIR_END_BRICK_CRACKED, ItemGroup.BUILDING_BLOCKS);
        /*if(config_allowed_walls.get() && config_extended_end.get())*/ Register.registerBlock(WALLS_END_BRICK_CRACKED, ItemGroup.BUILDING_BLOCKS);
        /*if(                              config_extended_end.get())*/ Register.registerBlock(BLOCK_END_BRICK_CARVED, ItemGroup.BUILDING_BLOCKS);
        /*if(                              config_extended_end.get())*/ Register.registerBlock(BLOCK_END_PILLAR, ItemGroup.BUILDING_BLOCKS);

        /*if(config_allowed_slabs.get())*/ Register.registerBlock(SLABS_REDNETHER_BRICK, ItemGroup.BUILDING_BLOCKS);
        /*if(config_allowed_stair.get())*/ Register.registerBlock(STAIR_REDNETHER_BRICK, ItemGroup.BUILDING_BLOCKS);
        /*if(config_allowed_walls.get())*/ Register.registerBlock(WALLS_REDNETHER_BRICK, ItemGroup.BUILDING_BLOCKS);

        // Vanilla:                                                                 BLOCK_OBSIDIAN_STONE
        /*if(config_allowed_slabs.get() && config_extended_obsidian.get())*/ Register.registerBlock(SLABS_OBSIDIAN_STONE,  ItemGroup.BUILDING_BLOCKS);
        /*if(config_allowed_stair.get() && config_extended_obsidian.get())*/ Register.registerBlock(STAIR_OBSIDIAN_STONE,  ItemGroup.BUILDING_BLOCKS);
        /*if(config_allowed_walls.get() && config_extended_obsidian.get())*/ Register.registerBlock(WALLS_OBSIDIAN_STONE,  ItemGroup.BUILDING_BLOCKS);
        /*if(                              config_extended_obsidian.get())*/ Register.registerBlock(BLOCK_OBSIDIAN_SMOOTH, ItemGroup.BUILDING_BLOCKS);
        /*if(config_allowed_slabs.get() && config_extended_obsidian.get())*/ Register.registerBlock(SLABS_OBSIDIAN_SMOOTH, ItemGroup.BUILDING_BLOCKS);
        /*if(config_allowed_stair.get() && config_extended_obsidian.get())*/ Register.registerBlock(STAIR_OBSIDIAN_SMOOTH, ItemGroup.BUILDING_BLOCKS);
        /*if(config_allowed_walls.get() && config_extended_obsidian.get())*/ Register.registerBlock(WALLS_OBSIDIAN_SMOOTH, ItemGroup.BUILDING_BLOCKS);
        /*if(                              config_extended_obsidian.get())*/ Register.registerBlock(BLOCK_OBSIDIAN_CARVED, ItemGroup.BUILDING_BLOCKS);
        /*if(                              config_extended_obsidian.get())*/ Register.registerBlock(BLOCK_OBSIDIAN_PILLAR, ItemGroup.BUILDING_BLOCKS);

        /*if(config_allowed_slabs.get())*/ Register.registerBlock(SLABS_CONCRETE_WHITE, ItemGroup.BUILDING_BLOCKS);
        /*if(config_allowed_stair.get())*/ Register.registerBlock(STAIR_CONCRETE_WHITE, ItemGroup.BUILDING_BLOCKS);
        /*if(config_allowed_walls.get())*/ Register.registerBlock(WALLS_CONCRETE_WHITE, ItemGroup.BUILDING_BLOCKS);
        /*if(config_allowed_slabs.get())*/ Register.registerBlock(SLABS_CONCRETE_ORANGE, ItemGroup.BUILDING_BLOCKS);
        /*if(config_allowed_stair.get())*/ Register.registerBlock(STAIR_CONCRETE_ORANGE, ItemGroup.BUILDING_BLOCKS);
        /*if(config_allowed_walls.get())*/ Register.registerBlock(WALLS_CONCRETE_ORANGE, ItemGroup.BUILDING_BLOCKS);
        /*if(config_allowed_slabs.get())*/ Register.registerBlock(SLABS_CONCRETE_MAGENTA, ItemGroup.BUILDING_BLOCKS);
        /*if(config_allowed_stair.get())*/ Register.registerBlock(STAIR_CONCRETE_MAGENTA, ItemGroup.BUILDING_BLOCKS);
        /*if(config_allowed_walls.get())*/ Register.registerBlock(WALLS_CONCRETE_MAGENTA, ItemGroup.BUILDING_BLOCKS);
        /*if(config_allowed_slabs.get())*/ Register.registerBlock(SLABS_CONCRETE_LIGHTBLUE, ItemGroup.BUILDING_BLOCKS);
        /*if(config_allowed_stair.get())*/ Register.registerBlock(STAIR_CONCRETE_LIGHTBLUE, ItemGroup.BUILDING_BLOCKS);
        /*if(config_allowed_walls.get())*/ Register.registerBlock(WALLS_CONCRETE_LIGHTBLUE, ItemGroup.BUILDING_BLOCKS);
        /*if(config_allowed_slabs.get())*/ Register.registerBlock(SLABS_CONCRETE_YELLOW, ItemGroup.BUILDING_BLOCKS);
        /*if(config_allowed_stair.get())*/ Register.registerBlock(STAIR_CONCRETE_YELLOW, ItemGroup.BUILDING_BLOCKS);
        /*if(config_allowed_walls.get())*/ Register.registerBlock(WALLS_CONCRETE_YELLOW, ItemGroup.BUILDING_BLOCKS);
        /*if(config_allowed_slabs.get())*/ Register.registerBlock(SLABS_CONCRETE_LIME, ItemGroup.BUILDING_BLOCKS);
        /*if(config_allowed_stair.get())*/ Register.registerBlock(STAIR_CONCRETE_LIME, ItemGroup.BUILDING_BLOCKS);
        /*if(config_allowed_walls.get())*/ Register.registerBlock(WALLS_CONCRETE_LIME, ItemGroup.BUILDING_BLOCKS);
        /*if(config_allowed_slabs.get())*/ Register.registerBlock(SLABS_CONCRETE_PINK, ItemGroup.BUILDING_BLOCKS);
        /*if(config_allowed_stair.get())*/ Register.registerBlock(STAIR_CONCRETE_PINK, ItemGroup.BUILDING_BLOCKS);
        /*if(config_allowed_walls.get())*/ Register.registerBlock(WALLS_CONCRETE_PINK, ItemGroup.BUILDING_BLOCKS);
        /*if(config_allowed_slabs.get())*/ Register.registerBlock(SLABS_CONCRETE_GRAY, ItemGroup.BUILDING_BLOCKS);
        /*if(config_allowed_stair.get())*/ Register.registerBlock(STAIR_CONCRETE_GRAY, ItemGroup.BUILDING_BLOCKS);
        /*if(config_allowed_walls.get())*/ Register.registerBlock(WALLS_CONCRETE_GRAY, ItemGroup.BUILDING_BLOCKS);
        /*if(config_allowed_slabs.get())*/ Register.registerBlock(SLABS_CONCRETE_SILVER, ItemGroup.BUILDING_BLOCKS);
        /*if(config_allowed_stair.get())*/ Register.registerBlock(STAIR_CONCRETE_SILVER, ItemGroup.BUILDING_BLOCKS);
        /*if(config_allowed_walls.get())*/ Register.registerBlock(WALLS_CONCRETE_SILVER, ItemGroup.BUILDING_BLOCKS);
        /*if(config_allowed_slabs.get())*/ Register.registerBlock(SLABS_CONCRETE_CYAN, ItemGroup.BUILDING_BLOCKS);
        /*if(config_allowed_stair.get())*/ Register.registerBlock(STAIR_CONCRETE_CYAN, ItemGroup.BUILDING_BLOCKS);
        /*if(config_allowed_walls.get())*/ Register.registerBlock(WALLS_CONCRETE_CYAN, ItemGroup.BUILDING_BLOCKS);
        /*if(config_allowed_slabs.get())*/ Register.registerBlock(SLABS_CONCRETE_PURPLE, ItemGroup.BUILDING_BLOCKS);
        /*if(config_allowed_stair.get())*/ Register.registerBlock(STAIR_CONCRETE_PURPLE, ItemGroup.BUILDING_BLOCKS);
        /*if(config_allowed_walls.get())*/ Register.registerBlock(WALLS_CONCRETE_PURPLE, ItemGroup.BUILDING_BLOCKS);
        /*if(config_allowed_slabs.get())*/ Register.registerBlock(SLABS_CONCRETE_BLUE, ItemGroup.BUILDING_BLOCKS);
        /*if(config_allowed_stair.get())*/ Register.registerBlock(STAIR_CONCRETE_BLUE, ItemGroup.BUILDING_BLOCKS);
        /*if(config_allowed_walls.get())*/ Register.registerBlock(WALLS_CONCRETE_BLUE, ItemGroup.BUILDING_BLOCKS);
        /*if(config_allowed_slabs.get())*/ Register.registerBlock(SLABS_CONCRETE_BROWN, ItemGroup.BUILDING_BLOCKS);
        /*if(config_allowed_stair.get())*/ Register.registerBlock(STAIR_CONCRETE_BROWN, ItemGroup.BUILDING_BLOCKS);
        /*if(config_allowed_walls.get())*/ Register.registerBlock(WALLS_CONCRETE_BROWN, ItemGroup.BUILDING_BLOCKS);
        /*if(config_allowed_slabs.get())*/ Register.registerBlock(SLABS_CONCRETE_GREEN, ItemGroup.BUILDING_BLOCKS);
        /*if(config_allowed_stair.get())*/ Register.registerBlock(STAIR_CONCRETE_GREEN, ItemGroup.BUILDING_BLOCKS);
        /*if(config_allowed_walls.get())*/ Register.registerBlock(WALLS_CONCRETE_GREEN, ItemGroup.BUILDING_BLOCKS);
        /*if(config_allowed_slabs.get())*/ Register.registerBlock(SLABS_CONCRETE_RED, ItemGroup.BUILDING_BLOCKS);
        /*if(config_allowed_stair.get())*/ Register.registerBlock(STAIR_CONCRETE_RED, ItemGroup.BUILDING_BLOCKS);
        /*if(config_allowed_walls.get())*/ Register.registerBlock(WALLS_CONCRETE_RED, ItemGroup.BUILDING_BLOCKS);
        /*if(config_allowed_slabs.get())*/ Register.registerBlock(SLABS_CONCRETE_BLACK, ItemGroup.BUILDING_BLOCKS);
        /*if(config_allowed_stair.get())*/ Register.registerBlock(STAIR_CONCRETE_BLACK, ItemGroup.BUILDING_BLOCKS);
        /*if(config_allowed_walls.get())*/ Register.registerBlock(WALLS_CONCRETE_BLACK, ItemGroup.BUILDING_BLOCKS);

        /*if(config_allowed_timber.get())*/ Register.registerBlock(BLOCK_TIMBER_BASIC_WHITE,     ItemGroup.BUILDING_BLOCKS);
        /*if(config_allowed_timber.get())*/ Register.registerBlock(BLOCK_TIMBER_BASIC_ORANGE,    ItemGroup.BUILDING_BLOCKS);
        /*if(config_allowed_timber.get())*/ Register.registerBlock(BLOCK_TIMBER_BASIC_MAGENTA,   ItemGroup.BUILDING_BLOCKS);
        /*if(config_allowed_timber.get())*/ Register.registerBlock(BLOCK_TIMBER_BASIC_LIGHTBLUE, ItemGroup.BUILDING_BLOCKS);
        /*if(config_allowed_timber.get())*/ Register.registerBlock(BLOCK_TIMBER_BASIC_YELLOW,    ItemGroup.BUILDING_BLOCKS);
        /*if(config_allowed_timber.get())*/ Register.registerBlock(BLOCK_TIMBER_BASIC_LIME,      ItemGroup.BUILDING_BLOCKS);
        /*if(config_allowed_timber.get())*/ Register.registerBlock(BLOCK_TIMBER_BASIC_PINK,      ItemGroup.BUILDING_BLOCKS);
        /*if(config_allowed_timber.get())*/ Register.registerBlock(BLOCK_TIMBER_BASIC_GRAY,      ItemGroup.BUILDING_BLOCKS);
        /*if(config_allowed_timber.get())*/ Register.registerBlock(BLOCK_TIMBER_BASIC_SILVER,    ItemGroup.BUILDING_BLOCKS);
        /*if(config_allowed_timber.get())*/ Register.registerBlock(BLOCK_TIMBER_BASIC_CYAN,      ItemGroup.BUILDING_BLOCKS);
        /*if(config_allowed_timber.get())*/ Register.registerBlock(BLOCK_TIMBER_BASIC_PURPLE,    ItemGroup.BUILDING_BLOCKS);
        /*if(config_allowed_timber.get())*/ Register.registerBlock(BLOCK_TIMBER_BASIC_BLUE,      ItemGroup.BUILDING_BLOCKS);
        /*if(config_allowed_timber.get())*/ Register.registerBlock(BLOCK_TIMBER_BASIC_BROWN,     ItemGroup.BUILDING_BLOCKS);
        /*if(config_allowed_timber.get())*/ Register.registerBlock(BLOCK_TIMBER_BASIC_GREEN,     ItemGroup.BUILDING_BLOCKS);
        /*if(config_allowed_timber.get())*/ Register.registerBlock(BLOCK_TIMBER_BASIC_RED,       ItemGroup.BUILDING_BLOCKS);
        /*if(config_allowed_timber.get())*/ Register.registerBlock(BLOCK_TIMBER_BASIC_BLACK,     ItemGroup.BUILDING_BLOCKS);
/**/
        /*if(config_allowed_timber.get())*/ Register.registerBlock(BLOCK_TIMBER_HORIZONTAL_WHITE,     ItemGroup.BUILDING_BLOCKS);
        /*if(config_allowed_timber.get())*/ Register.registerBlock(BLOCK_TIMBER_HORIZONTAL_ORANGE,    ItemGroup.BUILDING_BLOCKS);
        /*if(config_allowed_timber.get())*/ Register.registerBlock(BLOCK_TIMBER_HORIZONTAL_MAGENTA,   ItemGroup.BUILDING_BLOCKS);
        /*if(config_allowed_timber.get())*/ Register.registerBlock(BLOCK_TIMBER_HORIZONTAL_LIGHTBLUE, ItemGroup.BUILDING_BLOCKS);
        /*if(config_allowed_timber.get())*/ Register.registerBlock(BLOCK_TIMBER_HORIZONTAL_YELLOW,    ItemGroup.BUILDING_BLOCKS);
        /*if(config_allowed_timber.get())*/ Register.registerBlock(BLOCK_TIMBER_HORIZONTAL_LIME,      ItemGroup.BUILDING_BLOCKS);
        /*if(config_allowed_timber.get())*/ Register.registerBlock(BLOCK_TIMBER_HORIZONTAL_PINK,      ItemGroup.BUILDING_BLOCKS);
        /*if(config_allowed_timber.get())*/ Register.registerBlock(BLOCK_TIMBER_HORIZONTAL_GRAY,      ItemGroup.BUILDING_BLOCKS);
        /*if(config_allowed_timber.get())*/ Register.registerBlock(BLOCK_TIMBER_HORIZONTAL_SILVER,    ItemGroup.BUILDING_BLOCKS);
        /*if(config_allowed_timber.get())*/ Register.registerBlock(BLOCK_TIMBER_HORIZONTAL_CYAN,      ItemGroup.BUILDING_BLOCKS);
        /*if(config_allowed_timber.get())*/ Register.registerBlock(BLOCK_TIMBER_HORIZONTAL_PURPLE,    ItemGroup.BUILDING_BLOCKS);
        /*if(config_allowed_timber.get())*/ Register.registerBlock(BLOCK_TIMBER_HORIZONTAL_BLUE,      ItemGroup.BUILDING_BLOCKS);
        /*if(config_allowed_timber.get())*/ Register.registerBlock(BLOCK_TIMBER_HORIZONTAL_BROWN,     ItemGroup.BUILDING_BLOCKS);
        /*if(config_allowed_timber.get())*/ Register.registerBlock(BLOCK_TIMBER_HORIZONTAL_GREEN,     ItemGroup.BUILDING_BLOCKS);
        /*if(config_allowed_timber.get())*/ Register.registerBlock(BLOCK_TIMBER_HORIZONTAL_RED,       ItemGroup.BUILDING_BLOCKS);
        /*if(config_allowed_timber.get())*/ Register.registerBlock(BLOCK_TIMBER_HORIZONTAL_BLACK,     ItemGroup.BUILDING_BLOCKS);
/**/
        /*if(config_allowed_timber.get())*/ Register.registerBlock(BLOCK_TIMBER_VERTICAL_WHITE,     ItemGroup.BUILDING_BLOCKS);
        /*if(config_allowed_timber.get())*/ Register.registerBlock(BLOCK_TIMBER_VERTICAL_ORANGE,    ItemGroup.BUILDING_BLOCKS);
        /*if(config_allowed_timber.get())*/ Register.registerBlock(BLOCK_TIMBER_VERTICAL_MAGENTA,   ItemGroup.BUILDING_BLOCKS);
        /*if(config_allowed_timber.get())*/ Register.registerBlock(BLOCK_TIMBER_VERTICAL_LIGHTBLUE, ItemGroup.BUILDING_BLOCKS);
        /*if(config_allowed_timber.get())*/ Register.registerBlock(BLOCK_TIMBER_VERTICAL_YELLOW,    ItemGroup.BUILDING_BLOCKS);
        /*if(config_allowed_timber.get())*/ Register.registerBlock(BLOCK_TIMBER_VERTICAL_LIME,      ItemGroup.BUILDING_BLOCKS);
        /*if(config_allowed_timber.get())*/ Register.registerBlock(BLOCK_TIMBER_VERTICAL_PINK,      ItemGroup.BUILDING_BLOCKS);
        /*if(config_allowed_timber.get())*/ Register.registerBlock(BLOCK_TIMBER_VERTICAL_GRAY,      ItemGroup.BUILDING_BLOCKS);
        /*if(config_allowed_timber.get())*/ Register.registerBlock(BLOCK_TIMBER_VERTICAL_SILVER,    ItemGroup.BUILDING_BLOCKS);
        /*if(config_allowed_timber.get())*/ Register.registerBlock(BLOCK_TIMBER_VERTICAL_CYAN,      ItemGroup.BUILDING_BLOCKS);
        /*if(config_allowed_timber.get())*/ Register.registerBlock(BLOCK_TIMBER_VERTICAL_PURPLE,    ItemGroup.BUILDING_BLOCKS);
        /*if(config_allowed_timber.get())*/ Register.registerBlock(BLOCK_TIMBER_VERTICAL_BLUE,      ItemGroup.BUILDING_BLOCKS);
        /*if(config_allowed_timber.get())*/ Register.registerBlock(BLOCK_TIMBER_VERTICAL_BROWN,     ItemGroup.BUILDING_BLOCKS);
        /*if(config_allowed_timber.get())*/ Register.registerBlock(BLOCK_TIMBER_VERTICAL_GREEN,     ItemGroup.BUILDING_BLOCKS);
        /*if(config_allowed_timber.get())*/ Register.registerBlock(BLOCK_TIMBER_VERTICAL_RED,       ItemGroup.BUILDING_BLOCKS);
        /*if(config_allowed_timber.get())*/ Register.registerBlock(BLOCK_TIMBER_VERTICAL_BLACK,     ItemGroup.BUILDING_BLOCKS);
/**/
        /*if(config_allowed_timber.get())*/ Register.registerBlock(BLOCK_TIMBER_PLUS_WHITE,     ItemGroup.BUILDING_BLOCKS);
        /*if(config_allowed_timber.get())*/ Register.registerBlock(BLOCK_TIMBER_PLUS_ORANGE,    ItemGroup.BUILDING_BLOCKS);
        /*if(config_allowed_timber.get())*/ Register.registerBlock(BLOCK_TIMBER_PLUS_MAGENTA,   ItemGroup.BUILDING_BLOCKS);
        /*if(config_allowed_timber.get())*/ Register.registerBlock(BLOCK_TIMBER_PLUS_LIGHTBLUE, ItemGroup.BUILDING_BLOCKS);
        /*if(config_allowed_timber.get())*/ Register.registerBlock(BLOCK_TIMBER_PLUS_YELLOW,    ItemGroup.BUILDING_BLOCKS);
        /*if(config_allowed_timber.get())*/ Register.registerBlock(BLOCK_TIMBER_PLUS_LIME,      ItemGroup.BUILDING_BLOCKS);
        /*if(config_allowed_timber.get())*/ Register.registerBlock(BLOCK_TIMBER_PLUS_PINK,      ItemGroup.BUILDING_BLOCKS);
        /*if(config_allowed_timber.get())*/ Register.registerBlock(BLOCK_TIMBER_PLUS_GRAY,      ItemGroup.BUILDING_BLOCKS);
        /*if(config_allowed_timber.get())*/ Register.registerBlock(BLOCK_TIMBER_PLUS_SILVER,    ItemGroup.BUILDING_BLOCKS);
        /*if(config_allowed_timber.get())*/ Register.registerBlock(BLOCK_TIMBER_PLUS_CYAN,      ItemGroup.BUILDING_BLOCKS);
        /*if(config_allowed_timber.get())*/ Register.registerBlock(BLOCK_TIMBER_PLUS_PURPLE,    ItemGroup.BUILDING_BLOCKS);
        /*if(config_allowed_timber.get())*/ Register.registerBlock(BLOCK_TIMBER_PLUS_BLUE,      ItemGroup.BUILDING_BLOCKS);
        /*if(config_allowed_timber.get())*/ Register.registerBlock(BLOCK_TIMBER_PLUS_BROWN,     ItemGroup.BUILDING_BLOCKS);
        /*if(config_allowed_timber.get())*/ Register.registerBlock(BLOCK_TIMBER_PLUS_GREEN,     ItemGroup.BUILDING_BLOCKS);
        /*if(config_allowed_timber.get())*/ Register.registerBlock(BLOCK_TIMBER_PLUS_RED,       ItemGroup.BUILDING_BLOCKS);
        /*if(config_allowed_timber.get())*/ Register.registerBlock(BLOCK_TIMBER_PLUS_BLACK,     ItemGroup.BUILDING_BLOCKS);
/**/
        /*if(config_allowed_timber.get())*/ Register.registerBlock(BLOCK_TIMBER_DIAG_LEFT_WHITE,     ItemGroup.BUILDING_BLOCKS);
        /*if(config_allowed_timber.get())*/ Register.registerBlock(BLOCK_TIMBER_DIAG_LEFT_ORANGE,    ItemGroup.BUILDING_BLOCKS);
        /*if(config_allowed_timber.get())*/ Register.registerBlock(BLOCK_TIMBER_DIAG_LEFT_MAGENTA,   ItemGroup.BUILDING_BLOCKS);
        /*if(config_allowed_timber.get())*/ Register.registerBlock(BLOCK_TIMBER_DIAG_LEFT_LIGHTBLUE, ItemGroup.BUILDING_BLOCKS);
        /*if(config_allowed_timber.get())*/ Register.registerBlock(BLOCK_TIMBER_DIAG_LEFT_YELLOW,    ItemGroup.BUILDING_BLOCKS);
        /*if(config_allowed_timber.get())*/ Register.registerBlock(BLOCK_TIMBER_DIAG_LEFT_LIME,      ItemGroup.BUILDING_BLOCKS);
        /*if(config_allowed_timber.get())*/ Register.registerBlock(BLOCK_TIMBER_DIAG_LEFT_PINK,      ItemGroup.BUILDING_BLOCKS);
        /*if(config_allowed_timber.get())*/ Register.registerBlock(BLOCK_TIMBER_DIAG_LEFT_GRAY,      ItemGroup.BUILDING_BLOCKS);
        /*if(config_allowed_timber.get())*/ Register.registerBlock(BLOCK_TIMBER_DIAG_LEFT_SILVER,    ItemGroup.BUILDING_BLOCKS);
        /*if(config_allowed_timber.get())*/ Register.registerBlock(BLOCK_TIMBER_DIAG_LEFT_CYAN,      ItemGroup.BUILDING_BLOCKS);
        /*if(config_allowed_timber.get())*/ Register.registerBlock(BLOCK_TIMBER_DIAG_LEFT_PURPLE,    ItemGroup.BUILDING_BLOCKS);
        /*if(config_allowed_timber.get())*/ Register.registerBlock(BLOCK_TIMBER_DIAG_LEFT_BLUE,      ItemGroup.BUILDING_BLOCKS);
        /*if(config_allowed_timber.get())*/ Register.registerBlock(BLOCK_TIMBER_DIAG_LEFT_BROWN,     ItemGroup.BUILDING_BLOCKS);
        /*if(config_allowed_timber.get())*/ Register.registerBlock(BLOCK_TIMBER_DIAG_LEFT_GREEN,     ItemGroup.BUILDING_BLOCKS);
        /*if(config_allowed_timber.get())*/ Register.registerBlock(BLOCK_TIMBER_DIAG_LEFT_RED,       ItemGroup.BUILDING_BLOCKS);
        /*if(config_allowed_timber.get())*/ Register.registerBlock(BLOCK_TIMBER_DIAG_LEFT_BLACK,     ItemGroup.BUILDING_BLOCKS);
/**/
        /*if(config_allowed_timber.get())*/ Register.registerBlock(BLOCK_TIMBER_DIAG_RIGHT_WHITE,     ItemGroup.BUILDING_BLOCKS);
        /*if(config_allowed_timber.get())*/ Register.registerBlock(BLOCK_TIMBER_DIAG_RIGHT_ORANGE,    ItemGroup.BUILDING_BLOCKS);
        /*if(config_allowed_timber.get())*/ Register.registerBlock(BLOCK_TIMBER_DIAG_RIGHT_MAGENTA,   ItemGroup.BUILDING_BLOCKS);
        /*if(config_allowed_timber.get())*/ Register.registerBlock(BLOCK_TIMBER_DIAG_RIGHT_LIGHTBLUE, ItemGroup.BUILDING_BLOCKS);
        /*if(config_allowed_timber.get())*/ Register.registerBlock(BLOCK_TIMBER_DIAG_RIGHT_YELLOW,    ItemGroup.BUILDING_BLOCKS);
        /*if(config_allowed_timber.get())*/ Register.registerBlock(BLOCK_TIMBER_DIAG_RIGHT_LIME,      ItemGroup.BUILDING_BLOCKS);
        /*if(config_allowed_timber.get())*/ Register.registerBlock(BLOCK_TIMBER_DIAG_RIGHT_PINK,      ItemGroup.BUILDING_BLOCKS);
        /*if(config_allowed_timber.get())*/ Register.registerBlock(BLOCK_TIMBER_DIAG_RIGHT_GRAY,      ItemGroup.BUILDING_BLOCKS);
        /*if(config_allowed_timber.get())*/ Register.registerBlock(BLOCK_TIMBER_DIAG_RIGHT_SILVER,    ItemGroup.BUILDING_BLOCKS);
        /*if(config_allowed_timber.get())*/ Register.registerBlock(BLOCK_TIMBER_DIAG_RIGHT_CYAN,      ItemGroup.BUILDING_BLOCKS);
        /*if(config_allowed_timber.get())*/ Register.registerBlock(BLOCK_TIMBER_DIAG_RIGHT_PURPLE,    ItemGroup.BUILDING_BLOCKS);
        /*if(config_allowed_timber.get())*/ Register.registerBlock(BLOCK_TIMBER_DIAG_RIGHT_BLUE,      ItemGroup.BUILDING_BLOCKS);
        /*if(config_allowed_timber.get())*/ Register.registerBlock(BLOCK_TIMBER_DIAG_RIGHT_BROWN,     ItemGroup.BUILDING_BLOCKS);
        /*if(config_allowed_timber.get())*/ Register.registerBlock(BLOCK_TIMBER_DIAG_RIGHT_GREEN,     ItemGroup.BUILDING_BLOCKS);
        /*if(config_allowed_timber.get())*/ Register.registerBlock(BLOCK_TIMBER_DIAG_RIGHT_RED,       ItemGroup.BUILDING_BLOCKS);
        /*if(config_allowed_timber.get())*/ Register.registerBlock(BLOCK_TIMBER_DIAG_RIGHT_BLACK,     ItemGroup.BUILDING_BLOCKS);
/**/
        /*if(config_allowed_timber.get())*/ Register.registerBlock(BLOCK_TIMBER_CROSS_WHITE,     ItemGroup.BUILDING_BLOCKS);
        /*if(config_allowed_timber.get())*/ Register.registerBlock(BLOCK_TIMBER_CROSS_ORANGE,    ItemGroup.BUILDING_BLOCKS);
        /*if(config_allowed_timber.get())*/ Register.registerBlock(BLOCK_TIMBER_CROSS_MAGENTA,   ItemGroup.BUILDING_BLOCKS);
        /*if(config_allowed_timber.get())*/ Register.registerBlock(BLOCK_TIMBER_CROSS_LIGHTBLUE, ItemGroup.BUILDING_BLOCKS);
        /*if(config_allowed_timber.get())*/ Register.registerBlock(BLOCK_TIMBER_CROSS_YELLOW,    ItemGroup.BUILDING_BLOCKS);
        /*if(config_allowed_timber.get())*/ Register.registerBlock(BLOCK_TIMBER_CROSS_LIME,      ItemGroup.BUILDING_BLOCKS);
        /*if(config_allowed_timber.get())*/ Register.registerBlock(BLOCK_TIMBER_CROSS_PINK,      ItemGroup.BUILDING_BLOCKS);
        /*if(config_allowed_timber.get())*/ Register.registerBlock(BLOCK_TIMBER_CROSS_GRAY,      ItemGroup.BUILDING_BLOCKS);
        /*if(config_allowed_timber.get())*/ Register.registerBlock(BLOCK_TIMBER_CROSS_SILVER,    ItemGroup.BUILDING_BLOCKS);
        /*if(config_allowed_timber.get())*/ Register.registerBlock(BLOCK_TIMBER_CROSS_CYAN,      ItemGroup.BUILDING_BLOCKS);
        /*if(config_allowed_timber.get())*/ Register.registerBlock(BLOCK_TIMBER_CROSS_PURPLE,    ItemGroup.BUILDING_BLOCKS);
        /*if(config_allowed_timber.get())*/ Register.registerBlock(BLOCK_TIMBER_CROSS_BLUE,      ItemGroup.BUILDING_BLOCKS);
        /*if(config_allowed_timber.get())*/ Register.registerBlock(BLOCK_TIMBER_CROSS_BROWN,     ItemGroup.BUILDING_BLOCKS);
        /*if(config_allowed_timber.get())*/ Register.registerBlock(BLOCK_TIMBER_CROSS_GREEN,     ItemGroup.BUILDING_BLOCKS);
        /*if(config_allowed_timber.get())*/ Register.registerBlock(BLOCK_TIMBER_CROSS_RED,       ItemGroup.BUILDING_BLOCKS);
        /*if(config_allowed_timber.get())*/ Register.registerBlock(BLOCK_TIMBER_CROSS_BLACK,     ItemGroup.BUILDING_BLOCKS);
/**/
        /*if(config_allowed_scaffolding.get())*/ Register.registerBlock(BLOCK_SCAFFOLDING, ItemGroup.BUILDING_BLOCKS);
/**/
        /*if(config_allowed_chains.get())*/ Register.registerBlock(BLOCK_CHAIN_IRON, ItemGroup.BUILDING_BLOCKS);
        /*if(config_allowed_chains.get())*/ Register.registerBlock(BLOCK_CHAIN_GOLD, ItemGroup.BUILDING_BLOCKS);
    }

}
