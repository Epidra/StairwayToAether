package mod.stairway;

import com.electronwill.nightconfig.core.file.CommentedFileConfig;
import mod.shared.Register;
import mod.shared.blocks.BlockBlock;
import mod.shared.blocks.BlockPillar;
import mod.stairway.blocks.*;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.common.ForgeConfigSpec;

import java.nio.file.Path;

import static mod.stairway.StairwayToAether.MODID;

public class StairKeeper {

    //                        BLOCK_STONE_STONE
    //public static final Block SLABS_STONE_STONE        = new BlockSlabs("minecraft","stone_slab", Blocks.STONE);
    //                        STAIR_STONE_STONE
    public static final Block WALLS_STONE_STONE        = new BlockWalls(MODID,"walls_stone_stone", Blocks.STONE);
    public static final Block PILAR_STONE_STONE        = new BlockPilar(MODID,"pilar_stone_stone", Blocks.STONE);
    //                        BLOCK_STONE_COBBLE
    //                        SLABS_STONE_COBBLE
    //                        STAIR_STONE_COBBLE
    //                        WALLS_STONE_COBBLE
    public static final Block PILAR_STONE_COBBLE       = new BlockPilar(MODID,"pilar_stone_cobble", Blocks.STONE);
    //                        BLOCK_STONE_COBBLE_MOSS
    //                        SLABS_STONE_COBBLE_MOSS
    //                        STAIR_STONE_COBBLE_MOSS
    //                        WALLS_STONE_COBBLE_MOSS
    public static final Block PILAR_STONE_COBBLE_MOSS  = new BlockPilar(MODID,"pilar_stone_cobble_moss", Blocks.STONE);
    //                        BLOCK_STONE_SMOOTH
    //                        SLABS_STONE_SMOOTH
    public static final Block STAIR_STONE_SMOOTH        = new BlockStair(MODID,"stair_stone_smooth", Blocks.STONE);
    public static final Block WALLS_STONE_SMOOTH        = new BlockWalls(MODID,"walls_stone_smooth", Blocks.STONE);
    public static final Block PILAR_STONE_SMOOTH        = new BlockPilar(MODID,"pilar_stone_smooth", Blocks.STONE);
    //                        BLOCK_STONE_BRICK
    //                        SLABS_STONE_BRICK
    //                        STAIR_STONE_BRICK
    //                        WALLS_STONE_BRICK
    public static final Block PILAR_STONE_BRICK        = new BlockPilar(MODID,"pilar_stone_brick", Blocks.STONE);
    //                        BLOCK_STONE_BRICK_MOSS
    //                        SLABS_STONE_BRICK_MOSS
    //                        STAIR_STONE_BRICK_MOSS
    //                        WALLS_STONE_BRICK_MOSS
    public static final Block PILAR_STONE_BRICK_MOSS        = new BlockPilar(MODID,"pilar_stone_brick_moss", Blocks.STONE);
    //                        BLOCK_STONE_BRICK_CRACKED
    public static final Block SLABS_STONE_BRICK_CRACKED = new BlockSlabs(MODID,"slabs_stone_brick_cracked", Blocks.STONE);
    public static final Block STAIR_STONE_BRICK_CRACKED = new BlockStair(MODID,"stair_stone_brick_cracked", Blocks.STONE);
    public static final Block WALLS_STONE_BRICK_CRACKED = new BlockWalls(MODID,"walls_stone_brick_cracked", Blocks.STONE);
    public static final Block PILAR_STONE_BRICK_CRACKED = new BlockPilar(MODID,"pilar_stone_brick_cracked", Blocks.STONE);
    //                        BLOCK_STONE_BRICK_CARVED

    //                        BLOCK_GRANITE_STONE
    //                        SLABS_GRANITE_STONE
    //                        STAIR_GRANITE_STONE
    //                        WALLS_GRANITE_STONE
    public static final Block PILAR_GRANITE_STONE        = new BlockPilar(MODID,"pilar_granite_stone", Blocks.GRANITE);
    public static final Block BLOCK_GRANITE_COBBLE        = new BlockBlock(MODID, "block_granite_cobble",      Blocks.GRANITE);
    public static final Block SLABS_GRANITE_COBBLE        = new BlockSlabs(MODID, "slabs_granite_cobble",      Blocks.GRANITE);
    public static final Block STAIR_GRANITE_COBBLE        = new BlockStair(MODID, "stair_granite_cobble",      Blocks.GRANITE);
    public static final Block WALLS_GRANITE_COBBLE        = new BlockWalls(MODID, "walls_granite_cobble",      Blocks.GRANITE);
    public static final Block PILAR_GRANITE_COBBLE        = new BlockPilar(MODID,"pilar_granite_cobble", Blocks.GRANITE);
    public static final Block BLOCK_GRANITE_COBBLE_MOSS   = new BlockBlock(MODID, "block_granite_cobble_moss", Blocks.GRANITE);
    public static final Block SLABS_GRANITE_COBBLE_MOSS   = new BlockSlabs(MODID, "slabs_granite_cobble_moss", Blocks.GRANITE);
    public static final Block STAIR_GRANITE_COBBLE_MOSS   = new BlockStair(MODID, "stair_granite_cobble_moss", Blocks.GRANITE);
    public static final Block WALLS_GRANITE_COBBLE_MOSS   = new BlockWalls(MODID, "walls_granite_cobble_moss", Blocks.GRANITE);
    public static final Block PILAR_GRANITE_COBBLE_MOSS   = new BlockPilar(MODID,"pilar_granite_cobble_moss", Blocks.GRANITE);
    //                        BLOCK_GRANITE_SMOOTH
    //                        SLABS_GRANITE_SMOOTH
    //                        STAIR_GRANITE_SMOOTH
    public static final Block WALLS_GRANITE_SMOOTH        = new BlockWalls(MODID, "walls_granite_smooth",        Blocks.GRANITE);
    public static final Block PILAR_GRANITE_SMOOTH        = new BlockPilar(MODID,"pilar_granite_smooth", Blocks.GRANITE);
    public static final Block BLOCK_GRANITE_BRICK         = new BlockBlock(MODID, "block_granite_brick",         Blocks.GRANITE);
    public static final Block SLABS_GRANITE_BRICK         = new BlockSlabs(MODID, "slabs_granite_brick",         Blocks.GRANITE);
    public static final Block STAIR_GRANITE_BRICK         = new BlockStair(MODID, "stair_granite_brick",         Blocks.GRANITE);
    public static final Block WALLS_GRANITE_BRICK         = new BlockWalls(MODID, "walls_granite_brick",         Blocks.GRANITE);
    public static final Block PILAR_GRANITE_BRICK        = new BlockPilar(MODID,"pilar_granite_brick", Blocks.GRANITE);
    public static final Block BLOCK_GRANITE_BRICK_MOSS    = new BlockBlock(MODID, "block_granite_brick_moss",    Blocks.GRANITE);
    public static final Block SLABS_GRANITE_BRICK_MOSS    = new BlockSlabs(MODID, "slabs_granite_brick_moss",    Blocks.GRANITE);
    public static final Block STAIR_GRANITE_BRICK_MOSS    = new BlockStair(MODID, "stair_granite_brick_moss",    Blocks.GRANITE);
    public static final Block WALLS_GRANITE_BRICK_MOSS    = new BlockWalls(MODID, "walls_granite_brick_moss",    Blocks.GRANITE);
    public static final Block PILAR_GRANITE_BRICK_MOSS        = new BlockPilar(MODID,"pilar_granite_brick_moss", Blocks.GRANITE);
    public static final Block BLOCK_GRANITE_BRICK_CRACKED = new BlockBlock(MODID, "block_granite_brick_cracked", Blocks.GRANITE);
    public static final Block SLABS_GRANITE_BRICK_CRACKED = new BlockSlabs(MODID, "slabs_granite_brick_cracked", Blocks.GRANITE);
    public static final Block STAIR_GRANITE_BRICK_CRACKED = new BlockStair(MODID, "stair_granite_brick_cracked", Blocks.GRANITE);
    public static final Block WALLS_GRANITE_BRICK_CRACKED = new BlockWalls(MODID, "walls_granite_brick_cracked", Blocks.GRANITE);
    public static final Block PILAR_GRANITE_BRICK_CRACKED        = new BlockPilar(MODID,"pilar_granite_brick_cracked", Blocks.GRANITE);
    public static final Block BLOCK_GRANITE_BRICK_CARVED  = new BlockBlock(MODID, "block_granite_brick_carved",  Blocks.GRANITE);

