package ZeroOnceTwos;

public class own {
    public static void main(String[] args) {
    int[] array = {0,2,1,2,0};
    int[] val = ZOT(array,5);
    for (int i=0;i<val.length;i++){
        System.out.println(val[i]);
    }
    }
    static int[] ZOT(int[] arr , int n){
        int[] newArr = new int[n];
        int k=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                newArr[k]=0;
                k++;
            }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]==1){
                newArr[k]=1;
                k++;
            }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]==2){
                newArr[k]=2;
                k++;
            }
        }
        return newArr;
    }
}
