public class Employee extends SalariedEmployee {
    
    public long employeeId;
    public String hireDate;

    public Employee(long employeeId, String hireDate) {
        this.employeeId = employeeId;
        this.hireDate = hireDate;
    }
    public Employee(double annualSalary, boolean isRetired, long employeeId, String hireDate) {
        super(annualSalary, isRetired);
        this.employeeId = employeeId;
        this.hireDate = hireDate;
    }
    @Override
    public String toString() {
        return "Employee [employeeId=" + employeeId + ", hireDate=" + hireDate + "] " + super.toString();
    }
}
