package ex_4_loops;

public class DoWhileLoop {
	public static void main(String[] args) {
		int numberOne = 5;

		do {
			System.out.println("numberOne : " + numberOne);
			--numberOne;
		} while (numberOne > 0);

		System.out.println("----");
		numberOne = 5;
		do {
			System.out.println("numberOne-- : " + numberOne);
		} while (numberOne-- > 0);

		System.out.println("----");
		numberOne = 5;

		do {
			System.out.println("--numberOne: " + numberOne);
		} while (--numberOne > 0);
	}
}
