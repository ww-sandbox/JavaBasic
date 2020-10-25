package ex_3_data_operations;

public class LogicOperators {
	public static void main(String[] args) {
		int numberOne = 10;
		int numberTwo = 30;
		int numberThree = 5;

		// == equals
		if (numberOne == numberTwo) {
			System.out.println(numberOne + " is equal to " + numberTwo);
		}

		// != not equals
		if (numberOne != numberTwo) {
			System.out.println(numberOne + " is not equal to " + numberTwo);
		}

		// > greater than
		if (numberOne > numberTwo) {
			System.out.println(numberOne + " is greater than " + numberTwo);
		}

		// >= greater than or equal to
		if (numberOne >= numberTwo) {
			System.out.println(numberOne + " is greater than or equal to " + numberTwo);
		}

		// < less than
		if (numberOne < numberTwo) {
			System.out.println(numberOne + " is less than " + numberTwo);
		}

		// <= less than or equal to
		if (numberOne <= numberTwo) {
			System.out.println(numberOne + " is less than or equal to " + numberTwo);
		}

		// || OR
		if (numberOne < numberThree || numberThree >= numberTwo) {
			System.out.println(numberOne + " is less than " + numberThree + " OR " + "greater then or equal to " + numberTwo);
		}

		// | OR
		if (numberOne < numberThree | numberThree >= numberTwo) {
			System.out.println(numberOne + " is less than " + numberThree + " OR " + "greater then or equal to " + numberTwo);
		}

		// && AND
		if (numberOne < numberThree && numberThree >= numberTwo) {
			System.out.println(numberOne + " is less than " + numberThree + " AND " + "greater then or equal to " + numberTwo);
		}

		// & AND
		if (numberOne < numberThree & numberThree >= numberTwo) {
			System.out.println(numberOne + " is less than " + numberThree + " AND " + "greater then or equal to " + numberTwo);
		}

		/*
		Exercise:
		1. Declare 5 variables:
		 - String textOne
		 - String textTwo
		 - int numberOne
		 - int numberTwo
		 - int number Three
		2. Write an if statements to check if:
		 - String variables are equal
		 - numberOne is gt or eq numberTwo OR numberOne is lt  numberTwo AND numberOne is not eq numberThree
		 */
	}
}
