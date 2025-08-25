
public class Demo04 {
    public static void main(String[] args) {
        PaymentService ps = new PaymentService();
        PaymentProvider upi = new UpiPayment();
        PaymentProvider card = new CardPayment();
        PaymentProvider wallet = new WalletPayment();

        System.out.println(ps.pay(new Payment(upi,1000)));
        System.out.println(ps.pay(new Payment(card,1000)));
        System.out.println(ps.pay(new Payment(wallet,1000)));
    }
}
