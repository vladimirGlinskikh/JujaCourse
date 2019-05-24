package anotherExperiments.reflection;

public class SimpleReflection {
    public static void main(String[] args) {
        SimpleReflection simpleReflection = new SimpleReflection();

        Class<?> cl = simpleReflection.getClass();

        int[] arr = new int[10];
        Class<?> cl1 = arr.getClass();
        Class<?> cl2 = "Juja".getClass();
        Class<?> cl3 = Integer.valueOf(5).getClass();
        System.out.println(cl);
        System.out.println(cl1);
        System.out.println(cl2);
        System.out.println(cl3);
    }
}
