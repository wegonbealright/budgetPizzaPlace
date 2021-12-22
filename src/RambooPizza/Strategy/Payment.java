package RambooPizza.Strategy;

public class Payment {
    private boolean isClosed = false;
    private double totalCost = 0.0;


    public void processOrder(PayStrategy strategy) {
        strategy.collectPaymentDetails();
    }

    public void setTotalCost(double cost) {
        this.totalCost += cost;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public boolean isClosed() {
        return isClosed;
    }

    public void setClosed(boolean closed) {
        isClosed = closed;
    }
}
