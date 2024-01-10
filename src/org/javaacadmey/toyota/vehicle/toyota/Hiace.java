package org.javaacadmey.toyota.vehicle.toyota;

import org.javaacadmey.toyota.factory.Country;
import org.javaacadmey.toyota.vehicle.Truck;
import org.javaacadmey.toyota.vehicle.components.*;

public class Hiace extends Truck {
    private static final int WHEEL_DIAMETER = 20;
    private static final int MAX_SPEED = 150;
    private static final int TONNAGE = 1_000;
    private final Wheel spareWheel;

    public Hiace(String color, FuelTank fuelTank, Engine engine, Electrics electrics, Headlights headlights, double cost, Country country) {
        super(color, MAX_SPEED, Transmission.MANUAL, fuelTank, engine, electrics, headlights, cost, WHEEL_DIAMETER, TONNAGE, country);
        this.spareWheel = new Wheel(WHEEL_DIAMETER);
    }
}
