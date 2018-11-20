package quizs.quiz25.hashCodeEquals.num4;

public class Point4 {
    public int x;
    public int y;

    public Point4(int x, int y) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point4 point4 = (Point4) o;
        return x == point4.x &&
                y == point4.y;
    }
}
