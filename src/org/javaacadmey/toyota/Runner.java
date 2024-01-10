package org.javaacadmey.toyota;

import org.javaacadmey.toyota.exception.CountyFactoryNotEqualException;
import org.javaacadmey.toyota.exception.StartCarException;
import org.javaacadmey.toyota.factory.AssemblyLine;
import org.javaacadmey.toyota.factory.Country;
import org.javaacadmey.toyota.factory.Factory;
import org.javaacadmey.toyota.factory.Warehouse;
import org.javaacadmey.toyota.vehicle.Vehicle;
import org.javaacadmey.toyota.vehicle.toyota.*;


public class Runner {

    public static void main(String[] args) throws StartCarException, CountyFactoryNotEqualException {
        Factory factory = new Factory(Country.CHINA);
        AssemblyLine assemblyLine = new AssemblyLine(factory);

        Camry camry = assemblyLine.createCamry("black", 10_000);
        Solara solara = assemblyLine.createSolara("white", 12_000);
        Hiace hiace = assemblyLine.createHiace("black", 15_000);
        Dyna dyna = assemblyLine.createDyna("black", 22_000);

        Warehouse warehouse = new Warehouse();

        warehouse.addCar(camry);
        warehouse.addCar(solara);
        warehouse.addCar(hiace);
        warehouse.addCar(dyna);

        System.out.println(warehouse.getCurrentVeniclesCount());

        Vehicle[] vehicles = warehouse.getVehicles();
        for (int i = 0; i < vehicles.length; i++) {
            if (vehicles[i] != null) {
                System.out.println(vehicles[i].getModel());
            }
        }

        warehouse.showWarehouseVehicleCount();
    }
}
