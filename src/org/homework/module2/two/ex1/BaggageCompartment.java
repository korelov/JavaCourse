package org.homework.module2.two.ex1;

import java.util.LinkedList;
import java.util.Queue;

public class BaggageCompartment {
    private final Queue<Suitcase> suitcaseLinkedList = new LinkedList<>();
    private final Worker workerOne;
    private final Worker workerTwo;
    private final Worker workerThree;
    private static final int MAXIMUM_FLIGHT_LOAD_LIMIT = 20;

    public BaggageCompartment(Worker workerOne, Worker workerTwo, Worker workerThree) {
        if (workerOne != null && workerTwo != null && workerThree != null) {
            this.workerOne = workerOne;
            this.workerTwo = workerTwo;
            this.workerThree = workerThree;
        }
        throw new NullPointerException("Не все рабочие пришли на смену");
    }

    public void load(String flightNumber) {
        for (int i = 0; i < MAXIMUM_FLIGHT_LOAD_LIMIT; i++) {
            suitcaseLinkedList.add(new Suitcase(flightNumber));
        }
    }

    public void unload() {
        Worker[] workers = {workerOne, workerTwo, workerThree};
        while (!suitcaseLinkedList.isEmpty()) {
            for (Worker worker : workers) {
                if (suitcaseLinkedList.isEmpty()) {
                    System.out.println("Багажное отделение пустое !");
                    break;
                }
                worker.throwSuitcase(suitcaseLinkedList);
            }
        }
    }
}
