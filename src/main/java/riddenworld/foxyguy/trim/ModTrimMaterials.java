package riddenworld.foxyguy.trim;

import net.minecraft.item.Item;
import net.minecraft.item.trim.ArmorTrimMaterial;
import net.minecraft.registry.*;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.text.Style;
import net.minecraft.text.Text;
import net.minecraft.text.TextColor;
import net.minecraft.util.Identifier;
import net.minecraft.util.Util;
import riddenworld.foxyguy.RiddenWorld;
import riddenworld.foxyguy.item.ModItems;

import java.util.Map;

public class ModTrimMaterials {

    public static final RegistryKey<ArmorTrimMaterial> CHAOTIC_AMBER = RegistryKey.of(RegistryKeys.
            TRIM_MATERIAL, Identifier.of(RiddenWorld.MOD_ID, "chaotic_amber"));

    public static void bootstrap(Registerable<ArmorTrimMaterial> registerable) {
        register(registerable, CHAOTIC_AMBER, Registries.ITEM.getEntry(ModItems.CHAOTIC_AMBER),
                Style.EMPTY.withColor(TextColor.parse("#b03fe0").getOrThrow()), 1.0f);
    }

    private static void register(Registerable<ArmorTrimMaterial> registerable, RegistryKey<ArmorTrimMaterial> armorTrimKey,
                                 RegistryEntry<Item> item, Style style, float itemModelIndex) {
        ArmorTrimMaterial trimMaterial = new ArmorTrimMaterial(armorTrimKey.getValue().getPath(), item, itemModelIndex, Map.of(),
                Text.translatable(Util.createTranslationKey("trim_material", armorTrimKey.getValue())).fillStyle(style));

        registerable.register(armorTrimKey, trimMaterial);
    }
}
