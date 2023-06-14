package Study_2;

import java.math.BigInteger;

public class Lessen_1_4_7 {
    public static void main(String[] args) {
        factorial(5);
    }

    public static BigInteger factorial(int value) {
        BigInteger result = BigInteger.ONE;
        for (int i = 1; i <= value; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }
}