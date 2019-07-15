package anotherExperiments.multithreading;

public class TestThread {
    public static void main(String[] args) {

//        MyThread thread1 = new MyThread();
//        thread1.start();
//        MyThread thread2 = new MyThread();
//        thread2.start();

        System.out.println("I'm going to sleep");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("I am awake!");
    }
}

class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("Hello Juja " + i);
        }
    }
}
