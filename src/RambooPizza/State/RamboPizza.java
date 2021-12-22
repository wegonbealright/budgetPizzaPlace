package RambooPizza.State;


public class RamboPizza {

    DeliveryState delivery;

    public RamboPizza(DeliveryState delivery) {
        this.delivery = delivery;
    }
    public RamboPizza(){
        delivery = new Acknowledged().getState();
    }
    public void setDelivery(DeliveryState delivery) {
        this.delivery = delivery;
    }
    public void initiateProcess(String food){
        delivery.deliver(this, food);
    }

}
