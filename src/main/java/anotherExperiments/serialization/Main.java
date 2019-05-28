package anotherExperiments.serialization;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        File file = new File("/home/vladimir/Documents/IdeaProjects/JujaCourse/src/main/resources/testForCar.txt");
        Car car = new Car(34000, "Tesla");
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(file));
             ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file))) {
            objectOutputStream.writeObject(car);
            Car car1 = (Car) objectInputStream.readObject();
            System.out.println(car1);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
