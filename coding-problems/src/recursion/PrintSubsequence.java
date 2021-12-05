//Print Subsequence
package recursion;

public class PrintSubsequence {

	public static void main(String[] args) {
		String s = "abc";
		printSS(s, "");
	}

	public static void printSS(String str, String ans) {
		if (str.length() == 0) {
			System.out.println(ans);
			return;
		}
		char ch = str.charAt(0);
		printSS(str.substring(1), ans + ch);
		printSS(str.substring(1), ans + "");
	}
}
