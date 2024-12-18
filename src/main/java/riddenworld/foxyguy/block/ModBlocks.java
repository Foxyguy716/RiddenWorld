package riddenworld.foxyguy.block;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import riddenworld.foxyguy.RiddenWorld;

public class ModBlocks {

    public static final Block COOL_AMBER_BLOCK = registerBlock("cool_amber_block", new Block(AbstractBlock.Settings.create()
            .strength(4f).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK)));
    public static final Block WARM_AMBER_BLOCK = registerBlock("warm_amber_block", new Block(AbstractBlock.Settings.create()
            .strength(4f).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK)));
    public static final Block HOT_AMBER_BLOCK = registerBlock("hot_amber_block", new Block(AbstractBlock.Settings.create()
            .strength(4f).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK)));
    public static final Block CHAOTIC_AMBER_BLOCK = registerBlock("chaotic_amber_block", new Block(AbstractBlock.Settings.create()
            .strength(4f).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK)));
    public static final Block HARMONIC_AMBER_BLOCK = registerBlock("harmonic_amber_block", new Block(AbstractBlock.Settings.create()
            .strength(4f).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK)));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(RiddenWorld.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(RiddenWorld.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks() {
        RiddenWorld.LOGGER.info("Blocks Registering :3");

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> {
            entries.add(ModBlocks.COOL_AMBER_BLOCK);
            entries.add(ModBlocks.WARM_AMBER_BLOCK);
            entries.add(ModBlocks.HOT_AMBER_BLOCK);
            entries.add(ModBlocks.CHAOTIC_AMBER_BLOCK);
            entries.add(ModBlocks.HARMONIC_AMBER_BLOCK);
        });
    }
}
