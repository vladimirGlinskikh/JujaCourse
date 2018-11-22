package quizs.quiz25.hashCodeEquals.num16;

public class Point16 {
    public int x;
    public int y;

    public Point16(int x, int y) {
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
        Point16 that = (Point16) ref;
        return this.x == that.x;
    }
}
