package anotherExperiments.serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Date;

public class UnSerializeDate {
    UnSerializeDate() {
        Date date = null;
        try {
            FileInputStream fileInputStream = new FileInputStream("src/main/resources/date.ser");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            date = (Date) objectInputStream.readObject();
            objectInputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("Unserialized Date object from date.ser");
        System.out.println("Date: " + date);
    }

    public static void main(String[] args) {
        new UnSerializeDate();
    }
}
