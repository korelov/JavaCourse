package org.homework.module2.four.ex1;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Runner {

    public static void main(String[] args) {
        AtomicInteger atomicIntegerOne = new AtomicInteger(0);
        List<Car> carListOne = Stream
                .generate(() -> new Car(String.format("a0%02dан799", atomicIntegerOne.addAndGet(1))))
                .limit(50).collect(Collectors.toList());

        AtomicInteger atomicIntegerTwo = new AtomicInteger(0);
        List<Car> carListTwo = Stream
                .generate(() -> new Car(String.format("к0%02dсе178", atomicIntegerTwo.addAndGet(1))))
                .limit(50).collect(Collectors.toList());

        String sortedCarNumber = Stream.concat(carListOne.stream(), carListTwo.stream())
                .filter(car -> car.getNumber().contains("04") && !car.getNumber().contains("00"))
                .map(car -> car.getNumber())
                .collect(Collectors.joining(", "));
        System.out.println(sortedCarNumber);
    }
}

