package quizs.quiz26.generics.example12;

public class App {
    public static void main(String[] args) {
        GenericHolder<Number> holder = new GenericHolder<>();
        holder.ref = new Double(0.5);
        Integer obj = (Integer) holder.ref;
        // In this case that example compiled, but we get the exception ClassCastException.
    }
}
