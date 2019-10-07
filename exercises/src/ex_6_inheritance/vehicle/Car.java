package ex_6_inheritance.vehicle;

public class Car extends Vehicle {
	private boolean hasCruiseControl;

	Car(String model, String year, boolean hasCruiseControl) {
		super(model, year);
		this.hasCruiseControl = hasCruiseControl;
	}

	@Override
	public String toString() {
		return "Car{" +
			"hasCruiseControl=" + hasCruiseControl +
			"} " + super.toString();
	}
}
