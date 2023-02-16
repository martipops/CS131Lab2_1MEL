
/**
 * This class represents a wizard for
 * a D&D type game.
 * 
 * @author rkelley
 * @version 1.0
 *          Lab 2
 *          CS131LAB2_1MEL
 *
 */
public class Wizard implements Lockable {

    private String name;
    private int health;
    private int key;
    boolean locked;

    /**
     * End constructor to put object into consistent state
     */
    public Wizard() {
        this("");
    }// end constructor

    /**
     * Constructor to create object with common
     * usage. This is the preferred constructor.
     * 
     * @param name
     */
    public Wizard(String name) {
        this.name = name;
        this.health = 100;
        this.key = 0;
        this.locked = false;
    }// end constructor

    /**
     * This method processes the
     * damage to the object when
     * it is hit by other objects
     * (e.g. weapons, lightening, etc.)
     * 
     * @param power
     */
    public void takeDamage(int power) {
        if (!locked)
            this.health -= power;
    }// end takeDamage

    /**
     * Getter for name
     * 
     * @return
     */
    public String getName() {
        return name;
    }// end getName

    /**
     * Setter for name
     * 
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }// end setName

    /**
     * Getter for health
     * 
     * @return
     */
    public int getHealth() {
        return health;
    }// end getHealth

    /**
     * Setter for health
     * 
     * @param health
     */
    public void setHealth(int health) {
        this.health = health;
    }// end setHealth

    /**
     * Getter for the key
     * 
     * @return
     */
    public int getKey() {
        return key;
    }// end getKey

    /**
     * Sets the key to unlock the object.
     * The key must be greater than zero and the object's key must not have already
     * been set.
     *
     * @param key The key to set.
     */
    @Override
    public void setKey(int key) {
        if (key > 0 && this.key == 0) {
            this.key = key;
        }
    }

    /**
     * Returns whether the object is currently locked.
     *
     * @return True if the object is locked, false if it is unlocked.
     */
    @Override
    public boolean isLocked() {
        return locked;
    }

    /**
     * Locks the object if the passed key matches the object's key.
     *
     * @param key The key to use for locking.
     */
    @Override
    public void lock(int key) {
        if (key == this.key) {
            locked = true;
        }
    }

    /**
     * Unlocks the object if the passed key matches the object's key.
     *
     * @param key The key to use for unlocking.
     */
    @Override
    public void unlock(int key) {
        if (key == this.key) {
            locked = false;
        }
    }

    @Override
    public String toString() {
        return "Wizard [name=" + name + ", health=" + health + ", key=" + key + ", locked=" + locked + "]";
    }// end toString

}// end class
