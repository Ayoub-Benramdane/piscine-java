public class Templar extends Character implements Tank, Healer {
    private final int healCapacity;
    private final int shield;

    public Templar(String name, int maxHealth, int inthealCapacity, int shield) {
        super(name, maxHealth);
        this.healCapacity = inthealCapacity;
        this.shield = shield;
    }

    public int getHealCapacity() {
        return healCapacity;
    }

    public int getShield() {
        return shield;
    }

    public String toString() {
        if (this.getCurrentHealth() > 0) {
            return this.getName() + " is a strong Templar with " + this.getCurrentHealth() + " HP. It can heal "
                    + getHealCapacity() + " HP and has a shield of " + getShield() + ".";
        }
        return this.getName() + " has been beaten, even with its " + getShield() + " shield. So bad, it could heal "
                + getHealCapacity() + " HP.";
    }

    @Override
    public void heal(Character character) {
        int newHealth = character.getCurrentHealth() + this.healCapacity;

        if (newHealth > character.getMaxHealth()) {
            newHealth = character.getMaxHealth();
        }

        character.setCurrentHealth(newHealth);
    }

    @Override
    public void attack(Character character) {
        this.heal(this);
        character.takeDamage(6);
    }

    @Override
    public void takeDamage(int amount) {
        if (amount >= this.getCurrentHealth()) {
            this.setCurrentHealth(0);
        } else {
            this.setCurrentHealth(this.getCurrentHealth() - (amount - this.shield));
        }
    }
}