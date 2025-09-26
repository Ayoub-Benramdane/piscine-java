import java.util.Objects;

public class Planet extends CelestialObject {
    private Star centerStar;

    public Planet() {
        super();
        this.centerStar = new Star();
    }

    public Planet(String name, double x, double y, double z, Star centerStar) {
        super(name, x, y, z);
        this.centerStar = centerStar;
    }

    public Planet(String name, double x, double y, double z, Star centerStar, int mass) {
        super(name, x, y, z, mass);
        this.centerStar = centerStar;
    }

    public Star getCenterStar() {
        return centerStar;
    }

    public void setCenterStar(Star centerStar) {
        this.centerStar = centerStar;
    }

    @Override
    public String toString() {
        return "%s circles around %s at the %.3f AU".formatted(getName(), centerStar.getName(),
                CelestialObject.getDistanceBetween(this, centerStar));
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!(obj instanceof Planet))
            return false;
        if (!super.equals(obj))
            return false;

        Planet other = (Planet) obj;
        return Objects.equals(centerStar, other.centerStar);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), centerStar);
    }
}