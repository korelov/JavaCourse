package org.homework.module2.one.ex3;

import java.util.ArrayList;
import java.util.List;

public class Storehouse {
    private List<Item> itemList;

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

    public void printAllItem() {
        for (Item item : itemList) {
            System.out.print(item.getName() + " ");
        }
    }
}
