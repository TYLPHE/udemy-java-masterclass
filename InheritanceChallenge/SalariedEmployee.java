public class SalariedEmployee {
    
    public double annualSalary;
    public boolean isRetired;

    public SalariedEmployee() {
        this(50000.00, false);
    }
    public SalariedEmployee(double annualSalary, boolean isRetired) {
        this.annualSalary = annualSalary;
        this.isRetired = isRetired;
    }

    public void retire() {
        isRetired = isRetired ? false : true;
    }

    @Override
    public String toString() {
        return "SalariedEmployee [annualSalary=" + annualSalary + ", isRetired=" + isRetired + "]";
    }
}
