package org.homework.module2.four.ex1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Runner {

    public static void main(String[] args) {
        List<Car> carsOne = IntStream.rangeClosed(1, 50).mapToObj(i -> new Car(String.format("a0%02dан799", i))).toList();
        List<Car> carsTwo = IntStream.rangeClosed(1, 50).mapToObj(i -> new Car(String.format("к0%02dсе178", i))).toList();

        List<Car> allCar = new ArrayList<>(carsOne);
        allCar.addAll(carsTwo);

        List<Car> specialCars = allCar.stream().filter(car -> car.getNumber().contains("04")).toList();
        specialCars.forEach(System.out::println);
    }
}
