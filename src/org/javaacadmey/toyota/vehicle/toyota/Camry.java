package org.javaacadmey.toyota.vehicle.toyota;

import org.javaacadmey.toyota.vehicle.PassengerCar;
import org.javaacadmey.toyota.vehicle.components.*;

public class Camry extends PassengerCar {
    private static final int WHEEL_DIAMETER = 17;
    private static final int MAX_SPEED = 250;
    private final Usb usb;

    public Camry(String color, FuelTank fuelTank, Engine engine, Electrics electrics, Headlights headlights, double cost, Cruise cruise, Usb usb) {
        super(color, MAX_SPEED, Transmission.AUTOMATIC, fuelTank, engine, electrics, headlights, cost, WHEEL_DIAMETER, cruise);
        this.usb = usb;
    }

    public void turnOnUsb() {
        usb.setWork(true);
    }

    public void turnOffUsb() {
        usb.setWork(false);
    }

}
