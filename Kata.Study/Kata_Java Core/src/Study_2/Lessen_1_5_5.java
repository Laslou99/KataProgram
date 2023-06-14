package Study_2;

public class Lessen_1_5_5 {
    public static void main(String[] args) {
    int[] numbers = {4, 6, 6, 4, 5};
    getArrayMiddle(numbers);
    }

    public static int[] getArrayMiddle(int[] numbers) {
        if (numbers.length > 2) {
            if (numbers.length % 2 == 0) {
                int[] arr2 = new int[2];
                arr2[0] = numbers[numbers.length / 2 - 1];
                arr2[1] = numbers[numbers.length / 2];
                return arr2;
            } else {
                int[] arr1 = new int[1];
                arr1[0] = numbers[numbers.length / 2];
                return arr1;
            }
        } else {
            return numbers;
        }
    }
}
