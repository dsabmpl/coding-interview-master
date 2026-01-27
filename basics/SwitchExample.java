public class SwitchExample {
    public static void main(String[] args) {

        final int BURGER = 1;
        // int choice = BURGER;
        final int PIZZA = 2;
        final int DRINK = 3;
        // int , byte , char, String
        // switch (choice) {
        // case BURGER: // if choice ==1
        // System.out.println("Rs 100");
        // break; // exit from the block

        // case PIZZA:
        // System.out.println("Rs 300");
        // break;

        // case DRINK:
        // System.out.println("Rs 70");
        // break;

        // default:
        // System.out.println("Wrong Choice");
        // }
        // String choice = "Burger";
        // switch (choice) {
        // case "Burger": // if choice ==1
        // System.out.println("Rs 100");
        // break; // exit from the block

        // case "Pizza":
        // System.out.println("Rs 300");
        // break;

        // case "Drink":
        // System.out.println("Rs 70");
        // break;

        // default:
        // System.out.println("Wrong Choice");
        // }

        // int z = x + y;
        // Java 14 - Switch with Expression
        // : vs -> in Switch
        String choice = "Burger";
        int price = switch (choice) {
            case "Pizza" -> 300; // single line expression
            case "Burger" -> 100;
            case "Drink", "Dessert" -> { // multi line
                int d = 50;
                int f = 20;
                int cost = d + f;
                yield cost;
            }
            default -> 0;
        };
        double gst = price * 0.18;
        System.out.println("Total Price " + (price + gst));

    }
}
