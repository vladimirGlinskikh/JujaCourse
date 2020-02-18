package designPatterns.singleton;

public class SingletonWithStaticFinal {
    private static final SingletonWithStaticFinal instance = new SingletonWithStaticFinal();

    private SingletonWithStaticFinal() {
    }

    public static SingletonWithStaticFinal getInstance() {
        return instance;
    }
}
