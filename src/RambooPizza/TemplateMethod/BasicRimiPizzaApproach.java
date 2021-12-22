package RambooPizza.TemplateMethod;

public class BasicRimiPizzaApproach extends PreparePizzaTemplate{

    private double price;

    public double getPrice() {
        return price;
    }

    @Override
    public void rollingDough() {
        System.out.println("Rolling the dough for the pizza");
    }

    @Override
    public void addingToppings(String toppings) {
        System.out.println("Adding these toppings to the " + toppings);
    }

    @Override
    public void cookingPizza() {
        System.out.println("Cooking in the oven for 30 min");
    }
}
