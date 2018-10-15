package quizs.quiz21;

public class App {
    public static void main(String[] args) {
        String str0 = new String("Hello!").intern();
        String str1 = new String(str0.intern());
        System.out.println(str0 == str1);
    }
}
