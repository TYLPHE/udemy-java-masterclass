public class Drink extends Order {

    private String drink;
    private char size;

    public Drink() {
        drink = "Coke";
        size = 'M';
        setPrice(size);
    }

    public Drink(String drink, char size) {
        this.drink = drink;
        this.size = size;
        setPrice(this.size);
    }

    private void setPrice(char size) {
        switch(size) {
            case 'S', 's' -> setPrice(.33);
            case 'M', 'm' -> setPrice(.66);
            case 'L', 'l' -> setPrice(.99);
            default -> setPrice(0);
        }
    }

    public void setSize(char size) {
        this.size = size;
    }

    public void setDrink(String drink) {
        this.drink = drink;
        setPrice(this.size);
    }

    public char getSize() {
        return size;
    }

    public String getDrink() {
        return drink;
    }
}
