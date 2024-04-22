package net.jtz.cascadianores.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.jtz.cascadianores.block.ModBlocks;
import net.jtz.cascadianores.item.ModItems;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.minecraft.item.ArmorItem;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PERIDOT_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.TESTIUM_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RAW_TESTIUM_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.TESTIUM_ORE);

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.TESTIUM_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.TESTIUM_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.TESTIUM_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.TESTIUM_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.TESTIUM_HOE, Models.HANDHELD);
        
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.TESTIUM_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.TESTIUM_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.TESTIUM_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.TESTIUM_BOOTS));


        itemModelGenerator.register(ModItems.PERIDOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.TESTIUM_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.TESTIUM_NUGGET, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_TESTIUM, Models.GENERATED);



    }
}
