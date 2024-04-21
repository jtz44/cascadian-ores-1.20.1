package net.jtz.cascadianores;

import net.fabricmc.api.ModInitializer;

import net.jtz.cascadianores.block.ModBlocks;
import net.jtz.cascadianores.item.ModItemGroups;
import net.jtz.cascadianores.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CascadianOres implements ModInitializer {
	public static final String MOD_ID = "cascadian-ores";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}