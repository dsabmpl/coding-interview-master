class PrintDigit {
    public static void main(String[] args) {
        int n = 12345;
        // Step - 1 Make Power
        int copy = n;
        int pow = 1;
        while (copy != 0) {
            copy = copy / 10; // make number small
            pow = pow * 10;
        }
        pow = pow / 10;
        while (n != 0) {
            System.out.println(n / pow);
            n = n % pow; // make number small
            pow = pow / 10;
        }

    }
}