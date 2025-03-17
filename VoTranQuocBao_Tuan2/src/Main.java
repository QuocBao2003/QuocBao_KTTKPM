import StateDesignParttern.CancelledOrderState;
import StateDesignParttern.OrderContext;
import StateDesignParttern.ProcessingOrderState;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        OrderContext orderContext=new OrderContext();
            orderContext.processOrder();
            orderContext.processOrder();
            orderContext.processOrder();
        System.out.println(orderContext);
        orderContext.setState( new CancelledOrderState());
        
//        System.out.println("Bắt đầu kiểm tra trạng thái đơn hàng");
//        orderContext.processOrder();
//
//        orderContext.setState(new ProcessingOrderState());
//        orderContext.processOrder();
//        orderContext.setState(new CancelledOrderState());
//        orderContext.processOrder();

        }
    }
