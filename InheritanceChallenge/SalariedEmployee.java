package InheritanceChallenge;

public class SalariedEmployee {
    
    protected double annualSalary;
    protected boolean isRetired;

    public SalariedEmployee() {
        this(50000.00, false);
    }
    public SalariedEmployee(double annualSalary, boolean isRetired) {
        this.annualSalary = annualSalary;
        this.isRetired = isRetired;
    }

    protected void retire() {
        isRetired = isRetired ? false : true;
    }

    @Override
    public String toString() {
        return "SalariedEmployee [annualSalary=" + annualSalary + ", isRetired=" + isRetired + "]";
    }
}
