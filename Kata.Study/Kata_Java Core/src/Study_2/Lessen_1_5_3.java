package Study_2;

public class Lessen_1_5_3 {
    public static void main(String[] args) {
        int[] numbers = {3, 6, 8, 9, 4};
        printArray(numbers);
    }

    public static void printArray(int[] numbers) {
        System.out.print("[");
        for (int i = 0; i < numbers.length; i++) {
            if (i == numbers.length - 1) {
                System.out.print(numbers[i]);
            } else {
                System.out.print(numbers[i] + ", ");
            }
        }
        System.out.print("]");
    }
}
