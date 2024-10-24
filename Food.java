
public class Food {
    String name;
    double price;
    String type;

    Food(String name, double price, String type) { // tranfrom to obj
        this.name = name;
        this.price = price;
        this.type = type;
    }

    @Override
    public String toString() {
        return String.format("%-50s %s", name, price);
    }
}
