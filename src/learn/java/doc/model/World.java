package learn.java.doc.model;

import learn.java.doc.service.implementation.WorldServiceImpl;
import learn.java.doc.utils.Tick;

import java.util.ArrayList;
import java.util.List;

public class World implements Runnable {

    private final ArrayList<Entity> entities = new ArrayList<>();

    private final WorldServiceImpl worldService = new WorldServiceImpl(this);


    @Override
    public void run() {
        var t = new Tick(List.of(1, 2, 3), List.of(60, 20, 20));
        for (int i = 0; i < 10; i++) {
            System.out.println(t.tick());
        }
    }

    public ArrayList<Entity> getEntities() {
        return entities;
    }
}
