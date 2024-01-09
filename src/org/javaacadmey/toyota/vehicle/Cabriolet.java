package org.javaacadmey.toyota.vehicle;

import org.javaacadmey.toyota.vehicle.components.*;

public abstract class Cabriolet extends PassengerCar {
    private final Roof roof;

    public Cabriolet(String color, int maxSpeed, Transmission transmission, FuelTank fuelTank, Engine engine, Electrics electrics, Headlights headlights, double cost, int diameter, Cruise cruise, Roof roof) {
        super(color, maxSpeed, transmission, fuelTank, engine, electrics, headlights, cost, diameter, cruise);
        this.roof = roof;
    }

    public void turnRoofDown() {
        roof.setRoofUp(false);
    }

    public void turnRoofUp() {
        roof.setRoofUp(true);
    }
}
