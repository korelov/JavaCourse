package org.homework.module2.four.ex3;

public class Skyscraper {
    private String name;
    private int height;

    public Skyscraper(String name, int height) {
        this.name = name;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return name + ", Высота = " + height;
    }
}