    //                        BLOCK_DIORITE_STONE
    //                        SLABS_DIORITE_STONE
    //                        STAIR_DIORITE_STONE
    //                        WALLS_DIORITE_STONE
    public static final Block PILAR_DIORITE_STONE        = new BlockPilar(MODID,"pilar_diorite_stone", Blocks.DIORITE);
    public static final Block BLOCK_DIORITE_COBBLE        = new BlockBlock(MODID, "block_diorite_cobble",      Blocks.DIORITE);
    public static final Block SLABS_DIORITE_COBBLE        = new BlockSlabs(MODID, "slabs_diorite_cobble",      Blocks.DIORITE);
    public static final Block STAIR_DIORITE_COBBLE        = new BlockStair(MODID, "stair_diorite_cobble",      Blocks.DIORITE);
    public static final Block WALLS_DIORITE_COBBLE        = new BlockWalls(MODID, "walls_diorite_cobble",      Blocks.DIORITE);
    public static final Block PILAR_DIORITE_COBBLE        = new BlockPilar(MODID,"pilar_diorite_cobble", Blocks.DIORITE);
    public static final Block BLOCK_DIORITE_COBBLE_MOSS   = new BlockBlock(MODID, "block_diorite_cobble_moss", Blocks.DIORITE);
    public static final Block SLABS_DIORITE_COBBLE_MOSS   = new BlockSlabs(MODID, "slabs_diorite_cobble_moss", Blocks.DIORITE);
    public static final Block STAIR_DIORITE_COBBLE_MOSS   = new BlockStair(MODID, "stair_diorite_cobble_moss", Blocks.DIORITE);
    public static final Block WALLS_DIORITE_COBBLE_MOSS   = new BlockWalls(MODID, "walls_diorite_cobble_moss", Blocks.DIORITE);
    public static final Block PILAR_DIORITE_COBBLE_MOSS        = new BlockPilar(MODID,"pilar_diorite_cobble_moss", Blocks.DIORITE);
    //                        BLOCK_DIORITE_SMOOTH
    //                        SLABS_DIORITE_SMOOTH
    //                        STAIR_DIORITE_SMOOTH
    public static final Block WALLS_DIORITE_SMOOTH        = new BlockWalls(MODID, "walls_diorite_smooth",        Blocks.DIORITE);
    public static final Block PILAR_DIORITE_SMOOTH        = new BlockPilar(MODID,"pilar_diorite_smooth", Blocks.DIORITE);
    public static final Block BLOCK_DIORITE_BRICK         = new BlockBlock(MODID, "block_diorite_brick",         Blocks.DIORITE);
    public static final Block SLABS_DIORITE_BRICK         = new BlockSlabs(MODID, "slabs_diorite_brick",         Blocks.DIORITE);
    public static final Block STAIR_DIORITE_BRICK         = new BlockStair(MODID, "stair_diorite_brick",         Blocks.DIORITE);
    public static final Block WALLS_DIORITE_BRICK         = new BlockWalls(MODID, "walls_diorite_brick",         Blocks.DIORITE);
    public static final Block PILAR_DIORITE_BRICK        = new BlockPilar(MODID,"pilar_diorite_brick", Blocks.DIORITE);
    public static final Block BLOCK_DIORITE_BRICK_MOSS    = new BlockBlock(MODID, "block_diorite_brick_moss",    Blocks.DIORITE);
    public static final Block SLABS_DIORITE_BRICK_MOSS    = new BlockSlabs(MODID, "slabs_diorite_brick_moss",    Blocks.DIORITE);
    public static final Block STAIR_DIORITE_BRICK_MOSS    = new BlockStair(MODID, "stair_diorite_brick_moss",    Blocks.DIORITE);
    public static final Block WALLS_DIORITE_BRICK_MOSS    = new BlockWalls(MODID, "walls_diorite_brick_moss",    Blocks.DIORITE);
    public static final Block PILAR_DIORITE_BRICK_MOSS        = new BlockPilar(MODID,"pilar_diorite_brick_moss", Blocks.DIORITE);
    public static final Block BLOCK_DIORITE_BRICK_CRACKED = new BlockBlock(MODID, "block_diorite_brick_cracked", Blocks.DIORITE);
    public static final Block SLABS_DIORITE_BRICK_CRACKED = new BlockSlabs(MODID, "slabs_diorite_brick_cracked", Blocks.DIORITE);
    public static final Block STAIR_DIORITE_BRICK_CRACKED = new BlockStair(MODID, "stair_diorite_brick_cracked", Blocks.DIORITE);
    public static final Block WALLS_DIORITE_BRICK_CRACKED = new BlockWalls(MODID, "walls_diorite_brick_cracked", Blocks.DIORITE);
    public static final Block PILAR_DIORITE_BRICK_CRACKED        = new BlockPilar(MODID,"pilar_diorite_brick_cracked", Blocks.DIORITE);
    public static final Block BLOCK_DIORITE_BRICK_CARVED  = new BlockBlock(MODID, "block_diorite_brick_carved",  Blocks.DIORITE);

    //                        BLOCK_ANDESITE_STONE
    //                        SLABS_ANDESITE_STONE
    //                        STAIR_ANDESITE_STONE
    //                        WALLS_ANDESITE_STONE
    public static final Block PILAR_ANDESITE_STONE        = new BlockPilar(MODID,"pilar_andesite_stone", Blocks.ANDESITE);
    public static final Block BLOCK_ANDESITE_COBBLE        = new BlockBlock(MODID, "block_andesite_cobble",      Blocks.ANDESITE);
    public static final Block SLABS_ANDESITE_COBBLE        = new BlockSlabs(MODID, "slabs_andesite_cobble",      Blocks.ANDESITE);
    public static final Block STAIR_ANDESITE_COBBLE        = new BlockStair(MODID, "stair_andesite_cobble",      Blocks.ANDESITE);
    public static final Block WALLS_ANDESITE_COBBLE        = new BlockWalls(MODID, "walls_andesite_cobble",      Blocks.ANDESITE);
    public static final Block PILAR_ANDESITE_COBBLE        = new BlockPilar(MODID,"pilar_andesite_cobble", Blocks.ANDESITE);
    public static final Block BLOCK_ANDESITE_COBBLE_MOSS   = new BlockBlock(MODID, "block_andesite_cobble_moss", Blocks.ANDESITE);
    public static final Block SLABS_ANDESITE_COBBLE_MOSS   = new BlockSlabs(MODID, "slabs_andesite_cobble_moss", Blocks.ANDESITE);
    public static final Block STAIR_ANDESITE_COBBLE_MOSS   = new BlockStair(MODID, "stair_andesite_cobble_moss", Blocks.ANDESITE);
    public static final Block WALLS_ANDESITE_COBBLE_MOSS   = new BlockWalls(MODID, "walls_andesite_cobble_moss", Blocks.ANDESITE);
    public static final Block PILAR_ANDESITE_COBBLE_MOSS        = new BlockPilar(MODID,"pilar_andesite_cobble_moss", Blocks.ANDESITE);
    //                        BLOCK_ANDESITE_SMOOTH
    //                        SLABS_ANDESITE_SMOOTH
    //                        STAIR_ANDESITE_SMOOTH
    public static final Block WALLS_ANDESITE_SMOOTH        = new BlockWalls(MODID, "walls_andesite_smooth",        Blocks.ANDESITE);
    public static final Block PILAR_ANDESITE_SMOOTH        = new BlockPilar(MODID,"pilar_andesite_smooth", Blocks.ANDESITE);
    public static final Block BLOCK_ANDESITE_BRICK         = new BlockBlock(MODID, "block_andesite_brick",         Blocks.ANDESITE);
    public static final Block SLABS_ANDESITE_BRICK         = new BlockSlabs(MODID, "slabs_andesite_brick",         Blocks.ANDESITE);
    public static final Block STAIR_ANDESITE_BRICK         = new BlockStair(MODID, "stair_andesite_brick",         Blocks.ANDESITE);
    public static final Block WALLS_ANDESITE_BRICK         = new BlockWalls(MODID, "walls_andesite_brick",         Blocks.ANDESITE);
    public static final Block PILAR_ANDESITE_BRICK        = new BlockPilar(MODID,"pilar_andesite_brick", Blocks.ANDESITE);
    public static final Block BLOCK_ANDESITE_BRICK_MOSS    = new BlockBlock(MODID, "block_andesite_brick_moss",    Blocks.ANDESITE);
    public static final Block SLABS_ANDESITE_BRICK_MOSS    = new BlockSlabs(MODID, "slabs_andesite_brick_moss",    Blocks.ANDESITE);
    public static final Block STAIR_ANDESITE_BRICK_MOSS    = new BlockStair(MODID, "stair_andesite_brick_moss",    Blocks.ANDESITE);
    public static final Block WALLS_ANDESITE_BRICK_MOSS    = new BlockWalls(MODID, "walls_andesite_brick_moss",    Blocks.ANDESITE);
    public static final Block PILAR_ANDESITE_BRICK_MOSS        = new BlockPilar(MODID,"pilar_andesite_brick_moss", Blocks.ANDESITE);
    public static final Block BLOCK_ANDESITE_BRICK_CRACKED = new BlockBlock(MODID, "block_andesite_brick_cracked", Blocks.ANDESITE);
    public static final Block SLABS_ANDESITE_BRICK_CRACKED = new BlockSlabs(MODID, "slabs_andesite_brick_cracked", Blocks.ANDESITE);
    public static final Block STAIR_ANDESITE_BRICK_CRACKED = new BlockStair(MODID, "stair_andesite_brick_cracked", Blocks.ANDESITE);
    public static final Block WALLS_ANDESITE_BRICK_CRACKED = new BlockWalls(MODID, "walls_andesite_brick_cracked", Blocks.ANDESITE);
    public static final Block PILAR_ANDESITE_BRICK_CRACKED        = new BlockPilar(MODID,"pilar_andesite_brick_cracked", Blocks.ANDESITE);
    public static final Block BLOCK_ANDESITE_BRICK_CARVED  = new BlockBlock(MODID, "block_andesite_brick_carved",  Blocks.ANDESITE);

    //                        SLABS_PRISMARINE_STONE
    //                        STAIR_PRISMARINE_STONE
    //                        WALLS_PRISMARINE_STONE
    public static final Block PILAR_PRISMARINE_STONE        = new BlockPilar(MODID,"pilar_prismarine_stone", Blocks.PRISMARINE);
    //                        SLABS_PRISMARINE_BRICK
    //                        STAIR_PRISMARINE_BRICK
    public static final Block WALLS_PRISMARINE_BRICK = new BlockWalls(MODID, "walls_prismarine_brick", Blocks.PRISMARINE);
    public static final Block PILAR_PRISMARINE_BRICK        = new BlockPilar(MODID,"pilar_prismarine_brick", Blocks.PRISMARINE);
    //                        SLABS_PRISMARINE_DARK
    //                        STAIR_PRISMARINE_DARK
    public static final Block WALLS_PRISMARINE_DARK  = new BlockWalls(MODID, "walls_prismarine_dark", Blocks.PRISMARINE);
    public static final Block PILAR_PRISMARINE_DARK        = new BlockPilar(MODID,"pilar_prismarine_dark", Blocks.PRISMARINE);

