package Union;

import java.util.HashSet;

public class gfgSolution {
    public static void main(String[] args) {
        int[] a = {85,25,1,32,54,6};
        int[] b = {85,2};
        int val = doUnion(a,b,6,2);
        System.out.println("output: "+ val);
    }
    static int doUnion(int[] a,int[]b,int n ,int m){
        HashSet <Integer> s = new HashSet<>();
        for (int i=0;i<n;i++){
            s.add(a[i]);
        }
        for (int i=0;i<m;i++){
            s.add(b[i]);
        }
        return s.size();
    }
}
