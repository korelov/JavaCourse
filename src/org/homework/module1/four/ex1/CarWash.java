package org.homework.module1.four.ex1;

public class CarWash {
    private static final int PRICE_PASSENGER_CAR = 2000;
    private static final int PRICE_TRUCKS = 4000;

    public int washCoast(Vehicle vehicle) {
        if (vehicle.getSize().getLength() > 6 || vehicle.getSize().getHeight() > 2.5
                || vehicle.getSize().getWidth() > 2) {
            return PRICE_TRUCKS;
        } else {
            return PRICE_PASSENGER_CAR;
        }
    }

    public int washCar(Vehicle vehicle) {
        vehicle.setClean(true);
        return washCoast(vehicle);
    }

    public int washCar(Vehicle[] vehicle) {
        int coast = 0;
        for (Vehicle value : vehicle) {
            coast += washCar(value);
        }
        return coast;
    }
}
