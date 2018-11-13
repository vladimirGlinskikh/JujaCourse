package quizs.quiz25.setUsage;

import java.util.HashSet;
import java.util.Set;

public class App2 {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(set.size());
        set.add(set.size());
        set.add(set.size());
        System.out.println(set.contains(set.size()));//false
    }
}
