//Zero One Knapsack
package dp;

public class ZeroOneKnapsack {

	public static void main(String[] args) {
		int n = 5;
		int val[] = { 15, 14, 10, 45, 30 };
		int wt[] = { 2, 5, 1, 3, 4 };
		int sum = 7;
		System.out.println(solveKnapsack(n, val, wt, sum));

	}

	public static int solveKnapsack(int n, int val[], int wt[], int sum) {
		int dp[][] = new int[n + 1][sum + 1];

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= sum; j++) {
				if (j >= wt[i - 1]) {
					dp[i][j] = Math.max(dp[i - 1][j], val[i - 1] + dp[i - 1][j - wt[i - 1]]);
				} else {
					dp[i][j] = dp[i - 1][j];
				}
			}
		}
		return dp[n][sum];
	}
}
