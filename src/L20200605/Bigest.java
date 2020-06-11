package L20200605;

public class Bigest {

    public static void main(String[] args) {
        int t = bigest3(4, 5, 3);
        System.out.println(t);
    }

    public static int bigest2(int x, int y) {
        int t = x;
        if(x > t) {
            t = y;
        }
        return t;
    }

    public static int bigest3(int x, int y, int z) {
        int t = bigest2(x, y);
        t = bigest2(t, z);
        return t;
    }
}
