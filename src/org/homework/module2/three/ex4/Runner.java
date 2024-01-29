package org.homework.module2.three.ex4;

public class Runner {
    public static void main(String[] args) {
        Burning<Uranium> nuclearReactor = uranium -> System.out.println("зеленый свет вокруг!");
        Burning<Wood> bonfire = wood -> System.out.println("желто-красный свет вокруг!");

        nuclearReactor.burning(new Uranium());
        bonfire.burning(new Wood());
    }
}
