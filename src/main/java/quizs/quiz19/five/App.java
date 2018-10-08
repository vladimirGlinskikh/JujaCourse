package quizs.quiz19.five;

public class App {
    public static void main(String[] args) {
        Holder ref = new Holder(1);
        System.out.print(f(f(f(ref))).field);
    }

    private static Holder f(Holder arg) {
        arg = new Holder(arg.field + 1);
        arg.field = arg.field + 1;
        return arg;
    }

//    public static Holder g(Holder arg) {
//        arg = new Holder(4);
//        arg.field = 5;
//        return arg;
//    }
}
