public class Car {

    private String description;

    public Car(String description) {
        this.description = description;
    }

    public void startEngine() {
        System.out.println("Engine running");
    }

    public void drive() {
        System.out.println("Wheels spinning");
    }

    protected void runEngine() {
        System.out.println("Motors rotating");
    }
}

