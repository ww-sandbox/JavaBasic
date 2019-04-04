package ex_10_collection;

import java.util.ArrayList;
import java.util.List;

import static ex_10_collection.FileReader.readFile;

public class ListExample {

    // Create ArrayList object
    private static List<String> names = new ArrayList<>();

    public static void main(String[] args) {
        addNameToList("Zosia");
        addNameToList("Tosia");
        System.out.println(names + "\n");


        removeNameFromList(names.size() - 1);
        System.out.println(names + "\n");


        addNamesFromFile();
        System.out.println(names + "\n");


        removeAllNamesFromList();
        System.out.println(names);
    }

    public static void addNameToList(String name) {
        // Add something to the ArrayList collection
        names.add(name);
    }

    public static void removeNameFromList(int index) {
        // Remove something from list by it`s index
        names.remove(index);
    }


    public static void addNamesFromFile() {
        readFile().forEach(names::add);
    }

    public static void removeAllNamesFromList() {
        // Remove everything from the ArrayList
        names.clear();
    }
}
