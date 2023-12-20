package org.homework.four.ex1;

public abstract class Vehicle {
    private boolean isClean;
    private final Size size;

    public Vehicle(boolean isClean, double width, double height, double length) {
        this.isClean = isClean;
        this.size = new Size(width, height, length);
    }

    public boolean isClean() {
        return isClean;
    }

    public void setClean(boolean clean) {
        isClean = clean;
    }

    public Size getSize() {
        return size;
    }
}
