package ex_4_loops;

import java.util.Arrays;

public class ForLoop {
	public static void main(String[] args) {
		int[] definedArray = {234, 123, 678, 4677, 2344, 111};
		int[] emptyArray = new int[10];

		for (int i = 0; i < emptyArray.length; i++) {
			emptyArray[i] = i;
		}

		for (int i = 0; i < emptyArray.length; i++) {
			System.out.println(emptyArray[i]);
		}

		// Short for loop (for each number in numbers...)
		for (int number : definedArray) {
			System.out.println(number);
		}
	}
}
