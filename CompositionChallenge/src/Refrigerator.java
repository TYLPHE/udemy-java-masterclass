public class Refrigerator extends Appliance {

    public void orderFood() {
        if (isHasWorkToDo()) {
            System.out.println("Food ordered.");
        }
    }
}
