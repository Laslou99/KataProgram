package Study_2;

public class Lessen_1_3_8 {
        public static boolean isPowerOfTwo(int value) {
            value = Math.abs(value);
            return Integer.bitCount(value) == 1;
    }
}
