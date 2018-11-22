package quizs.quiz25.hashCodeEquals.num15;

import java.util.HashSet;
import java.util.Set;

public class Start {
    public static void main(String[] args) {
        Point15 one = new Point15(1, 2);
        Point15 two = new Point15(1, 1);

        if (one.equals(two)) {
            System.out.println("OK !");
            System.out.println(one.hashCode());
            System.out.println(two.hashCode());
        } else {
            System.out.println("Wrong! ");
            System.out.println(one.hashCode());
            System.out.println(two.hashCode());
        }

        Set<Point15> set = new HashSet<>();
        set.add(one);
        set.add(two);
        System.out.println(set.size());
    }
}
