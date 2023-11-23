package ThePrimeNumberChallenge;

public class ForLoopChallenge {
    public static void main(String[] args) {
        int numRange = 100;
        System.out.println("For " + numRange + ", " + primeCounter(numRange) + " prime numbers found");
    }

    public static boolean isPrime(int wholeNumber) {
        if (wholeNumber <= 2) {
            return (wholeNumber == 2);
        }

        for (int divisor = 2; divisor <= wholeNumber / 2; divisor += 1) {
            if (wholeNumber % divisor == 0) {
                return false;
            }
        }

        return true;
    }

    public static int primeCounter(int numRange) {

        int counter = 0;
        for (int currentNum = 1; currentNum < numRange + 1; currentNum += 1) {
            if (isPrime(currentNum)) {
                System.out.println(currentNum);
                counter += 1;
            }
        }
        
        return counter;
    }
}
