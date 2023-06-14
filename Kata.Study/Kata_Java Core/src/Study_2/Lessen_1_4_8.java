package Study_2;

import java.math.BigInteger;

public class Lessen_1_4_8 {
    public static void main(String[] args) {
        factorial(5);
    }

    public static BigInteger factorial(int value) {
        if (value == 0) {
            return BigInteger.ONE;
        }
        return BigInteger.valueOf(value).multiply(factorial(value - 1));//Твой код здесь
    }

}
