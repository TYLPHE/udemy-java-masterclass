package ReadingUserInput;
import java.util.Scanner;

public class Challenge {
    public static void main(String[] args) {

        int total = 0;
        for (int i = 1; i <= 5; i += 1) {
            total += assignNumber(i);
        }

        System.out.println("Total: " + total);
    }

    public static int assignNumber(int numVariable) {

        Scanner scanner = new Scanner(System.in);
        boolean updated = false;
        
        while (!updated) {
            try {
                System.out.println("Enter number #" + numVariable + ": ");
            numVariable = Integer.parseInt(scanner.nextLine());
                updated = true;
            } catch (NumberFormatException nfe) {
                System.out.println("Error: Not an integer. Try again.");
            }
        }

        return numVariable;
    }
}
