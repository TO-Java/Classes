package L20200617;

public class Expressions {

    public static void main(String[] args) {

        // ++x, x++, --x, x--
        int x = 5;
        x++;
        ++x;
        System.out.println(x++ * 2);
        System.out.println(x);

        int y = 5;
        System.out.println(++y * 2);
        System.out.println(y);

        int z = 5;
        System.out.println(--z * 2);
        System.out.println(z);

        int t = 5;
        System.out.println(t-- * 2);
        System.out.println(t);

        int w;
        System.out.println((w = 5) * 2);
        System.out.println(w);

        System.out.println((w += 7) * 2);
        System.out.println(w);

        System.out.println(5 / 3 * 1.5);
        int u = (int) (5 / 3 * 1.5);
        System.out.println(u);

        System.out.println(1.5 * 5 / 3);
    }
}
