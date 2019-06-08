package ex_9_exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Throws {
    public static void main(String[] args) {
        try {
            System.out.println(readFile());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static String readFile() throws FileNotFoundException {
        File file = new File("./src/sample.txt");
        FileReader fr = new FileReader(file);

        return fr.getEncoding();
    }
}
