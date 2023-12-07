class InheritanceChallenge {
    public static void main(String[] args) {

        System.out.println(Integer.parseInt("10/18/1987".substring(6,10)));

        Worker tyler = new Worker(123456789, "12/01/2023", "Tyler P", "10/18/1987", "N/A");
        System.out.println(tyler.name + " recieves a $" + tyler.collectPay() + " paycheck.");
        System.out.println(tyler.name + " is " + tyler.getAge() + " years old.");
        tyler.terminate("1/1/2024");
        System.out.println(tyler.name + " is " + (tyler.isRetired ? "" : "NOT") + " retired.");
        tyler.retire();
        System.out.println(tyler.name + " is" + (tyler.isRetired ? "" : " NOT") + " retired.");

        System.out.println(tyler);
    }
}
