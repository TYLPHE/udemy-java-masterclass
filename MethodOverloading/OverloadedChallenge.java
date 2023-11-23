package MethodOverloading;

public class OverloadedChallenge {
    public static void main(String[] args) {
        
        System.out.println(convertToCentimeters(68));
        System.out.println(convertToCentimeters(5, 8));

    }

    public static double convertToCentimeters(int inches) {
        // convert inches to centimeters

        double centimeters = inches * 2.54;

        return centimeters;
    }

    public static double convertToCentimeters(int feet, int inches) {
        // convert feet and inches to inches, 
        // call first method and return value

        int totalInches = feet * 12 + inches;
        double centimeters = convertToCentimeters(totalInches);

        return centimeters;
    }
}
