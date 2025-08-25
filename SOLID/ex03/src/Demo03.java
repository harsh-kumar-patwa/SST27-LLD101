public class Demo03 {
    public static void main(String[] args) {
        Shipment shipment = new Shipment(new ExpressShipment(), 2.0);
        System.out.println(new ShippingCostCalculator().cost(shipment));
    }
}
