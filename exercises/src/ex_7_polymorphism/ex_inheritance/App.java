package ex_7_polymorphism.ex_inheritance;

public class App {
    public static void main(String[] args) {
        Fruit[] fruits = new Fruit[2];

        fruits[0] = new Apple("Sour", "Red");
        fruits[1] = new Banana("Sweet", "Yellow");

        for (Fruit fruit : fruits) {
            fruit.eat();
        }
    }
}
