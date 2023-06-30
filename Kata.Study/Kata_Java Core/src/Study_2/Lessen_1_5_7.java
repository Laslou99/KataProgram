package Study_2;

import com.sun.jdi.connect.Connector;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.stream.IntStream;

public class Lessen_1_5_7 {
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 7, 5};
        int[] arr2 = {8, 4, 2, 4};
        int[] END = mergeAndSort(arr1, arr2);
        Arrays.sort(END);
        System.out.println(Arrays.toString(END));
    }

    public static int[] mergeAndSort(int[] firstArray, int[] secondArray) {
        if(firstArray == null || secondArray == null) throw new IllegalArgumentException();
        int i = 0, j = i, k = i;
        var result = new int[firstArray.Length + secondArray.Length];
        while(i< firstArray.Length && j<secondArray.Length)
        {
            result[k++] = firstArray[i] < secondArray[j] ? firstArray[i++] : secondArray[j++];
        }
        while(i < firstArray.)
        {
            result[k++] = firstArray[i++];
        }
        while(j < secondArray.Length)
        {
            result[k++] = secondArray[j++];
        }
        return result;
    }
}
