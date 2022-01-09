//Tiling With 2 * 1 Tiles
//You are required to calculate and print the number of ways floor can be tiled using tiles
package dp;

public class TilingWith2X1Tiles {

	public static void main(String[] args) {
		int n = 5;
		System.out.println(waysTiles(n));
	}

	private static int waysTiles(int n) {
		int dp[] = new int[n + 1];
		dp[1] = 1;
		dp[2] = 2;
		for (int i = 3; i <= n; i++) {
			dp[i] = dp[i - 1] + dp[i - 2];
		}
		return dp[n];
	}

}
