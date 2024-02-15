package mod.stairway;

import mod.lucky77.block.BlockBlock;
import mod.lucky77.block.BlockCropDouble;
import mod.lucky77.block.BlockCropSingle;
import mod.lucky77.block.BlockOre;
import mod.lucky77.item.ItemFood;
import mod.lucky77.item.ItemItem;
import mod.lucky77.item.ItemSeed;
import mod.lucky77.register.RegisterMod;
import mod.lucky77.util.system.SystemTrades;
import mod.stairway.common.block.*;
import net.minecraft.client.gui.screens.MenuScreens;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.MinecraftServer;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.npc.VillagerProfession;
import net.minecraft.world.entity.npc.VillagerTrades;
import net.minecraft.world.inventory.MenuType;
import net.minecraft.world.item.*;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.level.block.AmethystClusterBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.levelgen.structure.pools.StructureTemplatePool;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructureProcessorList;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.material.PushReaction;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.common.extensions.IForgeMenuType;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

import static mod.stairway.StairwayToAether.MODID;
import static net.minecraft.world.entity.MobCategory.CREATURE;
import static net.minecraft.world.level.block.Blocks.AMETHYST_CLUSTER;

@SuppressWarnings("unused")
public class Register {
	
	// Create Deferred Registers to hold whatever is written in <...> which will all be registered under the MODID namespace
	private static final DeferredRegister<Block>               BLOCKS         = DeferredRegister.create(ForgeRegistries.BLOCKS,             MODID);
	private static final DeferredRegister<Item>                ITEMS          = DeferredRegister.create(ForgeRegistries.ITEMS,              MODID);
	private static final DeferredRegister<CreativeModeTab>     CREATIVE_TABS  = DeferredRegister.create(Registries.CREATIVE_MODE_TAB,       MODID);
	private static final DeferredRegister<MenuType<?>>         MENUS          = DeferredRegister.create(ForgeRegistries.MENU_TYPES,         MODID);
	private static final DeferredRegister<BlockEntityType<?>>  BLOCK_ENTITIES = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, MODID);
	private static final DeferredRegister<SoundEvent>          SOUNDS         = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS,       MODID);
	private static final DeferredRegister<EntityType<?>>       ENTITIES       = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES,       MODID);
	private static final DeferredRegister<RecipeSerializer<?>> RECIPIES       = DeferredRegister.create(ForgeRegistries.RECIPE_SERIALIZERS, MODID);
	
	
	
	
	
	// ---------- ---------- ---------- ----------  BLOCKS / ITEMS  ---------- ---------- ---------- ---------- //
	
	// ----- Stone ----- //
	//                                        BLOCK_STONE_STONES
	//                                        SLABS_STONE_STONES
	//                                        STAIR_STONE_STONES
	public static final RegistryObject<Block> WALLS_STONE_STONES       = registerBlock("walls_stone_stones",       () -> new BlockWalls(Blocks.STONE));
	public static final RegistryObject<Block> PILAR_STONE_STONES       = registerBlock("pilar_stone_stones",       () -> new BlockPilar(Blocks.STONE));
	//                                        BLOCK_STONE_SMOOTH
	//                                        SLABS_STONE_SMOOTH
	public static final RegistryObject<Block> STAIR_STONE_SMOOTH       = registerBlock("stair_stone_smooth",       () -> new BlockStair(Blocks.STONE));
	public static final RegistryObject<Block> WALLS_STONE_SMOOTH       = registerBlock("walls_stone_smooth",       () -> new BlockWalls(Blocks.STONE));
	public static final RegistryObject<Block> PILAR_STONE_SMOOTH       = registerBlock("pilar_stone_smooth",       () -> new BlockPilar(Blocks.STONE));
	//                                        BLOCK_STONE_COBBLE_BASIC
	//                                        SLABS_STONE_COBBLE_BASIC
	//                                        STAIR_STONE_COBBLE_BASIC
	//                                        WALLS_STONE_COBBLE_BASIC
	public static final RegistryObject<Block> PILAR_STONE_COBBLE_BASIC = registerBlock("pilar_stone_cobble_basic", () -> new BlockPilar(Blocks.STONE));
	//                                        BLOCK_STONE_COBBLE_MOSSY
	//                                        SLABS_STONE_COBBLE_MOSSY
	//                                        STAIR_STONE_COBBLE_MOSSY
	//                                        WALLS_STONE_COBBLE_MOSSY
	public static final RegistryObject<Block> PILAR_STONE_COBBLE_MOSSY = registerBlock("pilar_stone_cobble_mossy", () -> new BlockPilar(Blocks.STONE));
	//                                        BLOCK_STONE_BRICKS_BASIC
	//                                        SLABS_STONE_BRICKS_BASIC
	//                                        STAIR_STONE_BRICKS_BASIC
	//                                        WALLS_STONE_BRICKS_BASIC
	public static final RegistryObject<Block> PILAR_STONE_BRICKS_BASIC = registerBlock("pilar_stone_bricks_basic", () -> new BlockPilar(Blocks.STONE));
	//                                        BLOCK_STONE_BRICKS_MOSSY
	//                                        SLABS_STONE_BRICKS_MOSSY
	//                                        STAIR_STONE_BRICKS_MOSSY
	//                                        WALLS_STONE_BRICKS_MOSSY
	public static final RegistryObject<Block> PILAR_STONE_BRICKS_MOSSY = registerBlock("pilar_stone_bricks_mossy", () -> new BlockPilar(Blocks.STONE));
	//                                        BLOCK_STONE_BRICKS_CRACK
	public static final RegistryObject<Block> SLABS_STONE_BRICKS_CRACK = registerBlock("slabs_stone_bricks_crack", () -> new BlockSlabs(Blocks.STONE));
	public static final RegistryObject<Block> STAIR_STONE_BRICKS_CRACK = registerBlock("stair_stone_bricks_crack", () -> new BlockStair(Blocks.STONE));
	public static final RegistryObject<Block> WALLS_STONE_BRICKS_CRACK = registerBlock("walls_stone_bricks_crack", () -> new BlockWalls(Blocks.STONE));
	public static final RegistryObject<Block> PILAR_STONE_BRICKS_CRACK = registerBlock("pilar_stone_bricks_crack", () -> new BlockPilar(Blocks.STONE));
	//                                        BLOCK_STONE_CARVED
	
	// ----- Granite ----- //
	//                                        BLOCK_GRANITE_STONES
	//                                        SLABS_GRANITE_STONES
	//                                        STAIR_GRANITE_STONES
	//                                        WALLS_GRANITE_STONES
	public static final RegistryObject<Block> PILAR_GRANITE_STONES       =  registerBlock("pilar_granite_stones",      () -> new BlockPilar(Blocks.GRANITE));
	//                                        BLOCK_GRANITE_SMOOTH
	//                                        SLABS_GRANITE_SMOOTH
	//                                        STAIR_GRANITE_SMOOTH
	public static final RegistryObject<Block> WALLS_GRANITE_SMOOTH       = registerBlock("walls_granite_smooth",       () -> new BlockWalls(Blocks.GRANITE));
	public static final RegistryObject<Block> PILAR_GRANITE_SMOOTH       = registerBlock("pilar_granite_smooth",       () -> new BlockPilar(Blocks.GRANITE));
	public static final RegistryObject<Block> BLOCK_GRANITE_COBBLE_BASIC = registerBlock("block_granite_cobble_basic", () -> new BlockBlock(Blocks.GRANITE));
	public static final RegistryObject<Block> SLABS_GRANITE_COBBLE_BASIC = registerBlock("slabs_granite_cobble_basic", () -> new BlockSlabs(Blocks.GRANITE));
	public static final RegistryObject<Block> STAIR_GRANITE_COBBLE_BASIC = registerBlock("stair_granite_cobble_basic", () -> new BlockStair(Blocks.GRANITE));
	public static final RegistryObject<Block> WALLS_GRANITE_COBBLE_BASIC = registerBlock("walls_granite_cobble_basic", () -> new BlockWalls(Blocks.GRANITE));
	public static final RegistryObject<Block> PILAR_GRANITE_COBBLE_BASIC = registerBlock("pilar_granite_cobble_basic", () -> new BlockPilar(Blocks.GRANITE));
	public static final RegistryObject<Block> BLOCK_GRANITE_COBBLE_MOSSY = registerBlock("block_granite_cobble_mossy", () -> new BlockBlock(Blocks.GRANITE));
	public static final RegistryObject<Block> SLABS_GRANITE_COBBLE_MOSSY = registerBlock("slabs_granite_cobble_mossy", () -> new BlockSlabs(Blocks.GRANITE));
	public static final RegistryObject<Block> STAIR_GRANITE_COBBLE_MOSSY = registerBlock("stair_granite_cobble_mossy", () -> new BlockStair(Blocks.GRANITE));
	public static final RegistryObject<Block> WALLS_GRANITE_COBBLE_MOSSY = registerBlock("walls_granite_cobble_mossy", () -> new BlockWalls(Blocks.GRANITE));
	public static final RegistryObject<Block> PILAR_GRANITE_COBBLE_MOSSY = registerBlock("pilar_granite_cobble_mossy", () -> new BlockPilar(Blocks.GRANITE));
	public static final RegistryObject<Block> BLOCK_GRANITE_BRICKS_BASIC = registerBlock("block_granite_bricks_basic", () -> new BlockBlock(Blocks.GRANITE));
	public static final RegistryObject<Block> SLABS_GRANITE_BRICKS_BASIC = registerBlock("slabs_granite_bricks_basic", () -> new BlockSlabs(Blocks.GRANITE));
	public static final RegistryObject<Block> STAIR_GRANITE_BRICKS_BASIC = registerBlock("stair_granite_bricks_basic", () -> new BlockStair(Blocks.GRANITE));
	public static final RegistryObject<Block> WALLS_GRANITE_BRICKS_BASIC = registerBlock("walls_granite_bricks_basic", () -> new BlockWalls(Blocks.GRANITE));
	public static final RegistryObject<Block> PILAR_GRANITE_BRICKS_BASIC = registerBlock("pilar_granite_bricks_basic", () -> new BlockPilar(Blocks.GRANITE));
	public static final RegistryObject<Block> BLOCK_GRANITE_BRICKS_MOSSY = registerBlock("block_granite_bricks_mossy", () -> new BlockBlock(Blocks.GRANITE));
	public static final RegistryObject<Block> SLABS_GRANITE_BRICKS_MOSSY = registerBlock("slabs_granite_bricks_mossy", () -> new BlockSlabs(Blocks.GRANITE));
	public static final RegistryObject<Block> STAIR_GRANITE_BRICKS_MOSSY = registerBlock("stair_granite_bricks_mossy", () -> new BlockStair(Blocks.GRANITE));
	public static final RegistryObject<Block> WALLS_GRANITE_BRICKS_MOSSY = registerBlock("walls_granite_bricks_mossy", () -> new BlockWalls(Blocks.GRANITE));
	public static final RegistryObject<Block> PILAR_GRANITE_BRICKS_MOSSY = registerBlock("pilar_granite_bricks_mossy", () -> new BlockPilar(Blocks.GRANITE));
	public static final RegistryObject<Block> BLOCK_GRANITE_BRICKS_CRACK = registerBlock("block_granite_bricks_crack", () -> new BlockBlock(Blocks.GRANITE));
	public static final RegistryObject<Block> SLABS_GRANITE_BRICKS_CRACK = registerBlock("slabs_granite_bricks_crack", () -> new BlockSlabs(Blocks.GRANITE));
	public static final RegistryObject<Block> STAIR_GRANITE_BRICKS_CRACK = registerBlock("stair_granite_bricks_crack", () -> new BlockStair(Blocks.GRANITE));
	public static final RegistryObject<Block> WALLS_GRANITE_BRICKS_CRACK = registerBlock("walls_granite_bricks_crack", () -> new BlockWalls(Blocks.GRANITE));
	public static final RegistryObject<Block> PILAR_GRANITE_BRICKS_CRACK = registerBlock("pilar_granite_bricks_crack", () -> new BlockPilar(Blocks.GRANITE));
	public static final RegistryObject<Block> BLOCK_GRANITE_CARVED       = registerBlock("block_granite_carved",       () -> new BlockBlock(Blocks.GRANITE));
	
	// ----- Diorite ----- //
	//                                        BLOCK_DIORITE_STONES
	//                                        SLABS_DIORITE_STONES
	//                                        STAIR_DIORITE_STONES
	//                                        WALLS_DIORITE_STONES
	public static final RegistryObject<Block> PILAR_DIORITE_STONES       = registerBlock("pilar_diorite_stones",       () -> new BlockPilar(Blocks.DIORITE));
	//                                        BLOCK_DIORITE_SMOOTH
	//                                        SLABS_DIORITE_SMOOTH
	//                                        STAIR_DIORITE_SMOOTH
	public static final RegistryObject<Block> WALLS_DIORITE_SMOOTH       = registerBlock("walls_diorite_smooth",       () -> new BlockWalls(Blocks.DIORITE));
	public static final RegistryObject<Block> PILAR_DIORITE_SMOOTH       = registerBlock("pilar_diorite_smooth",       () -> new BlockPilar(Blocks.DIORITE));
	public static final RegistryObject<Block> BLOCK_DIORITE_COBBLE_BASIC = registerBlock("block_diorite_cobble_basic", () -> new BlockBlock(Blocks.DIORITE));
	public static final RegistryObject<Block> SLABS_DIORITE_COBBLE_BASIC = registerBlock("slabs_diorite_cobble_basic", () -> new BlockSlabs(Blocks.DIORITE));
	public static final RegistryObject<Block> STAIR_DIORITE_COBBLE_BASIC = registerBlock("stair_diorite_cobble_basic", () -> new BlockStair(Blocks.DIORITE));
	public static final RegistryObject<Block> WALLS_DIORITE_COBBLE_BASIC = registerBlock("walls_diorite_cobble_basic", () -> new BlockWalls(Blocks.DIORITE));
	public static final RegistryObject<Block> PILAR_DIORITE_COBBLE_BASIC = registerBlock("pilar_diorite_cobble_basic", () -> new BlockPilar(Blocks.DIORITE));
	public static final RegistryObject<Block> BLOCK_DIORITE_COBBLE_MOSSY = registerBlock("block_diorite_cobble_mossy", () -> new BlockBlock(Blocks.DIORITE));
	public static final RegistryObject<Block> SLABS_DIORITE_COBBLE_MOSSY = registerBlock("slabs_diorite_cobble_mossy", () -> new BlockSlabs(Blocks.DIORITE));
	public static final RegistryObject<Block> STAIR_DIORITE_COBBLE_MOSSY = registerBlock("stair_diorite_cobble_mossy", () -> new BlockStair(Blocks.DIORITE));
	public static final RegistryObject<Block> WALLS_DIORITE_COBBLE_MOSSY = registerBlock("walls_diorite_cobble_mossy", () -> new BlockWalls(Blocks.DIORITE));
	public static final RegistryObject<Block> PILAR_DIORITE_COBBLE_MOSSY = registerBlock("pilar_diorite_cobble_mossy", () -> new BlockPilar(Blocks.DIORITE));
	public static final RegistryObject<Block> BLOCK_DIORITE_BRICKS_BASIC = registerBlock("block_diorite_bricks_basic", () -> new BlockBlock(Blocks.DIORITE));
	public static final RegistryObject<Block> SLABS_DIORITE_BRICKS_BASIC = registerBlock("slabs_diorite_bricks_basic", () -> new BlockSlabs(Blocks.DIORITE));
	public static final RegistryObject<Block> STAIR_DIORITE_BRICKS_BASIC = registerBlock("stair_diorite_bricks_basic", () -> new BlockStair(Blocks.DIORITE));
	public static final RegistryObject<Block> WALLS_DIORITE_BRICKS_BASIC = registerBlock("walls_diorite_bricks_basic", () -> new BlockWalls(Blocks.DIORITE));
	public static final RegistryObject<Block> PILAR_DIORITE_BRICKS_BASIC = registerBlock("pilar_diorite_bricks_basic", () -> new BlockPilar(Blocks.DIORITE));
	public static final RegistryObject<Block> BLOCK_DIORITE_BRICKS_MOSSY = registerBlock("block_diorite_bricks_mossy", () -> new BlockBlock(Blocks.DIORITE));
	public static final RegistryObject<Block> SLABS_DIORITE_BRICKS_MOSSY = registerBlock("slabs_diorite_bricks_mossy", () -> new BlockSlabs(Blocks.DIORITE));
	public static final RegistryObject<Block> STAIR_DIORITE_BRICKS_MOSSY = registerBlock("stair_diorite_bricks_mossy", () -> new BlockStair(Blocks.DIORITE));
	public static final RegistryObject<Block> WALLS_DIORITE_BRICKS_MOSSY = registerBlock("walls_diorite_bricks_mossy", () -> new BlockWalls(Blocks.DIORITE));
	public static final RegistryObject<Block> PILAR_DIORITE_BRICKS_MOSSY = registerBlock("pilar_diorite_bricks_mossy", () -> new BlockPilar(Blocks.DIORITE));
	public static final RegistryObject<Block> BLOCK_DIORITE_BRICKS_CRACK = registerBlock("block_diorite_bricks_crack", () -> new BlockBlock(Blocks.DIORITE));
	public static final RegistryObject<Block> SLABS_DIORITE_BRICKS_CRACK = registerBlock("slabs_diorite_bricks_crack", () -> new BlockSlabs(Blocks.DIORITE));
	public static final RegistryObject<Block> STAIR_DIORITE_BRICKS_CRACK = registerBlock("stair_diorite_bricks_crack", () -> new BlockStair(Blocks.DIORITE));
	public static final RegistryObject<Block> WALLS_DIORITE_BRICKS_CRACK = registerBlock("walls_diorite_bricks_crack", () -> new BlockWalls(Blocks.DIORITE));
	public static final RegistryObject<Block> PILAR_DIORITE_BRICKS_CRACK = registerBlock("pilar_diorite_bricks_crack", () -> new BlockPilar(Blocks.DIORITE));
	public static final RegistryObject<Block> BLOCK_DIORITE_CARVED       = registerBlock("block_diorite_carved",       () -> new BlockBlock(Blocks.DIORITE));
	
	// ----- Andesite ----- //
	//                                        BLOCK_ANDESITE_STONES
	//                                        SLABS_ANDESITE_STONES
	//                                        STAIR_ANDESITE_STONES
	//                                        WALLS_ANDESITE_STONES
	public static final RegistryObject<Block> PILAR_ANDESITE_STONES       = registerBlock("pilar_andesite_stones",       () -> new BlockPilar(Blocks.ANDESITE));
	//                                        BLOCK_ANDESITE_SMOOTH
	//                                        SLABS_ANDESITE_SMOOTH
	//                                        STAIR_ANDESITE_SMOOTH
	public static final RegistryObject<Block> WALLS_ANDESITE_SMOOTH       = registerBlock("walls_andesite_smooth",       () -> new BlockWalls(Blocks.ANDESITE));
	public static final RegistryObject<Block> PILAR_ANDESITE_SMOOTH       = registerBlock("pilar_andesite_smooth",       () -> new BlockPilar(Blocks.ANDESITE));
	public static final RegistryObject<Block> BLOCK_ANDESITE_COBBLE_BASIC = registerBlock("block_andesite_cobble_basic", () -> new BlockBlock(Blocks.ANDESITE));
	public static final RegistryObject<Block> SLABS_ANDESITE_COBBLE_BASIC = registerBlock("slabs_andesite_cobble_basic", () -> new BlockSlabs(Blocks.ANDESITE));
	public static final RegistryObject<Block> STAIR_ANDESITE_COBBLE_BASIC = registerBlock("stair_andesite_cobble_basic", () -> new BlockStair(Blocks.ANDESITE));
	public static final RegistryObject<Block> WALLS_ANDESITE_COBBLE_BASIC = registerBlock("walls_andesite_cobble_basic", () -> new BlockWalls(Blocks.ANDESITE));
	public static final RegistryObject<Block> PILAR_ANDESITE_COBBLE_BASIC = registerBlock("pilar_andesite_cobble_basic", () -> new BlockPilar(Blocks.ANDESITE));
	public static final RegistryObject<Block> BLOCK_ANDESITE_COBBLE_MOSSY = registerBlock("block_andesite_cobble_mossy", () -> new BlockBlock(Blocks.ANDESITE));
	public static final RegistryObject<Block> SLABS_ANDESITE_COBBLE_MOSSY = registerBlock("slabs_andesite_cobble_mossy", () -> new BlockSlabs(Blocks.ANDESITE));
	public static final RegistryObject<Block> STAIR_ANDESITE_COBBLE_MOSSY = registerBlock("stair_andesite_cobble_mossy", () -> new BlockStair(Blocks.ANDESITE));
	public static final RegistryObject<Block> WALLS_ANDESITE_COBBLE_MOSSY = registerBlock("walls_andesite_cobble_mossy", () -> new BlockWalls(Blocks.ANDESITE));
	public static final RegistryObject<Block> PILAR_ANDESITE_COBBLE_MOSSY = registerBlock("pilar_andesite_cobble_mossy", () -> new BlockPilar(Blocks.ANDESITE));
	public static final RegistryObject<Block> BLOCK_ANDESITE_BRICKS_BASIC = registerBlock("block_andesite_bricks_basic", () -> new BlockBlock(Blocks.ANDESITE));
	public static final RegistryObject<Block> SLABS_ANDESITE_BRICKS_BASIC = registerBlock("slabs_andesite_bricks_basic", () -> new BlockSlabs(Blocks.ANDESITE));
	public static final RegistryObject<Block> STAIR_ANDESITE_BRICKS_BASIC = registerBlock("stair_andesite_bricks_basic", () -> new BlockStair(Blocks.ANDESITE));
	public static final RegistryObject<Block> WALLS_ANDESITE_BRICKS_BASIC = registerBlock("walls_andesite_bricks_basic", () -> new BlockWalls(Blocks.ANDESITE));
	public static final RegistryObject<Block> PILAR_ANDESITE_BRICKS_BASIC = registerBlock("pilar_andesite_bricks_basic", () -> new BlockPilar(Blocks.ANDESITE));
	public static final RegistryObject<Block> BLOCK_ANDESITE_BRICKS_MOSSY = registerBlock("block_andesite_bricks_mossy", () -> new BlockBlock(Blocks.ANDESITE));
	public static final RegistryObject<Block> SLABS_ANDESITE_BRICKS_MOSSY = registerBlock("slabs_andesite_bricks_mossy", () -> new BlockSlabs(Blocks.ANDESITE));
	public static final RegistryObject<Block> STAIR_ANDESITE_BRICKS_MOSSY = registerBlock("stair_andesite_bricks_mossy", () -> new BlockStair(Blocks.ANDESITE));
	public static final RegistryObject<Block> WALLS_ANDESITE_BRICKS_MOSSY = registerBlock("walls_andesite_bricks_mossy", () -> new BlockWalls(Blocks.ANDESITE));
	public static final RegistryObject<Block> PILAR_ANDESITE_BRICKS_MOSSY = registerBlock("pilar_andesite_bricks_mossy", () -> new BlockPilar(Blocks.ANDESITE));
	public static final RegistryObject<Block> BLOCK_ANDESITE_BRICKS_CRACK = registerBlock("block_andesite_bricks_crack", () -> new BlockBlock(Blocks.ANDESITE));
	public static final RegistryObject<Block> SLABS_ANDESITE_BRICKS_CRACK = registerBlock("slabs_andesite_bricks_crack", () -> new BlockSlabs(Blocks.ANDESITE));
	public static final RegistryObject<Block> STAIR_ANDESITE_BRICKS_CRACK = registerBlock("stair_andesite_bricks_crack", () -> new BlockStair(Blocks.ANDESITE));
	public static final RegistryObject<Block> WALLS_ANDESITE_BRICKS_CRACK = registerBlock("walls_andesite_bricks_crack", () -> new BlockWalls(Blocks.ANDESITE));
	public static final RegistryObject<Block> PILAR_ANDESITE_BRICKS_CRACK = registerBlock("pilar_andesite_bricks_crack", () -> new BlockPilar(Blocks.ANDESITE));
	public static final RegistryObject<Block> BLOCK_ANDESITE_CARVED       = registerBlock("block_andesite_carved",       () -> new BlockBlock(Blocks.ANDESITE));
	
	// ----- Prismarine ----- //
	//                                        SLABS_PRISMARINE_STONE
	//                                        STAIR_PRISMARINE_STONE
	//                                        WALLS_PRISMARINE_STONE
	public static final RegistryObject<Block> PILAR_PRISMARINE_STONE = registerBlock("pilar_prismarine_stone", () -> new BlockPilar(Blocks.PRISMARINE));
	//                                        SLABS_PRISMARINE_BRICK
	//                                        STAIR_PRISMARINE_BRICK
	public static final RegistryObject<Block> WALLS_PRISMARINE_BRICK = registerBlock("walls_prismarine_brick", () -> new BlockWalls(Blocks.PRISMARINE));
	public static final RegistryObject<Block> PILAR_PRISMARINE_BRICK = registerBlock("pilar_prismarine_brick", () -> new BlockPilar(Blocks.PRISMARINE));
	//                                        SLABS_PRISMARINE_DARK
	//                                        STAIR_PRISMARINE_DARK
	public static final RegistryObject<Block> WALLS_PRISMARINE_DARK  = registerBlock("walls_prismarine_dark",  () -> new BlockWalls(Blocks.PRISMARINE));
	public static final RegistryObject<Block> PILAR_PRISMARINE_DARK  = registerBlock("pilar_prismarine_dark",  () -> new BlockPilar(Blocks.PRISMARINE));
	
	// ----- End Stone ----- //
	//                                        BLOCK_ENDSTONE_STONES
	public static final RegistryObject<Block> SLABS_ENDSTONE_STONES       = registerBlock("slabs_endstone_stones",       () -> new BlockSlabs(Blocks.END_STONE));
	public static final RegistryObject<Block> STAIR_ENDSTONE_STONES       = registerBlock("stair_endstone_stones",       () -> new BlockStair(Blocks.END_STONE));
	public static final RegistryObject<Block> WALLS_ENDSTONE_STONES       = registerBlock("walls_endstone_stones",       () -> new BlockWalls(Blocks.END_STONE));
	public static final RegistryObject<Block> PILAR_ENDSTONE_STONES       = registerBlock("pilar_endstone_stones",       () -> new BlockPilar(Blocks.END_STONE));
	public static final RegistryObject<Block> BLOCK_ENDSTONE_SMOOTH       = registerBlock("block_endstone_smooth",       () -> new BlockBlock(Blocks.END_STONE));
	public static final RegistryObject<Block> SLABS_ENDSTONE_SMOOTH       = registerBlock("slabs_endstone_smooth",       () -> new BlockSlabs(Blocks.END_STONE));
	public static final RegistryObject<Block> STAIR_ENDSTONE_SMOOTH       = registerBlock("stair_endstone_smooth",       () -> new BlockStair(Blocks.END_STONE));
	public static final RegistryObject<Block> WALLS_ENDSTONE_SMOOTH       = registerBlock("walls_endstone_smooth",       () -> new BlockWalls(Blocks.END_STONE));
	public static final RegistryObject<Block> PILAR_ENDSTONE_SMOOTH       = registerBlock("pilar_endstone_smooth",       () -> new BlockPilar(Blocks.END_STONE));
	public static final RegistryObject<Block> BLOCK_ENDSTONE_COBBLE_BASIC = registerBlock("block_endstone_cobble_basic", () -> new BlockBlock(Blocks.END_STONE));
	public static final RegistryObject<Block> SLABS_ENDSTONE_COBBLE_BASIC = registerBlock("slabs_endstone_cobble_basic", () -> new BlockSlabs(Blocks.END_STONE));
	public static final RegistryObject<Block> STAIR_ENDSTONE_COBBLE_BASIC = registerBlock("stair_endstone_cobble_basic", () -> new BlockStair(Blocks.END_STONE));
	public static final RegistryObject<Block> WALLS_ENDSTONE_COBBLE_BASIC = registerBlock("walls_endstone_cobble_basic", () -> new BlockWalls(Blocks.END_STONE));
	public static final RegistryObject<Block> PILAR_ENDSTONE_COBBLE_BASIC = registerBlock("pilar_endstone_cobble_basic", () -> new BlockPilar(Blocks.END_STONE));
	public static final RegistryObject<Block> BLOCK_ENDSTONE_COBBLE_MOSSY = registerBlock("block_endstone_cobble_mossy", () -> new BlockBlock(Blocks.END_STONE));
	public static final RegistryObject<Block> SLABS_ENDSTONE_COBBLE_MOSSY = registerBlock("slabs_endstone_cobble_mossy", () -> new BlockSlabs(Blocks.END_STONE));
	public static final RegistryObject<Block> STAIR_ENDSTONE_COBBLE_MOSSY = registerBlock("stair_endstone_cobble_mossy", () -> new BlockStair(Blocks.END_STONE));
	public static final RegistryObject<Block> WALLS_ENDSTONE_COBBLE_MOSSY = registerBlock("walls_endstone_cobble_mossy", () -> new BlockWalls(Blocks.END_STONE));
	public static final RegistryObject<Block> PILAR_ENDSTONE_COBBLE_MOSSY = registerBlock("pilar_endstone_cobble_mossy", () -> new BlockPilar(Blocks.END_STONE));
	//                                        BLOCK_ENDSTONE_BRICKS_BASIC
	//                                        SLABS_ENDSTONE_BRICKS_BASIC
	//                                        STAIR_ENDSTONE_BRICKS_BASIC
	//                                        WALLS_ENDSTONE_BRICKS_BASIC
	public static final RegistryObject<Block> PILAR_ENDSTONE_BRICKS_BASIC = registerBlock("pilar_endstone_bricks_basic", () -> new BlockPilar(Blocks.END_STONE));
	public static final RegistryObject<Block> BLOCK_ENDSTONE_BRICKS_MOSSY = registerBlock("block_endstone_bricks_mossy", () -> new BlockBlock(Blocks.END_STONE));
	public static final RegistryObject<Block> SLABS_ENDSTONE_BRICKS_MOSSY = registerBlock("slabs_endstone_bricks_mossy", () -> new BlockSlabs(Blocks.END_STONE));
	public static final RegistryObject<Block> STAIR_ENDSTONE_BRICKS_MOSSY = registerBlock("stair_endstone_bricks_mossy", () -> new BlockStair(Blocks.END_STONE));
	public static final RegistryObject<Block> WALLS_ENDSTONE_BRICKS_MOSSY = registerBlock("walls_endstone_bricks_mossy", () -> new BlockWalls(Blocks.END_STONE));
	public static final RegistryObject<Block> PILAR_ENDSTONE_BRICKS_MOSSY = registerBlock("pilar_endstone_bricks_mossy", () -> new BlockPilar(Blocks.END_STONE));
	public static final RegistryObject<Block> BLOCK_ENDSTONE_BRICKS_CRACK = registerBlock("block_endstone_bricks_crack", () -> new BlockBlock(Blocks.END_STONE));
	public static final RegistryObject<Block> SLABS_ENDSTONE_BRICKS_CRACK = registerBlock("slabs_endstone_bricks_crack", () -> new BlockSlabs(Blocks.END_STONE));
	public static final RegistryObject<Block> STAIR_ENDSTONE_BRICKS_CRACK = registerBlock("stair_endstone_bricks_crack", () -> new BlockStair(Blocks.END_STONE));
	public static final RegistryObject<Block> WALLS_ENDSTONE_BRICKS_CRACK = registerBlock("walls_endstone_bricks_crack", () -> new BlockWalls(Blocks.END_STONE));
	public static final RegistryObject<Block> PILAR_ENDSTONE_BRICKS_CRACK = registerBlock("pilar_endstone_bricks_crack", () -> new BlockPilar(Blocks.END_STONE));
	public static final RegistryObject<Block> BLOCK_ENDSTONE_CARVED       = registerBlock("block_endstone_carved",       () -> new BlockBlock(Blocks.END_STONE));
	
	// ----- Blackstone ----- //
	//                                        BLOCK_BLACKSTONE_SMOOTH
	//                                        SLABS_BLACKSTONE_SMOOTH
	//                                        STAIR_BLACKSTONE_SMOOTH
	//                                        WALLS_BLACKSTONE_SMOOTH
	public static final RegistryObject<Block> PILAR_BLACKSTONE_SMOOTH       = registerBlock("pilar_blackstone_smooth",       () -> new BlockPilar(Blocks.BLACKSTONE));
	//                                        BLOCK_BLACKSTONE_COBBLE_BASIC
	//                                        SLABS_BLACKSTONE_COBBLE_BASIC
	//                                        STAIR_BLACKSTONE_COBBLE_BASIC
	//                                        WALLS_BLACKSTONE_COBBLE_BASIC
	public static final RegistryObject<Block> PILAR_BLACKSTONE_COBBLE_BASIC = registerBlock("pilar_blackstone_cobble_basic", () -> new BlockPilar(Blocks.BLACKSTONE));
	public static final RegistryObject<Block> BLOCK_BLACKSTONE_COBBLE_MOSSY = registerBlock("block_blackstone_cobble_mossy", () -> new BlockBlock(Blocks.BLACKSTONE));
	public static final RegistryObject<Block> SLABS_BLACKSTONE_COBBLE_MOSSY = registerBlock("slabs_blackstone_cobble_mossy", () -> new BlockSlabs(Blocks.BLACKSTONE));
	public static final RegistryObject<Block> STAIR_BLACKSTONE_COBBLE_MOSSY = registerBlock("stair_blackstone_cobble_mossy", () -> new BlockStair(Blocks.BLACKSTONE));
	public static final RegistryObject<Block> WALLS_BLACKSTONE_COBBLE_MOSSY = registerBlock("walls_blackstone_cobble_mossy", () -> new BlockWalls(Blocks.BLACKSTONE));
	public static final RegistryObject<Block> PILAR_BLACKSTONE_COBBLE_MOSSY = registerBlock("pilar_blackstone_cobble_mossy", () -> new BlockPilar(Blocks.BLACKSTONE));
	//                                        BLOCK_BLACKSTONE_BRICKS_BASIC
	//                                        SLABS_BLACKSTONE_BRICKS_BASIC
	//                                        STAIR_BLACKSTONE_BRICKS_BASIC
	//                                        WALLS_BLACKSTONE_BRICKS_BASIC
	public static final RegistryObject<Block> PILAR_BLACKSTONE_BRICKS_BASIC = registerBlock("pilar_blackstone_bricks_basic", () -> new BlockPilar(Blocks.BLACKSTONE));
	public static final RegistryObject<Block> BLOCK_BLACKSTONE_BRICKS_MOSSY = registerBlock("block_blackstone_bricks_mossy", () -> new BlockBlock(Blocks.BLACKSTONE));
	public static final RegistryObject<Block> SLABS_BLACKSTONE_BRICKS_MOSSY = registerBlock("slabs_blackstone_bricks_mossy", () -> new BlockSlabs(Blocks.BLACKSTONE));
	public static final RegistryObject<Block> STAIR_BLACKSTONE_BRICKS_MOSSY = registerBlock("stair_blackstone_bricks_mossy", () -> new BlockStair(Blocks.BLACKSTONE));
	public static final RegistryObject<Block> WALLS_BLACKSTONE_BRICKS_MOSSY = registerBlock("walls_blackstone_bricks_mossy", () -> new BlockWalls(Blocks.BLACKSTONE));
	public static final RegistryObject<Block> PILAR_BLACKSTONE_BRICKS_MOSSY = registerBlock("pilar_blackstone_bricks_mossy", () -> new BlockPilar(Blocks.BLACKSTONE));
	//                                        BLOCK_BLACKSTONE_BRICKS_CRACK
	public static final RegistryObject<Block> SLABS_BLACKSTONE_BRICKS_CRACK = registerBlock("slabs_blackstone_bricks_crack", () -> new BlockSlabs(Blocks.BLACKSTONE));
	public static final RegistryObject<Block> STAIR_BLACKSTONE_BRICKS_CRACK = registerBlock("stair_blackstone_bricks_crack", () -> new BlockStair(Blocks.BLACKSTONE));
	public static final RegistryObject<Block> WALLS_BLACKSTONE_BRICKS_CRACK = registerBlock("walls_blackstone_bricks_crack", () -> new BlockWalls(Blocks.BLACKSTONE));
	public static final RegistryObject<Block> PILAR_BLACKSTONE_BRICKS_CRACK = registerBlock("pilar_blackstone_bricks_crack", () -> new BlockPilar(Blocks.BLACKSTONE));
	//                                        BLOCK_BLACKSTONE_CARVED
	
	// ----- Deepslate ----- //
	//                                        BLOCK_DEEPSLATE_STONES
	public static final RegistryObject<Block> SLABS_DEEPSLATE_STONES       = registerBlock("slabs_deepslate_stones",       () -> new BlockSlabs(Blocks.DEEPSLATE));
	public static final RegistryObject<Block> STAIR_DEEPSLATE_STONES       = registerBlock("stair_deepslate_stones",       () -> new BlockStair(Blocks.DEEPSLATE));
	public static final RegistryObject<Block> WALLS_DEEPSLATE_STONES       = registerBlock("walls_deepslate_stones",       () -> new BlockWalls(Blocks.DEEPSLATE));
	public static final RegistryObject<Block> PILAR_DEEPSLATE_STONES       = registerBlock("pilar_deepslate_stones",       () -> new BlockPilar(Blocks.DEEPSLATE));
	//                                        BLOCK_DEEPSLATE_COBBLE_BASIC
	//                                        SLABS_DEEPSLATE_COBBLE_BASIC
	//                                        STAIR_DEEPSLATE_COBBLE_BASIC
	//                                        WALLS_DEEPSLATE_COBBLE_BASIC
	public static final RegistryObject<Block> PILAR_DEEPSLATE_COBBLE_BASIC = registerBlock("pilar_deepslate_cobble_basic", () -> new BlockPilar(Blocks.DEEPSLATE));
	public static final RegistryObject<Block> BLOCK_DEEPSLATE_COBBLE_MOSS  = registerBlock("block_deepslate_cobble_mossy", () -> new BlockBlock(Blocks.DEEPSLATE));
	public static final RegistryObject<Block> SLABS_DEEPSLATE_COBBLE_MOSS  = registerBlock("slabs_deepslate_cobble_mossy", () -> new BlockSlabs(Blocks.DEEPSLATE));
	public static final RegistryObject<Block> STAIR_DEEPSLATE_COBBLE_MOSS  = registerBlock("stair_deepslate_cobble_mossy", () -> new BlockStair(Blocks.DEEPSLATE));
	public static final RegistryObject<Block> WALLS_DEEPSLATE_COBBLE_MOSS  = registerBlock("walls_deepslate_cobble_mossy", () -> new BlockWalls(Blocks.DEEPSLATE));
	public static final RegistryObject<Block> PILAR_DEEPSLATE_COBBLE_MOSS  = registerBlock("pilar_deepslate_cobble_mossy", () -> new BlockPilar(Blocks.DEEPSLATE));
	//                                        BLOCK_DEEPSLATE_SMOOTH
	//                                        SLABS_DEEPSLATE_SMOOTH
	//                                        STAIR_DEEPSLATE_SMOOTH
	//                                        WALLS_DEEPSLATE_SMOOTH
	public static final RegistryObject<Block> PILAR_DEEPSLATE_SMOOTH       = registerBlock("pilar_deepslate_smooth",       () -> new BlockPilar(Blocks.DEEPSLATE));
	//                                        BLOCK_DEEPSLATE_BRICKS_BASIC
	//                                        SLABS_DEEPSLATE_BRICKS_BASIC
	//                                        STAIR_DEEPSLATE_BRICKS_BASIC
	//                                        WALLS_DEEPSLATE_BRICKS_BASIC
	public static final RegistryObject<Block> PILAR_DEEPSLATE_BRICKS_BASIC = registerBlock("pilar_deepslate_bricks_basic", () -> new BlockPilar(Blocks.DEEPSLATE));
	public static final RegistryObject<Block> BLOCK_DEEPSLATE_BRICKS_MOSSY = registerBlock("block_deepslate_bricks_mossy", () -> new BlockBlock(Blocks.DEEPSLATE));
	public static final RegistryObject<Block> SLABS_DEEPSLATE_BRICKS_MOSSY = registerBlock("slabs_deepslate_bricks_mossy", () -> new BlockSlabs(Blocks.DEEPSLATE));
	public static final RegistryObject<Block> STAIR_DEEPSLATE_BRICKS_MOSSY = registerBlock("stair_deepslate_bricks_mossy", () -> new BlockStair(Blocks.DEEPSLATE));
	public static final RegistryObject<Block> WALLS_DEEPSLATE_BRICKS_MOSSY = registerBlock("walls_deepslate_bricks_mossy", () -> new BlockWalls(Blocks.DEEPSLATE));
	public static final RegistryObject<Block> PILAR_DEEPSLATE_BRICKS_MOSSY = registerBlock("pilar_deepslate_bricks_mossy", () -> new BlockPilar(Blocks.DEEPSLATE));
	//                                        BLOCK_DEEPSLATE_BRICKS_CRACK
	public static final RegistryObject<Block> SLABS_DEEPSLATE_BRICKS_CRACK = registerBlock("slabs_deepslate_bricks_crack", () -> new BlockSlabs(Blocks.DEEPSLATE));
	public static final RegistryObject<Block> STAIR_DEEPSLATE_BRICKS_CRACK = registerBlock("stair_deepslate_bricks_crack", () -> new BlockStair(Blocks.DEEPSLATE));
	public static final RegistryObject<Block> WALLS_DEEPSLATE_BRICKS_CRACK = registerBlock("walls_deepslate_bricks_crack", () -> new BlockWalls(Blocks.DEEPSLATE));
	public static final RegistryObject<Block> PILAR_DEEPSLATE_BRICKS_CRACK = registerBlock("pilar_deepslate_bricks_crack", () -> new BlockPilar(Blocks.DEEPSLATE));
	//                                        BLOCK_DEEPSLATE_CARVED
	
	// ----- Concrete ----- //
	public static final RegistryObject<Block> SLABS_CONCRETE_WHITE      = registerBlock("slabs_concrete_white",      () -> new BlockSlabs(Blocks.WHITE_CONCRETE     ));
	public static final RegistryObject<Block> STAIR_CONCRETE_WHITE      = registerBlock("stair_concrete_white",      () -> new BlockStair(Blocks.WHITE_CONCRETE     ));
	public static final RegistryObject<Block> WALLS_CONCRETE_WHITE      = registerBlock("walls_concrete_white",      () -> new BlockWalls(Blocks.WHITE_CONCRETE     ));
	public static final RegistryObject<Block> PILAR_CONCRETE_WHITE      = registerBlock("pilar_concrete_white",      () -> new BlockPilar(Blocks.WHITE_CONCRETE     ));
	public static final RegistryObject<Block> SLABS_CONCRETE_ORANGE     = registerBlock("slabs_concrete_orange",     () -> new BlockSlabs(Blocks.ORANGE_CONCRETE    ));
	public static final RegistryObject<Block> STAIR_CONCRETE_ORANGE     = registerBlock("stair_concrete_orange",     () -> new BlockStair(Blocks.ORANGE_CONCRETE    ));
	public static final RegistryObject<Block> WALLS_CONCRETE_ORANGE     = registerBlock("walls_concrete_orange",     () -> new BlockWalls(Blocks.ORANGE_CONCRETE    ));
	public static final RegistryObject<Block> PILAR_CONCRETE_ORANGE     = registerBlock("pilar_concrete_orange",     () -> new BlockPilar(Blocks.ORANGE_CONCRETE    ));
	public static final RegistryObject<Block> SLABS_CONCRETE_MAGENTA    = registerBlock("slabs_concrete_magenta",    () -> new BlockSlabs(Blocks.MAGENTA_CONCRETE   ));
	public static final RegistryObject<Block> STAIR_CONCRETE_MAGENTA    = registerBlock("stair_concrete_magenta",    () -> new BlockStair(Blocks.MAGENTA_CONCRETE   ));
	public static final RegistryObject<Block> WALLS_CONCRETE_MAGENTA    = registerBlock("walls_concrete_magenta",    () -> new BlockWalls(Blocks.MAGENTA_CONCRETE   ));
	public static final RegistryObject<Block> PILAR_CONCRETE_MAGENTA    = registerBlock("pilar_concrete_magenta",    () -> new BlockPilar(Blocks.MAGENTA_CONCRETE   ));
	public static final RegistryObject<Block> SLABS_CONCRETE_LIGHT_BLUE = registerBlock("slabs_concrete_light_blue", () -> new BlockSlabs(Blocks.LIGHT_BLUE_CONCRETE));
	public static final RegistryObject<Block> STAIR_CONCRETE_LIGHT_BLUE = registerBlock("stair_concrete_light_blue", () -> new BlockStair(Blocks.LIGHT_BLUE_CONCRETE));
	public static final RegistryObject<Block> WALLS_CONCRETE_LIGHT_BLUE = registerBlock("walls_concrete_light_blue", () -> new BlockWalls(Blocks.LIGHT_BLUE_CONCRETE));
	public static final RegistryObject<Block> PILAR_CONCRETE_LIGHT_BLUE = registerBlock("pilar_concrete_light_blue", () -> new BlockPilar(Blocks.LIGHT_BLUE_CONCRETE));
	public static final RegistryObject<Block> SLABS_CONCRETE_YELLOW     = registerBlock("slabs_concrete_yellow",     () -> new BlockSlabs(Blocks.YELLOW_CONCRETE    ));
	public static final RegistryObject<Block> STAIR_CONCRETE_YELLOW     = registerBlock("stair_concrete_yellow",     () -> new BlockStair(Blocks.YELLOW_CONCRETE    ));
	public static final RegistryObject<Block> WALLS_CONCRETE_YELLOW     = registerBlock("walls_concrete_yellow",     () -> new BlockWalls(Blocks.YELLOW_CONCRETE    ));
	public static final RegistryObject<Block> PILAR_CONCRETE_YELLOW     = registerBlock("pilar_concrete_yellow",     () -> new BlockPilar(Blocks.YELLOW_CONCRETE    ));
	public static final RegistryObject<Block> SLABS_CONCRETE_LIME       = registerBlock("slabs_concrete_lime",       () -> new BlockSlabs(Blocks.LIME_CONCRETE      ));
	public static final RegistryObject<Block> STAIR_CONCRETE_LIME       = registerBlock("stair_concrete_lime",       () -> new BlockStair(Blocks.LIME_CONCRETE      ));
	public static final RegistryObject<Block> WALLS_CONCRETE_LIME       = registerBlock("walls_concrete_lime",       () -> new BlockWalls(Blocks.LIME_CONCRETE      ));
	public static final RegistryObject<Block> PILAR_CONCRETE_LIME       = registerBlock("pilar_concrete_lime",       () -> new BlockPilar(Blocks.LIME_CONCRETE      ));
	public static final RegistryObject<Block> SLABS_CONCRETE_PINK       = registerBlock("slabs_concrete_pink",       () -> new BlockSlabs(Blocks.PINK_CONCRETE      ));
	public static final RegistryObject<Block> STAIR_CONCRETE_PINK       = registerBlock("stair_concrete_pink",       () -> new BlockStair(Blocks.PINK_CONCRETE      ));
	public static final RegistryObject<Block> WALLS_CONCRETE_PINK       = registerBlock("walls_concrete_pink",       () -> new BlockWalls(Blocks.PINK_CONCRETE      ));
	public static final RegistryObject<Block> PILAR_CONCRETE_PINK       = registerBlock("pilar_concrete_pink",       () -> new BlockPilar(Blocks.PINK_CONCRETE      ));
	public static final RegistryObject<Block> SLABS_CONCRETE_GRAY       = registerBlock("slabs_concrete_gray",       () -> new BlockSlabs(Blocks.GRAY_CONCRETE      ));
	public static final RegistryObject<Block> STAIR_CONCRETE_GRAY       = registerBlock("stair_concrete_gray",       () -> new BlockStair(Blocks.GRAY_CONCRETE      ));
	public static final RegistryObject<Block> WALLS_CONCRETE_GRAY       = registerBlock("walls_concrete_gray",       () -> new BlockWalls(Blocks.GRAY_CONCRETE      ));
	public static final RegistryObject<Block> PILAR_CONCRETE_GRAY       = registerBlock("pilar_concrete_gray",       () -> new BlockPilar(Blocks.GRAY_CONCRETE      ));
	public static final RegistryObject<Block> SLABS_CONCRETE_LIGHT_GRAY = registerBlock("slabs_concrete_light_gray", () -> new BlockSlabs(Blocks.LIGHT_GRAY_CONCRETE));
	public static final RegistryObject<Block> STAIR_CONCRETE_LIGHT_GRAY = registerBlock("stair_concrete_light_gray", () -> new BlockStair(Blocks.LIGHT_GRAY_CONCRETE));
	public static final RegistryObject<Block> WALLS_CONCRETE_LIGHT_GRAY = registerBlock("walls_concrete_light_gray", () -> new BlockWalls(Blocks.LIGHT_GRAY_CONCRETE));
	public static final RegistryObject<Block> PILAR_CONCRETE_LIGHT_GRAY = registerBlock("pilar_concrete_light_gray", () -> new BlockPilar(Blocks.LIGHT_GRAY_CONCRETE));
	public static final RegistryObject<Block> SLABS_CONCRETE_CYAN       = registerBlock("slabs_concrete_cyan",       () -> new BlockSlabs(Blocks.CYAN_CONCRETE      ));
	public static final RegistryObject<Block> STAIR_CONCRETE_CYAN       = registerBlock("stair_concrete_cyan",       () -> new BlockStair(Blocks.CYAN_CONCRETE      ));
	public static final RegistryObject<Block> WALLS_CONCRETE_CYAN       = registerBlock("walls_concrete_cyan",       () -> new BlockWalls(Blocks.CYAN_CONCRETE      ));
	public static final RegistryObject<Block> PILAR_CONCRETE_CYAN       = registerBlock("pilar_concrete_cyan",       () -> new BlockPilar(Blocks.CYAN_CONCRETE      ));
	public static final RegistryObject<Block> SLABS_CONCRETE_PURPLE     = registerBlock("slabs_concrete_purple",     () -> new BlockSlabs(Blocks.PURPLE_CONCRETE    ));
	public static final RegistryObject<Block> STAIR_CONCRETE_PURPLE     = registerBlock("stair_concrete_purple",     () -> new BlockStair(Blocks.PURPLE_CONCRETE    ));
	public static final RegistryObject<Block> WALLS_CONCRETE_PURPLE     = registerBlock("walls_concrete_purple",     () -> new BlockWalls(Blocks.PURPLE_CONCRETE    ));
	public static final RegistryObject<Block> PILAR_CONCRETE_PURPLE     = registerBlock("pilar_concrete_purple",     () -> new BlockPilar(Blocks.PURPLE_CONCRETE    ));
	public static final RegistryObject<Block> SLABS_CONCRETE_BLUE       = registerBlock("slabs_concrete_blue",       () -> new BlockSlabs(Blocks.BLUE_CONCRETE      ));
	public static final RegistryObject<Block> STAIR_CONCRETE_BLUE       = registerBlock("stair_concrete_blue",       () -> new BlockStair(Blocks.BLUE_CONCRETE      ));
	public static final RegistryObject<Block> WALLS_CONCRETE_BLUE       = registerBlock("walls_concrete_blue",       () -> new BlockWalls(Blocks.BLUE_CONCRETE      ));
	public static final RegistryObject<Block> PILAR_CONCRETE_BLUE       = registerBlock("pilar_concrete_blue",       () -> new BlockPilar(Blocks.BLUE_CONCRETE      ));
	public static final RegistryObject<Block> SLABS_CONCRETE_BROWN      = registerBlock("slabs_concrete_brown",      () -> new BlockSlabs(Blocks.BROWN_CONCRETE     ));
	public static final RegistryObject<Block> STAIR_CONCRETE_BROWN      = registerBlock("stair_concrete_brown",      () -> new BlockStair(Blocks.BROWN_CONCRETE     ));
	public static final RegistryObject<Block> WALLS_CONCRETE_BROWN      = registerBlock("walls_concrete_brown",      () -> new BlockWalls(Blocks.BROWN_CONCRETE     ));
	public static final RegistryObject<Block> PILAR_CONCRETE_BROWN      = registerBlock("pilar_concrete_brown",      () -> new BlockPilar(Blocks.BROWN_CONCRETE     ));
	public static final RegistryObject<Block> SLABS_CONCRETE_GREEN      = registerBlock("slabs_concrete_green",      () -> new BlockSlabs(Blocks.GREEN_CONCRETE     ));
	public static final RegistryObject<Block> STAIR_CONCRETE_GREEN      = registerBlock("stair_concrete_green",      () -> new BlockStair(Blocks.GREEN_CONCRETE     ));
	public static final RegistryObject<Block> WALLS_CONCRETE_GREEN      = registerBlock("walls_concrete_green",      () -> new BlockWalls(Blocks.GREEN_CONCRETE     ));
	public static final RegistryObject<Block> PILAR_CONCRETE_GREEN      = registerBlock("pilar_concrete_green",      () -> new BlockPilar(Blocks.GREEN_CONCRETE     ));
	public static final RegistryObject<Block> SLABS_CONCRETE_RED        = registerBlock("slabs_concrete_red",        () -> new BlockSlabs(Blocks.RED_CONCRETE       ));
	public static final RegistryObject<Block> STAIR_CONCRETE_RED        = registerBlock("stair_concrete_red",        () -> new BlockStair(Blocks.RED_CONCRETE       ));
	public static final RegistryObject<Block> WALLS_CONCRETE_RED        = registerBlock("walls_concrete_red",        () -> new BlockWalls(Blocks.RED_CONCRETE       ));
	public static final RegistryObject<Block> PILAR_CONCRETE_RED        = registerBlock("pilar_concrete_red",        () -> new BlockPilar(Blocks.RED_CONCRETE       ));
	public static final RegistryObject<Block> SLABS_CONCRETE_BLACK      = registerBlock("slabs_concrete_black",      () -> new BlockSlabs(Blocks.BLACK_CONCRETE     ));
	public static final RegistryObject<Block> STAIR_CONCRETE_BLACK      = registerBlock("stair_concrete_black",      () -> new BlockStair(Blocks.BLACK_CONCRETE     ));
	public static final RegistryObject<Block> WALLS_CONCRETE_BLACK      = registerBlock("walls_concrete_black",      () -> new BlockWalls(Blocks.BLACK_CONCRETE     ));
	public static final RegistryObject<Block> PILAR_CONCRETE_BLACK      = registerBlock("pilar_concrete_black",      () -> new BlockPilar(Blocks.BLACK_CONCRETE     ));
	
	// ----- Tomber Frames ----- //
	public static final RegistryObject<Block> TIMBER_BASIC_WHITE           = registerBlock("timber_basic_white",           () -> new BlockBlock(Blocks.WHITE_TERRACOTTA     ));
	public static final RegistryObject<Block> TIMBER_BASIC_ORANGE          = registerBlock("timber_basic_orange",          () -> new BlockBlock(Blocks.ORANGE_TERRACOTTA    ));
	public static final RegistryObject<Block> TIMBER_BASIC_MAGENTA         = registerBlock("timber_basic_magenta",         () -> new BlockBlock(Blocks.MAGENTA_TERRACOTTA   ));
	public static final RegistryObject<Block> TIMBER_BASIC_LIGHT_BLUE      = registerBlock("timber_basic_light_blue",      () -> new BlockBlock(Blocks.LIGHT_BLUE_TERRACOTTA));
	public static final RegistryObject<Block> TIMBER_BASIC_YELLOW          = registerBlock("timber_basic_yellow",          () -> new BlockBlock(Blocks.YELLOW_TERRACOTTA    ));
	public static final RegistryObject<Block> TIMBER_BASIC_LIME            = registerBlock("timber_basic_lime",            () -> new BlockBlock(Blocks.LIME_TERRACOTTA      ));
	public static final RegistryObject<Block> TIMBER_BASIC_PINK            = registerBlock("timber_basic_pink",            () -> new BlockBlock(Blocks.PINK_TERRACOTTA      ));
	public static final RegistryObject<Block> TIMBER_BASIC_GRAY            = registerBlock("timber_basic_gray",            () -> new BlockBlock(Blocks.GRAY_TERRACOTTA      ));
	public static final RegistryObject<Block> TIMBER_BASIC_LIGHT_GRAY      = registerBlock("timber_basic_light_gray",      () -> new BlockBlock(Blocks.LIGHT_GRAY_TERRACOTTA));
	public static final RegistryObject<Block> TIMBER_BASIC_CYAN            = registerBlock("timber_basic_cyan",            () -> new BlockBlock(Blocks.CYAN_TERRACOTTA      ));
	public static final RegistryObject<Block> TIMBER_BASIC_PURPLE          = registerBlock("timber_basic_purple",          () -> new BlockBlock(Blocks.PURPLE_TERRACOTTA    ));
	public static final RegistryObject<Block> TIMBER_BASIC_BLUE            = registerBlock("timber_basic_blue",            () -> new BlockBlock(Blocks.BLUE_TERRACOTTA      ));
	public static final RegistryObject<Block> TIMBER_BASIC_BROWN           = registerBlock("timber_basic_brown",           () -> new BlockBlock(Blocks.BROWN_TERRACOTTA     ));
	public static final RegistryObject<Block> TIMBER_BASIC_GREEN           = registerBlock("timber_basic_green",           () -> new BlockBlock(Blocks.GREEN_TERRACOTTA     ));
	public static final RegistryObject<Block> TIMBER_BASIC_RED             = registerBlock("timber_basic_red",             () -> new BlockBlock(Blocks.RED_TERRACOTTA       ));
	public static final RegistryObject<Block> TIMBER_BASIC_BLACK           = registerBlock("timber_basic_black",           () -> new BlockBlock(Blocks.BLACK_TERRACOTTA     ));
	public static final RegistryObject<Block> TIMBER_HORIZONTAL_WHITE      = registerBlock("timber_horizontal_white",      () -> new BlockBlock(Blocks.WHITE_TERRACOTTA     ));
	public static final RegistryObject<Block> TIMBER_HORIZONTAL_ORANGE     = registerBlock("timber_horizontal_orange",     () -> new BlockBlock(Blocks.ORANGE_TERRACOTTA    ));
	public static final RegistryObject<Block> TIMBER_HORIZONTAL_MAGENTA    = registerBlock("timber_horizontal_magenta",    () -> new BlockBlock(Blocks.MAGENTA_TERRACOTTA   ));
	public static final RegistryObject<Block> TIMBER_HORIZONTAL_LIGHT_BLUE = registerBlock("timber_horizontal_light_blue", () -> new BlockBlock(Blocks.LIGHT_BLUE_TERRACOTTA));
	public static final RegistryObject<Block> TIMBER_HORIZONTAL_YELLOW     = registerBlock("timber_horizontal_yellow",     () -> new BlockBlock(Blocks.YELLOW_TERRACOTTA    ));
	public static final RegistryObject<Block> TIMBER_HORIZONTAL_LIME       = registerBlock("timber_horizontal_lime",       () -> new BlockBlock(Blocks.LIME_TERRACOTTA      ));
	public static final RegistryObject<Block> TIMBER_HORIZONTAL_PINK       = registerBlock("timber_horizontal_pink",       () -> new BlockBlock(Blocks.PINK_TERRACOTTA      ));
	public static final RegistryObject<Block> TIMBER_HORIZONTAL_GRAY       = registerBlock("timber_horizontal_gray",       () -> new BlockBlock(Blocks.GRAY_TERRACOTTA      ));
	public static final RegistryObject<Block> TIMBER_HORIZONTAL_LIGHT_GRAY = registerBlock("timber_horizontal_light_gray", () -> new BlockBlock(Blocks.LIGHT_GRAY_TERRACOTTA));
	public static final RegistryObject<Block> TIMBER_HORIZONTAL_CYAN       = registerBlock("timber_horizontal_cyan",       () -> new BlockBlock(Blocks.CYAN_TERRACOTTA      ));
	public static final RegistryObject<Block> TIMBER_HORIZONTAL_PURPLE     = registerBlock("timber_horizontal_purple",     () -> new BlockBlock(Blocks.PURPLE_TERRACOTTA    ));
	public static final RegistryObject<Block> TIMBER_HORIZONTAL_BLUE       = registerBlock("timber_horizontal_blue",       () -> new BlockBlock(Blocks.BLUE_TERRACOTTA      ));
	public static final RegistryObject<Block> TIMBER_HORIZONTAL_BROWN      = registerBlock("timber_horizontal_brown",      () -> new BlockBlock(Blocks.BROWN_TERRACOTTA     ));
	public static final RegistryObject<Block> TIMBER_HORIZONTAL_GREEN      = registerBlock("timber_horizontal_green",      () -> new BlockBlock(Blocks.GREEN_TERRACOTTA     ));
	public static final RegistryObject<Block> TIMBER_HORIZONTAL_RED        = registerBlock("timber_horizontal_red",        () -> new BlockBlock(Blocks.RED_TERRACOTTA       ));
	public static final RegistryObject<Block> TIMBER_HORIZONTAL_BLACK      = registerBlock("timber_horizontal_black",      () -> new BlockBlock(Blocks.BLACK_TERRACOTTA     ));
	public static final RegistryObject<Block> TIMBER_VERTICAL_WHITE        = registerBlock("timber_vertical_white",        () -> new BlockBlock(Blocks.WHITE_TERRACOTTA     ));
	public static final RegistryObject<Block> TIMBER_VERTICAL_ORANGE       = registerBlock("timber_vertical_orange",       () -> new BlockBlock(Blocks.ORANGE_TERRACOTTA    ));
	public static final RegistryObject<Block> TIMBER_VERTICAL_MAGENTA      = registerBlock("timber_vertical_magenta",      () -> new BlockBlock(Blocks.MAGENTA_TERRACOTTA   ));
	public static final RegistryObject<Block> TIMBER_VERTICAL_LIGHT_BLUE   = registerBlock("timber_vertical_light_blue",   () -> new BlockBlock(Blocks.LIGHT_BLUE_TERRACOTTA));
	public static final RegistryObject<Block> TIMBER_VERTICAL_YELLOW       = registerBlock("timber_vertical_yellow",       () -> new BlockBlock(Blocks.YELLOW_TERRACOTTA    ));
	public static final RegistryObject<Block> TIMBER_VERTICAL_LIME         = registerBlock("timber_vertical_lime",         () -> new BlockBlock(Blocks.LIME_TERRACOTTA      ));
	public static final RegistryObject<Block> TIMBER_VERTICAL_PINK         = registerBlock("timber_vertical_pink",         () -> new BlockBlock(Blocks.PINK_TERRACOTTA      ));
	public static final RegistryObject<Block> TIMBER_VERTICAL_GRAY         = registerBlock("timber_vertical_gray",         () -> new BlockBlock(Blocks.GRAY_TERRACOTTA      ));
	public static final RegistryObject<Block> TIMBER_VERTICAL_LIGHT_GRAY   = registerBlock("timber_vertical_light_gray",   () -> new BlockBlock(Blocks.LIGHT_GRAY_TERRACOTTA));
	public static final RegistryObject<Block> TIMBER_VERTICAL_CYAN         = registerBlock("timber_vertical_cyan",         () -> new BlockBlock(Blocks.CYAN_TERRACOTTA      ));
	public static final RegistryObject<Block> TIMBER_VERTICAL_PURPLE       = registerBlock("timber_vertical_purple",       () -> new BlockBlock(Blocks.PURPLE_TERRACOTTA    ));
	public static final RegistryObject<Block> TIMBER_VERTICAL_BLUE         = registerBlock("timber_vertical_blue",         () -> new BlockBlock(Blocks.BLUE_TERRACOTTA      ));
	public static final RegistryObject<Block> TIMBER_VERTICAL_BROWN        = registerBlock("timber_vertical_brown",        () -> new BlockBlock(Blocks.BROWN_TERRACOTTA     ));
	public static final RegistryObject<Block> TIMBER_VERTICAL_GREEN        = registerBlock("timber_vertical_green",        () -> new BlockBlock(Blocks.GREEN_TERRACOTTA     ));
	public static final RegistryObject<Block> TIMBER_VERTICAL_RED          = registerBlock("timber_vertical_red",          () -> new BlockBlock(Blocks.RED_TERRACOTTA       ));
	public static final RegistryObject<Block> TIMBER_VERTICAL_BLACK        = registerBlock("timber_vertical_black",        () -> new BlockBlock(Blocks.BLACK_TERRACOTTA     ));
	public static final RegistryObject<Block> TIMBER_PLUS_WHITE            = registerBlock("timber_plus_white",            () -> new BlockBlock(Blocks.WHITE_TERRACOTTA     ));
	public static final RegistryObject<Block> TIMBER_PLUS_ORANGE           = registerBlock("timber_plus_orange",           () -> new BlockBlock(Blocks.ORANGE_TERRACOTTA    ));
	public static final RegistryObject<Block> TIMBER_PLUS_MAGENTA          = registerBlock("timber_plus_magenta",          () -> new BlockBlock(Blocks.MAGENTA_TERRACOTTA   ));
	public static final RegistryObject<Block> TIMBER_PLUS_LIGHT_BLUE       = registerBlock("timber_plus_light_blue",       () -> new BlockBlock(Blocks.LIGHT_BLUE_TERRACOTTA));
	public static final RegistryObject<Block> TIMBER_PLUS_YELLOW           = registerBlock("timber_plus_yellow",           () -> new BlockBlock(Blocks.YELLOW_TERRACOTTA    ));
	public static final RegistryObject<Block> TIMBER_PLUS_LIME             = registerBlock("timber_plus_lime",             () -> new BlockBlock(Blocks.LIME_TERRACOTTA      ));
	public static final RegistryObject<Block> TIMBER_PLUS_PINK             = registerBlock("timber_plus_pink",             () -> new BlockBlock(Blocks.PINK_TERRACOTTA      ));
	public static final RegistryObject<Block> TIMBER_PLUS_GRAY             = registerBlock("timber_plus_gray",             () -> new BlockBlock(Blocks.GRAY_TERRACOTTA      ));
	public static final RegistryObject<Block> TIMBER_PLUS_LIGHT_GRAY       = registerBlock("timber_plus_light_gray",       () -> new BlockBlock(Blocks.LIGHT_GRAY_TERRACOTTA));
	public static final RegistryObject<Block> TIMBER_PLUS_CYAN             = registerBlock("timber_plus_cyan",             () -> new BlockBlock(Blocks.CYAN_TERRACOTTA      ));
	public static final RegistryObject<Block> TIMBER_PLUS_PURPLE           = registerBlock("timber_plus_purple",           () -> new BlockBlock(Blocks.PURPLE_TERRACOTTA    ));
	public static final RegistryObject<Block> TIMBER_PLUS_BLUE             = registerBlock("timber_plus_blue",             () -> new BlockBlock(Blocks.BLUE_TERRACOTTA      ));
	public static final RegistryObject<Block> TIMBER_PLUS_BROWN            = registerBlock("timber_plus_brown",            () -> new BlockBlock(Blocks.BROWN_TERRACOTTA     ));
	public static final RegistryObject<Block> TIMBER_PLUS_GREEN            = registerBlock("timber_plus_green",            () -> new BlockBlock(Blocks.GREEN_TERRACOTTA     ));
	public static final RegistryObject<Block> TIMBER_PLUS_RED              = registerBlock("timber_plus_red",              () -> new BlockBlock(Blocks.RED_TERRACOTTA       ));
	public static final RegistryObject<Block> TIMBER_PLUS_BLACK            = registerBlock("timber_plus_black",            () -> new BlockBlock(Blocks.BLACK_TERRACOTTA     ));
	public static final RegistryObject<Block> TIMBER_DIAG_LEFT_WHITE       = registerBlock("timber_diag_left_white",       () -> new BlockBlock(Blocks.WHITE_TERRACOTTA     ));
	public static final RegistryObject<Block> TIMBER_DIAG_LEFT_ORANGE      = registerBlock("timber_diag_left_orange",      () -> new BlockBlock(Blocks.ORANGE_TERRACOTTA    ));
	public static final RegistryObject<Block> TIMBER_DIAG_LEFT_MAGENTA     = registerBlock("timber_diag_left_magenta",     () -> new BlockBlock(Blocks.MAGENTA_TERRACOTTA   ));
	public static final RegistryObject<Block> TIMBER_DIAG_LEFT_LIGHT_BLUE  = registerBlock("timber_diag_left_light_blue",  () -> new BlockBlock(Blocks.LIGHT_BLUE_TERRACOTTA));
	public static final RegistryObject<Block> TIMBER_DIAG_LEFT_YELLOW      = registerBlock("timber_diag_left_yellow",      () -> new BlockBlock(Blocks.YELLOW_TERRACOTTA    ));
	public static final RegistryObject<Block> TIMBER_DIAG_LEFT_LIME        = registerBlock("timber_diag_left_lime",        () -> new BlockBlock(Blocks.LIME_TERRACOTTA      ));
	public static final RegistryObject<Block> TIMBER_DIAG_LEFT_PINK        = registerBlock("timber_diag_left_pink",        () -> new BlockBlock(Blocks.PINK_TERRACOTTA      ));
	public static final RegistryObject<Block> TIMBER_DIAG_LEFT_GRAY        = registerBlock("timber_diag_left_gray",        () -> new BlockBlock(Blocks.GRAY_TERRACOTTA      ));
	public static final RegistryObject<Block> TIMBER_DIAG_LEFT_LIGHT_GRAY  = registerBlock("timber_diag_left_light_gray",  () -> new BlockBlock(Blocks.LIGHT_GRAY_TERRACOTTA));
	public static final RegistryObject<Block> TIMBER_DIAG_LEFT_CYAN        = registerBlock("timber_diag_left_cyan",        () -> new BlockBlock(Blocks.CYAN_TERRACOTTA      ));
	public static final RegistryObject<Block> TIMBER_DIAG_LEFT_PURPLE      = registerBlock("timber_diag_left_purple",      () -> new BlockBlock(Blocks.PURPLE_TERRACOTTA    ));
	public static final RegistryObject<Block> TIMBER_DIAG_LEFT_BLUE        = registerBlock("timber_diag_left_blue",        () -> new BlockBlock(Blocks.BLUE_TERRACOTTA      ));
	public static final RegistryObject<Block> TIMBER_DIAG_LEFT_BROWN       = registerBlock("timber_diag_left_brown",       () -> new BlockBlock(Blocks.BROWN_TERRACOTTA     ));
	public static final RegistryObject<Block> TIMBER_DIAG_LEFT_GREEN       = registerBlock("timber_diag_left_green",       () -> new BlockBlock(Blocks.GREEN_TERRACOTTA     ));
	public static final RegistryObject<Block> TIMBER_DIAG_LEFT_RED         = registerBlock("timber_diag_left_red",         () -> new BlockBlock(Blocks.RED_TERRACOTTA       ));
	public static final RegistryObject<Block> TIMBER_DIAG_LEFT_BLACK       = registerBlock("timber_diag_left_black",       () -> new BlockBlock(Blocks.BLACK_TERRACOTTA     ));
	public static final RegistryObject<Block> TIMBER_DIAG_RIGHT_WHITE      = registerBlock("timber_diag_right_white",      () -> new BlockBlock(Blocks.WHITE_TERRACOTTA     ));
	public static final RegistryObject<Block> TIMBER_DIAG_RIGHT_ORANGE     = registerBlock("timber_diag_right_orange",     () -> new BlockBlock(Blocks.ORANGE_TERRACOTTA    ));
	public static final RegistryObject<Block> TIMBER_DIAG_RIGHT_MAGENTA    = registerBlock("timber_diag_right_magenta",    () -> new BlockBlock(Blocks.MAGENTA_TERRACOTTA   ));
	public static final RegistryObject<Block> TIMBER_DIAG_RIGHT_LIGHT_BLUE = registerBlock("timber_diag_right_light_blue", () -> new BlockBlock(Blocks.LIGHT_BLUE_TERRACOTTA));
	public static final RegistryObject<Block> TIMBER_DIAG_RIGHT_YELLOW     = registerBlock("timber_diag_right_yellow",     () -> new BlockBlock(Blocks.YELLOW_TERRACOTTA    ));
	public static final RegistryObject<Block> TIMBER_DIAG_RIGHT_LIME       = registerBlock("timber_diag_right_lime",       () -> new BlockBlock(Blocks.LIME_TERRACOTTA      ));
	public static final RegistryObject<Block> TIMBER_DIAG_RIGHT_PINK       = registerBlock("timber_diag_right_pink",       () -> new BlockBlock(Blocks.PINK_TERRACOTTA      ));
	public static final RegistryObject<Block> TIMBER_DIAG_RIGHT_GRAY       = registerBlock("timber_diag_right_gray",       () -> new BlockBlock(Blocks.GRAY_TERRACOTTA      ));
	public static final RegistryObject<Block> TIMBER_DIAG_RIGHT_LIGHT_GRAY = registerBlock("timber_diag_right_light_gray", () -> new BlockBlock(Blocks.LIGHT_GRAY_TERRACOTTA));
	public static final RegistryObject<Block> TIMBER_DIAG_RIGHT_CYAN       = registerBlock("timber_diag_right_cyan",       () -> new BlockBlock(Blocks.CYAN_TERRACOTTA      ));
	public static final RegistryObject<Block> TIMBER_DIAG_RIGHT_PURPLE     = registerBlock("timber_diag_right_purple",     () -> new BlockBlock(Blocks.PURPLE_TERRACOTTA    ));
	public static final RegistryObject<Block> TIMBER_DIAG_RIGHT_BLUE       = registerBlock("timber_diag_right_blue",       () -> new BlockBlock(Blocks.BLUE_TERRACOTTA      ));
	public static final RegistryObject<Block> TIMBER_DIAG_RIGHT_BROWN      = registerBlock("timber_diag_right_brown",      () -> new BlockBlock(Blocks.BROWN_TERRACOTTA     ));
	public static final RegistryObject<Block> TIMBER_DIAG_RIGHT_GREEN      = registerBlock("timber_diag_right_green",      () -> new BlockBlock(Blocks.GREEN_TERRACOTTA     ));
	public static final RegistryObject<Block> TIMBER_DIAG_RIGHT_RED        = registerBlock("timber_diag_right_red",        () -> new BlockBlock(Blocks.RED_TERRACOTTA       ));
	public static final RegistryObject<Block> TIMBER_DIAG_RIGHT_BLACK      = registerBlock("timber_diag_right_black",      () -> new BlockBlock(Blocks.BLACK_TERRACOTTA     ));
	public static final RegistryObject<Block> TIMBER_CROSS_WHITE           = registerBlock("timber_cross_white",           () -> new BlockBlock(Blocks.WHITE_TERRACOTTA     ));
	public static final RegistryObject<Block> TIMBER_CROSS_ORANGE          = registerBlock("timber_cross_orange",          () -> new BlockBlock(Blocks.ORANGE_TERRACOTTA    ));
	public static final RegistryObject<Block> TIMBER_CROSS_MAGENTA         = registerBlock("timber_cross_magenta",         () -> new BlockBlock(Blocks.MAGENTA_TERRACOTTA   ));
	public static final RegistryObject<Block> TIMBER_CROSS_LIGHT_BLUE      = registerBlock("timber_cross_light_blue",      () -> new BlockBlock(Blocks.LIGHT_BLUE_TERRACOTTA));
	public static final RegistryObject<Block> TIMBER_CROSS_YELLOW          = registerBlock("timber_cross_yellow",          () -> new BlockBlock(Blocks.YELLOW_TERRACOTTA    ));
	public static final RegistryObject<Block> TIMBER_CROSS_LIME            = registerBlock("timber_cross_lime",            () -> new BlockBlock(Blocks.LIME_TERRACOTTA      ));
	public static final RegistryObject<Block> TIMBER_CROSS_PINK            = registerBlock("timber_cross_pink",            () -> new BlockBlock(Blocks.PINK_TERRACOTTA      ));
	public static final RegistryObject<Block> TIMBER_CROSS_GRAY            = registerBlock("timber_cross_gray",            () -> new BlockBlock(Blocks.GRAY_TERRACOTTA      ));
	public static final RegistryObject<Block> TIMBER_CROSS_LIGHT_GRAY      = registerBlock("timber_cross_light_gray",      () -> new BlockBlock(Blocks.LIGHT_GRAY_TERRACOTTA));
	public static final RegistryObject<Block> TIMBER_CROSS_CYAN            = registerBlock("timber_cross_cyan",            () -> new BlockBlock(Blocks.CYAN_TERRACOTTA      ));
	public static final RegistryObject<Block> TIMBER_CROSS_PURPLE          = registerBlock("timber_cross_purple",          () -> new BlockBlock(Blocks.PURPLE_TERRACOTTA    ));
	public static final RegistryObject<Block> TIMBER_CROSS_BLUE            = registerBlock("timber_cross_blue",            () -> new BlockBlock(Blocks.BLUE_TERRACOTTA      ));
	public static final RegistryObject<Block> TIMBER_CROSS_BROWN           = registerBlock("timber_cross_brown",           () -> new BlockBlock(Blocks.BROWN_TERRACOTTA     ));
	public static final RegistryObject<Block> TIMBER_CROSS_GREEN           = registerBlock("timber_cross_green",           () -> new BlockBlock(Blocks.GREEN_TERRACOTTA     ));
	public static final RegistryObject<Block> TIMBER_CROSS_RED             = registerBlock("timber_cross_red",             () -> new BlockBlock(Blocks.RED_TERRACOTTA       ));
	public static final RegistryObject<Block> TIMBER_CROSS_BLACK           = registerBlock("timber_cross_black",           () -> new BlockBlock(Blocks.BLACK_TERRACOTTA     ));
	
	// ----- Other Blocks ----- //
	public static final RegistryObject<Block> BLOCK_SCAFFOLDING = registerBlock("timber_scaffolding", () -> new BlockScaffolding(Blocks.OAK_PLANKS));
	
	// ----- Chain Blocks ----- //
	public static final RegistryObject<Block> BLOCK_CHAIN_COPPER     = registerBlock("block_chain_copper",     () -> new BlockChain(Blocks.COPPER_BLOCK));
	public static final RegistryObject<Block> BLOCK_CHAIN_IRON       = registerBlock("block_chain_iron",       () -> new BlockChain(Blocks.IRON_BLOCK  ));
	public static final RegistryObject<Block> BLOCK_CHAIN_GOLD       = registerBlock("block_chain_gold",       () -> new BlockChain(Blocks.GOLD_BLOCK  ));
	public static final RegistryObject<Block> BLOCK_CHAIN_TIN        = registerBlock("block_chain_tin",        () -> new BlockChain(Blocks.GOLD_BLOCK  ));
	public static final RegistryObject<Block> BLOCK_CHAIN_BRONZE     = registerBlock("block_chain_bronze",     () -> new BlockChain(Blocks.GOLD_BLOCK  ));
	public static final RegistryObject<Block> BLOCK_CHAIN_MYTHRIL    = registerBlock("block_chain_mythril",    () -> new BlockChain(Blocks.GOLD_BLOCK  ));
	public static final RegistryObject<Block> BLOCK_CHAIN_ORICHALCUM = registerBlock("block_chain_orichalcum", () -> new BlockChain(Blocks.GOLD_BLOCK  ));
	public static final RegistryObject<Block> BLOCK_CHAIN_ADAMANTIUM = registerBlock("block_chain_adamantium", () -> new BlockChain(Blocks.GOLD_BLOCK  ));
	public static final RegistryObject<Block> BLOCK_CHAIN_GILIUM     = registerBlock("block_chain_gilium",     () -> new BlockChain(Blocks.GOLD_BLOCK  ));
	
	// ----- Gargoyle - Dog ----- //
	public static final RegistryObject<Block> STATUE_DOG_STONE      = registerBlock("statue_dog_stone",      () -> new BlockGargoyle(Blocks.STONE     ));
	public static final RegistryObject<Block> STATUE_DOG_GRANITE    = registerBlock("statue_dog_granite",    () -> new BlockGargoyle(Blocks.GRANITE   ));
	public static final RegistryObject<Block> STATUE_DOG_DIORITE    = registerBlock("statue_dog_diorite",    () -> new BlockGargoyle(Blocks.DIORITE   ));
	public static final RegistryObject<Block> STATUE_DOG_ANDESITE   = registerBlock("statue_dog_andesite",   () -> new BlockGargoyle(Blocks.ANDESITE  ));
	public static final RegistryObject<Block> STATUE_DOG_ENDSTONE   = registerBlock("statue_dog_endstone",   () -> new BlockGargoyle(Blocks.END_STONE ));
	public static final RegistryObject<Block> STATUE_DOG_BLACKSTONE = registerBlock("statue_dog_blackstone", () -> new BlockGargoyle(Blocks.BLACKSTONE));
	public static final RegistryObject<Block> STATUE_DOG_DEEPSLATE  = registerBlock("statue_dog_deepslate",  () -> new BlockGargoyle(Blocks.DEEPSLATE ));
	
	// ----- Gargoyle - Chicken ----- //
	public static final RegistryObject<Block> STATUE_CHICKEN_STONE      = registerBlock("statue_chicken_stone",      () -> new BlockGargoyle(Blocks.STONE     ));
	public static final RegistryObject<Block> STATUE_CHICKEN_GRANITE    = registerBlock("statue_chicken_granite",    () -> new BlockGargoyle(Blocks.GRANITE   ));
	public static final RegistryObject<Block> STATUE_CHICKEN_DIORITE    = registerBlock("statue_chicken_diorite",    () -> new BlockGargoyle(Blocks.DIORITE   ));
	public static final RegistryObject<Block> STATUE_CHICKEN_ANDESITE   = registerBlock("statue_chicken_andesite",   () -> new BlockGargoyle(Blocks.ANDESITE  ));
	public static final RegistryObject<Block> STATUE_CHICKEN_ENDSTONE   = registerBlock("statue_chicken_endstone",   () -> new BlockGargoyle(Blocks.END_STONE ));
	public static final RegistryObject<Block> STATUE_CHICKEN_BLACKSTONE = registerBlock("statue_chicken_blackstone", () -> new BlockGargoyle(Blocks.BLACKSTONE));
	public static final RegistryObject<Block> STATUE_CHICKEN_DEEPSLATE  = registerBlock("statue_chicken_deepslate",  () -> new BlockGargoyle(Blocks.DEEPSLATE ));
	
	// ----- Emitter ----- //
	public static final RegistryObject<Block> BLOCK_EMITTER_WHITE      = registerBlock("block_emitter_white",      () -> new BlockEmitter(Blocks.OBSERVER));
	public static final RegistryObject<Block> BLOCK_EMITTER_ORANGE     = registerBlock("block_emitter_orange",     () -> new BlockEmitter(Blocks.OBSERVER));
	public static final RegistryObject<Block> BLOCK_EMITTER_MAGENTA    = registerBlock("block_emitter_magenta",    () -> new BlockEmitter(Blocks.OBSERVER));
	public static final RegistryObject<Block> BLOCK_EMITTER_LIGHT_BLUE = registerBlock("block_emitter_light_blue", () -> new BlockEmitter(Blocks.OBSERVER));
	public static final RegistryObject<Block> BLOCK_EMITTER_YELLOW     = registerBlock("block_emitter_yellow",     () -> new BlockEmitter(Blocks.OBSERVER));
	public static final RegistryObject<Block> BLOCK_EMITTER_LIME       = registerBlock("block_emitter_lime",       () -> new BlockEmitter(Blocks.OBSERVER));
	public static final RegistryObject<Block> BLOCK_EMITTER_PINK       = registerBlock("block_emitter_pink",       () -> new BlockEmitter(Blocks.OBSERVER));
	public static final RegistryObject<Block> BLOCK_EMITTER_GRAY       = registerBlock("block_emitter_gray",       () -> new BlockEmitter(Blocks.OBSERVER));
	public static final RegistryObject<Block> BLOCK_EMITTER_LIGHT_GRAY = registerBlock("block_emitter_light_gray", () -> new BlockEmitter(Blocks.OBSERVER));
	public static final RegistryObject<Block> BLOCK_EMITTER_CYAN       = registerBlock("block_emitter_cyan",       () -> new BlockEmitter(Blocks.OBSERVER));
	public static final RegistryObject<Block> BLOCK_EMITTER_PURPLE     = registerBlock("block_emitter_purple",     () -> new BlockEmitter(Blocks.OBSERVER));
	public static final RegistryObject<Block> BLOCK_EMITTER_BLUE       = registerBlock("block_emitter_blue",       () -> new BlockEmitter(Blocks.OBSERVER));
	public static final RegistryObject<Block> BLOCK_EMITTER_BROWN      = registerBlock("block_emitter_brown",      () -> new BlockEmitter(Blocks.OBSERVER));
	public static final RegistryObject<Block> BLOCK_EMITTER_GREEN      = registerBlock("block_emitter_green",      () -> new BlockEmitter(Blocks.OBSERVER));
	public static final RegistryObject<Block> BLOCK_EMITTER_RED        = registerBlock("block_emitter_red",        () -> new BlockEmitter(Blocks.OBSERVER));
	public static final RegistryObject<Block> BLOCK_EMITTER_BLACK      = registerBlock("block_emitter_black",      () -> new BlockEmitter(Blocks.OBSERVER));
	
	// ----- Light Blocks ----- //
	public static final RegistryObject<Block> BLOCK_LIGHT_WHITE      = registerBlock("block_light_white",      () -> new BlockLight(Blocks.WHITE_STAINED_GLASS,      DyeColor.WHITE)     , false);
	public static final RegistryObject<Block> BLOCK_LIGHT_ORANGE     = registerBlock("block_light_orange",     () -> new BlockLight(Blocks.ORANGE_STAINED_GLASS,     DyeColor.ORANGE)    , false);
	public static final RegistryObject<Block> BLOCK_LIGHT_MAGENTA    = registerBlock("block_light_magenta",    () -> new BlockLight(Blocks.MAGENTA_STAINED_GLASS,    DyeColor.MAGENTA)   , false);
	public static final RegistryObject<Block> BLOCK_LIGHT_LIGHT_BLUE = registerBlock("block_light_light_blue", () -> new BlockLight(Blocks.LIGHT_BLUE_STAINED_GLASS, DyeColor.LIGHT_BLUE), false);
	public static final RegistryObject<Block> BLOCK_LIGHT_YELLOW     = registerBlock("block_light_yellow",     () -> new BlockLight(Blocks.YELLOW_STAINED_GLASS,     DyeColor.YELLOW)    , false);
	public static final RegistryObject<Block> BLOCK_LIGHT_LIME       = registerBlock("block_light_lime",       () -> new BlockLight(Blocks.LIME_STAINED_GLASS,       DyeColor.LIME)      , false);
	public static final RegistryObject<Block> BLOCK_LIGHT_PINK       = registerBlock("block_light_pink",       () -> new BlockLight(Blocks.PINK_STAINED_GLASS,       DyeColor.PINK)      , false);
	public static final RegistryObject<Block> BLOCK_LIGHT_GRAY       = registerBlock("block_light_gray",       () -> new BlockLight(Blocks.GRAY_STAINED_GLASS,       DyeColor.GRAY)      , false);
	public static final RegistryObject<Block> BLOCK_LIGHT_LIGHT_GRAY = registerBlock("block_light_light_gray", () -> new BlockLight(Blocks.LIGHT_GRAY_STAINED_GLASS, DyeColor.LIGHT_GRAY), false);
	public static final RegistryObject<Block> BLOCK_LIGHT_CYAN       = registerBlock("block_light_cyan",       () -> new BlockLight(Blocks.CYAN_STAINED_GLASS,       DyeColor.CYAN)      , false);
	public static final RegistryObject<Block> BLOCK_LIGHT_PURPLE     = registerBlock("block_light_purple",     () -> new BlockLight(Blocks.PURPLE_STAINED_GLASS,     DyeColor.PURPLE)    , false);
	public static final RegistryObject<Block> BLOCK_LIGHT_BLUE       = registerBlock("block_light_blue",       () -> new BlockLight(Blocks.BLUE_STAINED_GLASS,       DyeColor.BLUE)      , false);
	public static final RegistryObject<Block> BLOCK_LIGHT_BROWN      = registerBlock("block_light_brown",      () -> new BlockLight(Blocks.BROWN_STAINED_GLASS,      DyeColor.BROWN)     , false);
	public static final RegistryObject<Block> BLOCK_LIGHT_GREEN      = registerBlock("block_light_green",      () -> new BlockLight(Blocks.GREEN_STAINED_GLASS,      DyeColor.GREEN)     , false);
	public static final RegistryObject<Block> BLOCK_LIGHT_RED        = registerBlock("block_light_red",        () -> new BlockLight(Blocks.RED_STAINED_GLASS,        DyeColor.RED)       , false);
	public static final RegistryObject<Block> BLOCK_LIGHT_BLACK      = registerBlock("block_light_black",      () -> new BlockLight(Blocks.BLACK_STAINED_GLASS,      DyeColor.BLACK)     , false);
	
	
	
	
	
	// ---------- ---------- ---------- ----------  SETUP  ---------- ---------- ---------- ---------- //
	
	static void setup(FMLCommonSetupEvent event){
		RegisterMod.register("stairway");
	}
	
	@OnlyIn(Dist.CLIENT)
	static void setup(FMLClientSetupEvent event){
		// event.enqueueWork(() -> { });
	}
	
	
	
	
	
	// ---------- ---------- ---------- ----------  REGISTER  ---------- ---------- ---------- ---------- //
	
	// registers all deferred registries to the game
	public static void register(IEventBus bus){
		BLOCKS.register(        bus);
		ITEMS.register(         bus);
		MENUS.register(         bus);
		BLOCK_ENTITIES.register(bus);
		SOUNDS.register(        bus);
		ENTITIES.register(      bus);
		RECIPIES.register(      bus);
		CREATIVE_TABS.register( bus);
	}
	
	
	
	
	
	// ---------- ---------- ---------- ----------  REGISTER CREATIVE TABS  ---------- ---------- ---------- ---------- //
	
	public static void registerCreativeTabs(BuildCreativeModeTabContentsEvent event){
		// if (event.getTabKey() == CreativeModeTabs.NATURAL_BLOCKS){ }
		if(event.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS){
			event.accept(Register.WALLS_STONE_STONES);
			event.accept(Register.PILAR_STONE_STONES);
			event.accept(Register.STAIR_STONE_SMOOTH);
			event.accept(Register.WALLS_STONE_SMOOTH);
			event.accept(Register.PILAR_STONE_SMOOTH);
			event.accept(Register.PILAR_STONE_COBBLE_BASIC);
			event.accept(Register.PILAR_STONE_COBBLE_MOSSY);
			event.accept(Register.PILAR_STONE_BRICKS_BASIC);
			event.accept(Register.PILAR_STONE_BRICKS_MOSSY);
			event.accept(Register.SLABS_STONE_BRICKS_CRACK);
			event.accept(Register.STAIR_STONE_BRICKS_CRACK);
			event.accept(Register.WALLS_STONE_BRICKS_CRACK);
			event.accept(Register.PILAR_STONE_BRICKS_CRACK);
			event.accept(Register.PILAR_GRANITE_STONES);
			event.accept(Register.WALLS_GRANITE_SMOOTH);
			event.accept(Register.PILAR_GRANITE_SMOOTH);
			event.accept(Register.BLOCK_GRANITE_COBBLE_BASIC);
			event.accept(Register.SLABS_GRANITE_COBBLE_BASIC);
			event.accept(Register.STAIR_GRANITE_COBBLE_BASIC);
			event.accept(Register.WALLS_GRANITE_COBBLE_BASIC);
			event.accept(Register.PILAR_GRANITE_COBBLE_BASIC);
			event.accept(Register.BLOCK_GRANITE_COBBLE_MOSSY);
			event.accept(Register.SLABS_GRANITE_COBBLE_MOSSY);
			event.accept(Register.STAIR_GRANITE_COBBLE_MOSSY);
			event.accept(Register.WALLS_GRANITE_COBBLE_MOSSY);
			event.accept(Register.PILAR_GRANITE_COBBLE_MOSSY);
			event.accept(Register.BLOCK_GRANITE_BRICKS_BASIC);
			event.accept(Register.SLABS_GRANITE_BRICKS_BASIC);
			event.accept(Register.STAIR_GRANITE_BRICKS_BASIC);
			event.accept(Register.WALLS_GRANITE_BRICKS_BASIC);
			event.accept(Register.PILAR_GRANITE_BRICKS_BASIC);
			event.accept(Register.BLOCK_GRANITE_BRICKS_MOSSY);
			event.accept(Register.SLABS_GRANITE_BRICKS_MOSSY);
			event.accept(Register.STAIR_GRANITE_BRICKS_MOSSY);
			event.accept(Register.WALLS_GRANITE_BRICKS_MOSSY);
			event.accept(Register.PILAR_GRANITE_BRICKS_MOSSY);
			event.accept(Register.BLOCK_GRANITE_BRICKS_CRACK);
			event.accept(Register.SLABS_GRANITE_BRICKS_CRACK);
			event.accept(Register.STAIR_GRANITE_BRICKS_CRACK);
			event.accept(Register.WALLS_GRANITE_BRICKS_CRACK);
			event.accept(Register.PILAR_GRANITE_BRICKS_CRACK);
			event.accept(Register.BLOCK_GRANITE_CARVED);
			event.accept(Register.PILAR_DIORITE_STONES);
			event.accept(Register.WALLS_DIORITE_SMOOTH);
			event.accept(Register.PILAR_DIORITE_SMOOTH);
			event.accept(Register.BLOCK_DIORITE_COBBLE_BASIC);
			event.accept(Register.SLABS_DIORITE_COBBLE_BASIC);
			event.accept(Register.STAIR_DIORITE_COBBLE_BASIC);
			event.accept(Register.WALLS_DIORITE_COBBLE_BASIC);
			event.accept(Register.PILAR_DIORITE_COBBLE_BASIC);
			event.accept(Register.BLOCK_DIORITE_COBBLE_MOSSY);
			event.accept(Register.SLABS_DIORITE_COBBLE_MOSSY);
			event.accept(Register.STAIR_DIORITE_COBBLE_MOSSY);
			event.accept(Register.WALLS_DIORITE_COBBLE_MOSSY);
			event.accept(Register.PILAR_DIORITE_COBBLE_MOSSY);
			event.accept(Register.BLOCK_DIORITE_BRICKS_BASIC);
			event.accept(Register.SLABS_DIORITE_BRICKS_BASIC);
			event.accept(Register.STAIR_DIORITE_BRICKS_BASIC);
			event.accept(Register.WALLS_DIORITE_BRICKS_BASIC);
			event.accept(Register.PILAR_DIORITE_BRICKS_BASIC);
			event.accept(Register.BLOCK_DIORITE_BRICKS_MOSSY);
			event.accept(Register.SLABS_DIORITE_BRICKS_MOSSY);
			event.accept(Register.STAIR_DIORITE_BRICKS_MOSSY);
			event.accept(Register.WALLS_DIORITE_BRICKS_MOSSY);
			event.accept(Register.PILAR_DIORITE_BRICKS_MOSSY);
			event.accept(Register.BLOCK_DIORITE_BRICKS_CRACK);
			event.accept(Register.SLABS_DIORITE_BRICKS_CRACK);
			event.accept(Register.STAIR_DIORITE_BRICKS_CRACK);
			event.accept(Register.WALLS_DIORITE_BRICKS_CRACK);
			event.accept(Register.PILAR_DIORITE_BRICKS_CRACK);
			event.accept(Register.BLOCK_DIORITE_CARVED);
			event.accept(Register.PILAR_ANDESITE_STONES);
			event.accept(Register.WALLS_ANDESITE_SMOOTH);
			event.accept(Register.PILAR_ANDESITE_SMOOTH);
			event.accept(Register.BLOCK_ANDESITE_COBBLE_BASIC);
			event.accept(Register.SLABS_ANDESITE_COBBLE_BASIC);
			event.accept(Register.STAIR_ANDESITE_COBBLE_BASIC);
			event.accept(Register.WALLS_ANDESITE_COBBLE_BASIC);
			event.accept(Register.PILAR_ANDESITE_COBBLE_BASIC);
			event.accept(Register.BLOCK_ANDESITE_COBBLE_MOSSY);
			event.accept(Register.SLABS_ANDESITE_COBBLE_MOSSY);
			event.accept(Register.STAIR_ANDESITE_COBBLE_MOSSY);
			event.accept(Register.WALLS_ANDESITE_COBBLE_MOSSY);
			event.accept(Register.PILAR_ANDESITE_COBBLE_MOSSY);
			event.accept(Register.BLOCK_ANDESITE_BRICKS_BASIC);
			event.accept(Register.SLABS_ANDESITE_BRICKS_BASIC);
			event.accept(Register.STAIR_ANDESITE_BRICKS_BASIC);
			event.accept(Register.WALLS_ANDESITE_BRICKS_BASIC);
			event.accept(Register.PILAR_ANDESITE_BRICKS_BASIC);
			event.accept(Register.BLOCK_ANDESITE_BRICKS_MOSSY);
			event.accept(Register.SLABS_ANDESITE_BRICKS_MOSSY);
			event.accept(Register.STAIR_ANDESITE_BRICKS_MOSSY);
			event.accept(Register.WALLS_ANDESITE_BRICKS_MOSSY);
			event.accept(Register.PILAR_ANDESITE_BRICKS_MOSSY);
			event.accept(Register.BLOCK_ANDESITE_BRICKS_CRACK);
			event.accept(Register.SLABS_ANDESITE_BRICKS_CRACK);
			event.accept(Register.STAIR_ANDESITE_BRICKS_CRACK);
			event.accept(Register.WALLS_ANDESITE_BRICKS_CRACK);
			event.accept(Register.PILAR_ANDESITE_BRICKS_CRACK);
			event.accept(Register.BLOCK_ANDESITE_CARVED);
			event.accept(Register.PILAR_PRISMARINE_STONE);
			event.accept(Register.WALLS_PRISMARINE_BRICK);
			event.accept(Register.PILAR_PRISMARINE_BRICK);
			event.accept(Register.WALLS_PRISMARINE_DARK);
			event.accept(Register.PILAR_PRISMARINE_DARK);
			event.accept(Register.SLABS_ENDSTONE_STONES);
			event.accept(Register.STAIR_ENDSTONE_STONES);
			event.accept(Register.WALLS_ENDSTONE_STONES);
			event.accept(Register.PILAR_ENDSTONE_STONES);
			event.accept(Register.BLOCK_ENDSTONE_SMOOTH);
			event.accept(Register.SLABS_ENDSTONE_SMOOTH);
			event.accept(Register.STAIR_ENDSTONE_SMOOTH);
			event.accept(Register.WALLS_ENDSTONE_SMOOTH);
			event.accept(Register.PILAR_ENDSTONE_SMOOTH);
			event.accept(Register.BLOCK_ENDSTONE_COBBLE_BASIC);
			event.accept(Register.SLABS_ENDSTONE_COBBLE_BASIC);
			event.accept(Register.STAIR_ENDSTONE_COBBLE_BASIC);
			event.accept(Register.WALLS_ENDSTONE_COBBLE_BASIC);
			event.accept(Register.PILAR_ENDSTONE_COBBLE_BASIC);
			event.accept(Register.BLOCK_ENDSTONE_COBBLE_MOSSY);
			event.accept(Register.SLABS_ENDSTONE_COBBLE_MOSSY);
			event.accept(Register.STAIR_ENDSTONE_COBBLE_MOSSY);
			event.accept(Register.WALLS_ENDSTONE_COBBLE_MOSSY);
			event.accept(Register.PILAR_ENDSTONE_COBBLE_MOSSY);
			event.accept(Register.PILAR_ENDSTONE_BRICKS_BASIC);
			event.accept(Register.BLOCK_ENDSTONE_BRICKS_MOSSY);
			event.accept(Register.SLABS_ENDSTONE_BRICKS_MOSSY);
			event.accept(Register.STAIR_ENDSTONE_BRICKS_MOSSY);
			event.accept(Register.WALLS_ENDSTONE_BRICKS_MOSSY);
			event.accept(Register.PILAR_ENDSTONE_BRICKS_MOSSY);
			event.accept(Register.BLOCK_ENDSTONE_BRICKS_CRACK);
			event.accept(Register.SLABS_ENDSTONE_BRICKS_CRACK);
			event.accept(Register.STAIR_ENDSTONE_BRICKS_CRACK);
			event.accept(Register.WALLS_ENDSTONE_BRICKS_CRACK);
			event.accept(Register.PILAR_ENDSTONE_BRICKS_CRACK);
			event.accept(Register.BLOCK_ENDSTONE_CARVED);
			event.accept(Register.PILAR_BLACKSTONE_SMOOTH);
			event.accept(Register.PILAR_BLACKSTONE_COBBLE_BASIC);
			event.accept(Register.BLOCK_BLACKSTONE_COBBLE_MOSSY);
			event.accept(Register.SLABS_BLACKSTONE_COBBLE_MOSSY);
			event.accept(Register.STAIR_BLACKSTONE_COBBLE_MOSSY);
			event.accept(Register.WALLS_BLACKSTONE_COBBLE_MOSSY);
			event.accept(Register.PILAR_BLACKSTONE_COBBLE_MOSSY);
			event.accept(Register.PILAR_BLACKSTONE_BRICKS_BASIC);
			event.accept(Register.BLOCK_BLACKSTONE_BRICKS_MOSSY);
			event.accept(Register.SLABS_BLACKSTONE_BRICKS_MOSSY);
			event.accept(Register.STAIR_BLACKSTONE_BRICKS_MOSSY);
			event.accept(Register.WALLS_BLACKSTONE_BRICKS_MOSSY);
			event.accept(Register.PILAR_BLACKSTONE_BRICKS_MOSSY);
			event.accept(Register.SLABS_BLACKSTONE_BRICKS_CRACK);
			event.accept(Register.STAIR_BLACKSTONE_BRICKS_CRACK);
			event.accept(Register.WALLS_BLACKSTONE_BRICKS_CRACK);
			event.accept(Register.PILAR_BLACKSTONE_BRICKS_CRACK);
			event.accept(Register.SLABS_DEEPSLATE_STONES);
			event.accept(Register.STAIR_DEEPSLATE_STONES);
			event.accept(Register.WALLS_DEEPSLATE_STONES);
			event.accept(Register.PILAR_DEEPSLATE_STONES);
			event.accept(Register.PILAR_DEEPSLATE_COBBLE_BASIC);
			event.accept(Register.BLOCK_DEEPSLATE_COBBLE_MOSS);
			event.accept(Register.SLABS_DEEPSLATE_COBBLE_MOSS);
			event.accept(Register.STAIR_DEEPSLATE_COBBLE_MOSS);
			event.accept(Register.WALLS_DEEPSLATE_COBBLE_MOSS);
			event.accept(Register.PILAR_DEEPSLATE_COBBLE_MOSS);
			event.accept(Register.PILAR_DEEPSLATE_SMOOTH);
			event.accept(Register.PILAR_DEEPSLATE_BRICKS_BASIC);
			event.accept(Register.BLOCK_DEEPSLATE_BRICKS_MOSSY);
			event.accept(Register.SLABS_DEEPSLATE_BRICKS_MOSSY);
			event.accept(Register.STAIR_DEEPSLATE_BRICKS_MOSSY);
			event.accept(Register.WALLS_DEEPSLATE_BRICKS_MOSSY);
			event.accept(Register.PILAR_DEEPSLATE_BRICKS_MOSSY);
			event.accept(Register.SLABS_DEEPSLATE_BRICKS_CRACK);
			event.accept(Register.STAIR_DEEPSLATE_BRICKS_CRACK);
			event.accept(Register.WALLS_DEEPSLATE_BRICKS_CRACK);
			event.accept(Register.PILAR_DEEPSLATE_BRICKS_CRACK);
		}
		if (event.getTabKey() == CreativeModeTabs.FUNCTIONAL_BLOCKS){
			event.accept(Register.BLOCK_SCAFFOLDING);
			event.accept(Register.BLOCK_CHAIN_COPPER);
			event.accept(Register.BLOCK_CHAIN_IRON);
			event.accept(Register.BLOCK_CHAIN_GOLD);
			if(RegisterMod.exists("acecraft")){
				event.accept(Register.BLOCK_CHAIN_TIN);
				event.accept(Register.BLOCK_CHAIN_MYTHRIL);
				event.accept(Register.BLOCK_CHAIN_GILIUM);
				event.accept(Register.BLOCK_CHAIN_BRONZE);
				event.accept(Register.BLOCK_CHAIN_ORICHALCUM);
				event.accept(Register.BLOCK_CHAIN_ADAMANTIUM);
			}
		}
		if (event.getTabKey() == CreativeModeTabs.COLORED_BLOCKS){
			event.accept(Register.SLABS_CONCRETE_WHITE);
			event.accept(Register.STAIR_CONCRETE_WHITE);
			event.accept(Register.WALLS_CONCRETE_WHITE);
			event.accept(Register.PILAR_CONCRETE_WHITE);
			event.accept(Register.SLABS_CONCRETE_ORANGE);
			event.accept(Register.STAIR_CONCRETE_ORANGE);
			event.accept(Register.WALLS_CONCRETE_ORANGE);
			event.accept(Register.PILAR_CONCRETE_ORANGE);
			event.accept(Register.SLABS_CONCRETE_MAGENTA);
			event.accept(Register.STAIR_CONCRETE_MAGENTA);
			event.accept(Register.WALLS_CONCRETE_MAGENTA);
			event.accept(Register.PILAR_CONCRETE_MAGENTA);
			event.accept(Register.SLABS_CONCRETE_LIGHT_BLUE);
			event.accept(Register.STAIR_CONCRETE_LIGHT_BLUE);
			event.accept(Register.WALLS_CONCRETE_LIGHT_BLUE);
			event.accept(Register.PILAR_CONCRETE_LIGHT_BLUE);
			event.accept(Register.SLABS_CONCRETE_YELLOW);
			event.accept(Register.STAIR_CONCRETE_YELLOW);
			event.accept(Register.WALLS_CONCRETE_YELLOW);
			event.accept(Register.PILAR_CONCRETE_YELLOW);
			event.accept(Register.SLABS_CONCRETE_LIME);
			event.accept(Register.STAIR_CONCRETE_LIME);
			event.accept(Register.WALLS_CONCRETE_LIME);
			event.accept(Register.PILAR_CONCRETE_LIME);
			event.accept(Register.SLABS_CONCRETE_PINK);
			event.accept(Register.STAIR_CONCRETE_PINK);
			event.accept(Register.WALLS_CONCRETE_PINK);
			event.accept(Register.PILAR_CONCRETE_PINK);
			event.accept(Register.SLABS_CONCRETE_GRAY);
			event.accept(Register.STAIR_CONCRETE_GRAY);
			event.accept(Register.WALLS_CONCRETE_GRAY);
			event.accept(Register.PILAR_CONCRETE_GRAY);
			event.accept(Register.SLABS_CONCRETE_LIGHT_GRAY);
			event.accept(Register.STAIR_CONCRETE_LIGHT_GRAY);
			event.accept(Register.WALLS_CONCRETE_LIGHT_GRAY);
			event.accept(Register.PILAR_CONCRETE_LIGHT_GRAY);
			event.accept(Register.SLABS_CONCRETE_CYAN);
			event.accept(Register.STAIR_CONCRETE_CYAN);
			event.accept(Register.WALLS_CONCRETE_CYAN);
			event.accept(Register.PILAR_CONCRETE_CYAN);
			event.accept(Register.SLABS_CONCRETE_PURPLE);
			event.accept(Register.STAIR_CONCRETE_PURPLE);
			event.accept(Register.WALLS_CONCRETE_PURPLE);
			event.accept(Register.PILAR_CONCRETE_PURPLE);
			event.accept(Register.SLABS_CONCRETE_BLUE);
			event.accept(Register.STAIR_CONCRETE_BLUE);
			event.accept(Register.WALLS_CONCRETE_BLUE);
			event.accept(Register.PILAR_CONCRETE_BLUE);
			event.accept(Register.SLABS_CONCRETE_BROWN);
			event.accept(Register.STAIR_CONCRETE_BROWN);
			event.accept(Register.WALLS_CONCRETE_BROWN);
			event.accept(Register.PILAR_CONCRETE_BROWN);
			event.accept(Register.SLABS_CONCRETE_GREEN);
			event.accept(Register.STAIR_CONCRETE_GREEN);
			event.accept(Register.WALLS_CONCRETE_GREEN);
			event.accept(Register.PILAR_CONCRETE_GREEN);
			event.accept(Register.SLABS_CONCRETE_RED);
			event.accept(Register.STAIR_CONCRETE_RED);
			event.accept(Register.WALLS_CONCRETE_RED);
			event.accept(Register.PILAR_CONCRETE_RED);
			event.accept(Register.SLABS_CONCRETE_BLACK);
			event.accept(Register.STAIR_CONCRETE_BLACK);
			event.accept(Register.WALLS_CONCRETE_BLACK);
			event.accept(Register.PILAR_CONCRETE_BLACK);
			event.accept(Register.TIMBER_BASIC_WHITE);
			event.accept(Register.TIMBER_BASIC_ORANGE);
			event.accept(Register.TIMBER_BASIC_MAGENTA);
			event.accept(Register.TIMBER_BASIC_LIGHT_BLUE);
			event.accept(Register.TIMBER_BASIC_YELLOW);
			event.accept(Register.TIMBER_BASIC_LIME);
			event.accept(Register.TIMBER_BASIC_PINK);
			event.accept(Register.TIMBER_BASIC_GRAY);
			event.accept(Register.TIMBER_BASIC_LIGHT_GRAY);
			event.accept(Register.TIMBER_BASIC_CYAN);
			event.accept(Register.TIMBER_BASIC_PURPLE);
			event.accept(Register.TIMBER_BASIC_BLUE);
			event.accept(Register.TIMBER_BASIC_BROWN);
			event.accept(Register.TIMBER_BASIC_GREEN);
			event.accept(Register.TIMBER_BASIC_RED);
			event.accept(Register.TIMBER_BASIC_BLACK);
			event.accept(Register.TIMBER_HORIZONTAL_WHITE);
			event.accept(Register.TIMBER_HORIZONTAL_ORANGE);
			event.accept(Register.TIMBER_HORIZONTAL_MAGENTA);
			event.accept(Register.TIMBER_HORIZONTAL_LIGHT_BLUE);
			event.accept(Register.TIMBER_HORIZONTAL_YELLOW);
			event.accept(Register.TIMBER_HORIZONTAL_LIME);
			event.accept(Register.TIMBER_HORIZONTAL_PINK);
			event.accept(Register.TIMBER_HORIZONTAL_GRAY);
			event.accept(Register.TIMBER_HORIZONTAL_LIGHT_GRAY);
			event.accept(Register.TIMBER_HORIZONTAL_CYAN);
			event.accept(Register.TIMBER_HORIZONTAL_PURPLE);
			event.accept(Register.TIMBER_HORIZONTAL_BLUE);
			event.accept(Register.TIMBER_HORIZONTAL_BROWN);
			event.accept(Register.TIMBER_HORIZONTAL_GREEN);
			event.accept(Register.TIMBER_HORIZONTAL_RED);
			event.accept(Register.TIMBER_HORIZONTAL_BLACK);
			event.accept(Register.TIMBER_VERTICAL_WHITE);
			event.accept(Register.TIMBER_VERTICAL_ORANGE);
			event.accept(Register.TIMBER_VERTICAL_MAGENTA);
			event.accept(Register.TIMBER_VERTICAL_LIGHT_BLUE);
			event.accept(Register.TIMBER_VERTICAL_YELLOW);
			event.accept(Register.TIMBER_VERTICAL_LIME);
			event.accept(Register.TIMBER_VERTICAL_PINK);
			event.accept(Register.TIMBER_VERTICAL_GRAY);
			event.accept(Register.TIMBER_VERTICAL_LIGHT_GRAY);
			event.accept(Register.TIMBER_VERTICAL_CYAN);
			event.accept(Register.TIMBER_VERTICAL_PURPLE);
			event.accept(Register.TIMBER_VERTICAL_BLUE);
			event.accept(Register.TIMBER_VERTICAL_BROWN);
			event.accept(Register.TIMBER_VERTICAL_GREEN);
			event.accept(Register.TIMBER_VERTICAL_RED);
			event.accept(Register.TIMBER_VERTICAL_BLACK);
			event.accept(Register.TIMBER_PLUS_WHITE);
			event.accept(Register.TIMBER_PLUS_ORANGE);
			event.accept(Register.TIMBER_PLUS_MAGENTA);
			event.accept(Register.TIMBER_PLUS_LIGHT_BLUE);
			event.accept(Register.TIMBER_PLUS_YELLOW);
			event.accept(Register.TIMBER_PLUS_LIME);
			event.accept(Register.TIMBER_PLUS_PINK);
			event.accept(Register.TIMBER_PLUS_GRAY);
			event.accept(Register.TIMBER_PLUS_LIGHT_GRAY);
			event.accept(Register.TIMBER_PLUS_CYAN);
			event.accept(Register.TIMBER_PLUS_PURPLE);
			event.accept(Register.TIMBER_PLUS_BLUE);
			event.accept(Register.TIMBER_PLUS_BROWN);
			event.accept(Register.TIMBER_PLUS_GREEN);
			event.accept(Register.TIMBER_PLUS_RED);
			event.accept(Register.TIMBER_PLUS_BLACK);
			event.accept(Register.TIMBER_DIAG_LEFT_WHITE);
			event.accept(Register.TIMBER_DIAG_LEFT_ORANGE);
			event.accept(Register.TIMBER_DIAG_LEFT_MAGENTA);
			event.accept(Register.TIMBER_DIAG_LEFT_LIGHT_BLUE);
			event.accept(Register.TIMBER_DIAG_LEFT_YELLOW);
			event.accept(Register.TIMBER_DIAG_LEFT_LIME);
			event.accept(Register.TIMBER_DIAG_LEFT_PINK);
			event.accept(Register.TIMBER_DIAG_LEFT_GRAY);
			event.accept(Register.TIMBER_DIAG_LEFT_LIGHT_GRAY);
			event.accept(Register.TIMBER_DIAG_LEFT_CYAN);
			event.accept(Register.TIMBER_DIAG_LEFT_PURPLE);
			event.accept(Register.TIMBER_DIAG_LEFT_BLUE);
			event.accept(Register.TIMBER_DIAG_LEFT_BROWN);
			event.accept(Register.TIMBER_DIAG_LEFT_GREEN);
			event.accept(Register.TIMBER_DIAG_LEFT_RED);
			event.accept(Register.TIMBER_DIAG_LEFT_BLACK);
			event.accept(Register.TIMBER_DIAG_RIGHT_WHITE);
			event.accept(Register.TIMBER_DIAG_RIGHT_ORANGE);
			event.accept(Register.TIMBER_DIAG_RIGHT_MAGENTA);
			event.accept(Register.TIMBER_DIAG_RIGHT_LIGHT_BLUE);
			event.accept(Register.TIMBER_DIAG_RIGHT_YELLOW);
			event.accept(Register.TIMBER_DIAG_RIGHT_LIME);
			event.accept(Register.TIMBER_DIAG_RIGHT_PINK);
			event.accept(Register.TIMBER_DIAG_RIGHT_GRAY);
			event.accept(Register.TIMBER_DIAG_RIGHT_LIGHT_GRAY);
			event.accept(Register.TIMBER_DIAG_RIGHT_CYAN);
			event.accept(Register.TIMBER_DIAG_RIGHT_PURPLE);
			event.accept(Register.TIMBER_DIAG_RIGHT_BLUE);
			event.accept(Register.TIMBER_DIAG_RIGHT_BROWN);
			event.accept(Register.TIMBER_DIAG_RIGHT_GREEN);
			event.accept(Register.TIMBER_DIAG_RIGHT_RED);
			event.accept(Register.TIMBER_DIAG_RIGHT_BLACK);
			event.accept(Register.TIMBER_CROSS_WHITE);
			event.accept(Register.TIMBER_CROSS_ORANGE);
			event.accept(Register.TIMBER_CROSS_MAGENTA);
			event.accept(Register.TIMBER_CROSS_LIGHT_BLUE);
			event.accept(Register.TIMBER_CROSS_YELLOW);
			event.accept(Register.TIMBER_CROSS_LIME);
			event.accept(Register.TIMBER_CROSS_PINK);
			event.accept(Register.TIMBER_CROSS_GRAY);
			event.accept(Register.TIMBER_CROSS_LIGHT_GRAY);
			event.accept(Register.TIMBER_CROSS_CYAN);
			event.accept(Register.TIMBER_CROSS_PURPLE);
			event.accept(Register.TIMBER_CROSS_BLUE);
			event.accept(Register.TIMBER_CROSS_BROWN);
			event.accept(Register.TIMBER_CROSS_GREEN);
			event.accept(Register.TIMBER_CROSS_RED);
			event.accept(Register.TIMBER_CROSS_BLACK);
		}
		if (event.getTabKey() == CreativeModeTabs.REDSTONE_BLOCKS){
			event.accept(Register.STATUE_DOG_STONE);
			event.accept(Register.STATUE_DOG_GRANITE);
			event.accept(Register.STATUE_DOG_DIORITE);
			event.accept(Register.STATUE_DOG_ANDESITE);
			event.accept(Register.STATUE_DOG_ENDSTONE);
			event.accept(Register.STATUE_DOG_BLACKSTONE);
			event.accept(Register.STATUE_DOG_DEEPSLATE);
			event.accept(Register.STATUE_CHICKEN_STONE);
			event.accept(Register.STATUE_CHICKEN_GRANITE);
			event.accept(Register.STATUE_CHICKEN_DIORITE);
			event.accept(Register.STATUE_CHICKEN_ANDESITE);
			event.accept(Register.STATUE_CHICKEN_ENDSTONE);
			event.accept(Register.STATUE_CHICKEN_BLACKSTONE);
			event.accept(Register.STATUE_CHICKEN_DEEPSLATE);
			event.accept(Register.BLOCK_EMITTER_WHITE);
			event.accept(Register.BLOCK_EMITTER_ORANGE);
			event.accept(Register.BLOCK_EMITTER_MAGENTA);
			event.accept(Register.BLOCK_EMITTER_LIGHT_BLUE);
			event.accept(Register.BLOCK_EMITTER_YELLOW);
			event.accept(Register.BLOCK_EMITTER_LIME);
			event.accept(Register.BLOCK_EMITTER_PINK);
			event.accept(Register.BLOCK_EMITTER_GRAY);
			event.accept(Register.BLOCK_EMITTER_LIGHT_GRAY);
			event.accept(Register.BLOCK_EMITTER_CYAN);
			event.accept(Register.BLOCK_EMITTER_PURPLE);
			event.accept(Register.BLOCK_EMITTER_BLUE);
			event.accept(Register.BLOCK_EMITTER_BROWN);
			event.accept(Register.BLOCK_EMITTER_GREEN);
			event.accept(Register.BLOCK_EMITTER_RED);
			event.accept(Register.BLOCK_EMITTER_BLACK);
		}
		// if (event.getTabKey() == CreativeModeTabs.COMBAT){ }
		// if (event.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES){ }
		// if (event.getTabKey() == CreativeModeTabs.FOOD_AND_DRINKS){ }
		// if (event.getTabKey() == CreativeModeTabs.INGREDIENTS){ }
		// if (event.getTabKey().equals(CreativeModeTabs.SPAWN_EGGS)) { }
	}
	
	
	
	
	
	// ---------- ---------- ---------- ----------  SUPPORT  ---------- ---------- ---------- ---------- //
	
	// creates a block for the registry
	// sets up a creative tab for an additional registry later
	// if no creative tab, it does not create an fitting itemblock
	protected static RegistryObject<Block> registerBlock(String name, Supplier<? extends Block> block, boolean registerItemBlock){
		RegistryObject<Block> supply = BLOCKS.register(name, block);
		if(registerItemBlock){
			ITEMS.register(name, () -> new BlockItem(supply.get(), new Item.Properties()));
		}
		return supply;
	}
	
	protected static RegistryObject<Block> registerBlock(String name, Supplier<? extends Block> block){
		return registerBlock(name, block, true);
	}
	
	// creates an item fo the registry
	protected static RegistryObject<Item> registerItem(String name, Supplier<? extends Item> item){
		return ITEMS.register(name, item);
	}
	
	
	
}