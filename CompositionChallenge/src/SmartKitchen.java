public class SmartKitchen {

    private final CoffeeMaker brewMaster = new CoffeeMaker();
    private final Refrigerator iceBox = new Refrigerator();
    private final DishWasher dishWasher = new DishWasher();

    public void addWater() {
        brewMaster.setHasWorkToDo(true);
    }

    public void pourMilk() {
        iceBox.setHasWorkToDo(true);
    }

    public void loadDishwasher() {
        dishWasher.setHasWorkToDo(true);
    }

    public void setKitchenState(boolean coffee, boolean fridge, boolean dish) {
        brewMaster.setHasWorkToDo(coffee);
        iceBox.setHasWorkToDo(fridge);
        dishWasher.setHasWorkToDo(dish);
    }

    public void doKitchenWork() {
        brewMaster.brewCoffee();
        iceBox.orderFood();
        dishWasher.doDishes();
    }
}
