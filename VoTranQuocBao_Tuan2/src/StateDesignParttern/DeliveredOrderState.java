package StateDesignParttern;

public class DeliveredOrderState  implements OrderState{


    @Override
    public void handleOrder(OrderContext context) {
        System.out.println("Cập nhật trạng thái đã giao");
    }
}
