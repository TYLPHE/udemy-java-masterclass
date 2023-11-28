package InheritanceChallenge;

public class Worker extends Employee {
    
    protected String name;
    protected String birthDate;
    protected String endDate;

    public Worker(long employeeId, String hireDate, String name, String birthDate, String endDate) {
        super(employeeId, hireDate);
        this.name = name;
        this.birthDate = birthDate;
        this.endDate = endDate;
    }

    public Worker(double annualSalary, boolean isRetired, long employeeId, String hireDate, String name,
            String birthDate, String endDate) {
        super(annualSalary, isRetired, employeeId, hireDate);
        this.name = name;
        this.birthDate = birthDate;
        this.endDate = endDate;
    }

    protected int getAge() {

        String birthYearStr = birthDate.substring(6,10);
        int birthYear = Integer.parseInt(birthYearStr);
        int currentYear = 2023;

        return currentYear - birthYear;
    }

    protected double collectPay() {
        
        double pay = annualSalary / 52;

        return pay;
    }

    protected void terminate(String endDate) {

        this.endDate = endDate;
        System.out.println(name + " is terminated on " + this.endDate);
    }

    @Override
    public String toString() {
        return "Worker [name=" + name + ", birthDate=" + birthDate + ", endDate=" + endDate + "] " + super.toString();
    }
}
