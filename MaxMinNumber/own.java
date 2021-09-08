package MaxMinNumber;

public class own {
    public static void main(String[] args) {
        int[] array = {1, 10, 3, 12, 5};
        maxmin(array);
    }

    static void maxmin(int[] arr) {
        int max = 0;
        int min = 0;
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] < arr[i + 1]) {
                max = arr[i + 1];
            }
            if (arr[i] < arr[i + 1]) {
                min = arr[i];
            }
        }
        System.out.println("max: " + max + " min: " + min);
    }
}
