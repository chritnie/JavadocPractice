package learn.java.doc.model;

import learn.java.doc.service.implementation.WorldServiceImpl;

import java.util.ArrayList;

public class World implements Runnable {

    private ArrayList<Entity> entities = new ArrayList<>();

    private final WorldServiceImpl worldService = new WorldServiceImpl(this);



    @Override
    public void run() {
        while (true) {
            worldService.createEntity();
        }
    }

    public ArrayList<Entity> getEntities() {
        return entities;
    }
}
