package quizs.quiz26.generics.example1;

public class App {
    public static void main(String[] args) {
        GenericHolder<Integer> holder = new GenericHolder<>();
        holder.ref = new Integer(0);
        Object obj = holder.ref;
    }
}
