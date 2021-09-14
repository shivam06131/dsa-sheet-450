package MergeTwoSortedArray;

import java.util.Arrays;

public class ytSolution {
    public static void main(String[] args) {
        int[] array1 = {1, 3, 5, 7};
        int[] array2 = {0, 2, 6, 8, 9};
        MergeArray(array1, array2);
    }

    static void MergeArray(int[] arr1, int[] arr2) {
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] > arr2[0]) ;
            int temp = arr1[i];
            arr1[i] = arr2[0];
            arr2[0] = temp;
            Arrays.sort(arr2);
        }
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
        System.out.println(" ");
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
    }

}
