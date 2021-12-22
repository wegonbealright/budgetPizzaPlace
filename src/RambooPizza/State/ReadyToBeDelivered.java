package RambooPizza.State;

public class ReadyToBeDelivered implements DeliveryState {

    private static final DeliveryState state = new ReadyToBeDelivered();

    public DeliveryState getState() {
        return state;
    }
    @Override
    public void deliver(RamboPizza ramboPizza, String food) {
        System.out.println("Austrian Rambo finished cookin " + food);
        ramboPizza.setDelivery(new InTransition().getState());
    }
}
