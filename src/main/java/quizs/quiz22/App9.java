package quizs.quiz22;

public class App9 {
    public static void main(String[] args) {
        System.err.println("f:before");// first step
        try {
            f();// two step
        } catch (Error e) {
            System.err.println("f:catch");// seven step
        }
        System.err.println("f:after");// eight step
    }

    public static void f() {
        System.err.println("g:before");// three step
        try {
            g();// four step
        } finally {
            System.err.println("g:finally");// six step
        }
        System.err.println("g:after");
    }

    public static void g() {
        throw new Error();// five step
    }
}
