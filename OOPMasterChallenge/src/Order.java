public class Order {

    private double price;

    protected Order() {
    }

    protected Order(double price) {
        this.price = price;
    }

    protected void setPrice(double price) {
        this.price = price;
    }

    protected double getPrice() {
        return price;
    }
}
