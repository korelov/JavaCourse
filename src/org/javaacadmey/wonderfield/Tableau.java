package org.javaacadmey.wonderfield;

import java.util.Arrays;

public class Tableau {
    private String correctAnswer;
    private String[] lettersOnTableau;

    public String[] getLettersOnTableau() {
        return lettersOnTableau;
    }

    public void init(String correctAnswer) {
        this.correctAnswer = correctAnswer;
        this.lettersOnTableau = new String[correctAnswer.length()];
        Arrays.fill(this.lettersOnTableau, "_");
    }

    public void print() {
        for (int i = 0; i < getLettersOnTableau().length; i++) {
            if (i < getLettersOnTableau().length - 1) {
                System.out.print(getLettersOnTableau()[i].toUpperCase() + " ");
            } else {
                System.out.print(getLettersOnTableau()[i].toUpperCase() + "\n");
            }
        }
    }

    public boolean containsUnknownLetters() {
        boolean result = false;
        for (String letter : lettersOnTableau) {
            if (letter.equals("_")) {
                result = true;
                break;
            }
        }
        return result;
    }

    public boolean checkLetters(String letter) {
        boolean result = false;
        if (correctAnswer.toUpperCase().contains(letter)) {
            for (int i = 0; i < correctAnswer.length(); i++) {
                if (String.valueOf(correctAnswer.charAt(i)).equalsIgnoreCase(letter)) {
                    if (lettersOnTableau[i].equalsIgnoreCase("_")) {
                        lettersOnTableau[i] = letter.toUpperCase();
                        result = true;
                    }
                }
            }
        }
        return result;
    }

    public boolean checkWord(String word) {
        boolean result = false;
        if (correctAnswer.equalsIgnoreCase(word)) {
            for (int i = 0; i < correctAnswer.length(); i++) {
                lettersOnTableau[i] = String.valueOf(correctAnswer.charAt(i)).toUpperCase();
            }
            result = true;
        }
        return result;
    }

}
