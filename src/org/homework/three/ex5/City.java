package org.homework.three.ex5;

public final class City {

    private final String cityName;
    private final House[] houses;

    public City(String cityName, House[] houses) {
        this.cityName = cityName;
        House[] tempHouses = new House[houses.length];
        for (int i = 0; i < houses.length; i++) {
            tempHouses[i] = new House(houses[i].getStreetName(), houses[i].getHouseNumber());
        }
        this.houses = tempHouses;
    }

    @Override
    public String toString() {
        return String.format("Город %s в котором есть %d улицы %s",
                cityName, houses.length, printHouse());
    }

    public String printHouse() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < houses.length; i++) {
            if (i < houses.length - 1) {
                stringBuilder.append(houses[i].toString()).append("и ");
            } else {
                stringBuilder.append(houses[i].toString());
            }
        }
        return stringBuilder.toString();
    }
}
