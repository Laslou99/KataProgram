package Study_2;

import java.util.Arrays;

public class Lessen_1_5_10 {
    public static void main(String[] args) {
        int[] res = {1, 2, 3};
        System.out.println(Arrays.toString(getArrayMiddle(res)));
    }


    public static int[] getArrayMiddle(int[] numbers) {
        if (null == numbers || numbers.length < 1) {
            return numbers;
        }
        int start = numbers.length / 2 + numbers.length % 2 - 1;
        int end = start + 2 - numbers.length % 2;
        return Arrays.copyOfRange(numbers, start, end);
    }
}
