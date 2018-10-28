package quizs.quiz22;

public class App {
    public static void main(String[] args) {
        System.err.println("f:before");
        try {
            f();
        } catch (Error e) {
            System.err.println("f:catch");
        }
        System.err.println("f:after");
    }

    public static void f() {
        System.err.println("g:before");
        g();
        System.err.println("g:after");
    }

    public static void g() {
        throw new Error();
    }
}
