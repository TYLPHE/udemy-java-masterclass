package ConstructorChallenge;

public class CustomerInstructor {
    
    private String name;
    private double creditLimit;
    private String email;

    public CustomerInstructor() {
        this("Nobody", "nobody@nowhere.com");
    }
    public CustomerInstructor(String name, String email) {
        this(name, 1000, email);
    }
    public CustomerInstructor(String name, double creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }
    public String getName() {
        return name;
    }
    public double getCreditLimit() {
        return creditLimit;
    }
    public String getEmail() {
        return email;
    }
}
