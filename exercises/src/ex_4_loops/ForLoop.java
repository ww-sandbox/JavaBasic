package ex_4_loops;

public class ForLoop {
	public static void main(String[] args) {
		int numbers[] = {1,2,3,4,5};
		int numbers2[] = new int[10];

		for (int i = 0; i < numbers2.length; i++) {
			numbers2[i] = i++;
		}

		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers2[i]);
		}

		// Short for loop
		for (int number : numbers) {
			System.out.println(number);
		}
	}
}
