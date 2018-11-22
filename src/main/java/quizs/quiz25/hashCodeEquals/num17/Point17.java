package quizs.quiz25.hashCodeEquals.num17;

public class Point17 {
    public int x;
    public int y;

    public Point17(int x, int y) {
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
        Point17 that = (Point17) ref;
        return this.x + this.y == that.x + that.y;
    }
}
