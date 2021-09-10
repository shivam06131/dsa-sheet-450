package LargestSumContiguesArray;

public class gfgSolution {
    public static void main(String[] args) {
        int [] a = {-2, -3, 4, -1, -2, 1, 5, -3};
        int val = LargestSum(a);
        System.out.println("largest val " + val);
    }

    static int LargestSum(int[] arr) {
        int largest = Integer.MIN_VALUE;
        int largest_till_here = 0;
        for (int i = 0; i < arr.length; i++) {
            largest_till_here    = largest_till_here + arr[i];
            if (largest < largest_till_here) {
                largest = largest_till_here;
            }
            if(largest_till_here < 0){
                largest_till_here =0;
            }
        }
        return largest;
    }
}
