public class CoffeeMaker extends Appliance {

    protected void brewCoffee() {
        if (isHasWorkToDo()) {
            System.out.println("Coffee brewed.");
        }
    }

}