    //                        BLOCK_END_STONE
    public static final Block SLABS_END_STONE         = new BlockSlabs(MODID, "slabs_end_stone",       Blocks.END_STONE);
    public static final Block STAIR_END_STONE         = new BlockStair(MODID, "stair_end_stone",       Blocks.END_STONE);
    public static final Block WALLS_END_STONE         = new BlockWalls(MODID, "walls_end_stone",       Blocks.END_STONE);
    public static final Block PILAR_END_STONE        = new BlockPilar(MODID,"pilar_end_stone", Blocks.END_STONE);
    public static final Block BLOCK_END_COBBLE        = new BlockBlock(MODID, "block_end_cobble",      Blocks.END_STONE);
    public static final Block SLABS_END_COBBLE        = new BlockSlabs(MODID, "slabs_end_cobble",      Blocks.END_STONE);
    public static final Block STAIR_END_COBBLE        = new BlockStair(MODID, "stair_end_cobble",      Blocks.END_STONE);
    public static final Block WALLS_END_COBBLE        = new BlockWalls(MODID, "walls_end_cobble",      Blocks.END_STONE);
    public static final Block PILAR_END_COBBLE        = new BlockPilar(MODID,"pilar_end_cobble", Blocks.END_STONE);
    public static final Block BLOCK_END_COBBLE_MOSS   = new BlockBlock(MODID, "block_end_cobble_moss", Blocks.END_STONE);
    public static final Block SLABS_END_COBBLE_MOSS   = new BlockSlabs(MODID, "slabs_end_cobble_moss", Blocks.END_STONE);
    public static final Block STAIR_END_COBBLE_MOSS   = new BlockStair(MODID, "stair_end_cobble_moss", Blocks.END_STONE);
    public static final Block WALLS_END_COBBLE_MOSS   = new BlockWalls(MODID, "walls_end_cobble_moss", Blocks.END_STONE);
    public static final Block PILAR_END_COBBLE_MOSS        = new BlockPilar(MODID,"pilar_end_cobble_moss", Blocks.END_STONE);
    public static final Block BLOCK_END_SMOOTH        = new BlockBlock(MODID, "block_end_smooth",      Blocks.END_STONE);
    public static final Block SLABS_END_SMOOTH        = new BlockSlabs(MODID, "slabs_end_smooth",      Blocks.END_STONE);
    public static final Block STAIR_END_SMOOTH        = new BlockStair(MODID, "stair_end_smooth",      Blocks.END_STONE);
    public static final Block WALLS_END_SMOOTH        = new BlockWalls(MODID, "walls_end_smooth",      Blocks.END_STONE);
    public static final Block PILAR_END_SMOOTH        = new BlockPilar(MODID,"pilar_end_smooth", Blocks.END_STONE);
    //                        BLOCK_END_BRICK
    //                        SLABS_END_BRICK
    //                        STAIR_END_BRICK
    //                        WALLS_END_BRICK
    public static final Block PILAR_END_BRICK        = new BlockPilar(MODID,"pilar_end_brick", Blocks.END_STONE);
    public static final Block BLOCK_END_BRICK_MOSS    = new BlockBlock(MODID, "block_end_brick_moss",    Blocks.END_STONE);
    public static final Block SLABS_END_BRICK_MOSS    = new BlockSlabs(MODID, "slabs_end_brick_moss",    Blocks.END_STONE);
    public static final Block STAIR_END_BRICK_MOSS    = new BlockStair(MODID, "stair_end_brick_moss",    Blocks.END_STONE);
    public static final Block WALLS_END_BRICK_MOSS    = new BlockWalls(MODID, "walls_end_brick_moss",    Blocks.END_STONE);
    public static final Block PILAR_END_BRICK_MOSS        = new BlockPilar(MODID,"pilar_end_brick_moss", Blocks.END_STONE);
    public static final Block BLOCK_END_BRICK_CRACKED = new BlockBlock(MODID, "block_end_brick_cracked", Blocks.END_STONE);
    public static final Block SLABS_END_BRICK_CRACKED = new BlockSlabs(MODID, "slabs_end_brick_cracked", Blocks.END_STONE);
    public static final Block STAIR_END_BRICK_CRACKED = new BlockStair(MODID, "stair_end_brick_cracked", Blocks.END_STONE);
    public static final Block WALLS_END_BRICK_CRACKED = new BlockWalls(MODID, "walls_end_brick_cracked", Blocks.END_STONE);
    public static final Block PILAR_END_BRICK_CRACKED        = new BlockPilar(MODID,"pilar_end_brick_cracked", Blocks.END_STONE);
    public static final Block BLOCK_END_BRICK_CARVED  = new BlockBlock(MODID, "block_end_brick_carved",  Blocks.END_STONE);

    public static final Block SLABS_CONCRETE_WHITE     = new BlockSlabs(MODID, "slabs_concrete_white",     Blocks.WHITE_CONCRETE);
    public static final Block STAIR_CONCRETE_WHITE     = new BlockStair(MODID, "stair_concrete_white",     Blocks.WHITE_CONCRETE);
    public static final Block WALLS_CONCRETE_WHITE     = new BlockWalls(MODID, "walls_concrete_white",     Blocks.WHITE_CONCRETE);
    public static final Block PILAR_CONCRETE_WHITE        = new BlockPilar(MODID,"pilar_concrete_white", Blocks.WHITE_CONCRETE);
    public static final Block SLABS_CONCRETE_ORANGE    = new BlockSlabs(MODID, "slabs_concrete_orange",    Blocks.ORANGE_CONCRETE);
    public static final Block STAIR_CONCRETE_ORANGE    = new BlockStair(MODID, "stair_concrete_orange",    Blocks.ORANGE_CONCRETE);
    public static final Block WALLS_CONCRETE_ORANGE    = new BlockWalls(MODID, "walls_concrete_orange",    Blocks.ORANGE_CONCRETE);
    public static final Block PILAR_CONCRETE_ORANGE        = new BlockPilar(MODID,"pilar_concrete_orange", Blocks.ORANGE_CONCRETE);
    public static final Block SLABS_CONCRETE_MAGENTA   = new BlockSlabs(MODID, "slabs_concrete_magenta",   Blocks.MAGENTA_CONCRETE);
    public static final Block STAIR_CONCRETE_MAGENTA   = new BlockStair(MODID, "stair_concrete_magenta",   Blocks.MAGENTA_CONCRETE);
    public static final Block WALLS_CONCRETE_MAGENTA   = new BlockWalls(MODID, "walls_concrete_magenta",   Blocks.MAGENTA_CONCRETE);
    public static final Block PILAR_CONCRETE_MAGENTA        = new BlockPilar(MODID,"pilar_concrete_magenta", Blocks.MAGENTA_CONCRETE);
    public static final Block SLABS_CONCRETE_LIGHTBLUE = new BlockSlabs(MODID, "slabs_concrete_lightblue", Blocks.LIGHT_BLUE_CONCRETE);
    public static final Block STAIR_CONCRETE_LIGHTBLUE = new BlockStair(MODID, "stair_concrete_lightblue", Blocks.LIGHT_BLUE_CONCRETE);
    public static final Block WALLS_CONCRETE_LIGHTBLUE = new BlockWalls(MODID, "walls_concrete_lightblue", Blocks.LIGHT_BLUE_CONCRETE);
    public static final Block PILAR_CONCRETE_LIGHTBLUE        = new BlockPilar(MODID,"pilar_concrete_lightblue", Blocks.LIGHT_BLUE_CONCRETE);
    public static final Block SLABS_CONCRETE_YELLOW    = new BlockSlabs(MODID, "slabs_concrete_yellow",    Blocks.YELLOW_CONCRETE);
    public static final Block STAIR_CONCRETE_YELLOW    = new BlockStair(MODID, "stair_concrete_yellow",    Blocks.YELLOW_CONCRETE);
    public static final Block WALLS_CONCRETE_YELLOW    = new BlockWalls(MODID, "walls_concrete_yellow",    Blocks.YELLOW_CONCRETE);
    public static final Block PILAR_CONCRETE_YELLOW        = new BlockPilar(MODID,"pilar_concrete_yellow", Blocks.YELLOW_CONCRETE);
    public static final Block SLABS_CONCRETE_LIME      = new BlockSlabs(MODID, "slabs_concrete_lime",      Blocks.LIME_CONCRETE);
    public static final Block STAIR_CONCRETE_LIME      = new BlockStair(MODID, "stair_concrete_lime",      Blocks.LIME_CONCRETE);
    public static final Block WALLS_CONCRETE_LIME      = new BlockWalls(MODID, "walls_concrete_lime",      Blocks.LIME_CONCRETE);
    public static final Block PILAR_CONCRETE_LIME        = new BlockPilar(MODID,"pilar_concrete_lime", Blocks.LIME_CONCRETE);
    public static final Block SLABS_CONCRETE_PINK      = new BlockSlabs(MODID, "slabs_concrete_pink",      Blocks.PINK_CONCRETE);
    public static final Block STAIR_CONCRETE_PINK      = new BlockStair(MODID, "stair_concrete_pink",      Blocks.PINK_CONCRETE);
    public static final Block WALLS_CONCRETE_PINK      = new BlockWalls(MODID, "walls_concrete_pink",      Blocks.PINK_CONCRETE);
    public static final Block PILAR_CONCRETE_PINK        = new BlockPilar(MODID,"pilar_concrete_pink", Blocks.PINK_CONCRETE);
    public static final Block SLABS_CONCRETE_GRAY      = new BlockSlabs(MODID, "slabs_concrete_gray",      Blocks.GRAY_CONCRETE);
    public static final Block STAIR_CONCRETE_GRAY      = new BlockStair(MODID, "stair_concrete_gray",      Blocks.GRAY_CONCRETE);
    public static final Block WALLS_CONCRETE_GRAY      = new BlockWalls(MODID, "walls_concrete_gray",      Blocks.GRAY_CONCRETE);
    public static final Block PILAR_CONCRETE_GRAY        = new BlockPilar(MODID,"pilar_concrete_gray", Blocks.GRAY_CONCRETE);
    public static final Block SLABS_CONCRETE_SILVER    = new BlockSlabs(MODID, "slabs_concrete_silver",    Blocks.LIGHT_GRAY_CONCRETE);
    public static final Block STAIR_CONCRETE_SILVER    = new BlockStair(MODID, "stair_concrete_silver",    Blocks.LIGHT_GRAY_CONCRETE);
    public static final Block WALLS_CONCRETE_SILVER    = new BlockWalls(MODID, "walls_concrete_silver",    Blocks.LIGHT_GRAY_CONCRETE);
    public static final Block PILAR_CONCRETE_SILVER        = new BlockPilar(MODID,"pilar_concrete_silver", Blocks.LIGHT_GRAY_CONCRETE);
    public static final Block SLABS_CONCRETE_CYAN      = new BlockSlabs(MODID, "slabs_concrete_cyan",      Blocks.CYAN_CONCRETE);
    public static final Block STAIR_CONCRETE_CYAN      = new BlockStair(MODID, "stair_concrete_cyan",      Blocks.CYAN_CONCRETE);
    public static final Block WALLS_CONCRETE_CYAN      = new BlockWalls(MODID, "walls_concrete_cyan",      Blocks.CYAN_CONCRETE);
    public static final Block PILAR_CONCRETE_CYAN        = new BlockPilar(MODID,"pilar_concrete_cyan", Blocks.CYAN_CONCRETE);
    public static final Block SLABS_CONCRETE_PURPLE    = new BlockSlabs(MODID, "slabs_concrete_purple",    Blocks.PURPLE_CONCRETE);
    public static final Block STAIR_CONCRETE_PURPLE    = new BlockStair(MODID, "stair_concrete_purple",    Blocks.PURPLE_CONCRETE);
    public static final Block WALLS_CONCRETE_PURPLE    = new BlockWalls(MODID, "walls_concrete_purple",    Blocks.PURPLE_CONCRETE);
    public static final Block PILAR_CONCRETE_PURPLE        = new BlockPilar(MODID,"pilar_concrete_purple", Blocks.PURPLE_CONCRETE);
    public static final Block SLABS_CONCRETE_BLUE      = new BlockSlabs(MODID, "slabs_concrete_blue",      Blocks.BLUE_CONCRETE);
    public static final Block STAIR_CONCRETE_BLUE      = new BlockStair(MODID, "stair_concrete_blue",      Blocks.BLUE_CONCRETE);
    public static final Block WALLS_CONCRETE_BLUE      = new BlockWalls(MODID, "walls_concrete_blue",      Blocks.BLUE_CONCRETE);
    public static final Block PILAR_CONCRETE_BLUE        = new BlockPilar(MODID,"pilar_concrete_blue", Blocks.BLUE_CONCRETE);
    public static final Block SLABS_CONCRETE_BROWN     = new BlockSlabs(MODID, "slabs_concrete_brown",     Blocks.BROWN_CONCRETE);
    public static final Block STAIR_CONCRETE_BROWN     = new BlockStair(MODID, "stair_concrete_brown",     Blocks.BROWN_CONCRETE);
    public static final Block WALLS_CONCRETE_BROWN     = new BlockWalls(MODID, "walls_concrete_brown",     Blocks.BROWN_CONCRETE);
    public static final Block PILAR_CONCRETE_BROWN        = new BlockPilar(MODID,"pilar_concrete_brown", Blocks.BROWN_CONCRETE);
    public static final Block SLABS_CONCRETE_GREEN     = new BlockSlabs(MODID, "slabs_concrete_green",     Blocks.GREEN_CONCRETE);
    public static final Block STAIR_CONCRETE_GREEN     = new BlockStair(MODID, "stair_concrete_green",     Blocks.GREEN_CONCRETE);
    public static final Block WALLS_CONCRETE_GREEN     = new BlockWalls(MODID, "walls_concrete_green",     Blocks.GREEN_CONCRETE);
    public static final Block PILAR_CONCRETE_GREEN        = new BlockPilar(MODID,"pilar_concrete_green", Blocks.GREEN_CONCRETE);
    public static final Block SLABS_CONCRETE_RED       = new BlockSlabs(MODID, "slabs_concrete_red",       Blocks.RED_CONCRETE);
    public static final Block STAIR_CONCRETE_RED       = new BlockStair(MODID, "stair_concrete_red",       Blocks.RED_CONCRETE);
    public static final Block WALLS_CONCRETE_RED       = new BlockWalls(MODID, "walls_concrete_red",       Blocks.RED_CONCRETE);
    public static final Block PILAR_CONCRETE_RED        = new BlockPilar(MODID,"pilar_concrete_red", Blocks.RED_CONCRETE);
    public static final Block SLABS_CONCRETE_BLACK     = new BlockSlabs(MODID, "slabs_concrete_black",     Blocks.BLACK_CONCRETE);
    public static final Block STAIR_CONCRETE_BLACK     = new BlockStair(MODID, "stair_concrete_black",     Blocks.BLACK_CONCRETE);
    public static final Block WALLS_CONCRETE_BLACK     = new BlockWalls(MODID, "walls_concrete_black",     Blocks.BLACK_CONCRETE);
    public static final Block PILAR_CONCRETE_BLACK        = new BlockPilar(MODID,"pilar_concrete_black", Blocks.BLACK_CONCRETE);

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
    public static final Block BLOCK_CHAIN_IRON  = new BlockChain(MODID,       "block_chain_iron",   Blocks.IRON_BLOCK);
    public static final Block BLOCK_CHAIN_GOLD  = new BlockChain(MODID,       "block_chain_gold",   Blocks.GOLD_BLOCK);

