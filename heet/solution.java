package heet;

import java.util.Scanner;

public class solution {
    public static void main(String[] args) {
        NoOfOccurence();

    }

    static void NoOfOccurence() {
        int count = 0;
        System.out.println("Enter N");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Enter special Number");
        int s = sc.nextInt();
        String strTwo = Integer.toString(s);
        for (int i = 0; i < n; i++) {
            String strONe = Integer.toString(i);
            int index = strONe.indexOf(strTwo);
            if (index != -1) {
                System.out.print(i + " ");
                count++;
            }

        }
        System.out.print(count);
    }

}
