package quizs.quiz26.generics.example5;

public class App {
    public static void main(String[] args) {
        GenericHolder<Integer> holder = new GenericHolder<>();
        holder.ref = new Integer(0);
        //String obj = (String) holder.ref;
        // In this case is no compile.
    }
}
