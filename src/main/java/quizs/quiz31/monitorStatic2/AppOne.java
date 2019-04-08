package quizs.quiz31.monitorStatic2;

public class AppOne extends Thread{
    public static void main(String[] args) {

    }
    public static synchronized void f(){
        System.out.println("Method f()");
    }
    public static synchronized void g(){
        System.out.println("Method g()");
    }
}
