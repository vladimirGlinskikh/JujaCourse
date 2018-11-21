package quizs.quiz25.hashCodeEquals.num6;

public class Point6 {
    public int x;
    public int y;

    public Point6(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public boolean equals(Object ref) {
        Point6 that = (Point6) ref;
        return (this.x == that.x) && (this.y == that.y);
    }
}
