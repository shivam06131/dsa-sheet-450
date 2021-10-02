package NextPermutation;

public class ytSolutionOwn {
    public static void main(String[] args) {
        int[] array = {1, 2, 3};
        int[] array1 = {1};
        NextPermutation(array1);
    }

    static void NextPermutation(int[] arr) {
        int i = arr.length - 2;
        if (arr == null || arr.length <= 1) {
            return;
        }
        while (i >= 0 && arr[i] > arr[i + 1]) {
            i--;
        }
        int j = arr.length - 1;
        if (i >= 0) {
            while (arr[i] > arr[j]) {
                j--;
            }
            swap(arr, i, j);
        }
        reverse(arr, i + 1);
        for (int x = 0; x < arr.length; x++) {
            System.out.println(arr[x]);
        }
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void reverse(int[] arr, int start) {
        int i = start;
        int j = arr.length - 1;
        while (i < j) {
            swap(arr, i, j);
            i++;
            j--;
        }
    }
}
