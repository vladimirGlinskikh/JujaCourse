package quizs.quiz04;

public class App {
    public static void main(String[] args) {
        String s = null;

        if (s == null | s.isEmpty()) {
            System.out.print("not empty");
        } else {
            System.out.print("empty");
        }
    }
}
