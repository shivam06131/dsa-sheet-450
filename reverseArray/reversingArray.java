package reverseArray;

public class reversingArray {
    public static void main(String[] args) {
        int[] array = {4, 5, 1, 2};
        int[] rev = revArray(array);
        for (int x : rev) {
            System.out.println(x);
        }

    }
    static int[] revArray(int[] array) {
        int newArrayLength = array.length;
        System.out.println("newArrayLength" + newArrayLength);
        int[] newArray = new int[newArrayLength];
        for (int i = 0; i < newArrayLength; i++) {
            newArray[newArrayLength - (i + 1)] = array[i];
        }
        return newArray;
    }
}
