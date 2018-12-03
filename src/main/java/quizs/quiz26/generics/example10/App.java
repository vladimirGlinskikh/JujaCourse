package quizs.quiz26.generics.example10;

public class App {
    public static void main(String[] args) {
        GenericHolder<Integer> holder = new GenericHolder<>();
        //holder.ref = new Object();
        Integer obj = holder.ref;
        // In this case that example no compiled.
        // Required type Integer, and we are looking for type Object.
    }
}
