package quizs.quiz25.hashCodeEquals.num14;

public class Point14 {
    public int x;
    public int y;

    public Point14(int x, int y) {
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
        return 31 * x + y;
    }

    public boolean equals(Object ref) {
        Point14 that = (Point14) ref;
        return (this.x == that.x) && (this.y == that.y);
    }
}
