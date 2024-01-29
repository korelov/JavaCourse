package org.homework.module2.three.ex5;

public class Runner {
    public static void main(String[] args) {
        Ruler<Boat, Integer> boatRuler = Boat::getLength;
        Ruler<Animal, Integer> animalsRuler = animal
                -> animal.getBodyLength() + animal.getTailLength();

        System.out.println(boatRuler.ruler(new Boat(380)));
        System.out.println(animalsRuler.ruler(new Animal(120, 30)));
    }
}
