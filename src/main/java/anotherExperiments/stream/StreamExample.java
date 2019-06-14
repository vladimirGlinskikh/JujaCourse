package anotherExperiments.stream;

import java.util.Arrays;
import java.util.List;

public class StreamExample {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("A", "B", "C", "D", "E");
        long count = list.stream()
                .peek(System.out::println).count();
        System.out.println(count);
    }
}
