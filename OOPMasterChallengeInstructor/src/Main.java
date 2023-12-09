public class Main {

    public static void main(String[] args) {

//        Item coke = new Item("drink", "Coke", 1.50);
//        coke.printItem();
//        coke.setSize("LARGE");
//        coke.printItem();
//
//        Item avocado = new Item("Topping", "avocado", 1.50);
//        avocado.printItem();

//        Burger burger = new Burger("regular", 4);
//        burger.addToppings("BACON", "CHEESE", "MAYO");
//        burger.printItem();

//        MealOrder regularMeal = new MealOrder();
//        regularMeal.addBurgerToppings("Bacon", "CHEESE", "MAYO");
//        regularMeal.setDrinkSize("LARGE");
//        regularMeal.printItemizedList();

//        MealOrder secondMeal = new MealOrder("turkey", "7-up", "chili");
//        secondMeal.addBurgerToppings("Lettuce", "cheese", "mayo");
//        secondMeal.setDrinkSize("small");
//        secondMeal.printItemizedList();

        MealOrder deluxe = new MealOrder("deluxe", "sprite", "chili");
        deluxe.addBurgerToppings("avocado", "bacon", "lettuce", "cheese", "mayo");
        deluxe.setDrinkSize("SMALL");
        deluxe.printItemizedList();
    }
}
