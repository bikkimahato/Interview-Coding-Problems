//Count Encodings
package dp;

public class CountEncodings {

	public static void main(String[] args) {
		String s = "123";
		System.out.println(countEncodings(s));

	}

	private static int countEncodings(String s) {
		int dp[] = new int[s.length()];
		dp[0] = 1;

		for (int i = 1; i < dp.length; i++) {
			if (s.charAt(i - 1) == '0' && s.charAt(i) == '0') {
				dp[i] = 0;
			} else if (s.charAt(i - 1) == '0' && s.charAt(i) != '0') {
				dp[i] = dp[i - 1];
			} else if (s.charAt(i - 1) != '0' && s.charAt(i) == '0') {
				if (Integer.parseInt(s.substring(i - 1, i + 1)) <= 26) {
					dp[i] = (i >= 2 ? dp[i - 2] : 1);
				} else {
					dp[i] = 0;
				}
			} else {
				if (Integer.parseInt(s.substring(i - 1, i + 1)) <= 26) {
					dp[i] = dp[i - 1] + (i >= 2 ? dp[i - 2] : 1);
				} else {
					dp[i] = dp[i - 1];
				}
			}
		}
		return dp[s.length() - 1];
	}
}
