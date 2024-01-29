package org.homework.module2.three.ex3;

public class Runner {
    public static void main(String[] args) {
        Divination<String> chamomile = name -> name.length() % 2 == 0 ? "Да" : "Нет";
        Divination<Human> granny = human -> human.getAge() + human.getHeight() > 210 ? "Да" : "Нет";

        System.out.println(chamomile.divination("Максим Корелов"));
        System.out.println(chamomile.divination("Иван Иванов"));
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");
        Human maksim = new Human(40, 175);
        Human petr = new Human(22, 165);
        System.out.println(granny.divination(maksim));
        System.out.println(granny.divination(petr));
    }
}
