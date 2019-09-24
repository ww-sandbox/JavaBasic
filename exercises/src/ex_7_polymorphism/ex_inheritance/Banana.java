package ex_7_polymorphism.ex_inheritance;

public class Banana extends Fruit {
    public Banana(String taste, String color) {
        super(taste, color);
    }

    @Override
    protected void eat() {
        System.out.println("I`m eating a banana!");
    }
}
