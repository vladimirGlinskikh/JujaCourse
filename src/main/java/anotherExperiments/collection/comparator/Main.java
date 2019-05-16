package anotherExperiments.collection.comparator;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Animal cat = new Animal("black cat", 7, 25, 5000);
        Animal dog = new Animal("spaniel", 3, 23, 7000);
        Animal bird = new Animal("parrot", 2, 50, 9000);

        Animal[] animal = {cat, dog, bird};

        Arrays.sort(animal, new Comparator<Animal>() {
            @Override
            public int compare(Animal o1, Animal o2) {
                return o1.price - o2.price;
            }
        });
        for (Animal tmp : animal) {
            System.out.println(tmp);
        }
        System.out.println("----------------------");

        Arrays.sort(animal, new Comparator<Animal>() {
            @Override
            public int compare(Animal o1, Animal o2) {
                return o1.speed - o2.speed;
            }
        });
        for (Animal tmp : animal) {
            System.out.println(tmp);
        }
        System.out.println("------------------------");

        Arrays.sort(animal, new Comparator<Animal>() {
            @Override
            public int compare(Animal o1, Animal o2) {
                return o1.breed.compareTo(o2.breed);
            }
        });
        for (Animal tmp : animal) {
            System.out.println(tmp);
        }
        System.out.println("-----------------------");

        Arrays.sort(animal, new Comparator<Animal>() {
            @Override
            public int compare(Animal o1, Animal o2) {
                return o1.weight - o2.weight;
            }
        });
        for (Animal tmp : animal) {
            System.out.println(tmp);
        }
    }
}
