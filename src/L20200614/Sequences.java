package L20200614;

public class Sequences {

    public static void main(String[] args) {

        System.out.println("-----arithmeticSequence-----");
        for (int i = 1; i <= 5; ++i) {
            System.out.println(i + ": " + arithmeticSequence1(10, 2, i) + ", " + arithmeticSequence2(10, 2, i));
        }

        System.out.println("-----geometricSequence-----");
        for (int i = 1; i <= 5; ++i) {
            System.out.println(i + ": " + geometricSequence1(5, 2, i) + ", " + geometricSequence2(5, 2, i));
        }

        System.out.println("-----harmonicSequence-----");
        for (int i = 1; i <= 5; ++i) {
            System.out.println(i + ": " + harmonicSequence1(10, 2, i) + ", " + harmonicSequence2(10, 2, i) + ", " + harmonicSequence3(10, 2, i));
        }

        System.out.println("-----triangularNumbers-----");
        for (int i = 1; i <= 5; ++i) {
            System.out.println(i + ": " + triangularNumbers1(i) + ", " + triangularNumbers2(i));
        }
    }

    // Arithmetic sequence
    // a - the first term
    // d - the difference
    //  1   2   3   4  ...
    // 10, 12, 14, 16, ...
    // <nth term> = a + (n-1) * d

    public static int arithmeticSequence1(int a, int d, int n) {
        return a + (n - 1) * d;
    }

    /**
     * Returns the nth term of an arithmetic series with parameters a and d
     *
     * @param a The first element of the series
     * @param d The common difference
     * @param n The index of the element
     * @return The ith element of an arithmetic series
     */
    public static int arithmeticSequence2(int a, int d, int n) {
        int term = a;
        for (int i = 1; i < n; ++i) {
            term += d;
        }
        return term;
    }

    // Geometric sequence
    // a - The first term
    // f - The common ratio
    // 1   2   3   4  ...
    // 5, 10, 20, 40, ...
    // <nth element> = a * f^(n - 1)

    public static int geometricSequence1(int a, int f, int n) {
        return a * (int) Math.pow(f, n - 1);
    }

    public static int geometricSequence2(int a, int f, int n) {
        int acc = 1;
        for (int i = 1; i < n; ++i) {
            acc *= f;
        }
        return a * acc;
    }

    // Harmonic sequence - The terms are the reciprocal (inverse) of the terms of an arithmetic sequence
    // a - The first term
    // d - The difference
    //    1     2     3     4  ...
    // 1/10, 1/12, 1/14, 1/16, ...
    // <nth element> = 1 / (a + (n - 1) * d)

    public static double harmonicSequence1(int a, int d, int n) {
        return 1.0 / (a + (n - 1) * d);
    }

    public static double harmonicSequence2(int a, int d, int n) {
        int den = a;
        for (int i = 1; i < n; ++i) {
            den += d;
        }
        return 1.0 / den;
    }

    public static double harmonicSequence3(int a, int d, int n) {
        return 1.0 / arithmeticSequence2(a, d, n);
    }

    // Triangular Numbers - The Sequence is generated from a pattern of dots which form a triangle
    // 1  2  3   4   5   6   7   8   9  ...
    // 1, 3, 6, 10, 15, 21, 28, 36, 45, ...
    // <nth element> = n * (n + 1) / 2

    public static int triangularNumbers1(int n) {
        return n * (n + 1) / 2;
    }

    public static int triangularNumbers2(int n) {
        int acc = 0;
        int x = 1;
        while(x <= n) {
            acc+= x;
            ++x;
        }
        return acc;
    }

    // Square Numbers
    // 1  2  3   4   5   6   7   8   9  ...
    // 1, 4, 9, 16, 25, 36, 49, 64, 81, ...
    // <nth element> = n^2

    // Fibonacci Sequence
    // 1  2  3  4  5  6   7   8   9  ...
    // 1, 1, 2, 3, 5, 8, 13, 21, 34, ...
    // <nth element> = 1/sr(5) * (((1+sr(5))/2)^n - ((1-sr(5))/2)^n)

}
