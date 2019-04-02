package ex_6_inheritance;

public class Vehicle {
	private String model;
	private String year;

	public Vehicle(String model, String year) {
		this.model = model;
		this.year = year;
	}

	public String getModel() {
		return model;
	}

	public String getYear() {
		return year;
	}

	@Override
	public String toString() {
		return "Vehicle{" +
			"model='" + model + '\'' +
			", year='" + year + '\'' +
			'}';
	}
}
