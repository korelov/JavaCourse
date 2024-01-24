package org.homework.module2.two.ex2;

import java.util.HashMap;
import java.util.Map;

public class Runner {
    public static void main(String[] args) {
        Item item1 = new Item("Яблоко");
        Item item2 = new Item("Банан");
        Item item3 = new Item("Апельсин");
        Map<Item, Integer> map = new HashMap<>();
        map.put(item1, 1);
        map.put(item2, 2);
        map.put(item3, 3);
        System.out.println(map);
        System.out.println(map.containsKey(item3));
        System.out.println(map.get(new Item("Апельсин")));
        System.out.println(map.get(item3));
    }
}
