package quizs.quiz23;

public class Application14 {
    public static void main(String[] args) throws Throwable {
        try {
            System.err.print("0 ");// first step
            throw new Throwable();// two step and finish
        } catch (RuntimeException e) {
            System.err.print("1 ");
        }
        System.err.print("2 ");
    }
}
