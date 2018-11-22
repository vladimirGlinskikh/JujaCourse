package quizs.quiz25.hashCodeEquals.num17;

import java.util.HashSet;
import java.util.Set;

public class Start {
    public static void main(String[] args) {
        Point17 one = new Point17(1, 2);
        Point17 two = new Point17(4, 2);

        if (one.equals(two)) {
            System.out.println("OK !");
            System.out.println(one.hashCode());
            System.out.println(two.hashCode());
        } else {
            System.out.println("Wrong!");
            System.out.println(one.hashCode());
            System.out.println(two.hashCode());
        }

        Set<Point17> set = new HashSet<>();
        set.add(one);
        set.add(two);
        System.out.println(set.size());
    }
}
