package InheritanceChallenge;

public class HourlyEmployee {
    
    protected double hourlyPayRate;

    public HourlyEmployee() {
        this(50.00);
    }
    public HourlyEmployee(double hourlyPayRate) {
        this.hourlyPayRate = hourlyPayRate;
    }

    public void getDoublePay() {
        this.hourlyPayRate *= 2;
    }
}
