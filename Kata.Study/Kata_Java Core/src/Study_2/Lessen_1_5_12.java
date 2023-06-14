package Study_2;

public class Lessen_1_5_12 {
    public static void main(String[] args) {
        int[] Arr = {1, 3, 4, 7, 8, 9, 20};
        printOddNumbers(Arr);
    }


    public static void printOddNumbers(int[] arr) {
        String prob = "";
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                System.out.print(prob);
                System.out.print(arr[i]);
                prob = ",";
            }
        }
        System.out.println();
    }
}