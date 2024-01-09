package org.javaacadmey.toyota.vehicle.toyota;

import org.javaacadmey.toyota.vehicle.Cabriolet;
import org.javaacadmey.toyota.vehicle.components.*;

public class Solara extends Cabriolet {
    private static final int WHEEL_DIAMETER = 16;
    private static final int MAX_SPEED = 150;
    private final Fridge fridge;

    public Solara(String color, FuelTank fuelTank, Engine engine, Electrics electrics, Headlights headlights, double cost, Cruise cruise, Roof roof, Fridge fridge) {
        super(color, MAX_SPEED, Transmission.AUTOMATIC, fuelTank, engine, electrics, headlights, cost, WHEEL_DIAMETER, cruise, roof);
        this.fridge = fridge;
    }

    public void turnOnFridge() {
        fridge.setWork(true);
    }

    public void turnOffFridge() {
        fridge.setWork(false);
    }
}
