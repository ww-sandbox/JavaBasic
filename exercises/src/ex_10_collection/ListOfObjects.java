package ex_10_collection;

import java.util.ArrayList;

public class ListOfObjects {
    private static ArrayList<User> users = new ArrayList<>();

    public static void main(String[] args) {
        // Add User objects to the ArrayList
        users.add(new User("Kasa"));
        users.add(new User("Tosia"));
        users.add(new User("Paulina"));

        users.forEach(user -> System.out.println(user.getName()));
    }
}
