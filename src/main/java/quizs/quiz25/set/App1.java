package quizs.quiz25.set;

import java.util.HashSet;
import java.util.Set;

public class App1 {
    public static void main(String[] args) {
        Set<Boolean> set = new HashSet<>();
        set.add(set.add(set.add(true)));
        System.out.println(set.size());//2
    }
}
