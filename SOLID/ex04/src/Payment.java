public class Payment {
    PaymentProvider paymentProvider; 
    double amount;

    Payment(PaymentProvider paymentProvider, double amount){ 
        this.paymentProvider=paymentProvider; 
        this.amount=amount; 
    }

    public String pay(){
        return paymentProvider.pay(amount);
    }
}