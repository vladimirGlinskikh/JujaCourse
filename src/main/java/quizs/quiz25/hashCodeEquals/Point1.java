package quizs.quiz25.hashCodeEquals;

import java.util.Objects;

public class Point1 {
    public int x;
    public int y;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point1 point1 = (Point1) o;
        return x == point1.x &&
                y == point1.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
}
