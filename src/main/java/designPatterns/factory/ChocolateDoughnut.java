package designPatterns.factory;

public class ChocolateDoughnut implements Doughnut {
    @Override
    public void eat() {
        System.out.println("You are eating Chocolate doughnut!");
    }
}
