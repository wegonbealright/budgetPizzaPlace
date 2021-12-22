package RambooPizza.State;

public class InProgress implements DeliveryState {

    private static final DeliveryState state = new InProgress();

    public DeliveryState getState() {
        return state;
    }

    @Override
    public void deliver(RamboPizza ramboPizza, String food) {
        System.out.println("Austrian Rambo started Cookin' " + food + " Up");
        ramboPizza.setDelivery(new ReadyToBeDelivered().getState());
    }
}
