package reverseArray;

public class gfgSolution2 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        // printArray(array); //
        reverseArray(array, 0, 4);
        printArray(array);


    }

    // recursion//
    static void reverseArray(int[] arr, int start, int end) {
        if (start >= end) {
            return;
        }
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = arr[temp];
        reverseArray(arr, start + 1, end - 1);

    }

    static void printArray(int[] arr){
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
