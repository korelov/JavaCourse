package org.homework.four.ex1;

public class Bus extends Vehicle {
    private final int maximumPassengers;

    public Bus(boolean isClean, double width, double height, double length) {
        super(isClean, width, height, length);
        this.maximumPassengers = 40;
    }

    public int getMaximumPassengers() {
        return maximumPassengers;
    }
}
