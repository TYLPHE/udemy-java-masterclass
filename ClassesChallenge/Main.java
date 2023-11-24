package ClassesChallenge;

public class Main {
    public static void main(String[] args) {
        BankAccount tylphe = new BankAccount();
        tylphe.setAccountBalance(0);
        tylphe.setAccountNumber(1234567890);
        tylphe.setCustomerEmail("test@test.com");
        tylphe.setCustomerName("Tyl Phe");
        tylphe.setCustomerPhone("123123123");

        tylphe.printCustomerInfo();

        tylphe.deposit(999.55);
        tylphe.withdraw(555.55);
        tylphe.withdraw(1000);
    }
}
