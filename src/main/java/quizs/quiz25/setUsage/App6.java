package quizs.quiz25.setUsage;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class App6 {
    public static void main(String[] args) {
        Set<Boolean> set = new HashSet<>();
        set.addAll(Arrays.asList(set.isEmpty(), set.isEmpty()));
        set.removeAll(Arrays.asList(set.containsAll(Arrays.asList(set.isEmpty(), set.isEmpty()))));
        System.out.println(set.size());//1
    }
}
