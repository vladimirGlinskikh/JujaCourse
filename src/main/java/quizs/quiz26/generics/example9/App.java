package quizs.quiz26.generics.example9;

public class App {
    public static void main(String[] args) {
        GenericHolder<Number> holder = new GenericHolder<>();
        //holder.ref = new Object();
        Object obj = holder.ref;

        // In this case that example no compiled.
        // Required type Number, and we are looking for type Object.
    }
}
