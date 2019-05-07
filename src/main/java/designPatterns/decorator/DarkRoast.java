package designPatterns.decorator;

public class DarkRoast extends Beverage {

    public DarkRoast() {
        description = "DarkRoast coffee";
    }

    @Override
    public double coast() {
        return 0.99;
    }
}
