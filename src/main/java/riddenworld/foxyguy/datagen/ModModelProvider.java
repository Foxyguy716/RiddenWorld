package riddenworld.foxyguy.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import riddenworld.foxyguy.block.ModBlocks;
import riddenworld.foxyguy.item.ModItems;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.COOL_AMBER_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.WARM_AMBER_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.HOT_AMBER_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CHAOTIC_AMBER_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.HARMONIC_AMBER_BLOCK);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.HOT_AMBER, Models.GENERATED);
        itemModelGenerator.register(ModItems.ACACIA_BARK, Models.GENERATED);
        itemModelGenerator.register(ModItems.BIRCH_BARK, Models.GENERATED);
        itemModelGenerator.register(ModItems.CHAOTIC_AMBER, Models.GENERATED);
        itemModelGenerator.register(ModItems.CHERRY_BARK, Models.GENERATED);
        itemModelGenerator.register(ModItems.COOL_AMBER, Models.GENERATED);
        itemModelGenerator.register(ModItems.CRIMSON_BARK, Models.GENERATED);
        itemModelGenerator.register(ModItems.DARK_OAK_BARK, Models.GENERATED);
        itemModelGenerator.register(ModItems.HARMONIC_AMBER, Models.GENERATED);
        itemModelGenerator.register(ModItems.JUNGLE_BARK, Models.GENERATED);
        itemModelGenerator.register(ModItems.MANGROVE_BARK, Models.GENERATED);
        itemModelGenerator.register(ModItems.OAK_BARK, Models.GENERATED);
        itemModelGenerator.register(ModItems.SPRUCE_BARK, Models.GENERATED);
        itemModelGenerator.register(ModItems.WARM_AMBER, Models.GENERATED);
        itemModelGenerator.register(ModItems.WARPED_BARK, Models.GENERATED);
        itemModelGenerator.register(ModItems.HARMONIC_SMITHING_TEMPLATE, Models.GENERATED);
    }
}
