package anotherExperiments.IO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SimpleBufferedReader {
    public static void main(String[] args) {

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int num = Integer.parseInt(br.readLine());
            System.out.println(num);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

