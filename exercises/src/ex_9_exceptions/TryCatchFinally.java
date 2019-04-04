package ex_9_exceptions;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class TryCatchFinally {
    public static void main(String[] args) {
        // ClassLoader object is responsible for finding classes and files in our app
        ClassLoader cl = TryCatchFinally.class.getClassLoader();

        // Create a File object
        File file = new File(cl.getResource("sample.txt").getFile());

        // Define a Path object with path to the file
        Path path = Paths.get(file.getPath());

        // "Try to do something"
        try {

            // Create a Stream from file content
            Stream<String> fl = Files.lines(path);

            // Print each line of file to the console
            fl.forEach(System.out::println);

        // Do this, if there was an exception
        } catch (IOException e) {
            System.out.println("Error: " + e);
        // Do this ALWAYS
        } finally {
            System.out.println("This will be always executed");
        }
    }
}
