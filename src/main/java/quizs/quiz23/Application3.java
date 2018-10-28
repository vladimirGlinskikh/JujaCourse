package quizs.quiz23;

public class Application3 {
    public static void main(String[] args) throws Throwable {
        try {
            System.err.print("0 ");// first step
            throw new Error();// two step and finish
        } catch (RuntimeException e) {
            System.err.print("1 ");
        }
        System.err.print("2 ");
    }
}
