package anotherExperiments.serialization.serializationWithObject;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        File file = new File("/home/vladimir/Documents/IdeaProjects/JujaCourse/src/main/resources/testForCarWithEngine.txt");
        Car car = new Car(23000, "Opel", new Engine(5000));

        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(file));
             ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file))) {

            objectOutputStream.writeObject(car);
            Car newCar = (Car) objectInputStream.readObject();
            System.out.println(newCar);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
    }
}
