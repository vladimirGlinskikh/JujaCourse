package quizs.quiz17;

public class AppFour {
    public static void main(String[] args) {
        Outer.Nested ref = new Outer.Nested();
        System.out.println(ref);

    }
}

class Outer {
    class Inner {
    }

    static class Nested {
    }
}
