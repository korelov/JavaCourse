package org.homework.three.ex1;

public class Deciduous extends Tree {

    protected boolean isLeavesOnTree;

    public Deciduous(int age, boolean isLeavesOnTree) {
        super(age);
        this.isLeavesOnTree = isLeavesOnTree;
    }

    public void leavesDisappearing() {
        System.out.println("Листья опадают");
    }
}
