package learn.java.doc.service.implementation;

import learn.java.doc.model.Entity;
import learn.java.doc.model.World;
import learn.java.doc.service.WorldService;

import java.util.Random;

public class WorldServiceImpl implements WorldService {

    private final static Random random = new Random();
    private final World world;

    public WorldServiceImpl(World world) {
        this.world = world;
    }

    @Override
    public Entity getRandomEntity() {
        System.out.println("Get random entity");
        return world.getEntities().get(random.nextInt(world.getEntities().size()));
    }

    @Override
    public void createEntity() {
        System.out.println("Created an entity");
        world.getEntities().add(new Entity(world));
    }

    /**
     * Retrieves the world statistics.
     */
    @Override
    public void getWorldStats() {
        System.out.println("World stats: " + world.toString());
    }
}
