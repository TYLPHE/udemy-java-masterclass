package ClassesChallenge;

public class Main {
    public static void main(String[] args) {

        // BankAccountInstructor bob = new BankAccountInstructor("12345", 1000, "Bob B", "test@test.com", "123123123");
        BankAccountInstructor bob = new BankAccountInstructor();
        System.out.println(bob.getNumber());
        System.out.println(bob.getBalance());

        // BankAccountInstructor bob = new BankAccountInstructor();
        // bob.setNumber("12345");
        // bob.setBalance(1000.00);
        // bob.setCustomerName("Bob B");
        // bob.setCustomerEmail("bob@bob.com");
        // bob.setCustomerPhone("123123123");
        // bob.withdrawFunds(100);
        // bob.depositFunds(250);
        // bob.withdrawFunds(50);
        // bob.withdrawFunds(200);
        // bob.depositFunds(100);
        // bob.withdrawFunds(45.55);
        // bob.withdrawFunds(54.45);

        // System.out.println("--- my version below ---");

        // BankAccount tylphe = new BankAccount();
        // tylphe.setAccountBalance(0);
        // tylphe.setAccountNumber(1234567890);
        // tylphe.setCustomerEmail("test@test.com");
        // tylphe.setCustomerName("Tyl Phe");
        // tylphe.setCustomerPhone("123123123");

        // tylphe.printCustomerInfo();

        // tylphe.deposit(999.55);
        // tylphe.withdraw(555.55);
        // tylphe.withdraw(1000);

        BankAccountInstructor ty = new BankAccountInstructor("Tyler", "Ty@ty.com", "12345234");
        System.out.println(ty.getBalance() + " " + ty.getNumber());
    }
}
