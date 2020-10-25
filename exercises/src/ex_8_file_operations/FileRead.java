package ex_8_file_operations;

import java.io.*;

public class FileRead {
    public static void main(String[] args) {
        File file = new File("./sample2.txt");
        FileReader fr;

        try {
            fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String line = "";
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
