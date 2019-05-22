package anotherExperiments.IO;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class SimpleMoveFile {
    public static void main(String[] args) {
        File sourceFile = new File("src\\main\\resources\\sourceFile.txt");
        File targetFile = new File("src\\main\\resources\\target\\targetFile.txt");

        try {
            Files.move(sourceFile.toPath(), targetFile.toPath());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
