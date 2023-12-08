public class Main {

    public static void main(String[] args) {
        Printer printer = new Printer(50, 0, true);
        printer.addToner(40);
        printer.addToner(20);
        printer.printPages(50);
    }
}
