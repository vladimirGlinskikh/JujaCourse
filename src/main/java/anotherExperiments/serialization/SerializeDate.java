package anotherExperiments.serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Date;

public class SerializeDate {
    SerializeDate() {
        Date date = new Date();
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("src/main/resources/date.ser");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(date);
            objectOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new SerializeDate();
    }

}
