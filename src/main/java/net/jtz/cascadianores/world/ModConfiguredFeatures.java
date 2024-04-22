package net.jtz.cascadianores.world;

import net.jtz.cascadianores.CascadianOres;
import net.jtz.cascadianores.block.ModBlocks;
import net.minecraft.block.Blocks;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.structure.rule.BlockMatchRuleTest;
import net.minecraft.structure.rule.RuleTest;
import net.minecraft.structure.rule.TagMatchRuleTest;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.FeatureConfig;
import net.minecraft.world.gen.feature.OreFeatureConfig;

import java.util.List;

public class ModConfiguredFeatures {
    public static final RegistryKey<ConfiguredFeature<?, ?>> TESTIUM_ORE_KEY = registerKey("testium_ore");

    public static void bootstrap(Registerable<ConfiguredFeature<?, ?>> context) {
        RuleTest stoneReplaceables = new TagMatchRuleTest(BlockTags.STONE_ORE_REPLACEABLES);
        RuleTest deepslateReplaceables = new TagMatchRuleTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);
        //RuleTest netherReplaceables = new TagMatchRuleTest(BlockTags.BASE_STONE_NETHER);
        //RuleTest endReplaceables = new TagMatchRuleTest(Blocks.END_STONE);

        List<OreFeatureConfig.Target> overworldTestiumOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, ModBlocks.TESTIUM_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplaceables, ModBlocks.DEEPSLATE_TESTIUM_ORE.getDefaultState()));

        //hier waeren sonst listen fuer nether und end

        register(context, TESTIUM_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldTestiumOres, 12));

        //hier waeren nether und end registered


    }

    public static RegistryKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, new Identifier(CascadianOres.MOD_ID, name));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<ConfiguredFeature<?, ?>> context,
                                                                                   RegistryKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }

}
