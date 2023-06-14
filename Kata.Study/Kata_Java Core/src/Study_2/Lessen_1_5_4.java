package Study_2;

public class Lessen_1_5_4 {
    public static void main(String[] args) {
        int[] numbers = {2, 5, 7, 8, 9, 10};
        int start = 3;
        int end = 9;
        System.out.print(getSubArrayBetween(numbers, start, end));
    }

    public static int[] getSubArrayBetween(int[] numbers, int start, int end) {
        int lengthArray = 0;
        int indexArray = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] >= start && numbers[i] <= end) {
                lengthArray++;
            }
        }

        int[] resultArray = new int[lengthArray];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] >= start && numbers[i] <= end) {
                resultArray[indexArray] = numbers[i];
                indexArray++;
            }
        }
        return resultArray;
    }
}
