package ZeroOnceTwos;

public class gfgHint {
    public static void main(String[] args) {
        int[] array = {0,2,1,2,0};
        sort012(array, 5);
    }
     static void sort012(int a[], int n){
        int low = 0, high = n-1, mid = 0;
        while(mid <= high){
            if(a[mid]==0) {
                 int temp=a[low];
                a[low]=a[mid];
                a[mid]=temp;
                low++;
                mid++;
            } else if(a[mid]==1) {
                mid++;
            } else {
                int temp=a[mid];
                a[mid]=a[high];
                a[high]=temp;
                high--;
            }
        }
        for (int i=0;i< a.length;i++){
            System.out.println(a[i]);
        }
    }
}
