package recursion;

public class First {
    // print my name 5 times
    static void show(int num) {
        // Base case or Termination case
        if (num == 0) {
            return; // exit from the function call
        }
        System.out.println("Amit " + num); // Pre (Stack Build)
        show(num - 1); // form infinite calls
        // Post - Stack Fall
        System.out.println("Shrivastav " + num);
    }

    public static void main(String[] args) {
        show(5);
    }
}
