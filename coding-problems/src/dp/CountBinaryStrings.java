// Count Binary Strings
// You are required to print the number of binary strings of length n with no consecutive 0's.
package dp;

public class CountBinaryStrings {

	public static void main(String[] args) {
		int n = 6;
		System.out.println(countBinary(n));

	}

	private static int countBinary(int n) {
		int zeros = 1, ones = 1;
		for (int i = 2; i <= n; i++) {
			int oz = ones;
			int oo = zeros + ones;

			ones = oo;
			zeros = oz;
		}
		return zeros + ones;
	}

}
