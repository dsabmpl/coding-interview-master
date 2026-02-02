package recursion;

public class MaxInArray {

    static int maxInArray(int arr[], int index) {

    }

    static void maxInArray(int arr[], int index, int max) {
        if (arr.length == index) {
            System.out.println("Max " + max);
            return;
        }
        if (arr[index] > max) {
            max = arr[index];
        }
        maxInArray(arr, index + 1, max);
    }

    public static void main(String[] args) {
        int arr[] = { 10, 5, 100, 9, 2, 40 };
        maxInArray(arr, 0, 0);
        int max = maxInArray(arr, 0);
        System.out.println(max);

    }
}