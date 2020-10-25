package ex_8_file_operations;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWrite {
    public static void main(String[] args) {
        fileWrite();
        fileWriteTryWith();
    }

    public static void fileWrite() {
        File file = new File ("./sample2.txt");
        FileWriter fw = null;
        try{
            fw = new FileWriter(file);
            fw.write("Jakas linia");

        } catch (IOException e){
            e.printStackTrace();
        } finally {
            if(fw!=null) {
                try{
                    fw.close();
                } catch( IOException e){
                    e.printStackTrace();
                }
            }
        }
    }

    public static void fileWriteTryWith(){
        File file = new File("./sample2.txt");

        try (FileWriter fw = new FileWriter(file)) {
            fw.write("Inna linia");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }




}
