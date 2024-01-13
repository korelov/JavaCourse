package org.homework.module2.one.ex1;

public class Zoo<D, T, B extends Animals> {
    private D dog;
    private T tiger;
    private B bird;

    public Zoo(D dog, T tiger, B bird) {
        this.dog = dog;
        this.tiger = tiger;
        this.bird = bird;
    }

    public D getDog() {
        return dog;
    }

    public T getTiger() {
        return tiger;
    }

    public B getBird() {
        return bird;
    }
}
