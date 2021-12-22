package RambooPizza.Decorator;

public class OnionDecorator extends PizzaDecorator{
    private final Food food;

    public double getPrice() {
        return 3.00;
    }

    public OnionDecorator(Food pizza) {
        this.food = pizza;
    }

    @Override
    public String make() {
        return food.make() + "some onions";
    }


}
