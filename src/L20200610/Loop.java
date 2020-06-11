package L20200610;

public class Loop {

    public static void main(String[] args) {
        System.out.println(sum1(10));
        System.out.println(sum2(10));
        System.out.println(sum3(10));
    }

    // sum(n) = 1 + 2 + 3 + ... + n
    // sum(0) = 0
    // sum(1) = 1
    // sum(5) = 1 + 2 + 3 + 4 + 5
    public static int sum1(int n) {
        return (n + 1) * n / 2;
    }

    public static int sum2(int n) {
        int acc = 0;
        int x = 1;
        while(x <= n) {
            acc += x; // acc = acc + x;
            ++x; // x++
        }
        return acc;
    }

    public static int sum3(int n) {
        int acc = 0;
        for(int x = 1; x <= n; ++x) {
            acc += x;
        }
        return acc;
    }

    // fact(n) = 1 * 2 * 3 * ... * n
}
