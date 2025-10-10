public class House implements Housing {
    public int size;
    public int price;
    public int rooms;
    public String name;

    public House() {
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
        return "House{size=" + size + ", price=" + price + ", rooms=" + rooms + ", name='" + name + "'}";
    }
}