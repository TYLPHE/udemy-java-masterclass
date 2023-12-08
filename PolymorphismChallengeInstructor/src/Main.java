public class Main {
    public static void main(String[] args) {
        Car car = new Car("2022 Ferrari");
        runRace(car);

        Car ferrari = new GasPowereredCar("2022 Ferrari", 15.4, 6);
        runRace(ferrari);

        Car tesla = new ElectricCar("Tesla", 568, 75);
        runRace(tesla);

        Car ferrariHybrid = new HybridCar("2022 Ferrari Hybrid", 16, 8, 8);
        runRace(ferrariHybrid);
    }

    public static void runRace(Car car) {

        car.startEngine();
        car.drive();
    }
}
