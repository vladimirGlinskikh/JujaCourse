package quizs.quiz25.hashCodeEquals.num13;

public class Point13 {
    public int x;
    public int y;

    public Point13(int x, int y) {
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
        return x + y - 1;
    }

    public boolean equals(Object ref) {
        Point13 that = (Point13) ref;
        return (this.x == that.x) && (this.y == that.y);
    }
}
