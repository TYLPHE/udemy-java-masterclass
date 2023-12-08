public class Main {
    public static void main(String[] args) {

        GasPoweredCar gas = new GasPoweredCar("Ford", 30, 4);
        ElectricCar electric = new ElectricCar("Tesla", 300, 100);
        HybridCar hybrid = new HybridCar("Toyota", 40, 50, 4);

        gas.startEngine();
        gas.runEngine();
        gas.drive();
        System.out.println("---");
        electric.startEngine();
        electric.runEngine();
        electric.drive();
        System.out.println("-".repeat(3));
        hybrid.startEngine();
        hybrid.runEngine();
        hybrid.drive();
    }
}
