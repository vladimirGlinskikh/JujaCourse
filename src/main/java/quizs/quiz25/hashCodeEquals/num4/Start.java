package quizs.quiz25.hashCodeEquals.num4;

import java.util.HashSet;
import java.util.Set;

public class Start {
    public static void main(String[] args) {
        Point4 one = new Point4(3, 2);
        Point4 two = new Point4(3, 2);

        if (one.equals(two)) {
            System.out.println("OK");
            System.out.println(one.hashCode());
            System.out.println(two.hashCode());
        } else {
            System.out.println("Wrong");
            System.out.println(one.hashCode());
            System.out.println(two.hashCode());
        }

        Set<Point4> set = new HashSet<>();
        set.add(one);
        set.add(two);
        System.out.println(set.size());
    }
}
