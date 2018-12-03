package quizs.quiz26.generics.example6;

public class App {
    public static void main(String[] args) {
        GenericHolder<Number> holder = new GenericHolder<>();
        holder.ref = new Integer(0);
        Object obj = holder.ref;
        // in this case that example is compiled.
    }
}
