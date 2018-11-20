package quizs.quiz25.hashCodeEquals.num5;

import java.util.HashSet;
import java.util.Set;

public class Start {
    public static void main(String[] args) {
        Point5 one = new Point5(4, 3);
        Point5 two = new Point5(4, 3);

        if (one.equals(two)) {
            System.out.println("OK!");
            System.out.println(one.hashCode());
            System.out.println(two.hashCode());
        } else {
            System.out.println("Wrong!");
            System.out.println(one.hashCode());
            System.out.println(two.hashCode());
        }

        Set<Point5> set = new HashSet<>();
        set.add(one);
        set.add(two);

        System.out.println(set.size());
    }
}
