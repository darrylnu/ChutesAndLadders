package models;

import java.util.Comparator;

public final class Spinner {

    public static int spin() {
        return (int)(Math.random() * 6 + 1);
    }

    public static class SpinComparator implements Comparator<Player> {
        @Override
        public int compare(Player p1, Player p2) {
            return p1.getFirstSpin() - p2.getFirstSpin();
        }
    }
}
