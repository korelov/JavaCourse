package org.homework.two.office;

public class Boss {

    static String name;

    public Boss(String name) {
        this.name = name;
    }

    public void say() {
        System.out.println(Manager.name + " быстрее!");
    }
}
