package com.example.config;

import net.minecraft.item.Item;

import java.util.ArrayList;
import java.util.Arrays;

public class ItemInit {

    private static final ArrayList<String> ITEM_LIST = itemInit();

    private static ArrayList<String> itemInit(){
        ArrayList<String> itemList = new ArrayList<String>();

        itemList.add("pink_unicorn");
        itemList.add("forke");
        itemList.add("solaris_ore");
        itemList.add("solaris_ingot");

        return itemList;
    }


    public ArrayList<String> getItemList() {
        return ITEM_LIST;
    }

}
