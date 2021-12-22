package RambooPizza.TemplateMethod;

public abstract class PreparePizzaTemplate {

    public abstract void rollingDough();

    public abstract void addingToppings(String toppings);

    public abstract void cookingPizza();

    public final void getFullPizza(String toppings) {
        rollingDough();
        addingToppings(toppings);
        cookingPizza();
    }
}
