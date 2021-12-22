package util_methods;

import RambooPizza.Decorator.Food;
import RambooPizza.Strategy.Payment;
import RambooPizza.TemplateMethod.BasicRimiPizzaApproach;
import RambooPizza.TemplateMethod.PreparePizzaTemplate;
import RambooPizza.TemplateMethod.UpperEchelonApproach;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;

public class TemplateUtility {
    private static final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void selectTemplateMethod(Payment payment, Food pizza) throws IOException {
        String cookType = "";
        while(!Objects.equals(cookType, "next")){
            System.out.println("Choose your way of preperation, *basic* or *rich*, after selection type next");
            cookType = reader.readLine();
            switch (cookType){
                case "basic" -> {
                    PreparePizzaTemplate basicRimiPizzaApproach = new BasicRimiPizzaApproach();
                    payment.setTotalCost(7.50);
                    System.out.println("Added to total cost: " + 7.50);
                    basicRimiPizzaApproach.getFullPizza(pizza.make());
                }
                case "rich" -> {
                    PreparePizzaTemplate upperEchelonPizzaApproach = new UpperEchelonApproach();
                    payment.setTotalCost(15.00);
                    System.out.println("Added to total cost: " + 15.50);
                    upperEchelonPizzaApproach.getFullPizza(pizza.make());
                }
                case "next" -> System.out.println("Proceed to checkout");
                default -> System.out.println("Wrong input, come on");
            }
        }
    }
}
