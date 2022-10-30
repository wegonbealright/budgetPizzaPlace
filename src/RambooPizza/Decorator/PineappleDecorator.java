package RambooPizza.Decorator;

public class PineappleDecorator extends PizzaDecorator {
    private final Food food;

    public PineappleDecorator(Food food) {
        this.food = food;
    }

    @Override
    public String make() {
        return this.food.make() + "some pineapple (with judgement), ";
    }

    @Override
    public double getPrice() {
        return 2.00;
    }
}
