package Study_2;

public class Lessen_1_5_6 {

    public static void main(String[] args) {
        int[] numbres = {4, 7, 5, 4, 6};
        inverseArray(numbres);
    }

    public static int[] inverseArray(int[] numbers) {
        int[] resultArray = new int[numbers.length];
        int a = numbers.length;
        for (int i = 0; i < numbers.length; i++) {
            resultArray[a - 1] = numbers[i];
            a = a - 1;
        }
        return resultArray;
    }
}
