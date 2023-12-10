import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Integer[] arr1 = randomArray(5);
        System.out.println(Arrays.toString(arr1));
        Arrays.sort(arr1, Collections.reverseOrder());
        System.out.println(Arrays.toString(arr1));
    }

    private static Integer[] randomArray(int length) {

        Random random = new Random();
        Integer[] array = new Integer[length];

        for (int i = 0; i < length; i += 1) {
            array[i] = random.nextInt(20);
        }

        return array;
    }
}
