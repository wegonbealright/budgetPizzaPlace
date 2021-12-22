package RambooPizza.State;

public class InTransition implements DeliveryState {
    private static final DeliveryState state = new InTransition();

    public DeliveryState getState() {
        return state;
    }

    @Override
    public void deliver(RamboPizza ramboPizza, String food) {
        System.out.println("Austrian Rambo took his scooter to deliver your " + food);
        ramboPizza.setDelivery(new Delivered().getState());

    }
}
