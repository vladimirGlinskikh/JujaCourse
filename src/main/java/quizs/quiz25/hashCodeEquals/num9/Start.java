package quizs.quiz25.hashCodeEquals.num9;

import java.util.HashSet;
import java.util.Set;

public class Start {
    public static void main(String[] args) {
        Point9 one = new Point9(0, 9);
        Point9 two = new Point9(8, 9);

        if (one.equals(two)) {
            System.out.println("It's OK!");
            System.out.println(one.hashCode());
            System.out.println(two.hashCode());
        } else {
            System.out.println("Wrong!");
            System.out.println(one.hashCode());
            System.out.println(two.hashCode());
        }

        Set<Point9> set = new HashSet<>();
        set.add(one);
        set.add(two);

        System.out.println(set.size());
    }
}
