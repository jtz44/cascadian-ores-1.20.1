package net.jtz.cascadianores.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.jtz.cascadianores.CascadianOres;
import net.jtz.cascadianores.block.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;


public class ModItemGroups {
    public static final ItemGroup CASCADIAN_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(CascadianOres.MOD_ID, "peridot"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.cascadian_ores"))
                    .icon(() -> new ItemStack(ModItems.PERIDOT)).entries((displayContext, entries) -> {

                        entries.add(ModItems.TESTIUM_SWORD);
                        entries.add(ModItems.TESTIUM_PICKAXE);
                        entries.add(ModItems.TESTIUM_AXE);
                        entries.add(ModItems.TESTIUM_SHOVEL);
                        entries.add(ModItems.TESTIUM_HOE);

                        entries.add(ModItems.TESTIUM_HELMET);
                        entries.add(ModItems.TESTIUM_CHESTPLATE);
                        entries.add(ModItems.TESTIUM_LEGGINGS);
                        entries.add(ModItems.TESTIUM_BOOTS);

                        entries.add(ModItems.PERIDOT);
                        entries.add(ModItems.TESTIUM_INGOT);
                        entries.add(ModItems.TESTIUM_NUGGET);
                        entries.add(ModItems.RAW_TESTIUM);


                        entries.add(ModBlocks.PERIDOT_BLOCK);
                        entries.add(ModBlocks.TESTIUM_BLOCK);
                        entries.add(ModBlocks.RAW_TESTIUM_BLOCK);
                        entries.add(ModBlocks.TESTIUM_ORE);
                        entries.add(ModBlocks.DEEPSLATE_TESTIUM_ORE);


                    }).build());

    public static void registerItemGroups() {
        CascadianOres.LOGGER.info("Registering Item Groups for" +CascadianOres.MOD_ID);
    }
}
