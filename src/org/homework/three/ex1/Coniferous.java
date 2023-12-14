package org.homework.three.ex1;

public class Coniferous extends Tree {

    protected boolean isTypeOfNeedles;

    private String typeOfNeedles;

    public Coniferous(int age, boolean isTypeOfNeedles) {
        super(age);
        this.isTypeOfNeedles = isTypeOfNeedles;
    }

    public String getTypeOfNeedles() {
        if (isTypeOfNeedles) {
            return "крупный";
        } else {
            return "мелкий";
        }
    }
}
