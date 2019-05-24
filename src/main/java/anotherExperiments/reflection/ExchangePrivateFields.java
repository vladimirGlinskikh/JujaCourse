package anotherExperiments.reflection;

import java.lang.reflect.Field;

public class ExchangePrivateFields {
    private static final class Cat {
        private int age = 7;
    }

    public static void main(String[] args) {

        try {
            Class<?> cl = Cat.class;
            Cat cat = new Cat();
            Field field = cl.getDeclaredField("age");
            field.setAccessible(true);
            System.out.println("Private field value: " + field.getInt(cat));
            field.setInt(cat, 10);
            System.out.println("New private field value: " + field.getInt(cat));

        } catch (Exception e) {

        }
    }
}
