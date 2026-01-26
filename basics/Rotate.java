public class Rotate {
    public static void main(String[] args) {
        int n = 12345;
        int r = 2;
        int right = n % (int) Math.pow(10, r);
        int left = n / (int) Math.pow(10, r);
        // count digit
        int copy = n;
        int count = 0;
        while (copy != 0) {
            copy = copy / 10; // make number small
            count++;
        }
        int result = right * (int) Math.pow(10, count - r) + left;
        System.out.println(result);
    }
}
