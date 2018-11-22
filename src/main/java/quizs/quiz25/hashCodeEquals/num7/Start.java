package quizs.quiz25.hashCodeEquals.num7;

import java.util.HashSet;
import java.util.Set;

public class Start {
    public static void main(String[] args) {
        Point7 one = new Point7(4, 9);
        Point7 two = new Point7(4, 9);

        if (one.equals(two)) {
            System.out.println("OK! ");
            System.out.println(one.hashCode());
            System.out.println(two.hashCode());
        } else {
            System.out.println("It's wrong!");
            System.out.println(one.hashCode());
            System.out.println(two.hashCode());
        }

        Set<Point7> set = new HashSet<>();
        set.add(one);
        set.add(two);

        System.out.println(set.size());
    }
}
