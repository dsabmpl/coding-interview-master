public class PrintMyName {
    static void show(int num) {
        if (num == 0) {
            return;
        }
        System.out.println("Amit " + num);
        show(num - 1); // Call it from here
        // After Fall
        System.out.println("Shrivastav " + num);
    }

    public static void main(String[] args) {
        show(5);
    }
}
