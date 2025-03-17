package StateDesignParttern;

public class OrderContext {
    private OrderState state;

    public  OrderContext() {
        state = new NewOrderState();
    }

    public void setState(OrderState state) {
        this.state = state;
    }
    public void processOrder() {
        state.handleOrder(this);
    }
}
