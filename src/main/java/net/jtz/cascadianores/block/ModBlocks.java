package net.jtz.cascadianores.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.jtz.cascadianores.CascadianOres;
import net.jtz.cascadianores.block.custom.CuberryCropBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.ExperienceDroppingBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {
    public static final Block PERIDOT_BLOCK = registerBlock("peridot_block",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block TESTIUM_BLOCK = registerBlock("testium_block",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block RAW_TESTIUM_BLOCK = registerBlock("raw_testium_block",
            new Block(FabricBlockSettings.copyOf(Blocks.RAW_IRON_BLOCK)));
    public static final Block TESTIUM_ORE = registerBlock("testium_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.IRON_ORE)));
    public static final Block DEEPSLATE_TESTIUM_ORE = registerBlock("deepslate_testium_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_IRON_ORE)));

    public static final Block CUBERRY_CROP = Registry.register(Registries.BLOCK, new Identifier(CascadianOres.MOD_ID, "cuberry_crop"),
            new CuberryCropBlock(FabricBlockSettings.copy(Blocks.WHEAT)));

    /*private static void addItemsToIngredientsTabItemGroup(FabricItemGroupEntries entries) {
        entries.add(PERIDOT_BLOCK);
    }*/

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(CascadianOres.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(CascadianOres.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks() {
        CascadianOres.LOGGER.info("Registering ModBLocks for " + CascadianOres.MOD_ID);
        //ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(ModBlocks::addItemsToIngredientsTabItemGroup);

    }

}
