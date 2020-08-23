package L20200822;

class Point {

    // fields
    private double x, y;

    // constructor
    public Point(double corX, double corY) {
        x = corX;
        y = corY;
    }

    //methods

    // getters & setters
    public void setX(double corX) {
        x = corX;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

//    public double dist(Point p) {
//        double dx = x - p.getX();
//        double dy = y - p.getY();
//        return 0;
//    }

//    public double dist00() {
//
//        return 0;
//    }
}

public class Classes {

    public static void main(String[] args) {

        String s = new String("abc");
        System.out.println(s.charAt(1));

        Point p1 = new Point(5, -3);
        Point p2 = new Point(10, 7);

        System.out.println(p1.getX());
        p1.setX(10);
        System.out.println(p1.getX());
//        System.out.println(p1.dist(p2));
//        System.out.println(p1.dist00());
    }
}
