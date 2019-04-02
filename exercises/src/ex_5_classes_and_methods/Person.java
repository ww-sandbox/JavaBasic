package ex_5_classes_and_methods;

public class Person {
	public void sayHello(String name) {
		System.out.println("Hi! My name is " + name + "!");
	}
}

class Aplication {
	public static void main(String[] args) {
		Person person = new Person();
		person.sayHello("Jack");
	}
}
