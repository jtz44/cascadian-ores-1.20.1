package net.jtz.cascadianores.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.jtz.cascadianores.block.ModBlocks;
import net.jtz.cascadianores.item.ModItems;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;

import java.util.List;
import java.util.function.Consumer;

public class ModRecipeProvider extends FabricRecipeProvider {
    private static final List<ItemConvertible> TESTIUM_SMELTABLES = List.of(ModItems.RAW_TESTIUM, ModBlocks.TESTIUM_ORE);

    public ModRecipeProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        offerSmelting(exporter, TESTIUM_SMELTABLES, RecipeCategory.MISC, ModItems.TESTIUM_INGOT, 0.7f, 200, "testium_ingot");
        offerBlasting(exporter, TESTIUM_SMELTABLES, RecipeCategory.MISC, ModItems.TESTIUM_INGOT, 0.7f, 100, "testium_ingot");

        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.PERIDOT, RecipeCategory.DECORATIONS, ModBlocks.PERIDOT_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.TESTIUM_INGOT, RecipeCategory.DECORATIONS, ModBlocks.TESTIUM_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, ModItems.TESTIUM_NUGGET, RecipeCategory.MISC, ModItems.TESTIUM_INGOT);


        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.TESTIUM_PICKAXE, 1)
                .pattern("TTT")
                .pattern(" S ")
                .pattern(" S ")
                .input('T', ModItems.TESTIUM_INGOT)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.TESTIUM_INGOT), conditionsFromItem(ModItems.TESTIUM_INGOT))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.TESTIUM_PICKAXE)));

    }
}
