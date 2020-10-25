package ex_3_data_operations;

public class StringOperations {
	public static void main(String[] args) {
		String stringOne = "Jack";
		String stringTwo = "has many";
		String stringThree = "cats";
		String stringFour = "dogs";
		String stringFive = "dogs";
		int number = 10;
		boolean hasManyCats = true;

		// String Concatenation
		if (hasManyCats) {
			System.out.println(stringOne + stringTwo + stringThree);
		} else {
			System.out.println(stringOne + stringTwo + stringFour);
		}

		// String Formatting Examples
		// https://www.geeksforgeeks.org/java-string-format-examples/
		String formattedString = String.format("Jack has many " + "%1$s and %2$s", stringThree, stringFour);
		System.out.println(formattedString);

		if(stringFive == stringFour){
			System.out.println("Strings equals");
		}else {
			System.out.println("String not equals");
		}

		/*
		Exercise:
		1. Declare two variables:
		 - String name
		 - int age
		2. Use string concatenation and print a sentence to the console using these variables, i.e. :
		 Jack is 18 years old.
		3. Print the same sentence using string formatting.
		 */
	}
}
