package designPatterns.decorator.coffee;

public class HouseBlend extends Beverage {

    public HouseBlend() {
        description = "House Blend Coffee";
    }

    @Override
    public double coast() {
        return 0.89;
    }
}
