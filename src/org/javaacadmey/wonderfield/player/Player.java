package org.javaacadmey.wonderfield.player;

import org.javaacadmey.wonderfield.Game;

public class Player {
    private final String name;
    private final String city;

    public Player(String name, String city) {
        this.name = name;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public String enterLetters() {
        while (true) {
            System.out.println("Введите букву");
            String letter = Game.scanner.nextLine();
            if (letter.length() == 1 && letter.matches("^[а-яА-Я]")) {
                System.out.printf("Игрок %s: буква %s \n", name, letter);
                return letter;
            } else {
                System.out.println("Ошибка! введите одну русскую букву");
            }
        }
    }

    public String enterWorld() {
        while (true) {
            System.out.println("Введите слово");
            String world = Game.scanner.next();
            if (world.matches("^[a-zA-Z0-9\\\\s]+$")) {
                System.out.println("Ошибка! слово должно быть на русском языке");
            } else {
                System.out.printf("Игрок %s: слово %s \n", name, world);
                return world;
            }
        }
    }

    public PlayerAnswer movePlayer() {
        System.out.printf("Ход игрока %s, %s \n", name, city);
        System.out.print("Если хотите букву нажмите 'б' и enter,"
                + " если хотите слово нажмите 'c' и enter\n");
        while (true) {
            String letter = Game.scanner.nextLine();
            if (letter.contains("б") && letter.length() == 1) {
                return new PlayerAnswer(enterLetters(), "буква");
            } else if (letter.contains("с") && letter.length() == 1) {
                return new PlayerAnswer(enterWorld(), "слово");
            } else {
                System.out.println("Некорректное значение, введите 'б' или 'с'");
            }
        }
    }
}
