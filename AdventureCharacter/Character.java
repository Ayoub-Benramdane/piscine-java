public class Character {
    private int maxHealth;
    private int currentHealth;
    private String name;

    public Character(String name, int maxHealth) {
        this.currentHealth = maxHealth;
        this.maxHealth = maxHealth;
        this.name = name;
    }

    public int getMaxHealth() {
        return maxHealth;
    }

    public int getCurrentHealth() {
        return currentHealth;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        if (currentHealth == 0) {
            return name + " : KO";
        }
        return name + " : " + currentHealth + "/" + maxHealth;
    }

    public void takeDamage(int damage) {
        currentHealth -= damage;
        if (currentHealth < 0) {
            currentHealth = 0;
        }
    }

    public void attack(Character character) {
        character.takeDamage(9);
    }
}