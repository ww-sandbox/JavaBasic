package ex_2_conditionals;

public class ConditionalStatements {
	public static void main(String[] args) {
		boolean isGoodProgrammer = false;
		boolean isGoodTeacher = false;

		if (isGoodProgrammer) {
			// This code will execute if the isGoodProgrammer variable is true
			System.out.println("This is a good programmer");
		} else {
			// This code will execute if the isGoodProgrammer variable is false
			System.out.println("Not a good programmer at all...");
		}

		if (isGoodTeacher) {
			System.out.println("This is a great teacher!");
		} else if (isGoodProgrammer) {
			System.out.println("Not a great teacher, but a very good programmer!");
		} else {
			System.out.println("He is both terrible teacher and programmer!");
		}

		//Short if
		String message = isGoodProgrammer ? "He is a great programmer!" : "He isn`t a good programmer at all...";
		System.out.println(message);

		/*
		Exercise:
		1. Declare three boolean variables:
		 - isWarm
		 - isCold
		 - isWindy
		2. Create an if statement using if/else if/else which will:
		 - print to console if the weather is warm
		 - print to console if the weather is cold
		 - print to console if the weather is windy
		 - print to console if the weather is snowy if none of the above statements is true
		 */
	}
}
