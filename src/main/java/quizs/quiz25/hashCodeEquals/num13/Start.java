package quizs.quiz25.hashCodeEquals.num13;

import java.util.HashSet;
import java.util.Set;

public class Start {
    public static void main(String[] args) {
        Point13 one = new Point13(3, 2);
        Point13 two = new Point13(1, 2);

        if (one.equals(two)) {
            System.out.println("OK! ");
            System.out.println(one.hashCode());
            System.out.println(two.hashCode());
        } else {
            System.out.println("Wrong ! ");
            System.out.println(one.hashCode());
            System.out.println(two.hashCode());
        }

        Set<Point13> set = new HashSet<>();
        set.add(one);
        set.add(two);
        System.out.println(set.size());
    }
}
