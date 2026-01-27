class PatternExample {
    // static - keyword
    // it load the things along with class - during class load time
    // static thing - bind with class not with object
    static void p1() {
        int n = 5;
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                // Print it or not Print it (Decision)
                if (col <= row) {
                    System.out.print("*"); // print - same line
                }
            }
            System.out.println(); // new line
        }
    }

    static void p2() {
        int n = 5;
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                // Print it or not Print it (Decision)
                if (col <= n - row + 1) {
                    System.out.print("*"); // print - same line
                }
            }
            System.out.println(); // new line
        }
    }

    static void p3() {
        int n = 5;
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                // Print it or not Print it (Decision)
                if (col <= n - row) {
                    System.out.print(" "); // print - same line
                } else {
                    System.out.print("*");
                }
            }
            System.out.println(); // new line
        }
    }

    static void p4() {
        int n = 5;
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                // Print it or not Print it (Decision)
                if (col >= row) {
                    System.out.print("*"); // print - same line
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(); // new line
        }
    }

    static void p5() {
        int n = 5;
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                // Print it or not Print it (Decision)
                if (row == 1 || row == n || col == 1 || col == n) {
                    System.out.print("*"); // print - same line
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(); // new line
        }
    }

    static void p6() {
        int n = 5;
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                // Print it or not Print it (Decision)
                if (row == col || col == n - row + 1) {
                    System.out.print("*"); // print - same line
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(); // new line
        }
    }

    static void p7() {
        int n = 5;
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                // Print it or not Print it (Decision)
                if (col <= row) {
                    System.out.print(col); // print - same line
                }
            }
            System.out.println(); // new line
        }
    }

    static void p8() {
        int n = 5;
        for (int row = 1; row <= n; row++) {
            char ch = 'A';
            for (int col = 1; col <= n; col++) {
                // Print it or not Print it (Decision)
                if (col <= row) {
                    System.out.print((char) (ch + col - 1)); // print - same line
                }
            }
            System.out.println(); // new line
        }
    }

    static void p9() {
        int n = 5;
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                // Print it or not Print it (Decision)
                if (col <= n - row) {
                    System.out.print(" "); // print - same line
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println(); // new line
        }
    }

    public static void main(String[] args) {
        // classname.staticmethod
        // same class optional classname
        // PatternExample.p1();
        p1();
        System.out.println();
        p2();
        System.out.println();
        p3();
        System.out.println();
        p4();
        System.out.println();
        p5();
        System.out.println();
        p6();
        System.out.println();
        p7();
        System.out.println();
        p8();
        System.out.println();
        p9();
        System.out.println();
    }
}