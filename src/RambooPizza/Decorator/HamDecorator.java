package RambooPizza.Decorator;

public class HamDecorator extends PizzaDecorator{

    private final Food food;

    public HamDecorator(Food pizza){
        this.food = pizza;
    }

    public double getPrice() {
        return 4.00;
    }

    @Override
    public String make() {
        return food.make() + "some ham & ";
    }
}
