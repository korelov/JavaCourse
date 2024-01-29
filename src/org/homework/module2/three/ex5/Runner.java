package org.homework.module2.three.ex5;

public class Runner {
    public static void main(String[] args) {
        Ruler<Boat> boatRuler = Boat::getLength;
        Ruler<Animals> animalsRuler = animals -> animals.getBodyLength() + animals.getTailLength();

        System.out.println(boatRuler.ruler(new Boat(380)));
        System.out.println(animalsRuler.ruler(new Animals(120, 30)));
    }
}
