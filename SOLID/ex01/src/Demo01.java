

public class Demo01 {
    public static void main(String[] args) {
        TaxService taxService = new TaxService();
        EmailClient emailClient = new EmailClient();
        OrderService orderService = new OrderService(taxService, emailClient);
        
        orderService.checkout("a@shop.com", 100.0);
    }
}
