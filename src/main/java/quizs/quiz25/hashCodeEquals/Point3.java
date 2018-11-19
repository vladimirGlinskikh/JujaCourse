package quizs.quiz25.hashCodeEquals;

public class Point3 {
    public int x;
    public int y;
    public int hashCode(){
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
