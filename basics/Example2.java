public class Example2 {
    public static void main(String[] args) {
        outer: for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                if (i == j) {
                    break outer;
                    // continue outer;
                    // return ; // exit from function
                    // break; // exit from the current loop
                    // continue; // skip the current iteration
                }
                System.out.println(i + " " + j);
            }
        }
    }
}
