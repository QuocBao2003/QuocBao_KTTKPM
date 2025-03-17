package StateDesignParttern;

public class ProcessingOrderState implements OrderState{


    @Override
    public void handleOrder(OrderContext context) {
        System.out.println("Đang vận chuyển");
        context.setState(new DeliveredOrderState());
    }
}
