package Study_2;

public class Lessen_1_4_11 {
    public static void main(String[] args) {
        isWeekend("Fridey");
    }

    public static boolean isWeekend(String weekday) {
        boolean days;
        if ((weekday == "Monday") ||
                (weekday == "Tuesday") ||
                (weekday == "Wednesday") ||
                (weekday == "Thursday") ||
                (weekday == "Friday")) {
            days = false;
        } else {
            days = true;
        }
        return days;
    }
}
