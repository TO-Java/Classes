package L20200610;

public class Convert {
    public static void main(String[] args) {
        double C = F2C(100);
        System.out.format("%.2f", C);
    }

    // C = (F - 32) * 5 / 9
    // F = C * 9 / 5 + 32

    public static double F2C(double F) {
        double C = (F - 32) * 5 / 9;
        return C;
    }
}
