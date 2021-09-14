package MinNumbersOfJump;

public class self {
    public static void main(String[] args) {
        int arr[] = {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9};
        int N = 11;

        int val = minJumps(arr, N);
        System.out.println("val " + val);
    }

    static int minJumps(int arr[], int n) {
        // Your code here

        int temp, i = 0, count = 0;
        while (n - 1 > i) {
            if (arr[i] == 0) {
                return -1;
            }
            if (n <= 1) {
                return 0;
            }
            temp = arr[i];
            i += temp;
            count++;
        }
        return count;
    }
}
