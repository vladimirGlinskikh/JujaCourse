package designPatterns.singleton.threadSingleton;

public class MultiThreadSingleton {
    public static void main(String[] args) {
        System.out.println("Одиночка отработал правильно, если ты видишь одинаковые значения." + "\n" +
                "Если ты видишь разные значения, значит паттерн отработал неправильно.");

        Thread threadOne = new Thread(new ThreadOne());
        Thread threadTwo = new Thread(new ThreadTwo());
        threadOne.start();
        threadTwo.start();
    }

    static class ThreadOne implements Runnable {

        @Override
        public void run() {
            Singleton singleton = Singleton.getInstance("One");
            System.out.println(singleton.value);
        }
    }

    static class ThreadTwo implements Runnable {

        @Override
        public void run() {
            Singleton singleton = Singleton.getInstance("Two");
            System.out.println(singleton.value);
        }
    }
}
