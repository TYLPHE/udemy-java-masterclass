package MethodOverloading;

public class SecondsAndMinutes {
    public static void main(String[] args) {

        System.out.println(getDurationString(-3945));
        System.out.println(getDurationString(-65, 45));
        System.out.println(getDurationString(65, 145));
        
    }

    public static String getDurationString(int seconds) {

        if (seconds < 0) {
            return negativeError();
        }

        if (seconds > 60) {
            return getDurationString(seconds / 60, seconds % 60);
        }
        
        return "0h0m" + seconds + 's';
    }

    public static String getDurationString(int minutes, int seconds) {

        if (minutes < 0 || seconds < 0) {
            return negativeError();
        }
     
        int displaySeconds = seconds;
        if (seconds > 60) {
            minutes += seconds % 60;
        }

        int displayMinutes = minutes;
        if (minutes > 60) {
            displayMinutes %= 60;
        }

        int displayHours = 0;
        if (minutes > 60) {
            displayHours = minutes / 60;
        }

        return "" + displayHours + 'h' + displayMinutes + 'm' + displaySeconds + 's';
    }

    public static String negativeError() {

        return "Cannot use negative number.";

    }
}
