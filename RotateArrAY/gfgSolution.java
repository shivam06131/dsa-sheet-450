package RotateArrAY;

public class gfgSolution {
    public static void main(String[] args) {
        int[] array = {3, 4 ,5 , 6, 7 ,2};
        rotateArray(array , 6);
    }
    static void rotateArray(int[] arr, int n){
        int temp = arr[n-1];
        for (int i=n-1;i>0;i--){
            arr[i]=arr[i-1];
        }
        arr[0] = temp;
        for (int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
    }

}
