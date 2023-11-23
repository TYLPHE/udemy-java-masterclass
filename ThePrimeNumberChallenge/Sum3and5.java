package ThePrimeNumberChallenge;
public class Sum3and5 {
    public static void main(String[] args) {
        int sum = 0;
        int count = 0;

        for (int i = 1; i <= 1000 && count < 5; i += 1) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i);
                sum += i;
                count += 1;
            }
        }

        System.out.println("Sum = " + sum);
    }
}
