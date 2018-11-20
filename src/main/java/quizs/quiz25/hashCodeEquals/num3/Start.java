package quizs.quiz25.hashCodeEquals.num3;

import java.util.HashSet;
import java.util.Set;

public class Start {
    public static void main(String[] args) {
        Point3 one = new Point3(3, 6);
        Point3 two = new Point3(3, 6);

        if (one.equals(two)) {
            System.out.println("Ok");
            System.out.println(one.hashCode());
            System.out.println(two.hashCode());
        } else {
            System.out.println("Wrong!");
            System.out.println(one.hashCode());
            System.out.println(two.hashCode());
        }

        Set<Point3> set = new HashSet<>();
        set.add(one);
        set.add(two);

        System.out.println(set.size());
    }
}
