package anotherExperiments.statics;

public class StaticExample {
    public static String string;
    private static int count;

    static {
        System.out.println("StaticExample static block1");
        string = "Test";
        setCount(2);
    }

    static {
        System.out.println("StaticExample static block2");
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        if (count > 0) {
            StaticExample.count = count;
        }
    }

    public static int addInts(int i, int... js) {
        int sum = 1;
        for (int x : js) {
            sum += x;
        }
        return sum;
    }

    public static class MyStaticClass {
        public int count;
    }
}
