package designPatterns.builder.anotherImplementation_2;

public class Main {
    public static void main(String[] args) {
        NutritionFacts product = new NutritionFacts
                .Builder(349, 3)
                .calories(100)
                .fat(23)
                .sodium(12)
                .carbohydrate(46)
                .build();
        System.out.println(product);
    }
}
