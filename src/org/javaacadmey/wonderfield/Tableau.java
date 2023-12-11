package org.javaacadmey.wonderfield;

import java.util.Arrays;

public class Tableau {

    private String correctAnswer;
    private String[] lettersOnTableau;

    public String[] getLettersOnTableau() {
        return lettersOnTableau;
    }


    public Tableau(String correctAnswer) {
        this.correctAnswer = correctAnswer;
        this.lettersOnTableau = new String[correctAnswer.length()];
        Arrays.fill(this.lettersOnTableau, "_");
    }

    public void print() {
        for (int i = 0; i < getLettersOnTableau().length; i++) {
            if (i < getLettersOnTableau().length - 1) {
                System.out.print(getLettersOnTableau()[i].toUpperCase() + " ");
            } else {
                System.out.print(getLettersOnTableau()[i].toUpperCase());
            }
        }
    }
}
