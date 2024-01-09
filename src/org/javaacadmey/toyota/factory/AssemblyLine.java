package org.javaacadmey.toyota.factory;

import org.javaacadmey.toyota.vehicle.toyota.Camry;
import org.javaacadmey.toyota.vehicle.toyota.Dyna;
import org.javaacadmey.toyota.vehicle.toyota.Hiace;
import org.javaacadmey.toyota.vehicle.toyota.Solara;

public class AssemblyLine {

    private final Factory factory;

    public AssemblyLine(Factory factory) {
        this.factory = factory;
    }

    public Camry createCamry(String color, double cost) {
        return new Camry(color, factory.getFuelTank(), factory.getEngine(), factory.getElectrics(), factory.getHeadlights(), cost, factory.getCruise(), factory.getUsb());
    }

    public Solara createSolara(String color, double cost) {

        return new Solara(color, factory.getFuelTank(), factory.getEngine(), factory.getElectrics(), factory.getHeadlights(), cost, factory.getCruise(), factory.getRoof(), factory.getFridge());
    }

    public Hiace createHiance(String color, double cost) {
        return new Hiace(color, factory.getFuelTank(), factory.getEngine(), factory.getElectrics(), factory.getHeadlights(), cost);
    }

    public Dyna createDyna(String color, double cost) {
        return new Dyna(color, factory.getFuelTank(), factory.getEngine(), factory.getElectrics(), factory.getHeadlights(), cost, factory.getCharging());
    }


}
