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
        return world.getEntities().get(random.nextInt(world.getEntities().size() - 1));
    }

    @Override
    public void createEntity() {
        world.getEntities().add(new Entity());
    }
}
