package ex_5_classes_and_methods.car;

public class Car {
    private String model;
    private String year;

    public Car(String model, String year) {
        this.model = model;
        this.year = year;
    }

    public void printData() {
        System.out.println("Model: " + this.model + "\n" + "Year: " + this.year);
    }
}
