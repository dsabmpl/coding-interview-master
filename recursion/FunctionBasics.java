package recursion;

/* Why u build functions
1. Divide a big problem into small problems by building functions
e.g E-commerce
Functions - addCustomer, addPayment, makeOrder, addInCart
Each function has it's own logic
a) Code Readable
b) Code Maintance Easy
c) Code Debug
d) Code Reuse
*/
public class FunctionBasics {

    /*
     * static - keyword
     * when u run your java code
     * it first do loading + linking then execution
     * during load time , classes load and link
     * when u load your class static things loaded along
     * Eager Loading
     * static things bind with class, because
     * load along with class
     * no need to create object to access static things
     * static things - static method, static variable, static block
     * to access static things - classname.staticthing
     */
    static void print() {
        if (10 > 2) {
            return;
        }
        System.out.println("hgjkdfhf");
    }

    static int show(int x) {
        int z = 10;
        System.out.println("I am the show " + x);
        return x + 20 + z;
        // return val; - return val to the caller
        // return - exit from the function (pop)
    }

    public static void main(String[] args) {
        int x = 10;
        // FunctionBasics.show();
        // in same class no need to specify the class during call
        int y = show(x + 20); // calling a function
        int m = show(x + 90);
        System.out.println(x + " " + y);
    }
}
