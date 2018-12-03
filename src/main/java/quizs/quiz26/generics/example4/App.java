package quizs.quiz26.generics.example4;

public class App {
    public static void main(String[] args) {
        GenericHolder<Integer> holder = new GenericHolder<>();
        holder.ref = new Integer(0);
        //String obj = holder.ref;
        // In this case is not compiled.
    }
}
