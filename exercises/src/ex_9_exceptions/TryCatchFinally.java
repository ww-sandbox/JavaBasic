package ex_9_exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class TryCatchFinally {
    public static void main(String[] args) {
        // Create a File object
        File file = new File("./src/sample.txt");

        try {
            FileReader fr = new FileReader(file);
            System.out.println(fr.getEncoding());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            System.out.println("This will be always executed");
        }
    }
}
