package objects;

public class Point {

    private Integer x;
    private Integer y;

    public static Point create(Integer x, Integer y) {
        Point point = new Point();
        point.x = x;
        point.y = y;
        return point;
    }

    public static Point createOrigin() {
        return create(0, 0);
    }
}
