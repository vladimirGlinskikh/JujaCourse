package anotherExperiments.collection.comparator;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Animal cat = new Animal("black cat", 7, 25, 5000);
        Animal dog = new Animal("spaniel", 3, 23, 7000);
        Animal bird = new Animal("parrot", 2, 50, 9000);

        Animal[] animal = {cat, dog, bird};

        Arrays.sort(animal, new ComparatorByPrice());
        for (Animal tmp : animal) {
            System.out.println(tmp);
        }
        System.out.println("----------------------");

        Arrays.sort(animal, new ComparatorBySpeed());
        for (Animal tmp : animal) {
            System.out.println(tmp);
        }
        System.out.println("------------------------");

        Arrays.sort(animal, new ComparatorByColor());
        for (Animal tmp : animal) {
            System.out.println(tmp);
        }
        System.out.println("-----------------------");

        Arrays.sort(animal, new ComparatorByWeight());
        for (Animal tmp : animal) {
            System.out.println(tmp);
        }
    }
}
