package org.homework.two.shop;

public class Runner {

    public static void main(String[] args) {

        Item hammer = new Item(1000, "молот");
        Item screwdriver = new Item(50, "отвертка");
        Item notebook = new Item(30, "тетрадь");
        Item pen = new Item(10, "ручка");

        Worker workerOne = new Worker("Vasiliy", 30, 'M', hammer, screwdriver);
        Worker workerTwo = new Worker("Mariana", 25, 'F', notebook, pen);

        Shop shop = new Shop(workerOne, workerTwo);

        shop.printInfo();
        System.out.println("-----------------");
        shop.worker[0].boast();
        System.out.println("-----------------");
        shop.worker[1].boast();
    }
}
