package quizs.quiz04;

public class AppDistribution {
    public static boolean f(boolean x, boolean y, boolean z) {
        return (x | y) & (y | z);
    }

    public static boolean f1(boolean x, boolean y, boolean z) {
        return (x & y) | z;
    }

    public static boolean f2(boolean x, boolean y, boolean z) {
        return (x | y) & z;
    }

    public static boolean f3(boolean x, boolean y, boolean z) {
        return (x & z) | (y & z);
    }

    public static void main(String[] args) {

        System.out.println(f(true, true, false));
        System.out.println("-----------------------------");
        System.out.println(f1(true, true, false));
        System.out.println(f2(true, true, false));
        System.out.println(f3(true, true, false));
    }
}
