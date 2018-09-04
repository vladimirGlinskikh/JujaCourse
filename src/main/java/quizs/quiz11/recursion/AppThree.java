package quizs.quiz11.recursion;

public class AppThree {
    public static void main(String[] args) {
        System.out.println(f(5, 3));
    }

    private static int f(int a, int b) {
        return (b == 1) ? a : a * f(a, b - 1);
    }
}
