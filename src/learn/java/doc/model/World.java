package learn.java.doc.model;

import learn.java.doc.service.implementation.WorldServiceImpl;
import learn.java.doc.utils.Tick;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

public class World implements Runnable {
    /**
     * Main class of entity World.
     * <p>
     * It provides list of entities, simulates a world,
     * and has methods for accessing and displaying it's statitistics
     * </p>
     */

    private final ArrayList<Entity> entities = new ArrayList<>();

    private final WorldServiceImpl worldService = new WorldServiceImpl(this);

    public World() {
        worldService.createEntity();
    }


    @Override
    public void run() {
        var t = new Tick(List.of(1, 2), List.of(75, 25));
        var k = 0;
        while (k < 100) {
            System.out.println("Tick: " + k);
            k++;
            int i = t.tick();
            if (i == 1) {
                worldService.getRandomEntity().doing();
            } else if (i == 2) {
                worldService.createEntity();
            }
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        worldService.getWorldStats();
    }

    public ArrayList<Entity> getEntities() {
        return entities;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", World.class.getSimpleName() + "[", "]")
                .add("entities=" + entities)
                .add("entities count=" + entities.size())
                .toString();
    }
}
