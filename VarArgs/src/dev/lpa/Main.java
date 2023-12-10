package dev.lpa;

public class Main {
    // Learning about variable arguments parameter.
    // The "..." in the parameter field.
    // This means it can take as many arguments as necessary
    // No need to overload the method
    public static void main(String... args) {

        System.out.println("Hello World again");

        String[] splitStrings = "Hello World again".split(" ");
        printText(splitStrings);

        System.out.println("_".repeat(20));
        printText("Hello");

        System.out.println("_".repeat(20));
        printText("Hello", "World", "again");

        System.out.println("_".repeat(20));
        printText();

        String[] sArray = {"1", "2", "3", "4", "5"};
        System.out.println(String.join(",", sArray));
    }

    private static void printText(String... textList) {

        for (String t : textList) {
            System.out.println(t);
        }
    }
}
