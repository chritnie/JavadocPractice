package learn.java.doc.model;

import java.util.Random;

public class Entity {

    /**
     * Class for basic parameters of entities inhabiting the gaming world
     * <p>
     * @param int health - current amount of entity's health points
     *            maxHealth - capacity of health points
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
        /**
         * Method is randomly deciding what the entity is doing
         *
         * @author George Maysuradze
         * @since 1.0.1
         */
        int actionOutcome = decideActionOutcome();
        switch (actionOutcome) {
            case 1:
                System.out.printf(displayName + " is attacking");
                break;
            case 2:
                System.out.println(displayName + " is moving");
                break;
            default:
                System.out.println(displayName + " is just chilling");
        }
    }

    public int decideActionOutcome() {
        int randomValue = new Random().nextInt(100);
        if (randomValue > 50) {
            return 1;
        } else if (randomValue > 25) {
            return 2;
        } else {
            return -1;
        }
    }
}
