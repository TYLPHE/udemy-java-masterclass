public class GasPoweredCar extends Car {

    private double avgMPG;
    private int cylinders;

    public GasPoweredCar(String description, double avgMPG, int cylinders) {
        super(description);
        this.avgMPG = avgMPG;
        this.cylinders = cylinders;
    }

    @Override
    public void startEngine() {
        super.startEngine();
        System.out.println("Steering wheel vibrating");
    }

    @Override
    public void drive() {
        super.drive();
        System.out.println("Guzzling gas");
    }

    @Override
    protected void runEngine() {
        super.runEngine();
        System.out.println("Engine revving");
    }
}
