package mod.stairway;

import mod.lucky77.block.BlockBlock;
import mod.stairway.block.*;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import static mod.stairway.StairwayToAether.MODID;

@SuppressWarnings({"unused", "deprecation"})
public class StairKeeper {

    private static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MODID);
    private static final DeferredRegister<Item>  ITEMS  = DeferredRegister.create(ForgeRegistries.ITEMS,  MODID);





    // Stone
    //                                        BLOCK_STONE_STONE
    //                                        SLABS_STONE_STONE
    //                                        STAIR_STONE_STONE
    public static final RegistryObject<Block> WALLS_STONE_STONE         = register("walls_stone_stone",         new BlockWalls(Blocks.STONE), CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Block> PILAR_STONE_STONE         = register("pilar_stone_stone",         new BlockPilar(Blocks.STONE), CreativeModeTab.TAB_DECORATIONS);
    //                                        BLOCK_STONE_COBBLE
    //                                        SLABS_STONE_COBBLE
    //                                        STAIR_STONE_COBBLE
    //                                        WALLS_STONE_COBBLE
    public static final RegistryObject<Block> PILAR_STONE_COBBLE        = register("pilar_stone_cobble",        new BlockPilar(Blocks.STONE), CreativeModeTab.TAB_DECORATIONS);
    //                                        BLOCK_STONE_COBBLE_MOSS
    //                                        SLABS_STONE_COBBLE_MOSS
    //                                        STAIR_STONE_COBBLE_MOSS
    //                                        WALLS_STONE_COBBLE_MOSS
    public static final RegistryObject<Block> PILAR_STONE_COBBLE_MOSS   = register("pilar_stone_cobble_moss",   new BlockPilar(Blocks.STONE), CreativeModeTab.TAB_DECORATIONS);
    //                                        BLOCK_STONE_SMOOTH
    //                                        SLABS_STONE_SMOOTH
    public static final RegistryObject<Block> STAIR_STONE_SMOOTH        = register("stair_stone_smooth",        new BlockStair(Blocks.STONE), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> WALLS_STONE_SMOOTH        = register("walls_stone_smooth",        new BlockWalls(Blocks.STONE), CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Block> PILAR_STONE_SMOOTH        = register("pilar_stone_smooth",        new BlockPilar(Blocks.STONE), CreativeModeTab.TAB_DECORATIONS);
    //                                        BLOCK_STONE_BRICK
    //                                        SLABS_STONE_BRICK
    //                                        STAIR_STONE_BRICK
    //                                        WALLS_STONE_BRICK
    public static final RegistryObject<Block> PILAR_STONE_BRICK         = register("pilar_stone_brick",         new BlockPilar(Blocks.STONE), CreativeModeTab.TAB_DECORATIONS);
    //                                        BLOCK_STONE_BRICK_MOSS
    //                                        SLABS_STONE_BRICK_MOSS
    //                                        STAIR_STONE_BRICK_MOSS
    //                                        WALLS_STONE_BRICK_MOSS
    public static final RegistryObject<Block> PILAR_STONE_BRICK_MOSS    = register("pilar_stone_brick_moss",    new BlockPilar(Blocks.STONE), CreativeModeTab.TAB_DECORATIONS);
    //                                        BLOCK_STONE_BRICK_CRACKED
    public static final RegistryObject<Block> SLABS_STONE_BRICK_CRACKED = register("slabs_stone_brick_cracked", new BlockSlabs(Blocks.STONE), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> STAIR_STONE_BRICK_CRACKED = register("stair_stone_brick_cracked", new BlockStair(Blocks.STONE), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> WALLS_STONE_BRICK_CRACKED = register("walls_stone_brick_cracked", new BlockWalls(Blocks.STONE), CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Block> PILAR_STONE_BRICK_CRACKED = register("pilar_stone_brick_cracked", new BlockPilar(Blocks.STONE), CreativeModeTab.TAB_DECORATIONS);
    //                                        BLOCK_STONE_BRICK_CARVED

    // Granite
    //                                        BLOCK_GRANITE_STONE
    //                                        SLABS_GRANITE_STONE
    //                                        STAIR_GRANITE_STONE
    //                                        WALLS_GRANITE_STONE
    public static final RegistryObject<Block> PILAR_GRANITE_STONE        =  register("pilar_granite_stone",         new BlockPilar(Blocks.GRANITE), CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Block> BLOCK_GRANITE_COBBLE        = register("block_granite_cobble",        new BlockBlock(Blocks.GRANITE), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> SLABS_GRANITE_COBBLE        = register("slabs_granite_cobble",        new BlockSlabs(Blocks.GRANITE), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> STAIR_GRANITE_COBBLE        = register("stair_granite_cobble",        new BlockStair(Blocks.GRANITE), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> WALLS_GRANITE_COBBLE        = register("walls_granite_cobble",        new BlockWalls(Blocks.GRANITE), CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Block> PILAR_GRANITE_COBBLE        = register("pilar_granite_cobble",        new BlockPilar(Blocks.GRANITE), CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Block> BLOCK_GRANITE_COBBLE_MOSS   = register("block_granite_cobble_moss",   new BlockBlock(Blocks.GRANITE), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> SLABS_GRANITE_COBBLE_MOSS   = register("slabs_granite_cobble_moss",   new BlockSlabs(Blocks.GRANITE), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> STAIR_GRANITE_COBBLE_MOSS   = register("stair_granite_cobble_moss",   new BlockStair(Blocks.GRANITE), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> WALLS_GRANITE_COBBLE_MOSS   = register("walls_granite_cobble_moss",   new BlockWalls(Blocks.GRANITE), CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Block> PILAR_GRANITE_COBBLE_MOSS   = register("pilar_granite_cobble_moss",   new BlockPilar(Blocks.GRANITE), CreativeModeTab.TAB_DECORATIONS);
    //                                        BLOCK_GRANITE_SMOOTH
    //                                        SLABS_GRANITE_SMOOTH
    //                                        STAIR_GRANITE_SMOOTH
    public static final RegistryObject<Block> WALLS_GRANITE_SMOOTH        = register("walls_granite_smooth",        new BlockWalls(Blocks.GRANITE), CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Block> PILAR_GRANITE_SMOOTH        = register("pilar_granite_smooth",        new BlockPilar(Blocks.GRANITE), CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Block> BLOCK_GRANITE_BRICK         = register("block_granite_brick",         new BlockBlock(Blocks.GRANITE), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> SLABS_GRANITE_BRICK         = register("slabs_granite_brick",         new BlockSlabs(Blocks.GRANITE), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> STAIR_GRANITE_BRICK         = register("stair_granite_brick",         new BlockStair(Blocks.GRANITE), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> WALLS_GRANITE_BRICK         = register("walls_granite_brick",         new BlockWalls(Blocks.GRANITE), CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Block> PILAR_GRANITE_BRICK         = register("pilar_granite_brick",         new BlockPilar(Blocks.GRANITE), CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Block> BLOCK_GRANITE_BRICK_MOSS    = register("block_granite_brick_moss",    new BlockBlock(Blocks.GRANITE), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> SLABS_GRANITE_BRICK_MOSS    = register("slabs_granite_brick_moss",    new BlockSlabs(Blocks.GRANITE), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> STAIR_GRANITE_BRICK_MOSS    = register("stair_granite_brick_moss",    new BlockStair(Blocks.GRANITE), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> WALLS_GRANITE_BRICK_MOSS    = register("walls_granite_brick_moss",    new BlockWalls(Blocks.GRANITE), CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Block> PILAR_GRANITE_BRICK_MOSS    = register("pilar_granite_brick_moss",    new BlockPilar(Blocks.GRANITE), CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Block> BLOCK_GRANITE_BRICK_CRACKED = register("block_granite_brick_cracked", new BlockBlock(Blocks.GRANITE), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> SLABS_GRANITE_BRICK_CRACKED = register("slabs_granite_brick_cracked", new BlockSlabs(Blocks.GRANITE), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> STAIR_GRANITE_BRICK_CRACKED = register("stair_granite_brick_cracked", new BlockStair(Blocks.GRANITE), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> WALLS_GRANITE_BRICK_CRACKED = register("walls_granite_brick_cracked", new BlockWalls(Blocks.GRANITE), CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Block> PILAR_GRANITE_BRICK_CRACKED = register("pilar_granite_brick_cracked", new BlockPilar(Blocks.GRANITE), CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Block> BLOCK_GRANITE_BRICK_CARVED  = register("block_granite_brick_carved",  new BlockBlock(Blocks.GRANITE), CreativeModeTab.TAB_BUILDING_BLOCKS);

    // Diorite
    //                                        BLOCK_DIORITE_STONE
    //                                        SLABS_DIORITE_STONE
    //                                        STAIR_DIORITE_STONE
    //                                        WALLS_DIORITE_STONE
    public static final RegistryObject<Block> PILAR_DIORITE_STONE         = register("pilar_diorite_stone",         new BlockPilar(Blocks.DIORITE), CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Block> BLOCK_DIORITE_COBBLE        = register("block_diorite_cobble",        new BlockBlock(Blocks.DIORITE), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> SLABS_DIORITE_COBBLE        = register("slabs_diorite_cobble",        new BlockSlabs(Blocks.DIORITE), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> STAIR_DIORITE_COBBLE        = register("stair_diorite_cobble",        new BlockStair(Blocks.DIORITE), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> WALLS_DIORITE_COBBLE        = register("walls_diorite_cobble",        new BlockWalls(Blocks.DIORITE), CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Block> PILAR_DIORITE_COBBLE        = register("pilar_diorite_cobble",        new BlockPilar(Blocks.DIORITE), CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Block> BLOCK_DIORITE_COBBLE_MOSS   = register("block_diorite_cobble_moss",   new BlockBlock(Blocks.DIORITE), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> SLABS_DIORITE_COBBLE_MOSS   = register("slabs_diorite_cobble_moss",   new BlockSlabs(Blocks.DIORITE), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> STAIR_DIORITE_COBBLE_MOSS   = register("stair_diorite_cobble_moss",   new BlockStair(Blocks.DIORITE), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> WALLS_DIORITE_COBBLE_MOSS   = register("walls_diorite_cobble_moss",   new BlockWalls(Blocks.DIORITE), CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Block> PILAR_DIORITE_COBBLE_MOSS   = register("pilar_diorite_cobble_moss",   new BlockPilar(Blocks.DIORITE), CreativeModeTab.TAB_DECORATIONS);
    //                                        BLOCK_DIORITE_SMOOTH
    //                                        SLABS_DIORITE_SMOOTH
    //                                        STAIR_DIORITE_SMOOTH
    public static final RegistryObject<Block> WALLS_DIORITE_SMOOTH        = register("walls_diorite_smooth",        new BlockWalls(Blocks.DIORITE), CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Block> PILAR_DIORITE_SMOOTH        = register("pilar_diorite_smooth",        new BlockPilar(Blocks.DIORITE), CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Block> BLOCK_DIORITE_BRICK         = register("block_diorite_brick",         new BlockBlock(Blocks.DIORITE), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> SLABS_DIORITE_BRICK         = register("slabs_diorite_brick",         new BlockSlabs(Blocks.DIORITE), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> STAIR_DIORITE_BRICK         = register("stair_diorite_brick",         new BlockStair(Blocks.DIORITE), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> WALLS_DIORITE_BRICK         = register("walls_diorite_brick",         new BlockWalls(Blocks.DIORITE), CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Block> PILAR_DIORITE_BRICK         = register("pilar_diorite_brick",         new BlockPilar(Blocks.DIORITE), CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Block> BLOCK_DIORITE_BRICK_MOSS    = register("block_diorite_brick_moss",    new BlockBlock(Blocks.DIORITE), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> SLABS_DIORITE_BRICK_MOSS    = register("slabs_diorite_brick_moss",    new BlockSlabs(Blocks.DIORITE), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> STAIR_DIORITE_BRICK_MOSS    = register("stair_diorite_brick_moss",    new BlockStair(Blocks.DIORITE), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> WALLS_DIORITE_BRICK_MOSS    = register("walls_diorite_brick_moss",    new BlockWalls(Blocks.DIORITE), CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Block> PILAR_DIORITE_BRICK_MOSS    = register("pilar_diorite_brick_moss",    new BlockPilar(Blocks.DIORITE), CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Block> BLOCK_DIORITE_BRICK_CRACKED = register("block_diorite_brick_cracked", new BlockBlock(Blocks.DIORITE), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> SLABS_DIORITE_BRICK_CRACKED = register("slabs_diorite_brick_cracked", new BlockSlabs(Blocks.DIORITE), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> STAIR_DIORITE_BRICK_CRACKED = register("stair_diorite_brick_cracked", new BlockStair(Blocks.DIORITE), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> WALLS_DIORITE_BRICK_CRACKED = register("walls_diorite_brick_cracked", new BlockWalls(Blocks.DIORITE), CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Block> PILAR_DIORITE_BRICK_CRACKED = register("pilar_diorite_brick_cracked", new BlockPilar(Blocks.DIORITE), CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Block> BLOCK_DIORITE_BRICK_CARVED  = register("block_diorite_brick_carved",  new BlockBlock(Blocks.DIORITE), CreativeModeTab.TAB_BUILDING_BLOCKS);

    // Andesite
    //                                        BLOCK_ANDESITE_STONE
    //                                        SLABS_ANDESITE_STONE
    //                                        STAIR_ANDESITE_STONE
    //                                        WALLS_ANDESITE_STONE
    public static final RegistryObject<Block> PILAR_ANDESITE_STONE         = register("pilar_andesite_stone",         new BlockPilar(Blocks.ANDESITE), CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Block> BLOCK_ANDESITE_COBBLE        = register("block_andesite_cobble",        new BlockBlock(Blocks.ANDESITE), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> SLABS_ANDESITE_COBBLE        = register("slabs_andesite_cobble",        new BlockSlabs(Blocks.ANDESITE), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> STAIR_ANDESITE_COBBLE        = register("stair_andesite_cobble",        new BlockStair(Blocks.ANDESITE), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> WALLS_ANDESITE_COBBLE        = register("walls_andesite_cobble",        new BlockWalls(Blocks.ANDESITE), CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Block> PILAR_ANDESITE_COBBLE        = register("pilar_andesite_cobble",        new BlockPilar(Blocks.ANDESITE), CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Block> BLOCK_ANDESITE_COBBLE_MOSS   = register("block_andesite_cobble_moss",   new BlockBlock(Blocks.ANDESITE), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> SLABS_ANDESITE_COBBLE_MOSS   = register("slabs_andesite_cobble_moss",   new BlockSlabs(Blocks.ANDESITE), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> STAIR_ANDESITE_COBBLE_MOSS   = register("stair_andesite_cobble_moss",   new BlockStair(Blocks.ANDESITE), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> WALLS_ANDESITE_COBBLE_MOSS   = register("walls_andesite_cobble_moss",   new BlockWalls(Blocks.ANDESITE), CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Block> PILAR_ANDESITE_COBBLE_MOSS   = register("pilar_andesite_cobble_moss",   new BlockPilar(Blocks.ANDESITE), CreativeModeTab.TAB_DECORATIONS);
    //                                        BLOCK_ANDESITE_SMOOTH
    //                                        SLABS_ANDESITE_SMOOTH
    //                                        STAIR_ANDESITE_SMOOTH
    public static final RegistryObject<Block> WALLS_ANDESITE_SMOOTH        = register("walls_andesite_smooth",        new BlockWalls(Blocks.ANDESITE), CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Block> PILAR_ANDESITE_SMOOTH        = register("pilar_andesite_smooth",        new BlockPilar(Blocks.ANDESITE), CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Block> BLOCK_ANDESITE_BRICK         = register("block_andesite_brick",         new BlockBlock(Blocks.ANDESITE), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> SLABS_ANDESITE_BRICK         = register("slabs_andesite_brick",         new BlockSlabs(Blocks.ANDESITE), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> STAIR_ANDESITE_BRICK         = register("stair_andesite_brick",         new BlockStair(Blocks.ANDESITE), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> WALLS_ANDESITE_BRICK         = register("walls_andesite_brick",         new BlockWalls(Blocks.ANDESITE), CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Block> PILAR_ANDESITE_BRICK         = register("pilar_andesite_brick",         new BlockPilar(Blocks.ANDESITE), CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Block> BLOCK_ANDESITE_BRICK_MOSS    = register("block_andesite_brick_moss",    new BlockBlock(Blocks.ANDESITE), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> SLABS_ANDESITE_BRICK_MOSS    = register("slabs_andesite_brick_moss",    new BlockSlabs(Blocks.ANDESITE), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> STAIR_ANDESITE_BRICK_MOSS    = register("stair_andesite_brick_moss",    new BlockStair(Blocks.ANDESITE), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> WALLS_ANDESITE_BRICK_MOSS    = register("walls_andesite_brick_moss",    new BlockWalls(Blocks.ANDESITE), CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Block> PILAR_ANDESITE_BRICK_MOSS    = register("pilar_andesite_brick_moss",    new BlockPilar(Blocks.ANDESITE), CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Block> BLOCK_ANDESITE_BRICK_CRACKED = register("block_andesite_brick_cracked", new BlockBlock(Blocks.ANDESITE), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> SLABS_ANDESITE_BRICK_CRACKED = register("slabs_andesite_brick_cracked", new BlockSlabs(Blocks.ANDESITE), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> STAIR_ANDESITE_BRICK_CRACKED = register("stair_andesite_brick_cracked", new BlockStair(Blocks.ANDESITE), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> WALLS_ANDESITE_BRICK_CRACKED = register("walls_andesite_brick_cracked", new BlockWalls(Blocks.ANDESITE), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> PILAR_ANDESITE_BRICK_CRACKED = register("pilar_andesite_brick_cracked", new BlockPilar(Blocks.ANDESITE), CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Block> BLOCK_ANDESITE_BRICK_CARVED  = register("block_andesite_brick_carved",  new BlockBlock(Blocks.ANDESITE), CreativeModeTab.TAB_DECORATIONS);

    // Prismarine
    //                                        SLABS_PRISMARINE_STONE
    //                                        STAIR_PRISMARINE_STONE
    //                                        WALLS_PRISMARINE_STONE
    public static final RegistryObject<Block> PILAR_PRISMARINE_STONE = register("pilar_prismarine_stone", new BlockPilar(Blocks.PRISMARINE), CreativeModeTab.TAB_DECORATIONS);
    //                                        SLABS_PRISMARINE_BRICK
    //                                        STAIR_PRISMARINE_BRICK
    public static final RegistryObject<Block> WALLS_PRISMARINE_BRICK = register("walls_prismarine_brick", new BlockWalls(Blocks.PRISMARINE), CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Block> PILAR_PRISMARINE_BRICK = register("pilar_prismarine_brick", new BlockPilar(Blocks.PRISMARINE), CreativeModeTab.TAB_DECORATIONS);
    //                                        SLABS_PRISMARINE_DARK
    //                                        STAIR_PRISMARINE_DARK
    public static final RegistryObject<Block> WALLS_PRISMARINE_DARK  = register("walls_prismarine_dark",  new BlockWalls(Blocks.PRISMARINE), CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Block> PILAR_PRISMARINE_DARK  = register("pilar_prismarine_dark",  new BlockPilar(Blocks.PRISMARINE), CreativeModeTab.TAB_DECORATIONS);

    // End Stone
    //                                        BLOCK_END_STONE
    public static final RegistryObject<Block> SLABS_END_STONE         = register("slabs_end_stone",         new BlockSlabs(Blocks.END_STONE), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> STAIR_END_STONE         = register("stair_end_stone",         new BlockStair(Blocks.END_STONE), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> WALLS_END_STONE         = register("walls_end_stone",         new BlockWalls(Blocks.END_STONE), CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Block> PILAR_END_STONE         = register("pilar_end_stone",         new BlockPilar(Blocks.END_STONE), CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Block> BLOCK_END_COBBLE        = register("block_end_cobble",        new BlockBlock(Blocks.END_STONE), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> SLABS_END_COBBLE        = register("slabs_end_cobble",        new BlockSlabs(Blocks.END_STONE), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> STAIR_END_COBBLE        = register("stair_end_cobble",        new BlockStair(Blocks.END_STONE), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> WALLS_END_COBBLE        = register("walls_end_cobble",        new BlockWalls(Blocks.END_STONE), CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Block> PILAR_END_COBBLE        = register("pilar_end_cobble",        new BlockPilar(Blocks.END_STONE), CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Block> BLOCK_END_COBBLE_MOSS   = register("block_end_cobble_moss",   new BlockBlock(Blocks.END_STONE), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> SLABS_END_COBBLE_MOSS   = register("slabs_end_cobble_moss",   new BlockSlabs(Blocks.END_STONE), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> STAIR_END_COBBLE_MOSS   = register("stair_end_cobble_moss",   new BlockStair(Blocks.END_STONE), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> WALLS_END_COBBLE_MOSS   = register("walls_end_cobble_moss",   new BlockWalls(Blocks.END_STONE), CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Block> PILAR_END_COBBLE_MOSS   = register("pilar_end_cobble_moss",   new BlockPilar(Blocks.END_STONE), CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Block> BLOCK_END_SMOOTH        = register("block_end_smooth",        new BlockBlock(Blocks.END_STONE), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> SLABS_END_SMOOTH        = register("slabs_end_smooth",        new BlockSlabs(Blocks.END_STONE), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> STAIR_END_SMOOTH        = register("stair_end_smooth",        new BlockStair(Blocks.END_STONE), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> WALLS_END_SMOOTH        = register("walls_end_smooth",        new BlockWalls(Blocks.END_STONE), CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Block> PILAR_END_SMOOTH        = register("pilar_end_smooth",        new BlockPilar(Blocks.END_STONE), CreativeModeTab.TAB_DECORATIONS);
    //                                        BLOCK_END_BRICK
    //                                        SLABS_END_BRICK
    //                                        STAIR_END_BRICK
    //                                        WALLS_END_BRICK
    public static final RegistryObject<Block> PILAR_END_BRICK         = register("pilar_end_brick",         new BlockPilar(Blocks.END_STONE), CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Block> BLOCK_END_BRICK_MOSS    = register("block_end_brick_moss",    new BlockBlock(Blocks.END_STONE), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> SLABS_END_BRICK_MOSS    = register("slabs_end_brick_moss",    new BlockSlabs(Blocks.END_STONE), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> STAIR_END_BRICK_MOSS    = register("stair_end_brick_moss",    new BlockStair(Blocks.END_STONE), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> WALLS_END_BRICK_MOSS    = register("walls_end_brick_moss",    new BlockWalls(Blocks.END_STONE), CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Block> PILAR_END_BRICK_MOSS    = register("pilar_end_brick_moss",    new BlockPilar(Blocks.END_STONE), CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Block> BLOCK_END_BRICK_CRACKED = register("block_end_brick_cracked", new BlockBlock(Blocks.END_STONE), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> SLABS_END_BRICK_CRACKED = register("slabs_end_brick_cracked", new BlockSlabs(Blocks.END_STONE), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> STAIR_END_BRICK_CRACKED = register("stair_end_brick_cracked", new BlockStair(Blocks.END_STONE), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> WALLS_END_BRICK_CRACKED = register("walls_end_brick_cracked", new BlockWalls(Blocks.END_STONE), CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Block> PILAR_END_BRICK_CRACKED = register("pilar_end_brick_cracked", new BlockPilar(Blocks.END_STONE), CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Block> BLOCK_END_BRICK_CARVED  = register("block_end_brick_carved",  new BlockBlock(Blocks.END_STONE), CreativeModeTab.TAB_BUILDING_BLOCKS);

    // Concrete
    public static final RegistryObject<Block> SLABS_CONCRETE_WHITE      = register("slabs_concrete_white",      new BlockSlabs(Blocks.WHITE_CONCRETE),      CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> STAIR_CONCRETE_WHITE      = register("stair_concrete_white",      new BlockStair(Blocks.WHITE_CONCRETE),      CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> WALLS_CONCRETE_WHITE      = register("walls_concrete_white",      new BlockWalls(Blocks.WHITE_CONCRETE),      CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Block> PILAR_CONCRETE_WHITE      = register("pilar_concrete_white",      new BlockPilar(Blocks.WHITE_CONCRETE),      CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Block> SLABS_CONCRETE_ORANGE     = register("slabs_concrete_orange",     new BlockSlabs(Blocks.ORANGE_CONCRETE),     CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> STAIR_CONCRETE_ORANGE     = register("stair_concrete_orange",     new BlockStair(Blocks.ORANGE_CONCRETE),     CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> WALLS_CONCRETE_ORANGE     = register("walls_concrete_orange",     new BlockWalls(Blocks.ORANGE_CONCRETE),     CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Block> PILAR_CONCRETE_ORANGE     = register("pilar_concrete_orange",     new BlockPilar(Blocks.ORANGE_CONCRETE),     CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Block> SLABS_CONCRETE_MAGENTA    = register("slabs_concrete_magenta",    new BlockSlabs(Blocks.MAGENTA_CONCRETE),    CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> STAIR_CONCRETE_MAGENTA    = register("stair_concrete_magenta",    new BlockStair(Blocks.MAGENTA_CONCRETE),    CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> WALLS_CONCRETE_MAGENTA    = register("walls_concrete_magenta",    new BlockWalls(Blocks.MAGENTA_CONCRETE),    CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Block> PILAR_CONCRETE_MAGENTA    = register("pilar_concrete_magenta",    new BlockPilar(Blocks.MAGENTA_CONCRETE),    CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Block> SLABS_CONCRETE_LIGHT_BLUE = register("slabs_concrete_light_blue", new BlockSlabs(Blocks.LIGHT_BLUE_CONCRETE), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> STAIR_CONCRETE_LIGHT_BLUE = register("stair_concrete_light_blue", new BlockStair(Blocks.LIGHT_BLUE_CONCRETE), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> WALLS_CONCRETE_LIGHT_BLUE = register("walls_concrete_light_blue", new BlockWalls(Blocks.LIGHT_BLUE_CONCRETE), CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Block> PILAR_CONCRETE_LIGHT_BLUE = register("pilar_concrete_light_blue", new BlockPilar(Blocks.LIGHT_BLUE_CONCRETE), CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Block> SLABS_CONCRETE_YELLOW     = register("slabs_concrete_yellow",     new BlockSlabs(Blocks.YELLOW_CONCRETE),     CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> STAIR_CONCRETE_YELLOW     = register("stair_concrete_yellow",     new BlockStair(Blocks.YELLOW_CONCRETE),     CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> WALLS_CONCRETE_YELLOW     = register("walls_concrete_yellow",     new BlockWalls(Blocks.YELLOW_CONCRETE),     CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Block> PILAR_CONCRETE_YELLOW     = register("pilar_concrete_yellow",     new BlockPilar(Blocks.YELLOW_CONCRETE),     CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Block> SLABS_CONCRETE_LIME       = register("slabs_concrete_lime",       new BlockSlabs(Blocks.LIME_CONCRETE),       CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> STAIR_CONCRETE_LIME       = register("stair_concrete_lime",       new BlockStair(Blocks.LIME_CONCRETE),       CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> WALLS_CONCRETE_LIME       = register("walls_concrete_lime",       new BlockWalls(Blocks.LIME_CONCRETE),       CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Block> PILAR_CONCRETE_LIME       = register("pilar_concrete_lime",       new BlockPilar(Blocks.LIME_CONCRETE),       CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Block> SLABS_CONCRETE_PINK       = register("slabs_concrete_pink",       new BlockSlabs(Blocks.PINK_CONCRETE),       CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> STAIR_CONCRETE_PINK       = register("stair_concrete_pink",       new BlockStair(Blocks.PINK_CONCRETE),       CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> WALLS_CONCRETE_PINK       = register("walls_concrete_pink",       new BlockWalls(Blocks.PINK_CONCRETE),       CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Block> PILAR_CONCRETE_PINK       = register("pilar_concrete_pink",       new BlockPilar(Blocks.PINK_CONCRETE),       CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Block> SLABS_CONCRETE_GRAY       = register("slabs_concrete_gray",       new BlockSlabs(Blocks.GRAY_CONCRETE),       CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> STAIR_CONCRETE_GRAY       = register("stair_concrete_gray",       new BlockStair(Blocks.GRAY_CONCRETE),       CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> WALLS_CONCRETE_GRAY       = register("walls_concrete_gray",       new BlockWalls(Blocks.GRAY_CONCRETE),       CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Block> PILAR_CONCRETE_GRAY       = register("pilar_concrete_gray",       new BlockPilar(Blocks.GRAY_CONCRETE),       CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Block> SLABS_CONCRETE_LIGHT_GRAY = register("slabs_concrete_light_gray", new BlockSlabs(Blocks.LIGHT_GRAY_CONCRETE), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> STAIR_CONCRETE_LIGHT_GRAY = register("stair_concrete_light_gray", new BlockStair(Blocks.LIGHT_GRAY_CONCRETE), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> WALLS_CONCRETE_LIGHT_GRAY = register("walls_concrete_light_gray", new BlockWalls(Blocks.LIGHT_GRAY_CONCRETE), CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Block> PILAR_CONCRETE_LIGHT_GRAY = register("pilar_concrete_light_gray", new BlockPilar(Blocks.LIGHT_GRAY_CONCRETE), CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Block> SLABS_CONCRETE_CYAN       = register("slabs_concrete_cyan",       new BlockSlabs(Blocks.CYAN_CONCRETE),       CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> STAIR_CONCRETE_CYAN       = register("stair_concrete_cyan",       new BlockStair(Blocks.CYAN_CONCRETE),       CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> WALLS_CONCRETE_CYAN       = register("walls_concrete_cyan",       new BlockWalls(Blocks.CYAN_CONCRETE),       CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Block> PILAR_CONCRETE_CYAN       = register("pilar_concrete_cyan",       new BlockPilar(Blocks.CYAN_CONCRETE),       CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Block> SLABS_CONCRETE_PURPLE     = register("slabs_concrete_purple",     new BlockSlabs(Blocks.PURPLE_CONCRETE),     CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> STAIR_CONCRETE_PURPLE     = register("stair_concrete_purple",     new BlockStair(Blocks.PURPLE_CONCRETE),     CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> WALLS_CONCRETE_PURPLE     = register("walls_concrete_purple",     new BlockWalls(Blocks.PURPLE_CONCRETE),     CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Block> PILAR_CONCRETE_PURPLE     = register("pilar_concrete_purple",     new BlockPilar(Blocks.PURPLE_CONCRETE),     CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Block> SLABS_CONCRETE_BLUE       = register("slabs_concrete_blue",       new BlockSlabs(Blocks.BLUE_CONCRETE),       CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> STAIR_CONCRETE_BLUE       = register("stair_concrete_blue",       new BlockStair(Blocks.BLUE_CONCRETE),       CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> WALLS_CONCRETE_BLUE       = register("walls_concrete_blue",       new BlockWalls(Blocks.BLUE_CONCRETE),       CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Block> PILAR_CONCRETE_BLUE       = register("pilar_concrete_blue",       new BlockPilar(Blocks.BLUE_CONCRETE),       CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Block> SLABS_CONCRETE_BROWN      = register("slabs_concrete_brown",      new BlockSlabs(Blocks.BROWN_CONCRETE),      CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> STAIR_CONCRETE_BROWN      = register("stair_concrete_brown",      new BlockStair(Blocks.BROWN_CONCRETE),      CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> WALLS_CONCRETE_BROWN      = register("walls_concrete_brown",      new BlockWalls(Blocks.BROWN_CONCRETE),      CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Block> PILAR_CONCRETE_BROWN      = register("pilar_concrete_brown",      new BlockPilar(Blocks.BROWN_CONCRETE),      CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Block> SLABS_CONCRETE_GREEN      = register("slabs_concrete_green",      new BlockSlabs(Blocks.GREEN_CONCRETE),      CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> STAIR_CONCRETE_GREEN      = register("stair_concrete_green",      new BlockStair(Blocks.GREEN_CONCRETE),      CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> WALLS_CONCRETE_GREEN      = register("walls_concrete_green",      new BlockWalls(Blocks.GREEN_CONCRETE),      CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Block> PILAR_CONCRETE_GREEN      = register("pilar_concrete_green",      new BlockPilar(Blocks.GREEN_CONCRETE),      CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Block> SLABS_CONCRETE_RED        = register("slabs_concrete_red",        new BlockSlabs(Blocks.RED_CONCRETE),        CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> STAIR_CONCRETE_RED        = register("stair_concrete_red",        new BlockStair(Blocks.RED_CONCRETE),        CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> WALLS_CONCRETE_RED        = register("walls_concrete_red",        new BlockWalls(Blocks.RED_CONCRETE),        CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Block> PILAR_CONCRETE_RED        = register("pilar_concrete_red",        new BlockPilar(Blocks.RED_CONCRETE),        CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Block> SLABS_CONCRETE_BLACK      = register("slabs_concrete_black",      new BlockSlabs(Blocks.BLACK_CONCRETE),      CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> STAIR_CONCRETE_BLACK      = register("stair_concrete_black",      new BlockStair(Blocks.BLACK_CONCRETE),      CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> WALLS_CONCRETE_BLACK      = register("walls_concrete_black",      new BlockWalls(Blocks.BLACK_CONCRETE),      CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Block> PILAR_CONCRETE_BLACK      = register("pilar_concrete_black",      new BlockPilar(Blocks.BLACK_CONCRETE),      CreativeModeTab.TAB_DECORATIONS);

    // Timber Frames
    public static final RegistryObject<Block> TIMBER_BASIC_WHITE           = register("timber_basic_white",           new BlockBlock(Blocks.WHITE_TERRACOTTA),      CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> TIMBER_BASIC_ORANGE          = register("timber_basic_orange",          new BlockBlock(Blocks.ORANGE_TERRACOTTA),     CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> TIMBER_BASIC_MAGENTA         = register("timber_basic_magenta",         new BlockBlock(Blocks.MAGENTA_TERRACOTTA),    CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> TIMBER_BASIC_LIGHT_BLUE      = register("timber_basic_light_blue",      new BlockBlock(Blocks.LIGHT_BLUE_TERRACOTTA), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> TIMBER_BASIC_YELLOW          = register("timber_basic_yellow",          new BlockBlock(Blocks.YELLOW_TERRACOTTA),     CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> TIMBER_BASIC_LIME            = register("timber_basic_lime",            new BlockBlock(Blocks.LIME_TERRACOTTA),       CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> TIMBER_BASIC_PINK            = register("timber_basic_pink",            new BlockBlock(Blocks.PINK_TERRACOTTA),       CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> TIMBER_BASIC_GRAY            = register("timber_basic_gray",            new BlockBlock(Blocks.GRAY_TERRACOTTA),       CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> TIMBER_BASIC_LIGHT_GRAY      = register("timber_basic_light_gray",      new BlockBlock(Blocks.LIGHT_GRAY_TERRACOTTA), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> TIMBER_BASIC_CYAN            = register("timber_basic_cyan",            new BlockBlock(Blocks.CYAN_TERRACOTTA),       CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> TIMBER_BASIC_PURPLE          = register("timber_basic_purple",          new BlockBlock(Blocks.PURPLE_TERRACOTTA),     CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> TIMBER_BASIC_BLUE            = register("timber_basic_blue",            new BlockBlock(Blocks.BLUE_TERRACOTTA),       CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> TIMBER_BASIC_BROWN           = register("timber_basic_brown",           new BlockBlock(Blocks.BROWN_TERRACOTTA),      CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> TIMBER_BASIC_GREEN           = register("timber_basic_green",           new BlockBlock(Blocks.GREEN_TERRACOTTA),      CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> TIMBER_BASIC_RED             = register("timber_basic_red",             new BlockBlock(Blocks.RED_TERRACOTTA),        CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> TIMBER_BASIC_BLACK           = register("timber_basic_black",           new BlockBlock(Blocks.BLACK_TERRACOTTA),      CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> TIMBER_HORIZONTAL_WHITE      = register("timber_horizontal_white",      new BlockBlock(Blocks.WHITE_TERRACOTTA),      CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> TIMBER_HORIZONTAL_ORANGE     = register("timber_horizontal_orange",     new BlockBlock(Blocks.ORANGE_TERRACOTTA),     CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> TIMBER_HORIZONTAL_MAGENTA    = register("timber_horizontal_magenta",    new BlockBlock(Blocks.MAGENTA_TERRACOTTA),    CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> TIMBER_HORIZONTAL_LIGHT_BLUE = register("timber_horizontal_light_blue", new BlockBlock(Blocks.LIGHT_BLUE_TERRACOTTA), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> TIMBER_HORIZONTAL_YELLOW     = register("timber_horizontal_yellow",     new BlockBlock(Blocks.YELLOW_TERRACOTTA),     CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> TIMBER_HORIZONTAL_LIME       = register("timber_horizontal_lime",       new BlockBlock(Blocks.LIME_TERRACOTTA),       CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> TIMBER_HORIZONTAL_PINK       = register("timber_horizontal_pink",       new BlockBlock(Blocks.PINK_TERRACOTTA),       CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> TIMBER_HORIZONTAL_GRAY       = register("timber_horizontal_gray",       new BlockBlock(Blocks.GRAY_TERRACOTTA),       CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> TIMBER_HORIZONTAL_LIGHT_GRAY = register("timber_horizontal_light_gray", new BlockBlock(Blocks.LIGHT_GRAY_TERRACOTTA), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> TIMBER_HORIZONTAL_CYAN       = register("timber_horizontal_cyan",       new BlockBlock(Blocks.CYAN_TERRACOTTA),       CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> TIMBER_HORIZONTAL_PURPLE     = register("timber_horizontal_purple",     new BlockBlock(Blocks.PURPLE_TERRACOTTA),     CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> TIMBER_HORIZONTAL_BLUE       = register("timber_horizontal_blue",       new BlockBlock(Blocks.BLUE_TERRACOTTA),       CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> TIMBER_HORIZONTAL_BROWN      = register("timber_horizontal_brown",      new BlockBlock(Blocks.BROWN_TERRACOTTA),      CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> TIMBER_HORIZONTAL_GREEN      = register("timber_horizontal_green",      new BlockBlock(Blocks.GREEN_TERRACOTTA),      CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> TIMBER_HORIZONTAL_RED        = register("timber_horizontal_red",        new BlockBlock(Blocks.RED_TERRACOTTA),        CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> TIMBER_HORIZONTAL_BLACK      = register("timber_horizontal_black",      new BlockBlock(Blocks.BLACK_TERRACOTTA),      CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> TIMBER_VERTICAL_WHITE        = register("timber_vertical_white",        new BlockBlock(Blocks.WHITE_TERRACOTTA),      CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> TIMBER_VERTICAL_ORANGE       = register("timber_vertical_orange",       new BlockBlock(Blocks.ORANGE_TERRACOTTA),     CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> TIMBER_VERTICAL_MAGENTA      = register("timber_vertical_magenta",      new BlockBlock(Blocks.MAGENTA_TERRACOTTA),    CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> TIMBER_VERTICAL_LIGHT_BLUE   = register("timber_vertical_light_blue",   new BlockBlock(Blocks.LIGHT_BLUE_TERRACOTTA), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> TIMBER_VERTICAL_YELLOW       = register("timber_vertical_yellow",       new BlockBlock(Blocks.YELLOW_TERRACOTTA),     CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> TIMBER_VERTICAL_LIME         = register("timber_vertical_lime",         new BlockBlock(Blocks.LIME_TERRACOTTA),       CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> TIMBER_VERTICAL_PINK         = register("timber_vertical_pink",         new BlockBlock(Blocks.PINK_TERRACOTTA),       CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> TIMBER_VERTICAL_GRAY         = register("timber_vertical_gray",         new BlockBlock(Blocks.GRAY_TERRACOTTA),       CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> TIMBER_VERTICAL_LIGHT_GRAY   = register("timber_vertical_light_gray",   new BlockBlock(Blocks.LIGHT_GRAY_TERRACOTTA), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> TIMBER_VERTICAL_CYAN         = register("timber_vertical_cyan",         new BlockBlock(Blocks.CYAN_TERRACOTTA),       CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> TIMBER_VERTICAL_PURPLE       = register("timber_vertical_purple",       new BlockBlock(Blocks.PURPLE_TERRACOTTA),     CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> TIMBER_VERTICAL_BLUE         = register("timber_vertical_blue",         new BlockBlock(Blocks.BLUE_TERRACOTTA),       CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> TIMBER_VERTICAL_BROWN        = register("timber_vertical_brown",        new BlockBlock(Blocks.BROWN_TERRACOTTA),      CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> TIMBER_VERTICAL_GREEN        = register("timber_vertical_green",        new BlockBlock(Blocks.GREEN_TERRACOTTA),      CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> TIMBER_VERTICAL_RED          = register("timber_vertical_red",          new BlockBlock(Blocks.RED_TERRACOTTA),        CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> TIMBER_VERTICAL_BLACK        = register("timber_vertical_black",        new BlockBlock(Blocks.BLACK_TERRACOTTA),      CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> TIMBER_PLUS_WHITE            = register("timber_plus_white",            new BlockBlock(Blocks.WHITE_TERRACOTTA),      CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> TIMBER_PLUS_ORANGE           = register("timber_plus_orange",           new BlockBlock(Blocks.ORANGE_TERRACOTTA),     CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> TIMBER_PLUS_MAGENTA          = register("timber_plus_magenta",          new BlockBlock(Blocks.MAGENTA_TERRACOTTA),    CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> TIMBER_PLUS_LIGHT_BLUE       = register("timber_plus_light_blue",       new BlockBlock(Blocks.LIGHT_BLUE_TERRACOTTA), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> TIMBER_PLUS_YELLOW           = register("timber_plus_yellow",           new BlockBlock(Blocks.YELLOW_TERRACOTTA),     CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> TIMBER_PLUS_LIME             = register("timber_plus_lime",             new BlockBlock(Blocks.LIME_TERRACOTTA),       CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> TIMBER_PLUS_PINK             = register("timber_plus_pink",             new BlockBlock(Blocks.PINK_TERRACOTTA),       CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> TIMBER_PLUS_GRAY             = register("timber_plus_gray",             new BlockBlock(Blocks.GRAY_TERRACOTTA),       CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> TIMBER_PLUS_LIGHT_GRAY       = register("timber_plus_light_gray",       new BlockBlock(Blocks.LIGHT_GRAY_TERRACOTTA), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> TIMBER_PLUS_CYAN             = register("timber_plus_cyan",             new BlockBlock(Blocks.CYAN_TERRACOTTA),       CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> TIMBER_PLUS_PURPLE           = register("timber_plus_purple",           new BlockBlock(Blocks.PURPLE_TERRACOTTA),     CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> TIMBER_PLUS_BLUE             = register("timber_plus_blue",             new BlockBlock(Blocks.BLUE_TERRACOTTA),       CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> TIMBER_PLUS_BROWN            = register("timber_plus_brown",            new BlockBlock(Blocks.BROWN_TERRACOTTA),      CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> TIMBER_PLUS_GREEN            = register("timber_plus_green",            new BlockBlock(Blocks.GREEN_TERRACOTTA),      CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> TIMBER_PLUS_RED              = register("timber_plus_red",              new BlockBlock(Blocks.RED_TERRACOTTA),        CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> TIMBER_PLUS_BLACK            = register("timber_plus_black",            new BlockBlock(Blocks.BLACK_TERRACOTTA),      CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> TIMBER_DIAG_LEFT_WHITE       = register("timber_diag_left_white",       new BlockBlock(Blocks.WHITE_TERRACOTTA),      CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> TIMBER_DIAG_LEFT_ORANGE      = register("timber_diag_left_orange",      new BlockBlock(Blocks.ORANGE_TERRACOTTA),     CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> TIMBER_DIAG_LEFT_MAGENTA     = register("timber_diag_left_magenta",     new BlockBlock(Blocks.MAGENTA_TERRACOTTA),    CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> TIMBER_DIAG_LEFT_LIGHT_BLUE  = register("timber_diag_left_light_blue",  new BlockBlock(Blocks.LIGHT_BLUE_TERRACOTTA), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> TIMBER_DIAG_LEFT_YELLOW      = register("timber_diag_left_yellow",      new BlockBlock(Blocks.YELLOW_TERRACOTTA),     CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> TIMBER_DIAG_LEFT_LIME        = register("timber_diag_left_lime",        new BlockBlock(Blocks.LIME_TERRACOTTA),       CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> TIMBER_DIAG_LEFT_PINK        = register("timber_diag_left_pink",        new BlockBlock(Blocks.PINK_TERRACOTTA),       CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> TIMBER_DIAG_LEFT_GRAY        = register("timber_diag_left_gray",        new BlockBlock(Blocks.GRAY_TERRACOTTA),       CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> TIMBER_DIAG_LEFT_LIGHT_GRAY  = register("timber_diag_left_light_gray",  new BlockBlock(Blocks.LIGHT_GRAY_TERRACOTTA), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> TIMBER_DIAG_LEFT_CYAN        = register("timber_diag_left_cyan",        new BlockBlock(Blocks.CYAN_TERRACOTTA),       CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> TIMBER_DIAG_LEFT_PURPLE      = register("timber_diag_left_purple",      new BlockBlock(Blocks.PURPLE_TERRACOTTA),     CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> TIMBER_DIAG_LEFT_BLUE        = register("timber_diag_left_blue",        new BlockBlock(Blocks.BLUE_TERRACOTTA),       CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> TIMBER_DIAG_LEFT_BROWN       = register("timber_diag_left_brown",       new BlockBlock(Blocks.BROWN_TERRACOTTA),      CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> TIMBER_DIAG_LEFT_GREEN       = register("timber_diag_left_green",       new BlockBlock(Blocks.GREEN_TERRACOTTA),      CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> TIMBER_DIAG_LEFT_RED         = register("timber_diag_left_red",         new BlockBlock(Blocks.RED_TERRACOTTA),        CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> TIMBER_DIAG_LEFT_BLACK       = register("timber_diag_left_black",       new BlockBlock(Blocks.BLACK_TERRACOTTA),      CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> TIMBER_DIAG_RIGHT_WHITE      = register("timber_diag_right_white",      new BlockBlock(Blocks.WHITE_TERRACOTTA),      CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> TIMBER_DIAG_RIGHT_ORANGE     = register("timber_diag_right_orange",     new BlockBlock(Blocks.ORANGE_TERRACOTTA),     CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> TIMBER_DIAG_RIGHT_MAGENTA    = register("timber_diag_right_magenta",    new BlockBlock(Blocks.MAGENTA_TERRACOTTA),    CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> TIMBER_DIAG_RIGHT_LIGHT_BLUE = register("timber_diag_right_light_blue", new BlockBlock(Blocks.LIGHT_BLUE_TERRACOTTA), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> TIMBER_DIAG_RIGHT_YELLOW     = register("timber_diag_right_yellow",     new BlockBlock(Blocks.YELLOW_TERRACOTTA),     CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> TIMBER_DIAG_RIGHT_LIME       = register("timber_diag_right_lime",       new BlockBlock(Blocks.LIME_TERRACOTTA),       CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> TIMBER_DIAG_RIGHT_PINK       = register("timber_diag_right_pink",       new BlockBlock(Blocks.PINK_TERRACOTTA),       CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> TIMBER_DIAG_RIGHT_GRAY       = register("timber_diag_right_gray",       new BlockBlock(Blocks.GRAY_TERRACOTTA),       CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> TIMBER_DIAG_RIGHT_LIGHT_GRAY = register("timber_diag_right_light_gray", new BlockBlock(Blocks.LIGHT_GRAY_TERRACOTTA), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> TIMBER_DIAG_RIGHT_CYAN       = register("timber_diag_right_cyan",       new BlockBlock(Blocks.CYAN_TERRACOTTA),       CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> TIMBER_DIAG_RIGHT_PURPLE     = register("timber_diag_right_purple",     new BlockBlock(Blocks.PURPLE_TERRACOTTA),     CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> TIMBER_DIAG_RIGHT_BLUE       = register("timber_diag_right_blue",       new BlockBlock(Blocks.BLUE_TERRACOTTA),       CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> TIMBER_DIAG_RIGHT_BROWN      = register("timber_diag_right_brown",      new BlockBlock(Blocks.BROWN_TERRACOTTA),      CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> TIMBER_DIAG_RIGHT_GREEN      = register("timber_diag_right_green",      new BlockBlock(Blocks.GREEN_TERRACOTTA),      CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> TIMBER_DIAG_RIGHT_RED        = register("timber_diag_right_red",        new BlockBlock(Blocks.RED_TERRACOTTA),        CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> TIMBER_DIAG_RIGHT_BLACK      = register("timber_diag_right_black",      new BlockBlock(Blocks.BLACK_TERRACOTTA),      CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> TIMBER_CROSS_WHITE           = register("timber_cross_white",           new BlockBlock(Blocks.WHITE_TERRACOTTA),      CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> TIMBER_CROSS_ORANGE          = register("timber_cross_orange",          new BlockBlock(Blocks.ORANGE_TERRACOTTA),     CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> TIMBER_CROSS_MAGENTA         = register("timber_cross_magenta",         new BlockBlock(Blocks.MAGENTA_TERRACOTTA),    CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> TIMBER_CROSS_LIGHT_BLUE      = register("timber_cross_light_blue",      new BlockBlock(Blocks.LIGHT_BLUE_TERRACOTTA), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> TIMBER_CROSS_YELLOW          = register("timber_cross_yellow",          new BlockBlock(Blocks.YELLOW_TERRACOTTA),     CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> TIMBER_CROSS_LIME            = register("timber_cross_lime",            new BlockBlock(Blocks.LIME_TERRACOTTA),       CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> TIMBER_CROSS_PINK            = register("timber_cross_pink",            new BlockBlock(Blocks.PINK_TERRACOTTA),       CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> TIMBER_CROSS_GRAY            = register("timber_cross_gray",            new BlockBlock(Blocks.GRAY_TERRACOTTA),       CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> TIMBER_CROSS_LIGHT_GRAY      = register("timber_cross_light_gray",      new BlockBlock(Blocks.LIGHT_GRAY_TERRACOTTA), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> TIMBER_CROSS_CYAN            = register("timber_cross_cyan",            new BlockBlock(Blocks.CYAN_TERRACOTTA),       CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> TIMBER_CROSS_PURPLE          = register("timber_cross_purple",          new BlockBlock(Blocks.PURPLE_TERRACOTTA),     CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> TIMBER_CROSS_BLUE            = register("timber_cross_blue",            new BlockBlock(Blocks.BLUE_TERRACOTTA),       CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> TIMBER_CROSS_BROWN           = register("timber_cross_brown",           new BlockBlock(Blocks.BROWN_TERRACOTTA),      CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> TIMBER_CROSS_GREEN           = register("timber_cross_green",           new BlockBlock(Blocks.GREEN_TERRACOTTA),      CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> TIMBER_CROSS_RED             = register("timber_cross_red",             new BlockBlock(Blocks.RED_TERRACOTTA),        CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> TIMBER_CROSS_BLACK           = register("timber_cross_black",           new BlockBlock(Blocks.BLACK_TERRACOTTA),      CreativeModeTab.TAB_BUILDING_BLOCKS);

    // Other Blocks
    public static final RegistryObject<Block> BLOCK_SCAFFOLDING = register("timber_scaffolding", new BlockScaffolding(Blocks.OAK_PLANKS), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> BLOCK_CHAIN_IRON  = register("block_chain_iron",   new BlockChain(      Blocks.IRON_BLOCK), CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Block> BLOCK_CHAIN_GOLD  = register("block_chain_gold",   new BlockChain(      Blocks.GOLD_BLOCK), CreativeModeTab.TAB_DECORATIONS);

    // Gargoyles
    public static final RegistryObject<Block> GOYLE_DOG_STONE    = register("goyle_dog_stone",    new BlockGargoyle(Blocks.STONE),     CreativeModeTab.TAB_REDSTONE);
    public static final RegistryObject<Block> GOYLE_DOG_GRANITE  = register("goyle_dog_granite",  new BlockGargoyle(Blocks.GRANITE),   CreativeModeTab.TAB_REDSTONE);
    public static final RegistryObject<Block> GOYLE_DOG_DIORITE  = register("goyle_dog_diorite",  new BlockGargoyle(Blocks.DIORITE),   CreativeModeTab.TAB_REDSTONE);
    public static final RegistryObject<Block> GOYLE_DOG_ANDESITE = register("goyle_dog_andesite", new BlockGargoyle(Blocks.ANDESITE),  CreativeModeTab.TAB_REDSTONE);
    public static final RegistryObject<Block> GOYLE_DOG_END      = register("goyle_dog_end",      new BlockGargoyle(Blocks.END_STONE), CreativeModeTab.TAB_REDSTONE);

    // Emitter Blocks
    public static final RegistryObject<Block> BLOCK_EMITTER_WHITE      = register("block_emitter_white",      new BlockEmitter(Blocks.OBSERVER), CreativeModeTab.TAB_REDSTONE);
    public static final RegistryObject<Block> BLOCK_EMITTER_ORANGE     = register("block_emitter_orange",     new BlockEmitter(Blocks.OBSERVER), CreativeModeTab.TAB_REDSTONE);
    public static final RegistryObject<Block> BLOCK_EMITTER_MAGENTA    = register("block_emitter_magenta",    new BlockEmitter(Blocks.OBSERVER), CreativeModeTab.TAB_REDSTONE);
    public static final RegistryObject<Block> BLOCK_EMITTER_LIGHT_BLUE = register("block_emitter_light_blue", new BlockEmitter(Blocks.OBSERVER), CreativeModeTab.TAB_REDSTONE);
    public static final RegistryObject<Block> BLOCK_EMITTER_YELLOW     = register("block_emitter_yellow",     new BlockEmitter(Blocks.OBSERVER), CreativeModeTab.TAB_REDSTONE);
    public static final RegistryObject<Block> BLOCK_EMITTER_LIME       = register("block_emitter_lime",       new BlockEmitter(Blocks.OBSERVER), CreativeModeTab.TAB_REDSTONE);
    public static final RegistryObject<Block> BLOCK_EMITTER_PINK       = register("block_emitter_pink",       new BlockEmitter(Blocks.OBSERVER), CreativeModeTab.TAB_REDSTONE);
    public static final RegistryObject<Block> BLOCK_EMITTER_GRAY       = register("block_emitter_gray",       new BlockEmitter(Blocks.OBSERVER), CreativeModeTab.TAB_REDSTONE);
    public static final RegistryObject<Block> BLOCK_EMITTER_LIGHT_GRAY = register("block_emitter_light_gray", new BlockEmitter(Blocks.OBSERVER), CreativeModeTab.TAB_REDSTONE);
    public static final RegistryObject<Block> BLOCK_EMITTER_CYAN       = register("block_emitter_cyan",       new BlockEmitter(Blocks.OBSERVER), CreativeModeTab.TAB_REDSTONE);
    public static final RegistryObject<Block> BLOCK_EMITTER_PURPLE     = register("block_emitter_purple",     new BlockEmitter(Blocks.OBSERVER), CreativeModeTab.TAB_REDSTONE);
    public static final RegistryObject<Block> BLOCK_EMITTER_BLUE       = register("block_emitter_blue",       new BlockEmitter(Blocks.OBSERVER), CreativeModeTab.TAB_REDSTONE);
    public static final RegistryObject<Block> BLOCK_EMITTER_BROWN      = register("block_emitter_brown",      new BlockEmitter(Blocks.OBSERVER), CreativeModeTab.TAB_REDSTONE);
    public static final RegistryObject<Block> BLOCK_EMITTER_GREEN      = register("block_emitter_green",      new BlockEmitter(Blocks.OBSERVER), CreativeModeTab.TAB_REDSTONE);
    public static final RegistryObject<Block> BLOCK_EMITTER_RED        = register("block_emitter_red",        new BlockEmitter(Blocks.OBSERVER), CreativeModeTab.TAB_REDSTONE);
    public static final RegistryObject<Block> BLOCK_EMITTER_BLACK      = register("block_emitter_black",      new BlockEmitter(Blocks.OBSERVER), CreativeModeTab.TAB_REDSTONE);

    // Light Blocks
    public static final RegistryObject<Block> BLOCK_LIGHT_WHITE      = register("block_light_white",      new BlockLight(Blocks.WHITE_STAINED_GLASS,      DyeColor.WHITE));
    public static final RegistryObject<Block> BLOCK_LIGHT_ORANGE     = register("block_light_orange",     new BlockLight(Blocks.ORANGE_STAINED_GLASS,     DyeColor.ORANGE));
    public static final RegistryObject<Block> BLOCK_LIGHT_MAGENTA    = register("block_light_magenta",    new BlockLight(Blocks.MAGENTA_STAINED_GLASS,    DyeColor.MAGENTA));
    public static final RegistryObject<Block> BLOCK_LIGHT_LIGHT_BLUE = register("block_light_light_blue", new BlockLight(Blocks.LIGHT_BLUE_STAINED_GLASS, DyeColor.LIGHT_BLUE));
    public static final RegistryObject<Block> BLOCK_LIGHT_YELLOW     = register("block_light_yellow",     new BlockLight(Blocks.YELLOW_STAINED_GLASS,     DyeColor.YELLOW));
    public static final RegistryObject<Block> BLOCK_LIGHT_LIME       = register("block_light_lime",       new BlockLight(Blocks.LIME_STAINED_GLASS,       DyeColor.LIME));
    public static final RegistryObject<Block> BLOCK_LIGHT_PINK       = register("block_light_pink",       new BlockLight(Blocks.PINK_STAINED_GLASS,       DyeColor.PINK));
    public static final RegistryObject<Block> BLOCK_LIGHT_GRAY       = register("block_light_gray",       new BlockLight(Blocks.GRAY_STAINED_GLASS,       DyeColor.GRAY));
    public static final RegistryObject<Block> BLOCK_LIGHT_LIGHT_GRAY = register("block_light_light_gray", new BlockLight(Blocks.LIGHT_GRAY_STAINED_GLASS, DyeColor.LIGHT_GRAY));
    public static final RegistryObject<Block> BLOCK_LIGHT_CYAN       = register("block_light_cyan",       new BlockLight(Blocks.CYAN_STAINED_GLASS,       DyeColor.CYAN));
    public static final RegistryObject<Block> BLOCK_LIGHT_PURPLE     = register("block_light_purple",     new BlockLight(Blocks.PURPLE_STAINED_GLASS,     DyeColor.PURPLE));
    public static final RegistryObject<Block> BLOCK_LIGHT_BLUE       = register("block_light_blue",       new BlockLight(Blocks.BLUE_STAINED_GLASS,       DyeColor.BLUE));
    public static final RegistryObject<Block> BLOCK_LIGHT_BROWN      = register("block_light_brown",      new BlockLight(Blocks.BROWN_STAINED_GLASS,      DyeColor.BROWN));
    public static final RegistryObject<Block> BLOCK_LIGHT_GREEN      = register("block_light_green",      new BlockLight(Blocks.GREEN_STAINED_GLASS,      DyeColor.GREEN));
    public static final RegistryObject<Block> BLOCK_LIGHT_RED        = register("block_light_red",        new BlockLight(Blocks.RED_STAINED_GLASS,        DyeColor.RED));
    public static final RegistryObject<Block> BLOCK_LIGHT_BLACK      = register("block_light_black",      new BlockLight(Blocks.BLACK_STAINED_GLASS,      DyeColor.BLACK));





    //----------------------------------------REGISTER----------------------------------------//

    static void register(){
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    private static RegistryObject<Block> register(String name, Block block){
        return register(name, block, null);
    }

    private static RegistryObject<Block> register(String name, Block block, CreativeModeTab CreativeModeTab){
        if(CreativeModeTab != null){ ITEMS.register(name, () -> new BlockItem(block, (new Item.Properties()).tab(CreativeModeTab))); }
        return BLOCKS.register(name, () -> block);
    }

    private static RegistryObject<Item> register(String name, Item item){
        return ITEMS.register(name, () -> item);
    }





    //----------------------------------------SETUP----------------------------------------//

    static void setup(FMLCommonSetupEvent event){

    }

    @OnlyIn(Dist.CLIENT)
    static void setup(FMLClientSetupEvent event){
        //DeferredWorkQueue.runLater(() -> {
            ItemBlockRenderTypes.setRenderLayer(StairKeeper.BLOCK_LIGHT_WHITE.get(),      RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(StairKeeper.BLOCK_LIGHT_ORANGE.get(),     RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(StairKeeper.BLOCK_LIGHT_MAGENTA.get(),    RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(StairKeeper.BLOCK_LIGHT_LIGHT_BLUE.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(StairKeeper.BLOCK_LIGHT_YELLOW.get(),     RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(StairKeeper.BLOCK_LIGHT_LIME.get(),       RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(StairKeeper.BLOCK_LIGHT_PINK.get(),       RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(StairKeeper.BLOCK_LIGHT_GRAY.get(),       RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(StairKeeper.BLOCK_LIGHT_LIGHT_GRAY.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(StairKeeper.BLOCK_LIGHT_CYAN.get(),       RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(StairKeeper.BLOCK_LIGHT_PURPLE.get(),     RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(StairKeeper.BLOCK_LIGHT_BLUE.get(),       RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(StairKeeper.BLOCK_LIGHT_BROWN.get(),      RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(StairKeeper.BLOCK_LIGHT_GREEN.get(),      RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(StairKeeper.BLOCK_LIGHT_RED.get(),        RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(StairKeeper.BLOCK_LIGHT_BLACK.get(),      RenderType.translucent());
        //});
    }



}
