public class Demo09 {
    public static void main(String[] args) {
        OrderRepository orderRepository = new SqlOrderRepository();
        new OrderController(orderRepository).create("ORD-1");
    }
}
