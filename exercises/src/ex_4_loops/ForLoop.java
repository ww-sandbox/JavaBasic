package ex_4_loops;

public class ForLoop {
	public static void main(String[] args) {
		int numbers[] = {234, 123, 678, 4677, 2344, 111};
		int numbers2[] = new int[10];

		for (int i = 0; i < numbers2.length; i++) {
			numbers2[i] = i;
		}

		for (int i = 0; i < numbers2.length; i++) {
			System.out.println(numbers2[i]);
		}

		// Short for loop (for each number in numbers...)
		for (int number : numbers) {
			System.out.println(number);
		}
	}
}
