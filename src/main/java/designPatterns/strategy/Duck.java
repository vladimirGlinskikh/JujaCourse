package designPatterns.strategy;

public abstract class Duck {

    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public Duck() {
    }

    public abstract void display();

    public void performFly(){
        flyBehavior.fly();
    }

    public void performQuack(){
        flyBehavior.quack();
    }

    public void swim(){
        System.out.println("All ducks float, even decoys!");
    }
}
