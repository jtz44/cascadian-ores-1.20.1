package net.jtz.cascadianores.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.jtz.cascadianores.block.ModBlocks;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider  extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {

        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.PERIDOT_BLOCK)
                .add(ModBlocks.TESTIUM_BLOCK)
                .add(ModBlocks.RAW_TESTIUM_BLOCK)
                .add(ModBlocks.TESTIUM_ORE)
                .add(ModBlocks.DEEPSLATE_TESTIUM_ORE);

        getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL)
                .add(ModBlocks.PERIDOT_BLOCK)
                .add(ModBlocks.TESTIUM_BLOCK)
                .add(ModBlocks.RAW_TESTIUM_BLOCK);

        getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.TESTIUM_ORE)
                .add(ModBlocks.DEEPSLATE_TESTIUM_ORE);

        getOrCreateTagBuilder(TagKey.of(RegistryKeys.BLOCK, new Identifier("fabric", "needs_tool_level_4" )))
                ;
    }
}
