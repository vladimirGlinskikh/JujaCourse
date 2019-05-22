package anotherExperiments.IO;

import java.io.*;

public class SimpleDataInputStream {
    public static void main(String[] args) {
        try (DataOutputStream out = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("src\\main\\resources\\dataOut.txt")));
             DataInputStream in = new DataInputStream(new BufferedInputStream(new FileInputStream("src\\main\\resources\\dataOut.txt")))) {
            out.writeShort(1000);
            out.writeInt(234);
            out.writeLong(34L);
            out.writeUTF("Hello Juja!");
            out.flush();

            System.out.println(in.readShort());
            System.out.println(in.readInt());
            System.out.println(in.readLong());
            System.out.println(in.readUTF());

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
