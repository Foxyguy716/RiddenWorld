package riddenworld.foxyguy.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import riddenworld.foxyguy.block.ModBlocks;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(BlockTags.HOE_MINEABLE)
                .add(ModBlocks.COOL_AMBER_BLOCK)
                .add(ModBlocks.WARM_AMBER_BLOCK)
                .add(ModBlocks.HOT_AMBER_BLOCK)
                .add(ModBlocks.CHAOTIC_AMBER_BLOCK)
                .add(ModBlocks.HARMONIC_AMBER_BLOCK);

        getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.COOL_AMBER_BLOCK)
                .add(ModBlocks.WARM_AMBER_BLOCK)
                .add(ModBlocks.HOT_AMBER_BLOCK);

        getOrCreateTagBuilder(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(ModBlocks.CHAOTIC_AMBER_BLOCK)
                .add(ModBlocks.HARMONIC_AMBER_BLOCK);

        getOrCreateTagBuilder(BlockTags.WITHER_IMMUNE)
                .add(ModBlocks.CHAOTIC_AMBER_BLOCK)
                .add(ModBlocks.HARMONIC_AMBER_BLOCK);

        getOrCreateTagBuilder(BlockTags.DAMPENS_VIBRATIONS)
                .add(ModBlocks.HARMONIC_AMBER_BLOCK);

        getOrCreateTagBuilder(BlockTags.FALL_DAMAGE_RESETTING)
                .add(ModBlocks.CHAOTIC_AMBER_BLOCK);
    }
}
