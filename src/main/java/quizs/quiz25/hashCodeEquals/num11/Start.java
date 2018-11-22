package quizs.quiz25.hashCodeEquals.num11;

import java.util.HashSet;
import java.util.Set;

public class Start {
    public static void main(String[] args) {
        Point11 one = new Point11(1, 2);
        Point11 two = new Point11(1, 2);

        if (one.equals(two)) {
            System.out.println("OK!");
            System.out.println(one.hashCode());
            System.out.println(two.hashCode());
        } else {
            System.out.println("Wrong ! ");
            System.out.println(one.hashCode());
            System.out.println(two.hashCode());
        }

        Set<Point11> set = new HashSet<>();
        set.add(one);
        set.add(two);
        System.out.println(set.size());
    }
}
