package com.example;

import com.example.block.ModBlocks;
import com.example.item.ModItemGroups;
import com.example.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.yaml.snakeyaml.Yaml;
import java.io.File;
import java.io.InputStream;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Map;
import java.util.stream.Stream;
public class LarrysMod implements ModInitializer {
	public static final String MOD_ID = "larrys-mod";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

        //ModItemGroups.registerItemGrous();
        ModItems.registerModItems();
        ModBlocks.registerModBlocks();
	}
}