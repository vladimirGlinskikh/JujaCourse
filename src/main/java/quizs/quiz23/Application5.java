package quizs.quiz23;

public class Application5 {
    public static void main(String[] args) throws Throwable {
        try {
            System.err.print("0 ");// first step
            throw new Exception();// two step and finish
        } catch (Error e) {
            System.err.print("1 ");
        }
        System.err.print("2 ");
    }
}
