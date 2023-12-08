public class Printer {

    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, int pagesPrinted, boolean duplex) {
        this.tonerLevel = tonerLevel;
        this.pagesPrinted = pagesPrinted;
        this.duplex = duplex;
    }

    public int addToner(int tonerAmount) {
        if (tonerLevel + tonerAmount > 100 || tonerLevel + tonerAmount < 0) {
            System.out.println("Toner level outside of range");
            System.out.println("tonerLevel = " + tonerLevel);
            return -1;
        } else {
            tonerLevel += tonerAmount;
        }

        System.out.println("tonerLevel = " + tonerLevel);
        return tonerLevel;
    }

    public int printPages(int pages) {

        if (duplex) {
            System.out.println("Duplex printer printing");
        }

        int sheets = duplex ? pages / 2 : pages;
        pagesPrinted += sheets;

        System.out.println("pagesPrinted = " + pagesPrinted);
        return sheets;
    }
}
