public class HybridCar extends Car {

    private double avgMPG;
    private int batterySize;
    private int cylinders;

    public HybridCar(String description, double avgMPG, int batterySize, int cylinders) {
        super(description);
        this.avgMPG = avgMPG;
        this.batterySize = batterySize;
        this.cylinders = cylinders;
    }

    @Override
    public void startEngine() {
        super.startEngine();
        System.out.println("Hybrid noises");
    }

    @Override
    public void drive() {
        super.drive();
        System.out.println("Alternating between fuel and electricity");
    }

    @Override
    protected void runEngine() {
        super.runEngine();
        System.out.println("Much fuel efficiency");
    }
}

