package org.javaacadmey.toyota.vehicle;

import org.javaacadmey.toyota.factory.Country;
import org.javaacadmey.toyota.vehicle.components.*;

public abstract class Truck extends Vehicle {
    protected final int tonnage;

    public Truck(String color, int maxSpeed, Transmission transmission, FuelTank fuelTank, Engine engine, Electrics electrics, Headlights headlights, double cost, int diameter, int tonnage, Country country) {
        super(color, maxSpeed, transmission, fuelTank, engine, electrics, headlights, cost, diameter, country);
        this.tonnage = tonnage;
    }
}
