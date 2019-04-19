package ex_9_exceptions;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Throws {
    public static void main(String[] args) {
        try {
            readFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void readFile() throws IOException {
        ClassLoader cl = Throws.class.getClassLoader();
        File file = new File(cl.getResource("sample.txt").getFile());
        Path path = Paths.get(file.getPath());

        Stream<String> fl = Files.lines(path);
        fl.forEach(System.out::println);
    }
}
