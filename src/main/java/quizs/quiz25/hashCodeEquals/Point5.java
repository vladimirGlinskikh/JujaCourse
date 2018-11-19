package quizs.quiz25.hashCodeEquals;

import java.util.Objects;

public class Point5 {
    public int x;
    public int y;

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
