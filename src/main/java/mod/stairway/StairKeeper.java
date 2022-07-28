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

    // Add Moss Blocks Crafting Recipes

    private static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MODID);
    private static final DeferredRegister<Item>  ITEMS  = DeferredRegister.create(ForgeRegistries.ITEMS,  MODID);





    // Stone
    //                                        BLOCK_STONE_STONES
    //                                        SLABS_STONE_STONES
    //                                        STAIR_STONE_STONES
    public static final RegistryObject<Block> WALLS_STONE_STONES       = register("walls_stone_stones",       () -> new BlockWalls(Blocks.STONE), CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Block> PILAR_STONE_STONES       = register("pilar_stone_stones",       () -> new BlockPilar(Blocks.STONE), CreativeModeTab.TAB_DECORATIONS);
    //                                        BLOCK_STONE_SMOOTH
    //                                        SLABS_STONE_SMOOTH
    public static final RegistryObject<Block> STAIR_STONE_SMOOTH       = register("stair_stone_smooth",       () -> new BlockStair(Blocks.STONE), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> WALLS_STONE_SMOOTH       = register("walls_stone_smooth",       () -> new BlockWalls(Blocks.STONE), CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Block> PILAR_STONE_SMOOTH       = register("pilar_stone_smooth",       () -> new BlockPilar(Blocks.STONE), CreativeModeTab.TAB_DECORATIONS);
    //                                        BLOCK_STONE_COBBLE_BASIC
    //                                        SLABS_STONE_COBBLE_BASIC
    //                                        STAIR_STONE_COBBLE_BASIC
    //                                        WALLS_STONE_COBBLE_BASIC
    public static final RegistryObject<Block> PILAR_STONE_COBBLE_BASIC = register("pilar_stone_cobble_basic", () -> new BlockPilar(Blocks.STONE), CreativeModeTab.TAB_DECORATIONS);
    //                                        BLOCK_STONE_COBBLE_MOSSY
    //                                        SLABS_STONE_COBBLE_MOSSY
    //                                        STAIR_STONE_COBBLE_MOSSY
    //                                        WALLS_STONE_COBBLE_MOSSY
    public static final RegistryObject<Block> PILAR_STONE_COBBLE_MOSSY = register("pilar_stone_cobble_mossy", () -> new BlockPilar(Blocks.STONE), CreativeModeTab.TAB_DECORATIONS);
    //                                        BLOCK_STONE_BRICKS_BASIC
    //                                        SLABS_STONE_BRICKS_BASIC
    //                                        STAIR_STONE_BRICKS_BASIC
    //                                        WALLS_STONE_BRICKS_BASIC
    public static final RegistryObject<Block> PILAR_STONE_BRICKS_BASIC = register("pilar_stone_bricks_basic", () -> new BlockPilar(Blocks.STONE), CreativeModeTab.TAB_DECORATIONS);
    //                                        BLOCK_STONE_BRICKS_MOSSY
    //                                        SLABS_STONE_BRICKS_MOSSY
    //                                        STAIR_STONE_BRICKS_MOSSY
    //                                        WALLS_STONE_BRICKS_MOSSY
    public static final RegistryObject<Block> PILAR_STONE_BRICKS_MOSSY = register("pilar_stone_bricks_mossy", () -> new BlockPilar(Blocks.STONE), CreativeModeTab.TAB_DECORATIONS);
    //                                        BLOCK_STONE_BRICKS_CRACK
    public static final RegistryObject<Block> SLABS_STONE_BRICKS_CRACK = register("slabs_stone_bricks_crack", () -> new BlockSlabs(Blocks.STONE), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> STAIR_STONE_BRICKS_CRACK = register("stair_stone_bricks_crack", () -> new BlockStair(Blocks.STONE), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> WALLS_STONE_BRICKS_CRACK = register("walls_stone_bricks_crack", () -> new BlockWalls(Blocks.STONE), CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Block> PILAR_STONE_BRICKS_CRACK = register("pilar_stone_bricks_crack", () -> new BlockPilar(Blocks.STONE), CreativeModeTab.TAB_DECORATIONS);
    //                                        BLOCK_STONE_CARVED

    // Granite
    //                                        BLOCK_GRANITE_STONES
    //                                        SLABS_GRANITE_STONES
    //                                        STAIR_GRANITE_STONES
    //                                        WALLS_GRANITE_STONES
    public static final RegistryObject<Block> PILAR_GRANITE_STONES       =  register("pilar_granite_stones",      () -> new BlockPilar(Blocks.GRANITE), CreativeModeTab.TAB_DECORATIONS);
    //                                        BLOCK_GRANITE_SMOOTH
    //                                        SLABS_GRANITE_SMOOTH
    //                                        STAIR_GRANITE_SMOOTH
    public static final RegistryObject<Block> WALLS_GRANITE_SMOOTH       = register("walls_granite_smooth",       () -> new BlockWalls(Blocks.GRANITE), CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Block> PILAR_GRANITE_SMOOTH       = register("pilar_granite_smooth",       () -> new BlockPilar(Blocks.GRANITE), CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Block> BLOCK_GRANITE_COBBLE_BASIC = register("block_granite_cobble_basic", () -> new BlockBlock(Blocks.GRANITE), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> SLABS_GRANITE_COBBLE_BASIC = register("slabs_granite_cobble_basic", () -> new BlockSlabs(Blocks.GRANITE), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> STAIR_GRANITE_COBBLE_BASIC = register("stair_granite_cobble_basic", () -> new BlockStair(Blocks.GRANITE), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> WALLS_GRANITE_COBBLE_BASIC = register("walls_granite_cobble_basic", () -> new BlockWalls(Blocks.GRANITE), CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Block> PILAR_GRANITE_COBBLE_BASIC = register("pilar_granite_cobble_basic", () -> new BlockPilar(Blocks.GRANITE), CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Block> BLOCK_GRANITE_COBBLE_MOSSY = register("block_granite_cobble_mossy", () -> new BlockBlock(Blocks.GRANITE), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> SLABS_GRANITE_COBBLE_MOSSY = register("slabs_granite_cobble_mossy", () -> new BlockSlabs(Blocks.GRANITE), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> STAIR_GRANITE_COBBLE_MOSSY = register("stair_granite_cobble_mossy", () -> new BlockStair(Blocks.GRANITE), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> WALLS_GRANITE_COBBLE_MOSSY = register("walls_granite_cobble_mossy", () -> new BlockWalls(Blocks.GRANITE), CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Block> PILAR_GRANITE_COBBLE_MOSSY = register("pilar_granite_cobble_mossy", () -> new BlockPilar(Blocks.GRANITE), CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Block> BLOCK_GRANITE_BRICKS_BASIC = register("block_granite_bricks_basic", () -> new BlockBlock(Blocks.GRANITE), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> SLABS_GRANITE_BRICKS_BASIC = register("slabs_granite_bricks_basic", () -> new BlockSlabs(Blocks.GRANITE), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> STAIR_GRANITE_BRICKS_BASIC = register("stair_granite_bricks_basic", () -> new BlockStair(Blocks.GRANITE), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> WALLS_GRANITE_BRICKS_BASIC = register("walls_granite_bricks_basic", () -> new BlockWalls(Blocks.GRANITE), CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Block> PILAR_GRANITE_BRICKS_BASIC = register("pilar_granite_bricks_basic", () -> new BlockPilar(Blocks.GRANITE), CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Block> BLOCK_GRANITE_BRICKS_MOSSY = register("block_granite_bricks_mossy", () -> new BlockBlock(Blocks.GRANITE), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> SLABS_GRANITE_BRICKS_MOSSY = register("slabs_granite_bricks_mossy", () -> new BlockSlabs(Blocks.GRANITE), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> STAIR_GRANITE_BRICKS_MOSSY = register("stair_granite_bricks_mossy", () -> new BlockStair(Blocks.GRANITE), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> WALLS_GRANITE_BRICKS_MOSSY = register("walls_granite_bricks_mossy", () -> new BlockWalls(Blocks.GRANITE), CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Block> PILAR_GRANITE_BRICKS_MOSSY = register("pilar_granite_bricks_mossy", () -> new BlockPilar(Blocks.GRANITE), CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Block> BLOCK_GRANITE_BRICKS_CRACK = register("block_granite_bricks_crack", () -> new BlockBlock(Blocks.GRANITE), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> SLABS_GRANITE_BRICKS_CRACK = register("slabs_granite_bricks_crack", () -> new BlockSlabs(Blocks.GRANITE), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> STAIR_GRANITE_BRICKS_CRACK = register("stair_granite_bricks_crack", () -> new BlockStair(Blocks.GRANITE), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> WALLS_GRANITE_BRICKS_CRACK = register("walls_granite_bricks_crack", () -> new BlockWalls(Blocks.GRANITE), CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Block> PILAR_GRANITE_BRICKS_CRACK = register("pilar_granite_bricks_crack", () -> new BlockPilar(Blocks.GRANITE), CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Block> BLOCK_GRANITE_CARVED       = register("block_granite_carved",       () -> new BlockBlock(Blocks.GRANITE), CreativeModeTab.TAB_BUILDING_BLOCKS);

    // Diorite
    //                                        BLOCK_DIORITE_STONES
    //                                        SLABS_DIORITE_STONES
    //                                        STAIR_DIORITE_STONES
    //                                        WALLS_DIORITE_STONES
    public static final RegistryObject<Block> PILAR_DIORITE_STONES       = register("pilar_diorite_stones",       () -> new BlockPilar(Blocks.DIORITE), CreativeModeTab.TAB_DECORATIONS);
    //                                        BLOCK_DIORITE_SMOOTH
    //                                        SLABS_DIORITE_SMOOTH
    //                                        STAIR_DIORITE_SMOOTH
    public static final RegistryObject<Block> WALLS_DIORITE_SMOOTH       = register("walls_diorite_smooth",       () -> new BlockWalls(Blocks.DIORITE), CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Block> PILAR_DIORITE_SMOOTH       = register("pilar_diorite_smooth",       () -> new BlockPilar(Blocks.DIORITE), CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Block> BLOCK_DIORITE_COBBLE_BASIC = register("block_diorite_cobble_basic", () -> new BlockBlock(Blocks.DIORITE), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> SLABS_DIORITE_COBBLE_BASIC = register("slabs_diorite_cobble_basic", () -> new BlockSlabs(Blocks.DIORITE), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> STAIR_DIORITE_COBBLE_BASIC = register("stair_diorite_cobble_basic", () -> new BlockStair(Blocks.DIORITE), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> WALLS_DIORITE_COBBLE_BASIC = register("walls_diorite_cobble_basic", () -> new BlockWalls(Blocks.DIORITE), CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Block> PILAR_DIORITE_COBBLE_BASIC = register("pilar_diorite_cobble_basic", () -> new BlockPilar(Blocks.DIORITE), CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Block> BLOCK_DIORITE_COBBLE_MOSSY = register("block_diorite_cobble_mossy", () -> new BlockBlock(Blocks.DIORITE), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> SLABS_DIORITE_COBBLE_MOSSY = register("slabs_diorite_cobble_mossy", () -> new BlockSlabs(Blocks.DIORITE), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> STAIR_DIORITE_COBBLE_MOSSY = register("stair_diorite_cobble_mossy", () -> new BlockStair(Blocks.DIORITE), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> WALLS_DIORITE_COBBLE_MOSSY = register("walls_diorite_cobble_mossy", () -> new BlockWalls(Blocks.DIORITE), CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Block> PILAR_DIORITE_COBBLE_MOSSY = register("pilar_diorite_cobble_mossy", () -> new BlockPilar(Blocks.DIORITE), CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Block> BLOCK_DIORITE_BRICKS_BASIC = register("block_diorite_bricks_basic", () -> new BlockBlock(Blocks.DIORITE), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> SLABS_DIORITE_BRICKS_BASIC = register("slabs_diorite_bricks_basic", () -> new BlockSlabs(Blocks.DIORITE), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> STAIR_DIORITE_BRICKS_BASIC = register("stair_diorite_bricks_basic", () -> new BlockStair(Blocks.DIORITE), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> WALLS_DIORITE_BRICKS_BASIC = register("walls_diorite_bricks_basic", () -> new BlockWalls(Blocks.DIORITE), CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Block> PILAR_DIORITE_BRICKS_BASIC = register("pilar_diorite_bricks_basic", () -> new BlockPilar(Blocks.DIORITE), CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Block> BLOCK_DIORITE_BRICKS_MOSSY = register("block_diorite_bricks_mossy", () -> new BlockBlock(Blocks.DIORITE), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> SLABS_DIORITE_BRICKS_MOSSY = register("slabs_diorite_bricks_mossy", () -> new BlockSlabs(Blocks.DIORITE), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> STAIR_DIORITE_BRICKS_MOSSY = register("stair_diorite_bricks_mossy", () -> new BlockStair(Blocks.DIORITE), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> WALLS_DIORITE_BRICKS_MOSSY = register("walls_diorite_bricks_mossy", () -> new BlockWalls(Blocks.DIORITE), CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Block> PILAR_DIORITE_BRICKS_MOSSY = register("pilar_diorite_bricks_mossy", () -> new BlockPilar(Blocks.DIORITE), CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Block> BLOCK_DIORITE_BRICKS_CRACK = register("block_diorite_bricks_crack", () -> new BlockBlock(Blocks.DIORITE), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> SLABS_DIORITE_BRICKS_CRACK = register("slabs_diorite_bricks_crack", () -> new BlockSlabs(Blocks.DIORITE), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> STAIR_DIORITE_BRICKS_CRACK = register("stair_diorite_bricks_crack", () -> new BlockStair(Blocks.DIORITE), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> WALLS_DIORITE_BRICKS_CRACK = register("walls_diorite_bricks_crack", () -> new BlockWalls(Blocks.DIORITE), CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Block> PILAR_DIORITE_BRICKS_CRACK = register("pilar_diorite_bricks_crack", () -> new BlockPilar(Blocks.DIORITE), CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Block> BLOCK_DIORITE_CARVED       = register("block_diorite_carved",       () -> new BlockBlock(Blocks.DIORITE), CreativeModeTab.TAB_BUILDING_BLOCKS);

    // Andesite
    //                                        BLOCK_ANDESITE_STONES
    //                                        SLABS_ANDESITE_STONES
    //                                        STAIR_ANDESITE_STONES
    //                                        WALLS_ANDESITE_STONES
    public static final RegistryObject<Block> PILAR_ANDESITE_STONES       = register("pilar_andesite_stones",       () -> new BlockPilar(Blocks.ANDESITE), CreativeModeTab.TAB_DECORATIONS);
    //                                        BLOCK_ANDESITE_SMOOTH
    //                                        SLABS_ANDESITE_SMOOTH
    //                                        STAIR_ANDESITE_SMOOTH
    public static final RegistryObject<Block> WALLS_ANDESITE_SMOOTH       = register("walls_andesite_smooth",       () -> new BlockWalls(Blocks.ANDESITE), CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Block> PILAR_ANDESITE_SMOOTH       = register("pilar_andesite_smooth",       () -> new BlockPilar(Blocks.ANDESITE), CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Block> BLOCK_ANDESITE_COBBLE_BASIC = register("block_andesite_cobble_basic", () -> new BlockBlock(Blocks.ANDESITE), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> SLABS_ANDESITE_COBBLE_BASIC = register("slabs_andesite_cobble_basic", () -> new BlockSlabs(Blocks.ANDESITE), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> STAIR_ANDESITE_COBBLE_BASIC = register("stair_andesite_cobble_basic", () -> new BlockStair(Blocks.ANDESITE), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> WALLS_ANDESITE_COBBLE_BASIC = register("walls_andesite_cobble_basic", () -> new BlockWalls(Blocks.ANDESITE), CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Block> PILAR_ANDESITE_COBBLE_BASIC = register("pilar_andesite_cobble_basic", () -> new BlockPilar(Blocks.ANDESITE), CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Block> BLOCK_ANDESITE_COBBLE_MOSSY = register("block_andesite_cobble_mossy", () -> new BlockBlock(Blocks.ANDESITE), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> SLABS_ANDESITE_COBBLE_MOSSY = register("slabs_andesite_cobble_mossy", () -> new BlockSlabs(Blocks.ANDESITE), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> STAIR_ANDESITE_COBBLE_MOSSY = register("stair_andesite_cobble_mossy", () -> new BlockStair(Blocks.ANDESITE), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> WALLS_ANDESITE_COBBLE_MOSSY = register("walls_andesite_cobble_mossy", () -> new BlockWalls(Blocks.ANDESITE), CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Block> PILAR_ANDESITE_COBBLE_MOSSY = register("pilar_andesite_cobble_mossy", () -> new BlockPilar(Blocks.ANDESITE), CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Block> BLOCK_ANDESITE_BRICKS_BASIC = register("block_andesite_bricks_basic", () -> new BlockBlock(Blocks.ANDESITE), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> SLABS_ANDESITE_BRICKS_BASIC = register("slabs_andesite_bricks_basic", () -> new BlockSlabs(Blocks.ANDESITE), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> STAIR_ANDESITE_BRICKS_BASIC = register("stair_andesite_bricks_basic", () -> new BlockStair(Blocks.ANDESITE), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> WALLS_ANDESITE_BRICKS_BASIC = register("walls_andesite_bricks_basic", () -> new BlockWalls(Blocks.ANDESITE), CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Block> PILAR_ANDESITE_BRICKS_BASIC = register("pilar_andesite_bricks_basic", () -> new BlockPilar(Blocks.ANDESITE), CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Block> BLOCK_ANDESITE_BRICKS_MOSSY = register("block_andesite_bricks_mossy", () -> new BlockBlock(Blocks.ANDESITE), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> SLABS_ANDESITE_BRICKS_MOSSY = register("slabs_andesite_bricks_mossy", () -> new BlockSlabs(Blocks.ANDESITE), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> STAIR_ANDESITE_BRICKS_MOSSY = register("stair_andesite_bricks_mossy", () -> new BlockStair(Blocks.ANDESITE), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> WALLS_ANDESITE_BRICKS_MOSSY = register("walls_andesite_bricks_mossy", () -> new BlockWalls(Blocks.ANDESITE), CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Block> PILAR_ANDESITE_BRICKS_MOSSY = register("pilar_andesite_bricks_mossy", () -> new BlockPilar(Blocks.ANDESITE), CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Block> BLOCK_ANDESITE_BRICKS_CRACK = register("block_andesite_bricks_crack", () -> new BlockBlock(Blocks.ANDESITE), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> SLABS_ANDESITE_BRICKS_CRACK = register("slabs_andesite_bricks_crack", () -> new BlockSlabs(Blocks.ANDESITE), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> STAIR_ANDESITE_BRICKS_CRACK = register("stair_andesite_bricks_crack", () -> new BlockStair(Blocks.ANDESITE), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> WALLS_ANDESITE_BRICKS_CRACK = register("walls_andesite_bricks_crack", () -> new BlockWalls(Blocks.ANDESITE), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> PILAR_ANDESITE_BRICKS_CRACK = register("pilar_andesite_bricks_crack", () -> new BlockPilar(Blocks.ANDESITE), CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Block> BLOCK_ANDESITE_CARVED       = register("block_andesite_carved",       () -> new BlockBlock(Blocks.ANDESITE), CreativeModeTab.TAB_DECORATIONS);

    // Prismarine
    //                                        SLABS_PRISMARINE_STONE
    //                                        STAIR_PRISMARINE_STONE
    //                                        WALLS_PRISMARINE_STONE
    public static final RegistryObject<Block> PILAR_PRISMARINE_STONE = register("pilar_prismarine_stone", () -> new BlockPilar(Blocks.PRISMARINE), CreativeModeTab.TAB_DECORATIONS);
    //                                        SLABS_PRISMARINE_BRICK
    //                                        STAIR_PRISMARINE_BRICK
    public static final RegistryObject<Block> WALLS_PRISMARINE_BRICK = register("walls_prismarine_brick", () -> new BlockWalls(Blocks.PRISMARINE), CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Block> PILAR_PRISMARINE_BRICK = register("pilar_prismarine_brick", () -> new BlockPilar(Blocks.PRISMARINE), CreativeModeTab.TAB_DECORATIONS);
    //                                        SLABS_PRISMARINE_DARK
    //                                        STAIR_PRISMARINE_DARK
    public static final RegistryObject<Block> WALLS_PRISMARINE_DARK  = register("walls_prismarine_dark",  () -> new BlockWalls(Blocks.PRISMARINE), CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Block> PILAR_PRISMARINE_DARK  = register("pilar_prismarine_dark",  () -> new BlockPilar(Blocks.PRISMARINE), CreativeModeTab.TAB_DECORATIONS);

    // End Stone
    //                                        BLOCK_ENDSTONE_STONES
    public static final RegistryObject<Block> SLABS_ENDSTONE_STONES       = register("slabs_endstone_stones",       () -> new BlockSlabs(Blocks.END_STONE), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> STAIR_ENDSTONE_STONES       = register("stair_endstone_stones",       () -> new BlockStair(Blocks.END_STONE), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> WALLS_ENDSTONE_STONES       = register("walls_endstone_stones",       () -> new BlockWalls(Blocks.END_STONE), CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Block> PILAR_ENDSTONE_STONES       = register("pilar_endstone_stones",       () -> new BlockPilar(Blocks.END_STONE), CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Block> BLOCK_ENDSTONE_SMOOTH       = register("block_endstone_smooth",       () -> new BlockBlock(Blocks.END_STONE), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> SLABS_ENDSTONE_SMOOTH       = register("slabs_endstone_smooth",       () -> new BlockSlabs(Blocks.END_STONE), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> STAIR_ENDSTONE_SMOOTH       = register("stair_endstone_smooth",       () -> new BlockStair(Blocks.END_STONE), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> WALLS_ENDSTONE_SMOOTH       = register("walls_endstone_smooth",       () -> new BlockWalls(Blocks.END_STONE), CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Block> PILAR_ENDSTONE_SMOOTH       = register("pilar_endstone_smooth",       () -> new BlockPilar(Blocks.END_STONE), CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Block> BLOCK_ENDSTONE_COBBLE_BASIC = register("block_endstone_cobble_basic", () -> new BlockBlock(Blocks.END_STONE), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> SLABS_ENDSTONE_COBBLE_BASIC = register("slabs_endstone_cobble_basic", () -> new BlockSlabs(Blocks.END_STONE), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> STAIR_ENDSTONE_COBBLE_BASIC = register("stair_endstone_cobble_basic", () -> new BlockStair(Blocks.END_STONE), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> WALLS_ENDSTONE_COBBLE_BASIC = register("walls_endstone_cobble_basic", () -> new BlockWalls(Blocks.END_STONE), CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Block> PILAR_ENDSTONE_COBBLE_BASIC = register("pilar_endstone_cobble_basic", () -> new BlockPilar(Blocks.END_STONE), CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Block> BLOCK_ENDSTONE_COBBLE_MOSSY = register("block_endstone_cobble_mossy", () -> new BlockBlock(Blocks.END_STONE), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> SLABS_ENDSTONE_COBBLE_MOSSY = register("slabs_endstone_cobble_mossy", () -> new BlockSlabs(Blocks.END_STONE), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> STAIR_ENDSTONE_COBBLE_MOSSY = register("stair_endstone_cobble_mossy", () -> new BlockStair(Blocks.END_STONE), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> WALLS_ENDSTONE_COBBLE_MOSSY = register("walls_endstone_cobble_mossy", () -> new BlockWalls(Blocks.END_STONE), CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Block> PILAR_ENDSTONE_COBBLE_MOSSY = register("pilar_endstone_cobble_mossy", () -> new BlockPilar(Blocks.END_STONE), CreativeModeTab.TAB_DECORATIONS);
    //                                        BLOCK_ENDSTONE_BRICKS_BASIC
    //                                        SLABS_ENDSTONE_BRICKS_BASIC
    //                                        STAIR_ENDSTONE_BRICKS_BASIC
    //                                        WALLS_ENDSTONE_BRICKS_BASIC
    public static final RegistryObject<Block> PILAR_ENDSTONE_BRICKS_BASIC = register("pilar_endstone_bricks_basic", () -> new BlockPilar(Blocks.END_STONE), CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Block> BLOCK_ENDSTONE_BRICKS_MOSSY = register("block_endstone_bricks_mossy", () -> new BlockBlock(Blocks.END_STONE), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> SLABS_ENDSTONE_BRICKS_MOSSY = register("slabs_endstone_bricks_mossy", () -> new BlockSlabs(Blocks.END_STONE), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> STAIR_ENDSTONE_BRICKS_MOSSY = register("stair_endstone_bricks_mossy", () -> new BlockStair(Blocks.END_STONE), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> WALLS_ENDSTONE_BRICKS_MOSSY = register("walls_endstone_bricks_mossy", () -> new BlockWalls(Blocks.END_STONE), CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Block> PILAR_ENDSTONE_BRICKS_MOSSY = register("pilar_endstone_bricks_mossy", () -> new BlockPilar(Blocks.END_STONE), CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Block> BLOCK_ENDSTONE_BRICKS_CRACK = register("block_endstone_bricks_crack", () -> new BlockBlock(Blocks.END_STONE), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> SLABS_ENDSTONE_BRICKS_CRACK = register("slabs_endstone_bricks_crack", () -> new BlockSlabs(Blocks.END_STONE), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> STAIR_ENDSTONE_BRICKS_CRACK = register("stair_endstone_bricks_crack", () -> new BlockStair(Blocks.END_STONE), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> WALLS_ENDSTONE_BRICKS_CRACK = register("walls_endstone_bricks_crack", () -> new BlockWalls(Blocks.END_STONE), CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Block> PILAR_ENDSTONE_BRICKS_CRACK = register("pilar_endstone_bricks_crack", () -> new BlockPilar(Blocks.END_STONE), CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Block> BLOCK_ENDSTONE_CARVED       = register("block_endstone_carved",       () -> new BlockBlock(Blocks.END_STONE), CreativeModeTab.TAB_BUILDING_BLOCKS);

    // Blackstone
    //                                        BLOCK_BLACKSTONE_SMOOTH
    //                                        SLABS_BLACKSTONE_SMOOTH
    //                                        STAIR_BLACKSTONE_SMOOTH
    //                                        WALLS_BLACKSTONE_SMOOTH
    public static final RegistryObject<Block> PILAR_BLACKSTONE_SMOOTH       = register("pilar_blackstone_smooth",       () -> new BlockPilar(Blocks.BLACKSTONE), CreativeModeTab.TAB_DECORATIONS);
    //                                        BLOCK_BLACKSTONE_COBBLE_BASIC
    //                                        SLABS_BLACKSTONE_COBBLE_BASIC
    //                                        STAIR_BLACKSTONE_COBBLE_BASIC
    //                                        WALLS_BLACKSTONE_COBBLE_BASIC
    public static final RegistryObject<Block> PILAR_BLACKSTONE_COBBLE_BASIC = register("pilar_blackstone_cobble_basic", () -> new BlockPilar(Blocks.BLACKSTONE), CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Block> BLOCK_BLACKSTONE_COBBLE_MOSSY = register("block_blackstone_cobble_mossy", () -> new BlockBlock(Blocks.BLACKSTONE), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> SLABS_BLACKSTONE_COBBLE_MOSSY = register("slabs_blackstone_cobble_mossy", () -> new BlockSlabs(Blocks.BLACKSTONE), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> STAIR_BLACKSTONE_COBBLE_MOSSY = register("stair_blackstone_cobble_mossy", () -> new BlockStair(Blocks.BLACKSTONE), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> WALLS_BLACKSTONE_COBBLE_MOSSY = register("walls_blackstone_cobble_mossy", () -> new BlockWalls(Blocks.BLACKSTONE), CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Block> PILAR_BLACKSTONE_COBBLE_MOSSY = register("pilar_blackstone_cobble_mossy", () -> new BlockPilar(Blocks.BLACKSTONE), CreativeModeTab.TAB_DECORATIONS);
    //                                        BLOCK_BLACKSTONE_BRICKS_BASIC
    //                                        SLABS_BLACKSTONE_BRICKS_BASIC
    //                                        STAIR_BLACKSTONE_BRICKS_BASIC
    //                                        WALLS_BLACKSTONE_BRICKS_BASIC
    public static final RegistryObject<Block> PILAR_BLACKSTONE_BRICKS_BASIC = register("pilar_blackstone_bricks_basic", () -> new BlockPilar(Blocks.BLACKSTONE), CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Block> BLOCK_BLACKSTONE_BRICKS_MOSSY = register("block_blackstone_bricks_mossy", () -> new BlockBlock(Blocks.BLACKSTONE), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> SLABS_BLACKSTONE_BRICKS_MOSSY = register("slabs_blackstone_bricks_mossy", () -> new BlockSlabs(Blocks.BLACKSTONE), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> STAIR_BLACKSTONE_BRICKS_MOSSY = register("stair_blackstone_bricks_mossy", () -> new BlockStair(Blocks.BLACKSTONE), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> WALLS_BLACKSTONE_BRICKS_MOSSY = register("walls_blackstone_bricks_mossy", () -> new BlockWalls(Blocks.BLACKSTONE), CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Block> PILAR_BLACKSTONE_BRICKS_MOSSY = register("pilar_blackstone_bricks_mossy", () -> new BlockPilar(Blocks.BLACKSTONE), CreativeModeTab.TAB_DECORATIONS);
    //                                        BLOCK_BLACKSTONE_BRICKS_CRACK
    public static final RegistryObject<Block> SLABS_BLACKSTONE_BRICKS_CRACK = register("slabs_blackstone_bricks_crack", () -> new BlockSlabs(Blocks.BLACKSTONE), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> STAIR_BLACKSTONE_BRICKS_CRACK = register("stair_blackstone_bricks_crack", () -> new BlockStair(Blocks.BLACKSTONE), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> WALLS_BLACKSTONE_BRICKS_CRACK = register("walls_blackstone_bricks_crack", () -> new BlockWalls(Blocks.BLACKSTONE), CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Block> PILAR_BLACKSTONE_BRICKS_CRACK = register("pilar_blackstone_bricks_crack", () -> new BlockPilar(Blocks.BLACKSTONE), CreativeModeTab.TAB_DECORATIONS);
    //                                        BLOCK_BLACKSTONE_CARVED

    // Deepslate
    //                                        BLOCK_DEEPSLATE_STONES
    public static final RegistryObject<Block> SLABS_DEEPSLATE_STONES       = register("slabs_deepslate_stones",       () -> new BlockSlabs(Blocks.DEEPSLATE), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> STAIR_DEEPSLATE_STONES       = register("stair_deepslate_stones",       () -> new BlockStair(Blocks.DEEPSLATE), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> WALLS_DEEPSLATE_STONES       = register("walls_deepslate_stones",       () -> new BlockWalls(Blocks.DEEPSLATE), CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Block> PILAR_DEEPSLATE_STONES       = register("pilar_deepslate_stones",       () -> new BlockPilar(Blocks.DEEPSLATE), CreativeModeTab.TAB_DECORATIONS);
    //                                        BLOCK_DEEPSLATE_COBBLE_BASIC
    //                                        SLABS_DEEPSLATE_COBBLE_BASIC
    //                                        STAIR_DEEPSLATE_COBBLE_BASIC
    //                                        WALLS_DEEPSLATE_COBBLE_BASIC
    public static final RegistryObject<Block> PILAR_DEEPSLATE_COBBLE_BASIC = register("pilar_deepslate_cobble_basic", () -> new BlockPilar(Blocks.DEEPSLATE), CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Block> BLOCK_DEEPSLATE_COBBLE_MOSS  = register("block_deepslate_cobble_mossy", () -> new BlockBlock(Blocks.DEEPSLATE), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> SLABS_DEEPSLATE_COBBLE_MOSS  = register("slabs_deepslate_cobble_mossy", () -> new BlockSlabs(Blocks.DEEPSLATE), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> STAIR_DEEPSLATE_COBBLE_MOSS  = register("stair_deepslate_cobble_mossy", () -> new BlockStair(Blocks.DEEPSLATE), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> WALLS_DEEPSLATE_COBBLE_MOSS  = register("walls_deepslate_cobble_mossy", () -> new BlockWalls(Blocks.DEEPSLATE), CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Block> PILAR_DEEPSLATE_COBBLE_MOSS  = register("pilar_deepslate_cobble_mossy", () -> new BlockPilar(Blocks.DEEPSLATE), CreativeModeTab.TAB_DECORATIONS);
    //                                        BLOCK_DEEPSLATE_SMOOTH
    //                                        SLABS_DEEPSLATE_SMOOTH
    //                                        STAIR_DEEPSLATE_SMOOTH
    //                                        WALLS_DEEPSLATE_SMOOTH
    public static final RegistryObject<Block> PILAR_DEEPSLATE_SMOOTH       = register("pilar_deepslate_smooth",       () -> new BlockPilar(Blocks.DEEPSLATE), CreativeModeTab.TAB_DECORATIONS);
    //                                        BLOCK_DEEPSLATE_BRICKS_BASIC
    //                                        SLABS_DEEPSLATE_BRICKS_BASIC
    //                                        STAIR_DEEPSLATE_BRICKS_BASIC
    //                                        WALLS_DEEPSLATE_BRICKS_BASIC
    public static final RegistryObject<Block> PILAR_DEEPSLATE_BRICKS_BASIC = register("pilar_deepslate_bricks_basic", () -> new BlockPilar(Blocks.DEEPSLATE), CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Block> BLOCK_DEEPSLATE_BRICKS_MOSSY = register("block_deepslate_bricks_mossy", () -> new BlockBlock(Blocks.DEEPSLATE), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> SLABS_DEEPSLATE_BRICKS_MOSSY = register("slabs_deepslate_bricks_mossy", () -> new BlockSlabs(Blocks.DEEPSLATE), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> STAIR_DEEPSLATE_BRICKS_MOSSY = register("stair_deepslate_bricks_mossy", () -> new BlockStair(Blocks.DEEPSLATE), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> WALLS_DEEPSLATE_BRICKS_MOSSY = register("walls_deepslate_bricks_mossy", () -> new BlockWalls(Blocks.DEEPSLATE), CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Block> PILAR_DEEPSLATE_BRICKS_MOSSY = register("pilar_deepslate_bricks_mossy", () -> new BlockPilar(Blocks.DEEPSLATE), CreativeModeTab.TAB_DECORATIONS);
    //                                        BLOCK_DEEPSLATE_BRICKS_CRACK
    public static final RegistryObject<Block> SLABS_DEEPSLATE_BRICKS_CRACK = register("slabs_deepslate_bricks_crack", () -> new BlockSlabs(Blocks.DEEPSLATE), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> STAIR_DEEPSLATE_BRICKS_CRACK = register("stair_deepslate_bricks_crack", () -> new BlockStair(Blocks.DEEPSLATE), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> WALLS_DEEPSLATE_BRICKS_CRACK = register("walls_deepslate_bricks_crack", () -> new BlockWalls(Blocks.DEEPSLATE), CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Block> PILAR_DEEPSLATE_BRICKS_CRACK = register("pilar_deepslate_bricks_crack", () -> new BlockPilar(Blocks.DEEPSLATE), CreativeModeTab.TAB_DECORATIONS);
    //                                        BLOCK_DEEPSLATE_CARVED

    // Concrete
    public static final RegistryObject<Block> SLABS_CONCRETE_WHITE      = register("slabs_concrete_white",      () -> new BlockSlabs(Blocks.WHITE_CONCRETE),      CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> STAIR_CONCRETE_WHITE      = register("stair_concrete_white",      () -> new BlockStair(Blocks.WHITE_CONCRETE),      CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> WALLS_CONCRETE_WHITE      = register("walls_concrete_white",      () -> new BlockWalls(Blocks.WHITE_CONCRETE),      CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Block> PILAR_CONCRETE_WHITE      = register("pilar_concrete_white",      () -> new BlockPilar(Blocks.WHITE_CONCRETE),      CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Block> SLABS_CONCRETE_ORANGE     = register("slabs_concrete_orange",     () -> new BlockSlabs(Blocks.ORANGE_CONCRETE),     CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> STAIR_CONCRETE_ORANGE     = register("stair_concrete_orange",     () -> new BlockStair(Blocks.ORANGE_CONCRETE),     CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> WALLS_CONCRETE_ORANGE     = register("walls_concrete_orange",     () -> new BlockWalls(Blocks.ORANGE_CONCRETE),     CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Block> PILAR_CONCRETE_ORANGE     = register("pilar_concrete_orange",     () -> new BlockPilar(Blocks.ORANGE_CONCRETE),     CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Block> SLABS_CONCRETE_MAGENTA    = register("slabs_concrete_magenta",    () -> new BlockSlabs(Blocks.MAGENTA_CONCRETE),    CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> STAIR_CONCRETE_MAGENTA    = register("stair_concrete_magenta",    () -> new BlockStair(Blocks.MAGENTA_CONCRETE),    CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> WALLS_CONCRETE_MAGENTA    = register("walls_concrete_magenta",    () -> new BlockWalls(Blocks.MAGENTA_CONCRETE),    CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Block> PILAR_CONCRETE_MAGENTA    = register("pilar_concrete_magenta",    () -> new BlockPilar(Blocks.MAGENTA_CONCRETE),    CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Block> SLABS_CONCRETE_LIGHT_BLUE = register("slabs_concrete_light_blue", () -> new BlockSlabs(Blocks.LIGHT_BLUE_CONCRETE), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> STAIR_CONCRETE_LIGHT_BLUE = register("stair_concrete_light_blue", () -> new BlockStair(Blocks.LIGHT_BLUE_CONCRETE), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> WALLS_CONCRETE_LIGHT_BLUE = register("walls_concrete_light_blue", () -> new BlockWalls(Blocks.LIGHT_BLUE_CONCRETE), CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Block> PILAR_CONCRETE_LIGHT_BLUE = register("pilar_concrete_light_blue", () -> new BlockPilar(Blocks.LIGHT_BLUE_CONCRETE), CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Block> SLABS_CONCRETE_YELLOW     = register("slabs_concrete_yellow",     () -> new BlockSlabs(Blocks.YELLOW_CONCRETE),     CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> STAIR_CONCRETE_YELLOW     = register("stair_concrete_yellow",     () -> new BlockStair(Blocks.YELLOW_CONCRETE),     CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> WALLS_CONCRETE_YELLOW     = register("walls_concrete_yellow",     () -> new BlockWalls(Blocks.YELLOW_CONCRETE),     CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Block> PILAR_CONCRETE_YELLOW     = register("pilar_concrete_yellow",     () -> new BlockPilar(Blocks.YELLOW_CONCRETE),     CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Block> SLABS_CONCRETE_LIME       = register("slabs_concrete_lime",       () -> new BlockSlabs(Blocks.LIME_CONCRETE),       CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> STAIR_CONCRETE_LIME       = register("stair_concrete_lime",       () -> new BlockStair(Blocks.LIME_CONCRETE),       CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> WALLS_CONCRETE_LIME       = register("walls_concrete_lime",       () -> new BlockWalls(Blocks.LIME_CONCRETE),       CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Block> PILAR_CONCRETE_LIME       = register("pilar_concrete_lime",       () -> new BlockPilar(Blocks.LIME_CONCRETE),       CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Block> SLABS_CONCRETE_PINK       = register("slabs_concrete_pink",       () -> new BlockSlabs(Blocks.PINK_CONCRETE),       CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> STAIR_CONCRETE_PINK       = register("stair_concrete_pink",       () -> new BlockStair(Blocks.PINK_CONCRETE),       CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> WALLS_CONCRETE_PINK       = register("walls_concrete_pink",       () -> new BlockWalls(Blocks.PINK_CONCRETE),       CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Block> PILAR_CONCRETE_PINK       = register("pilar_concrete_pink",       () -> new BlockPilar(Blocks.PINK_CONCRETE),       CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Block> SLABS_CONCRETE_GRAY       = register("slabs_concrete_gray",       () -> new BlockSlabs(Blocks.GRAY_CONCRETE),       CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> STAIR_CONCRETE_GRAY       = register("stair_concrete_gray",       () -> new BlockStair(Blocks.GRAY_CONCRETE),       CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> WALLS_CONCRETE_GRAY       = register("walls_concrete_gray",       () -> new BlockWalls(Blocks.GRAY_CONCRETE),       CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Block> PILAR_CONCRETE_GRAY       = register("pilar_concrete_gray",       () -> new BlockPilar(Blocks.GRAY_CONCRETE),       CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Block> SLABS_CONCRETE_LIGHT_GRAY = register("slabs_concrete_light_gray", () -> new BlockSlabs(Blocks.LIGHT_GRAY_CONCRETE), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> STAIR_CONCRETE_LIGHT_GRAY = register("stair_concrete_light_gray", () -> new BlockStair(Blocks.LIGHT_GRAY_CONCRETE), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> WALLS_CONCRETE_LIGHT_GRAY = register("walls_concrete_light_gray", () -> new BlockWalls(Blocks.LIGHT_GRAY_CONCRETE), CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Block> PILAR_CONCRETE_LIGHT_GRAY = register("pilar_concrete_light_gray", () -> new BlockPilar(Blocks.LIGHT_GRAY_CONCRETE), CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Block> SLABS_CONCRETE_CYAN       = register("slabs_concrete_cyan",       () -> new BlockSlabs(Blocks.CYAN_CONCRETE),       CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> STAIR_CONCRETE_CYAN       = register("stair_concrete_cyan",       () -> new BlockStair(Blocks.CYAN_CONCRETE),       CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> WALLS_CONCRETE_CYAN       = register("walls_concrete_cyan",       () -> new BlockWalls(Blocks.CYAN_CONCRETE),       CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Block> PILAR_CONCRETE_CYAN       = register("pilar_concrete_cyan",       () -> new BlockPilar(Blocks.CYAN_CONCRETE),       CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Block> SLABS_CONCRETE_PURPLE     = register("slabs_concrete_purple",     () -> new BlockSlabs(Blocks.PURPLE_CONCRETE),     CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> STAIR_CONCRETE_PURPLE     = register("stair_concrete_purple",     () -> new BlockStair(Blocks.PURPLE_CONCRETE),     CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> WALLS_CONCRETE_PURPLE     = register("walls_concrete_purple",     () -> new BlockWalls(Blocks.PURPLE_CONCRETE),     CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Block> PILAR_CONCRETE_PURPLE     = register("pilar_concrete_purple",     () -> new BlockPilar(Blocks.PURPLE_CONCRETE),     CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Block> SLABS_CONCRETE_BLUE       = register("slabs_concrete_blue",       () -> new BlockSlabs(Blocks.BLUE_CONCRETE),       CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> STAIR_CONCRETE_BLUE       = register("stair_concrete_blue",       () -> new BlockStair(Blocks.BLUE_CONCRETE),       CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> WALLS_CONCRETE_BLUE       = register("walls_concrete_blue",       () -> new BlockWalls(Blocks.BLUE_CONCRETE),       CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Block> PILAR_CONCRETE_BLUE       = register("pilar_concrete_blue",       () -> new BlockPilar(Blocks.BLUE_CONCRETE),       CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Block> SLABS_CONCRETE_BROWN      = register("slabs_concrete_brown",      () -> new BlockSlabs(Blocks.BROWN_CONCRETE),      CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> STAIR_CONCRETE_BROWN      = register("stair_concrete_brown",      () -> new BlockStair(Blocks.BROWN_CONCRETE),      CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> WALLS_CONCRETE_BROWN      = register("walls_concrete_brown",      () -> new BlockWalls(Blocks.BROWN_CONCRETE),      CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Block> PILAR_CONCRETE_BROWN      = register("pilar_concrete_brown",      () -> new BlockPilar(Blocks.BROWN_CONCRETE),      CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Block> SLABS_CONCRETE_GREEN      = register("slabs_concrete_green",      () -> new BlockSlabs(Blocks.GREEN_CONCRETE),      CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> STAIR_CONCRETE_GREEN      = register("stair_concrete_green",      () -> new BlockStair(Blocks.GREEN_CONCRETE),      CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> WALLS_CONCRETE_GREEN      = register("walls_concrete_green",      () -> new BlockWalls(Blocks.GREEN_CONCRETE),      CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Block> PILAR_CONCRETE_GREEN      = register("pilar_concrete_green",      () -> new BlockPilar(Blocks.GREEN_CONCRETE),      CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Block> SLABS_CONCRETE_RED        = register("slabs_concrete_red",        () -> new BlockSlabs(Blocks.RED_CONCRETE),        CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> STAIR_CONCRETE_RED        = register("stair_concrete_red",        () -> new BlockStair(Blocks.RED_CONCRETE),        CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> WALLS_CONCRETE_RED        = register("walls_concrete_red",        () -> new BlockWalls(Blocks.RED_CONCRETE),        CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Block> PILAR_CONCRETE_RED        = register("pilar_concrete_red",        () -> new BlockPilar(Blocks.RED_CONCRETE),        CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Block> SLABS_CONCRETE_BLACK      = register("slabs_concrete_black",      () -> new BlockSlabs(Blocks.BLACK_CONCRETE),      CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> STAIR_CONCRETE_BLACK      = register("stair_concrete_black",      () -> new BlockStair(Blocks.BLACK_CONCRETE),      CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> WALLS_CONCRETE_BLACK      = register("walls_concrete_black",      () -> new BlockWalls(Blocks.BLACK_CONCRETE),      CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Block> PILAR_CONCRETE_BLACK      = register("pilar_concrete_black",      () -> new BlockPilar(Blocks.BLACK_CONCRETE),      CreativeModeTab.TAB_DECORATIONS);

    // Timber Frames
    public static final RegistryObject<Block> TIMBER_BASIC_WHITE           = register("timber_basic_white",           () -> new BlockBlock(Blocks.WHITE_TERRACOTTA),      CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> TIMBER_BASIC_ORANGE          = register("timber_basic_orange",          () -> new BlockBlock(Blocks.ORANGE_TERRACOTTA),     CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> TIMBER_BASIC_MAGENTA         = register("timber_basic_magenta",         () -> new BlockBlock(Blocks.MAGENTA_TERRACOTTA),    CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> TIMBER_BASIC_LIGHT_BLUE      = register("timber_basic_light_blue",      () -> new BlockBlock(Blocks.LIGHT_BLUE_TERRACOTTA), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> TIMBER_BASIC_YELLOW          = register("timber_basic_yellow",          () -> new BlockBlock(Blocks.YELLOW_TERRACOTTA),     CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> TIMBER_BASIC_LIME            = register("timber_basic_lime",            () -> new BlockBlock(Blocks.LIME_TERRACOTTA),       CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> TIMBER_BASIC_PINK            = register("timber_basic_pink",            () -> new BlockBlock(Blocks.PINK_TERRACOTTA),       CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> TIMBER_BASIC_GRAY            = register("timber_basic_gray",            () -> new BlockBlock(Blocks.GRAY_TERRACOTTA),       CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> TIMBER_BASIC_LIGHT_GRAY      = register("timber_basic_light_gray",      () -> new BlockBlock(Blocks.LIGHT_GRAY_TERRACOTTA), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> TIMBER_BASIC_CYAN            = register("timber_basic_cyan",            () -> new BlockBlock(Blocks.CYAN_TERRACOTTA),       CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> TIMBER_BASIC_PURPLE          = register("timber_basic_purple",          () -> new BlockBlock(Blocks.PURPLE_TERRACOTTA),     CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> TIMBER_BASIC_BLUE            = register("timber_basic_blue",            () -> new BlockBlock(Blocks.BLUE_TERRACOTTA),       CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> TIMBER_BASIC_BROWN           = register("timber_basic_brown",           () -> new BlockBlock(Blocks.BROWN_TERRACOTTA),      CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> TIMBER_BASIC_GREEN           = register("timber_basic_green",           () -> new BlockBlock(Blocks.GREEN_TERRACOTTA),      CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> TIMBER_BASIC_RED             = register("timber_basic_red",             () -> new BlockBlock(Blocks.RED_TERRACOTTA),        CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> TIMBER_BASIC_BLACK           = register("timber_basic_black",           () -> new BlockBlock(Blocks.BLACK_TERRACOTTA),      CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> TIMBER_HORIZONTAL_WHITE      = register("timber_horizontal_white",      () -> new BlockBlock(Blocks.WHITE_TERRACOTTA),      CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> TIMBER_HORIZONTAL_ORANGE     = register("timber_horizontal_orange",     () -> new BlockBlock(Blocks.ORANGE_TERRACOTTA),     CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> TIMBER_HORIZONTAL_MAGENTA    = register("timber_horizontal_magenta",    () -> new BlockBlock(Blocks.MAGENTA_TERRACOTTA),    CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> TIMBER_HORIZONTAL_LIGHT_BLUE = register("timber_horizontal_light_blue", () -> new BlockBlock(Blocks.LIGHT_BLUE_TERRACOTTA), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> TIMBER_HORIZONTAL_YELLOW     = register("timber_horizontal_yellow",     () -> new BlockBlock(Blocks.YELLOW_TERRACOTTA),     CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> TIMBER_HORIZONTAL_LIME       = register("timber_horizontal_lime",       () -> new BlockBlock(Blocks.LIME_TERRACOTTA),       CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> TIMBER_HORIZONTAL_PINK       = register("timber_horizontal_pink",       () -> new BlockBlock(Blocks.PINK_TERRACOTTA),       CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> TIMBER_HORIZONTAL_GRAY       = register("timber_horizontal_gray",       () -> new BlockBlock(Blocks.GRAY_TERRACOTTA),       CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> TIMBER_HORIZONTAL_LIGHT_GRAY = register("timber_horizontal_light_gray", () -> new BlockBlock(Blocks.LIGHT_GRAY_TERRACOTTA), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> TIMBER_HORIZONTAL_CYAN       = register("timber_horizontal_cyan",       () -> new BlockBlock(Blocks.CYAN_TERRACOTTA),       CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> TIMBER_HORIZONTAL_PURPLE     = register("timber_horizontal_purple",     () -> new BlockBlock(Blocks.PURPLE_TERRACOTTA),     CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> TIMBER_HORIZONTAL_BLUE       = register("timber_horizontal_blue",       () -> new BlockBlock(Blocks.BLUE_TERRACOTTA),       CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> TIMBER_HORIZONTAL_BROWN      = register("timber_horizontal_brown",      () -> new BlockBlock(Blocks.BROWN_TERRACOTTA),      CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> TIMBER_HORIZONTAL_GREEN      = register("timber_horizontal_green",      () -> new BlockBlock(Blocks.GREEN_TERRACOTTA),      CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> TIMBER_HORIZONTAL_RED        = register("timber_horizontal_red",        () -> new BlockBlock(Blocks.RED_TERRACOTTA),        CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> TIMBER_HORIZONTAL_BLACK      = register("timber_horizontal_black",      () -> new BlockBlock(Blocks.BLACK_TERRACOTTA),      CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> TIMBER_VERTICAL_WHITE        = register("timber_vertical_white",        () -> new BlockBlock(Blocks.WHITE_TERRACOTTA),      CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> TIMBER_VERTICAL_ORANGE       = register("timber_vertical_orange",       () -> new BlockBlock(Blocks.ORANGE_TERRACOTTA),     CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> TIMBER_VERTICAL_MAGENTA      = register("timber_vertical_magenta",      () -> new BlockBlock(Blocks.MAGENTA_TERRACOTTA),    CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> TIMBER_VERTICAL_LIGHT_BLUE   = register("timber_vertical_light_blue",   () -> new BlockBlock(Blocks.LIGHT_BLUE_TERRACOTTA), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> TIMBER_VERTICAL_YELLOW       = register("timber_vertical_yellow",       () -> new BlockBlock(Blocks.YELLOW_TERRACOTTA),     CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> TIMBER_VERTICAL_LIME         = register("timber_vertical_lime",         () -> new BlockBlock(Blocks.LIME_TERRACOTTA),       CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> TIMBER_VERTICAL_PINK         = register("timber_vertical_pink",         () -> new BlockBlock(Blocks.PINK_TERRACOTTA),       CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> TIMBER_VERTICAL_GRAY         = register("timber_vertical_gray",         () -> new BlockBlock(Blocks.GRAY_TERRACOTTA),       CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> TIMBER_VERTICAL_LIGHT_GRAY   = register("timber_vertical_light_gray",   () -> new BlockBlock(Blocks.LIGHT_GRAY_TERRACOTTA), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> TIMBER_VERTICAL_CYAN         = register("timber_vertical_cyan",         () -> new BlockBlock(Blocks.CYAN_TERRACOTTA),       CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> TIMBER_VERTICAL_PURPLE       = register("timber_vertical_purple",       () -> new BlockBlock(Blocks.PURPLE_TERRACOTTA),     CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> TIMBER_VERTICAL_BLUE         = register("timber_vertical_blue",         () -> new BlockBlock(Blocks.BLUE_TERRACOTTA),       CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> TIMBER_VERTICAL_BROWN        = register("timber_vertical_brown",        () -> new BlockBlock(Blocks.BROWN_TERRACOTTA),      CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> TIMBER_VERTICAL_GREEN        = register("timber_vertical_green",        () -> new BlockBlock(Blocks.GREEN_TERRACOTTA),      CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> TIMBER_VERTICAL_RED          = register("timber_vertical_red",          () -> new BlockBlock(Blocks.RED_TERRACOTTA),        CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> TIMBER_VERTICAL_BLACK        = register("timber_vertical_black",        () -> new BlockBlock(Blocks.BLACK_TERRACOTTA),      CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> TIMBER_PLUS_WHITE            = register("timber_plus_white",            () -> new BlockBlock(Blocks.WHITE_TERRACOTTA),      CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> TIMBER_PLUS_ORANGE           = register("timber_plus_orange",           () -> new BlockBlock(Blocks.ORANGE_TERRACOTTA),     CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> TIMBER_PLUS_MAGENTA          = register("timber_plus_magenta",          () -> new BlockBlock(Blocks.MAGENTA_TERRACOTTA),    CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> TIMBER_PLUS_LIGHT_BLUE       = register("timber_plus_light_blue",       () -> new BlockBlock(Blocks.LIGHT_BLUE_TERRACOTTA), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> TIMBER_PLUS_YELLOW           = register("timber_plus_yellow",           () -> new BlockBlock(Blocks.YELLOW_TERRACOTTA),     CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> TIMBER_PLUS_LIME             = register("timber_plus_lime",             () -> new BlockBlock(Blocks.LIME_TERRACOTTA),       CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> TIMBER_PLUS_PINK             = register("timber_plus_pink",             () -> new BlockBlock(Blocks.PINK_TERRACOTTA),       CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> TIMBER_PLUS_GRAY             = register("timber_plus_gray",             () -> new BlockBlock(Blocks.GRAY_TERRACOTTA),       CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> TIMBER_PLUS_LIGHT_GRAY       = register("timber_plus_light_gray",       () -> new BlockBlock(Blocks.LIGHT_GRAY_TERRACOTTA), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> TIMBER_PLUS_CYAN             = register("timber_plus_cyan",             () -> new BlockBlock(Blocks.CYAN_TERRACOTTA),       CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> TIMBER_PLUS_PURPLE           = register("timber_plus_purple",           () -> new BlockBlock(Blocks.PURPLE_TERRACOTTA),     CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> TIMBER_PLUS_BLUE             = register("timber_plus_blue",             () -> new BlockBlock(Blocks.BLUE_TERRACOTTA),       CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> TIMBER_PLUS_BROWN            = register("timber_plus_brown",            () -> new BlockBlock(Blocks.BROWN_TERRACOTTA),      CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> TIMBER_PLUS_GREEN            = register("timber_plus_green",            () -> new BlockBlock(Blocks.GREEN_TERRACOTTA),      CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> TIMBER_PLUS_RED              = register("timber_plus_red",              () -> new BlockBlock(Blocks.RED_TERRACOTTA),        CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> TIMBER_PLUS_BLACK            = register("timber_plus_black",            () -> new BlockBlock(Blocks.BLACK_TERRACOTTA),      CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> TIMBER_DIAG_LEFT_WHITE       = register("timber_diag_left_white",       () -> new BlockBlock(Blocks.WHITE_TERRACOTTA),      CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> TIMBER_DIAG_LEFT_ORANGE      = register("timber_diag_left_orange",      () -> new BlockBlock(Blocks.ORANGE_TERRACOTTA),     CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> TIMBER_DIAG_LEFT_MAGENTA     = register("timber_diag_left_magenta",     () -> new BlockBlock(Blocks.MAGENTA_TERRACOTTA),    CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> TIMBER_DIAG_LEFT_LIGHT_BLUE  = register("timber_diag_left_light_blue",  () -> new BlockBlock(Blocks.LIGHT_BLUE_TERRACOTTA), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> TIMBER_DIAG_LEFT_YELLOW      = register("timber_diag_left_yellow",      () -> new BlockBlock(Blocks.YELLOW_TERRACOTTA),     CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> TIMBER_DIAG_LEFT_LIME        = register("timber_diag_left_lime",        () -> new BlockBlock(Blocks.LIME_TERRACOTTA),       CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> TIMBER_DIAG_LEFT_PINK        = register("timber_diag_left_pink",        () -> new BlockBlock(Blocks.PINK_TERRACOTTA),       CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> TIMBER_DIAG_LEFT_GRAY        = register("timber_diag_left_gray",        () -> new BlockBlock(Blocks.GRAY_TERRACOTTA),       CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> TIMBER_DIAG_LEFT_LIGHT_GRAY  = register("timber_diag_left_light_gray",  () -> new BlockBlock(Blocks.LIGHT_GRAY_TERRACOTTA), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> TIMBER_DIAG_LEFT_CYAN        = register("timber_diag_left_cyan",        () -> new BlockBlock(Blocks.CYAN_TERRACOTTA),       CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> TIMBER_DIAG_LEFT_PURPLE      = register("timber_diag_left_purple",      () -> new BlockBlock(Blocks.PURPLE_TERRACOTTA),     CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> TIMBER_DIAG_LEFT_BLUE        = register("timber_diag_left_blue",        () -> new BlockBlock(Blocks.BLUE_TERRACOTTA),       CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> TIMBER_DIAG_LEFT_BROWN       = register("timber_diag_left_brown",       () -> new BlockBlock(Blocks.BROWN_TERRACOTTA),      CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> TIMBER_DIAG_LEFT_GREEN       = register("timber_diag_left_green",       () -> new BlockBlock(Blocks.GREEN_TERRACOTTA),      CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> TIMBER_DIAG_LEFT_RED         = register("timber_diag_left_red",         () -> new BlockBlock(Blocks.RED_TERRACOTTA),        CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> TIMBER_DIAG_LEFT_BLACK       = register("timber_diag_left_black",       () -> new BlockBlock(Blocks.BLACK_TERRACOTTA),      CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> TIMBER_DIAG_RIGHT_WHITE      = register("timber_diag_right_white",      () -> new BlockBlock(Blocks.WHITE_TERRACOTTA),      CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> TIMBER_DIAG_RIGHT_ORANGE     = register("timber_diag_right_orange",     () -> new BlockBlock(Blocks.ORANGE_TERRACOTTA),     CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> TIMBER_DIAG_RIGHT_MAGENTA    = register("timber_diag_right_magenta",    () -> new BlockBlock(Blocks.MAGENTA_TERRACOTTA),    CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> TIMBER_DIAG_RIGHT_LIGHT_BLUE = register("timber_diag_right_light_blue", () -> new BlockBlock(Blocks.LIGHT_BLUE_TERRACOTTA), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> TIMBER_DIAG_RIGHT_YELLOW     = register("timber_diag_right_yellow",     () -> new BlockBlock(Blocks.YELLOW_TERRACOTTA),     CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> TIMBER_DIAG_RIGHT_LIME       = register("timber_diag_right_lime",       () -> new BlockBlock(Blocks.LIME_TERRACOTTA),       CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> TIMBER_DIAG_RIGHT_PINK       = register("timber_diag_right_pink",       () -> new BlockBlock(Blocks.PINK_TERRACOTTA),       CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> TIMBER_DIAG_RIGHT_GRAY       = register("timber_diag_right_gray",       () -> new BlockBlock(Blocks.GRAY_TERRACOTTA),       CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> TIMBER_DIAG_RIGHT_LIGHT_GRAY = register("timber_diag_right_light_gray", () -> new BlockBlock(Blocks.LIGHT_GRAY_TERRACOTTA), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> TIMBER_DIAG_RIGHT_CYAN       = register("timber_diag_right_cyan",       () -> new BlockBlock(Blocks.CYAN_TERRACOTTA),       CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> TIMBER_DIAG_RIGHT_PURPLE     = register("timber_diag_right_purple",     () -> new BlockBlock(Blocks.PURPLE_TERRACOTTA),     CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> TIMBER_DIAG_RIGHT_BLUE       = register("timber_diag_right_blue",       () -> new BlockBlock(Blocks.BLUE_TERRACOTTA),       CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> TIMBER_DIAG_RIGHT_BROWN      = register("timber_diag_right_brown",      () -> new BlockBlock(Blocks.BROWN_TERRACOTTA),      CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> TIMBER_DIAG_RIGHT_GREEN      = register("timber_diag_right_green",      () -> new BlockBlock(Blocks.GREEN_TERRACOTTA),      CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> TIMBER_DIAG_RIGHT_RED        = register("timber_diag_right_red",        () -> new BlockBlock(Blocks.RED_TERRACOTTA),        CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> TIMBER_DIAG_RIGHT_BLACK      = register("timber_diag_right_black",      () -> new BlockBlock(Blocks.BLACK_TERRACOTTA),      CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> TIMBER_CROSS_WHITE           = register("timber_cross_white",           () -> new BlockBlock(Blocks.WHITE_TERRACOTTA),      CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> TIMBER_CROSS_ORANGE          = register("timber_cross_orange",          () -> new BlockBlock(Blocks.ORANGE_TERRACOTTA),     CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> TIMBER_CROSS_MAGENTA         = register("timber_cross_magenta",         () -> new BlockBlock(Blocks.MAGENTA_TERRACOTTA),    CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> TIMBER_CROSS_LIGHT_BLUE      = register("timber_cross_light_blue",      () -> new BlockBlock(Blocks.LIGHT_BLUE_TERRACOTTA), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> TIMBER_CROSS_YELLOW          = register("timber_cross_yellow",          () -> new BlockBlock(Blocks.YELLOW_TERRACOTTA),     CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> TIMBER_CROSS_LIME            = register("timber_cross_lime",            () -> new BlockBlock(Blocks.LIME_TERRACOTTA),       CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> TIMBER_CROSS_PINK            = register("timber_cross_pink",            () -> new BlockBlock(Blocks.PINK_TERRACOTTA),       CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> TIMBER_CROSS_GRAY            = register("timber_cross_gray",            () -> new BlockBlock(Blocks.GRAY_TERRACOTTA),       CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> TIMBER_CROSS_LIGHT_GRAY      = register("timber_cross_light_gray",      () -> new BlockBlock(Blocks.LIGHT_GRAY_TERRACOTTA), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> TIMBER_CROSS_CYAN            = register("timber_cross_cyan",            () -> new BlockBlock(Blocks.CYAN_TERRACOTTA),       CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> TIMBER_CROSS_PURPLE          = register("timber_cross_purple",          () -> new BlockBlock(Blocks.PURPLE_TERRACOTTA),     CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> TIMBER_CROSS_BLUE            = register("timber_cross_blue",            () -> new BlockBlock(Blocks.BLUE_TERRACOTTA),       CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> TIMBER_CROSS_BROWN           = register("timber_cross_brown",           () -> new BlockBlock(Blocks.BROWN_TERRACOTTA),      CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> TIMBER_CROSS_GREEN           = register("timber_cross_green",           () -> new BlockBlock(Blocks.GREEN_TERRACOTTA),      CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> TIMBER_CROSS_RED             = register("timber_cross_red",             () -> new BlockBlock(Blocks.RED_TERRACOTTA),        CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> TIMBER_CROSS_BLACK           = register("timber_cross_black",           () -> new BlockBlock(Blocks.BLACK_TERRACOTTA),      CreativeModeTab.TAB_BUILDING_BLOCKS);

    // Other Blocks
    public static final RegistryObject<Block> BLOCK_SCAFFOLDING  = register("timber_scaffolding",  () -> new BlockScaffolding(Blocks.OAK_PLANKS),   CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> BLOCK_CHAIN_COPPER = register("block_chain_copper",  () -> new BlockChain(      Blocks.COPPER_BLOCK), CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Block> BLOCK_CHAIN_IRON   = register("block_chain_iron",    () -> new BlockChain(      Blocks.IRON_BLOCK),   CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Block> BLOCK_CHAIN_GOLD   = register("block_chain_gold",    () -> new BlockChain(      Blocks.GOLD_BLOCK),   CreativeModeTab.TAB_DECORATIONS);

    // Statue (Dog)
    public static final RegistryObject<Block> STATUE_DOG_STONE      = register("statue_dog_stone",      () -> new BlockGargoyle(Blocks.STONE),      CreativeModeTab.TAB_REDSTONE);
    public static final RegistryObject<Block> STATUE_DOG_GRANITE    = register("statue_dog_granite",    () -> new BlockGargoyle(Blocks.GRANITE),    CreativeModeTab.TAB_REDSTONE);
    public static final RegistryObject<Block> STATUE_DOG_DIORITE    = register("statue_dog_diorite",    () -> new BlockGargoyle(Blocks.DIORITE),    CreativeModeTab.TAB_REDSTONE);
    public static final RegistryObject<Block> STATUE_DOG_ANDESITE   = register("statue_dog_andesite",   () -> new BlockGargoyle(Blocks.ANDESITE),   CreativeModeTab.TAB_REDSTONE);
    public static final RegistryObject<Block> STATUE_DOG_ENDSTONE   = register("statue_dog_endstone",   () -> new BlockGargoyle(Blocks.END_STONE),  CreativeModeTab.TAB_REDSTONE);
    public static final RegistryObject<Block> STATUE_DOG_BLACKSTONE = register("statue_dog_blackstone", () -> new BlockGargoyle(Blocks.BLACKSTONE), CreativeModeTab.TAB_REDSTONE);
    public static final RegistryObject<Block> STATUE_DOG_DEEPSLATE  = register("statue_dog_deepslate",  () -> new BlockGargoyle(Blocks.DEEPSLATE),  CreativeModeTab.TAB_REDSTONE);

    // Statue (Chicken)
    public static final RegistryObject<Block> STATUE_CHICKEN_STONE      = register("statue_chicken_stone",      () -> new BlockGargoyle(Blocks.STONE),      CreativeModeTab.TAB_REDSTONE);
    public static final RegistryObject<Block> STATUE_CHICKEN_GRANITE    = register("statue_chicken_granite",    () -> new BlockGargoyle(Blocks.GRANITE),    CreativeModeTab.TAB_REDSTONE);
    public static final RegistryObject<Block> STATUE_CHICKEN_DIORITE    = register("statue_chicken_diorite",    () -> new BlockGargoyle(Blocks.DIORITE),    CreativeModeTab.TAB_REDSTONE);
    public static final RegistryObject<Block> STATUE_CHICKEN_ANDESITE   = register("statue_chicken_andesite",   () -> new BlockGargoyle(Blocks.ANDESITE),   CreativeModeTab.TAB_REDSTONE);
    public static final RegistryObject<Block> STATUE_CHICKEN_ENDSTONE   = register("statue_chicken_endstone",   () -> new BlockGargoyle(Blocks.END_STONE),  CreativeModeTab.TAB_REDSTONE);
    public static final RegistryObject<Block> STATUE_CHICKEN_BLACKSTONE = register("statue_chicken_blackstone", () -> new BlockGargoyle(Blocks.BLACKSTONE), CreativeModeTab.TAB_REDSTONE);
    public static final RegistryObject<Block> STATUE_CHICKEN_DEEPSLATE  = register("statue_chicken_deepslate",  () -> new BlockGargoyle(Blocks.DEEPSLATE),  CreativeModeTab.TAB_REDSTONE);

    // Emitter Blocks
    public static final RegistryObject<Block> BLOCK_EMITTER_WHITE      = register("block_emitter_white",      () -> new BlockEmitter(Blocks.OBSERVER), CreativeModeTab.TAB_REDSTONE);
    public static final RegistryObject<Block> BLOCK_EMITTER_ORANGE     = register("block_emitter_orange",     () -> new BlockEmitter(Blocks.OBSERVER), CreativeModeTab.TAB_REDSTONE);
    public static final RegistryObject<Block> BLOCK_EMITTER_MAGENTA    = register("block_emitter_magenta",    () -> new BlockEmitter(Blocks.OBSERVER), CreativeModeTab.TAB_REDSTONE);
    public static final RegistryObject<Block> BLOCK_EMITTER_LIGHT_BLUE = register("block_emitter_light_blue", () -> new BlockEmitter(Blocks.OBSERVER), CreativeModeTab.TAB_REDSTONE);
    public static final RegistryObject<Block> BLOCK_EMITTER_YELLOW     = register("block_emitter_yellow",     () -> new BlockEmitter(Blocks.OBSERVER), CreativeModeTab.TAB_REDSTONE);
    public static final RegistryObject<Block> BLOCK_EMITTER_LIME       = register("block_emitter_lime",       () -> new BlockEmitter(Blocks.OBSERVER), CreativeModeTab.TAB_REDSTONE);
    public static final RegistryObject<Block> BLOCK_EMITTER_PINK       = register("block_emitter_pink",       () -> new BlockEmitter(Blocks.OBSERVER), CreativeModeTab.TAB_REDSTONE);
    public static final RegistryObject<Block> BLOCK_EMITTER_GRAY       = register("block_emitter_gray",       () -> new BlockEmitter(Blocks.OBSERVER), CreativeModeTab.TAB_REDSTONE);
    public static final RegistryObject<Block> BLOCK_EMITTER_LIGHT_GRAY = register("block_emitter_light_gray", () -> new BlockEmitter(Blocks.OBSERVER), CreativeModeTab.TAB_REDSTONE);
    public static final RegistryObject<Block> BLOCK_EMITTER_CYAN       = register("block_emitter_cyan",       () -> new BlockEmitter(Blocks.OBSERVER), CreativeModeTab.TAB_REDSTONE);
    public static final RegistryObject<Block> BLOCK_EMITTER_PURPLE     = register("block_emitter_purple",     () -> new BlockEmitter(Blocks.OBSERVER), CreativeModeTab.TAB_REDSTONE);
    public static final RegistryObject<Block> BLOCK_EMITTER_BLUE       = register("block_emitter_blue",       () -> new BlockEmitter(Blocks.OBSERVER), CreativeModeTab.TAB_REDSTONE);
    public static final RegistryObject<Block> BLOCK_EMITTER_BROWN      = register("block_emitter_brown",      () -> new BlockEmitter(Blocks.OBSERVER), CreativeModeTab.TAB_REDSTONE);
    public static final RegistryObject<Block> BLOCK_EMITTER_GREEN      = register("block_emitter_green",      () -> new BlockEmitter(Blocks.OBSERVER), CreativeModeTab.TAB_REDSTONE);
    public static final RegistryObject<Block> BLOCK_EMITTER_RED        = register("block_emitter_red",        () -> new BlockEmitter(Blocks.OBSERVER), CreativeModeTab.TAB_REDSTONE);
    public static final RegistryObject<Block> BLOCK_EMITTER_BLACK      = register("block_emitter_black",      () -> new BlockEmitter(Blocks.OBSERVER), CreativeModeTab.TAB_REDSTONE);

    // Light Blocks
    public static final RegistryObject<Block> BLOCK_LIGHT_WHITE      = register("block_light_white",      () -> new BlockLight(Blocks.WHITE_STAINED_GLASS,      DyeColor.WHITE));
    public static final RegistryObject<Block> BLOCK_LIGHT_ORANGE     = register("block_light_orange",     () -> new BlockLight(Blocks.ORANGE_STAINED_GLASS,     DyeColor.ORANGE));
    public static final RegistryObject<Block> BLOCK_LIGHT_MAGENTA    = register("block_light_magenta",    () -> new BlockLight(Blocks.MAGENTA_STAINED_GLASS,    DyeColor.MAGENTA));
    public static final RegistryObject<Block> BLOCK_LIGHT_LIGHT_BLUE = register("block_light_light_blue", () -> new BlockLight(Blocks.LIGHT_BLUE_STAINED_GLASS, DyeColor.LIGHT_BLUE));
    public static final RegistryObject<Block> BLOCK_LIGHT_YELLOW     = register("block_light_yellow",     () -> new BlockLight(Blocks.YELLOW_STAINED_GLASS,     DyeColor.YELLOW));
    public static final RegistryObject<Block> BLOCK_LIGHT_LIME       = register("block_light_lime",       () -> new BlockLight(Blocks.LIME_STAINED_GLASS,       DyeColor.LIME));
    public static final RegistryObject<Block> BLOCK_LIGHT_PINK       = register("block_light_pink",       () -> new BlockLight(Blocks.PINK_STAINED_GLASS,       DyeColor.PINK));
    public static final RegistryObject<Block> BLOCK_LIGHT_GRAY       = register("block_light_gray",       () -> new BlockLight(Blocks.GRAY_STAINED_GLASS,       DyeColor.GRAY));
    public static final RegistryObject<Block> BLOCK_LIGHT_LIGHT_GRAY = register("block_light_light_gray", () -> new BlockLight(Blocks.LIGHT_GRAY_STAINED_GLASS, DyeColor.LIGHT_GRAY));
    public static final RegistryObject<Block> BLOCK_LIGHT_CYAN       = register("block_light_cyan",       () -> new BlockLight(Blocks.CYAN_STAINED_GLASS,       DyeColor.CYAN));
    public static final RegistryObject<Block> BLOCK_LIGHT_PURPLE     = register("block_light_purple",     () -> new BlockLight(Blocks.PURPLE_STAINED_GLASS,     DyeColor.PURPLE));
    public static final RegistryObject<Block> BLOCK_LIGHT_BLUE       = register("block_light_blue",       () -> new BlockLight(Blocks.BLUE_STAINED_GLASS,       DyeColor.BLUE));
    public static final RegistryObject<Block> BLOCK_LIGHT_BROWN      = register("block_light_brown",      () -> new BlockLight(Blocks.BROWN_STAINED_GLASS,      DyeColor.BROWN));
    public static final RegistryObject<Block> BLOCK_LIGHT_GREEN      = register("block_light_green",      () -> new BlockLight(Blocks.GREEN_STAINED_GLASS,      DyeColor.GREEN));
    public static final RegistryObject<Block> BLOCK_LIGHT_RED        = register("block_light_red",        () -> new BlockLight(Blocks.RED_STAINED_GLASS,        DyeColor.RED));
    public static final RegistryObject<Block> BLOCK_LIGHT_BLACK      = register("block_light_black",      () -> new BlockLight(Blocks.BLACK_STAINED_GLASS,      DyeColor.BLACK));





    //----------------------------------------REGISTER----------------------------------------//

    static void register(){
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
        ITEMS.register( FMLJavaModLoadingContext.get().getModEventBus());
    }

    private static RegistryObject<Block> register(String name,  java.util.function.Supplier<? extends Block> block){
        return register(name, block, null);
    }

    private static RegistryObject<Block> register(String name,  java.util.function.Supplier<? extends Block> block, CreativeModeTab CreativeModeTab){
        RegistryObject<Block> rob = BLOCKS.register(name, block);
        if(CreativeModeTab != null){ ITEMS.register(name, () -> new BlockItem(rob.get(), (new Item.Properties()).tab(CreativeModeTab))); }
        return rob;
    }

    // private static RegistryObject<Block> register(String name, Block block){
    //     return register(name, block, null);
    // }

    // private static RegistryObject<Block> register(String name, Block block, CreativeModeTab CreativeModeTab){
    //     if(CreativeModeTab != null){ ITEMS.register(name, () -> new BlockItem(block, (new Item.Properties()).tab(CreativeModeTab))); }
    //     return BLOCKS.register(name, () -> block);
    // }

    private static RegistryObject<Item> register(String name, Item item){
        return ITEMS.register(name, () -> item);
    }





    //----------------------------------------SETUP----------------------------------------//

    static void setup(FMLCommonSetupEvent event){

    }

    @OnlyIn(Dist.CLIENT)
    static void setup(FMLClientSetupEvent event){
        event.enqueueWork(() -> {
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
        });
    }



}
