package quizs.quiz19.four;

public class App {
    public static void main(String[] args) {
        int x = 70;
        Holder ref = new Holder(60);
        x = f(x, g(x, ref));
        System.out.println(x + " " + ref.field);
    }

    public static int f(int x, Holder ref) {
        x += 50;
        ref.field = 40;
        return 30;
    }

    public static Holder g(int x, Holder arr) {
        x = 20;
        arr = new Holder(10);
        return arr;
    }
}
