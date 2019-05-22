package anotherExperiments.IO;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class SimpleCopyFile {
    public static void main(String[] args) {
        File sourceFile = new File("src\\main\\resources\\sourceFile.txt");
        File targetFile = new File("src\\main\\resources\\targetFile.txt");

        try {
            Files.copy(sourceFile.toPath(), targetFile.toPath());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
