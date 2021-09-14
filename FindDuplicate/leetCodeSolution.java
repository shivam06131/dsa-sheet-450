package FindDuplicate;

import java.util.Arrays;

public class leetCodeSolution {
    public static void main(String[] args) {
        int[] array = {3,1,3,4,2};
        int val =findDuplicate(array);
        System.out.println(val);
    }

    static int findDuplicate(int[] arr) {
        Arrays.sort(arr);
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                return arr[i];
            }
        }
        return -1;
    }

}
