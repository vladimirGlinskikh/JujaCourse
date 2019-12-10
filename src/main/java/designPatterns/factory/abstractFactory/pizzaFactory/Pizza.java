package designPatterns.factory.abstractFactory.pizzaFactory;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {
    String name;
    String dough;
    String sauce;

    List<String> toppings = new ArrayList<>();

    void prepare() {
        System.out.println("Preparing: " + name);
        System.out.println("Tossing dough: " + name);
        System.out.println("Adding sauce: " + name);
        System.out.println("Adding toppings: " + name);
        for (String topping : toppings) {
            System.out.println(" " + toppings);
        }
    }

    void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }

    void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }

    void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }

    public String getName() {
        return name;
    }
}
