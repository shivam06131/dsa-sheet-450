package LargestSumContiguesArray;

public class usingDynamicProgramming {
    public static void main(String[] args) {
        int a[] = {-2, -3, 4, -1, -2, 1, 5, -3};
        int val = maxSubArraySum(a);
        System.out.println("max: "+ val);
    }
    static int maxSubArraySum(int[] arr){
        int max_so_far = arr[0];
        int sum_total = arr[0];
        for (int i=0;i<arr.length;i++){
            max_so_far = Math.max(arr[i] , max_so_far+arr[i]);
            sum_total = Math.max(sum_total , max_so_far);
        }
        return sum_total;
    }
}
