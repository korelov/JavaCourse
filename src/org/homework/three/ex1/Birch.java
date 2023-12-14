package org.homework.three.ex1;

public class Birch extends Deciduous {
    public Birch(int age, boolean isLeavesOnTree) {
        super(age, isLeavesOnTree);
    }

    public void bloom() {
        if (isLeavesOnTree) {
            System.out.println("Береза цветет и источает алерген");
        }
    }
}
