public class OrderService {
    TaxService taxService;
    EmailClient emailClient;

    OrderService(TaxService taxService, EmailClient emailClient){
        this.taxService = taxService;
        this.emailClient = emailClient;
    }

    void sendEmail(){
        System.out.println("Order stored (pretend DB).");
    }
    
    void checkout(String customerEmail, double subtotal) {
        double total = taxService.totalWithTax(subtotal);
        emailClient.send(customerEmail, "Thanks! Your total is " + total);
        sendEmail();
    }
}