package Extra;
import java.lang.StringBuilder;

public class StringMutability {
    public static void main(String[] args) {
//        String str = "Immutable"; // This is immutable. Must use StringBuilder
        StringBuilder str = new StringBuilder("Mutable");
        manipulateString(str);
        System.out.println(str);
    }

    public static void manipulateString(String str) {
        str.concat(" string test");
    }

    public static void manipulateString(StringBuilder str) {
        str.append(" string test");
    }
}

