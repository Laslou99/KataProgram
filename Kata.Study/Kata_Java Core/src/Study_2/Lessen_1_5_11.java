package Study_2;

import java.util.Arrays;

public class Lessen_1_5_11 {
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 6};
        int[] arr2 = {5, 7, 5};
        System.out.println(Arrays.toString(mergeAndSort(arr1, arr2)));
    }

    public static int[] mergeAndSort(int[] firstArray, int[] secondArray) {
        int[] result = new int[firstArray.length + secondArray.length];
        System.arraycopy(firstArray, 0, result, 0, firstArray.length);
        System.arraycopy(secondArray, 0, result, firstArray.length, secondArray.length);
        Arrays.sort(result);
        return result;
    }
}
