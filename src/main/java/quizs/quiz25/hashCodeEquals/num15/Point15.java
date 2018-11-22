package quizs.quiz25.hashCodeEquals.num15;

public class Point15 {
    public int x;
    public int y;

    public Point15(int x, int y) {
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
        return x + 1;
    }

    public boolean equals(Object ref) {
        Point15 that = (Point15) ref;
        return (this.x == that.x) && (this.y == that.y);
    }
}
