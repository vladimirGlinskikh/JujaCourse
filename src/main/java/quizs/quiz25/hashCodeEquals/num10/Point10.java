package quizs.quiz25.hashCodeEquals.num10;

public class Point10 {
    public int x;
    public int y;

    public Point10(int x, int y) {
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
        return 0;
    }

    public boolean equals(Object ref) {
        Point10 that = (Point10) ref;
        return (this.x == that.x) && (this.y == that.y);
    }
}
