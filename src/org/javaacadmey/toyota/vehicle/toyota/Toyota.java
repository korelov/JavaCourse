package org.javaacadmey.toyota.vehicle.toyota;

public enum Toyota {
    CAMRY("Camry", 17, 210),
    DYNA("Dyna", 20, 105),
    HIACE("Hiace", 20, 155),
    SOLARA("Solara", 16, 180);
    private final String model;
    private final int diameter;
    private final int maxSpeed;

    Toyota(String model, int diameter, int maxSpeed) {
        this.model = model;
        this.diameter = diameter;
        this.maxSpeed = maxSpeed;
    }

    public String getModel() {
        return model;
    }

    public int getDiameter() {
        return diameter;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }
}
