package quizs.quiz22;

public class App8 {
    public static void main(String[] args) {
        System.err.println("f:before");// first step
        try {
            f();// two step
        } finally {
            System.err.println("f:finally");// seven step
        }
        System.err.println("f:after");
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
