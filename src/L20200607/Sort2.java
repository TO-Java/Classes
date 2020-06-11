package L20200607;

public class Sort2 {

    public static void main(String[] args) {
        printInOrder1(5, 2);
        printInOrder1(2, 5);
        printInOrder1(2, 2);
        System.out.println("------------------");
        printInOrder2(5, 2);
        printInOrder2(2, 5);
        printInOrder2(2, 2);
        System.out.println("------------------");
        printInOrder3(5, 2);
        printInOrder3(2, 5);
        printInOrder3(2, 2);
    }

    // direct
    public static void printInOrder1(int x, int y) {
        if (x < y) {
            System.out.println(x + ", " + y);
        } else {
            System.out.println(y + ", " + x);
        }
    }

    // with variables
    public static void printInOrder2(int x, int y) {
        int first, second;
        if (x < y) {
            first = x;
            second = y;
        } else {
            first = y;
            second = x;
        }
        System.out.println(first + ", " + second);
    }

    // in-place
    public static void printInOrder3(int x, int y) {
        if (y < x) {
            int t = x;
            x = y;
            y = t;
        }
        System.out.println(x + ", " + y);
    }
}
