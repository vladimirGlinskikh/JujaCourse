package quizs.quiz22;

public class App4 {
    public static void main(String[] args) {
        System.err.println("f:before");// first step
        f();// two step
        System.err.println("f:after");// eight step
    }

    public static void f() {
        System.err.println("g:before");// three step
        try {
            g();// four step
        } catch (Error e) {
            System.err.println("g:catch");// six step
        }
        System.err.println("g:after");// seven step
    }

    public static void g() {
        throw new Error();// five step
    }
}
