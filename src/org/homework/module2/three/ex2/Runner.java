package org.homework.module2.three.ex2;

public class Runner {
    public static void main(String[] args) {
        Garden<Apple> appleFarm = Apple::new;
        Garden<Apricot> apricotFarm = Apricot::new;

        System.out.println(appleFarm.growFruits() != null);
        System.out.println(apricotFarm.growFruits() != null);
    }
}
