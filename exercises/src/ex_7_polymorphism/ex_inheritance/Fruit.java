package ex_7_polymorphism.ex_inheritance;

public class Fruit {
    protected String taste;
    protected String color;

    public Fruit(String taste, String color) {
        this.taste = taste;
        this.color = color;
    }

    protected void eat() {
        System.out.println("I`m eating some fruit...");
    }
}
