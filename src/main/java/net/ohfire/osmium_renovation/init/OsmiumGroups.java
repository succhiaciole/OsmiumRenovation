package net.ohfire.osmium_renovation.init;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.ohfire.osmium_renovation.OsmiumRenovation;

public class OsmiumGroups {
    public static final ItemGroup OSMIUM_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(OsmiumRenovation.MOD_ID, "osmium"),
            FabricItemGroup.builder().displayName(Text.translatable("group.osmium"))
                    .icon(() -> new ItemStack(OsmiumItems.OSMIUM_INGOT)).entries((displayContext, entries) -> {
                        entries.add(OsmiumItems.OSMIUM_INGOT);
                        entries.add(OsmiumItems.RAW_OSMIUM);
                    }).build());


    public static void registerGroups() {
        OsmiumRenovation.LOGGER.info("Registering Item Groups for " + OsmiumRenovation.MOD_ID);
    }
}
