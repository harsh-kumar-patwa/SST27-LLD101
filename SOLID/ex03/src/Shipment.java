public class Shipment {
    private ShipmentType shipmentType;
    private double weightKg;

    public Shipment(ShipmentType shipmentType, double weightKg) {
        this.shipmentType = shipmentType;
        this.weightKg = weightKg;
    }

    public double calculateCost() {
        return shipmentType.calculateCost(weightKg);
    }
}