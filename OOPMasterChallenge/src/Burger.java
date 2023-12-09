import java.util.ArrayList;
import java.util.List;

public class Burger extends Order {

    private String burger;
    private boolean deluxe;
    private List<String> sides = new ArrayList<>();

    public Burger() {
        burger = "Burger";
        setPrice(3.00);
    }

    private void setPrice(List<String> sides) {
        for (String side : sides) {
            if (side.equalsIgnoreCase("cheese")) {
                setPrice(getPrice() + 1);
            } else if (side.equalsIgnoreCase("bacon")) {
                setPrice(getPrice() + 2);
            } else if (side.equalsIgnoreCase("pastrami")) {
                setPrice(getPrice() + 2);
            }
        }
    }

    public void setDeluxe() {
        burger = "Deluxe";
        deluxe = true;
    }

    public void checkout() {
        setPrice(sides);

        if (deluxe) {
            setPrice(7.5);
        }
    }

    public String getBurger() {
        return burger;
    }

    public List<String> getSides() {
        return sides;
    }
}
