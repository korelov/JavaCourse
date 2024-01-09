package org.javaacadmey.toyota.vehicle;

import org.javaacadmey.toyota.vehicle.components.*;

public abstract class PassengerCar extends Vehicle {

    private final Cruise cruise;

    public PassengerCar(String color, int maxSpeed, Transmission transmission, FuelTank fuelTank, Engine engine, Electrics electrics, Headlights headlights, double cost, int diameter, Cruise cruise) {
        super(color, maxSpeed, transmission, fuelTank, engine, electrics, headlights, cost, diameter);
        this.cruise = cruise;
    }

    public void turnOnCruise() {
        cruise.setCruiseControl(true);
    }

    public void turnOffCruise() {
        cruise.setCruiseControl(false);
    }

}