    public static final Block BLOCK_GARGOYLE_STONE    = new BlockGargoyle(MODID, "block_gargoyle_stone",    Blocks.STONE);
    public static final Block BLOCK_GARGOYLE_GRANITE  = new BlockGargoyle(MODID, "block_gargoyle_granite",  Blocks.GRANITE);
    public static final Block BLOCK_GARGOYLE_DIORITE  = new BlockGargoyle(MODID, "block_gargoyle_diorite",  Blocks.DIORITE);
    public static final Block BLOCK_GARGOYLE_ANDESITE = new BlockGargoyle(MODID, "block_gargoyle_andesite", Blocks.ANDESITE);
    public static final Block BLOCK_GARGOYLE_END      = new BlockGargoyle(MODID, "block_gargoyle_end",      Blocks.END_STONE);

    public static final Block BLOCK_EMITTER = new BlockEmitter(MODID, "block_emitter", Blocks.DISPENSER);

    public static final Block BLOCK_LIGHT_WHITE     = new BlockLight(MODID, "block_light_white",     Blocks.WHITE_STAINED_GLASS);
    public static final Block BLOCK_LIGHT_ORANGE    = new BlockLight(MODID, "block_light_orange",    Blocks.ORANGE_STAINED_GLASS);
    public static final Block BLOCK_LIGHT_MAGENTA   = new BlockLight(MODID, "block_light_magenta",   Blocks.MAGENTA_STAINED_GLASS);
    public static final Block BLOCK_LIGHT_LIGHTBLUE = new BlockLight(MODID, "block_light_lightblue", Blocks.LIGHT_BLUE_STAINED_GLASS);
    public static final Block BLOCK_LIGHT_YELLOW    = new BlockLight(MODID, "block_light_yellow",    Blocks.YELLOW_STAINED_GLASS);
    public static final Block BLOCK_LIGHT_LIME      = new BlockLight(MODID, "block_light_lime",      Blocks.LIME_STAINED_GLASS);
    public static final Block BLOCK_LIGHT_PINK      = new BlockLight(MODID, "block_light_pink",      Blocks.PINK_STAINED_GLASS);
    public static final Block BLOCK_LIGHT_GRAY      = new BlockLight(MODID, "block_light_gray",      Blocks.GRAY_STAINED_GLASS);
    public static final Block BLOCK_LIGHT_SILVER    = new BlockLight(MODID, "block_light_silver",    Blocks.LIGHT_GRAY_STAINED_GLASS);
    public static final Block BLOCK_LIGHT_CYAN      = new BlockLight(MODID, "block_light_cyan",      Blocks.CYAN_STAINED_GLASS);
    public static final Block BLOCK_LIGHT_PURPLE    = new BlockLight(MODID, "block_light_purple",    Blocks.PURPLE_STAINED_GLASS);
    public static final Block BLOCK_LIGHT_BLUE      = new BlockLight(MODID, "block_light_blue",      Blocks.BLUE_STAINED_GLASS);
    public static final Block BLOCK_LIGHT_BROWN     = new BlockLight(MODID, "block_light_brown",     Blocks.BROWN_STAINED_GLASS);
    public static final Block BLOCK_LIGHT_GREEN     = new BlockLight(MODID, "block_light_green",     Blocks.GREEN_STAINED_GLASS);
    public static final Block BLOCK_LIGHT_RED       = new BlockLight(MODID, "block_light_red",       Blocks.RED_STAINED_GLASS);
    public static final Block BLOCK_LIGHT_BLACK     = new BlockLight(MODID, "block_light_black",     Blocks.BLACK_STAINED_GLASS);

