package reverseArray;

public class gfgSolution {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5 ,6};
        int[] newArray = ReverseArray(array, 0, 5);
        int length = newArray.length;
        for (int k=0;k<length;k++){
            System.out.println(newArray[k]);
        }
    }

    static int[] ReverseArray(int[] arr, int start, int end) {
        while (end > start) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        return arr;
    }
}
