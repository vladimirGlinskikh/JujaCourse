package quizs.quiz25.hashCodeEquals.num12;

public class Point12 {
    public int x;
    public int y;

    public Point12(int x, int y) {
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
        return x + y;
    }

    public boolean equals(Object ref) {
        Point12 that = (Point12) ref;
        return (this.x == that.x) && (this.y == that.y);
    }
}
