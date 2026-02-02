package recursion;

public class SumOfN {

    static int doSum(int num) {
        if (num == 0) {
            return 0;
        }
        int sum = doSum(num - 1);
        return sum + num;
    }

    static void doSum(int num, int sum) {
        // base case
        if (num == 0) {
            System.out.println(sum);
            return;
        }
        // small problem num-1
        doSum(num - 1, sum + num);
    }

    public static void main(String[] args) {
        doSum(10, 0);
        int e = doSum(10);
        System.out.println(e);
    }
}
