package designPatterns.builder;

public class Main {
    public static void main(String[] args) {
        Person person = new Person.Builder()
                .withName("Svetlana")
                .withSurname("Nikolaeva")
                .withAge(40)
                .withHeight(170)
                .withWidth(65)
                .build();
        System.out.println(person);
    }
}
