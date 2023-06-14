package Study_1;

import java.math.BigInteger;

public class Lessen_1_2_14 {

    public static void main(String[] args) {
        maxLongSqr();
    }

    public static void maxLongSqr() {
        BigInteger b = BigInteger.valueOf(Long.MAX_VALUE);
        b = b.multiply(b);
        System.out.println(b);
    }

}
