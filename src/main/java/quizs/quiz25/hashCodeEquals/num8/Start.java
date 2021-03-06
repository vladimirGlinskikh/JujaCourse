package quizs.quiz25.hashCodeEquals.num8;

import java.util.HashSet;
import java.util.Set;

public class Start {
    public static void main(String[] args) {
        Point8 one = new Point8(2, 9);
        Point8 two = new Point8(2, 9);

        if (one.equals(two)) {
            System.out.println("OK!");
            System.out.println(one.hashCode());
            System.out.println(two.hashCode());
        } else {
            System.out.println("It's wrong.");
            System.out.println(one.hashCode());
            System.out.println(two.hashCode());
        }

        Set<Point8> set = new HashSet<>();
        set.add(one);
        set.add(two);

        System.out.println(set.size());
    }
}
