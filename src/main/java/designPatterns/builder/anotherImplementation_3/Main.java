package designPatterns.builder.anotherImplementation_3;

import static designPatterns.builder.anotherImplementation_3.NyPizza.Size.SMALL;
import static designPatterns.builder.anotherImplementation_3.Pizza.Topping.*;

public class Main {
    public static void main(String[] args) {
        NyPizza pizza = new NyPizza.Builder(SMALL).addTopping(SAUSAGE).addTopping(ONION).build();
        System.out.println(pizza);

        Calzone calzone = new Calzone.Builder().addTopping(HAM).sauceInside().build();
        System.out.println(calzone);
    }
}
