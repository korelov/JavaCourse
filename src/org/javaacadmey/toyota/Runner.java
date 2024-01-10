package org.javaacadmey.toyota;

import org.javaacadmey.toyota.exception.CountyFactoryNotEqualException;
import org.javaacadmey.toyota.exception.StartCarException;
import org.javaacadmey.toyota.factory.AssemblyLine;
import org.javaacadmey.toyota.factory.Country;
import org.javaacadmey.toyota.factory.Factory;
import org.javaacadmey.toyota.vehicle.toyota.Camry;
import org.javaacadmey.toyota.vehicle.toyota.Dyna;


public class Runner {

    public static void main(String[] args) throws StartCarException, CountyFactoryNotEqualException {
        Factory factory = new Factory(Country.RUSSIA);
        AssemblyLine assemblyLine = new AssemblyLine(factory);
        Camry camry = assemblyLine.createCamry("black", 10_000);
        System.out.println(camry.getModel());
        Dyna dyna = assemblyLine.createDyna("Red", 10000);
        System.out.println(dyna.getModel());
    }
}
