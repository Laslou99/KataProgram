package Study_2;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Enumeration;

public class Lessen_1_5_7 {
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 7, 5};
        int[] arr2 = {8, 4, 2, 4};
        int[] END = mergeAndSort(arr1, arr2);
        Arrays.sort(END);
        System.out.println(Arrays.toString(END));
    }

    public static int[] mergeAndSort(int[] firstArray, int[] secondArray) {
        int[] result = new int[firstArray.length + secondArray.length];
        int i = 0, j = 0, k = 0;
        while (i < firstArray.length && j < secondArray.length) {
            if (firstArray[i] < secondArray[j]) {
                result[k++] = firstArray[i++];
            } else {
                result[k++] = secondArray[j++];
            }
        }
        while (i < firstArray.length) {
            result[k++] = firstArray[i++];
        }
        while (j < secondArray.length) {
            result[k++] = secondArray[j++];
        }
        return result;
    }
}
