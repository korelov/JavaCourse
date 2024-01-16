package org.homework.module2.one.ex1;

import java.util.ArrayList;
import java.util.List;

public class Zoo<B, D, T extends Animals> {
    private final List<B> bird;
    private final List<D> dog;
    private final List<T> tiger;

    public Zoo() {
        bird = new ArrayList<>();
        dog = new ArrayList<>();
        tiger = new ArrayList<>();
    }

    public void addBird(B bird) {
        this.bird.add(bird);
    }

    public B getLastBird() {
        return bird.remove(bird.size() - 1);
    }

    public void addDog(D dog) {
        this.dog.add(dog);
    }

    public D getLastDog() {
        return dog.remove(dog.size() - 1);
    }

    public void addTiger(T tiger) {
        this.tiger.add(tiger);
    }

    public T getLastTiger() {
        return tiger.remove(tiger.size() - 1);
    }

    public void printAnimalCount() {
        System.out.printf("В зоопарке на данный момент есть %d птиц(ы), %d собак(и), %d тигр(ов)\n",
                bird.size(), dog.size(), tiger.size());
    }
}
