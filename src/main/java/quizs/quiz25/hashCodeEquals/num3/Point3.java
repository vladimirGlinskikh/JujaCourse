package quizs.quiz25.hashCodeEquals.num3;

public class Point3 {
    public int x;
    public int y;

    public Point3(int x, int y) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point3 point3 = (Point3) o;
        return x == point3.x &&
                y == point3.y;
    }
}
