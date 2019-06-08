package ex_9_exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Throw {
    public static void main(String[] args) {
        try {
            readFile();
        } catch (FileReaderException e) {
            System.out.println("Mój wyjątek! " + e);
        }
    }

    public static String readFile() throws FileReaderException {
        File file = new File("./src/sample.txt");
        FileReader fr;
        try {
            fr = new FileReader(file);
        } catch (FileNotFoundException e) {
            throw new FileReaderException();
        }

        return fr.getEncoding();
    }
}
