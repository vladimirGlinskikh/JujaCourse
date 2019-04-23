package designPatterns.strategy;

public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("I'm silence!");
    }
}
