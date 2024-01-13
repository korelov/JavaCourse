package org.homework.module1.two.office;

public class Manager {

    private final String name;

    public Manager(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void say() {
        System.out.println("Я ничего не успеваю, помогите!");
    }
}
