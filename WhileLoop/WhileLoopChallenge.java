package WhileLoop;

public class WhileLoopChallenge {
    public static void main(String[] args) {
        int number = 4;
        int evenCount = 0;
        int oddCount = 0;

        while (number < 20 && evenCount < 5) {
            number += 1;
            if (isEvenNumber(number)) {
                evenCount += 1;
                System.out.println(number + " is an even number");
                continue;
            }
            oddCount += 1;
            System.out.println(number + " is odd");
        }
        System.out.println("even: " + evenCount);
        System.out.println("odd: " + oddCount);
    }

    public static boolean isEvenNumber(int number) {
        return number % 2 == 0;
    }
}
