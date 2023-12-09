public class Main {

    public static void main(String[] args) {
        Meal meal = new Meal();
        meal.addCheese();
        meal.addCheese();
        meal.addBacon();
        meal.addPastrami();
        meal.setDrinkSize('S');
        meal.setSide("Fries");
        meal.setDrinkType("Dr. Pepper");
        meal.checkout();

        System.out.println("---");

        Meal deluxe = new Meal();
        deluxe.Deluxe();
        deluxe.addBacon();
        deluxe.addCheese();
        deluxe.addCheese();
        deluxe.addPastrami();
        deluxe.setDrinkSize('L');
        deluxe.setSide("Onion Rings");
        deluxe.checkout();
    }
}
