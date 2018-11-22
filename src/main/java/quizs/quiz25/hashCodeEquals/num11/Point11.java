package quizs.quiz25.hashCodeEquals.num11;

public class Point11 {
    public int x;
    public int y;

    public Point11(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int hashCode() {
        return x;
    }

    public boolean equals(Object ref) {
        Point11 that = (Point11) ref;
        return (this.x == that.x) && (this.y == that.y);
    }
}
