package anotherExperiments.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(2, 4, 1, 7, 4, 0, 8, -1));
        numbers.removeIf(n -> n < 3);
        numbers.forEach(n -> System.out.print(n + " "));
    }
}
