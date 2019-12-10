package designPatterns.factory.abstractFactory.pizzaFactory;

public class NYPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String item) {
        if (item.equals("cheese")) {
            return new NYStyleCheesePizza();
        }
        return null;
    }
}
