package ex_10_collection;

import java.util.ArrayList;

public class ListOfObjects {
    private static ArrayList<User> users = new ArrayList<>();

    public static void main(String[] args) {
        // Add User objects to the ArrayList
        addUserToList(new User("Kasa"));
        addUserToList(new User("Tosia"));
        addUserToList(new User("Paulina"));

        printAllUsers();
    }

    public static void addUserToList(User user) {
        users.add(user);
    }

    public static void printAllUsers() {
        // User lambda expression to print all user names by the getName() method of User class
        users.forEach(user -> System.out.println(user.getName()));
    }
}
