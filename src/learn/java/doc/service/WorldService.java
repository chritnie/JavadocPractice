package learn.java.doc.service;

import learn.java.doc.model.Entity;
import learn.java.doc.model.World;

public interface WorldService {

    /**
     * Get a random entity from the world.
     *
     * @see World
     * @return a random entity
     */
    Entity getRandomEntity();
    /**
     * Creates an entity in the world.
     *
     * @see World
     */
    void createEntity();

}
