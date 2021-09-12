package MInimizeHeight;

public class YoutubeSolution {
    public static void main(String[] args) {
        int[] arr = {3, 9, 12, 16, 20};
        int val = Minimize(arr,5,3);
        System.out.println(val);
    }
    static int Minimize(int[] arr, int n , int k){
        int result = arr[n-1] - arr[0];
        int minElement , maxElement;
        for (int i=1;i<arr.length;i++){
            if (arr[i]>=k){
                maxElement = Math.max(arr[i-1]+k , arr[n-1]-k);
                minElement = Math.min(arr[0]+k , arr[i]-k);
                result = Math.min(result , maxElement-minElement);
            }
        }
        return result;
    }

}
