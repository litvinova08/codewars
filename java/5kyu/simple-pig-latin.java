// Move the first letter of each word to the end of it, then add "ay" to the end of the word. Leave punctuation marks untouched.

// Examples
// pigIt('Pig latin is cool'); // igPay atinlay siay oolcay
// pigIt('Hello world !');     // elloHay orldway !

//My Solution

public class PigLatin {

	static String ay = "ay";

	public static String pigIt(String str) {

		List<String> splittedList = Arrays.asList(str.split(" "));

		String collectJoin = splittedList.stream().map(s -> mapFun(s)).collect(Collectors.joining(" "));

		return collectJoin;
	}

	static String mapFun(String s) {

		if (!Pattern.matches("\\p{Punct}", s)) {
			StringBuilder sb = new StringBuilder(s);
			char first = sb.charAt(0);
			sb.append(first);
			sb.append(ay);
			sb.deleteCharAt(0);
			return sb.toString();
		}

		return s;

	}

}