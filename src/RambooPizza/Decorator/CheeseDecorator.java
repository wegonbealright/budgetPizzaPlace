package RambooPizza.Decorator;

public class CheeseDecorator extends PizzaDecorator{
    private final Food food;
    private final double price;

    public CheeseDecorator(Food food) {
        this.food = food;
        this.price = 0.50;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String make() {
        return food.make() + "adding some extra cheese, ";
    }
}
