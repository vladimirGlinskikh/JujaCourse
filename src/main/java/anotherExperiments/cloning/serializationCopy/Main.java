package anotherExperiments.cloning.serializationCopy;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        Cow cow = new Cow("MilkCow", 300, 5);

        try {
            ByteArrayOutputStream byteOutput = new ByteArrayOutputStream();
            ObjectOutputStream objectOutput = new ObjectOutputStream(byteOutput);

            objectOutput.writeObject(cow);
            objectOutput.flush();
            objectOutput.close();

            ByteArrayInputStream byteInput = new ByteArrayInputStream(byteOutput.toByteArray());
            ObjectInputStream objectInput = new ObjectInputStream(byteInput);

            Cow cloneCow = (Cow) objectInput.readObject();
            objectInput.close();

            System.out.println("Original Cow = " + cow);
            System.out.println("Clone Cow = " + cloneCow);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
