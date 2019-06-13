package anotherExperiments.jujaTasks;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ListGegerated {
    public static void main(String[] args) {
        List<Integer> numbers = Stream.of(1, 2, 3, 4, 5).collect(Collectors.toList());

//        List<Integer> generated = numbers.stream()
//                .flatMap(n -> Stream.generate(() -> n).limit(n))
//                .collect(Collectors.toList());

//        List<Integer> generated = numbers.stream()
//                .flatMapToInt(n -> IntStream.rangeClosed(1, n))
//                .boxed()
//                .collect(Collectors.toList());

//        List<Integer> generated = numbers.stream()
//                .flatMapToInt(n -> IntStream.iterate(n, val -> val + 1).limit(n))
//                .boxed()
//                .collect(Collectors.toList());

        List<Integer> generated = numbers.stream()
                .flatMap(Stream::of)
                .collect(Collectors.toList());


        System.out.println(generated);
    }
}
