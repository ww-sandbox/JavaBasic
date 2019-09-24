package ex_5_classes_and_methods.person;

public class Person {
	public void sayHello(String name) {
		System.out.println("Hi! My name is " + name + "!");
	}
	public void sayHello(String name, String age) {
		System.out.println("Hi! My name is " + name + " and I`m " + age + " years old!");
	}
	public void sayHello(String name, int age) {
		System.out.println("Hi! My name is " + name + " and I`m " + age + " years old!");
	}
}