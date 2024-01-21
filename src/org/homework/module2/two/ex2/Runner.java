package org.homework.module2.two.ex2;

import java.util.HashMap;
import java.util.Map;

public class Runner {
    public static void main(String[] args) {
        Map<Item, Integer> map = new HashMap<>();
        map.put(new Item("Яблоко"), 1);
        map.put(new Item("Банан"), 2);
        map.put(new Item("Апельсин"), 3);

        System.out.println(map.get(new Item("Апельсин")));
    }
}
