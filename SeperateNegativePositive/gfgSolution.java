package SeperateNegativePositive;

public class gfgSolution {
    public static void main(String[] args) {
        int arr[] = { -1, 2, -3, 4, 5, 6, -7, 8, 9 };
        int n = arr.length;

        SNG(arr);
        printArray(arr, n);

    }

    static void SNG(int[] arr) {
        int temp, j=0;
        for (int i=0;i<arr.length;i++){
            if(arr[i]<0){
                if(i!=j){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                j++;
            }
        }
    }
    static void printArray(int arr[], int n)
    {
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }
}
