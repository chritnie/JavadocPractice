package learn.java.doc.utils;

import java.util.*;

public class Tick {

    private final static Random random = new Random();
    int[] doing;
    int[] chance;

    public Tick(List<Integer> doing, List<Integer> chance) {
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
        int j = random.nextInt(100);
        for (int i = 0; i < doing.length; i++) {
            if (j > chance[i]) {
            } else return doing[i];
        }
        return -1;
    }
}
