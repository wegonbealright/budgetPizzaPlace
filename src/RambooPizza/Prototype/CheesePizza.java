package RambooPizza.Prototype;

import RambooPizza.Decorator.Food;

import java.util.Objects;

public class CheesePizza extends PizzaPrototype implements Food {

    public String pizza;
    private double price;

    public CheesePizza(){
        price = 100.00;
    }

    public double getPrice() {
        return price;
    }

    public CheesePizza(CheesePizza cheesePizza){
        super(cheesePizza);
        if (Objects.nonNull(cheesePizza)){
            this.pizza = cheesePizza.pizza;
            this.price = cheesePizza.price;
        }
    }

    @Override
    public PizzaPrototype clone() {
        return new CheesePizza(this);
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof CheesePizza cheesePizza) || !super.equals(object)) {
            return false;
        }
        return Objects.equals(cheesePizza.pizza, pizza) && cheesePizza.price == price;
    }

    public void setPizza(String pizza) {
        this.pizza = pizza;
    }

    @Override
    public String make() {
        return this.pizza;
    }
}
