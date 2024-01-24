package org.homework.module2.two.ex3;

import java.util.HashMap;
import java.util.Map;

public class Runner {
    public static void main(String[] args) {
        Detail detail1 = new Detail("Пила");
        Detail detail2 = new Detail("Молоток");
        Detail detail3 = new Detail("Отвертка");
        Map<Detail, Integer> map = new HashMap<>();
        map.put(detail1, 1);
        map.put(detail2, 2);
        map.put(detail3, 3);
        System.out.println(map);
    }
}
