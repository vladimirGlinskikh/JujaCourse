package quizs.quiz26.generics.example7;

public class App {
    public static void main(String[] args) {
        GenericHolder<Number> holder = new GenericHolder<>();
        holder.ref = new Integer(0);
        Number obj = holder.ref;
        // In this case that example is compiled.
    }
}
