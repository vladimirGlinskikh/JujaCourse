package anotherExperiments.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("A", "B", "C", "D", "E");
        List<String> count = list.stream()
                .peek(System.out::println)
                .collect(Collectors.toList());
        System.out.println(count.size());
    }
}
