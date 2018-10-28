package quizs.quiz23;

public class Application {
    public static void main(String[] args) throws Throwable {
        try {
            System.err.print("0 ");// first step
            throw new Error();
        } catch (Error e) {
            System.err.print("1 ");// two step
        }
        System.err.print("2 ");// three step
    }
}
