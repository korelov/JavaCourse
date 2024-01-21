package org.homework.module2.two.ex1;

import java.util.Queue;

public class Worker {
    private String name;

    public Worker(String name) {
        this.name = name;
    }

    public void throwSuitcase(Queue<Suitcase> suitcases) {
        System.out.println(name + ": Мужики, кидаю чемодан " + suitcases.poll().getFlightNumber());
    }
}
