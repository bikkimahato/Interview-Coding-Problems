//Unbounded Knapsack
package dp;

public class UnboundedKnapsack {

	public static void main(String[] args) {
		int n = 5;
		int val[] = { 15, 14, 10, 45, 30 };
		int wt[] = { 2, 5, 1, 3, 4 };
		int sum = 7;
		System.out.println(solveKnapsack(n, val, wt, sum));

	}

	public static int solveKnapsack(int n, int val[], int wt[], int sum) {
		int dp[] = new int[sum + 1];
		dp[0] = 0;
		for (int i = 1; i <= sum; i++) {
			int max = Integer.MIN_VALUE;
			for (int j = 0; j < n; j++) {
				if (wt[j] <= i) {
					int curr = dp[i - wt[j]] + val[j];
					if (curr > max) {
						max = curr;
					}
				}
			}
			dp[i] = max;
		}
		return dp[sum];
	}
}
