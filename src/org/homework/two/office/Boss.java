package org.homework.two.office;

public class Boss {

    private final String name;

    public Boss(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void say(Manager manager) {
        System.out.println(manager.getName() + " быстрее!");
    }
}
