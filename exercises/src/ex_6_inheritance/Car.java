package ex_6_inheritance;

public class Car extends Vehicle {
	private boolean hasCruiseControll;

	public Car(String model, String year, boolean hasCruiseControll) {
		super(model, year);
		this.hasCruiseControll = hasCruiseControll;
	}

	@Override
	public String toString() {
		return "Car{" +
			"hasCruiseControll=" + hasCruiseControll +
			"} " + super.toString();
	}
}

class Aplication {
	public static void main(String[] args) {
		Car car = new Car("VW", "2019", true);
		System.out.println(car.toString());
	}
}
