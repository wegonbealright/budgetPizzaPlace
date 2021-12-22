package RambooPizza.Strategy;

public interface PayStrategy {

    boolean pay(double paymentAmount);
    void collectPaymentDetails();

}
