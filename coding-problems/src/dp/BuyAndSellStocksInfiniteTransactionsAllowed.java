//Buy And Sell Stocks - Infinite Transactions Allowed
package dp;

public class BuyAndSellStocksInfiniteTransactionsAllowed {

	public static void main(String[] args) {
		int n = 9;
		int prices[] = { 11, 6, 7, 19, 4, 1, 6, 18, 4 };
		System.out.println(calculateMaxProfit(n, prices));
	}

	private static int calculateMaxProfit(int n, int[] arr) {
		int bd = 0, sd = 0, totalProfit = 0;
		for (int i = 1; i < n; i++) {
			if (arr[i] >= arr[i - 1]) {
				sd++;
			} else {
				totalProfit = totalProfit + arr[sd] - arr[bd];
				bd = sd = i;
			}
		}
		totalProfit = totalProfit + arr[sd] - arr[bd];
		return totalProfit;
	}

}
