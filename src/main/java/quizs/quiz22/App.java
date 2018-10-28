package quizs.quiz22;

public class App {
    public static void main(String[] args) {
        System.err.println("f:before");// first step
        try {
            f();// two step
        } catch (Error e) {
            System.err.println("f:catch");// six step
        }
        System.err.println("f:after");// seven step
    }

    public static void f() {
        System.err.println("g:before");// three step
        g();// four step
        System.err.println("g:after");
    }

    public static void g() {
        throw new Error();// fivi step
    }
}
