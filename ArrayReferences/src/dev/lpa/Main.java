package dev.lpa;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] myIntArray = new int[5];
        int[] antoherArray = myIntArray;

        System.out.println("myIntArray = " + Arrays.toString(myIntArray));
        System.out.println("anotherArray = " + Arrays.toString(antoherArray));

        antoherArray[0] = 1;
        modifyArray(myIntArray);
        System.out.println("After change ->");

        System.out.println("myIntArray = " + Arrays.toString(myIntArray));
        System.out.println("anotherArray = " + Arrays.toString(antoherArray));
    }

    private static void modifyArray(int[] array) {

        array[1] = 2;
    }
}
