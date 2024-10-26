package net.watakak;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NaturesLife implements ModInitializer {
	public static final String MOD_ID = "natures-life";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		LOGGER.info("Nature's Life SNAPSHOT-1.0 launched successfuly.");
	}
}