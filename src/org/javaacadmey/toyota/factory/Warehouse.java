package org.javaacadmey.toyota.factory;

import org.javaacadmey.toyota.vehicle.Vehicle;

public class Warehouse {
    private int vehicleLimit = 1000;
    private final Vehicle[] vehicles = new Vehicle[vehicleLimit];
    private int currentVeniclesCount = 0;
    private int countCamry = 0;
    private int countDyna = 0;
    private int countHiace = 0;
    private int countSolara = 0;

    public Vehicle[] getVehicles() {
        return vehicles;
    }

    public int getCurrentVeniclesCount() {
        return currentVeniclesCount;
    }


    public void addCar(Vehicle vehicle) {
        for (int i = 0; i < vehicles.length; i++) {
            if (vehicles[i] == null) {
                vehicles[i] = vehicle;
                vehicleLimit--;
                currentVeniclesCount++;
                vehicleCount(vehicle.getModel(), true);
                return;
            }
        }
    }

    private void vehicleCount(String model, boolean addGet) {
        int incDec;
        if (addGet) {
            incDec = 1;
        } else {
            incDec = -1;
        }
        switch (model) {
            case "Camry" -> countCamry = countCamry + incDec;
            case "Dyna" -> countDyna = countDyna + incDec;
            case "Hiace" -> countHiace = countHiace + incDec;
            case "Solara" -> countSolara = countSolara + incDec;
        }
    }

    public Vehicle getVehicle(String model) {
        for (int i = 0; i < vehicles.length; i++) {
            if (vehicles[i] != null && vehicles[i].getModel().equals(model)) {
                vehicleLimit++;
                currentVeniclesCount--;
                vehicleCount(vehicles[i].getModel(), false);
                Vehicle vehicle = vehicles[i];
                vehicles[i] = null;
                return vehicle;
            }
        }
        return null;
    }

    public void showWarehouseVehicleCount() {
        System.out.println("На складе есть :\n"
                + "Camry= " + countCamry
                + ", Dyna= " + countDyna
                + ", Hiace= " + countHiace
                + ", Solara= " + countSolara);
    }
}

