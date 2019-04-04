package ex_9_exceptions;

import java.io.File;
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
            System.out.println("Błędna ścieżka pliku! " + e);
        }
    }

    public static void readFile() throws FileReaderException {
        ClassLoader cl = TryCatchFinally.class.getClassLoader();
        File file = new File(cl.getResource("sample.txt").getFile());
        Path path = Paths.get(file.getPath());


        try {
            Stream<String> fl = Files.lines(path);
            fl.forEach(System.out::println);
        } catch (IOException e) {
            throw new FileReaderException();
        }

    }
}
