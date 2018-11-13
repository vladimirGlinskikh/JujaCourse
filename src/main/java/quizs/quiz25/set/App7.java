package quizs.quiz25.set;

import java.util.HashSet;
import java.util.Set;

public class App7 {
    public static void main(String[] args) {
        Set<Boolean> set = new HashSet<>();
        set.remove(set.add(set.add(false)));
        System.out.println(set.size());// 1
    }
}
