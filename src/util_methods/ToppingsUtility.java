package util_methods;

import RambooPizza.Decorator.Food;
import RambooPizza.Decorator.HamDecorator;
import RambooPizza.Decorator.OnionDecorator;
import RambooPizza.Decorator.PineappleDecorator;
import RambooPizza.Strategy.Payment;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;

public class ToppingsUtility {
    private static final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static String selectToppings(Food pizza) throws IOException {
        Payment payment = new Payment();
        System.out.println("Which toppings would you like? \nHam, pineapples \nHam, onions \nOnions, pineapples\n\nType 'done' to complete topping selection!");
        String secondDecision = "";
        while(!Objects.equals(secondDecision, "done")) {
            secondDecision = reader.readLine();
            switch (secondDecision) {

                case "Ham, pineapples" -> {
                    pizza = new PineappleDecorator(new HamDecorator(pizza));
                    payment.setTotalCost(pizza.getPrice());
                    System.out.println("Added ham and pineapples!");
                    System.out.println("Added cost: " + pizza.getPrice());
                    System.out.println("Current cart: " +pizza.make());
                }
                case "Ham, onions" -> {
                    pizza = new OnionDecorator(new HamDecorator(pizza));
                    payment.setTotalCost(pizza.getPrice());
                    System.out.println("Price for ham and onions: " + pizza.getPrice());
                    System.out.println("Added cost: " + pizza.getPrice());
                    System.out.println("Current cart: " + pizza.make());
                }
                case "Onions, pineapples" -> {
                    pizza = new OnionDecorator(new PineappleDecorator(pizza));
                    payment.setTotalCost(pizza.getPrice());
                    System.out.println("Price for pineapples and onions: " + pizza.getPrice());
                    System.out.println("Added cost: " + pizza.getPrice());
                    System.out.println("Current cart - " + pizza.make());
                }
                case "done" -> System.out.println("Good choice!");
                default -> System.out.println("Wrong input, come on");
            }
        }
    return pizza.make();
    }
}
