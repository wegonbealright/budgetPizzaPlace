package RambooPizza.TemplateMethod;

public class UpperEchelonApproach extends PreparePizzaTemplate{

    @Override
    public void rollingDough() {
        System.out.println("Rolling the dough with Lil Uzi Vert's 5 million dollar roller");
    }

    @Override
    public void addingToppings(String toppings) {
        System.out.println("Each topping for the " + toppings + " is being added by Lamie Joliver, Rordon Gamsay & Pierre Gagnaire separately");
    }

    @Override
    public void cookingPizza() {
        System.out.println("Steaming and the cooking in a very elite approach for 3 weeks");
    }



}
