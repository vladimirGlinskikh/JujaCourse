package quizs.quiz22;

public class App3 {
    public static void main(String[] args) {
        System.err.println("f:before");// first step
        try {
            f();// two step
        } finally {
            System.err.println("f:finally");// six step
        }
        System.err.println("f:after");
    }

    public static void f() {
        System.err.println("g:before");// three step
        g();// four step
        System.err.println("g:after");
    }

    public static void g() {
        throw new Error();//five step
    }
}
