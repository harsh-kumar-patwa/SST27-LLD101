public class Demo08 {
    public static void main(String[] args) {
        Pedalable bicycle = new Bicycle();
        ElectricCar ec = new ElectricCar();
        bicycle.pedal(5); 
        ec.startEngine();
        ec.recharge(100);

    }
}
