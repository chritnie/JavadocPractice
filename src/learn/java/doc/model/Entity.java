package learn.java.doc.model;

public class Entity {

    /**
     * Class for basic parameters of entities inhabiting the gaming world
     * <p>
     * @param int health - current amount of entity's health points
     *            maxHealth - capacity of health pionts
     *            damage - amount of damage the entity is able to inflict
     *            speed - speed that the entity travels with
     *            armor - points of damage the armor absorbs
     * @param String displayName - entity's name
     *
     */
    private int health;
    private int maxHealth;
    private int damage;
    private int speed;
    private int armor;
    private String displayName;

    private World world;

    public Entity(World world) {
        this(100, 100, 10, 1, 0, "Human", world);
    }

    public Entity(int health, int maxHealth, int damage, int speed, int armor, String displayName, World world) {
        this.health = health;
        this.maxHealth = maxHealth;
        this.damage = damage;
        this.speed = speed;
        this.armor = armor;
        this.displayName = displayName;
        this.world = world;
    }

    public void doing() {
        System.out.println("Entity is doing something...");
    }

}
