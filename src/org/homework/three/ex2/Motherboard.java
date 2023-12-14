package org.homework.three.ex2;

public class Motherboard {

    private final String name;
    private final int width;
    private final int length;
    private final int height;

    public Motherboard(String name, int width, int length, int height) {
        this.name = name;
        this.width = width;
        this.length = length;
        this.height = height;
    }

    public String printInfo() {
        return String.format("Плата %s (размер %dx%dx%d)", name, width, length, height);
    }
}
