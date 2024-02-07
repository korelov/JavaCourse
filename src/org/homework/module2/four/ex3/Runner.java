package org.homework.module2.four.ex3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        Skyscraper worldTradeCenter = new Skyscraper("Всемирный торговый центр", 541);
        Skyscraper shanghaiTower = new Skyscraper("Шанхайская башня", 632);
        Skyscraper burjKhalifa = new Skyscraper("Бурдж-Халифа", 828);
        Skyscraper pinanInternationalFinancialCenter =
                new Skyscraper("Международный финансовый центр Пинань", 599);
        Skyscraper abrajAlBayt = new Skyscraper("Абрадж аль-Бейт", 601);
        Skyscraper lotteWorldCenter = new Skyscraper("Всемирный центр Лотте", 555);

        List<Skyscraper> skyscraperList = new ArrayList<>();
        skyscraperList.add(worldTradeCenter);
        skyscraperList.add(shanghaiTower);
        skyscraperList.add(burjKhalifa);
        skyscraperList.add(burjKhalifa);
        skyscraperList.add(pinanInternationalFinancialCenter);
        skyscraperList.add(abrajAlBayt);
        skyscraperList.add(lotteWorldCenter);

        //Убрать дубликаты
        List<Skyscraper> distinctSkyscraper = skyscraperList.stream().distinct().toList();
        distinctSkyscraper.forEach(skyscraper -> System.out.println(skyscraper));
        System.out.println("=====================\n");
        //Вывести только первые три небоскреба
        distinctSkyscraper.stream().limit(3).forEach(skyscraper -> System.out.println(skyscraper));
        System.out.println("=====================\n");
        //Вывести самый высокий небоскреб.
        distinctSkyscraper.stream()
                .max(Comparator.comparingInt(skyscraper1 -> skyscraper1.getHeight()))
                .ifPresent(skyscraper -> System.out.println("Самый высокий небоскреб - это " + skyscraper));
        System.out.println("=====================\n");
        //Вывести те небоскребы, которые выше километра.
        String string = distinctSkyscraper.stream()
                .filter(skyscraper -> skyscraper.getHeight() > 1000)
                .map(skyscraper -> skyscraper.toString())
                .reduce((s, s2) -> s + ", " + s2)
                .orElse("небоскреба выше километра - нет");
        System.out.println(string);
    }
}
