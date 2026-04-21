package com.example.item;

import com.example.LarrysMod;
import com.example.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {

    /**
    public static final ItemGroup SPECIAL_ITEMS_GROUP = Registry.register(
            Registries.ITEM_GROUP, Identifier.of(LarrysMod.MOD_ID, "special_items_group"),
            FabricItemGroup.builder().icon(()-> new ItemStack(ModItems.PINK_UNICORN))
                    .displayName(Text.translatable("itemgroup.larrys-mod.special_items"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.PINK_UNICORN);
                    }).build());

    public static final ItemGroup FARMING_ITEMS_GROUP = Registry.register(
            Registries.ITEM_GROUP, Identifier.of(LarrysMod.MOD_ID, "farming_items_group"),
            FabricItemGroup.builder().icon(()-> new ItemStack(ModItems.FORKE))
                    .displayName(Text.translatable("itemgroup.larrys-mod.farming_items"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.FORKE);
                        entries.add(ModBlocks.BOX_CARROTS);
                    }).build());

    public static final ItemGroup MOD_BLOCK_GROUP = Registry.register(
            Registries.ITEM_GROUP, Identifier.of(LarrysMod.MOD_ID, "mod_block_group"),
            FabricItemGroup.builder().icon(()-> new ItemStack(ModBlocks.SOLARIS_BLOCK))
                    .displayName(Text.translatable("itemgroup.larrys-mod.mod_block_group"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModBlocks.SOLARIS_BLOCK);
                        entries.add(ModBlocks.SOLARIS_VEIN);
                    }).build());

    public static void registerItemGrous() {
        LarrysMod.LOGGER.info("Registrations of Moditem Groups for " + LarrysMod.MOD_ID);
    }*/
}
