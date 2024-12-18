package riddenworld.foxyguy.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import riddenworld.foxyguy.RiddenWorld;
import riddenworld.foxyguy.block.ModBlocks;

public class ModItemGroups {

    public static final ItemGroup RIDDEN_WORLD_ITEM_LIST = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(RiddenWorld.MOD_ID, "ridden_world_items"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.HOT_AMBER))
                    .displayName(Text.translatable("itemgroup.riddenworld.ridden_world_items"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.OAK_BARK);
                        entries.add(ModItems.SPRUCE_BARK);
                        entries.add(ModItems.BIRCH_BARK);
                        entries.add(ModItems.JUNGLE_BARK);
                        entries.add(ModItems.ACACIA_BARK);
                        entries.add(ModItems.DARK_OAK_BARK);
                        entries.add(ModItems.MANGROVE_BARK);
                        entries.add(ModItems.CHERRY_BARK);
                        entries.add(ModItems.CRIMSON_BARK);
                        entries.add(ModItems.WARPED_BARK);

                        entries.add(ModItems.COOL_AMBER);
                        entries.add(ModItems.WARM_AMBER);
                        entries.add(ModItems.HOT_AMBER);
                        entries.add(ModItems.CHAOTIC_AMBER);
                        entries.add(ModItems.HARMONIC_AMBER);

                        entries.add(ModBlocks.COOL_AMBER_BLOCK);
                        entries.add(ModBlocks.WARM_AMBER_BLOCK);
                        entries.add(ModBlocks.HOT_AMBER_BLOCK);
                        entries.add(ModBlocks.CHAOTIC_AMBER_BLOCK);
                        entries.add(ModBlocks.HARMONIC_AMBER_BLOCK);

                        entries.add(ModItems.HARMONIC_SMITHING_TEMPLATE);
                    }).build());

    public static void registerItemGroups() {
        RiddenWorld.LOGGER.info("Registering Groups :3");
    }
}
