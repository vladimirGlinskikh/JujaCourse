package quizs.quiz17;

public class Application {
    private int fieldInstance = 0;
    private static int fieldStatic = 0;

    public  class X {
        public void f() {
            fieldInstance = 1;
        }
    }
}
