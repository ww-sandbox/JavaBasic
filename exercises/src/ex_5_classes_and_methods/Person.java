package ex_5_classes_and_methods;

public class Person {
	public void sayHello(String name) {
		System.out.println("Hi! My name is " + name + "!");
	}
	public void sayHello(String name, String age) {
		System.out.println("Hi! My name is " + name + " and I`m " + age + " years old!");
	}
}

class Aplication {
	public static void main(String[] args) {
		Person person = new Person();
		person.sayHello("Jack");
		person.sayHello("Anna", "20");
	}
}
