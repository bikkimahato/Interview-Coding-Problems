//Tiling with M x 1 Tiles
package dp;

public class TilingWithMX1Tiles {

	public static void main(String[] args) {
		int n = 10;
		int m = 4;
		System.out.println(waysTiles(n, m));
	}

	private static int waysTiles(int n, int m) {
		int dp[] = new int[n + 1];
		for (int i = 1; i <= n; i++) {
			if (i < m) {
				dp[i] = 1;
			} else if (i == m) {
				dp[i] = 2;
			} else {
				dp[i] = dp[i - 1] + dp[i - m];
			}
		}
		return dp[n];
	}

}
