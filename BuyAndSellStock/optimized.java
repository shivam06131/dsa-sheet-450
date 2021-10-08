package BuyAndSellStock;

public class optimized {
    public static void main(String[] args) {
        int[] arr = {3, 1, 4, 8, 7, 2, 5};
        int[] arr2 = {7, 1, 5, 3, 6, 4};
        int val = solution(arr2);
        System.out.println("val " + val);
    }

    static int solution(int[] arr) {
        int minItem = Integer.MAX_VALUE;
        int profit = Integer.MIN_VALUE;
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minItem) {
                minItem = arr[i];
            }
            if (profit < arr[i] - minItem) {
                profit = arr[i] - minItem;
                index = i+1;
            }
        }
        return index;
    }
}
