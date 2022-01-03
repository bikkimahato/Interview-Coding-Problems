//Count A+b+c+ Subsequences
//Print the count of subsequences of the nature a+b+c+.
package dp;

public class CountABCSubsequences {

	public static void main(String[] args) {
		String s = "abcabc";
		System.out.println(countSubsequence(s));

	}

	private static int countSubsequence(String s) {
		int a = 0;
		int ab = 0;
		int abc = 0;
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch == 'a') {
				a = 2 * a + 1;
			} else if (ch == 'b') {
				ab = 2 * ab + a;
			} else if (ch == 'c') {
				abc = 2 * abc + ab;
			}
		}
		return abc;
	}

}
