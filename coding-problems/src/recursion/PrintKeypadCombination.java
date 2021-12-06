//Print Keypad Combination
package recursion;

public class PrintKeypadCombination {

	static String[] codes = { ".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz" };

	public static void main(String[] args) {
		String s = "78";
		printKPC(s, "");

	}

	private static void printKPC(String s, String res) {
		if (s.length() == 0) {
			System.out.println(res);
			return;
		}

		char ch = s.charAt(0);
		String codeCh = codes[ch - '0'];
		for (char i : codeCh.toCharArray()) {
			printKPC(s.substring(1), res + i);
		}

	}

}
