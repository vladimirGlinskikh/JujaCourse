package quizs.quiz25.hashCodeEquals.num5;

import java.util.Objects;

public class Point5 {
    public int x;
    public int y;

    public Point5(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    public boolean equals(Object ref) {
        // ...
        Point5 that = (Point5) ref;
        return this.x == that.x;
    }
}
