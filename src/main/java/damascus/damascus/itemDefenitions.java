package damascus.damascus;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.SwordItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class itemDefenitions {

    //Blocks
    public static final Block TUNGSTEN_ORE = new Block(FabricBlockSettings.of(Material.STONE).strength(6.0f).hardness(3.5f).requiresTool());
    public static final Block ZINC_ORE = new Block(FabricBlockSettings.of(Material.STONE).strength(3.0f).hardness(3.0f).requiresTool());
    public static final Block TIN_ORE = new Block(FabricBlockSettings.of(Material.STONE).strength(3.0f).hardness(3.0f).requiresTool());
    public static final Block SILVER_ORE = new Block(FabricBlockSettings.of(Material.STONE).strength(3.0f).hardness(3.0f).requiresTool());
    public static final Block ALUMINUM_ORE = new Block(FabricBlockSettings.of(Material.STONE).strength(3.0f).hardness(3.5f).requiresTool());
    public static final Block RAW_TUNGSTEN_BLOCK = new Block(FabricBlockSettings.of(Material.STONE).strength(6.0f).hardness(3.5f).requiresTool());
    public static final Block RAW_ZINC_BLOCK = new Block(FabricBlockSettings.of(Material.STONE).strength(3.0f).hardness(3.0f).requiresTool());
    public static final Block RAW_TIN_BLOCK = new Block(FabricBlockSettings.of(Material.STONE).strength(3.0f).hardness(3.0f).requiresTool());
    public static final Block RAW_SILVER_BLOCK = new Block(FabricBlockSettings.of(Material.STONE).strength(3.0f).hardness(3.0f).requiresTool());
    public static final Block RAW_ALUMINUM_BLOCK = new Block(FabricBlockSettings.of(Material.STONE).strength(3.0f).hardness(3.5f).requiresTool());
    public static final Block TUNGSTEN_BLOCK = new Block(FabricBlockSettings.of(Material.METAL).strength(8.0f).hardness(5.0f).requiresTool());
    public static final Block ZINC_BLOCK = new Block(FabricBlockSettings.of(Material.METAL).strength(5.0f).hardness(4.0f).requiresTool());
    public static final Block TIN_BLOCK = new Block(FabricBlockSettings.of(Material.METAL).strength(5.0f).hardness(4.0f).requiresTool());
    public static final Block SILVER_BLOCK = new Block(FabricBlockSettings.of(Material.METAL).strength(5.0f).hardness(4.0f).requiresTool());
    public static final Block ALUMINUM_BLOCK = new Block(FabricBlockSettings.of(Material.METAL).strength(5.0f).hardness(5.0f).requiresTool());

    //Block Items
    public static final Item TUNGSTEN_ORE_ITEM = new BlockItem(TUNGSTEN_ORE, new FabricItemSettings());
    public static final Item ZINC_ORE_ITEM = new BlockItem(ZINC_ORE, new FabricItemSettings());
    public static final Item TIN_ORE_ITEM = new BlockItem(TIN_ORE, new FabricItemSettings());
    public static final Item SILVER_ORE_ITEM = new BlockItem(SILVER_ORE, new FabricItemSettings());
    public static final Item ALUMINUM_ORE_ITEM = new BlockItem(ALUMINUM_ORE, new FabricItemSettings());
    public static final Item TUNGSTEN_BLOCK_ITEM = new BlockItem(TUNGSTEN_BLOCK, new FabricItemSettings());
    public static final Item ZINC_BLOCK_ITEM = new BlockItem(ZINC_BLOCK, new FabricItemSettings());
    public static final Item TIN_BLOCK_ITEM = new BlockItem(TIN_BLOCK, new FabricItemSettings());
    public static final Item SILVER_BLOCK_ITEM = new BlockItem(SILVER_BLOCK, new FabricItemSettings());
    public static final Item ALUMINUM_BLOCK_ITEM = new BlockItem(ALUMINUM_BLOCK, new FabricItemSettings());
    public static final Item RAW_TUNGSTEN_BLOCK_ITEM = new BlockItem(RAW_TUNGSTEN_BLOCK, new FabricItemSettings());
    public static final Item RAW_ZINC_BLOCK_ITEM = new BlockItem(RAW_ZINC_BLOCK, new FabricItemSettings());
    public static final Item RAW_TIN_BLOCK_ITEM = new BlockItem(RAW_TIN_BLOCK, new FabricItemSettings());
    public static final Item RAW_SILVER_BLOCK_ITEM = new BlockItem(RAW_SILVER_BLOCK, new FabricItemSettings());
    public static final Item RAW_ALUMINUM_BLOCK_ITEM = new BlockItem(RAW_ALUMINUM_BLOCK, new FabricItemSettings());

    //Raw Ores
    public static final Item RAW_TUNGSTEN = new Item(new FabricItemSettings());
    public static final Item RAW_ZINC = new Item(new FabricItemSettings());
    public static final Item RAW_TIN = new Item(new FabricItemSettings());
    public static final Item RAW_SILVER = new Item(new FabricItemSettings());
    public static final Item RAW_ALUMINUM = new Item(new FabricItemSettings());

    //Ingots And Alloys
    public static final Item FLUX_DUST = new Item(new FabricItemSettings());

    public static final Item TUNGSTEN_INGOT = new Item(new FabricItemSettings());
    public static final Item ZINC_INGOT = new Item(new FabricItemSettings());
    public static final Item TIN_INGOT = new Item(new FabricItemSettings());
    public static final Item SILVER_INGOT = new Item(new FabricItemSettings());
    public static final Item ALUMINUM_INGOT = new Item(new FabricItemSettings());

    public static final Item DAMASCUS_STEEL = new Item(new FabricItemSettings());
    public static final Item STEEL_INGOT = new Item(new FabricItemSettings());


    //Tools
    public static final Item FORGE_HAMMER = new SwordItem(ToolMaterials.HAMMER, 0, -3.3f, new FabricItemSettings());



    public static void register(){
        Registry.register(Registries.ITEM, new Identifier(Damascus.MOD_ID, "damascus_steel"), DAMASCUS_STEEL);
        Registry.register(Registries.ITEM, new Identifier(Damascus.MOD_ID, "raw_tungsten"), RAW_TUNGSTEN);
        Registry.register(Registries.ITEM, new Identifier(Damascus.MOD_ID, "raw_tungsten_block"), RAW_TUNGSTEN_BLOCK_ITEM);
        Registry.register(Registries.ITEM, new Identifier(Damascus.MOD_ID, "tungsten_ore"), TUNGSTEN_ORE_ITEM);
        Registry.register(Registries.ITEM, new Identifier(Damascus.MOD_ID, "tungsten_ingot"), TUNGSTEN_INGOT);
        Registry.register(Registries.ITEM, new Identifier(Damascus.MOD_ID, "raw_zinc"), RAW_ZINC);
        Registry.register(Registries.ITEM, new Identifier(Damascus.MOD_ID, "raw_zinc_block"), RAW_ZINC_BLOCK_ITEM);
        Registry.register(Registries.ITEM, new Identifier(Damascus.MOD_ID, "zinc_ore"), ZINC_ORE_ITEM);
        Registry.register(Registries.ITEM, new Identifier(Damascus.MOD_ID, "zinc_ingot"), ZINC_INGOT);
        Registry.register(Registries.ITEM, new Identifier(Damascus.MOD_ID, "raw_tin"), RAW_TIN);
        Registry.register(Registries.ITEM, new Identifier(Damascus.MOD_ID, "raw_tin_block"), RAW_TIN_BLOCK_ITEM);
        Registry.register(Registries.ITEM, new Identifier(Damascus.MOD_ID, "tin_ore"), TIN_ORE_ITEM);
        Registry.register(Registries.ITEM, new Identifier(Damascus.MOD_ID, "tin_ingot"), TIN_INGOT);
        Registry.register(Registries.ITEM, new Identifier(Damascus.MOD_ID, "raw_silver"), RAW_SILVER);
        Registry.register(Registries.ITEM, new Identifier(Damascus.MOD_ID, "raw_silver_block"), RAW_SILVER_BLOCK_ITEM);
        Registry.register(Registries.ITEM, new Identifier(Damascus.MOD_ID, "silver_ore"), SILVER_ORE_ITEM);
        Registry.register(Registries.ITEM, new Identifier(Damascus.MOD_ID, "silver_ingot"), SILVER_INGOT);
        Registry.register(Registries.ITEM, new Identifier(Damascus.MOD_ID, "raw_aluminum"), RAW_ALUMINUM);
        Registry.register(Registries.ITEM, new Identifier(Damascus.MOD_ID, "raw_aluminum_block"), RAW_ALUMINUM_BLOCK_ITEM);
        Registry.register(Registries.ITEM, new Identifier(Damascus.MOD_ID, "aluminum_ore"), ALUMINUM_ORE_ITEM);
        Registry.register(Registries.ITEM, new Identifier(Damascus.MOD_ID, "aluminum_ingot"), ALUMINUM_INGOT);
        Registry.register(Registries.ITEM, new Identifier(Damascus.MOD_ID, "tungsten_block"), TUNGSTEN_BLOCK_ITEM);
        Registry.register(Registries.ITEM, new Identifier(Damascus.MOD_ID, "zinc_block"), ZINC_BLOCK_ITEM);
        Registry.register(Registries.ITEM, new Identifier(Damascus.MOD_ID, "tin_block"), TIN_BLOCK_ITEM);
        Registry.register(Registries.ITEM, new Identifier(Damascus.MOD_ID, "silver_block"), SILVER_BLOCK_ITEM);
        Registry.register(Registries.ITEM, new Identifier(Damascus.MOD_ID, "aluminum_block"), ALUMINUM_BLOCK_ITEM);
        Registry.register(Registries.ITEM, new Identifier(Damascus.MOD_ID, "forge_hammer"), FORGE_HAMMER);
        Registry.register(Registries.ITEM, new Identifier(Damascus.MOD_ID, "flux_dust"), FLUX_DUST);
        Registry.register(Registries.ITEM, new Identifier(Damascus.MOD_ID, "steel_ingot"), STEEL_INGOT);

    }

    public static void registerBlocks(){
        Registry.register(Registries.BLOCK, new Identifier(Damascus.MOD_ID, "raw_tungsten_block"), RAW_TUNGSTEN_BLOCK);
        Registry.register(Registries.BLOCK, new Identifier(Damascus.MOD_ID, "tungsten_ore"), TUNGSTEN_ORE);
        Registry.register(Registries.BLOCK, new Identifier(Damascus.MOD_ID, "raw_zinc_block"), RAW_ZINC_BLOCK);
        Registry.register(Registries.BLOCK, new Identifier(Damascus.MOD_ID, "zinc_ore"), ZINC_ORE);
        Registry.register(Registries.BLOCK, new Identifier(Damascus.MOD_ID, "raw_tin_block"), RAW_TIN_BLOCK);
        Registry.register(Registries.BLOCK, new Identifier(Damascus.MOD_ID, "tin_ore"), TIN_ORE);
        Registry.register(Registries.BLOCK, new Identifier(Damascus.MOD_ID, "raw_silver_block"), RAW_SILVER_BLOCK);
        Registry.register(Registries.BLOCK, new Identifier(Damascus.MOD_ID, "silver_ore"), SILVER_ORE);
        Registry.register(Registries.BLOCK, new Identifier(Damascus.MOD_ID, "raw_aluminum_block"), RAW_ALUMINUM_BLOCK);
        Registry.register(Registries.BLOCK, new Identifier(Damascus.MOD_ID, "aluminum_ore"), ALUMINUM_ORE);
        Registry.register(Registries.BLOCK, new Identifier(Damascus.MOD_ID, "tungsten_block"), TUNGSTEN_BLOCK);
        Registry.register(Registries.BLOCK, new Identifier(Damascus.MOD_ID, "zinc_block"), ZINC_BLOCK);
        Registry.register(Registries.BLOCK, new Identifier(Damascus.MOD_ID, "tin_block"), TIN_BLOCK);
        Registry.register(Registries.BLOCK, new Identifier(Damascus.MOD_ID, "silver_block"), SILVER_BLOCK);
        Registry.register(Registries.BLOCK, new Identifier(Damascus.MOD_ID, "aluminum_block"), ALUMINUM_BLOCK);
    }

    public static void addItems(){
        ItemGroupEvents.modifyEntriesEvent(Damascus.DAMASCUS).register(content->{
            content.add(TUNGSTEN_ORE_ITEM);
            content.add(ZINC_ORE_ITEM);
            content.add(TIN_ORE_ITEM);
            content.add(SILVER_ORE_ITEM);
            content.add(ALUMINUM_ORE_ITEM);
            content.add(RAW_TUNGSTEN);
            content.add(RAW_ZINC);
            content.add(RAW_TIN);
            content.add(RAW_SILVER);
            content.add(RAW_ALUMINUM);
            content.add(RAW_TUNGSTEN_BLOCK_ITEM);
            content.add(RAW_ZINC_BLOCK_ITEM);
            content.add(RAW_TIN_BLOCK_ITEM);
            content.add(RAW_SILVER_BLOCK_ITEM);
            content.add(RAW_ALUMINUM_BLOCK_ITEM);
            content.add(TUNGSTEN_INGOT);
            content.add(ZINC_INGOT);
            content.add(TIN_INGOT);
            content.add(SILVER_INGOT);
            content.add(ALUMINUM_INGOT);
            content.add(TUNGSTEN_BLOCK_ITEM);
            content.add(ZINC_BLOCK_ITEM);
            content.add(TIN_BLOCK_ITEM);
            content.add(SILVER_BLOCK_ITEM);
            content.add(ALUMINUM_BLOCK_ITEM);

            content.add(FLUX_DUST);
            content.add(STEEL_INGOT);
            content.add(DAMASCUS_STEEL);
            content.add(FORGE_HAMMER);
        });
    }
}
