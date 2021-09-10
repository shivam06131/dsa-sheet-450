package RotateArrAY;

public class own {
    public static void main(String[] args) {
        int[] array = {3, 4 ,5 , 6, 7 ,2};
        rotate(array , 6);
    }
    static void rotate(int arr[], int n){
        int[] newArr = new int[n];
        for(int i=0;i<n-1;i++){
            newArr[i+1] = arr[i];
        }
        newArr[0]=arr[n-1];
        for (int i=0;i<n;i++){
            System.out.print(newArr[i] + " ");
        }
    }
}
