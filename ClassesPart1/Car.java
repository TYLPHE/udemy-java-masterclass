package ClassesPart1;

public class Car {
    
    private String make = "Ford";
    private String model = "Fiesta";
    private String color = "Gray";
    private int doors = 4;
    private boolean convertible;

    public String getModel() {
        return model;
    }



    public String getColor() {
        return color;
    }



    public int getDoors() {
        return doors;
    }



    public boolean isConvertible() {
        return convertible;
    }



    public String getMake() {
        return make;
    }

    
    
    public void describeCar() {
        System.out.println(doors + "-Door " +
            color + " " +
            make + " " +
            model + " " +
            (convertible ? "Convertible" : ""));
    }
}
