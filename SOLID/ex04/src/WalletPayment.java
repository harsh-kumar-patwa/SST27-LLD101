public class WalletPayment implements PaymentProvider{

    @Override
    public String pay(double amount) {
        return "Paid by Wallet: " + amount;
    }
    
}
