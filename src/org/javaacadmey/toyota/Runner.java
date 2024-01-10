package org.javaacadmey.toyota;

import org.javaacadmey.toyota.exception.CountyFactoryNotEqualException;
import org.javaacadmey.toyota.exception.StartCarException;
import org.javaacadmey.toyota.factory.AssemblyLine;
import org.javaacadmey.toyota.factory.Country;
import org.javaacadmey.toyota.factory.Factory;


public class Runner {

    public static void main(String[] args) throws StartCarException, CountyFactoryNotEqualException {
        Factory factory = new Factory(Country.RUSSIA);
        AssemblyLine assemblyLine = new AssemblyLine(factory);
        assemblyLine.createCamry("black", 10_000);
    }

    public static void ex1() throws StartCarException {
//        Camry camry = new Camry("White", 200, new FuelTank(), new Engine(),
//                new Electrics(), new Headlights(), 10_000, new Cruise(), new Usb());
//        camry.refuelVehicle(50);
//        camry.turnOnHeadlights();
//        camry.turnOffHeadlights();
//        camry.turnOnUsb();
//        camry.turnOffUsb();
//        camry.stopMoving();
//        camry.startMoving();
//        camry.turnOnCruise();
//        camry.turnOffCruise();
//
//        Solara solara = new Solara("Red", 180, new FuelTank(), new Engine(),
//                new Electrics(), new Headlights(), 8_000, new Cruise(), new Roof(), new Fridge());
//        solara.turnRoofDown();
//        solara.turnRoofUp();
//        solara.turnOnFridge();
//        solara.turnOffFridge();
//
//        Hiace hiace = new Hiace("Black", 150, new FuelTank(), new Engine(),
//                new Electrics(), new Headlights(), 7_500, 600);
//        hiace.refuelVehicle(40);
//        hiace.startMoving();
//
//        Dyna dyna = new Dyna("Orange", 170, new FuelTank(), new Engine(),
//                new Electrics(), new Headlights(), 6_000, 700, new Charging());
//        dyna.chargingStatus();
//        dyna.turnOnCharging();
//        dyna.chargingStatus();
    }
}
