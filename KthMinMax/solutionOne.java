package KthMinMax;

import java.util.Collections;
import java.util.PriorityQueue;

public class solutionOne {
    public static void main(String[] args) {
        int[] array = {7, 10, 4, 3, 20, 15};
        int[] array2 = {7, 10, 4, 20, 15};
        int k = 4;
        int val = KthSmallestElemet(array2 , k);
        System.out.println(k + " th smallest element is " + val);

    }

    static int KthSmallestElemet(int[] arr, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < k; i++) {
            pq.add(arr[i]);
        }
        for (int j = k; j < arr.length; j++) {
            if (pq.peek() > arr[j]) {
                pq.poll();
                pq.add(arr[j]);
            }
        }
        return pq.peek();
    }
}
