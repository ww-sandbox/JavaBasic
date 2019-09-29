package ex_5_static_keyword;

public class App {
    public static void main(String[] args) {
        Person p1 = new Person();
        Person p2 = new Person();

        p1.addStaticAge(10);
        p1.addObjectAge(10);

        System.out.println("Static age: " + p2.getStaticAge());
        System.out.println("Object age: " + p2.getObjectAge());

        Person.staticMethod();
    }
}
