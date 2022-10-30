import RambooPizza.Decorator.Pizza;
import RambooPizza.Prototype.CheesePizza;
import RambooPizza.Prototype.SicilianPizza;
import RambooPizza.State.RamboPizza;
import RambooPizza.Strategy.CreditCard;
import RambooPizza.Strategy.Payment;
import util_methods.PaymentUtility;
import util_methods.TemplateUtility;
import util_methods.ToppingsUtility;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Client {


    private static final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        System.out.println("WELCOME TO THE BEST PIZZA IN MARS => RamboPizza");
        RamboPizza ramboPizza = new RamboPizza();
        Payment payment = new Payment();
        CreditCard creditCard = new CreditCard("1616161616161616", "12/24", "999");

        System.out.println("========================================");

        System.out.println("Would you like to order a cheese pizza (Press - 1), a Sicilian pizza (Press - 2), or make one yourself (Press - 3) ?");
        while (true) {
            String initialDecision = reader.readLine();
            switch (initialDecision) {
                case "1" -> {
                    System.out.println("You've chosen one of ours, a mistake");
                    CheesePizza cheesePizza = new CheesePizza();
                    payment.setTotalCost(cheesePizza.getPrice());
                    System.out.println("Added cost: " + cheesePizza.getPrice());
                    cheesePizza.pizza = "Crusty cheese pizza with ";
                    cheesePizza.setPizza(ToppingsUtility.selectToppings(cheesePizza));
                    TemplateUtility.selectTemplateMethod(payment, cheesePizza);
                    PaymentUtility.selectPaymentMethod(ramboPizza, payment,
                            cheesePizza);
                }
                case "2" -> {
                    SicilianPizza sicilianPizza = new SicilianPizza();
                    payment.setTotalCost(sicilianPizza.getPrice());
                    System.out.println("Added cost: " + sicilianPizza.getPrice());
                    sicilianPizza.pizza = "Very italian Pizza with ";
                    sicilianPizza.setPizza(ToppingsUtility.selectToppings(sicilianPizza));

                    TemplateUtility.selectTemplateMethod(payment, sicilianPizza);
                    PaymentUtility.selectPaymentMethod(ramboPizza, payment, sicilianPizza);
                }
                case "3" -> {
                    Pizza pizza = new Pizza("Regular pizza with", 60.00);
                    payment.setTotalCost(pizza.getPrice());
                    System.out.println("Added cost: " + pizza.getPrice());
                    pizza.setName(ToppingsUtility.selectToppings(pizza));
                    TemplateUtility.selectTemplateMethod(payment, pizza);
                    PaymentUtility.selectPaymentMethod(ramboPizza, payment, pizza);
                }
                default -> System.out.println("Wrong input, come on");
            }
        }


    }
}
