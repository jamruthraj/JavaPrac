
public class Point {

    private int x, y;


    public Point() {
        this(0, 0);
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance() {
        return (Math.sqrt((x) * (x) + (y) * (y)));
    }

    public double distance(int x, int y) {
        return (Math.sqrt((this.x - x) * (this.x - x) + (this.y - y) * (this.y - y)));
    }

    public double distance(Point c) {
        return (Math.sqrt((this.x - c.x) * (this.x - c.x) + (this.y - c.y) * (this.y - c.y)));
    }

}

