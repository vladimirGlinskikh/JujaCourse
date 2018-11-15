package quizs.quiz25.iterator;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class App1 {
    public static void main(String[] args) {
        List<String> listA = Arrays.asList("A", "B", "C");
        List<Integer> listB = Arrays.asList(1, 2, 3);
        for (Iterator<String> iterA = listA.iterator(); iterA.hasNext(); ) {
            for (Iterator<Integer> iterB = listB.iterator(); iterB.hasNext(); ) {
                System.out.print(iterA.next() + iterB.next() + " ");// A1 B2 C3
            }
            System.out.println();
        }
    }
}
