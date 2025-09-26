import java.util.Objects;

public class CelestialObject {
    public String name;
    public double x;
    public double y;
    public double z;
    private int mass;

    public CelestialObject() {
        this.name = "Soleil";
        this.x = 0.0;
        this.y = 0.;
        this.z = .0;
        this.mass = 0;
    }

    public CelestialObject(String name, double x, double y, double z) {
        this.name = name;
        this.x = x;
        this.y = y;
        this.z = z;
        this.mass = 0;
    }

    public CelestialObject(String name, double x, double y, double z, int mass) {
        this.name = name;
        this.x = x;
        this.y = y;
        this.z = z;
        this.mass = mass;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public void setMass(int mass) {
        this.mass = mass;
    }

    public String getName() {
        return this.name;
    }

    public double getX() {
        return this.x;
    }

    public double getY() {
        return this.y;
    }

    public double getZ() {
        return this.z;
    }

    public int getMass() {
        return this.mass;
    }
    
    public static double getDistanceBetween(CelestialObject obj1, CelestialObject obj2) {
        double dx = obj2.getX() - obj1.getX();
        double dy = obj2.getY() - obj1.getY();
        double dz = obj2.getZ() - obj1.getZ();
        return Math.sqrt(dx * dx + dy * dy + dz * dz);
    }

    public static double getDistanceBetweenInKm(CelestialObject obj1, CelestialObject obj2) {
        double KM_IN_ONE_AU = 150000000;
        return getDistanceBetween(obj1, obj2) * KM_IN_ONE_AU;
    }

    @Override
    public String toString() {
        return String.format("%s is positioned at (%.3f, %.3f, %.3f)", name, x, y, z);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!(obj instanceof CelestialObject))
            return false;
        CelestialObject other = (CelestialObject) obj;
        return this.name.equals(other.name) && this.x == other.x && this.y == other.y && this.z == other.z;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, x, y, z);
    }
}