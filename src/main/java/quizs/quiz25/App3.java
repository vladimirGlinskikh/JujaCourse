package quizs.quiz25;

import java.util.HashSet;
import java.util.Set;

public class App3 {
    public static void main(String[] args) {
        Set<Boolean> set = new HashSet<>();
        set.add(set.isEmpty());
        set.add(set.iterator().hasNext());
        set.add(set.size() == 1);
        System.out.println(set.size());// 1
    }
}
