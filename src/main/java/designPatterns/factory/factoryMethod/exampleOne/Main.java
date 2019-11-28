package designPatterns.factory.factoryMethod.exampleOne;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        DoughnatFactory factory = new DoughnatFactory();
        for (int i = 0; i < 100; i++) {
            eatRandomDoughnut(factory);
        }
        factory.printCount();
    }

    public static void eatRandomDoughnut(DoughnatFactory factory) {
        Doughnut randomDougnut = getRandomDougnut(factory);
        System.out.printf("What a surprise! ");
        randomDougnut.eat();
    }

    public static Doughnut getRandomDougnut(DoughnatFactory factory) {
        Random random = new Random();
        DoughnutTypes type = DoughnutTypes.values()[random.nextInt(DoughnutTypes.values().length)];

        return (factory.getDoughnut(type));
    }
}
