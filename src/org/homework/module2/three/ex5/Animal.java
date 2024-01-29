package org.homework.module2.three.ex5;

public final class Animal {
    private final int bodyLength;
    private final int tailLength;

    public Animal(int bodyLength, int tailLength) {
        this.bodyLength = bodyLength;
        this.tailLength = tailLength;
    }

    public int getBodyLength() {
        return bodyLength;
    }

    public int getTailLength() {
        return tailLength;
    }
}
