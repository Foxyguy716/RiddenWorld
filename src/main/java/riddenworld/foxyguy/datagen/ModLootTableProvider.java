package riddenworld.foxyguy.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.registry.RegistryWrapper;
import riddenworld.foxyguy.block.ModBlocks;

import java.util.concurrent.CompletableFuture;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.COOL_AMBER_BLOCK);
        addDrop(ModBlocks.WARM_AMBER_BLOCK);
        addDrop(ModBlocks.HOT_AMBER_BLOCK);
        addDrop(ModBlocks.CHAOTIC_AMBER_BLOCK);
        addDrop(ModBlocks.HARMONIC_AMBER_BLOCK);
    }
}
