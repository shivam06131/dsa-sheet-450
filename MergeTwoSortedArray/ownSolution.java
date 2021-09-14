package MergeTwoSortedArray;

public class ownSolution {
    public static void main(String[] args) {
        int[] arrayOne = {1, 3, 5, 7};
        int[] arrayTwo = {0, 2, 6, 8, 9};
        MergeTwoArray(arrayOne, arrayTwo, 4, 5);
    }

    static void MergeTwoArray(int arr1[], int arr2[], int n, int m) {
        int i = 0; //arr1
        int j = 0; //arr2
        int newArrayLength = n + m;
        int[] newArray = new int[newArrayLength];
        int k = 0; //newarray
        while (k < newArrayLength) {
            if (i >= n) {
                while (k < newArrayLength) {
                    newArray[k] = arr2[j];
                    k++;
                    j++;
                }
            }
            if (j >= m) {
                while (k < newArrayLength) {
                    newArray[k] = arr1[i];
                    k++;
                    i++;
                }
            }
            if (i < n && i < n && j < m) {
                if (arr1[i] < arr2[j]) {
                    newArray[k] = arr1[i];
                    i++;
                    k++;
                }
            }
            if (j < m && i < n && j < m) {
                if (arr1[i] > arr2[j]) {
                    newArray[k] = arr2[j];
                    j++;
                    k++;
                }
            }


        }
        int x = 0;
        int i_count = 0;
        int j_count = 0;
        while (x < n) {
            if (i_count < n) {
                arr1[i_count] = newArray[x];
                i_count++;
            }
            x++;
        }
        int h = n;
        while (h < newArrayLength) {
            if (j_count < m) {
                arr2[j_count] = newArray[h];
                j_count++;
            }
            h++;
        }
        for (int s = 0; s < n; s++) {
            System.out.print(arr1[s] + " ");
        }
        System.out.println(" ");

        for (int s = 0; s < m; s++) {
            System.out.print(arr2[s] + " ");
        }
    }


}
