package anotherExperiments.thread.simpleTread;

import java.util.ArrayList;
import java.util.List;

public class SimpleThread implements Runnable {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        System.out.println("Start Thread main()");
        Thread thread = new Thread(new SimpleThread());
        thread.start();

        System.out.println("true if number is add");
        List list = new ArrayList();
        System.out.println("go into a cycle");
        for (int i = 0; i < 10; i++) {
            boolean add = list.add(new Object());
            System.out.println(add);
        }

        System.out.println("exit from a cycle");
        System.out.println("Exit from Thread main()");
    }

    @Override
    public void run() {
        System.out.println("Start method run()");
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
        System.out.println("End method run()");
    }
}