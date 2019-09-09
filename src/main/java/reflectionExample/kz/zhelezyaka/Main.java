package reflectionExample.kz.zhelezyaka;

import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) throws Exception {
        SomeClass someObject = new SomeClass();
        Class<SomeClass> someClassAsClass = (Class<SomeClass>) someObject.getClass();
        Field someField = someClassAsClass.getField("someField");
        System.out.println(someField.getType());
        Field[] fields = someClassAsClass.getFields();
        for (Field field : fields) {
            System.out.println(field.getType() + " " + field.getName());
        }

        System.out.println(someObject.someField);
        someField.set(someObject, 789);
        System.out.println(someObject.someField);

        Field privateField = someClassAsClass.getDeclaredField("somePrivate");
        System.out.println(privateField.getName() + " is " + privateField.getType());

        privateField.setAccessible(true);
        privateField.set(someObject, "Vladimir");
        System.out.println(someObject.getSomePrivate());
    }
}
