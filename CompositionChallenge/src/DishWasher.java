public class DishWasher extends Appliance {

    public void doDishes() {
        if (isHasWorkToDo()) {
            System.out.println("Dishes washed.");
        }
    }
}
