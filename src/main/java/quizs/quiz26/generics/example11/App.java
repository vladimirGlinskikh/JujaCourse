package quizs.quiz26.generics.example11;

public class App {
    public static void main(String[] args) {
        GenericHolder<Number> holder = new GenericHolder<>();
        holder.ref = new Double(0.5);
        //Integer obj = holder.ref;
        // In this case that example is no compiled.
        // Required type Integer, and we are looking for type Number.
    }
}
