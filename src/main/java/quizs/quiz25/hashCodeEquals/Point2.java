package quizs.quiz25.hashCodeEquals;

public class Point2 {
    public int x;
    public int y;
    public int hashCode(){
        return 1;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point2 point2 = (Point2) o;
        return x == point2.x &&
                y == point2.y;
    }
}
