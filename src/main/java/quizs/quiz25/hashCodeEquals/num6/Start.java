package quizs.quiz25.hashCodeEquals.num6;

import java.util.HashSet;
import java.util.Set;

public class Start {
    public static void main(String[] args) {
        Point6 one = new Point6(3, 9);
        Point6 two = new Point6(3, 9);

        if (one.equals(two)) {
            System.out.println("OK!");
            System.out.println(one.hashCode());
            System.out.println(two.hashCode());
        } else {
            System.out.println("No OK!");
            System.out.println(one.hashCode());
            System.out.println(two.hashCode());
        }

        Set<Point6> set = new HashSet<>();
        set.add(one);
        set.add(two);

        System.out.println(set.size());
    }
}
