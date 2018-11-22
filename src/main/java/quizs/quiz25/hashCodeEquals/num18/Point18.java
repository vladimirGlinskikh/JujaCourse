package quizs.quiz25.hashCodeEquals.num18;

public class Point18 {
    public int x;
    public int y;

    public Point18(int x, int y) {
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
        Point18 that = (Point18) ref;
        return this.x + this.y == that.x + that.y;
    }
}
