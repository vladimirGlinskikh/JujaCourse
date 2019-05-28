package anotherExperiments.serialization.simpleSerialization;

import java.io.*;

public class Main {
    public static void main(String[] args) {

        Student student = new Student(1, "Vladimir");
        File file = new File("/home/vladimir/Documents/IdeaProjects/JujaCourse/src/main/resources/testForStudents.txt");
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(file));
             ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file))) {

            objectOutputStream.writeObject(student);

            student = null;
            student = (Student) objectInputStream.readObject();
            System.out.println(student);

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
