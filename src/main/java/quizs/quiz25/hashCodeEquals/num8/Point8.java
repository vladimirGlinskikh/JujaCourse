package quizs.quiz25.hashCodeEquals.num8;

public class Point8 {
    public int x;
    public int y;

    public Point8(int x, int y) {
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
        Point8 that = (Point8) ref;
        return this.x == that.x;
    }
}
