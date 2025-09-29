import java.util.ArrayList;
import java.util.List;

public class Character {
    private final int maxHealth;
    private int currentHealth;
    private final String name;
    private static List<Character> allCharacters=new ArrayList<>();

    public Character(String name, int maxHealth) {
        this.name = name;
        this.maxHealth = maxHealth;
        this.currentHealth = maxHealth;
        allCharacters.add(this);
    }

    public int getCurrentHealth() {
        return currentHealth;
    }
       public int  setCurrentHealth(int max) {
        currentHealth+=max;
        if (currentHealth>getMaxHealth()){
            currentHealth=getMaxHealth();
        }
        return currentHealth;
    }

    public int getMaxHealth() {
        return maxHealth;
    }

 

    public String getName() {
        return name;
    }

    public String toString() {
        if (this.currentHealth > 0) {
            return this.name + " : " + this.currentHealth + "/" + this.maxHealth;
        }
        return name + " : KO";
    }

    public void takeDamage(int cur) {
        if (this.currentHealth >= cur) {
            this.currentHealth = this.currentHealth - cur;
        } else {
            this.currentHealth = 0;
        }
    }

    public void attack(Character obj) {
        obj.takeDamage(9);
    }

    public static String printStatus() {
        if (allCharacters.size()==0) {
            return "------------------------------------------\n" +
                    "Nobody's fighting right now !\n" +
                    "------------------------------------------\n";
        }
        String res = "------------------------------------------\nCharacters currently fighting :\n";
        for (Character item : allCharacters) {
            res +=" - "+ item.toString() + "\n";
        }
        res += "------------------------------------------\n";
        return res;
    }

    public static Character fight(Character p1, Character p2) {
        while (true) {
            p1.attack(p2);
            if (p2.currentHealth == 0) {
                return p1;
            }
            p2.attack(p1);
            if (p1.currentHealth == 0) {
                return p2;
            }
        }
    }
}
