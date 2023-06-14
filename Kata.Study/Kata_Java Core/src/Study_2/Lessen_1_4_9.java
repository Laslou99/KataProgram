package Study_2;

public class Lessen_1_4_9 {

    public static void main(String[] args) {

    }

    public int determineGroup(int age) {
        int result;
        if ((age >= 7) && (age <= 13)) {
            result = 1;
        } else if ((age >= 14) && (age <= 17)) {
            result = 2;
        } else if ((age >= 18) && (age <= 65)) {
            result = 3;
        } else {
            result = -1;
        }
        return result;
    }

}
