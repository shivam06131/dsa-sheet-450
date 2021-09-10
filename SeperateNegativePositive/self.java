package SeperateNegativePositive;

public class self {
    public static void main(String[] args) {
        int arr[] = { -1, 2, -3, 4, 5, 6, -7, 8, 9 };
        NegativePositive(arr);
    }
    static void NegativePositive(int[] arr){
        int len = arr.length;
        int[] newArr = new int[len];
        int count=0;
        for (int i=0;i<arr.length;i++){
            if(arr[i]<0){
                newArr[count]=arr[i];
                count++;
            }
        }
        for (int i=0;i<arr.length;i++){
            if(arr[i]>=0){
                newArr[count]=arr[i];
                count++;
            }
        }
        for (int i=0;i<newArr.length;i++){
            System.out.println(newArr[i]);
        }
    }
}
