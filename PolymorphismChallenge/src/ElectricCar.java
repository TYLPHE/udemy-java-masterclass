public class ElectricCar extends Car {

    private double avgMPC;
    private int batterySize;

    public ElectricCar(String description, double avgMPC, int batterySize) {
        super(description);
        this.avgMPC = avgMPC;
        this.batterySize = batterySize;
    }

    @Override
    public void startEngine() {
        super.startEngine();
        System.out.println("It doesn't make sound");
    }

    @Override
    public void drive() {
        super.drive();
        System.out.println("Sounds like an RC car");
    }

    @Override
    protected void runEngine() {
        super.runEngine();
        System.out.println("Motors are whirring");
    }
}
