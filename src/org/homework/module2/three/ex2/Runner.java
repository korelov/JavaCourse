package org.homework.module2.three.ex2;

public class Runner {
    public static void main(String[] args) {
        Garden appleFarm = () -> {
            System.out.println("Отдаю яблоки");
        };

        Garden apricotFarm = () -> {
            System.out.println("Отдаю абрикосы");
        };

        appleFarm.growFruits();
        apricotFarm.growFruits();
    }
}
