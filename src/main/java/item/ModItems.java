package item;

import io.github.piecrusher65.manymanytools.ManyManyTools;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item CARDBOARD = registerItem("cardboard", new Item(new Item.Settings()));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(ManyManyTools.MOD_ID, name), item);
    }


    public static void registerModItems() {
        ManyManyTools.LOGGER.info("Registering Mod Items " + ManyManyTools.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(CARDBOARD);
        });
    }
}
