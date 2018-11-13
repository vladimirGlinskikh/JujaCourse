package quizs.quiz25.set;

import java.util.HashSet;
import java.util.Set;

public class App10 {
    public static void main(String[] args) {
        Set<Boolean> set = new HashSet<>();
        set.remove(set.remove(set.remove(false)));
        System.out.println(set.size());// 0
    }
}
