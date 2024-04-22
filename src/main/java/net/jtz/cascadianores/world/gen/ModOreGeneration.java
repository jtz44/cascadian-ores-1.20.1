package net.jtz.cascadianores.world.gen;

import net.fabricmc.fabric.api.biome.v1.BiomeModification;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.jtz.cascadianores.world.ModPlacedFeatures;
import net.minecraft.world.gen.GenerationStep;

public class ModOreGeneration {
    public static void generateOres() {
        BiomeModification.addFeature???(BiomeSelectors.foundInOverworld(),
                GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.TESTIUM_ORE_PLACED_KEY);

    }
}
