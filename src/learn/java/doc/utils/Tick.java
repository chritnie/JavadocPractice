package learn.java.doc.utils;

import java.util.List;

public class Tick {

    int[] doing;
    int[] chance;

    public Tick(List<Integer> doing, List<Integer> chance) {
        if (doing.size() != chance.size()) {
            throw new IllegalArgumentException("doing and chance must have the same size");
        }
        this.doing = doing.stream().mapToInt(Integer::intValue).toArray();
        this.chance = chance.stream().mapToInt(Integer::intValue).toArray();
    }

    public void tick() {

    }
}
