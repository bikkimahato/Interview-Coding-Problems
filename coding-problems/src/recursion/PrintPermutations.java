//Print Permutations
package recursion;

public class PrintPermutations {

	public static void main(String[] args) {
		String s = "abc";
		printPermutations(s, "");
	}

	public static void printPermutations(String str, String asf) {
		if (str.length() == 0) {
			System.out.println(asf);
			return;
		}
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			String left = str.substring(0, i);
			String right = str.substring(i + 1);
			printPermutations(left + right, asf + ch);
		}

	}
}
