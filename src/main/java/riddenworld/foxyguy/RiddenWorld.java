package riddenworld.foxyguy;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import riddenworld.foxyguy.block.ModBlocks;
import riddenworld.foxyguy.item.ModItemGroups;
import riddenworld.foxyguy.item.ModItems;

public class RiddenWorld implements ModInitializer {
	public static final String MOD_ID = "riddenworld";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItemGroups.registerItemGroups();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}