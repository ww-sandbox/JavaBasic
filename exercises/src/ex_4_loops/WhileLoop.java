package ex_4_loops;

public class WhileLoop {
	public static void main(String[] args) {
		int numberOne = 5;

		while(--numberOne > 0) {
			System.out.println("--numberOne: " + numberOne);
		}

		numberOne = 5;

		while (numberOne-- > 0) {
			System.out.println("numberOne-- : " + numberOne);
		}
	}
}
