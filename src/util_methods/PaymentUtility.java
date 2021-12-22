package util_methods;

import RambooPizza.Decorator.Food;
import RambooPizza.State.RamboPizza;
import RambooPizza.Strategy.PayByCreditCard;
import RambooPizza.Strategy.PayByPaypal;
import RambooPizza.Strategy.PayStrategy;
import RambooPizza.Strategy.Payment;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PaymentUtility {
    private static final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    public static void selectPaymentMethod(RamboPizza ramboPizza, Payment payment, Food food) throws IOException {
        System.out.println("Please, select a payment method:\n" +
                "1 - PayPal" + "\n" +
                "2 - Credit Card");
        while (true) {
            String paymentMethod = reader.readLine();

            PayStrategy strategy;
            if (paymentMethod.equals("1")) {
                strategy = new PayByPaypal();
            } else {
                strategy = new PayByCreditCard();
            }

            payment.processOrder(strategy);

            if (strategy.pay(food.getPrice())) {
                System.out.println("Payment has been successful.");
                ramboPizza.initiateProcess(food.make());
                ramboPizza.initiateProcess(food.make());
                ramboPizza.initiateProcess(food.make());
                ramboPizza.initiateProcess(food.make());
                ramboPizza.initiateProcess(food.make());
                break;
            } else {
                System.out.println("FAIL! Please, check your data.");
            }

        }
    }
}
