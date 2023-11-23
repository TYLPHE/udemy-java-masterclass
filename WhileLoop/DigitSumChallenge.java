package WhileLoop;

public class DigitSumChallenge {
    public static void main(String[] args) {
        System.out.println(sumDigits(125));
        System.out.println(sumDigits(1000));
        System.out.println(sumDigits(0));
        System.out.println(sumDigits(-19));
        System.out.println(sumDigits(7));
        System.out.println(sumDigits(1234));
    }

    public static int sumDigits(int number) {
        if (number < 0) {
            return -1;
        } else if (number < 10) {
            return number;
        } else {
            int sumOfDigits = 0;

            while (number > 0) {
                if (number % 10 != 0) {
                    sumOfDigits += number % 10;
                }
                number /= 10;
            }

            return sumOfDigits;
        }
    }
}
