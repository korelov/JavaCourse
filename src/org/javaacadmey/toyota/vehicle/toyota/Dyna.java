package org.javaacadmey.toyota.vehicle.toyota;

import org.javaacadmey.toyota.factory.Country;
import org.javaacadmey.toyota.vehicle.Truck;
import org.javaacadmey.toyota.vehicle.components.*;

public class Dyna extends Truck {
    private static final String MODEL = "Dyna";
    private static final int WHEEL_DIAMETER = 20;
    private static final int MAX_SPEED = 120;
    private static final int TONNAGE = 2_000;
    private final Charging charging;

    public Dyna(String color, FuelTank fuelTank, Engine engine, Electrics electrics, Headlights headlights, double cost, Charging charging, Country country) {
        super(MODEL, color, MAX_SPEED, Transmission.ROBOT, fuelTank, engine, electrics, headlights, cost, WHEEL_DIAMETER, TONNAGE, country);
        this.charging = charging;
    }

    public void turnOnCharging() {
        charging.setWork(true);
    }

    public void turnOffCharging() {
        charging.setWork(false);
    }

    public void chargingStatus() {
        System.out.println(charging.isWork());
    }
}
