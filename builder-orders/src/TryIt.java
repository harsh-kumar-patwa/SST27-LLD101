import com.example.orders.*;

public class TryIt {
    public static void main(String[] args) {
        OrderLine l1 = new OrderLine("A", 1, 200);
        OrderLine l2 = new OrderLine("B", 3, 100);

        Order order = new Order.Builder("o2", "a@b.com")
                .addLine(l1)
                .addLine(l2)
                .setDiscountPercent(10)
                .build();

        System.out.println("Before: " + order.totalAfterDiscount());
        l1.setQuantity(999); // This won't affect the order's total due to defensive copies
        System.out.println("After:  " + order.totalAfterDiscount());
        System.out.println("=> Totals remain stable due to immutability.");
    }
}