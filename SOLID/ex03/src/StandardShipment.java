public class StandardShipment implements ShipmentType {
    @Override
    public double calculateCost(double weightKg) {
        return 50 + 5 * weightKg;
    }
}