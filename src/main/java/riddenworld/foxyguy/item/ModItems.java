package riddenworld.foxyguy.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import riddenworld.foxyguy.RiddenWorld;

public class ModItems {

    public static final Item OAK_BARK = registerItem("oak_bark", new Item(new Item.Settings()));
    public static final Item SPRUCE_BARK = registerItem("spruce_bark", new Item(new Item.Settings()));
    public static final Item BIRCH_BARK = registerItem("birch_bark", new Item(new Item.Settings()));
    public static final Item JUNGLE_BARK = registerItem("jungle_bark", new Item(new Item.Settings()));
    public static final Item ACACIA_BARK = registerItem("acacia_bark", new Item(new Item.Settings()));
    public static final Item DARK_OAK_BARK = registerItem("dark_oak_bark", new Item(new Item.Settings()));
    public static final Item MANGROVE_BARK = registerItem("mangrove_bark", new Item(new Item.Settings()));
    public static final Item CHERRY_BARK = registerItem("cherry_bark", new Item(new Item.Settings()));
    public static final Item CRIMSON_BARK = registerItem("crimson_bark", new Item(new Item.Settings()));
    public static final Item WARPED_BARK = registerItem("warped_bark", new Item(new Item.Settings()));

    public static final Item COOL_AMBER = registerItem("cool_amber", new Item(new Item.Settings().food(ModFoodComponents.BLAND_AMBER)));
    public static final Item WARM_AMBER = registerItem("warm_amber", new Item(new Item.Settings().food(ModFoodComponents.BLAND_AMBER)));
    public static final Item HOT_AMBER = registerItem("hot_amber", new Item(new Item.Settings().food(ModFoodComponents.BLAND_AMBER)));
    public static final Item CHAOTIC_AMBER = registerItem("chaotic_amber", new Item(new Item.Settings().food(ModFoodComponents.CHAOTIC_AMBER)));
    public static final Item HARMONIC_AMBER = registerItem("harmonic_amber", new Item(new Item.Settings().food(ModFoodComponents.HARMONIC_AMBER)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(RiddenWorld.MOD_ID, name), item);
    }

    public static void registerModItems() {
        RiddenWorld.LOGGER.info(":3");

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(OAK_BARK);
            entries.add(SPRUCE_BARK);
            entries.add(BIRCH_BARK);
            entries.add(JUNGLE_BARK);
            entries.add(ACACIA_BARK);
            entries.add(DARK_OAK_BARK);
            entries.add(MANGROVE_BARK);
            entries.add(CHERRY_BARK);
            entries.add(CRIMSON_BARK);
            entries.add(WARPED_BARK);

            entries.add(COOL_AMBER);
            entries.add(WARM_AMBER);
            entries.add(HOT_AMBER);
            entries.add(CHAOTIC_AMBER);
            entries.add(HARMONIC_AMBER);
        });
    }

}
