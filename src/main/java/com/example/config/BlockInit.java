package com.example.config;

import com.example.LarrysMod;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.MapColor;
import net.minecraft.block.enums.NoteBlockInstrument;
import net.minecraft.sound.BlockSoundGroup;

import java.util.HashMap;

public class BlockInit{

    private static final HashMap<String, Block> BLOCK_LIST = getBlocks();

    public BlockInit() {
        LarrysMod.LOGGER.error(String.valueOf(BLOCK_LIST));
    }
    private static HashMap<String, Block> getBlocks(){

        HashMap<String, Block> setBlocks = new HashMap<String, Block>();
        setBlocks.put(
                "box_carrots",
                new Block(AbstractBlock.Settings.create()
                        .strength(4f)
                        .requiresTool()
                        .instrument(NoteBlockInstrument.BASEDRUM)
                        .mapColor(MapColor.STONE_GRAY)));

        setBlocks.put(
                "solaris_block",
                new Block(AbstractBlock.Settings.create()
                        .strength(4f)
                        .requiresTool()
                        .instrument(NoteBlockInstrument.BASEDRUM)
                        .mapColor(MapColor.STONE_GRAY)));

        setBlocks.put(
                "solaris_vein",
                new Block(AbstractBlock.Settings.create()
                        .strength(4f)
                        .requiresTool()
                        .instrument(NoteBlockInstrument.BASEDRUM)
                        .mapColor(MapColor.STONE_GRAY)));

        return setBlocks;
    }

    public HashMap<String, Block> getBlockList(){
        return BLOCK_LIST;
    }

}
