package net.jtz.cascadianores;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.jtz.cascadianores.block.ModBlocks;
import net.minecraft.client.render.RenderLayer;

public class CascadianOresClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.CUBERRY_CROP, RenderLayer.getCutout());

    }
}
