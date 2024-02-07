package org.homework.module2.four.ex2;

import java.util.Arrays;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        List<String> stringList = List.of("тонь", "тополь", "боль", "рой", "стройка");
        int number = stringList.stream()
                .distinct()
                .flatMap(s -> Arrays.stream(s.split("")))
                .filter(anObject -> "о".equals(anObject))
                .reduce((s, s2) -> s + s2.length())
                .map(s -> s.length())
                .orElseThrow(() -> new RuntimeException("нет буквы о"));
        System.out.println(number);
    }
}
