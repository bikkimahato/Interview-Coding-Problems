//Minimum Cost Path
//Given a m x n grid filled with non-negative numbers, find a path from top left to bottom right, which minimizes the sum of all numbers along its path.
package dp;

public class MinimumCostPath {

	public static void main(String[] args) {
		int n = 3;
		int m = 3;
		int arr[][] = { { 1, 3, 1 }, { 1, 5, 1 }, { 4, 2, 1 } };
		System.out.println(countPaths(n, m, arr));
	}

	public static int countPaths(int n, int m, int arr[][]) {
		int dp[][] = new int[n][m];

		for (int i = n - 1; i >= 0; i--) {
			for (int j = m - 1; j >= 0; j--) {
				if (i == n - 1 && j == m - 1) {
					dp[i][j] = arr[i][j];
				} else if (i == n - 1) {
					dp[i][j] = dp[i][j + 1] + arr[i][j];
				} else if (j == m - 1) {
					dp[i][j] = dp[i + 1][j] + arr[i][j];
				} else {
					dp[i][j] = Math.min(dp[i + 1][j], dp[i][j + 1]) + arr[i][j];
				}
			}
		}
		return dp[0][0];
	}
}
