package net.jtz.cascadianores.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.jtz.cascadianores.CascadianOres;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item TESTIUM_SWORD = registerItem("testium_sword",
            new SwordItem(ModToolMaterial.TESTIUM_INGOT, 3, -2.4f, new FabricItemSettings()));
    public static final Item TESTIUM_PICKAXE = registerItem("testium_pickaxe",
            new PickaxeItem(ModToolMaterial.TESTIUM_INGOT, 1, -2.8f, new FabricItemSettings()));
    public static final Item TESTIUM_AXE = registerItem("testium_axe",
            new AxeItem(ModToolMaterial.TESTIUM_INGOT, 6, -3.1f, new FabricItemSettings()));
    public static final Item TESTIUM_SHOVEL = registerItem("testium_shovel",
            new ShovelItem(ModToolMaterial.TESTIUM_INGOT, 1.5f, -3.0f, new FabricItemSettings()));
    public static final Item TESTIUM_HOE = registerItem("testium_hoe",
            new HoeItem(ModToolMaterial.TESTIUM_INGOT, -2, -1, new FabricItemSettings()));

    public static final Item PERIDOT = registerItem("peridot", new Item(new FabricItemSettings()));
    public static final Item TESTIUM_INGOT = registerItem("testium_ingot", new Item(new FabricItemSettings()));
    public static final Item TESTIUM_NUGGET = registerItem("testium_nugget", new Item(new FabricItemSettings()));
    public static final Item RAW_TESTIUM = registerItem("raw_testium", new Item(new FabricItemSettings()));

    /*private static void addItemsToIngredientsTabItemGroup(FabricItemGroupEntries entries) {
        entries.add(PERIDOT);
    }*/

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(CascadianOres.MOD_ID, name), item);
    }

    public static void registerModItems() {
        CascadianOres.LOGGER.info("Registering Mod Items for" + CascadianOres.MOD_ID);
        //ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientsTabItemGroup);
    }

}
