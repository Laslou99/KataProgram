package Study_2;

public class Lessen_1_3_6 {

    public static void main(String[] args) {
        isPowerOfTwo(0);
    }

    public static boolean isPowerOfTwo(int value) {
        if (value == 0) {
            return false;
        }
        else {
            int end = Math.abs(value);
            return (end & (end - 1)) == 0;
        }
    }
}
