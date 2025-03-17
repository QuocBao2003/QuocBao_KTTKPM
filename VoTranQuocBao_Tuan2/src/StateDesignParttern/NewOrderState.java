package StateDesignParttern;

public class NewOrderState implements OrderState {
    @Override
    public void handleOrder(OrderContext context) {
        System.out.println("Kiểm tra thông tin đơn hàng...");
        context.setState(new ProcessingOrderState());  // Chuyển sang trạng thái "Đang xử lý"
    }
}
