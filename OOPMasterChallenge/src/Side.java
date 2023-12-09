public class Side extends Order {

    private String side;

    public Side() {
        side = "Fries";
        setPrice(side);
    }

    public Side(String side) {
        this.side = side;
        setPrice(this.side);
    }

    public void setPrice(String side) {
        switch (side) {
            case "Fries" -> setPrice(1);
            case "Onion Rings" -> setPrice(1.5);
            case "Nuggets" -> setPrice(1.33);
            default -> setPrice(0);
        }
    }

    public String getSide() {
        return side;
    }

    public void setSide(String side) {
        this.side = side;
        setPrice(this.side);
    }
}
