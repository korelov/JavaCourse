package org.homework.module1.two.office;

public class Security {

    private final String name;

    public Security(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void say() {
        System.out.println("Дайте мне аванс !!");
    }
}
