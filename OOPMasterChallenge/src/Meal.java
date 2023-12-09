public class Meal {

    private Burger burger;
    private Drink drink;
    private Side side;
    private double total;

    public Meal() {
        burger = new Burger();
        drink = new Drink();
        side = new Side();
    }

    public void Deluxe() {
        burger = new Burger();
        drink = new Drink();
        side = new Side();

        burger.setDeluxe();
    }

    public void addCheese() {
        burger.getSides().add("Cheese");
    }

    public void addBacon() {
        burger.getSides().add("Bacon");
    }

    public void addPastrami() {
        burger.getSides().add("Pastrami");
    }

    public void setDrinkSize(char size) {
        drink.setSize(size);
    }

    public void setSide(String s) {
        side.setSide(s);
    }

    public void setDrinkType(String s) {
        drink.setDrink(s);
    }

    public void checkout() {
        System.out.println("Order:");
        System.out.printf("Burger: %s%n", burger.getBurger());
        if (!burger.getSides().isEmpty()) {
            for (String side : burger.getSides()) {
                System.out.println("  w/ " + side);
            }
        } else {
            System.out.println("Sides: N/A");
        }
        System.out.println("Side: " + side.getSide());
        System.out.println("Drink: " + drink.getSize() + " " + drink.getDrink());

        burger.checkout();
        total += burger.getPrice() + drink.getPrice() + side.getPrice();

        System.out.println("total = " + total);
    }
}
