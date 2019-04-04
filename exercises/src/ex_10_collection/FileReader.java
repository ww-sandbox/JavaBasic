package ex_10_collection;

import ex_9_exceptions.TryCatchFinally;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FileReader {
    public static Stream<String> readFile() {
        ClassLoader cl = TryCatchFinally.class.getClassLoader();
        File file = new File(cl.getResource("./names.txt").getFile());
        Path path = Paths.get(file.getPath());

        Stream<String> fl = null;
        try {
            fl = Files.lines(path);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return fl;
    }
}
