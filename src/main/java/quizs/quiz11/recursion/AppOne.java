package quizs.quiz11.recursion;

public class AppOne {
    public static void main(String[] args) {
        System.out.println(f0(4));
    }

    private static boolean f0(int k) {
        System.out.print("f0 ");
        return k == 0 ? true : f1(k - 1);
    }

    private static boolean f1(int k) {
        System.out.print("f1 ");
        return k == 0 ? false : f0(k - 1);
    }
}
