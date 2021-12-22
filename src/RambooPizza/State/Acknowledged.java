package RambooPizza.State;

public class Acknowledged implements DeliveryState {

    private static final DeliveryState state = new Acknowledged();

    public DeliveryState getState() {
        return state;
    }

    @Override
    public void deliver(RamboPizza ramboPizza, String food) {
        System.out.println("Your pizza " + food + " is acknowledged in the trenches");
        ramboPizza.setDelivery(new InProgress().getState());
    }
}
