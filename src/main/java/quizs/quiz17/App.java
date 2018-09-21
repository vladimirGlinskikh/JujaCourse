package quizs.quiz17;

public class App {
    public static void main(String[] args) {
        f(new Runnable() {
            @Override
            public void run() {
                System.out.println(k);
            }
        });
        //final int k = 0;
    }

    public static void f(Runnable ref) {
        final int k = 1;
        ref.run();
    }
    static int k = 0;
}
