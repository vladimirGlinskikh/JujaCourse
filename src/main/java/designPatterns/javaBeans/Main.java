package designPatterns.javaBeans;

public class Main {
    public static void main(String[] args) {
        NutritionFacts product = new NutritionFacts();
        product.setServingSize(270);
        product.setServings(9);
        product.setCalories(239);
        System.out.println(product);
    }
}
