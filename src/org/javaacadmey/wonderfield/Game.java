package org.javaacadmey.wonderfield;

import org.javaacadmey.wonderfield.player.Player;

import java.util.Scanner;

public class Game {

    public static final int NUMBER_OF_PLAYERS = 3;
    public static final int NUMBER_OF_ROUNDS = 4;
    public static final int GROUP_ROUNDS = 3;
    public static final int INDEX_OF_THE_FINAL_ROUND = 3;

    private String[] questions = questions();
    private String[] answers = answers();
    public static Scanner scanner = new Scanner(System.in);

    private Yakubovich yakubovich;

    private Player[] winners = new Player[NUMBER_OF_PLAYERS];
    private Player[] players = new Player[NUMBER_OF_PLAYERS];


    public String[] getQuestions() {
        return questions;
    }

    public String[] getAnswers() {
        return answers;
    }

    private String[] questions() {
        String[] strings = new String[NUMBER_OF_ROUNDS];
        strings[0] = "Лежит на спине — никому не нужна. Прислони к стене — пригодится она.";
        strings[1] = "Возьму его в руки, сожму его крепко — он станет упругим и твердым как репка.";
        strings[2] = "Сзади подошел, сунул и пошел.";
        strings[3] = "Беру двумя руками, сую между ногами…";
        return strings;
    }

    private String[] answers() {
        return new String[]{"Лестница", "Снежок", "Тапочки", "Велосипед"};
    }

    public void init() {
        System.out.println("Запуск игры \"Поле Чудес\" - подготовка к игре."
                + " Вам нужно ввести вопросы и ответы для игры.");
        this.questions = new String[NUMBER_OF_ROUNDS];
        this.answers = new String[NUMBER_OF_ROUNDS];
        for (int i = 0; i < NUMBER_OF_ROUNDS; i++) {
            System.out.printf("Введите вопрос #%d\n", i + 1);
            questions[i] = scanner.nextLine();
            System.out.printf("Введите ответ на вопрос #%d\n", i + 1);
            answers[i] = scanner.nextLine();
        }
        System.out.println("Иницализация закончена, игра начнется через 5 секунд");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("\n".repeat(50));
    }

    public Player[] createPlayer() {


        return players;
    }
}
