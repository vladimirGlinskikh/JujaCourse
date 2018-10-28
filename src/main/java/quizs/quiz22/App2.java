package quizs.quiz22;

public class App2 {
    public static void main(String[] args) {
        System.err.println("f:before");// first step
        f();// two step
        System.err.println("f:after");
    }

    public static void f() {
        System.err.println("g:before");// three step
        g();// four step
        System.err.println("g:after");
    }

    public static void g() {
        throw new Error();// five step and finish
    }
}
