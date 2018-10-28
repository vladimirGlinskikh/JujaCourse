package quizs.quiz23.try_catch;

public class Application13 {
    public static void main(String[] args) throws Throwable {
        try {
            System.err.print("0 ");// first step
            throw new Throwable();// two step and finish
        } catch (Exception e) {
            System.err.print("1 ");
        }
        System.err.print("2 ");
    }
}
