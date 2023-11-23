package Switch;

public class Main {
    
    public static void main(String[] args) {

        // int value = 3;
        // if (value == 1) {
        //     System.out.println("Value was 1" );
        // } else if (value == 2) {
        //     System.out.println("Value was 2");
        // } else {
        //     System.out.println("Was not 1 or 2");
        // }

        // int switchValue = 3;

        // switch (switchValue) { 
        //     case 1:
        //         System.out.println("Value was 1");
        //         break;
        //     case 2:
        //         System.out.println("Value was 2");
        //         break;
        //     case 3: case 4: case 5:
        //         System.out.println("Was a 3, a 4, or a 5");
        //         System.out.println("Actually it was a " + switchValue);
        //         break;
        //     default:
        //         System.out.println("Was not 1 - 5");
        //         break;
        // }

        // switch (switchValue) {
        //     case 1 -> System.out.println("Value was 1");
        //     case 2 -> System.out.println("Value was 2");
        //     case 3, 4, 5 -> {
        //         System.out.println("Value was a 3, 4, or 5");
        //         System.out.println("Actually it was a " + switchValue);
        //     }
        //     default -> System.out.println("Was not a 1 - 5");
        // }

        String month = "x";
        System.out.println(getQuarter(month));
    }

    // public static String getQuarter(String month) {
    //     switch (month) {
    //         case "january":
    //         case "february":
    //         case "march":
    //             return "1st";
    //         case "april":
    //         case "may":
    //         case "june":
    //             return "2nd";
    //         case "july":
    //         case "august":
    //         case "september":
    //             return "3rd";
    //         case "october":
    //         case "november":
    //         case "december":
    //             return "4th";
    //     } 

    //     return "bad";
    // }

    public static String getQuarter(String month) {
        return switch (month) {
            case "january", "february", "march" -> { yield "1st"; }
            case "april", "may", "june" -> "2nd";
            case "july", "august", "september" -> "3rd";
            case "october", "november", "december" -> "4th";
            default -> {
                String badResponse = month + " is bad";
                yield badResponse;
            }
        };
    }
}
