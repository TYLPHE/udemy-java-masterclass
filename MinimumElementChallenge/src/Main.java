import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter numbers followed by commas: ");
        String s = scanner.nextLine();
        int[] numbers = readIntegers(s);
        System.out.println("numbers = " + Arrays.toString(numbers));
        System.out.println("Minimum number: " + minValue(numbers));
        System.out.println(Arrays.toString(numbers));
        reverse(numbers);
        System.out.println(Arrays.toString(numbers));
    }

    private static int[] readIntegers(String s) {

        String[] numbersString = s.split(",");
        int[] numbers = new int[numbersString.length];

        for (int i = 0; i < numbersString.length; i += 1) {
            numbers[i] = Integer.parseInt(numbersString[i]);
        }

        return numbers;
    }

    private static int minValue(int[] nums) {

        if (nums.length == 0) {
            return -1;
        }

        int min = nums[0];
        for (int num : nums) {
            if (num < min) {
                min = num;
            }
        }

        return min;
    }

    private static void reverse(int[] nums) {
        // Modify array to be reversed
        int temp;
        boolean swapped = true;
        while (swapped) {
            swapped = false;
            for (int i = 0; i < nums.length - 1; i += 1) {
                if (nums[i] < nums[i + 1]) {
                    temp = nums[i];
                    nums[i] = nums[i + 1];
                    nums[i + 1] = temp;
                    swapped = true;
                }
            }
        }
    }
}
