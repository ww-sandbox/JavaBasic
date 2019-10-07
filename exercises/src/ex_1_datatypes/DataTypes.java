package ex_1_datatypes;

public class DataTypes {
	public static void main(String[] args) {

		String text = "Example text";

		// Size: 16 bits
		char letter = 'a';

		// Size: 8 bits Range: -128 - 127 (inclusive)
		byte byteNumber = 100;

		// Size: 16 bits Range: -32,768 - 32767 (inclusive)
		short shortNumber = 32_000;

		// Size: 32 bits Range: -2,147,483,648 .. 2,147,483,647
		int number = 123;

		// Size: 64 bits, Range: 1.7976931348623157 x 10308, 4.9406564584124654 x 10-324
		double doubleNumber = 123.23;

		// Size: 32 bits, Range: 3.40282347 x 1038, 1.40239846 x 10-45
		float floatNumber = 123.23f;

		// Size: 64 bits, Range: -9,223,372,036,854,775,808 .. 9,223,372,036,854,775,807
		long longNumber = 999999;

		// Size: 1 bit, Default: false
		boolean aBoolean = true;


		/*
		Exercise:
		Declare all of the primitive data types and print their values to the console.
		 */
	}
}
