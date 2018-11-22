package quizs.quiz25.hashCodeEquals.num1;

import java.util.HashSet;
import java.util.Set;

public class Start {
    public static void main(String[] args) {
        Point point = new Point(1, 3);
        Point point1 = new Point(1, 3);
        if (point.equals(point1)) {
            System.out.println("OK");
            System.out.println(point.hashCode());
            System.out.println(point1.hashCode());
        } else {
            System.out.println("Wrong!");
            System.out.println(point.hashCode());
            System.out.println(point1.hashCode());
        }

        Set<Point> set = new HashSet<>();
        set.add(point);
        set.add(point1);

        System.out.println(set.size());
    }
}
