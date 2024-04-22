package net.jtz.cascadianores.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.jtz.cascadianores.block.ModBlocks;
import net.jtz.cascadianores.item.ModItems;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.PERIDOT_BLOCK);
        addDrop(ModBlocks.TESTIUM_BLOCK);
        addDrop(ModBlocks.RAW_TESTIUM_BLOCK);

        addDrop(ModBlocks.TESTIUM_ORE, oreDrops(ModBlocks.TESTIUM_ORE, ModItems.RAW_TESTIUM));

    }
}
