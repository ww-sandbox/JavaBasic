package ex_10_collection;

import java.util.ArrayList;
import java.util.List;

public class ListExample {

    // Create ArrayList object
    private static List<String> names = new ArrayList<>();

    public static void main(String[] args) {
        names.add("Zosia");
        names.add("Tosia");
        names.add("Paweł");
        names.add("Gaweł");
        System.out.println(names);

        names.remove(names.size() - 1);
        System.out.println(names);

        names.set(0, "Nowa Zosia");
        System.out.println(names);

        names.add(names.size(), "Nowy Element");
        System.out.println(names);

        System.out.println(names.get(3));

        names.forEach(name -> System.out.println("forEach: " + name));

        names.clear();
        System.out.println(names);
    }


    public static void removeAllNamesFromList() {
        // Remove everything from the ArrayList
        names.clear();
    }
}
