package RambooPizza.Prototype;

import RambooPizza.Decorator.Food;

import java.util.Objects;

public class SicilianPizza extends PizzaPrototype implements Food {

    public String pizza;
    private double price;

    public SicilianPizza(){
        this.price = 150.00;
    }

    public double getPrice() {
        return price;
    }

    public SicilianPizza(SicilianPizza sicilianPizza) {
        super(sicilianPizza);
        if (Objects.nonNull(sicilianPizza)) {
            this.pizza = sicilianPizza.pizza;
            this.price = sicilianPizza.price;
        }
    }

    public void setPizza(String pizza) {
        this.pizza = pizza;
    }

    @Override
    public String make() {
        return this.pizza + ": ";
    }

    @Override
    public PizzaPrototype clone() {
        return new SicilianPizza(this);
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof SicilianPizza sicilianPizza) || !super.equals(object)) {
            return false;
        }
        return Objects.equals(sicilianPizza.pizza, pizza) && sicilianPizza.price == price;
    }
}
