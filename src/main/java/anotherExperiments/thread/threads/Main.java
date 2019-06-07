package anotherExperiments.thread.threads;

public class Main {
    public static void main(String[] args) {

    }

    private static void isChickenOrEgg(EggVoice eggVoice) {
        if (eggVoice.isAlive()) {
            try {
                eggVoice.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Первым появилось яйцо!");
        }else {
            System.out.println("Первой появилась курица!");
        }
        System.out.println("Спор окончен!");
    }
}

class EggVoice extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 7; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("яйцо!");
        }
    }
}
