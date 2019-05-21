package anotherExperiments.IO;

import java.io.ByteArrayInputStream;

public class SimpleByteArrayInputStream {
    public static void main(String[] args) {
        byte[] arr = new byte[]{1, 5, 3, 9, 0};
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(arr);

        int tmp;
        while ((tmp = byteArrayInputStream.read()) != -1) {
            System.out.println(tmp);
        }
        System.out.println("-----------------------------------");

        String string = "Hello Juja!";
        byte[] arr1 = string.getBytes();
        ByteArrayInputStream byteArrayInputStream1 = new ByteArrayInputStream(arr1, 1, 3);

        int tmp1;
        while ((tmp1 = byteArrayInputStream1.read()) != -1) {
            System.out.println((char) tmp1);
        }
        System.out.println("---------------------------------------");
    }
}
