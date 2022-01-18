//Buy And Sell Stocks - One Transaction Allowed
//You are required to print the maximum profit you can make if you are allowed a single transaction.
package dp;

public class BuyAndSellStocksOneTransactionAllowed {

	public static void main(String[] args) {
		int n = 9;
		int prices[] = { 11, 6, 7, 19, 4, 1, 6, 18, 4 };
		System.out.println(calculateMaxProfit(n, prices));
	}

	private static int calculateMaxProfit(int n, int[] arr) {
		int least = Integer.MAX_VALUE;
		int totalProfit = 0;
		int profitToday = 0;

		for (int i = 0; i < n; i++) {
			if (arr[i] < least) {
				least = arr[i];
			}
			profitToday = arr[i] - least;
			if (profitToday > totalProfit) {
				totalProfit = profitToday;
			}
		}
		return totalProfit;
	}

}
