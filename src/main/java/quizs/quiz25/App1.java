package quizs.quiz25;

import java.util.HashSet;
import java.util.Set;

public class App1 {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(set.size());
        set.add(set.size());
        set.add(set.size());
        System.out.println(set.size());// 3
    }
}
