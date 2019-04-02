package ex_8_regular_expressions;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Examples {
	public static void main(String[] args) {
		String exampleString = "Hello --Anna--! Welcome the Selenium course with \"Java\" Basics! We start at 09:00 AM!";
		/*************
		 BASIC EXAMPLES
		 **************/

		// An element before "?" is optional -> can appear once or be omitted
		String questionMark = "co?urse";
		match(questionMark, exampleString);

		// An element before "*" is repeated 0 or more times
		String asterisk = "Basii*i";
		match(asterisk, exampleString);

		// An element before "+" has to be repeated 1 or more times
		String plus = "sta+rt";
		match(plus, exampleString);

		// "." sign matches any character beside the line breaks
		String dot = "--An.a--";
		match(dot, exampleString);

		// You can use multiple signs to create more advanced patterns
		String usingAllSigns = "W+e.*e";
		match(usingAllSigns, exampleString);


		/*************
		 CLASSES EXAMPLES
		 Classes are groups of characters inside square brackets -> []
		 **************/

		/* This class would match following strings:
			- Selenium
			- Telenium
			- Uelenium
			- Welenium
		*/
		String classExample = "[STUW]elenium";
		match(classExample, exampleString);

		/*
		You can also define character range.
		The example below will match the same string as above.
		 */
		String charRangeExample = "[S-W]elenium";
		match(charRangeExample, exampleString);

		// It is possible to user multiple ranges in one class.
		String multipleRangesExample = "[a-zA-z0-9]elenium";
		match(multipleRangesExample, exampleString);

		/*
		It is also possible to exclude characters using classes.
		The below example will match any character that is not in t-z and T-Z range.
		 */
		String excludeExample = "[^t-zT-Z]elenium";
		match(excludeExample, exampleString);


		/*************
		 PREDEFINED CLASSES
		 There are some predefined classes to shorten your work :)
		 **************/

		// \d - matches any number in [0-9] range
		String slashD = "\\d:00";
		match(slashD, exampleString);

		// \D - matches any character which is not a number -> [^0-9]
		String slashBigD = "\\D";
		match(slashBigD, exampleString);

		// \w matches any character in range [a-zA-Z0-9_] - notice the underscore!
		String slashW = "\\w";
		match(slashW, exampleString);

		/*
		 \W matches any character not in range [^a-zA-Z0-9]
		 This will match characters like "!", "@", "-", " " etc...
		 */
		String slashBigW = "\\W";
		match(slashBigW, exampleString);

		// \s matches any white spaces or tabs
		String slashS = "\\s";
		match(slashS, exampleString);

		// \S matches anything but spaces or tabs
		String slashBigS = "\\S";
		match(slashBigS, exampleString);


		/*
		GROUPS EXAMPLE
		Groups are defined by brackets "()"

		String matched in groups are indexed
		so you can access then by the .group(int i) method
		 */

		//Let`s try to match the name "Anna"
		String name = "[^-]*--(\\w+)--.*";
		matchGroup(name, exampleString);

		/*
		EXERCISE
		Create a pattern to match Java and the start hour
		 */
		String javaAndHour = "";
		matchGroup(javaAndHour, exampleString);
	}

	public static void match(String pattern, String matcher) {
		Pattern stringPattern = Pattern.compile(pattern);
		Matcher stringMatcher = stringPattern.matcher(matcher);

		List<String> matches = new ArrayList<>();
		while (stringMatcher.find()) {
			matches.add(stringMatcher.group());
		}
		System.out.println("Pattern \"" + pattern + "\" matches: " + matches + "\n");
	}

	public static void matchGroup(String pattern, String matcher) {
		Pattern stringPattern = Pattern.compile(pattern);
		Matcher stringMatcher = stringPattern.matcher(matcher);

		if (stringMatcher.matches()) {
			for(int i = 1; i <= stringMatcher.groupCount(); i++) {
				System.out.println("Pattern \"" + pattern + "\" matches group: " + stringMatcher.group(i) + "\n");
			}
		} else {
			System.out.println("No matches found.");
		}
	}
}
