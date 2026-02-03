public class Fact {
    static int fact(int num) {
        if (num == 1) {
            return 1;
        }
        int result = fact(num - 1);
        return result * num;
    }

    public static void main(String[] args) {
        // fact(5, 1);
        System.out.println(fact(5));
    }

    /*
     * 5! = 5 * 4 * 3 * 2 * 1
     */
    static void fact(int num, int result) {
        // base case
        if (num == 1) {
            System.out.println(result);
            return;
        }
        // num--;
        fact(num - 1, result * num);
    }

}
