package quizs.quiz22;

public class App7 {
    public static void main(String[] args) {
        System.err.println("f:before");// first step
        f();// two step
        System.err.println("f:after");
    }

    public static void f() {
        System.err.println("g:before");// tree step
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
