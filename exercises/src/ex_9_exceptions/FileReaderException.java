package ex_9_exceptions;

public class FileReaderException extends Exception {
    private String filePath ="";

    FileReaderException(String filePath){this.filePath = filePath;}

    public String getPath(){ return this.filePath; }
}
