package designPatterns.decorator.coffee;

public class Espresso extends Beverage {

    public Espresso() {
        description = "Espresso";
    }

    @Override
    public double coast() {
        return 1.99;
    }
}
