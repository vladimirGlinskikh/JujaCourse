package quizs.quiz25.hashCodeEquals.num7;

public class Point7 {
    public int x;
    public int y;

    public Point7(int x, int y) {
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
        Point7 that = (Point7) ref;
        return this.x + this.y == that.x + that.y;
    }
}
