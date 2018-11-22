package quizs.quiz25.hashCodeEquals.num9;

public class Point9 {
    public int x;
    public int y;

    public Point9(int x, int y) {
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
        Point9 that = (Point9) ref;
        return this.y == that.y;
    }
}
