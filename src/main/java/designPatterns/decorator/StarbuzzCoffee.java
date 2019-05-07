package designPatterns.decorator;

public class StarbuzzCoffee {
    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription()
                + " $" + beverage.coast());

        Beverage beverage2 = new DarkRoast();

    }
}
