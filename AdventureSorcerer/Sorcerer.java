public class Sorcerer extends Character implements Healer {
    private final int healCapacity;
    public Sorcerer(String name, int maxHealth,int healCapacity){
        super(name,maxHealth);
        this.healCapacity=healCapacity;
    }
        public void heal( Character c){
            c.setCurrentHealth(healCapacity);
        }
    public int getHealCapacity(){
        return this.healCapacity;
    }


    public String toString() {
        if (this.getCurrentHealth()> 0) {
            return this.getName() + " is a sorcerer with " + this.getCurrentHealth() + " HP. It can heal " + this.healCapacity+" HP.";
        }
        // <name> is a dead sorcerer. So bad, it could heal <healCapacity> HP.
        return this.getName() + " is a dead sorcerer. So bad, it could heal " + healCapacity+" HP.";
    }
}