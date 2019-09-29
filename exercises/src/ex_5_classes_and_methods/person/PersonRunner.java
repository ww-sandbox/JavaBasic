package ex_5_classes_and_methods.person;

public class PersonRunner {
    public static void main(String[] args) {
        Person person = new Person();
        person.sayHello("Jack");
        person.sayHello("Anna", "20");
        person.sayHello("Anna", 20);
    }
}
