//Buy And Sell Stocks - K Transactions Allowed
//You are required to print the maximum profit you can make if you are allowed k transactions at-most.

package dp;

public class BuyAndSellStocksKTransactionsAllowed {

	public static void main(String[] args) {
		int n = 9;
		int prices[] = { 11, 6, 7, 19, 4, 1, 6, 18, 4 };
		int k = 3;
		System.out.println(calculateMaxProfit(n, prices, k));
	}

	private static int calculateMaxProfit(int n, int[] arr, int k) {
		int dp[][] = new int[k + 1][n];

		for (int t = 1; t <= k; t++) {
			int max = Integer.MIN_VALUE;
			for (int d = 1; d < n; d++) {
				if (dp[t - 1][d - 1] - arr[d - 1] > max) {
					max = dp[t - 1][d - 1] - arr[d - 1];
				}
				if (max + arr[d] > dp[t][d - 1]) {
					dp[t][d] = max + arr[d];
				} else {
					dp[t][d] = dp[t][d - 1];
				}
			}
		}
		return dp[k][n - 1];
	}

}
