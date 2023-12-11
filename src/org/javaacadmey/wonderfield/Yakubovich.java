package org.javaacadmey.wonderfield;

import org.javaacadmey.wonderfield.player.Player;

public class Yakubovich {

    private final String SHOW_START = "Здравствуйте, уважаемые дамы и господа!"
            + " Пятница! В эфире капитал-шоу «Поле чудес»!";
    final String SHOW_ENDED = "Мы прощаемся с вами ровно на одну неделю! Здоровья вам, до встречи!";

    public void welcomeThreePlayers(Player[] players, int round) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < players.length; i++) {
            if (i < players.length - 1) {
                stringBuilder.append(players[i].getName()).append(" ,");
            } else {
                stringBuilder.append(players[i].getName());
            }
        }
        if (round == Game.INDEX_OF_THE_FINAL_ROUND) {
            System.out.printf("Приглашаю победителей групповых этапов: %s\n", stringBuilder.toString());
        } else {
            System.out.printf("приглашаю %d тройку игроков: %s\n", round, stringBuilder.toString());
        }
    }

    public void askQuestion(String[] question, int round) {
        System.out.println("Внимание вопрос\n" + question[round]);
    }

}
