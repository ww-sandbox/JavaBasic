package ex_4_loops;

public class ForLoop {
	public static void main(String[] args) {
		int numberOne = 20;
		int numbers[] = {1,2,3,4,5};

		for (int i = 0; i < numberOne; i++) {
			System.out.println(i);
		}

		// Short for loop
		for (int number : numbers) {
			System.out.println(number);
		}
	}
}
