package anotherExperiments.cloning.reflectionCopy;

import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) {
        Cow originalCow = new Cow("Burenka", 5, 1);
        System.out.println("Original Cow = " + originalCow);

        Cow copiedCow = reflectionCloning(originalCow);
        System.out.println("Copied Cow = " + copiedCow);
    }

    private static Cow reflectionCloning(Cow originalCow) {
        try {
            Field name = Cow.class.getDeclaredField("name");
            Field head = Cow.class.getDeclaredField("head");

            name.setAccessible(true);
            head.setAccessible(true);

            name.set(originalCow, "MilkCow");
            head.set(originalCow, 2);


        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }

        return originalCow;
    }
}
