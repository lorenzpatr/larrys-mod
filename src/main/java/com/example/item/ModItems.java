package com.example.item;

import com.example.LarrysMod;
import com.example.config.ItemInit;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import java.util.ArrayList;

public class ModItems {

    public static final Item PINK_UNICORN = registerItem("pink_unicorn", new Item(new Item.Settings()));
    public static final Item FORKE = registerItem("forke", new Item(new Item.Settings()));
    public static final Item SOLARIS_ORE = registerItem("solaris_ore", new Item(new Item.Settings()));
    public static final Item SOLARIS_INGOT = registerItem("solaris_ingot", new Item(new Item.Settings()));
    public static final ArrayList<Item> ITEM_LIST = getItemList();

    public static ArrayList<Item> getItemList() {
        ItemInit initItems = new ItemInit();
        ArrayList<Item> initItemList = new ArrayList<Item>();
        for (String name : initItems.getItemList()) {
            initItemList.add(registerItem(name, new Item(new Item.Settings())));
        }
        return initItemList;
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(LarrysMod.MOD_ID, name), item);
    }


    public static void registerModItems() {
        LarrysMod.LOGGER.info("Registrations of Moditems for " + LarrysMod.MOD_ID);

        for(Item item : ITEM_LIST)
        {
            ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
                entries.add(item);});
        }
    }
}

