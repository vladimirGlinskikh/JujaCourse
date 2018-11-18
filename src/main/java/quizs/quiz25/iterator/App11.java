package quizs.quiz25.iterator;

import java.util.Arrays;
import java.util.List;

public class App11 {
    public static void main(String[] args) {
        List<String> listA = Arrays.asList("A", "B");
        List<Integer> listB = Arrays.asList(1, 2, 3);
        for (String aListA : listA) {
            for (Integer aListB : listB) {
                System.out.print(aListA + aListB + " ");
            }
            System.out.println();
        }
    }
}
