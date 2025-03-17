package StateDesignParttern;

public class CancelledOrderState implements OrderState{
    @Override
    public void handleOrder(OrderContext context) {
        System.out.println("Cập nhật trạng thái hủy đơn hàng và hoàn tiền");
    }
}
