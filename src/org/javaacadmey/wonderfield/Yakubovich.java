package org.javaacadmey.wonderfield;

import org.javaacadmey.wonderfield.player.Player;
import org.javaacadmey.wonderfield.player.PlayerAnswer;

public class Yakubovich {

    public void showStart() {
        System.out.println("Якубович: Здравствуйте, уважаемые дамы и господа!"
                + " Пятница! В эфире капитал-шоу «Поле чудес»!");
    }

    public void showEnd() {
        System.out.println("Якубович: Мы прощаемся с вами ровно на одну неделю!"
                + " Здоровья вам, до встречи!");
    }

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
            System.out.printf("Якубович: Приглашаю победителей групповых этапов: %s\n", stringBuilder);
        } else {
            System.out.printf("Якубович: Приглашаю %d тройку игроков: %s\n", round, stringBuilder);
        }
    }

    public void askQuestion(String[] question, int round) {
        System.out.println("Якубович: Внимание вопрос\n" + question[round]);
    }

    public void shoutWinner(Player player, boolean isFinalRound) {
        if (isFinalRound) {
            System.out.printf("Якубович: И перед нами победитель Капитал шоу поле чудес! Это %s из %s\n\n",
                    player.getName(), player.getCity());
        } else {
            System.out.printf("Якубович: Молодец! %s из %s проходит в финал!\n\n",
                    player.getName(), player.getCity());
        }
    }

    public boolean checkAnswer(PlayerAnswer playerAnswer, Tableau tableau) {
        boolean result = false;
        if (playerAnswer.getTypeAnswerPlayer().equals("буква")) {
            result = checkAnswerLetter(playerAnswer.getAnswerPlayer(), tableau);
        }
        if (playerAnswer.getTypeAnswerPlayer().equals("слово")) {
            result = checkAnswerWord(playerAnswer.getAnswerPlayer(), tableau);
        }
        return result;
    }

    private boolean checkAnswerLetter(String answerPlayer, Tableau tableau) {
        if (tableau.checkLetters(answerPlayer)) {
            System.out.println("Якубович: Есть такая буква, откройте ее!");
            tableau.printTableau();
            return true;
        } else {
            System.out.println("Якубович: Нет такой буквы! Следующий игрок, крутите барабан!");
            System.out.println("__________________________________");
            return false;
        }
    }

    private boolean checkAnswerWord(String answerPlayer, Tableau tableau) {
        if (tableau.checkWord(answerPlayer)) {
            System.out.printf("Якубович: %s. Абсолютно верно!\n", answerPlayer);
            return true;
        } else {
            System.out.println("Якубович: Неверно! Следующий игрок!\n");
            return false;
        }
    }
}
