public class Main {

    public static void main(String[] args) {

        Item coke = new Item("drink", "Coke", 1.50);
        coke.printItem();
        coke.setSize("LARGE");
        coke.printItem();
    }
}
