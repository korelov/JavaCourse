package org.javaacadmey.wonderfield;

import org.javaacadmey.wonderfield.player.Player;

import java.util.Scanner;

public class Game {
    public static Scanner scanner = new Scanner(System.in);
    public static final int NUMBER_OF_PLAYERS = 3;
    public static final int NUMBER_OF_ROUNDS = 4;
    public static final int GROUP_ROUNDS = 3;
    public static final int INDEX_OF_THE_FINAL_ROUND = 3;
    private final String[] questions = questions();
    private final String[] answers = answers();

    private boolean isFinalRound;

    private Tableau tableau;
    private Yakubovich yakubovich;

    private Player[] winners = new Player[NUMBER_OF_PLAYERS];
    private Player[] players = new Player[NUMBER_OF_PLAYERS];

    public void setFinalRound(boolean finalRound) {
        isFinalRound = finalRound;
    }

    public boolean isFinalRound() {
        return isFinalRound;
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
        System.out.println("Запуск игры \"Поле Чудес\" - подготовка к игре.");
        System.out.println("Иницализация закончена, игра начнется через 5 секунд");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("\n".repeat(50));
    }

    private String enterName() {
        while (true) {
            String name = scanner.next();
            if (name.matches("^[a-zA-Z0-9\\\\s]+$")) {
                System.out.println("Ошибка! Имя должно быть на русском языке");
            } else {
                return name;
            }
        }
    }

    private String enterCity() {
        while (true) {
            String city = scanner.next();
            if (city.matches("^[a-zA-Z0-9\\\\s]+$")) {
                System.out.println("Ошибка! Город должен быть на русском языке");
            } else {
                return city;
            }
        }
    }

    public Player[] createPlayers() {
        for (int i = 0; i < NUMBER_OF_PLAYERS; i++) {
            System.out.printf("Игрок №%d представьтесь: Ваше имя ?\n", i + 1);
            String name = enterName();
            System.out.printf("%s Из какого вы города ?\n", name);
            String city = enterCity();
            players[i] = new Player(name, city);
        }
        return players;
    }

    public void start() {
        yakubovich = new Yakubovich();
        tableau = new Tableau();
        yakubovich.showStart();
        playGroupRounds();
        playFinalRound(winners);
        yakubovich.showEnd();
    }

    private Player startPlayRound(Player[] players) {
        while (true) {
            for (int i = 0; i < players.length; i++) {
                boolean result;
                Player player = players[i];
                do {
                    result = yakubovich.checkAnswer(player.movePlayer(), tableau);
                    if (!tableau.containsUnknownLetters()) {
                        yakubovich.shoutWinner(player, isFinalRound());
                        return player;
                    }
                } while (result);
            }
        }
    }

    private void playGroupRounds() {
        for (int i = 0; i < GROUP_ROUNDS; i++) {
            players = createPlayers();
            yakubovich.welcomeThreePlayers(players, i + 1);
            yakubovich.askQuestion(questions, i);
            tableau.init(answers[i]);
            tableau.print();
            winners[i] = startPlayRound(players);
            if (i + 1 == INDEX_OF_THE_FINAL_ROUND) {
                setFinalRound(true);
            }
        }
    }

    private void playFinalRound(Player[] winners) {
        yakubovich.welcomeThreePlayers(winners, INDEX_OF_THE_FINAL_ROUND);
        yakubovich.askQuestion(questions, INDEX_OF_THE_FINAL_ROUND);
        tableau.init((answers[INDEX_OF_THE_FINAL_ROUND]));
        tableau.print();
        startPlayRound(winners);
    }
}
