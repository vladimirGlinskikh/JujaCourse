package quizs.quiz25;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class App4 {
    public static void main(String[] args) {
        Set<Boolean> set = new HashSet<>();
        set.add(set.isEmpty());
        set.add(set.iterator().hasNext());
        set.add(set.size() == 2);

        set.retainAll(Arrays.asList(!set.iterator().hasNext()));
        System.out.println(set.size());
    }
}
