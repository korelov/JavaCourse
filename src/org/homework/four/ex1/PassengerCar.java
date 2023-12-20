package org.homework.four.ex1;

public class PassengerCar extends Vehicle {
    private boolean isCruiseControl;

    public PassengerCar(boolean isClean, double width, double height, double length) {
        super(isClean, width, height, length);
    }

    public boolean isCruiseControl() {
        return isCruiseControl;
    }

    public void setCruiseControl(boolean cruiseControl) {
        isCruiseControl = cruiseControl;
    }
}
