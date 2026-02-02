package recursion;

public class Fact {

    static int fact(int num) {
        // base case
        if (num == 1) {
            return 1; // result
        }
        int result = fact(num - 1);
        return result * num;
    }

    // 5! = 5 * 4 * 3 * 2 * 1
    // small problem 5 --> 4 (num-1)
    // base case 1 e.g num == 1
    // void based
    static void fact(int num, int result) {
        // base case - one time execute
        if (num == 1) {

            System.out.println(result);
            return;
        }
        // small problem - many time execute
        fact(num - 1, result * num);
    }

    public static void main(String[] args) {
        // fact(5, 1);
        int r = fact(5);
        System.out.println(r);
    }
}
