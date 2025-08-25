public class ElectricCar implements Motorized, Rechargeable {
    @Override
    public void startEngine() {
        System.out.println("Starting electric motor");
    }

    @Override
    public void recharge(int kWh) {
        System.out.println("Recharging with " + kWh + " kWh");
    }
}