public class Apartment implements Housing {
    public int size;
    public int price;
    public int rooms;
    public String name;

    public Apartment() {

    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setRooms(int rooms) {
        this.rooms = rooms;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Apartment{size=" + size + ", price=" + price + ", rooms=" + rooms + ", name='" + name + "'}";
    }
}