public class MaxInArray {

    static int max(int arr[], int index) {
        if (index == arr.length) {
            return Integer.MIN_VALUE;
        }
        int maxValue = max(arr, index + 1);
        if (arr[index] > maxValue) {
            maxValue = arr[index];
        }
        return maxValue;
    }

    static void max(int arr[], int index, int maxValue) {
        if (arr.length == index) {
            System.out.println(maxValue);
            return;
        }
        if (arr[index] > maxValue) {
            maxValue = arr[index];
        }
        max(arr, index + 1, maxValue);
    }

    public static void main(String[] args) {
        int arr[] = { 90, 1, 5, 10, 6, 10 };
        max(arr, 0, 0);
        System.out.println(max(arr, 0));
    }
}
