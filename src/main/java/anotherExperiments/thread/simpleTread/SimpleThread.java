package anotherExperiments.thread.simpleTread;

import java.util.ArrayList;
import java.util.List;

public class SimpleThread extends Thread {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        Thread thread = new Thread(new SimpleThread());
        thread.start();

        List list = new ArrayList();
        for (int i = 0; i < 10000; i++) {
            boolean add = list.add(new Object());
            System.out.println(add);
        }

        System.out.println("Juja Professional");
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
}