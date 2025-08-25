public class OrderController {
    OrderRepository orderRepository;

    OrderController(OrderRepository orderRepository){
        this.orderRepository = orderRepository;
    }

    void create(String id){
        orderRepository.save(id);
        System.out.println("Created order: " + id);
    }
}