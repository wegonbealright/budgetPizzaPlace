package RambooPizza.State;

public class Delivered implements DeliveryState {

    private static final DeliveryState state = new Delivered();

    public DeliveryState getState() {
        return state;
    }

    @Override
    public void deliver(RamboPizza pizza, String food) {
        System.out.println("Your " + food + " was delivered directly by Austrian Rambo");
    }
}
