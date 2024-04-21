package net.jtz.cascadianores.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.jtz.cascadianores.CascadianOres;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.PickaxeItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item TESTIUM_PICKAXE = registerItem("testium_pickaxe",
            new PickaxeItem(ModToolMaterial.TESTIUM_INGOT, 2 , 1f, new FabricItemSettings()));

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
