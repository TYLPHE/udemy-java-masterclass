package Extra;

public class StringMethods {
    public static void main(String[] args) {
        // str.indexOf()
//        String str = "Tyler Phe";
//        System.out.println(str.indexOf('T')); // '0'
//        int unicodeValue = (int) 'e';
//        System.out.println(str.indexOf(unicodeValue,0)); // 3
//        System.out.println(str.indexOf(unicodeValue,4)); // 8

        // str.length()
//        String str = "george";
//        System.out.println(str.length());

        // toCharArray()
//        String str = "A random sentence";
//        char[] arr = str.toCharArray();
//        System.out.println(arr[0]);

        // toUpperCase() toLowerCase()
//        System.out.println(str.toLowerCase());
//        System.out.println(str.toUpperCase());

        // charAt()
//        int charIdx = str.charAt(3);
//        System.out.println(charIdx); // 97
//        System.out.println((int) 'a');  // 97

        // concat()
//        String str1 = "This is a ";
//        String str2 = "way I can ";
//        String str3 = "string Strings together.";
//        System.out.println(str1.concat(str2.concat(str3)));

        // replace()
//        String str4 = "Laptop Case";
//        String str5 = str4.replace('a', '*');
//        System.out.println(str5);

        // Enhanced-for or for-each loop
//        String[][] arr = {{"hey this is "}, {"an array"}, {" of strings."}};
//        for (String[] strings : arr) {
//            for (String str : strings) {
//                System.out.print(str);
//            }
//        }
//
//        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
//        for (char i : vowels) {
//            System.out.println(i);
//        }
//
//        Map<String, String> firstMap = new HashMap<>();
//        firstMap.put("first", "1st");
//        firstMap.put("second", "2nd");
//        firstMap.put("third", "3rd");
//
//        for (String string : firstMap.keySet()) {
//            System.out.println(string); // not printed in order (HashMap)
//        }
//
//        Map<Integer, Character> secondMap = new TreeMap<>();
//        secondMap.put(1, 'a');
//        secondMap.put(2, 'b');
//        secondMap.put(3, 'c');
//
//        for (char i : secondMap.values()) {
//            System.out.println(i); // printed in order (TreeMap)
//        }

        // substring()
//        String str = "substring";
//        System.out.println(str.substring(2, 5)); // "bst"

        // split()
//        String str = "Split this sentence";
//        String[] arrayOfWords = str.split(" ");
//        for (String string : arrayOfWords) {
//            System.out.println(string);
//        }

        // compareTo()
//        String str1 = "b";
//        String str2 = "a";
//        String str3 = "c";
//        System.out.println(str1.compareTo(str2)); // Compares alphabetic position
//        System.out.println(str1.compareTo(str3));

        // strip()
//        String str = "   .eliminate whitespace.  .  ";
//        System.out.println(str.strip());

        // valueOf()
        char[] charArr = {'h', 'e', 'l', 'l', 'o'};
        System.out.println(String.valueOf(charArr)); // "hello"
    }
}
