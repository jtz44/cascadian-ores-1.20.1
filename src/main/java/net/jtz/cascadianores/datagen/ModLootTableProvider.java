package net.jtz.cascadianores.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.jtz.cascadianores.block.ModBlocks;
import net.jtz.cascadianores.block.custom.CuberryCropBlock;
import net.jtz.cascadianores.item.ModItems;
import net.minecraft.loot.condition.BlockStatePropertyLootCondition;
import net.minecraft.predicate.StatePredicate;

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
        addDrop(ModBlocks.DEEPSLATE_TESTIUM_ORE, oreDrops(ModBlocks.DEEPSLATE_TESTIUM_ORE, ModItems.RAW_TESTIUM));

        BlockStatePropertyLootCondition.Builder builder = BlockStatePropertyLootCondition.builder(ModBlocks.CUBERRY_CROP).properties(StatePredicate.Builder.create()
                .exactMatch(CuberryCropBlock.AGE, 5));
        addDrop(ModBlocks.CUBERRY_CROP, cropDrops(ModBlocks.CUBERRY_CROP, ModItems.CUBERRY, ModItems.CUBERRY_SEEDS, builder));
    }
}
