import models.Player;
import objective.Game;

import java.util.*;

public class ChutesAndLaddersApplication {
    public static void main(String[] args) {
        Player p1 = new Player("Greg");
        Player p2 = new Player("Eric");
        Player p3 = new Player("Paul");
        List<Player> players = Arrays.asList(p1, p2, p3);
        Game game = new Game(players);
        game.startGame();
    }
}
