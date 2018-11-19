package quizs.quiz25.hashCodeEquals;

public class Point4 {
    public int x;
    public int y;

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
