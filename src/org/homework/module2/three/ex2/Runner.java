package org.homework.module2.three.ex2;

public class Runner {
    public static void main(String[] args) {
        Garden<Fruit> appleFarm = () -> {
            System.out.println("Выращиваю яблоки");
            return new Apple();
        };
        Garden<Fruit> apricotFarm = Apricot::new;

        System.out.println(appleFarm.growFruits().getClass());
        System.out.println(apricotFarm.growFruits().getClass());
    }
}
