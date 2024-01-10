package org.javaacadmey.toyota.vehicle;

import org.javaacadmey.toyota.exception.StartCarException;
import org.javaacadmey.toyota.factory.Country;
import org.javaacadmey.toyota.vehicle.components.*;

public abstract class Vehicle {
    private final String model;
    private String color;
    private int maxSpeed;
    private Transmission transmission;
    private boolean isMove;
    private Wheel[] wheels;
    private FuelTank fuelTank;
    private Engine engine;
    private Electrics electrics;
    private Headlights headlights;
    private double cost;
    private int diameter;
    private Country country;

    public Vehicle(String model, String color, int maxSpeed, Transmission transmission, FuelTank fuelTank, Engine engine, Electrics electrics, Headlights headlights, double cost, int diameter, Country country) {

        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.transmission = transmission;
        this.isMove = false;
        this.wheels = new Wheel[]{
                new Wheel(diameter),
                new Wheel(diameter),
                new Wheel(diameter),
                new Wheel(diameter)};
        this.fuelTank = fuelTank;
        this.engine = engine;
        this.electrics = electrics;
        this.headlights = headlights;
        this.cost = cost;
        this.diameter = diameter;
        this.country = country;
    }

    public void startMoving() throws StartCarException {
        isMove = (checkWheels() && checkWheelsPuncture()
                && checkFuelTank() && checkEngine() && checkElectrics());
        System.out.println("Машина поехала статус :" + isMove);
    }

    public void stopMoving() {
        isMove = false;
        System.out.println("Машина без движения статус :" + isMove);
    }

    public void refuelVehicle(int fuelCount) {
        fuelTank.setAmountFuel(fuelCount);
    }

    public void turnOnHeadlights() {
        headlights.setWork(true);
    }

    public void turnOffHeadlights() {
        headlights.setWork(false);
    }

    public String getModel() {
        return model;
    }

    private boolean checkWheels() throws StartCarException {
        for (Wheel wheel : wheels) {
            if (wheel == null) {
                throw new StartCarException("не все колеса");
            }
        }
        return true;
    }

    private boolean checkWheelsPuncture() throws StartCarException {
        for (Wheel wheel : wheels) {
            if (wheel.isPuncture()) {
                throw new StartCarException("колесо проколото");
            }
        }
        return true;
    }

    private boolean checkFuelTank() throws StartCarException {
        if (fuelTank.getAmountFuel() == 0) {
            throw new StartCarException("бензобак пустой");
        }
        return true;
    }

    private boolean checkElectrics() throws StartCarException {
        if (!electrics.isWork()) {
            throw new StartCarException("электрика не работают");
        }
        return true;
    }

    private boolean checkEngine() throws StartCarException {
        if (!engine.isWork()) {
            throw new StartCarException("мотор не работает");
        }
        return true;
    }
}