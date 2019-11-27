package designPatterns.factory;

public class CherryDoughnut implements Doughnut {
    @Override
    public void eat() {
        System.out.println("You are eating Cherry doughnut!");
    }
}
