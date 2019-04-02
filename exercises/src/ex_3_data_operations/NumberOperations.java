package ex_3_data_operations;

public class NumberOperations {

	public static void main(String[] args) {
		int numberOne = 10;
		int numberTwo = 30;
		double numberThree = 2.5;
		double numberFour = 3.5;

		// Addition
		int addResult = numberOne + numberTwo;

		// Subtraction
		int subtractResult = numberTwo - numberOne;

		// Multiply
		int multiplyResult = numberOne * numberTwo;

		// Division
		int divisionResult = numberTwo / numberOne;

		// Modulo
		int moduloResult = numberTwo % numberOne;

		// Multiply doubles
		double doublesMultiplyResult = numberThree * numberFour;

		System.out.println("Addition result: " + addResult);
		System.out.println("Subtraction result: " + subtractResult);
		System.out.println("Multiply result: " + multiplyResult);
		System.out.println("Division result: " + divisionResult);
		System.out.println("Modulo result: " + moduloResult);
		System.out.println("Multiply doubles result: " + doublesMultiplyResult);
	}
}