    /**Register all stuff, pre is true during preInit and false during Init**/
    public static void registerStuff(){

        // Stone
        //Register.registerBlock(SLABS_STONE_STONE,         ItemGroup.BUILDING_BLOCKS);

        Register.registerBlock(WALLS_STONE_STONE,         ItemGroup.DECORATIONS);
        Register.registerBlock(PILAR_STONE_STONE,         ItemGroup.DECORATIONS);
        Register.registerBlock(PILAR_STONE_COBBLE,         ItemGroup.DECORATIONS);
        Register.registerBlock(PILAR_STONE_COBBLE_MOSS,         ItemGroup.DECORATIONS);
        Register.registerBlock(STAIR_STONE_SMOOTH,        ItemGroup.BUILDING_BLOCKS);
        Register.registerBlock(WALLS_STONE_SMOOTH,        ItemGroup.DECORATIONS);
        Register.registerBlock(PILAR_STONE_SMOOTH,         ItemGroup.DECORATIONS);
        Register.registerBlock(PILAR_STONE_BRICK,         ItemGroup.DECORATIONS);
        Register.registerBlock(PILAR_STONE_BRICK_MOSS,         ItemGroup.DECORATIONS);
        Register.registerBlock(SLABS_STONE_BRICK_CRACKED, ItemGroup.BUILDING_BLOCKS);
        Register.registerBlock(STAIR_STONE_BRICK_CRACKED, ItemGroup.BUILDING_BLOCKS);
        Register.registerBlock(WALLS_STONE_BRICK_CRACKED, ItemGroup.DECORATIONS);
        Register.registerBlock(PILAR_STONE_BRICK_CRACKED,         ItemGroup.DECORATIONS);

        // Granite
        Register.registerBlock(PILAR_GRANITE_STONE,         ItemGroup.DECORATIONS);
        Register.registerBlock(BLOCK_GRANITE_COBBLE,        ItemGroup.BUILDING_BLOCKS);
        Register.registerBlock(SLABS_GRANITE_COBBLE,        ItemGroup.BUILDING_BLOCKS);
        Register.registerBlock(STAIR_GRANITE_COBBLE,        ItemGroup.BUILDING_BLOCKS);
        Register.registerBlock(WALLS_GRANITE_COBBLE,        ItemGroup.DECORATIONS);
        Register.registerBlock(PILAR_GRANITE_COBBLE,         ItemGroup.DECORATIONS);
        Register.registerBlock(BLOCK_GRANITE_COBBLE_MOSS,   ItemGroup.BUILDING_BLOCKS);
        Register.registerBlock(SLABS_GRANITE_COBBLE_MOSS,   ItemGroup.BUILDING_BLOCKS);
        Register.registerBlock(STAIR_GRANITE_COBBLE_MOSS,   ItemGroup.BUILDING_BLOCKS);
        Register.registerBlock(WALLS_GRANITE_COBBLE_MOSS,   ItemGroup.DECORATIONS);
        Register.registerBlock(PILAR_GRANITE_COBBLE_MOSS,         ItemGroup.DECORATIONS);
        Register.registerBlock(WALLS_GRANITE_SMOOTH,        ItemGroup.DECORATIONS);
        Register.registerBlock(PILAR_GRANITE_SMOOTH,         ItemGroup.DECORATIONS);
        Register.registerBlock(BLOCK_GRANITE_BRICK,         ItemGroup.BUILDING_BLOCKS);
        Register.registerBlock(SLABS_GRANITE_BRICK,         ItemGroup.BUILDING_BLOCKS);
        Register.registerBlock(STAIR_GRANITE_BRICK,         ItemGroup.BUILDING_BLOCKS);
        Register.registerBlock(WALLS_GRANITE_BRICK,         ItemGroup.DECORATIONS);
        Register.registerBlock(PILAR_GRANITE_BRICK,         ItemGroup.DECORATIONS);
        Register.registerBlock(BLOCK_GRANITE_BRICK_MOSS,    ItemGroup.BUILDING_BLOCKS);
        Register.registerBlock(SLABS_GRANITE_BRICK_MOSS,    ItemGroup.BUILDING_BLOCKS);
        Register.registerBlock(STAIR_GRANITE_BRICK_MOSS,    ItemGroup.BUILDING_BLOCKS);
        Register.registerBlock(WALLS_GRANITE_BRICK_MOSS,    ItemGroup.DECORATIONS);
        Register.registerBlock(PILAR_GRANITE_BRICK_MOSS,         ItemGroup.DECORATIONS);
        Register.registerBlock(BLOCK_GRANITE_BRICK_CRACKED, ItemGroup.BUILDING_BLOCKS);
        Register.registerBlock(SLABS_GRANITE_BRICK_CRACKED, ItemGroup.BUILDING_BLOCKS);
        Register.registerBlock(STAIR_GRANITE_BRICK_CRACKED, ItemGroup.BUILDING_BLOCKS);
        Register.registerBlock(WALLS_GRANITE_BRICK_CRACKED, ItemGroup.DECORATIONS);
        Register.registerBlock(PILAR_GRANITE_BRICK_CRACKED,         ItemGroup.DECORATIONS);
        Register.registerBlock(BLOCK_GRANITE_BRICK_CARVED,  ItemGroup.BUILDING_BLOCKS);

        // Diorite
        Register.registerBlock(PILAR_DIORITE_STONE,         ItemGroup.DECORATIONS);
        Register.registerBlock(BLOCK_DIORITE_COBBLE,        ItemGroup.BUILDING_BLOCKS);
        Register.registerBlock(SLABS_DIORITE_COBBLE,        ItemGroup.BUILDING_BLOCKS);
        Register.registerBlock(STAIR_DIORITE_COBBLE,        ItemGroup.BUILDING_BLOCKS);
        Register.registerBlock(WALLS_DIORITE_COBBLE,        ItemGroup.DECORATIONS);
        Register.registerBlock(PILAR_DIORITE_COBBLE,         ItemGroup.DECORATIONS);
        Register.registerBlock(BLOCK_DIORITE_COBBLE_MOSS,   ItemGroup.BUILDING_BLOCKS);
        Register.registerBlock(SLABS_DIORITE_COBBLE_MOSS,   ItemGroup.BUILDING_BLOCKS);
        Register.registerBlock(STAIR_DIORITE_COBBLE_MOSS,   ItemGroup.BUILDING_BLOCKS);
        Register.registerBlock(WALLS_DIORITE_COBBLE_MOSS,   ItemGroup.DECORATIONS);
        Register.registerBlock(PILAR_DIORITE_COBBLE_MOSS,         ItemGroup.DECORATIONS);
        Register.registerBlock(WALLS_DIORITE_SMOOTH,        ItemGroup.DECORATIONS);
        Register.registerBlock(PILAR_DIORITE_SMOOTH,         ItemGroup.DECORATIONS);
        Register.registerBlock(BLOCK_DIORITE_BRICK,         ItemGroup.BUILDING_BLOCKS);
        Register.registerBlock(SLABS_DIORITE_BRICK,         ItemGroup.BUILDING_BLOCKS);
        Register.registerBlock(STAIR_DIORITE_BRICK,         ItemGroup.BUILDING_BLOCKS);
        Register.registerBlock(WALLS_DIORITE_BRICK,         ItemGroup.DECORATIONS);
        Register.registerBlock(PILAR_DIORITE_BRICK,         ItemGroup.DECORATIONS);
        Register.registerBlock(BLOCK_DIORITE_BRICK_MOSS,    ItemGroup.BUILDING_BLOCKS);
        Register.registerBlock(SLABS_DIORITE_BRICK_MOSS,    ItemGroup.BUILDING_BLOCKS);
        Register.registerBlock(STAIR_DIORITE_BRICK_MOSS,    ItemGroup.BUILDING_BLOCKS);
        Register.registerBlock(WALLS_DIORITE_BRICK_MOSS,    ItemGroup.DECORATIONS);
        Register.registerBlock(PILAR_DIORITE_BRICK_MOSS,         ItemGroup.DECORATIONS);
        Register.registerBlock(BLOCK_DIORITE_BRICK_CRACKED, ItemGroup.BUILDING_BLOCKS);
        Register.registerBlock(SLABS_DIORITE_BRICK_CRACKED, ItemGroup.BUILDING_BLOCKS);
        Register.registerBlock(STAIR_DIORITE_BRICK_CRACKED, ItemGroup.BUILDING_BLOCKS);
        Register.registerBlock(WALLS_DIORITE_BRICK_CRACKED, ItemGroup.DECORATIONS);
        Register.registerBlock(PILAR_DIORITE_BRICK_CRACKED,         ItemGroup.DECORATIONS);
        Register.registerBlock(BLOCK_DIORITE_BRICK_CARVED,  ItemGroup.BUILDING_BLOCKS);

        // Andesite
        Register.registerBlock(PILAR_ANDESITE_STONE,         ItemGroup.DECORATIONS);
        Register.registerBlock(BLOCK_ANDESITE_COBBLE,        ItemGroup.BUILDING_BLOCKS);
        Register.registerBlock(SLABS_ANDESITE_COBBLE,        ItemGroup.BUILDING_BLOCKS);
        Register.registerBlock(STAIR_ANDESITE_COBBLE,        ItemGroup.BUILDING_BLOCKS);
        Register.registerBlock(WALLS_ANDESITE_COBBLE,        ItemGroup.DECORATIONS);
        Register.registerBlock(PILAR_ANDESITE_COBBLE,         ItemGroup.DECORATIONS);
        Register.registerBlock(BLOCK_ANDESITE_COBBLE_MOSS,   ItemGroup.BUILDING_BLOCKS);
        Register.registerBlock(SLABS_ANDESITE_COBBLE_MOSS,   ItemGroup.BUILDING_BLOCKS);
        Register.registerBlock(STAIR_ANDESITE_COBBLE_MOSS,   ItemGroup.BUILDING_BLOCKS);
        Register.registerBlock(WALLS_ANDESITE_COBBLE_MOSS,   ItemGroup.DECORATIONS);
        Register.registerBlock(PILAR_ANDESITE_COBBLE_MOSS,         ItemGroup.DECORATIONS);
        Register.registerBlock(WALLS_ANDESITE_SMOOTH,        ItemGroup.DECORATIONS);
        Register.registerBlock(PILAR_ANDESITE_SMOOTH,         ItemGroup.DECORATIONS);
        Register.registerBlock(BLOCK_ANDESITE_BRICK,         ItemGroup.BUILDING_BLOCKS);
        Register.registerBlock(SLABS_ANDESITE_BRICK,         ItemGroup.BUILDING_BLOCKS);
        Register.registerBlock(STAIR_ANDESITE_BRICK,         ItemGroup.BUILDING_BLOCKS);
        Register.registerBlock(WALLS_ANDESITE_BRICK,         ItemGroup.DECORATIONS);
        Register.registerBlock(PILAR_ANDESITE_BRICK,         ItemGroup.DECORATIONS);
        Register.registerBlock(BLOCK_ANDESITE_BRICK_MOSS,    ItemGroup.BUILDING_BLOCKS);
        Register.registerBlock(SLABS_ANDESITE_BRICK_MOSS,    ItemGroup.BUILDING_BLOCKS);
        Register.registerBlock(STAIR_ANDESITE_BRICK_MOSS,    ItemGroup.BUILDING_BLOCKS);
        Register.registerBlock(WALLS_ANDESITE_BRICK_MOSS,    ItemGroup.DECORATIONS);
        Register.registerBlock(PILAR_ANDESITE_BRICK_MOSS,         ItemGroup.DECORATIONS);
        Register.registerBlock(BLOCK_ANDESITE_BRICK_CRACKED, ItemGroup.BUILDING_BLOCKS);
        Register.registerBlock(SLABS_ANDESITE_BRICK_CRACKED, ItemGroup.BUILDING_BLOCKS);
        Register.registerBlock(STAIR_ANDESITE_BRICK_CRACKED, ItemGroup.BUILDING_BLOCKS);
        Register.registerBlock(WALLS_ANDESITE_BRICK_CRACKED, ItemGroup.DECORATIONS);
        Register.registerBlock(PILAR_ANDESITE_BRICK_CRACKED,         ItemGroup.DECORATIONS);
        Register.registerBlock(BLOCK_ANDESITE_BRICK_CARVED,  ItemGroup.BUILDING_BLOCKS);

        // Prismarine
        Register.registerBlock(PILAR_PRISMARINE_STONE,         ItemGroup.DECORATIONS);
        Register.registerBlock(WALLS_PRISMARINE_BRICK, ItemGroup.DECORATIONS);
        Register.registerBlock(PILAR_PRISMARINE_BRICK,         ItemGroup.DECORATIONS);
        Register.registerBlock(WALLS_PRISMARINE_DARK,  ItemGroup.DECORATIONS);
        Register.registerBlock(PILAR_PRISMARINE_DARK,         ItemGroup.DECORATIONS);

        // End Stone
        Register.registerBlock(SLABS_END_STONE,         ItemGroup.BUILDING_BLOCKS);
        Register.registerBlock(STAIR_END_STONE,         ItemGroup.BUILDING_BLOCKS);
        Register.registerBlock(WALLS_END_STONE,         ItemGroup.DECORATIONS);
        Register.registerBlock(PILAR_END_STONE,         ItemGroup.DECORATIONS);
        Register.registerBlock(BLOCK_END_COBBLE,        ItemGroup.BUILDING_BLOCKS);
        Register.registerBlock(SLABS_END_COBBLE,        ItemGroup.BUILDING_BLOCKS);
        Register.registerBlock(STAIR_END_COBBLE,        ItemGroup.BUILDING_BLOCKS);
        Register.registerBlock(WALLS_END_COBBLE,        ItemGroup.DECORATIONS);
        Register.registerBlock(PILAR_END_COBBLE,         ItemGroup.DECORATIONS);
        Register.registerBlock(BLOCK_END_COBBLE_MOSS,   ItemGroup.BUILDING_BLOCKS);
        Register.registerBlock(SLABS_END_COBBLE_MOSS,   ItemGroup.BUILDING_BLOCKS);
        Register.registerBlock(STAIR_END_COBBLE_MOSS,   ItemGroup.BUILDING_BLOCKS);
        Register.registerBlock(WALLS_END_COBBLE_MOSS,   ItemGroup.DECORATIONS);
        Register.registerBlock(PILAR_END_COBBLE_MOSS,         ItemGroup.DECORATIONS);
        Register.registerBlock(BLOCK_END_SMOOTH,        ItemGroup.BUILDING_BLOCKS);
        Register.registerBlock(SLABS_END_SMOOTH,        ItemGroup.BUILDING_BLOCKS);
        Register.registerBlock(STAIR_END_SMOOTH,        ItemGroup.BUILDING_BLOCKS);
        Register.registerBlock(WALLS_END_SMOOTH,        ItemGroup.DECORATIONS);
        Register.registerBlock(PILAR_END_SMOOTH,         ItemGroup.DECORATIONS);
        Register.registerBlock(PILAR_END_BRICK,         ItemGroup.DECORATIONS);
        Register.registerBlock(BLOCK_END_BRICK_MOSS,    ItemGroup.BUILDING_BLOCKS);
        Register.registerBlock(SLABS_END_BRICK_MOSS,    ItemGroup.BUILDING_BLOCKS);
        Register.registerBlock(STAIR_END_BRICK_MOSS,    ItemGroup.BUILDING_BLOCKS);
        Register.registerBlock(WALLS_END_BRICK_MOSS,    ItemGroup.DECORATIONS);
        Register.registerBlock(PILAR_END_BRICK_MOSS,         ItemGroup.DECORATIONS);
        Register.registerBlock(BLOCK_END_BRICK_CRACKED, ItemGroup.BUILDING_BLOCKS);
        Register.registerBlock(SLABS_END_BRICK_CRACKED, ItemGroup.BUILDING_BLOCKS);
        Register.registerBlock(STAIR_END_BRICK_CRACKED, ItemGroup.BUILDING_BLOCKS);
        Register.registerBlock(WALLS_END_BRICK_CRACKED, ItemGroup.DECORATIONS);
        Register.registerBlock(PILAR_END_BRICK_CRACKED,         ItemGroup.DECORATIONS);
        Register.registerBlock(BLOCK_END_BRICK_CARVED,  ItemGroup.BUILDING_BLOCKS);

        // Concrete
        Register.registerBlock(SLABS_CONCRETE_WHITE,     ItemGroup.BUILDING_BLOCKS);
        Register.registerBlock(STAIR_CONCRETE_WHITE,     ItemGroup.BUILDING_BLOCKS);
        Register.registerBlock(WALLS_CONCRETE_WHITE,     ItemGroup.DECORATIONS);
        Register.registerBlock(PILAR_CONCRETE_WHITE,         ItemGroup.DECORATIONS);
        Register.registerBlock(SLABS_CONCRETE_ORANGE,    ItemGroup.BUILDING_BLOCKS);
        Register.registerBlock(STAIR_CONCRETE_ORANGE,    ItemGroup.BUILDING_BLOCKS);
        Register.registerBlock(WALLS_CONCRETE_ORANGE,    ItemGroup.DECORATIONS);
        Register.registerBlock(PILAR_CONCRETE_ORANGE,         ItemGroup.DECORATIONS);
        Register.registerBlock(SLABS_CONCRETE_MAGENTA,   ItemGroup.BUILDING_BLOCKS);
        Register.registerBlock(STAIR_CONCRETE_MAGENTA,   ItemGroup.BUILDING_BLOCKS);
        Register.registerBlock(WALLS_CONCRETE_MAGENTA,   ItemGroup.DECORATIONS);
        Register.registerBlock(PILAR_CONCRETE_MAGENTA,         ItemGroup.DECORATIONS);
        Register.registerBlock(SLABS_CONCRETE_LIGHTBLUE, ItemGroup.BUILDING_BLOCKS);
        Register.registerBlock(STAIR_CONCRETE_LIGHTBLUE, ItemGroup.BUILDING_BLOCKS);
        Register.registerBlock(WALLS_CONCRETE_LIGHTBLUE, ItemGroup.DECORATIONS);
        Register.registerBlock(PILAR_CONCRETE_LIGHTBLUE,         ItemGroup.DECORATIONS);
        Register.registerBlock(SLABS_CONCRETE_YELLOW,    ItemGroup.BUILDING_BLOCKS);
        Register.registerBlock(STAIR_CONCRETE_YELLOW,    ItemGroup.BUILDING_BLOCKS);
        Register.registerBlock(WALLS_CONCRETE_YELLOW,    ItemGroup.DECORATIONS);
        Register.registerBlock(PILAR_CONCRETE_YELLOW,         ItemGroup.DECORATIONS);
        Register.registerBlock(SLABS_CONCRETE_LIME,      ItemGroup.BUILDING_BLOCKS);
        Register.registerBlock(STAIR_CONCRETE_LIME,      ItemGroup.BUILDING_BLOCKS);
        Register.registerBlock(WALLS_CONCRETE_LIME,      ItemGroup.DECORATIONS);
        Register.registerBlock(PILAR_CONCRETE_LIME,         ItemGroup.DECORATIONS);
        Register.registerBlock(SLABS_CONCRETE_PINK,      ItemGroup.BUILDING_BLOCKS);
        Register.registerBlock(STAIR_CONCRETE_PINK,      ItemGroup.BUILDING_BLOCKS);
        Register.registerBlock(WALLS_CONCRETE_PINK,      ItemGroup.DECORATIONS);
        Register.registerBlock(PILAR_CONCRETE_PINK,         ItemGroup.DECORATIONS);
        Register.registerBlock(SLABS_CONCRETE_GRAY,      ItemGroup.BUILDING_BLOCKS);
        Register.registerBlock(STAIR_CONCRETE_GRAY,      ItemGroup.BUILDING_BLOCKS);
        Register.registerBlock(WALLS_CONCRETE_GRAY,      ItemGroup.DECORATIONS);
        Register.registerBlock(PILAR_CONCRETE_GRAY,         ItemGroup.DECORATIONS);
        Register.registerBlock(SLABS_CONCRETE_SILVER,    ItemGroup.BUILDING_BLOCKS);
        Register.registerBlock(STAIR_CONCRETE_SILVER,    ItemGroup.BUILDING_BLOCKS);
        Register.registerBlock(WALLS_CONCRETE_SILVER,    ItemGroup.DECORATIONS);
        Register.registerBlock(PILAR_CONCRETE_SILVER,         ItemGroup.DECORATIONS);
        Register.registerBlock(SLABS_CONCRETE_CYAN,      ItemGroup.BUILDING_BLOCKS);
        Register.registerBlock(STAIR_CONCRETE_CYAN,      ItemGroup.BUILDING_BLOCKS);
        Register.registerBlock(WALLS_CONCRETE_CYAN,      ItemGroup.DECORATIONS);
        Register.registerBlock(PILAR_CONCRETE_CYAN,         ItemGroup.DECORATIONS);
        Register.registerBlock(SLABS_CONCRETE_PURPLE,    ItemGroup.BUILDING_BLOCKS);
        Register.registerBlock(STAIR_CONCRETE_PURPLE,    ItemGroup.BUILDING_BLOCKS);
        Register.registerBlock(WALLS_CONCRETE_PURPLE,    ItemGroup.DECORATIONS);
        Register.registerBlock(PILAR_CONCRETE_PURPLE,         ItemGroup.DECORATIONS);
        Register.registerBlock(SLABS_CONCRETE_BLUE,      ItemGroup.BUILDING_BLOCKS);
        Register.registerBlock(STAIR_CONCRETE_BLUE,      ItemGroup.BUILDING_BLOCKS);
        Register.registerBlock(WALLS_CONCRETE_BLUE,      ItemGroup.DECORATIONS);
        Register.registerBlock(PILAR_CONCRETE_BLUE,         ItemGroup.DECORATIONS);
        Register.registerBlock(SLABS_CONCRETE_BROWN,     ItemGroup.BUILDING_BLOCKS);
        Register.registerBlock(STAIR_CONCRETE_BROWN,     ItemGroup.BUILDING_BLOCKS);
        Register.registerBlock(WALLS_CONCRETE_BROWN,     ItemGroup.DECORATIONS);
        Register.registerBlock(PILAR_CONCRETE_BROWN,         ItemGroup.DECORATIONS);
        Register.registerBlock(SLABS_CONCRETE_GREEN,     ItemGroup.BUILDING_BLOCKS);
        Register.registerBlock(STAIR_CONCRETE_GREEN,     ItemGroup.BUILDING_BLOCKS);
        Register.registerBlock(WALLS_CONCRETE_GREEN,     ItemGroup.DECORATIONS);
        Register.registerBlock(PILAR_CONCRETE_GREEN,         ItemGroup.DECORATIONS);
        Register.registerBlock(SLABS_CONCRETE_RED,       ItemGroup.BUILDING_BLOCKS);
        Register.registerBlock(STAIR_CONCRETE_RED,       ItemGroup.BUILDING_BLOCKS);
        Register.registerBlock(WALLS_CONCRETE_RED,       ItemGroup.DECORATIONS);
        Register.registerBlock(PILAR_CONCRETE_RED,         ItemGroup.DECORATIONS);
        Register.registerBlock(SLABS_CONCRETE_BLACK,     ItemGroup.BUILDING_BLOCKS);
        Register.registerBlock(STAIR_CONCRETE_BLACK,     ItemGroup.BUILDING_BLOCKS);
        Register.registerBlock(WALLS_CONCRETE_BLACK,     ItemGroup.DECORATIONS);
        Register.registerBlock(PILAR_CONCRETE_BLACK,         ItemGroup.DECORATIONS);

        // Timber Basic
        Register.registerBlock(BLOCK_TIMBER_BASIC_WHITE,     ItemGroup.BUILDING_BLOCKS);
        Register.registerBlock(BLOCK_TIMBER_BASIC_ORANGE,    ItemGroup.BUILDING_BLOCKS);
        Register.registerBlock(BLOCK_TIMBER_BASIC_MAGENTA,   ItemGroup.BUILDING_BLOCKS);
        Register.registerBlock(BLOCK_TIMBER_BASIC_LIGHTBLUE, ItemGroup.BUILDING_BLOCKS);
        Register.registerBlock(BLOCK_TIMBER_BASIC_YELLOW,    ItemGroup.BUILDING_BLOCKS);
        Register.registerBlock(BLOCK_TIMBER_BASIC_LIME,      ItemGroup.BUILDING_BLOCKS);
        Register.registerBlock(BLOCK_TIMBER_BASIC_PINK,      ItemGroup.BUILDING_BLOCKS);
        Register.registerBlock(BLOCK_TIMBER_BASIC_GRAY,      ItemGroup.BUILDING_BLOCKS);
        Register.registerBlock(BLOCK_TIMBER_BASIC_SILVER,    ItemGroup.BUILDING_BLOCKS);
        Register.registerBlock(BLOCK_TIMBER_BASIC_CYAN,      ItemGroup.BUILDING_BLOCKS);
        Register.registerBlock(BLOCK_TIMBER_BASIC_PURPLE,    ItemGroup.BUILDING_BLOCKS);
        Register.registerBlock(BLOCK_TIMBER_BASIC_BLUE,      ItemGroup.BUILDING_BLOCKS);
        Register.registerBlock(BLOCK_TIMBER_BASIC_BROWN,     ItemGroup.BUILDING_BLOCKS);
        Register.registerBlock(BLOCK_TIMBER_BASIC_GREEN,     ItemGroup.BUILDING_BLOCKS);
        Register.registerBlock(BLOCK_TIMBER_BASIC_RED,       ItemGroup.BUILDING_BLOCKS);
        Register.registerBlock(BLOCK_TIMBER_BASIC_BLACK,     ItemGroup.BUILDING_BLOCKS);

        // Timber Horizontal
        Register.registerBlock(BLOCK_TIMBER_HORIZONTAL_WHITE,     ItemGroup.BUILDING_BLOCKS);
        Register.registerBlock(BLOCK_TIMBER_HORIZONTAL_ORANGE,    ItemGroup.BUILDING_BLOCKS);
        Register.registerBlock(BLOCK_TIMBER_HORIZONTAL_MAGENTA,   ItemGroup.BUILDING_BLOCKS);
        Register.registerBlock(BLOCK_TIMBER_HORIZONTAL_LIGHTBLUE, ItemGroup.BUILDING_BLOCKS);
        Register.registerBlock(BLOCK_TIMBER_HORIZONTAL_YELLOW,    ItemGroup.BUILDING_BLOCKS);
        Register.registerBlock(BLOCK_TIMBER_HORIZONTAL_LIME,      ItemGroup.BUILDING_BLOCKS);
        Register.registerBlock(BLOCK_TIMBER_HORIZONTAL_PINK,      ItemGroup.BUILDING_BLOCKS);
        Register.registerBlock(BLOCK_TIMBER_HORIZONTAL_GRAY,      ItemGroup.BUILDING_BLOCKS);
        Register.registerBlock(BLOCK_TIMBER_HORIZONTAL_SILVER,    ItemGroup.BUILDING_BLOCKS);
        Register.registerBlock(BLOCK_TIMBER_HORIZONTAL_CYAN,      ItemGroup.BUILDING_BLOCKS);
        Register.registerBlock(BLOCK_TIMBER_HORIZONTAL_PURPLE,    ItemGroup.BUILDING_BLOCKS);
        Register.registerBlock(BLOCK_TIMBER_HORIZONTAL_BLUE,      ItemGroup.BUILDING_BLOCKS);
        Register.registerBlock(BLOCK_TIMBER_HORIZONTAL_BROWN,     ItemGroup.BUILDING_BLOCKS);
        Register.registerBlock(BLOCK_TIMBER_HORIZONTAL_GREEN,     ItemGroup.BUILDING_BLOCKS);
        Register.registerBlock(BLOCK_TIMBER_HORIZONTAL_RED,       ItemGroup.BUILDING_BLOCKS);
        Register.registerBlock(BLOCK_TIMBER_HORIZONTAL_BLACK,     ItemGroup.BUILDING_BLOCKS);

        // Timber Vertical
        Register.registerBlock(BLOCK_TIMBER_VERTICAL_WHITE,     ItemGroup.BUILDING_BLOCKS);
        Register.registerBlock(BLOCK_TIMBER_VERTICAL_ORANGE,    ItemGroup.BUILDING_BLOCKS);
        Register.registerBlock(BLOCK_TIMBER_VERTICAL_MAGENTA,   ItemGroup.BUILDING_BLOCKS);
        Register.registerBlock(BLOCK_TIMBER_VERTICAL_LIGHTBLUE, ItemGroup.BUILDING_BLOCKS);
        Register.registerBlock(BLOCK_TIMBER_VERTICAL_YELLOW,    ItemGroup.BUILDING_BLOCKS);
        Register.registerBlock(BLOCK_TIMBER_VERTICAL_LIME,      ItemGroup.BUILDING_BLOCKS);
        Register.registerBlock(BLOCK_TIMBER_VERTICAL_PINK,      ItemGroup.BUILDING_BLOCKS);
        Register.registerBlock(BLOCK_TIMBER_VERTICAL_GRAY,      ItemGroup.BUILDING_BLOCKS);
        Register.registerBlock(BLOCK_TIMBER_VERTICAL_SILVER,    ItemGroup.BUILDING_BLOCKS);
        Register.registerBlock(BLOCK_TIMBER_VERTICAL_CYAN,      ItemGroup.BUILDING_BLOCKS);
        Register.registerBlock(BLOCK_TIMBER_VERTICAL_PURPLE,    ItemGroup.BUILDING_BLOCKS);
        Register.registerBlock(BLOCK_TIMBER_VERTICAL_BLUE,      ItemGroup.BUILDING_BLOCKS);
        Register.registerBlock(BLOCK_TIMBER_VERTICAL_BROWN,     ItemGroup.BUILDING_BLOCKS);
        Register.registerBlock(BLOCK_TIMBER_VERTICAL_GREEN,     ItemGroup.BUILDING_BLOCKS);
        Register.registerBlock(BLOCK_TIMBER_VERTICAL_RED,       ItemGroup.BUILDING_BLOCKS);
        Register.registerBlock(BLOCK_TIMBER_VERTICAL_BLACK,     ItemGroup.BUILDING_BLOCKS);

        // Timber Plus
        Register.registerBlock(BLOCK_TIMBER_PLUS_WHITE,     ItemGroup.BUILDING_BLOCKS);
        Register.registerBlock(BLOCK_TIMBER_PLUS_ORANGE,    ItemGroup.BUILDING_BLOCKS);
        Register.registerBlock(BLOCK_TIMBER_PLUS_MAGENTA,   ItemGroup.BUILDING_BLOCKS);
        Register.registerBlock(BLOCK_TIMBER_PLUS_LIGHTBLUE, ItemGroup.BUILDING_BLOCKS);
        Register.registerBlock(BLOCK_TIMBER_PLUS_YELLOW,    ItemGroup.BUILDING_BLOCKS);
        Register.registerBlock(BLOCK_TIMBER_PLUS_LIME,      ItemGroup.BUILDING_BLOCKS);
        Register.registerBlock(BLOCK_TIMBER_PLUS_PINK,      ItemGroup.BUILDING_BLOCKS);
        Register.registerBlock(BLOCK_TIMBER_PLUS_GRAY,      ItemGroup.BUILDING_BLOCKS);
        Register.registerBlock(BLOCK_TIMBER_PLUS_SILVER,    ItemGroup.BUILDING_BLOCKS);
        Register.registerBlock(BLOCK_TIMBER_PLUS_CYAN,      ItemGroup.BUILDING_BLOCKS);
        Register.registerBlock(BLOCK_TIMBER_PLUS_PURPLE,    ItemGroup.BUILDING_BLOCKS);
        Register.registerBlock(BLOCK_TIMBER_PLUS_BLUE,      ItemGroup.BUILDING_BLOCKS);
        Register.registerBlock(BLOCK_TIMBER_PLUS_BROWN,     ItemGroup.BUILDING_BLOCKS);
        Register.registerBlock(BLOCK_TIMBER_PLUS_GREEN,     ItemGroup.BUILDING_BLOCKS);
        Register.registerBlock(BLOCK_TIMBER_PLUS_RED,       ItemGroup.BUILDING_BLOCKS);
        Register.registerBlock(BLOCK_TIMBER_PLUS_BLACK,     ItemGroup.BUILDING_BLOCKS);

        // Timber Diagonal Left
        Register.registerBlock(BLOCK_TIMBER_DIAG_LEFT_WHITE,     ItemGroup.BUILDING_BLOCKS);
        Register.registerBlock(BLOCK_TIMBER_DIAG_LEFT_ORANGE,    ItemGroup.BUILDING_BLOCKS);
        Register.registerBlock(BLOCK_TIMBER_DIAG_LEFT_MAGENTA,   ItemGroup.BUILDING_BLOCKS);
        Register.registerBlock(BLOCK_TIMBER_DIAG_LEFT_LIGHTBLUE, ItemGroup.BUILDING_BLOCKS);
        Register.registerBlock(BLOCK_TIMBER_DIAG_LEFT_YELLOW,    ItemGroup.BUILDING_BLOCKS);
        Register.registerBlock(BLOCK_TIMBER_DIAG_LEFT_LIME,      ItemGroup.BUILDING_BLOCKS);
        Register.registerBlock(BLOCK_TIMBER_DIAG_LEFT_PINK,      ItemGroup.BUILDING_BLOCKS);
        Register.registerBlock(BLOCK_TIMBER_DIAG_LEFT_GRAY,      ItemGroup.BUILDING_BLOCKS);
        Register.registerBlock(BLOCK_TIMBER_DIAG_LEFT_SILVER,    ItemGroup.BUILDING_BLOCKS);
        Register.registerBlock(BLOCK_TIMBER_DIAG_LEFT_CYAN,      ItemGroup.BUILDING_BLOCKS);
        Register.registerBlock(BLOCK_TIMBER_DIAG_LEFT_PURPLE,    ItemGroup.BUILDING_BLOCKS);
        Register.registerBlock(BLOCK_TIMBER_DIAG_LEFT_BLUE,      ItemGroup.BUILDING_BLOCKS);
        Register.registerBlock(BLOCK_TIMBER_DIAG_LEFT_BROWN,     ItemGroup.BUILDING_BLOCKS);
        Register.registerBlock(BLOCK_TIMBER_DIAG_LEFT_GREEN,     ItemGroup.BUILDING_BLOCKS);
        Register.registerBlock(BLOCK_TIMBER_DIAG_LEFT_RED,       ItemGroup.BUILDING_BLOCKS);
        Register.registerBlock(BLOCK_TIMBER_DIAG_LEFT_BLACK,     ItemGroup.BUILDING_BLOCKS);

        // Timber Diagonal Right
        Register.registerBlock(BLOCK_TIMBER_DIAG_RIGHT_WHITE,     ItemGroup.BUILDING_BLOCKS);
        Register.registerBlock(BLOCK_TIMBER_DIAG_RIGHT_ORANGE,    ItemGroup.BUILDING_BLOCKS);
        Register.registerBlock(BLOCK_TIMBER_DIAG_RIGHT_MAGENTA,   ItemGroup.BUILDING_BLOCKS);
        Register.registerBlock(BLOCK_TIMBER_DIAG_RIGHT_LIGHTBLUE, ItemGroup.BUILDING_BLOCKS);
        Register.registerBlock(BLOCK_TIMBER_DIAG_RIGHT_YELLOW,    ItemGroup.BUILDING_BLOCKS);
        Register.registerBlock(BLOCK_TIMBER_DIAG_RIGHT_LIME,      ItemGroup.BUILDING_BLOCKS);
        Register.registerBlock(BLOCK_TIMBER_DIAG_RIGHT_PINK,      ItemGroup.BUILDING_BLOCKS);
        Register.registerBlock(BLOCK_TIMBER_DIAG_RIGHT_GRAY,      ItemGroup.BUILDING_BLOCKS);
        Register.registerBlock(BLOCK_TIMBER_DIAG_RIGHT_SILVER,    ItemGroup.BUILDING_BLOCKS);
        Register.registerBlock(BLOCK_TIMBER_DIAG_RIGHT_CYAN,      ItemGroup.BUILDING_BLOCKS);
        Register.registerBlock(BLOCK_TIMBER_DIAG_RIGHT_PURPLE,    ItemGroup.BUILDING_BLOCKS);
        Register.registerBlock(BLOCK_TIMBER_DIAG_RIGHT_BLUE,      ItemGroup.BUILDING_BLOCKS);
        Register.registerBlock(BLOCK_TIMBER_DIAG_RIGHT_BROWN,     ItemGroup.BUILDING_BLOCKS);
        Register.registerBlock(BLOCK_TIMBER_DIAG_RIGHT_GREEN,     ItemGroup.BUILDING_BLOCKS);
        Register.registerBlock(BLOCK_TIMBER_DIAG_RIGHT_RED,       ItemGroup.BUILDING_BLOCKS);
        Register.registerBlock(BLOCK_TIMBER_DIAG_RIGHT_BLACK,     ItemGroup.BUILDING_BLOCKS);

        // Timber Cross
        Register.registerBlock(BLOCK_TIMBER_CROSS_WHITE,     ItemGroup.BUILDING_BLOCKS);
        Register.registerBlock(BLOCK_TIMBER_CROSS_ORANGE,    ItemGroup.BUILDING_BLOCKS);
        Register.registerBlock(BLOCK_TIMBER_CROSS_MAGENTA,   ItemGroup.BUILDING_BLOCKS);
        Register.registerBlock(BLOCK_TIMBER_CROSS_LIGHTBLUE, ItemGroup.BUILDING_BLOCKS);
        Register.registerBlock(BLOCK_TIMBER_CROSS_YELLOW,    ItemGroup.BUILDING_BLOCKS);
        Register.registerBlock(BLOCK_TIMBER_CROSS_LIME,      ItemGroup.BUILDING_BLOCKS);
        Register.registerBlock(BLOCK_TIMBER_CROSS_PINK,      ItemGroup.BUILDING_BLOCKS);
        Register.registerBlock(BLOCK_TIMBER_CROSS_GRAY,      ItemGroup.BUILDING_BLOCKS);
        Register.registerBlock(BLOCK_TIMBER_CROSS_SILVER,    ItemGroup.BUILDING_BLOCKS);
        Register.registerBlock(BLOCK_TIMBER_CROSS_CYAN,      ItemGroup.BUILDING_BLOCKS);
        Register.registerBlock(BLOCK_TIMBER_CROSS_PURPLE,    ItemGroup.BUILDING_BLOCKS);
        Register.registerBlock(BLOCK_TIMBER_CROSS_BLUE,      ItemGroup.BUILDING_BLOCKS);
        Register.registerBlock(BLOCK_TIMBER_CROSS_BROWN,     ItemGroup.BUILDING_BLOCKS);
        Register.registerBlock(BLOCK_TIMBER_CROSS_GREEN,     ItemGroup.BUILDING_BLOCKS);
        Register.registerBlock(BLOCK_TIMBER_CROSS_RED,       ItemGroup.BUILDING_BLOCKS);
        Register.registerBlock(BLOCK_TIMBER_CROSS_BLACK,     ItemGroup.BUILDING_BLOCKS);

        // Other
        Register.registerBlock(BLOCK_SCAFFOLDING,       ItemGroup.BUILDING_BLOCKS);
        Register.registerBlock(BLOCK_CHAIN_IRON,        ItemGroup.BUILDING_BLOCKS);
        Register.registerBlock(BLOCK_CHAIN_GOLD,        ItemGroup.BUILDING_BLOCKS);
        Register.registerBlock(BLOCK_EMITTER,           ItemGroup.REDSTONE);
        Register.registerBlock(BLOCK_GARGOYLE_STONE,    ItemGroup.REDSTONE);
        Register.registerBlock(BLOCK_GARGOYLE_GRANITE,  ItemGroup.REDSTONE);
        Register.registerBlock(BLOCK_GARGOYLE_DIORITE,  ItemGroup.REDSTONE);
        Register.registerBlock(BLOCK_GARGOYLE_ANDESITE, ItemGroup.REDSTONE);
        Register.registerBlock(BLOCK_GARGOYLE_END,      ItemGroup.REDSTONE);

        // Timber Cross
        Register.registerBlock(BLOCK_LIGHT_WHITE,     ItemGroup.DECORATIONS);
        Register.registerBlock(BLOCK_LIGHT_ORANGE,    ItemGroup.DECORATIONS);
        Register.registerBlock(BLOCK_LIGHT_MAGENTA,   ItemGroup.DECORATIONS);
        Register.registerBlock(BLOCK_LIGHT_LIGHTBLUE, ItemGroup.DECORATIONS);
        Register.registerBlock(BLOCK_LIGHT_YELLOW,    ItemGroup.DECORATIONS);
        Register.registerBlock(BLOCK_LIGHT_LIME,      ItemGroup.DECORATIONS);
        Register.registerBlock(BLOCK_LIGHT_PINK,      ItemGroup.DECORATIONS);
        Register.registerBlock(BLOCK_LIGHT_GRAY,      ItemGroup.DECORATIONS);
        Register.registerBlock(BLOCK_LIGHT_SILVER,    ItemGroup.DECORATIONS);
        Register.registerBlock(BLOCK_LIGHT_CYAN,      ItemGroup.DECORATIONS);
        Register.registerBlock(BLOCK_LIGHT_PURPLE,    ItemGroup.DECORATIONS);
        Register.registerBlock(BLOCK_LIGHT_BLUE,      ItemGroup.DECORATIONS);
        Register.registerBlock(BLOCK_LIGHT_BROWN,     ItemGroup.DECORATIONS);
        Register.registerBlock(BLOCK_LIGHT_GREEN,     ItemGroup.DECORATIONS);
        Register.registerBlock(BLOCK_LIGHT_RED,       ItemGroup.DECORATIONS);
        Register.registerBlock(BLOCK_LIGHT_BLACK,     ItemGroup.DECORATIONS);
    }

}
