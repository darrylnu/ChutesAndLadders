package objective;

import models.Board;
import models.Player;
import models.Spinner;

import java.util.List;

public class Game {
    private final Board board;
    private final List<Player> players;
    private boolean winner = false;

    public Game(List<Player> players) {
        this.board = new Board();
        this.players = players;
    }

    public void startGame() {
        initializePlayOrder();
        while (!winner) {
            for (Player player : players) {
                StringBuilder printTurn = new StringBuilder();
                printTurn = takeTurn(player, printTurn);
                System.out.println(printTurn.toString());
                checkWinner(player);
                if(winner) {
                    break;
                }
            }
        }
    }

    private void initializePlayOrder() {
        for (Player player : players) {
            player.setFirstSpin(Spinner.spin());
        }
        players.sort(new Spinner.SpinComparator());
    }

    private StringBuilder takeTurn(Player player, StringBuilder sb) {
        sb.append(player.getName());
        sb.append(" :");
        sb.append(player.getSquareNum());
        sb.append(" --> ");
        int spin = Spinner.spin();
        if (player.getSquareNum() + spin <= board.getWinningSquareNum()) {
            player.setSquareNum(player.getSquareNum() + spin);
        }
        sb.append(player.getSquareNum());
        return applyChutesAndLadders(player, sb);
    }

    private StringBuilder applyChutesAndLadders(Player player, StringBuilder sb) {
        if (board.getChutes().containsKey(player.getSquareNum())) {
            player.setSquareNum(board.getChutes().get(player.getSquareNum()));
            sb.append(" --CHUTE--> ");
            sb.append(player.getSquareNum());
        } else if (board.getLadders().containsKey(player.getSquareNum())) {
            player.setSquareNum(board.getLadders().get(player.getSquareNum()));
            sb.append(" --LADDER--> ");
            sb.append(player.getSquareNum());
        }
        return sb;
    }

    private void checkWinner(Player player) {
        if (player.getSquareNum() == board.getWinningSquareNum()) {
            winner = true;
            System.out.println("The winner is " + player.getName());
        }
    }
}
