package quizs.quiz25.hashCodeEquals.num12;

import java.util.HashSet;
import java.util.Set;

public class Start {
    public static void main(String[] args) {
        Point12 one = new Point12(1, 2);
        Point12 two = new Point12(1, 2);

        if (one.equals(two)) {
            System.out.println("OK !");
            System.out.println(one.hashCode());
            System.out.println(two.hashCode());
        } else {
            System.out.println("Wrong ! ");
            System.out.println(one.hashCode());
            System.out.println(two.hashCode());
        }

        Set<Point12> set = new HashSet<>();
        set.add(one);
        set.add(two);
        System.out.println(set.size());
    }
}
