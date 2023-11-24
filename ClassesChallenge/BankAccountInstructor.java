package ClassesChallenge;

public class BankAccountInstructor {

    private String number;
    private double balance;
    private String customerName;
    private String customerEmail;
    private String customerPhone;

    public BankAccountInstructor(String customerName, String customerEmail, String customerPhone) {
        this("9999", 100.55, customerName, customerEmail, customerPhone);
    }

    public BankAccountInstructor() {
        this("56789", 300, "Tom T", "tom@test.com", "123321123");
        System.out.println("Empty constructor called");
    }

    public BankAccountInstructor(String number, double balance, String customerName, String email, String phone) {
        System.out.println("Account constructor with parameters called");
        setNumber(number); // not as good because inheritance errors. set field values directly
        this.balance = balance;
        this.customerName = customerName;
        customerEmail = email;
        customerPhone = phone;
    }
    
    public void depositFunds(double depositAmount) {
        balance += depositAmount;
        System.out.println("Deposit of $" + depositAmount + "Made. New balance is " +
            balance);
    }

    public void withdrawFunds(double withdrawAmount) {
        if (balance - withdrawAmount < 0) {
            System.out.println("Insufficient You have " + balance);
        } else {
            balance -= withdrawAmount;
            System.out.println("Withdrawal of $" + withdrawAmount);
            System.out.println("New balance is " + balance);
        }
    }

    public String getNumber() {
        return number;
    }
    public void setNumber(String number) {
        this.number = number;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public String getCustomerName() {
        return customerName;
    }
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    public String getCustomerEmail() {
        return customerEmail;
    }
    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }
    public String getCustomerPhone() {
        return customerPhone;
    }
    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }
}
