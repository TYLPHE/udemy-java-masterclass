package Switch;

public class SwitchChallenge {
    public static void main(String[] args) {
        natoAlpha('a');
        natoAlpha('b');
        natoAlpha('c');
        natoAlpha('d');
        natoAlpha('e');
        natoAlpha('0');
    }

    public static void natoAlpha(char letter) {
        // Traditional switch statement
        switch (letter) {
            case 'a':
                System.out.println(letter + " is Alpha");
                break;
            case 'b':
                System.out.println(letter + " is Beta");
                break;
            case 'c':
                System.out.println(letter + " is Charlie");
                break;
            case 'd':
                System.out.println(letter + " is Delta");
                break;
            case 'e':
                System.out.println(letter + " is Echo");
                break;
            default:
                System.out.println("Error: '" + letter + "' not found.");
                break;
        }
    }
}
