import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

public class Galaxy {
    private List<CelestialObject> celestialObjects;
    
    public Galaxy() {
        this.celestialObjects = new ArrayList<>();
    }
    
    public List<CelestialObject> getCelestialObjects() {
        return this.celestialObjects;
    }
    
    public void addCelestialObject(CelestialObject celestialObject) {
        this.celestialObjects.add(celestialObject);
    }
    
    public Map<String, Integer> computeMassRepartition() {
        Map<String, Integer> massRepartition = new HashMap<>();
        massRepartition.put("Star", 0);
        massRepartition.put("Planet", 0);
        massRepartition.put("Other", 0);
        
        for (CelestialObject obj : this.celestialObjects) {
            String type;
            if (obj instanceof Star) {
                type = "Star";
            } else if (obj instanceof Planet) {
                type = "Planet";
            } else {
                type = "Other";
            }
            
            massRepartition.put(type, massRepartition.get(type) + obj.getMass());
        }
        
        return massRepartition;
    }
}