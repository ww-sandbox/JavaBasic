package ex_7_polymorphism.ex_inheritance;

public class Apple extends Fruit {
    Apple(String taste, String color) {
        super(taste, color);
    }

    @Override
    protected void eat() {
        System.out.println("I`m eating an apple!");
    }
}
