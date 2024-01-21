package org.homework.module2.one.ex1;

public class Zoo<T1 extends Animals, T2 extends Animals, T3 extends Animals> {
    private T1 animal1;
    private T2 animal2;
    private T3 animal3;

    public Zoo(T1 animal1, T2 animal2, T3 animal3) {
        this.animal1 = animal1;
        this.animal2 = animal2;
        this.animal3 = animal3;
    }

    public T1 getAnimal1() {
        return animal1;
    }

    public T2 getAnimal2() {
        return animal2;
    }

    public T3 getAnimal3() {
        return animal3;
    }
}
