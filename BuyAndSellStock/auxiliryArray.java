package BuyAndSellStock;

public class auxiliryArray {
    public static void main(String[] args) {
        int[] arr = {3, 1, 4, 8, 7, 2, 5};
        int[] arr2 = {7,1,5,3,6,4};
        int val = solution(arr2);
        System.out.println("val " + val);
    }

    static int solution(int[] arr) {
        int arr_length = arr.length;
        int profit = 0;
        int index = 0;
        int MinimumItemIndex = 0;
        int[] aux_array = new int[arr_length];
        aux_array[arr_length - 1] = arr[arr_length - 1];
        for (int i = arr_length - 2; i >= 0; i--) {
            if (arr[i] > aux_array[i + 1]) {
                aux_array[i] = arr[i];
            } else {
                aux_array[i] = aux_array[i + 1];
            }
        }
        for (int i = 0; i < arr_length; i++) {
            if (aux_array[i] - arr[i] > profit) {
                profit = aux_array[i] - arr[i];
                MinimumItemIndex = i;
            }
        }

        int ItemParllelInAuxArray = aux_array[MinimumItemIndex];
        for (int i = 0; i < arr_length; i++) {
            if (ItemParllelInAuxArray == arr[i]) {
                index = i + 1;
            }
        }

        return index;

    }
}
