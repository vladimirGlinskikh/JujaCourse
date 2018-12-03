package quizs.quiz26.generics.example8;

public class App {
    public static void main(String[] args) {
        GenericHolder<Number> holder = new GenericHolder<>();
        holder.ref = new Integer(0);
//        Integer obj = holder.ref;
        // In this case that example no compiled.
        // Found type Number, and we are looking for type Integer.
    }
}
