package ReadingUserInput;
 
import java.util.Scanner;

public class Challenge2 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int minNumber = Integer.MAX_VALUE;
        int maxNumber = Integer.MIN_VALUE;
        boolean userInputtedData = false;

        while (true) {
            try {
                System.out.println("Enter a number:");
                int number = Integer.parseInt(scanner.nextLine());

                if (number < minNumber) {
                    minNumber = number;
                }

                if (number > maxNumber) {
                    maxNumber = number;
                }
                
                userInputtedData = true;
            } catch (NumberFormatException nfe) {
                System.out.println("Not an integer. Exiting.");
                break;
            }
        }

        if (userInputtedData) {
            System.out.println("Min number entered: " + minNumber);
            System.out.println("Max number entered: " + maxNumber);
        } else {
            System.out.println("No valid data inputted");
        }
    }
}
