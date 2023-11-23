package Switch;

public class SwitchChallenge2 {
    public static void main(String[] args) {
        int dayNumber = 5;
        System.out.println(dayNumber + " is " + printDayOfWeek(dayNumber));
        System.out.println(dayNumber + " is " + printWeekDay(dayNumber));
    }

    public static String printDayOfWeek(int dayNumber) {
        // Enhanced switch statement
        return switch (dayNumber) {
            case 0 -> { yield "Sunday"; }
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            default -> "an invalid day";
        };
    }

    public static String printWeekDay(int dayNumber) {
        // Bonus if statement
        if (dayNumber == 0) {
            return "Sunday";
        } else if (dayNumber == 1) {
            return "Monday";
        } else if (dayNumber == 2) {
            return "Tuesday";
        } else if (dayNumber == 3) {
            return "Wednesday";
        } else if (dayNumber == 4) {
            return "Thursday";
        } else if (dayNumber == 5) {
            return "Friday";
        } else if (dayNumber == 6) {
            return "Saturday";
        }

        return "an invalid day";
    }
}
