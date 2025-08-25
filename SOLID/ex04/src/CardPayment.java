public class CardPayment implements PaymentProvider {

    @Override
    public String pay(double amount) {
        return "Paid by card: " + amount;
    }
    
}
