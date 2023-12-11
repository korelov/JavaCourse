package org.javaacadmey.wonderfield;

import org.javaacadmey.wonderfield.player.Player;

public class Runner {
    public static void main(String[] args) {
        Game game = new Game();

        Player player = new Player("Максим", "SPB");
        Player player1 = new Player("павел", "SPB");
        Player player2 = new Player("олег", "SPB");
        Player[] players = new Player[]{player, player1, player2};

        Yakubovich yakubovich = new Yakubovich();
        //yakubovich.welcomeThreePlayers(players,2);
        yakubovich.askQuestion(game.getQuestions(), 2);
    }
}