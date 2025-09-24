public class CelestialObject {
    public String name;
    public double x;
    public double y;
    public double z;

    public CelestialObject() {
        this.name = "Soleil";
        this.x = 0.0;
        this.y = 0.;
        this.z = .0;
    }

    public CelestialObject(String name, double x, double y, double z) {
        this.name = name;
        this.x = x;
        this.y = y;
        this.z = z;
    }
}