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
        //offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, ModItems.TESTIUM_NUGGET, RecipeCategory.MISC, ModItems.TESTIUM_INGOT);
        //offerCompactingRecipe(exporter, RecipeCategory.MISC, (ItemConvertible) ModItems.TESTIUM_NUGGET, (ItemConvertible) ModItems.TESTIUM_INGOT, "testium_nugget_to_ingot");
        //offerShapelessRecipe(exporter, RecipeCategory.MISC );


        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.TESTIUM_SWORD, 1)
                .pattern(" T ")
                .pattern(" T ")
                .pattern(" S ")
                .input('T', ModItems.TESTIUM_INGOT)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.TESTIUM_INGOT), conditionsFromItem(ModItems.TESTIUM_INGOT))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.TESTIUM_SWORD)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.TESTIUM_PICKAXE, 1)
                .pattern("TTT")
                .pattern(" S ")
                .pattern(" S ")
                .input('T', ModItems.TESTIUM_INGOT)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.TESTIUM_INGOT), conditionsFromItem(ModItems.TESTIUM_INGOT))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.TESTIUM_PICKAXE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.TESTIUM_AXE, 1)
                .pattern("TT ")
                .pattern("TS ")
                .pattern(" S ")
                .input('T', ModItems.TESTIUM_INGOT)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.TESTIUM_INGOT), conditionsFromItem(ModItems.TESTIUM_INGOT))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.TESTIUM_AXE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.TESTIUM_SHOVEL, 1)
                .pattern(" T ")
                .pattern(" S ")
                .pattern(" S ")
                .input('T', ModItems.TESTIUM_INGOT)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.TESTIUM_INGOT), conditionsFromItem(ModItems.TESTIUM_INGOT))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.TESTIUM_SHOVEL)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.TESTIUM_HOE, 1)
                .pattern("TT ")
                .pattern(" S ")
                .pattern(" S ")
                .input('T', ModItems.TESTIUM_INGOT)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.TESTIUM_INGOT), conditionsFromItem(ModItems.TESTIUM_INGOT))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.TESTIUM_HOE)));


        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.TESTIUM_HELMET, 1)
                .pattern("TTT")
                .pattern("T T")
                .pattern("   ")
                .input('T', ModItems.TESTIUM_INGOT)
                .criterion(hasItem(ModItems.TESTIUM_INGOT), conditionsFromItem(ModItems.TESTIUM_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.TESTIUM_HELMET)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.TESTIUM_CHESTPLATE, 1)
                .pattern("T T")
                .pattern("TTT")
                .pattern("TTT")
                .input('T', ModItems.TESTIUM_INGOT)
                .criterion(hasItem(ModItems.TESTIUM_INGOT), conditionsFromItem(ModItems.TESTIUM_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.TESTIUM_CHESTPLATE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.TESTIUM_LEGGINGS, 1)
                .pattern("TTT")
                .pattern("T T")
                .pattern("T T")
                .input('T', ModItems.TESTIUM_INGOT)
                .criterion(hasItem(ModItems.TESTIUM_INGOT), conditionsFromItem(ModItems.TESTIUM_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.TESTIUM_LEGGINGS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.TESTIUM_BOOTS, 1)
                .pattern("   ")
                .pattern("T T")
                .pattern("T T")
                .input('T', ModItems.TESTIUM_INGOT)
                .criterion(hasItem(ModItems.TESTIUM_INGOT), conditionsFromItem(ModItems.TESTIUM_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.TESTIUM_BOOTS)));

    }
}
