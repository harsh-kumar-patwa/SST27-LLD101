public class OvernightShipment implements ShipmentType {
    @Override
    public double calculateCost(double weightKg) {
        return 120 + 10 * weightKg;
    }
}