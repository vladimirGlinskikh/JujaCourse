package designPatterns.decorator.coffee;

public class Decaf extends Beverage {

    public Decaf() {
        description = "Decaf coffee";
    }

    @Override
    public double coast() {
        return 1.05;
    }
}
