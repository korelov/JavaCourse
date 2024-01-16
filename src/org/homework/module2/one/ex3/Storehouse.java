package org.homework.module2.one.ex3;

import java.util.ArrayList;
import java.util.List;

public class Storehouse {
    private final List<Item> itemList;

    public Storehouse() {
        this.itemList = new ArrayList<>();
    }

    public void addItem(Item item) {
        this.itemList.add(item);
    }

    public void addItem(List<Item> itemList) {
        this.itemList.addAll(itemList);
    }

    public List<Item> getAllEvenItem() {
        List<Item> evenItems = new ArrayList<>();
        for (int i = 0; i < itemList.size(); i++) {
            if (i % 2 == 0) {
                evenItems.add(itemList.get(i));
            }
        }
        return evenItems;
    }

    public Item getItemByIndex(int index) {
        return itemList.remove(index);
    }

    public void clearItemListExpectLast() {
        itemList.subList(0, itemList.size() - 1).clear();
    }

    public void printAllItem() {
        for (Item item : itemList) {
            System.out.print(item.getName() + " ");
        }
        System.out.println();
    }
}
