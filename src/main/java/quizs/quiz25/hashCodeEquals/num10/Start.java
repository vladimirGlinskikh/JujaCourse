package quizs.quiz25.hashCodeEquals.num10;

import java.util.HashSet;
import java.util.Set;

public class Start {
    public static void main(String[] args) {
        Point10 one = new Point10(1, 2);
        Point10 two = new Point10(3, 2);

        if (one.equals(two)) {
            System.out.println("OK");
            System.out.println(one.hashCode());
            System.out.println(two.hashCode());
        } else {
            System.out.println("Wrong ! ");
            System.out.println(one.hashCode());
            System.out.println(two.hashCode());
        }

        Set<Point10> set = new HashSet<>();
        set.add(one);
        set.add(two);
        System.out.println(set.size());
    }
}
