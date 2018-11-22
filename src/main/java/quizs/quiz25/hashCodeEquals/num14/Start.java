package quizs.quiz25.hashCodeEquals.num14;

import java.util.HashSet;
import java.util.Set;

public class Start {
    public static void main(String[] args) {
        Point14 one = new Point14(2, 2);
        Point14 two = new Point14(1, 2);

        if (one.equals(two)) {
            System.out.println("OK!");
            System.out.println(one.hashCode());
            System.out.println(two.hashCode());
        } else {
            System.out.println("Wrong! ");
            System.out.println(one.hashCode());
            System.out.println(two.hashCode());
        }

        Set<Point14> set = new HashSet<>();
        set.add(one);
        set.add(two);
        System.out.println(set.size());
    }
}
