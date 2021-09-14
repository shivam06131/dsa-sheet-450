package kadaneAlgorithm;

public class self {
    public static void main(String[] args) {
        int[] arr = {-1,-2,-3,-4};
        int val = algo(arr);
        System.out.println(val);
    }

    static int algo(int[] array) {
        int largest_so_far = Integer.MIN_VALUE;
        int max_ending_here = 0;
        for (int i = 0; i < array.length; i++) {
            max_ending_here = max_ending_here + array[i];
            if (max_ending_here > largest_so_far) {
                largest_so_far = max_ending_here;
            }
            if (max_ending_here < 0) {
                max_ending_here = 0;
            }
        }

        return largest_so_far;
    }
}
