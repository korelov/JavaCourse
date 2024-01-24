package org.homework.module2.two.ex1;

public class Runner {
    public static void main(String[] args) {
        Worker workerOne = new Worker("Максим");
        Worker workerTwo = new Worker("Олег");
        Worker workerThree = new Worker("Александр");
        BaggageCompartment baggageCompartment =
                new BaggageCompartment(workerOne, workerTwo, workerThree);
        baggageCompartment.load("SU-077");
        baggageCompartment.load("AO-222");

        baggageCompartment.unload();
    }
}
