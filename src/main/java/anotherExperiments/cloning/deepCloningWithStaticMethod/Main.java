package anotherExperiments.cloning.deepCloningWithStaticMethod;

public class Main {
    public static void main(String[] args) {
        Human cloneHuman = Human.getHumanInstanceWithAgeAndString(20, "Andrey");
        System.out.println(cloneHuman);

        Car car = new Car(2500, "Volvo");
        System.out.println("Original Car = " + car);

        Car copiedCar = Car.deepCopyCar(car);
        System.out.println("CopiedCar Car = " + copiedCar);
    }
}
