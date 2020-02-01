package anotherExperiments.stream;

import java.util.*;

public class App {
    public static void main(String[] args) {
//        List<Integer> numbers = new ArrayList<>(Arrays.asList(2, 4, 1, 7, 4, 0, 8, -1));
//        numbers.removeIf(n -> n < 3);
//        numbers.forEach(n -> System.out.print(n + " "));

        Map<String, String> books = new HashMap<>();
        books.put("Война и мир", "Лев Толстой");
        books.put("Преступление и наказание", "Федор Достоевский");
        books.put("Философия Java", "Брюс Эккель");
        books.put("Братья Карамазовы", "Федор Достоевский");
        books.put("Властелин Колец", "Джон Толкин");
        books.forEach((a, b) -> System.out.println("Название книги: " + a + ". Автор: " + b));

        books.compute("Философия Java", (a, b) -> b + ", крутой чувак");
        System.out.println("_______________________");
        books.forEach((a, b) -> System.out.println("Название книги: " + a + ". Автор: " + b));
    }
}
