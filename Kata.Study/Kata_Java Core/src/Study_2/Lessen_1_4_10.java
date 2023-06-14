package Study_2;

public class Lessen_1_4_10 {

    public static void main(String[] args) {
        isWeekend("Tuesday");
    }

    public static boolean isWeekend(String weekday) {
        boolean days = false;
        switch (weekday) {
            case "Monday":
                days = false;
                break;
            case "Tuesday":
                days = false;
                break;
            case "Wednesday":
                days = false;
                break;
            case "Thursday":
                days = false;
                break;
            case "Friday":
                days = false;
                break;
            case "Saturday":
                days = true;
                break;
            case "Sunday":
                days = true;
                break;
        }
        return days;
    }

}
