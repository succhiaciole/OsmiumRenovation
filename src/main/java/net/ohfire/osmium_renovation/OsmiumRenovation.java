package net.ohfire.osmium_renovation;

import net.fabricmc.api.ModInitializer;

import net.ohfire.osmium_renovation.init.OsmiumGroups;
import net.ohfire.osmium_renovation.init.OsmiumItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class OsmiumRenovation implements ModInitializer {
	public static final String MOD_ID = "osmium_renovation";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Hello Fabric world!");

		OsmiumItems.registerModItems();
        OsmiumGroups.registerGroups();
	}
}