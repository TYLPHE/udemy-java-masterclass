package ConstructorChallenge;

public class Main {
    public static void main(String[] args) {
        Customer a = new Customer("Aaron", 2000, "a@a.com");
        Customer b = new Customer();
        Customer c = new Customer("C", "c@c.com");

        System.out.println(a.getName() + " " + a.getEmail() + " " + a.getCreditLimit());
        System.out.println(b.getName() + " " + b.getEmail() + " " + b.getCreditLimit());
        System.out.println(c.getName() + " " + c.getEmail() + " " + c.getCreditLimit());

        System.out.println("---Instructor version below---");

        CustomerInstructor customer = new CustomerInstructor("Tim", 1000, "t@email.com");
        System.out.println(customer.getName());
        System.out.println(customer.getCreditLimit());
        System.out.println(customer.getEmail());

        CustomerInstructor secondCustomer = new CustomerInstructor();
        System.out.println(secondCustomer.getName());
        System.out.println(secondCustomer.getCreditLimit());
        System.out.println(secondCustomer.getEmail());

        CustomerInstructor thirdCustomer = new CustomerInstructor("Joe", "joe@email.com");
        System.out.println(thirdCustomer.getName());
        System.out.println(thirdCustomer.getCreditLimit());
        System.out.println(thirdCustomer.getEmail());        
    }
}
