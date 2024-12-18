package riddenworld.foxyguy.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.CampfireCookingRecipe;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.util.Identifier;
import riddenworld.foxyguy.RiddenWorld;
import riddenworld.foxyguy.block.ModBlocks;
import riddenworld.foxyguy.item.ModItems;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter exporter) {

        List<ItemConvertible> HARMONIC_GAS = List.of(ModItems.HARMONIC_AMBER);
        List<ItemConvertible> CHAOTIC_TO_HARMONIC = List.of(ModItems.CHAOTIC_AMBER);
        List<ItemConvertible> BARK_TO_COOL = List.of(ModItems.SPRUCE_BARK, ModItems.CHERRY_BARK, ModItems.MANGROVE_BARK);
        List<ItemConvertible> BARK_TO_WARM = List.of(ModItems.DARK_OAK_BARK, ModItems.BIRCH_BARK, ModItems.OAK_BARK, ModItems.ACACIA_BARK);
        List<ItemConvertible> BARK_TO_HOT = List.of(ModItems.JUNGLE_BARK, ModItems.CRIMSON_BARK, ModItems.WARPED_BARK);

        offerBlasting(exporter, HARMONIC_GAS, RecipeCategory.FOOD, Items.CHARCOAL, 8000.0f, 864000, "Harmonic_Gas");
        offerBlasting(exporter, CHAOTIC_TO_HARMONIC, RecipeCategory.FOOD, ModItems.HARMONIC_AMBER, 10.0f, 12000, "Chaotic_Harmonic_Short");
        offerSmelting(exporter, CHAOTIC_TO_HARMONIC, RecipeCategory.FOOD, ModItems.HARMONIC_AMBER, 500.0f, 72000, "Chaotic_Harmonic_Long");

        offerBlasting(exporter, BARK_TO_COOL, RecipeCategory.FOOD, ModItems.COOL_AMBER, 0.9f, 900, "Bark_Cool");
        offerBlasting(exporter, BARK_TO_WARM, RecipeCategory.FOOD, ModItems.WARM_AMBER, 0.6f, 600, "Bark_Warm");
        offerBlasting(exporter, BARK_TO_HOT, RecipeCategory.FOOD, ModItems.HOT_AMBER, 0.3f, 300, "Bark_Hot");

        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.COOL_AMBER, RecipeCategory.BUILDING_BLOCKS, ModBlocks.COOL_AMBER_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.WARM_AMBER, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WARM_AMBER_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.HOT_AMBER, RecipeCategory.BUILDING_BLOCKS, ModBlocks.HOT_AMBER_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.CHAOTIC_AMBER, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHAOTIC_AMBER_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.HARMONIC_AMBER, RecipeCategory.BUILDING_BLOCKS, ModBlocks.HARMONIC_AMBER_BLOCK);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.CHAOTIC_AMBER, 3)
                .input(ModItems.COOL_AMBER) .input(ModItems.WARM_AMBER) .input(ModItems.HOT_AMBER)
                .offerTo(exporter, Identifier.of(RiddenWorld.MOD_ID, "chaotic_amber_combine_craft"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.HARMONIC_AMBER, 2)
                .input(ModItems.CHAOTIC_AMBER) .input(Items.ECHO_SHARD)
                .offerTo(exporter, Identifier.of(RiddenWorld.MOD_ID, "harmonic_amber_combine_craft"));

        offerSmithingTrimRecipe(exporter, ModItems.HARMONIC_SMITHING_TEMPLATE, Identifier.of(RiddenWorld.MOD_ID, "harmony"));
    }
}
