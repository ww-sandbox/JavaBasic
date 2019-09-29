package ex_6_inheritance.vehicle;

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
