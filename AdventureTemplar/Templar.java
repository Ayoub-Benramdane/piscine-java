public class Templar extends Character implements Tank, Healer {
    private final int healCapacity;
    private final int shield;

    public Templar(String name, int maxHealth, int inthealCapacity, int shield) {
        super(name, maxHealth);
        this.healCapacity = inthealCapacity;
        this.shield = shield;
    }

    public void heal(Character c) {
        c.setCurrentHealth(healCapacity);
    }

    public int getHealCapacity() {
        return healCapacity;
    }

    public int getShield() {
        return shield;
    }

    public String toString() {
        if (this.getCurrentHealth() > 0) {
            // <name> is a strong Templar with <currentHealth> HP. It can heal <healCapacity> HP and has a shield of <shield>.
            return this.getName() + " is a strong Templar with " + this.getCurrentHealth() + " HP. It can heal "+getHealCapacity()+" HP and has a shield of "+getShield()+".";
        }
        // <name> has been beaten, even with its <shield> shield. So bad, it could heal <healCapacity> HP.
        return this.getName() + " has been beaten, even with its " + getShield()+" shield. So bad, it could heal " + getHealCapacity()+" HP.";
    }
}