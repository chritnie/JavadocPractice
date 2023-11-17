package learn.java.doc.utils;

import java.util.*;

public class Tick {
    /**
     * This class has constructor Tick and method tick,
     * that make a random choice of action on the base of set probabilities
     */
    private final static Random random = new Random();
    int[] doing;
    int[] chance;

    public Tick(List<Integer> doing, List<Integer> chance) {
        /**
         * This constructor takes two lists of numbers (actions and their probabilities),
         * compares them for being the same size, for being sorted in descending order,
         * converts into arrays, and computes sums of chances
         * <p>
         * @throws Exception in case action and its probability are of different size
         *                   in case chances aren't sorted
         */
        if (doing.size() != chance.size()) {
            throw new IllegalArgumentException("doing and chance must have the same size");
        }
        if (!Objects.equals(chance.stream().sorted(Comparator.reverseOrder()).toList(), chance)) {
            throw new IllegalArgumentException("chance must be sorted");
        }
        this.doing = doing.stream().mapToInt(Integer::intValue).toArray();
        this.chance = chance.stream().mapToInt(Integer::intValue).toArray();
        for (int i = 1; i < this.chance.length; i++) {
            this.chance[i] += this.chance[i - 1];
        }
    }

    public int tick() {
        /**
         * A method for checking if an action goes depending on its probability
         * <p>
         * @return The selected action, or -1 if no action is selected
         */
        int j = random.nextInt(100);
        for (int i = 0; i < doing.length; i++) {
            if (j > chance[i]) {
            } else return doing[i];
        }
        return -1;
    }
}
