package ClassesChallenge;

public class BankAccount {

    private int accountNumber;
    private double accountBalance;
    private String customerName;
    private String customerEmail;
    private String customerPhone;
    public int getAccountNumber() {
        return accountNumber;
    }
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }
    public double getAccountBalance() {
        return accountBalance;
    }
    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
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

    public void deposit(double amount) {
        System.out.println("Depositing $" + amount + "...");
        System.out.println("Success:");
        System.out.println(this.accountBalance + " -> " + (this.accountBalance + amount));
        this.accountBalance += amount;   
    }

    public void withdraw(double amount) {
        System.out.println("Withdrawing $" + amount + "...");
        if (this.accountBalance - amount < 0) {
            System.out.println("Not enough funds.");
            System.out.println("Account balance: " + this.accountBalance);
            return;
        }

        System.out.println("Success");
        System.out.println(this.accountBalance + " -> " + (this.accountBalance - amount));
        this.accountBalance -= amount;
    }

    public void printCustomerInfo() {
        System.out.println("Customer Name: " + this.customerName);
        System.out.println("Email: " + this.customerEmail);
        System.out.println("Phone: " + this.customerPhone);
        System.out.println("Account #: " + this.accountNumber);
        System.out.println("Balance: " + this.accountBalance);
    }
}
