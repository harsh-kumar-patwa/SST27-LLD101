public class ExpressShipment implements ShipmentType {
    @Override
    public double calculateCost(double weightKg) {
        return 80 + 8 * weightKg;
    }
}