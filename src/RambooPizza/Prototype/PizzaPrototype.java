package RambooPizza.Prototype;

import java.util.Objects;

public abstract class PizzaPrototype {

    private String name;
    private String addedToppings;

    public PizzaPrototype() {
    }

    public PizzaPrototype(PizzaPrototype prototype){
        if (Objects.nonNull(prototype)){
            this.name = prototype.name;
            this.addedToppings = prototype.addedToppings;
        }
    }

    public abstract PizzaPrototype clone();


    @Override
    public boolean equals(Object object) {
        if(!(object instanceof PizzaPrototype prototype)){
            return false;
        }

        return Objects.equals(name, prototype.name) && Objects.equals(addedToppings, prototype.addedToppings);
    }

}
