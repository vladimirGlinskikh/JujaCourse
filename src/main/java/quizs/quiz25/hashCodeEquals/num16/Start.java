package quizs.quiz25.hashCodeEquals.num16;

import java.util.HashSet;
import java.util.Set;

public class Start {
    public static void main(String[] args) {
        Point16 one = new Point16(1, 2);
        Point16 two = new Point16(1, 2);

        if (one.equals(two)) {
            System.out.println("OK");
            System.out.println(one.hashCode());
            System.out.println(two.hashCode());
        } else {
            System.out.println("Wrong! ");
            System.out.println(one.hashCode());
            System.out.println(two.hashCode());
        }

        Set<Point16> set = new HashSet<>();
        set.add(one);
        set.add(two);
        System.out.println(set.size());
    }
}
