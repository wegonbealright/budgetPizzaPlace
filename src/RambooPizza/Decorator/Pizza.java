package RambooPizza.Decorator;

public class Pizza implements Food {
    private String name;
    private final double price;

    public Pizza(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String make() {
        return this.name + " ";
    }

}
