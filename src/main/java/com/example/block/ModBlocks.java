package com.example.block;

import com.example.LarrysMod;
import com.example.config.BlockInit;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.MapColor;
import net.minecraft.block.enums.NoteBlockInstrument;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

import java.util.ArrayList;

public class ModBlocks {

    private static final BlockInit blockinit = new BlockInit();
    private static final ArrayList<Block> BLOCK_LIST = setBlockList();

    private static ArrayList<Block> setBlockList() {
        ArrayList<Block> blocksToInit = new ArrayList<>();
        blockinit.getBlockList().forEach((String key, Block initBlock) -> {
            blocksToInit.add(registerBlock(key, initBlock));});
        return blocksToInit;
    }

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(LarrysMod.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(LarrysMod.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks() {
        LarrysMod.LOGGER.info("Registrations of Modblocks for " + LarrysMod.MOD_ID);

        for (Block blocks : BLOCK_LIST) {
            ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS)
                    .register( entries -> entries.add(blocks));
        }
    }
}
